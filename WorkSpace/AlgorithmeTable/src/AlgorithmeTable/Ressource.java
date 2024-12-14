/**
 */
package AlgorithmeTable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlgorithmeTable.Ressource#getType <em>Type</em>}</li>
 *   <li>{@link AlgorithmeTable.Ressource#getEmplacement <em>Emplacement</em>}</li>
 *   <li>{@link AlgorithmeTable.Ressource#getAlgorithme <em>Algorithme</em>}</li>
 * </ul>
 *
 * @see AlgorithmeTable.AlgorithmeTablePackage#getRessource()
 * @model
 * @generated
 */
public interface Ressource extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link AlgorithmeTable.TypeRessource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see AlgorithmeTable.TypeRessource
	 * @see #setType(TypeRessource)
	 * @see AlgorithmeTable.AlgorithmeTablePackage#getRessource_Type()
	 * @model
	 * @generated
	 */
	TypeRessource getType();

	/**
	 * Sets the value of the '{@link AlgorithmeTable.Ressource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see AlgorithmeTable.TypeRessource
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeRessource value);

	/**
	 * Returns the value of the '<em><b>Emplacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emplacement</em>' attribute.
	 * @see #setEmplacement(String)
	 * @see AlgorithmeTable.AlgorithmeTablePackage#getRessource_Emplacement()
	 * @model
	 * @generated
	 */
	String getEmplacement();

	/**
	 * Sets the value of the '{@link AlgorithmeTable.Ressource#getEmplacement <em>Emplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emplacement</em>' attribute.
	 * @see #getEmplacement()
	 * @generated
	 */
	void setEmplacement(String value);

	/**
	 * Returns the value of the '<em><b>Algorithme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link AlgorithmeTable.Algorithme#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme</em>' container reference.
	 * @see #setAlgorithme(Algorithme)
	 * @see AlgorithmeTable.AlgorithmeTablePackage#getRessource_Algorithme()
	 * @see AlgorithmeTable.Algorithme#getRessource
	 * @model opposite="ressource" required="true" transient="false"
	 * @generated
	 */
	Algorithme getAlgorithme();

	/**
	 * Sets the value of the '{@link AlgorithmeTable.Ressource#getAlgorithme <em>Algorithme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithme</em>' container reference.
	 * @see #getAlgorithme()
	 * @generated
	 */
	void setAlgorithme(Algorithme value);

} // Ressource
