/**
 */
package script.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import script.Bloc;
import script.BlocAvecSortie;
import script.BlocSansEntree;
import script.Constante;
import script.Entree;
import script.FonctionUnaire;
import script.OperationBinaire;
import script.Resultat;
import script.Script;
import script.ScriptFactory;
import script.ScriptPackage;
import script.TypeFonctionUnaire;
import script.TypeOperationBinaire;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptPackageImpl extends EPackageImpl implements ScriptPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blocAvecSortieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blocSansEntreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fonctionUnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationBinaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeFonctionUnaireEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeOperationBinaireEEnum = null;

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
	 * @see script.ScriptPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScriptPackageImpl() {
		super(eNS_URI, ScriptFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ScriptPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScriptPackage init() {
		if (isInited)
			return (ScriptPackage) EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredScriptPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ScriptPackageImpl theScriptPackage = registeredScriptPackage instanceof ScriptPackageImpl
				? (ScriptPackageImpl) registeredScriptPackage
				: new ScriptPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theScriptPackage.createPackageContents();

		// Initialize created meta-data
		theScriptPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScriptPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScriptPackage.eNS_URI, theScriptPackage);
		return theScriptPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScript_Nom() {
		return (EAttribute) scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScript_Entrees() {
		return (EReference) scriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScript_Resultat() {
		return (EReference) scriptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScript_Blocs() {
		return (EReference) scriptEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultat() {
		return resultatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBloc() {
		return blocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBloc_Script() {
		return (EReference) blocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlocAvecSortie() {
		return blocAvecSortieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlocAvecSortie_Sortie() {
		return (EReference) blocAvecSortieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlocSansEntree() {
		return blocSansEntreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntree() {
		return entreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntree_Nom() {
		return (EAttribute) entreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstante() {
		return constanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstante_Valeur() {
		return (EAttribute) constanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFonctionUnaire() {
		return fonctionUnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFonctionUnaire_Fonction() {
		return (EAttribute) fonctionUnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFonctionUnaire_Entree() {
		return (EReference) fonctionUnaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationBinaire() {
		return operationBinaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationBinaire_Operation() {
		return (EAttribute) operationBinaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationBinaire_Entrees() {
		return (EReference) operationBinaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeFonctionUnaire() {
		return typeFonctionUnaireEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeOperationBinaire() {
		return typeOperationBinaireEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScriptFactory getScriptFactory() {
		return (ScriptFactory) getEFactoryInstance();
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
		scriptEClass = createEClass(SCRIPT);
		createEAttribute(scriptEClass, SCRIPT__NOM);
		createEReference(scriptEClass, SCRIPT__ENTREES);
		createEReference(scriptEClass, SCRIPT__RESULTAT);
		createEReference(scriptEClass, SCRIPT__BLOCS);

		resultatEClass = createEClass(RESULTAT);

		blocEClass = createEClass(BLOC);
		createEReference(blocEClass, BLOC__SCRIPT);

		blocAvecSortieEClass = createEClass(BLOC_AVEC_SORTIE);
		createEReference(blocAvecSortieEClass, BLOC_AVEC_SORTIE__SORTIE);

		blocSansEntreeEClass = createEClass(BLOC_SANS_ENTREE);

		entreeEClass = createEClass(ENTREE);
		createEAttribute(entreeEClass, ENTREE__NOM);

		constanteEClass = createEClass(CONSTANTE);
		createEAttribute(constanteEClass, CONSTANTE__VALEUR);

		fonctionUnaireEClass = createEClass(FONCTION_UNAIRE);
		createEAttribute(fonctionUnaireEClass, FONCTION_UNAIRE__FONCTION);
		createEReference(fonctionUnaireEClass, FONCTION_UNAIRE__ENTREE);

		operationBinaireEClass = createEClass(OPERATION_BINAIRE);
		createEAttribute(operationBinaireEClass, OPERATION_BINAIRE__OPERATION);
		createEReference(operationBinaireEClass, OPERATION_BINAIRE__ENTREES);

		// Create enums
		typeFonctionUnaireEEnum = createEEnum(TYPE_FONCTION_UNAIRE);
		typeOperationBinaireEEnum = createEEnum(TYPE_OPERATION_BINAIRE);
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
		resultatEClass.getESuperTypes().add(this.getBloc());
		blocAvecSortieEClass.getESuperTypes().add(this.getBloc());
		blocSansEntreeEClass.getESuperTypes().add(this.getBlocAvecSortie());
		entreeEClass.getESuperTypes().add(this.getBlocSansEntree());
		constanteEClass.getESuperTypes().add(this.getBlocSansEntree());
		fonctionUnaireEClass.getESuperTypes().add(this.getBlocAvecSortie());
		operationBinaireEClass.getESuperTypes().add(this.getBlocAvecSortie());

		// Initialize classes, features, and operations; add parameters
		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScript_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Script.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScript_Entrees(), this.getEntree(), null, "entrees", null, 0, -1, Script.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getScript_Resultat(), this.getResultat(), null, "resultat", null, 1, 1, Script.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScript_Blocs(), this.getBloc(), this.getBloc_Script(), "blocs", null, 0, -1, Script.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultatEClass, Resultat.class, "Resultat", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(blocEClass, Bloc.class, "Bloc", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBloc_Script(), this.getScript(), this.getScript_Blocs(), "script", null, 1, 1, Bloc.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blocAvecSortieEClass, BlocAvecSortie.class, "BlocAvecSortie", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlocAvecSortie_Sortie(), this.getBloc(), null, "sortie", null, 1, 1, BlocAvecSortie.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blocSansEntreeEClass, BlocSansEntree.class, "BlocSansEntree", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(entreeEClass, Entree.class, "Entree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntree_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Entree.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constanteEClass, Constante.class, "Constante", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstante_Valeur(), ecorePackage.getEFloat(), "valeur", null, 1, 1, Constante.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fonctionUnaireEClass, FonctionUnaire.class, "FonctionUnaire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFonctionUnaire_Fonction(), this.getTypeFonctionUnaire(), "fonction", null, 1, 1,
				FonctionUnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFonctionUnaire_Entree(), this.getBlocAvecSortie(), null, "entree", null, 1, 1,
				FonctionUnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationBinaireEClass, OperationBinaire.class, "OperationBinaire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationBinaire_Operation(), this.getTypeOperationBinaire(), "operation", null, 1, 1,
				OperationBinaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getOperationBinaire_Entrees(), this.getBlocAvecSortie(), null, "entrees", null, 2, 2,
				OperationBinaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeFonctionUnaireEEnum, TypeFonctionUnaire.class, "TypeFonctionUnaire");
		addEEnumLiteral(typeFonctionUnaireEEnum, TypeFonctionUnaire.EXPONENTIELLE);
		addEEnumLiteral(typeFonctionUnaireEEnum, TypeFonctionUnaire.COSINUS);
		addEEnumLiteral(typeFonctionUnaireEEnum, TypeFonctionUnaire.SINUS);
		addEEnumLiteral(typeFonctionUnaireEEnum, TypeFonctionUnaire.RACINE_CAREE);
		addEEnumLiteral(typeFonctionUnaireEEnum, TypeFonctionUnaire.INVERSE);
		addEEnumLiteral(typeFonctionUnaireEEnum, TypeFonctionUnaire.OPPOSE);

		initEEnum(typeOperationBinaireEEnum, TypeOperationBinaire.class, "TypeOperationBinaire");
		addEEnumLiteral(typeOperationBinaireEEnum, TypeOperationBinaire.ADDITION);
		addEEnumLiteral(typeOperationBinaireEEnum, TypeOperationBinaire.SOUSTRACTION);
		addEEnumLiteral(typeOperationBinaireEEnum, TypeOperationBinaire.MULTIPLICATION);
		addEEnumLiteral(typeOperationBinaireEEnum, TypeOperationBinaire.DIVISION);
		addEEnumLiteral(typeOperationBinaireEEnum, TypeOperationBinaire.MAXIMUM);
		addEEnumLiteral(typeOperationBinaireEEnum, TypeOperationBinaire.MINIMUM);

		// Create resource
		createResource(eNS_URI);
	}

} //ScriptPackageImpl
