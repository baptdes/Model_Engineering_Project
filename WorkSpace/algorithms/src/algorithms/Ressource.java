/**
 */
package algorithms;

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
 *   <li>{@link algorithms.Ressource#getType <em>Type</em>}</li>
 *   <li>{@link algorithms.Ressource#getEmplacement <em>Emplacement</em>}</li>
 *   <li>{@link algorithms.Ressource#getAlgorithme <em>Algorithme</em>}</li>
 * </ul>
 *
 * @see algorithms.AlgorithmsPackage#getRessource()
 * @model
 * @generated
 */
public interface Ressource extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link algorithms.TypeRessource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see algorithms.TypeRessource
	 * @see #setType(TypeRessource)
	 * @see algorithms.AlgorithmsPackage#getRessource_Type()
	 * @model
	 * @generated
	 */
	TypeRessource getType();

	/**
	 * Sets the value of the '{@link algorithms.Ressource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see algorithms.TypeRessource
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
	 * @see algorithms.AlgorithmsPackage#getRessource_Emplacement()
	 * @model
	 * @generated
	 */
	String getEmplacement();

	/**
	 * Sets the value of the '{@link algorithms.Ressource#getEmplacement <em>Emplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emplacement</em>' attribute.
	 * @see #getEmplacement()
	 * @generated
	 */
	void setEmplacement(String value);

	/**
	 * Returns the value of the '<em><b>Algorithme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithms.Algorithme#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme</em>' container reference.
	 * @see #setAlgorithme(Algorithme)
	 * @see algorithms.AlgorithmsPackage#getRessource_Algorithme()
	 * @see algorithms.Algorithme#getRessource
	 * @model opposite="ressource" required="true" transient="false"
	 * @generated
	 */
	Algorithme getAlgorithme();

	/**
	 * Sets the value of the '{@link algorithms.Ressource#getAlgorithme <em>Algorithme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithme</em>' container reference.
	 * @see #getAlgorithme()
	 * @generated
	 */
	void setAlgorithme(Algorithme value);

} // Ressource
