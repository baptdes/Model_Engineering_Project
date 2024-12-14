/**
 */
package SchemaTable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema De Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SchemaTable.SchemaDeTable#getNom <em>Nom</em>}</li>
 *   <li>{@link SchemaTable.SchemaDeTable#getColonnes <em>Colonnes</em>}</li>
 *   <li>{@link SchemaTable.SchemaDeTable#getColonneLignes <em>Colonne Lignes</em>}</li>
 * </ul>
 *
 * @see SchemaTable.SchemaTablePackage#getSchemaDeTable()
 * @model
 * @generated
 */
public interface SchemaDeTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see SchemaTable.SchemaTablePackage#getSchemaDeTable_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link SchemaTable.SchemaDeTable#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Colonnes</b></em>' containment reference list.
	 * The list contents are of type {@link SchemaTable.Colonne}.
	 * It is bidirectional and its opposite is '{@link SchemaTable.Colonne#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonnes</em>' containment reference list.
	 * @see SchemaTable.SchemaTablePackage#getSchemaDeTable_Colonnes()
	 * @see SchemaTable.Colonne#getSchema
	 * @model opposite="schema" containment="true" required="true"
	 * @generated
	 */
	EList<Colonne> getColonnes();

	/**
	 * Returns the value of the '<em><b>Colonne Lignes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne Lignes</em>' reference.
	 * @see #setColonneLignes(Colonne)
	 * @see SchemaTable.SchemaTablePackage#getSchemaDeTable_ColonneLignes()
	 * @model required="true"
	 * @generated
	 */
	Colonne getColonneLignes();

	/**
	 * Sets the value of the '{@link SchemaTable.SchemaDeTable#getColonneLignes <em>Colonne Lignes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne Lignes</em>' reference.
	 * @see #getColonneLignes()
	 * @generated
	 */
	void setColonneLignes(Colonne value);

} // SchemaDeTable
