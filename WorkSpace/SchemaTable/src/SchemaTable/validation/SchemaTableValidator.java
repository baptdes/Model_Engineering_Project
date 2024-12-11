package SchemaTable.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import SchemaTable.Colonne;
import SchemaTable.ColonneBrute;
import SchemaTable.ColonneCalculee;
import SchemaTable.ColonneEtrangere;
import SchemaTable.SchemaTablePackage;
import SchemaTable.Arc;
import SchemaTable.Transition;
import SchemaTable.util.SchemaTableSwitch;

/**
 * Réalise la validation d'un EObject issu de Petrinet (en théorie, d'un petrinet).
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
	 * Méthode appelée lorsque l'objet visité est un PetriNet.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean casePetriNet(petrinet.PetriNet object) {
		// Contraintes sur PetriNet
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom du petrinet ne respecte pas les conventions Java");
		
		this.result.recordIfFailed(
				object.getPetrinetElements().stream()
				.filter(p -> p.eClass().getClassifierID() == PetrinetPackage.PLACE)
				.mapToInt(pl -> ((Place) pl).getNombreJetons()).sum() > 0, 
				object, 
				"Il n'y a aucun jeton initial sur le petrinet.");
		
		// Visite
		for (PetriNetElements pe : object.getPetrinetElements()) {
			this.doSwitch(pe);
		}
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un PetriNetElements (ou un sous type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean casePetriNetElements(PetriNetElements object) {
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Place.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean casePlace(Place object) {
		// Contraintes sur Place
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de la place ne respecte pas les conventions Java");
		
		this.result.recordIfFailed(
				object.getPetrinet().getPetrinetElements().stream()
					.filter(p -> p.eClass().getClassifierID() == PetrinetPackage.PLACE)
					.allMatch(pe -> (pe.equals(object) || !((Place) pe).getName().contains(object.getName()))),
				object, 
				"Le nom de la place (" + object.getName() + ") n'est pas unique");
		
		this.result.recordIfFailed(
				object.getNombreJetons() >= 0, 
				object, 
				"Le nombre de jetons de la place est incorrect ("+ object.getNombreJetons() +" < 0 )");

		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une Transition.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseTransition(Transition object) {
		// Contraintes sur Place
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de la transition ne respecte pas les conventions Java");
		
		this.result.recordIfFailed(
				object.getPetrinet().getPetrinetElements().stream()
					.filter(p -> p.eClass().getClassifierID() == PetrinetPackage.TRANSITION)
					.allMatch(pe -> (pe.equals(object) || !((Transition) pe).getName().contains(object.getName()))),
				object, 
				"Le nom de la transition (" + object.getName() + ") n'est pas unique");

		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un Arc.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseArc(Arc object) {
		// Contraintes sur Arc
		this.result.recordIfFailed(
				object.getPetrinet().getPetrinetElements().stream()
				.filter(p -> p.eClass().getClassifierID() == PetrinetPackage.ARC)
				.filter(pe -> ((Arc) pe).isToTransition() == object.isToTransition())
				.allMatch(pe -> (pe.equals(object) || !((Arc) pe).getPlace().equals(object.getPlace()) || !((Arc) pe).getTransition().equals(object.getTransition()))),
				object,
				"L'arc n'est pas le seul orienté " + (object.isToTransition() ? "transition" : "place") + " à relier la place " + object.getPlace().getName() + " à la transition " + object.getTransition().getName() +".");
		
		this.result.recordIfFailed(
				object.getCost() > 0,
				object,
				"Le coût de l'arc est incorrect ("+ object.getCost() +" <= 0).");
		
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
