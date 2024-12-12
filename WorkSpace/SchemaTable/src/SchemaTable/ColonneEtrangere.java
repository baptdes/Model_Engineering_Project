/**
 */
package SchemaTable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne Etrangere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SchemaTable.ColonneEtrangere#getIdentifiantColonneEtrangere <em>Identifiant Colonne Etrangere</em>}</li>
 * </ul>
 *
 * @see SchemaTable.SchemaTablePackage#getColonneEtrangere()
 * @model
 * @generated
 */
public interface ColonneEtrangere extends Colonne {
	/**
	 * Returns the value of the '<em><b>Identifiant Colonne Etrangere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant Colonne Etrangere</em>' attribute.
	 * @see #setIdentifiantColonneEtrangere(String)
	 * @see SchemaTable.SchemaTablePackage#getColonneEtrangere_IdentifiantColonneEtrangere()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifiantColonneEtrangere();

	/**
	 * Sets the value of the '{@link SchemaTable.ColonneEtrangere#getIdentifiantColonneEtrangere <em>Identifiant Colonne Etrangere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant Colonne Etrangere</em>' attribute.
	 * @see #getIdentifiantColonneEtrangere()
	 * @generated
	 */
	void setIdentifiantColonneEtrangere(String value);

} // ColonneEtrangere
