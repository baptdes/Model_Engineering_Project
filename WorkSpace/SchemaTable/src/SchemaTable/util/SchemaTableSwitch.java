/**
 */
package SchemaTable.util;

import SchemaTable.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see SchemaTable.SchemaTablePackage
 * @generated
 */
public class SchemaTableSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchemaTablePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaTableSwitch() {
		if (modelPackage == null) {
			modelPackage = SchemaTablePackage.eINSTANCE;
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
			case SchemaTablePackage.SCHEMA_DE_TABLE: {
				SchemaDeTable schemaDeTable = (SchemaDeTable)theEObject;
				T result = caseSchemaDeTable(schemaDeTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaTablePackage.COLONNE: {
				Colonne colonne = (Colonne)theEObject;
				T result = caseColonne(colonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaTablePackage.COLONNE_BRUTE: {
				ColonneBrute colonneBrute = (ColonneBrute)theEObject;
				T result = caseColonneBrute(colonneBrute);
				if (result == null) result = caseColonne(colonneBrute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaTablePackage.COLONNE_CALCULEE: {
				ColonneCalculee colonneCalculee = (ColonneCalculee)theEObject;
				T result = caseColonneCalculee(colonneCalculee);
				if (result == null) result = caseColonne(colonneCalculee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaTablePackage.COLONNE_ETRANGERE: {
				ColonneEtrangere colonneEtrangere = (ColonneEtrangere)theEObject;
				T result = caseColonneEtrangere(colonneEtrangere);
				if (result == null) result = caseColonne(colonneEtrangere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema De Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema De Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaDeTable(SchemaDeTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colonne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colonne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColonne(Colonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colonne Brute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colonne Brute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColonneBrute(ColonneBrute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colonne Calculee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colonne Calculee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColonneCalculee(ColonneCalculee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colonne Etrangere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colonne Etrangere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColonneEtrangere(ColonneEtrangere object) {
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

} //SchemaTableSwitch
