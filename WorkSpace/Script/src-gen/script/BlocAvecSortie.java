/**
 */
package script;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloc Avec Sortie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.BlocAvecSortie#getSortie <em>Sortie</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getBlocAvecSortie()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BlocAvecSortie extends Bloc {
	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' reference.
	 * @see #setSortie(Bloc)
	 * @see script.ScriptPackage#getBlocAvecSortie_Sortie()
	 * @model required="true"
	 * @generated
	 */
	Bloc getSortie();

	/**
	 * Sets the value of the '{@link script.BlocAvecSortie#getSortie <em>Sortie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie</em>' reference.
	 * @see #getSortie()
	 * @generated
	 */
	void setSortie(Bloc value);

} // BlocAvecSortie
