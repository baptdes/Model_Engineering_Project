/**
 */
package script;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fonction Unaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.FonctionUnaire#getFonction <em>Fonction</em>}</li>
 *   <li>{@link script.FonctionUnaire#getEntree <em>Entree</em>}</li>
 *   <li>{@link script.FonctionUnaire#getSortie <em>Sortie</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getFonctionUnaire()
 * @model
 * @generated
 */
public interface FonctionUnaire extends Bloc {
	/**
	 * Returns the value of the '<em><b>Fonction</b></em>' attribute.
	 * The literals are from the enumeration {@link script.TypeFonctionUnaire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction</em>' attribute.
	 * @see script.TypeFonctionUnaire
	 * @see #setFonction(TypeFonctionUnaire)
	 * @see script.ScriptPackage#getFonctionUnaire_Fonction()
	 * @model required="true"
	 * @generated
	 */
	TypeFonctionUnaire getFonction();

	/**
	 * Sets the value of the '{@link script.FonctionUnaire#getFonction <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction</em>' attribute.
	 * @see script.TypeFonctionUnaire
	 * @see #getFonction()
	 * @generated
	 */
	void setFonction(TypeFonctionUnaire value);

	/**
	 * Returns the value of the '<em><b>Entree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' containment reference.
	 * @see #setEntree(Entree)
	 * @see script.ScriptPackage#getFonctionUnaire_Entree()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Entree getEntree();

	/**
	 * Sets the value of the '{@link script.FonctionUnaire#getEntree <em>Entree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entree</em>' containment reference.
	 * @see #getEntree()
	 * @generated
	 */
	void setEntree(Entree value);

	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' containment reference.
	 * @see #setSortie(Sortie)
	 * @see script.ScriptPackage#getFonctionUnaire_Sortie()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sortie getSortie();

	/**
	 * Sets the value of the '{@link script.FonctionUnaire#getSortie <em>Sortie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie</em>' containment reference.
	 * @see #getSortie()
	 * @generated
	 */
	void setSortie(Sortie value);

} // FonctionUnaire
