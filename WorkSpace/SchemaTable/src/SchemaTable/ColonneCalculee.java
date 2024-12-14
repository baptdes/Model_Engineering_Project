/**
 */
package SchemaTable;

import AlgorithmeTable.Algorithme;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne Calculee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SchemaTable.ColonneCalculee#getAlgorithme <em>Algorithme</em>}</li>
 *   <li>{@link SchemaTable.ColonneCalculee#getIdentifiantsColonnesEntree <em>Identifiants Colonnes Entree</em>}</li>
 *   <li>{@link SchemaTable.ColonneCalculee#getSchemasEntree <em>Schemas Entree</em>}</li>
 * </ul>
 *
 * @see SchemaTable.SchemaTablePackage#getColonneCalculee()
 * @model
 * @generated
 */
public interface ColonneCalculee extends Colonne {
	/**
	 * Returns the value of the '<em><b>Algorithme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme</em>' reference.
	 * @see #setAlgorithme(Algorithme)
	 * @see SchemaTable.SchemaTablePackage#getColonneCalculee_Algorithme()
	 * @model required="true"
	 * @generated
	 */
	Algorithme getAlgorithme();

	/**
	 * Sets the value of the '{@link SchemaTable.ColonneCalculee#getAlgorithme <em>Algorithme</em>}' reference.
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
	 * @see SchemaTable.SchemaTablePackage#getColonneCalculee_IdentifiantsColonnesEntree()
	 * @model
	 * @generated
	 */
	EList<String> getIdentifiantsColonnesEntree();

	/**
	 * Returns the value of the '<em><b>Schemas Entree</b></em>' reference list.
	 * The list contents are of type {@link SchemaTable.SchemaDeTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas Entree</em>' reference list.
	 * @see SchemaTable.SchemaTablePackage#getColonneCalculee_SchemasEntree()
	 * @model
	 * @generated
	 */
	EList<SchemaDeTable> getSchemasEntree();

} // ColonneCalculee
