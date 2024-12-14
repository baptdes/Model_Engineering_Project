/**
 */
package SchemaTable.impl;

import AlgorithmeTable.AlgorithmeTablePackage;
import SchemaTable.Colonne;
import SchemaTable.ColonneBrute;
import SchemaTable.ColonneCalculee;
import SchemaTable.ColonneEtrangere;
import SchemaTable.SchemaDeTable;
import SchemaTable.SchemaTableFactory;
import SchemaTable.SchemaTablePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaTablePackageImpl extends EPackageImpl implements SchemaTablePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaDeTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneBruteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneCalculeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneEtrangereEClass = null;

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
	 * @see SchemaTable.SchemaTablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchemaTablePackageImpl() {
		super(eNS_URI, SchemaTableFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SchemaTablePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchemaTablePackage init() {
		if (isInited) return (SchemaTablePackage)EPackage.Registry.INSTANCE.getEPackage(SchemaTablePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSchemaTablePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SchemaTablePackageImpl theSchemaTablePackage = registeredSchemaTablePackage instanceof SchemaTablePackageImpl ? (SchemaTablePackageImpl)registeredSchemaTablePackage : new SchemaTablePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AlgorithmeTablePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSchemaTablePackage.createPackageContents();

		// Initialize created meta-data
		theSchemaTablePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSchemaTablePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchemaTablePackage.eNS_URI, theSchemaTablePackage);
		return theSchemaTablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchemaDeTable() {
		return schemaDeTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaDeTable_Nom() {
		return (EAttribute)schemaDeTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaDeTable_Colonnes() {
		return (EReference)schemaDeTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaDeTable_ColonneLignes() {
		return (EReference)schemaDeTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonne() {
		return colonneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonne_Schema() {
		return (EReference)colonneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_Nom() {
		return (EAttribute)colonneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_Identifiant() {
		return (EAttribute)colonneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_TypeDonnees() {
		return (EAttribute)colonneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonne_Contraintes() {
		return (EReference)colonneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonneBrute() {
		return colonneBruteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonneCalculee() {
		return colonneCalculeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonneCalculee_Algorithme() {
		return (EReference)colonneCalculeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonneCalculee_IdentifiantsColonnesEntree() {
		return (EAttribute)colonneCalculeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonneCalculee_SchemasEntree() {
		return (EReference)colonneCalculeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonneEtrangere() {
		return colonneEtrangereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonneEtrangere_NomColonneEtrangere() {
		return (EAttribute)colonneEtrangereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonneEtrangere_SchemaEntree() {
		return (EReference)colonneEtrangereEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaTableFactory getSchemaTableFactory() {
		return (SchemaTableFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		schemaDeTableEClass = createEClass(SCHEMA_DE_TABLE);
		createEAttribute(schemaDeTableEClass, SCHEMA_DE_TABLE__NOM);
		createEReference(schemaDeTableEClass, SCHEMA_DE_TABLE__COLONNES);
		createEReference(schemaDeTableEClass, SCHEMA_DE_TABLE__COLONNE_LIGNES);

		colonneEClass = createEClass(COLONNE);
		createEAttribute(colonneEClass, COLONNE__NOM);
		createEAttribute(colonneEClass, COLONNE__IDENTIFIANT);
		createEAttribute(colonneEClass, COLONNE__TYPE_DONNEES);
		createEReference(colonneEClass, COLONNE__CONTRAINTES);
		createEReference(colonneEClass, COLONNE__SCHEMA);

		colonneBruteEClass = createEClass(COLONNE_BRUTE);

		colonneCalculeeEClass = createEClass(COLONNE_CALCULEE);
		createEReference(colonneCalculeeEClass, COLONNE_CALCULEE__ALGORITHME);
		createEAttribute(colonneCalculeeEClass, COLONNE_CALCULEE__IDENTIFIANTS_COLONNES_ENTREE);
		createEReference(colonneCalculeeEClass, COLONNE_CALCULEE__SCHEMAS_ENTREE);

		colonneEtrangereEClass = createEClass(COLONNE_ETRANGERE);
		createEAttribute(colonneEtrangereEClass, COLONNE_ETRANGERE__NOM_COLONNE_ETRANGERE);
		createEReference(colonneEtrangereEClass, COLONNE_ETRANGERE__SCHEMA_ENTREE);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AlgorithmeTablePackage theAlgorithmeTablePackage = (AlgorithmeTablePackage)EPackage.Registry.INSTANCE.getEPackage(AlgorithmeTablePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		colonneBruteEClass.getESuperTypes().add(this.getColonne());
		colonneCalculeeEClass.getESuperTypes().add(this.getColonne());
		colonneEtrangereEClass.getESuperTypes().add(this.getColonne());

		// Initialize classes, features, and operations; add parameters
		initEClass(schemaDeTableEClass, SchemaDeTable.class, "SchemaDeTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchemaDeTable_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, SchemaDeTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaDeTable_Colonnes(), this.getColonne(), this.getColonne_Schema(), "colonnes", null, 1, -1, SchemaDeTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaDeTable_ColonneLignes(), this.getColonne(), null, "colonneLignes", null, 1, 1, SchemaDeTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneEClass, Colonne.class, "Colonne", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColonne_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonne_Identifiant(), ecorePackage.getEString(), "identifiant", null, 1, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonne_TypeDonnees(), theAlgorithmeTablePackage.getTypeDonnees(), "typeDonnees", "Flottant", 1, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonne_Contraintes(), theAlgorithmeTablePackage.getAlgorithme(), null, "contraintes", null, 0, -1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonne_Schema(), this.getSchemaDeTable(), this.getSchemaDeTable_Colonnes(), "schema", null, 1, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneBruteEClass, ColonneBrute.class, "ColonneBrute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(colonneCalculeeEClass, ColonneCalculee.class, "ColonneCalculee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColonneCalculee_Algorithme(), theAlgorithmeTablePackage.getAlgorithme(), null, "algorithme", null, 1, 1, ColonneCalculee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonneCalculee_IdentifiantsColonnesEntree(), ecorePackage.getEString(), "identifiantsColonnesEntree", null, 0, -1, ColonneCalculee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonneCalculee_SchemasEntree(), this.getSchemaDeTable(), null, "schemasEntree", null, 0, -1, ColonneCalculee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneEtrangereEClass, ColonneEtrangere.class, "ColonneEtrangere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColonneEtrangere_NomColonneEtrangere(), ecorePackage.getEString(), "nomColonneEtrangere", null, 1, 1, ColonneEtrangere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonneEtrangere_SchemaEntree(), this.getSchemaDeTable(), null, "schemaEntree", null, 1, 1, ColonneEtrangere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SchemaTablePackageImpl
