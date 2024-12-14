/**
 */
package algorithms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see algorithms.AlgorithmsFactory
 * @model kind="package"
 * @generated
 */
public interface AlgorithmsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "algorithms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/algorithms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "algorithms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmsPackage eINSTANCE = algorithms.impl.AlgorithmsPackageImpl.init();

	/**
	 * The meta object id for the '{@link algorithms.impl.AlgorithmeImpl <em>Algorithme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithms.impl.AlgorithmeImpl
	 * @see algorithms.impl.AlgorithmsPackageImpl#getAlgorithme()
	 * @generated
	 */
	int ALGORITHME = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__NOM = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__RESSOURCE = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__PORT = 3;

	/**
	 * The feature id for the '<em><b>Catalogue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__CATALOGUE = 4;

	/**
	 * The number of structural features of the '<em>Algorithme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Algorithme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithms.impl.CatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithms.impl.CatalogueImpl
	 * @see algorithms.impl.AlgorithmsPackageImpl#getCatalogue()
	 * @generated
	 */
	int CATALOGUE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Algorithme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__ALGORITHME = 1;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithms.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithms.impl.PortImpl
	 * @see algorithms.impl.AlgorithmsPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONSTANT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DIRECTION = 3;

	/**
	 * The feature id for the '<em><b>Algorithme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ALGORITHME = 4;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithms.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithms.impl.RessourceImpl
	 * @see algorithms.impl.AlgorithmsPackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Emplacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__EMPLACEMENT = 1;

	/**
	 * The feature id for the '<em><b>Algorithme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__ALGORITHME = 2;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithms.TypeRessource <em>Type Ressource</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithms.TypeRessource
	 * @see algorithms.impl.AlgorithmsPackageImpl#getTypeRessource()
	 * @generated
	 */
	int TYPE_RESSOURCE = 4;

	/**
	 * The meta object id for the '{@link algorithms.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithms.Direction
	 * @see algorithms.impl.AlgorithmsPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 5;

	/**
	 * The meta object id for the '{@link algorithms.TypeDonnees <em>Type Donnees</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithms.TypeDonnees
	 * @see algorithms.impl.AlgorithmsPackageImpl#getTypeDonnees()
	 * @generated
	 */
	int TYPE_DONNEES = 6;


	/**
	 * Returns the meta object for class '{@link algorithms.Algorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithme</em>'.
	 * @see algorithms.Algorithme
	 * @generated
	 */
	EClass getAlgorithme();

	/**
	 * Returns the meta object for the attribute '{@link algorithms.Algorithme#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see algorithms.Algorithme#getNom()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EAttribute getAlgorithme_Nom();

	/**
	 * Returns the meta object for the attribute '{@link algorithms.Algorithme#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see algorithms.Algorithme#getDocumentation()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EAttribute getAlgorithme_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link algorithms.Algorithme#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ressource</em>'.
	 * @see algorithms.Algorithme#getRessource()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_Ressource();

	/**
	 * Returns the meta object for the containment reference list '{@link algorithms.Algorithme#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see algorithms.Algorithme#getPort()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_Port();

	/**
	 * Returns the meta object for the container reference '{@link algorithms.Algorithme#getCatalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Catalogue</em>'.
	 * @see algorithms.Algorithme#getCatalogue()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_Catalogue();

	/**
	 * Returns the meta object for class '{@link algorithms.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see algorithms.Catalogue
	 * @generated
	 */
	EClass getCatalogue();

	/**
	 * Returns the meta object for the attribute '{@link algorithms.Catalogue#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see algorithms.Catalogue#getNom()
	 * @see #getCatalogue()
	 * @generated
	 */
	EAttribute getCatalogue_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link algorithms.Catalogue#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algorithme</em>'.
	 * @see algorithms.Catalogue#getAlgorithme()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Algorithme();

	/**
	 * Returns the meta object for class '{@link algorithms.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see algorithms.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link algorithms.Port#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see algorithms.Port#getNom()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Nom();

	/**
	 * Returns the meta object for the attribute '{@link algorithms.Port#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see algorithms.Port#isConstant()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Constant();

	/**
	 * Returns the meta object for the attribute '{@link algorithms.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see algorithms.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for the attribute '{@link algorithms.Port#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see algorithms.Port#getDirection()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Direction();

	/**
	 * Returns the meta object for the container reference '{@link algorithms.Port#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Algorithme</em>'.
	 * @see algorithms.Port#getAlgorithme()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Algorithme();

	/**
	 * Returns the meta object for class '{@link algorithms.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see algorithms.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link algorithms.Ressource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see algorithms.Ressource#getType()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Type();

	/**
	 * Returns the meta object for the attribute '{@link algorithms.Ressource#getEmplacement <em>Emplacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emplacement</em>'.
	 * @see algorithms.Ressource#getEmplacement()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Emplacement();

	/**
	 * Returns the meta object for the container reference '{@link algorithms.Ressource#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Algorithme</em>'.
	 * @see algorithms.Ressource#getAlgorithme()
	 * @see #getRessource()
	 * @generated
	 */
	EReference getRessource_Algorithme();

	/**
	 * Returns the meta object for enum '{@link algorithms.TypeRessource <em>Type Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Ressource</em>'.
	 * @see algorithms.TypeRessource
	 * @generated
	 */
	EEnum getTypeRessource();

	/**
	 * Returns the meta object for enum '{@link algorithms.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see algorithms.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link algorithms.TypeDonnees <em>Type Donnees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Donnees</em>'.
	 * @see algorithms.TypeDonnees
	 * @generated
	 */
	EEnum getTypeDonnees();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlgorithmsFactory getAlgorithmsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link algorithms.impl.AlgorithmeImpl <em>Algorithme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithms.impl.AlgorithmeImpl
		 * @see algorithms.impl.AlgorithmsPackageImpl#getAlgorithme()
		 * @generated
		 */
		EClass ALGORITHME = eINSTANCE.getAlgorithme();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHME__NOM = eINSTANCE.getAlgorithme_Nom();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHME__DOCUMENTATION = eINSTANCE.getAlgorithme_Documentation();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME__RESSOURCE = eINSTANCE.getAlgorithme_Ressource();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME__PORT = eINSTANCE.getAlgorithme_Port();

		/**
		 * The meta object literal for the '<em><b>Catalogue</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME__CATALOGUE = eINSTANCE.getAlgorithme_Catalogue();

		/**
		 * The meta object literal for the '{@link algorithms.impl.CatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithms.impl.CatalogueImpl
		 * @see algorithms.impl.AlgorithmsPackageImpl#getCatalogue()
		 * @generated
		 */
		EClass CATALOGUE = eINSTANCE.getCatalogue();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGUE__NOM = eINSTANCE.getCatalogue_Nom();

		/**
		 * The meta object literal for the '<em><b>Algorithme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__ALGORITHME = eINSTANCE.getCatalogue_Algorithme();

		/**
		 * The meta object literal for the '{@link algorithms.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithms.impl.PortImpl
		 * @see algorithms.impl.AlgorithmsPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NOM = eINSTANCE.getPort_Nom();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__CONSTANT = eINSTANCE.getPort_Constant();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DIRECTION = eINSTANCE.getPort_Direction();

		/**
		 * The meta object literal for the '<em><b>Algorithme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__ALGORITHME = eINSTANCE.getPort_Algorithme();

		/**
		 * The meta object literal for the '{@link algorithms.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithms.impl.RessourceImpl
		 * @see algorithms.impl.AlgorithmsPackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__TYPE = eINSTANCE.getRessource_Type();

		/**
		 * The meta object literal for the '<em><b>Emplacement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__EMPLACEMENT = eINSTANCE.getRessource_Emplacement();

		/**
		 * The meta object literal for the '<em><b>Algorithme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE__ALGORITHME = eINSTANCE.getRessource_Algorithme();

		/**
		 * The meta object literal for the '{@link algorithms.TypeRessource <em>Type Ressource</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithms.TypeRessource
		 * @see algorithms.impl.AlgorithmsPackageImpl#getTypeRessource()
		 * @generated
		 */
		EEnum TYPE_RESSOURCE = eINSTANCE.getTypeRessource();

		/**
		 * The meta object literal for the '{@link algorithms.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithms.Direction
		 * @see algorithms.impl.AlgorithmsPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link algorithms.TypeDonnees <em>Type Donnees</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithms.TypeDonnees
		 * @see algorithms.impl.AlgorithmsPackageImpl#getTypeDonnees()
		 * @generated
		 */
		EEnum TYPE_DONNEES = eINSTANCE.getTypeDonnees();

	}

} //AlgorithmsPackage
