/**
 */
package AlgorithmeTable;

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
 *   <li>{@link AlgorithmeTable.Catalogue#getNom <em>Nom</em>}</li>
 *   <li>{@link AlgorithmeTable.Catalogue#getAlgorithme <em>Algorithme</em>}</li>
 * </ul>
 *
 * @see AlgorithmeTable.AlgorithmeTablePackage#getCatalogue()
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
	 * @see AlgorithmeTable.AlgorithmeTablePackage#getCatalogue_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link AlgorithmeTable.Catalogue#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Algorithme</b></em>' containment reference list.
	 * The list contents are of type {@link AlgorithmeTable.Algorithme}.
	 * It is bidirectional and its opposite is '{@link AlgorithmeTable.Algorithme#getCatalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme</em>' containment reference list.
	 * @see AlgorithmeTable.AlgorithmeTablePackage#getCatalogue_Algorithme()
	 * @see AlgorithmeTable.Algorithme#getCatalogue
	 * @model opposite="catalogue" containment="true" required="true"
	 * @generated
	 */
	EList<Algorithme> getAlgorithme();

} // Catalogue
