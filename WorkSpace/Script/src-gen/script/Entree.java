/**
 */
package script;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Entree#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getEntree()
 * @model
 * @generated
 */
public interface Entree extends BlocSansEntree {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see script.ScriptPackage#getEntree_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link script.Entree#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Entree
