/**
 */
package SchemaTable;

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
 *   <li>{@link SchemaTable.Contrainte#getColonnes <em>Colonnes</em>}</li>
 *   <li>{@link SchemaTable.Contrainte#getAlgorithme <em>Algorithme</em>}</li>
 * </ul>
 *
 * @see SchemaTable.SchemaTablePackage#getContrainte()
 * @model
 * @generated
 */
public interface Contrainte extends EObject {
	/**
	 * Returns the value of the '<em><b>Colonnes</b></em>' reference list.
	 * The list contents are of type {@link SchemaTable.Colonne}.
	 * It is bidirectional and its opposite is '{@link SchemaTable.Colonne#getContraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonnes</em>' reference list.
	 * @see SchemaTable.SchemaTablePackage#getContrainte_Colonnes()
	 * @see SchemaTable.Colonne#getContraintes
	 * @model opposite="contraintes"
	 * @generated
	 */
	EList<Colonne> getColonnes();

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

} // Contrainte
