package script.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import script.*;
import script.util.ScriptSwitch;

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
public class ScriptValidator extends ScriptSwitch<Boolean> {
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
	public ScriptValidator() {}
	
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
	 * Méthode appelée lorsque l'objet visité est un script.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseScript(Script object) {
		// Contraintes sur les scripts
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom du script ne respecte pas les conventions de nommage");
		
		this.result.recordIfFailed(
				object.getResultat().size() == 1,
				object, 
				"Il y a plus d'un résultat. Un seul résultat est possible !");
		
		// Visite des arguments
		for (Argument c : object.getArguments()) {
			this.doSwitch(c);
		}
		
		// Visite des résultats
		for (Resultat c : object.getResultat()) {
			this.doSwitch(c);
		}
		
		// Visite des blocs
		for (Bloc c : object.getBlocs()) {
			this.doSwitch(c);
		}
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un résultat.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseResultat(Resultat object) {
		// Contraintes sur les résultats
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom du résultat ne respecte pas les conventions de nommage");
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une argument.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseArgument(Argument object) {
		// Contraintes sur Argument
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom de l'argument ne respecte pas les conventions de nommage");
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une ColonneCalculee.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseConstante(Constante object) {
		// Rien sur les constantes
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une OperationBinaire.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseOperationBinaire(OperationBinaire object) {
		// Contraintes sur OperationBinaire
		// Une sortie d'une opération ne peut-être relié à une de ses entrées
		this.result.recordIfFailed(
				!object.getSortie().getEntree().contains(object.getEntree().get(0)) || !object.getSortie().getEntree().contains(object.getEntree().get(1)),
				object, 
				"Comment ça la sortie d'un opérateur " + object.getOperation() + "  est relié à sa propre entrée ??????");
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une FonctionUnaire.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseFonctionUnaire(FonctionUnaire object) {
		// Contraintes sur FonctionUnaire
		// Une sortie d'une opération ne peut-être relié à une de ses entrées
		this.result.recordIfFailed(
				!object.getSortie().getEntree().contains(object.getEntree()),
				object, 
				"Comment ça la sortie d'une fonction " + object.getFonction() + "  est relié à sa propre entrée ??????");
		
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
