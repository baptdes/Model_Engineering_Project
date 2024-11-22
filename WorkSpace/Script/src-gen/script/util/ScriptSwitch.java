/**
 */
package script.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import script.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see script.ScriptPackage
 * @generated
 */
public class ScriptSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScriptPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptSwitch() {
		if (modelPackage == null) {
			modelPackage = ScriptPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ScriptPackage.SCRIPT: {
			Script script = (Script) theEObject;
			T result = caseScript(script);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScriptPackage.RESULTAT: {
			Resultat resultat = (Resultat) theEObject;
			T result = caseResultat(resultat);
			if (result == null)
				result = caseBloc(resultat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScriptPackage.BLOC: {
			Bloc bloc = (Bloc) theEObject;
			T result = caseBloc(bloc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScriptPackage.BLOC_AVEC_SORTIE: {
			BlocAvecSortie blocAvecSortie = (BlocAvecSortie) theEObject;
			T result = caseBlocAvecSortie(blocAvecSortie);
			if (result == null)
				result = caseBloc(blocAvecSortie);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScriptPackage.BLOC_SANS_ENTREE: {
			BlocSansEntree blocSansEntree = (BlocSansEntree) theEObject;
			T result = caseBlocSansEntree(blocSansEntree);
			if (result == null)
				result = caseBlocAvecSortie(blocSansEntree);
			if (result == null)
				result = caseBloc(blocSansEntree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScriptPackage.ENTREE: {
			Entree entree = (Entree) theEObject;
			T result = caseEntree(entree);
			if (result == null)
				result = caseBlocSansEntree(entree);
			if (result == null)
				result = caseBlocAvecSortie(entree);
			if (result == null)
				result = caseBloc(entree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScriptPackage.CONSTANTE: {
			Constante constante = (Constante) theEObject;
			T result = caseConstante(constante);
			if (result == null)
				result = caseBlocSansEntree(constante);
			if (result == null)
				result = caseBlocAvecSortie(constante);
			if (result == null)
				result = caseBloc(constante);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScriptPackage.FONCTION_UNAIRE: {
			FonctionUnaire fonctionUnaire = (FonctionUnaire) theEObject;
			T result = caseFonctionUnaire(fonctionUnaire);
			if (result == null)
				result = caseBlocAvecSortie(fonctionUnaire);
			if (result == null)
				result = caseBloc(fonctionUnaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScriptPackage.OPERATION_BINAIRE: {
			OperationBinaire operationBinaire = (OperationBinaire) theEObject;
			T result = caseOperationBinaire(operationBinaire);
			if (result == null)
				result = caseBlocAvecSortie(operationBinaire);
			if (result == null)
				result = caseBloc(operationBinaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resultat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resultat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultat(Resultat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBloc(Bloc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloc Avec Sortie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloc Avec Sortie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlocAvecSortie(BlocAvecSortie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloc Sans Entree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloc Sans Entree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlocSansEntree(BlocSansEntree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntree(Entree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstante(Constante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fonction Unaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fonction Unaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFonctionUnaire(FonctionUnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Binaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationBinaire(OperationBinaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ScriptSwitch
