/**
 */
package AlgorithmeTable;

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
 * @see AlgorithmeTable.AlgorithmeTableFactory
 * @model kind="package"
 * @generated
 */
public interface AlgorithmeTablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AlgorithmeTable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://algorithme_table";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "algorithmeTable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmeTablePackage eINSTANCE = AlgorithmeTable.impl.AlgorithmeTablePackageImpl.init();

	/**
	 * The meta object id for the '{@link AlgorithmeTable.impl.AlgorithmeImpl <em>Algorithme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlgorithmeTable.impl.AlgorithmeImpl
	 * @see AlgorithmeTable.impl.AlgorithmeTablePackageImpl#getAlgorithme()
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
	 * The meta object id for the '{@link AlgorithmeTable.impl.CatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlgorithmeTable.impl.CatalogueImpl
	 * @see AlgorithmeTable.impl.AlgorithmeTablePackageImpl#getCatalogue()
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
	 * The meta object id for the '{@link AlgorithmeTable.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlgorithmeTable.impl.PortImpl
	 * @see AlgorithmeTable.impl.AlgorithmeTablePackageImpl#getPort()
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
	 * The meta object id for the '{@link AlgorithmeTable.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlgorithmeTable.impl.RessourceImpl
	 * @see AlgorithmeTable.impl.AlgorithmeTablePackageImpl#getRessource()
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
	 * The meta object id for the '{@link AlgorithmeTable.TypeRessource <em>Type Ressource</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlgorithmeTable.TypeRessource
	 * @see AlgorithmeTable.impl.AlgorithmeTablePackageImpl#getTypeRessource()
	 * @generated
	 */
	int TYPE_RESSOURCE = 4;

	/**
	 * The meta object id for the '{@link AlgorithmeTable.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlgorithmeTable.Direction
	 * @see AlgorithmeTable.impl.AlgorithmeTablePackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 5;

	/**
	 * The meta object id for the '{@link AlgorithmeTable.TypeDonnees <em>Type Donnees</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlgorithmeTable.TypeDonnees
	 * @see AlgorithmeTable.impl.AlgorithmeTablePackageImpl#getTypeDonnees()
	 * @generated
	 */
	int TYPE_DONNEES = 6;


	/**
	 * Returns the meta object for class '{@link AlgorithmeTable.Algorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithme</em>'.
	 * @see AlgorithmeTable.Algorithme
	 * @generated
	 */
	EClass getAlgorithme();

	/**
	 * Returns the meta object for the attribute '{@link AlgorithmeTable.Algorithme#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see AlgorithmeTable.Algorithme#getNom()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EAttribute getAlgorithme_Nom();

	/**
	 * Returns the meta object for the attribute '{@link AlgorithmeTable.Algorithme#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see AlgorithmeTable.Algorithme#getDocumentation()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EAttribute getAlgorithme_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link AlgorithmeTable.Algorithme#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ressource</em>'.
	 * @see AlgorithmeTable.Algorithme#getRessource()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_Ressource();

	/**
	 * Returns the meta object for the containment reference list '{@link AlgorithmeTable.Algorithme#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see AlgorithmeTable.Algorithme#getPort()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_Port();

	/**
	 * Returns the meta object for the container reference '{@link AlgorithmeTable.Algorithme#getCatalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Catalogue</em>'.
	 * @see AlgorithmeTable.Algorithme#getCatalogue()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_Catalogue();

	/**
	 * Returns the meta object for class '{@link AlgorithmeTable.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see AlgorithmeTable.Catalogue
	 * @generated
	 */
	EClass getCatalogue();

	/**
	 * Returns the meta object for the attribute '{@link AlgorithmeTable.Catalogue#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see AlgorithmeTable.Catalogue#getNom()
	 * @see #getCatalogue()
	 * @generated
	 */
	EAttribute getCatalogue_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link AlgorithmeTable.Catalogue#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algorithme</em>'.
	 * @see AlgorithmeTable.Catalogue#getAlgorithme()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Algorithme();

	/**
	 * Returns the meta object for class '{@link AlgorithmeTable.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see AlgorithmeTable.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link AlgorithmeTable.Port#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see AlgorithmeTable.Port#getNom()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Nom();

	/**
	 * Returns the meta object for the attribute '{@link AlgorithmeTable.Port#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see AlgorithmeTable.Port#isConstant()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Constant();

	/**
	 * Returns the meta object for the attribute '{@link AlgorithmeTable.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see AlgorithmeTable.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for the attribute '{@link AlgorithmeTable.Port#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see AlgorithmeTable.Port#getDirection()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Direction();

	/**
	 * Returns the meta object for the container reference '{@link AlgorithmeTable.Port#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Algorithme</em>'.
	 * @see AlgorithmeTable.Port#getAlgorithme()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Algorithme();

	/**
	 * Returns the meta object for class '{@link AlgorithmeTable.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see AlgorithmeTable.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link AlgorithmeTable.Ressource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see AlgorithmeTable.Ressource#getType()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Type();

	/**
	 * Returns the meta object for the attribute '{@link AlgorithmeTable.Ressource#getEmplacement <em>Emplacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emplacement</em>'.
	 * @see AlgorithmeTable.Ressource#getEmplacement()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Emplacement();

	/**
	 * Returns the meta object for the container reference '{@link AlgorithmeTable.Ressource#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Algorithme</em>'.
	 * @see AlgorithmeTable.Ressource#getAlgorithme()
	 * @see #getRessource()
	 * @generated
	 */
	EReference getRessource_Algorithme();

	/**
	 * Returns the meta object for enum '{@link AlgorithmeTable.TypeRessource <em>Type Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Ressource</em>'.
	 * @see AlgorithmeTable.TypeRessource
	 * @generated
	 */
	EEnum getTypeRessource();

	/**
	 * Returns the meta object for enum '{@link AlgorithmeTable.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see AlgorithmeTable.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link AlgorithmeTable.TypeDonnees <em>Type Donnees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Donnees</em>'.
	 * @see AlgorithmeTable.TypeDonnees
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
	AlgorithmeTableFactory getAlgorithmeTableFactory();

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
		 * The meta object literal for the '{@link AlgorithmeTable.impl.AlgorithmeImpl <em>Algorithme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlgorithmeTable.impl.AlgorithmeImpl
		 * @see AlgorithmeTable.impl.AlgorithmeTablePackageImpl#getAlgorithme()
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
		 * The meta object literal for the '{@link AlgorithmeTable.impl.CatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlgorithmeTable.impl.CatalogueImpl
		 * @see AlgorithmeTable.impl.AlgorithmeTablePackageImpl#getCatalogue()
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
		 * The meta object literal for the '{@link AlgorithmeTable.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlgorithmeTable.impl.PortImpl
		 * @see AlgorithmeTable.impl.AlgorithmeTablePackageImpl#getPort()
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
		 * The meta object literal for the '{@link AlgorithmeTable.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlgorithmeTable.impl.RessourceImpl
		 * @see AlgorithmeTable.impl.AlgorithmeTablePackageImpl#getRessource()
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
		 * The meta object literal for the '{@link AlgorithmeTable.TypeRessource <em>Type Ressource</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlgorithmeTable.TypeRessource
		 * @see AlgorithmeTable.impl.AlgorithmeTablePackageImpl#getTypeRessource()
		 * @generated
		 */
		EEnum TYPE_RESSOURCE = eINSTANCE.getTypeRessource();

		/**
		 * The meta object literal for the '{@link AlgorithmeTable.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlgorithmeTable.Direction
		 * @see AlgorithmeTable.impl.AlgorithmeTablePackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link AlgorithmeTable.TypeDonnees <em>Type Donnees</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlgorithmeTable.TypeDonnees
		 * @see AlgorithmeTable.impl.AlgorithmeTablePackageImpl#getTypeDonnees()
		 * @generated
		 */
		EEnum TYPE_DONNEES = eINSTANCE.getTypeDonnees();

	}

} //AlgorithmeTablePackage
