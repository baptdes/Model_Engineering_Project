/**
 */
package script;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sortie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Sortie#getEntree <em>Entree</em>}</li>
 *   <li>{@link script.Sortie#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getSortie()
 * @model
 * @generated
 */
public interface Sortie extends EObject {
	/**
	 * Returns the value of the '<em><b>Entree</b></em>' reference list.
	 * The list contents are of type {@link script.Entree}.
	 * It is bidirectional and its opposite is '{@link script.Entree#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' reference list.
	 * @see script.ScriptPackage#getSortie_Entree()
	 * @see script.Entree#getSortie
	 * @model opposite="sortie" required="true"
	 * @generated
	 */
	EList<Entree> getEntree();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see script.ScriptPackage#getSortie_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link script.Sortie#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Sortie
