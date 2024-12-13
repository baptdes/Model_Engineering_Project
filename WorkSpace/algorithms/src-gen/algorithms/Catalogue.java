/**
 */
package algorithms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithms.Catalogue#getNom <em>Nom</em>}</li>
 *   <li>{@link algorithms.Catalogue#getAlgorithme <em>Algorithme</em>}</li>
 * </ul>
 *
 * @see algorithms.AlgorithmsPackage#getCatalogue()
 * @model
 * @generated
 */
public interface Catalogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see algorithms.AlgorithmsPackage#getCatalogue_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link algorithms.Catalogue#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Algorithme</b></em>' reference list.
	 * The list contents are of type {@link algorithms.Algorithme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme</em>' reference list.
	 * @see algorithms.AlgorithmsPackage#getCatalogue_Algorithme()
	 * @model required="true"
	 * @generated
	 */
	EList<Algorithme> getAlgorithme();

} // Catalogue
