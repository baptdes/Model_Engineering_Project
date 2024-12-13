/**
 */
package script;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resultat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Resultat#getEntree <em>Entree</em>}</li>
 *   <li>{@link script.Resultat#getScript <em>Script</em>}</li>
 *   <li>{@link script.Resultat#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getResultat()
 * @model
 * @generated
 */
public interface Resultat extends EObject {

	/**
	 * Returns the value of the '<em><b>Entree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' containment reference.
	 * @see #setEntree(Entree)
	 * @see script.ScriptPackage#getResultat_Entree()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Entree getEntree();

	/**
	 * Sets the value of the '{@link script.Resultat#getEntree <em>Entree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entree</em>' containment reference.
	 * @see #getEntree()
	 * @generated
	 */
	void setEntree(Entree value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link script.Script#getResultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' container reference.
	 * @see #setScript(Script)
	 * @see script.ScriptPackage#getResultat_Script()
	 * @see script.Script#getResultat
	 * @model opposite="resultat" required="true" transient="false"
	 * @generated
	 */
	Script getScript();

	/**
	 * Sets the value of the '{@link script.Resultat#getScript <em>Script</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' container reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Script value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see script.ScriptPackage#getResultat_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link script.Resultat#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);
} // Resultat
