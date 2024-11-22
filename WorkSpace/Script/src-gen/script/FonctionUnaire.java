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
 * </ul>
 *
 * @see script.ScriptPackage#getFonctionUnaire()
 * @model
 * @generated
 */
public interface FonctionUnaire extends BlocAvecSortie {
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
	 * Returns the value of the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' reference.
	 * @see #setEntree(BlocAvecSortie)
	 * @see script.ScriptPackage#getFonctionUnaire_Entree()
	 * @model required="true"
	 * @generated
	 */
	BlocAvecSortie getEntree();

	/**
	 * Sets the value of the '{@link script.FonctionUnaire#getEntree <em>Entree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entree</em>' reference.
	 * @see #getEntree()
	 * @generated
	 */
	void setEntree(BlocAvecSortie value);

} // FonctionUnaire
