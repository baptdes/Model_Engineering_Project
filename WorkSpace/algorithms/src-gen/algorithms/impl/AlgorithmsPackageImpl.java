/**
 */
package algorithms.impl;

import algorithms.Algorithme;
import algorithms.AlgorithmsFactory;
import algorithms.AlgorithmsPackage;
import algorithms.Catalogue;
import algorithms.Direction;
import algorithms.Port;
import algorithms.Resource;
import algorithms.TypeDeRessource;
import algorithms.TypeDonnee;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgorithmsPackageImpl extends EPackageImpl implements AlgorithmsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeDeRessourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeDonneeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see algorithms.AlgorithmsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlgorithmsPackageImpl() {
		super(eNS_URI, AlgorithmsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AlgorithmsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlgorithmsPackage init() {
		if (isInited)
			return (AlgorithmsPackage) EPackage.Registry.INSTANCE.getEPackage(AlgorithmsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAlgorithmsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AlgorithmsPackageImpl theAlgorithmsPackage = registeredAlgorithmsPackage instanceof AlgorithmsPackageImpl
				? (AlgorithmsPackageImpl) registeredAlgorithmsPackage
				: new AlgorithmsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAlgorithmsPackage.createPackageContents();

		// Initialize created meta-data
		theAlgorithmsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlgorithmsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlgorithmsPackage.eNS_URI, theAlgorithmsPackage);
		return theAlgorithmsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlgorithme() {
		return algorithmeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithme_Nom() {
		return (EAttribute) algorithmeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithme_Documentation() {
		return (EAttribute) algorithmeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlgorithme_Resource() {
		return (EReference) algorithmeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlgorithme_Port() {
		return (EReference) algorithmeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogue() {
		return catalogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogue_Nom() {
		return (EAttribute) catalogueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogue_Algorithme() {
		return (EReference) catalogueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Nom() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Constant() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Type() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Direction() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Type() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Emplacement() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeDeRessource() {
		return typeDeRessourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeDonnee() {
		return typeDonneeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlgorithmsFactory getAlgorithmsFactory() {
		return (AlgorithmsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		algorithmeEClass = createEClass(ALGORITHME);
		createEAttribute(algorithmeEClass, ALGORITHME__NOM);
		createEAttribute(algorithmeEClass, ALGORITHME__DOCUMENTATION);
		createEReference(algorithmeEClass, ALGORITHME__RESOURCE);
		createEReference(algorithmeEClass, ALGORITHME__PORT);

		catalogueEClass = createEClass(CATALOGUE);
		createEAttribute(catalogueEClass, CATALOGUE__NOM);
		createEReference(catalogueEClass, CATALOGUE__ALGORITHME);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__NOM);
		createEAttribute(portEClass, PORT__CONSTANT);
		createEAttribute(portEClass, PORT__TYPE);
		createEAttribute(portEClass, PORT__DIRECTION);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__TYPE);
		createEAttribute(resourceEClass, RESOURCE__EMPLACEMENT);

		// Create enums
		typeDeRessourceEEnum = createEEnum(TYPE_DE_RESSOURCE);
		directionEEnum = createEEnum(DIRECTION);
		typeDonneeEEnum = createEEnum(TYPE_DONNEE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(algorithmeEClass, Algorithme.class, "Algorithme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlgorithme_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Algorithme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgorithme_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1,
				Algorithme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithme_Resource(), this.getResource(), null, "resource", null, 1, 1, Algorithme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithme_Port(), this.getPort(), null, "port", null, 1, -1, Algorithme.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(catalogueEClass, Catalogue.class, "Catalogue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogue_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Catalogue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogue_Algorithme(), this.getAlgorithme(), null, "algorithme", null, 1, -1,
				Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Constant(), ecorePackage.getEBoolean(), "constant", "false", 0, 1, Port.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Type(), this.getTypeDonnee(), "type", null, 0, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Direction(), this.getDirection(), "direction", null, 0, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Type(), this.getTypeDeRessource(), "Type", null, 0, 1, Resource.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Emplacement(), ecorePackage.getEString(), "Emplacement", null, 0, 1, Resource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeDeRessourceEEnum, TypeDeRessource.class, "TypeDeRessource");
		addEEnumLiteral(typeDeRessourceEEnum, TypeDeRessource.PYTHON);
		addEEnumLiteral(typeDeRessourceEEnum, TypeDeRessource.MATLAB);

		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.INPUT);
		addEEnumLiteral(directionEEnum, Direction.OUTPUT);

		initEEnum(typeDonneeEEnum, TypeDonnee.class, "TypeDonnee");
		addEEnumLiteral(typeDonneeEEnum, TypeDonnee.ENTIER);
		addEEnumLiteral(typeDonneeEEnum, TypeDonnee.FLOTTANT);
		addEEnumLiteral(typeDonneeEEnum, TypeDonnee.TEXT);
		addEEnumLiteral(typeDonneeEEnum, TypeDonnee.BOOLEEN);

		// Create resource
		createResource(eNS_URI);
	}

} //AlgorithmsPackageImpl
