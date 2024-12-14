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
 *   <li>{@link SchemaTable.ColonneEtrangere#getNomColonneEtrangere <em>Nom Colonne Etrangere</em>}</li>
 *   <li>{@link SchemaTable.ColonneEtrangere#getSchemaEntree <em>Schema Entree</em>}</li>
 * </ul>
 *
 * @see SchemaTable.SchemaTablePackage#getColonneEtrangere()
 * @model
 * @generated
 */
public interface ColonneEtrangere extends Colonne {
	/**
	 * Returns the value of the '<em><b>Nom Colonne Etrangere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Colonne Etrangere</em>' attribute.
	 * @see #setNomColonneEtrangere(String)
	 * @see SchemaTable.SchemaTablePackage#getColonneEtrangere_NomColonneEtrangere()
	 * @model required="true"
	 * @generated
	 */
	String getNomColonneEtrangere();

	/**
	 * Sets the value of the '{@link SchemaTable.ColonneEtrangere#getNomColonneEtrangere <em>Nom Colonne Etrangere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Colonne Etrangere</em>' attribute.
	 * @see #getNomColonneEtrangere()
	 * @generated
	 */
	void setNomColonneEtrangere(String value);

	/**
	 * Returns the value of the '<em><b>Schema Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Entree</em>' reference.
	 * @see #setSchemaEntree(SchemaDeTable)
	 * @see SchemaTable.SchemaTablePackage#getColonneEtrangere_SchemaEntree()
	 * @model required="true"
	 * @generated
	 */
	SchemaDeTable getSchemaEntree();

	/**
	 * Sets the value of the '{@link SchemaTable.ColonneEtrangere#getSchemaEntree <em>Schema Entree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Entree</em>' reference.
	 * @see #getSchemaEntree()
	 * @generated
	 */
	void setSchemaEntree(SchemaDeTable value);

} // ColonneEtrangere
