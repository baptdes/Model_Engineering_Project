/**
 */
package algorithms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithms.Port#getNom <em>Nom</em>}</li>
 *   <li>{@link algorithms.Port#isConstant <em>Constant</em>}</li>
 *   <li>{@link algorithms.Port#getType <em>Type</em>}</li>
 *   <li>{@link algorithms.Port#getDirection <em>Direction</em>}</li>
 *   <li>{@link algorithms.Port#getAlgorithme <em>Algorithme</em>}</li>
 * </ul>
 *
 * @see algorithms.AlgorithmsPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see algorithms.AlgorithmsPackage#getPort_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link algorithms.Port#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see algorithms.AlgorithmsPackage#getPort_Constant()
	 * @model default="false"
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link algorithms.Port#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Flottant"</code>.
	 * The literals are from the enumeration {@link algorithms.TypeDonnees}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see algorithms.TypeDonnees
	 * @see #setType(TypeDonnees)
	 * @see algorithms.AlgorithmsPackage#getPort_Type()
	 * @model default="Flottant"
	 * @generated
	 */
	TypeDonnees getType();

	/**
	 * Sets the value of the '{@link algorithms.Port#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see algorithms.TypeDonnees
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDonnees value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link algorithms.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see algorithms.Direction
	 * @see #setDirection(Direction)
	 * @see algorithms.AlgorithmsPackage#getPort_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link algorithms.Port#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see algorithms.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Algorithme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithms.Algorithme#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme</em>' container reference.
	 * @see #setAlgorithme(Algorithme)
	 * @see algorithms.AlgorithmsPackage#getPort_Algorithme()
	 * @see algorithms.Algorithme#getPort
	 * @model opposite="port" required="true" transient="false"
	 * @generated
	 */
	Algorithme getAlgorithme();

	/**
	 * Sets the value of the '{@link algorithms.Port#getAlgorithme <em>Algorithme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithme</em>' container reference.
	 * @see #getAlgorithme()
	 * @generated
	 */
	void setAlgorithme(Algorithme value);

} // Port
