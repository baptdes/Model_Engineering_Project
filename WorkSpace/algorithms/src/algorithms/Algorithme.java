/**
 */
package algorithms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithms.Algorithme#getNom <em>Nom</em>}</li>
 *   <li>{@link algorithms.Algorithme#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link algorithms.Algorithme#getRessource <em>Ressource</em>}</li>
 *   <li>{@link algorithms.Algorithme#getPort <em>Port</em>}</li>
 *   <li>{@link algorithms.Algorithme#getCatalogue <em>Catalogue</em>}</li>
 * </ul>
 *
 * @see algorithms.AlgorithmsPackage#getAlgorithme()
 * @model
 * @generated
 */
public interface Algorithme extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see algorithms.AlgorithmsPackage#getAlgorithme_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link algorithms.Algorithme#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see algorithms.AlgorithmsPackage#getAlgorithme_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link algorithms.Algorithme#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link algorithms.Ressource#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' containment reference.
	 * @see #setRessource(Ressource)
	 * @see algorithms.AlgorithmsPackage#getAlgorithme_Ressource()
	 * @see algorithms.Ressource#getAlgorithme
	 * @model opposite="algorithme" containment="true" required="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link algorithms.Algorithme#getRessource <em>Ressource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' containment reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link algorithms.Port}.
	 * It is bidirectional and its opposite is '{@link algorithms.Port#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see algorithms.AlgorithmsPackage#getAlgorithme_Port()
	 * @see algorithms.Port#getAlgorithme
	 * @model opposite="algorithme" containment="true" required="true"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Catalogue</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithms.Catalogue#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalogue</em>' container reference.
	 * @see #setCatalogue(Catalogue)
	 * @see algorithms.AlgorithmsPackage#getAlgorithme_Catalogue()
	 * @see algorithms.Catalogue#getAlgorithme
	 * @model opposite="algorithme" transient="false"
	 * @generated
	 */
	Catalogue getCatalogue();

	/**
	 * Sets the value of the '{@link algorithms.Algorithme#getCatalogue <em>Catalogue</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalogue</em>' container reference.
	 * @see #getCatalogue()
	 * @generated
	 */
	void setCatalogue(Catalogue value);

} // Algorithme
