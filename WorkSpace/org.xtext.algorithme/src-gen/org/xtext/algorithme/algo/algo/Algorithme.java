/**
 * generated by Xtext 2.32.0
 */
package org.xtext.algorithme.algo.algo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.algorithme.algo.algo.Algorithme#getNom <em>Nom</em>}</li>
 *   <li>{@link org.xtext.algorithme.algo.algo.Algorithme#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.xtext.algorithme.algo.algo.Algorithme#getRessource <em>Ressource</em>}</li>
 *   <li>{@link org.xtext.algorithme.algo.algo.Algorithme#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.xtext.algorithme.algo.algo.AlgoPackage#getAlgorithme()
 * @model
 * @generated
 */
public interface Algorithme extends EObject
{
  /**
   * Returns the value of the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom</em>' attribute.
   * @see #setNom(String)
   * @see org.xtext.algorithme.algo.algo.AlgoPackage#getAlgorithme_Nom()
   * @model
   * @generated
   */
  String getNom();

  /**
   * Sets the value of the '{@link org.xtext.algorithme.algo.algo.Algorithme#getNom <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom</em>' attribute.
   * @see #getNom()
   * @generated
   */
  void setNom(String value);

  /**
   * Returns the value of the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute.
   * @see #setDocumentation(String)
   * @see org.xtext.algorithme.algo.algo.AlgoPackage#getAlgorithme_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link org.xtext.algorithme.algo.algo.Algorithme#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

  /**
   * Returns the value of the '<em><b>Ressource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ressource</em>' containment reference.
   * @see #setRessource(Ressource)
   * @see org.xtext.algorithme.algo.algo.AlgoPackage#getAlgorithme_Ressource()
   * @model containment="true"
   * @generated
   */
  Ressource getRessource();

  /**
   * Sets the value of the '{@link org.xtext.algorithme.algo.algo.Algorithme#getRessource <em>Ressource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ressource</em>' containment reference.
   * @see #getRessource()
   * @generated
   */
  void setRessource(Ressource value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.algorithme.algo.algo.Port}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' containment reference list.
   * @see org.xtext.algorithme.algo.algo.AlgoPackage#getAlgorithme_Port()
   * @model containment="true"
   * @generated
   */
  EList<Port> getPort();

} // Algorithme
