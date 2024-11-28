/**
 */
package script;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Bloc#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getBloc()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Bloc extends EObject {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link script.Script#getBlocs <em>Blocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' container reference.
	 * @see #setScript(Script)
	 * @see script.ScriptPackage#getBloc_Script()
	 * @see script.Script#getBlocs
	 * @model opposite="blocs" required="true" transient="false"
	 * @generated
	 */
	Script getScript();

	/**
	 * Sets the value of the '{@link script.Bloc#getScript <em>Script</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' container reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Script value);

} // Bloc
