/**
 */
package SchemaTable;

import AlgorithmeTable.TypeDonnees;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SchemaTable.Colonne#getNom <em>Nom</em>}</li>
 *   <li>{@link SchemaTable.Colonne#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link SchemaTable.Colonne#getTypeDonnees <em>Type Donnees</em>}</li>
 *   <li>{@link SchemaTable.Colonne#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see SchemaTable.SchemaTablePackage#getColonne()
 * @model abstract="true"
 * @generated
 */
public interface Colonne extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SchemaTable.SchemaDeTable#getColonnes <em>Colonnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(SchemaDeTable)
	 * @see SchemaTable.SchemaTablePackage#getColonne_Schema()
	 * @see SchemaTable.SchemaDeTable#getColonnes
	 * @model opposite="colonnes" required="true" transient="false"
	 * @generated
	 */
	SchemaDeTable getSchema();

	/**
	 * Sets the value of the '{@link SchemaTable.Colonne#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(SchemaDeTable value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see SchemaTable.SchemaTablePackage#getColonne_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link SchemaTable.Colonne#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Identifiant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant</em>' attribute.
	 * @see #setIdentifiant(String)
	 * @see SchemaTable.SchemaTablePackage#getColonne_Identifiant()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifiant();

	/**
	 * Sets the value of the '{@link SchemaTable.Colonne#getIdentifiant <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant</em>' attribute.
	 * @see #getIdentifiant()
	 * @generated
	 */
	void setIdentifiant(String value);

	/**
	 * Returns the value of the '<em><b>Type Donnees</b></em>' attribute.
	 * The default value is <code>"float"</code>.
	 * The literals are from the enumeration {@link AlgorithmeTable.TypeDonnees}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Donnees</em>' attribute.
	 * @see AlgorithmeTable.TypeDonnees
	 * @see #setTypeDonnees(TypeDonnees)
	 * @see SchemaTable.SchemaTablePackage#getColonne_TypeDonnees()
	 * @model default="float" required="true"
	 * @generated
	 */
	TypeDonnees getTypeDonnees();

	/**
	 * Sets the value of the '{@link SchemaTable.Colonne#getTypeDonnees <em>Type Donnees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Donnees</em>' attribute.
	 * @see AlgorithmeTable.TypeDonnees
	 * @see #getTypeDonnees()
	 * @generated
	 */
	void setTypeDonnees(TypeDonnees value);

} // Colonne
