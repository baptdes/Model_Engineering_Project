package AlgorithmeTable.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import AlgorithmeTable.Direction;
import AlgorithmeTable.Port;
import AlgorithmeTable.Catalogue;
import AlgorithmeTable.Algorithme;
import AlgorithmeTable.Ressource;
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
		
		this.result.recordIfFailed(
				object.getCatalogue().getAlgorithme().stream()
					.allMatch(a -> (a.equals(object) || !((Algorithme) a).getNom().contains(object.getNom()))),
				object, 
				"Le nom de l'algorithme (" + object.getNom() + ") n'est pas unique");
		
		// Visite
		for (Port p : object.getPort()) {
			this.doSwitch(p);
		}
		
		this.doSwitch(object.getRessource());
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un Port.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean casePort(Port object) {
		// Contraintes sur Port
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom du port ne respecte pas les conventions Java");
		
	    if (object.isConstant()) {
	        this.result.recordIfFailed(
	                object.getDirection() == Direction.ENTREE,
	                object,
	                "Un port constant doit être une entrée."
	        );
	        
	    }
		
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Ressource.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseRessource(Ressource object) {
		// Contraintes sur Ressource
		this.result.recordIfFailed(
				object.getEmplacement() != null && object.getEmplacement().matches(IDENT_REGEX), 
				object, 
				"Le nom de la ressource ne respecte pas les conventions Java");
		
		
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


