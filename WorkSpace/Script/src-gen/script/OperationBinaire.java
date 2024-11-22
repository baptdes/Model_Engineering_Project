/**
 */
package script;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Binaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.OperationBinaire#getOperation <em>Operation</em>}</li>
 *   <li>{@link script.OperationBinaire#getEntree <em>Entree</em>}</li>
 *   <li>{@link script.OperationBinaire#getSortie <em>Sortie</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getOperationBinaire()
 * @model
 * @generated
 */
public interface OperationBinaire extends Bloc {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link script.TypeOperationBinaire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see script.TypeOperationBinaire
	 * @see #setOperation(TypeOperationBinaire)
	 * @see script.ScriptPackage#getOperationBinaire_Operation()
	 * @model required="true"
	 * @generated
	 */
	TypeOperationBinaire getOperation();

	/**
	 * Sets the value of the '{@link script.OperationBinaire#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see script.TypeOperationBinaire
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(TypeOperationBinaire value);

	/**
	 * Returns the value of the '<em><b>Entree</b></em>' containment reference list.
	 * The list contents are of type {@link script.Entree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' containment reference list.
	 * @see script.ScriptPackage#getOperationBinaire_Entree()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Entree> getEntree();

	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' containment reference.
	 * @see #setSortie(Sortie)
	 * @see script.ScriptPackage#getOperationBinaire_Sortie()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sortie getSortie();

	/**
	 * Sets the value of the '{@link script.OperationBinaire#getSortie <em>Sortie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie</em>' containment reference.
	 * @see #getSortie()
	 * @generated
	 */
	void setSortie(Sortie value);

} // OperationBinaire
