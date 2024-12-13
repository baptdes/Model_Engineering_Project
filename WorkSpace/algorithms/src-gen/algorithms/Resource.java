/**
 */
package algorithms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithms.Resource#getType <em>Type</em>}</li>
 *   <li>{@link algorithms.Resource#getEmplacement <em>Emplacement</em>}</li>
 * </ul>
 *
 * @see algorithms.AlgorithmsPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link algorithms.TypeDeRessource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see algorithms.TypeDeRessource
	 * @see #setType(TypeDeRessource)
	 * @see algorithms.AlgorithmsPackage#getResource_Type()
	 * @model
	 * @generated
	 */
	TypeDeRessource getType();

	/**
	 * Sets the value of the '{@link algorithms.Resource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see algorithms.TypeDeRessource
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDeRessource value);

	/**
	 * Returns the value of the '<em><b>Emplacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emplacement</em>' attribute.
	 * @see #setEmplacement(String)
	 * @see algorithms.AlgorithmsPackage#getResource_Emplacement()
	 * @model
	 * @generated
	 */
	String getEmplacement();

	/**
	 * Sets the value of the '{@link algorithms.Resource#getEmplacement <em>Emplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emplacement</em>' attribute.
	 * @see #getEmplacement()
	 * @generated
	 */
	void setEmplacement(String value);

} // Resource
