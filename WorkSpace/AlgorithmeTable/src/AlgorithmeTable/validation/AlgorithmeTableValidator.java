package AlgorithmeTable.validation;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import AlgorithmeTable.Direction;
import AlgorithmeTable.Port;
import AlgorithmeTable.Catalogue;
import AlgorithmeTable.Algorithme;
import AlgorithmeTable.Ressource;
import AlgorithmeTable.TypeDonnees;
import AlgorithmeTable.TypeRessource;
import AlgorithmeTable.util.AlgorithmeTableSwitch;

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
public class AlgorithmeTableValidator extends AlgorithmeTableSwitch<Boolean> {
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
	public AlgorithmeTableValidator() {}
	
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
	 * Méthode appelée lorsque l'objet visité est un Catalogue.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseCatalogue(Catalogue object) {
		// Contraintes sur Catalogue
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom du catalogue ne respecte pas les conventions Java");
		
		// Visite
		for (Algorithme a : object.getAlgorithme()) {
			this.doSwitch(a);
		}
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un Algorithme.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseAlgorithme(Algorithme object) {
		// Contraintes sur Algorithme
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom de l'algorithme ne respecte pas les conventions Java");
		
		// Visite
		for (Algorithme a : object.getAlgorithme()) {
			this.doSwitch(a);
		}
		
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
		
		this.result.recordIfFailed(
				object.getContraintes().stream()
					.allMatch(contrainte -> contrainte.getPort().stream().filter(port -> port.getDirection() == AlgorithmeTable.Direction.SORTIE && port.getType() == AlgorithmeTable.TypeDonnees.BOOLEEN).count() == 1),
				object, 
				"Une des contraintes n'a pas exactement une sortie booléenne.");
		
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
