/**
 */
package SchemaTable;

import AlgorithmeTable.Algorithme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contrainte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SchemaTable.Contrainte#getAlgorithme <em>Algorithme</em>}</li>
 *   <li>{@link SchemaTable.Contrainte#getIdentifiantsColonnesEntree <em>Identifiants Colonnes Entree</em>}</li>
 *   <li>{@link SchemaTable.Contrainte#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see SchemaTable.SchemaTablePackage#getContrainte()
 * @model
 * @generated
 */
public interface Contrainte extends EObject {
	/**
	 * Returns the value of the '<em><b>Algorithme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme</em>' reference.
	 * @see #setAlgorithme(Algorithme)
	 * @see SchemaTable.SchemaTablePackage#getContrainte_Algorithme()
	 * @model required="true"
	 * @generated
	 */
	Algorithme getAlgorithme();

	/**
	 * Sets the value of the '{@link SchemaTable.Contrainte#getAlgorithme <em>Algorithme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithme</em>' reference.
	 * @see #getAlgorithme()
	 * @generated
	 */
	void setAlgorithme(Algorithme value);

	/**
	 * Returns the value of the '<em><b>Identifiants Colonnes Entree</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiants Colonnes Entree</em>' attribute list.
	 * @see SchemaTable.SchemaTablePackage#getContrainte_IdentifiantsColonnesEntree()
	 * @model
	 * @generated
	 */
	EList<String> getIdentifiantsColonnesEntree();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SchemaTable.SchemaDeTable#getContraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(SchemaDeTable)
	 * @see SchemaTable.SchemaTablePackage#getContrainte_Schema()
	 * @see SchemaTable.SchemaDeTable#getContraintes
	 * @model opposite="contraintes" required="true" transient="false"
	 * @generated
	 */
	SchemaDeTable getSchema();

	/**
	 * Sets the value of the '{@link SchemaTable.Contrainte#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(SchemaDeTable value);

} // Contrainte
