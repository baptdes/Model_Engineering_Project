package SchemaTable.validation;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import AlgorithmeTable.Direction;
import AlgorithmeTable.Port;
import SchemaTable.Colonne;
import SchemaTable.ColonneBrute;
import SchemaTable.ColonneCalculee;
import SchemaTable.ColonneEtrangere;
import SchemaTable.Contrainte;
import SchemaTable.SchemaDeTable;
import SchemaTable.SchemaTablePackage;
import SchemaTable.util.SchemaTableSwitch;

/**
 * Réalise la validation d'un EObject issu de SchemaTable.
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 * Attention, lorsqu'une classe est un parent il faut aller faire la visite des enfants
 * manuellement (cf. casePetriNet typiquement).
 * 
 * La classe Switch exige un paramètre de généricité (et gère une partie de la visite à
 * base de comparaison à null). Ici le paramètre est un booléen mais en réalité on ne
 * s'en sert pas...
 * 
 * @author Guillaume Dupont
 * @version 0.1
 */
public class SchemaTableValidator extends SchemaTableSwitch<Boolean> {
	/**
	 * Expression régulière qui correspond à un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public SchemaTableValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}
			
	/**
	 * Détection d'un cycle dans la composante connexe contenant la colonne calculée c
	 * @param c colonne calculée à analyser
	 * @param etant_visite liste de noms de colonnes étant en cours de visite
	 * @param deja_visite liste de noms de colonnes déjà visitées
	 * @return existence d'un tel cycle
	 */
	private boolean detectionCycle(ColonneCalculee c, List<String> etant_visite, List<String> deja_visite) {
		etant_visite.add(c.getIdentifiant());
		
		List<ColonneCalculee> voisins = c.getSchema().getColonnes().stream()
				.filter(col -> col.eClass().getClassifierID() == SchemaTablePackage.COLONNE_CALCULEE)
				.filter(col -> c.getIdentifiantsColonnesEntree().contains(col.getIdentifiant()))
				.map(col -> (ColonneCalculee) col).toList();
		
		for(ColonneCalculee voisin : voisins) {
			if(etant_visite.contains(voisin.getIdentifiant())) {
				return true;
			} else if (!deja_visite.contains(voisin.getIdentifiant()) && detectionCycle(voisin, etant_visite, deja_visite)) {
				return true;
			}
		}
		
		etant_visite.remove(c.getIdentifiant());
		deja_visite.add(c.getIdentifiant());
		
		return false;
	}
	
	/**
	 * Détection d'un cycle dans les dépendances calculatoires induites par les colonnes calculées
	 * @param object schemadetable à analyser
	 * @return existence d'un tel cycle
	 */
	private boolean detectionCycle(SchemaDeTable object) {
		List<ColonneCalculee> colonnes_calculees = object.getColonnes().stream()
				.filter(c -> c.eClass().getClassifierID() == SchemaTablePackage.COLONNE_CALCULEE)
				.map(c -> (ColonneCalculee) c).toList();
		
		List<String> etant_visite = new ArrayList<String>();
		List<String> deja_visite = new ArrayList<String>();
		
		for(ColonneCalculee c : colonnes_calculees) {
			if(!deja_visite.contains(c.getIdentifiant()) && detectionCycle(c, etant_visite, deja_visite)) {
				return true;
			}
		}
					
		return false;
	}
	
	
	/**
	 * Méthode appelée lorsque l'objet visité est un SchemaDeTable.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseSchemaDeTable(SchemaDeTable object) {
		// Contraintes sur SchemaDeTable
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom du schema de table ne respecte pas les conventions Java");
		
		this.result.recordIfFailed(
				object.getColonneLignes() != null, 
				object, 
				"Il faut définir une colonne ligne");
		
		this.result.recordIfFailed(
				object.getColonneLignes() != null && object.getColonneLignes().eClass().getClassifierID() == SchemaTablePackage.COLONNE_BRUTE, 
				object, 
				"La colonne ligne doit être une colonne brute");
		
		this.result.recordIfFailed(
				object.getColonneLignes() != null && object.getColonneLignes().getTypeDonnees() == AlgorithmeTable.TypeDonnees.INT, 
				object, 
				"La colonne ligne doit contenir des entiers");
		
		this.result.recordIfFailed(
				object.getColonneLignes() != null && !object.getContraintes().stream().map(contrainte -> contrainte.getIdentifiantsColonnesEntree()).toList().contains(object.getColonneLignes().getIdentifiant()), 
				object, 
				"La colonne ligne ne peut pas avoir de contraintes");
		
		// Visite
		for (Colonne c : object.getColonnes()) {
			this.doSwitch(c);
		}
		
		this.result.recordIfFailed(
				!detectionCycle(object), 
				object, 
				"Il y a un cycle dans le graphe induit par le calcul des colonnes calculées");
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Contrainte.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseContrainte(Contrainte object) {
		// Contraintes sur Contrainte
		this.result.recordIfFailed(
				object.getAlgorithme() != null && object.getAlgorithme().getPort().stream().filter(port -> port.getDirection() == AlgorithmeTable.Direction.SORTIE && port.getType() == AlgorithmeTable.TypeDonnees.BOOL).count() == 1, 
				object, 
				"L'algorithme associé à une contrainte doit avoir une unique sortie booléenne.");
		
		this.result.recordIfFailed(
				object.getSchema().getColonnes().stream().map(c -> ((Colonne) c).getIdentifiant()).toList().containsAll(object.getIdentifiantsColonnesEntree()),
				object, 
				"Une des colonnes d'entrée n'existe pas dans cette table");
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une Colonne (ou un sous type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseColonne(Colonne object) {
		// Contraintes sur Colonne
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom de la colonne ne respecte pas les conventions Java");
		
		this.result.recordIfFailed(
				object.getSchema().getColonnes().stream()
					.allMatch(c -> (c.equals(object) || !((Colonne) c).getIdentifiant().contains(object.getIdentifiant()))),
				object, 
				"L'identifiant de la colonne (" + object.getNom() + ") n'est pas unique");
		
		this.result.recordIfFailed(
				object.getIdentifiant().equals(object.getSchema().getNom() + '.' + object.getNom()),
				object, 
				"L'identifiant de la colonne (" + object.getIdentifiant() + ") ne respecte pas la convention sur les identifiants (nom_table.nom_colonne).");
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une ColonneBrute.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseColonneBrute(ColonneBrute object) {
		// Contraintes sur ColonneBrute
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une ColonneCalculee.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseColonneCalculee(ColonneCalculee object) {
		// Contraintes sur ColonneCalculee
		this.result.recordIfFailed(
				object.getSchema().getColonnes().stream().map(c -> ((Colonne) c).getIdentifiant()).toList().containsAll(object.getIdentifiantsColonnesEntree()),
				object, 
				"Une des colonnes d'entrée n'existe pas dans cette table");
		
		/** Ne fonctionne pas
		*	this.result.recordIfFailed(
		*		object.getAlgorithme().getPort().stream().filter(port -> port.getDirection().getValue() == AlgorithmeTable.Direction.SORTIE_VALUE && port.getType().equals(object.getTypeDonnees())).count() == 1,
		*		object, 
		*		"L'algorithme n'a pas un type de sortie compatible avec la colonne");
		*/

		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une ColonneEtrangere.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseColonneEtrangere(ColonneEtrangere object) {
		// Contraintes sur ColonneEtrangere
		this.result.recordIfFailed(
				!object.getSchema().getNom().equals(object.getSchemaEntree().getNom()),
				object, 
				"La colonne doit provenir d'une autre table");
		
		return null;
	}
	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas à un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert à rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute façon ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	
}
