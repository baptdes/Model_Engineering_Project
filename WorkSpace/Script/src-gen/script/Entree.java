/**
 */
package script;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Entree#getSortie <em>Sortie</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getEntree()
 * @model
 * @generated
 */
public interface Entree extends EObject {
	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link script.Sortie#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' reference.
	 * @see #setSortie(Sortie)
	 * @see script.ScriptPackage#getEntree_Sortie()
	 * @see script.Sortie#getEntree
	 * @model opposite="entree" required="true"
	 * @generated
	 */
	Sortie getSortie();

	/**
	 * Sets the value of the '{@link script.Entree#getSortie <em>Sortie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie</em>' reference.
	 * @see #getSortie()
	 * @generated
	 */
	void setSortie(Sortie value);

} // Entree
