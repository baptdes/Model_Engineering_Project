/**
 */
package script;

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
 * @see script.ScriptFactory
 * @model kind="package"
 * @generated
 */
public interface ScriptPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "script";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/script";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "script";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScriptPackage eINSTANCE = script.impl.ScriptPackageImpl.init();

	/**
	 * The meta object id for the '{@link script.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.ScriptImpl
	 * @see script.impl.ScriptPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__ARGUMENTS = 1;

	/**
	 * The feature id for the '<em><b>Resultat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__RESULTAT = 2;

	/**
	 * The feature id for the '<em><b>Blocs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__BLOCS = 3;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link script.Bloc <em>Bloc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.Bloc
	 * @see script.impl.ScriptPackageImpl#getBloc()
	 * @generated
	 */
	int BLOC = 2;

	/**
	 * The meta object id for the '{@link script.impl.SortieImpl <em>Sortie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.SortieImpl
	 * @see script.impl.ScriptPackageImpl#getSortie()
	 * @generated
	 */
	int SORTIE = 3;

	/**
	 * The meta object id for the '{@link script.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.ArgumentImpl
	 * @see script.impl.ScriptPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 4;

	/**
	 * The meta object id for the '{@link script.impl.ResultatImpl <em>Resultat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.ResultatImpl
	 * @see script.impl.ScriptPackageImpl#getResultat()
	 * @generated
	 */
	int RESULTAT = 1;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT__ENTREE = 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT__SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT__NOM = 2;

	/**
	 * The number of structural features of the '<em>Resultat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resultat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC__SCRIPT = 0;

	/**
	 * The number of structural features of the '<em>Bloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__ENTREE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__NOM = 1;

	/**
	 * The number of structural features of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__SORTIE = 1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__SCRIPT = 2;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link script.impl.EntreeImpl <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.EntreeImpl
	 * @see script.impl.ScriptPackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 8;

	/**
	 * The meta object id for the '{@link script.impl.ConstanteImpl <em>Constante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.ConstanteImpl
	 * @see script.impl.ScriptPackageImpl#getConstante()
	 * @generated
	 */
	int CONSTANTE = 5;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__SCRIPT = BLOC__SCRIPT;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__VALEUR = BLOC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__SORTIE = BLOC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_FEATURE_COUNT = BLOC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_OPERATION_COUNT = BLOC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.FonctionUnaireImpl <em>Fonction Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.FonctionUnaireImpl
	 * @see script.impl.ScriptPackageImpl#getFonctionUnaire()
	 * @generated
	 */
	int FONCTION_UNAIRE = 6;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_UNAIRE__SCRIPT = BLOC__SCRIPT;

	/**
	 * The feature id for the '<em><b>Fonction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_UNAIRE__FONCTION = BLOC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_UNAIRE__ENTREE = BLOC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_UNAIRE__SORTIE = BLOC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fonction Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_UNAIRE_FEATURE_COUNT = BLOC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Fonction Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_UNAIRE_OPERATION_COUNT = BLOC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.OperationBinaireImpl <em>Operation Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.OperationBinaireImpl
	 * @see script.impl.ScriptPackageImpl#getOperationBinaire()
	 * @generated
	 */
	int OPERATION_BINAIRE = 7;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE__SCRIPT = BLOC__SCRIPT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE__OPERATION = BLOC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE__ENTREE = BLOC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE__SORTIE = BLOC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE_FEATURE_COUNT = BLOC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE_OPERATION_COUNT = BLOC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__SORTIE = 0;

	/**
	 * The number of structural features of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link script.TypeFonctionUnaire <em>Type Fonction Unaire</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.TypeFonctionUnaire
	 * @see script.impl.ScriptPackageImpl#getTypeFonctionUnaire()
	 * @generated
	 */
	int TYPE_FONCTION_UNAIRE = 9;

	/**
	 * The meta object id for the '{@link script.TypeOperationBinaire <em>Type Operation Binaire</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.TypeOperationBinaire
	 * @see script.impl.ScriptPackageImpl#getTypeOperationBinaire()
	 * @generated
	 */
	int TYPE_OPERATION_BINAIRE = 10;

	/**
	 * Returns the meta object for class '{@link script.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see script.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the attribute '{@link script.Script#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see script.Script#getNom()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link script.Script#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see script.Script#getArguments()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link script.Script#getResultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resultat</em>'.
	 * @see script.Script#getResultat()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Resultat();

	/**
	 * Returns the meta object for the containment reference list '{@link script.Script#getBlocs <em>Blocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocs</em>'.
	 * @see script.Script#getBlocs()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Blocs();

	/**
	 * Returns the meta object for class '{@link script.Resultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resultat</em>'.
	 * @see script.Resultat
	 * @generated
	 */
	EClass getResultat();

	/**
	 * Returns the meta object for the containment reference '{@link script.Resultat#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entree</em>'.
	 * @see script.Resultat#getEntree()
	 * @see #getResultat()
	 * @generated
	 */
	EReference getResultat_Entree();

	/**
	 * Returns the meta object for the container reference '{@link script.Resultat#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Script</em>'.
	 * @see script.Resultat#getScript()
	 * @see #getResultat()
	 * @generated
	 */
	EReference getResultat_Script();

	/**
	 * Returns the meta object for the attribute '{@link script.Resultat#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see script.Resultat#getNom()
	 * @see #getResultat()
	 * @generated
	 */
	EAttribute getResultat_Nom();

	/**
	 * Returns the meta object for class '{@link script.Bloc <em>Bloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloc</em>'.
	 * @see script.Bloc
	 * @generated
	 */
	EClass getBloc();

	/**
	 * Returns the meta object for the container reference '{@link script.Bloc#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Script</em>'.
	 * @see script.Bloc#getScript()
	 * @see #getBloc()
	 * @generated
	 */
	EReference getBloc_Script();

	/**
	 * Returns the meta object for class '{@link script.Sortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sortie</em>'.
	 * @see script.Sortie
	 * @generated
	 */
	EClass getSortie();

	/**
	 * Returns the meta object for the reference list '{@link script.Sortie#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entree</em>'.
	 * @see script.Sortie#getEntree()
	 * @see #getSortie()
	 * @generated
	 */
	EReference getSortie_Entree();

	/**
	 * Returns the meta object for the attribute '{@link script.Sortie#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see script.Sortie#getNom()
	 * @see #getSortie()
	 * @generated
	 */
	EAttribute getSortie_Nom();

	/**
	 * Returns the meta object for class '{@link script.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see script.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link script.Argument#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see script.Argument#getNom()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Nom();

	/**
	 * Returns the meta object for the containment reference '{@link script.Argument#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sortie</em>'.
	 * @see script.Argument#getSortie()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Sortie();

	/**
	 * Returns the meta object for the container reference '{@link script.Argument#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Script</em>'.
	 * @see script.Argument#getScript()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Script();

	/**
	 * Returns the meta object for class '{@link script.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree</em>'.
	 * @see script.Entree
	 * @generated
	 */
	EClass getEntree();

	/**
	 * Returns the meta object for the reference '{@link script.Entree#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sortie</em>'.
	 * @see script.Entree#getSortie()
	 * @see #getEntree()
	 * @generated
	 */
	EReference getEntree_Sortie();

	/**
	 * Returns the meta object for class '{@link script.Constante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constante</em>'.
	 * @see script.Constante
	 * @generated
	 */
	EClass getConstante();

	/**
	 * Returns the meta object for the attribute '{@link script.Constante#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see script.Constante#getValeur()
	 * @see #getConstante()
	 * @generated
	 */
	EAttribute getConstante_Valeur();

	/**
	 * Returns the meta object for the containment reference '{@link script.Constante#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sortie</em>'.
	 * @see script.Constante#getSortie()
	 * @see #getConstante()
	 * @generated
	 */
	EReference getConstante_Sortie();

	/**
	 * Returns the meta object for class '{@link script.FonctionUnaire <em>Fonction Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fonction Unaire</em>'.
	 * @see script.FonctionUnaire
	 * @generated
	 */
	EClass getFonctionUnaire();

	/**
	 * Returns the meta object for the attribute '{@link script.FonctionUnaire#getFonction <em>Fonction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fonction</em>'.
	 * @see script.FonctionUnaire#getFonction()
	 * @see #getFonctionUnaire()
	 * @generated
	 */
	EAttribute getFonctionUnaire_Fonction();

	/**
	 * Returns the meta object for the containment reference '{@link script.FonctionUnaire#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entree</em>'.
	 * @see script.FonctionUnaire#getEntree()
	 * @see #getFonctionUnaire()
	 * @generated
	 */
	EReference getFonctionUnaire_Entree();

	/**
	 * Returns the meta object for the containment reference '{@link script.FonctionUnaire#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sortie</em>'.
	 * @see script.FonctionUnaire#getSortie()
	 * @see #getFonctionUnaire()
	 * @generated
	 */
	EReference getFonctionUnaire_Sortie();

	/**
	 * Returns the meta object for class '{@link script.OperationBinaire <em>Operation Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Binaire</em>'.
	 * @see script.OperationBinaire
	 * @generated
	 */
	EClass getOperationBinaire();

	/**
	 * Returns the meta object for the attribute '{@link script.OperationBinaire#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see script.OperationBinaire#getOperation()
	 * @see #getOperationBinaire()
	 * @generated
	 */
	EAttribute getOperationBinaire_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link script.OperationBinaire#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entree</em>'.
	 * @see script.OperationBinaire#getEntree()
	 * @see #getOperationBinaire()
	 * @generated
	 */
	EReference getOperationBinaire_Entree();

	/**
	 * Returns the meta object for the containment reference '{@link script.OperationBinaire#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sortie</em>'.
	 * @see script.OperationBinaire#getSortie()
	 * @see #getOperationBinaire()
	 * @generated
	 */
	EReference getOperationBinaire_Sortie();

	/**
	 * Returns the meta object for enum '{@link script.TypeFonctionUnaire <em>Type Fonction Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Fonction Unaire</em>'.
	 * @see script.TypeFonctionUnaire
	 * @generated
	 */
	EEnum getTypeFonctionUnaire();

	/**
	 * Returns the meta object for enum '{@link script.TypeOperationBinaire <em>Type Operation Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Operation Binaire</em>'.
	 * @see script.TypeOperationBinaire
	 * @generated
	 */
	EEnum getTypeOperationBinaire();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScriptFactory getScriptFactory();

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
		 * The meta object literal for the '{@link script.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.ScriptImpl
		 * @see script.impl.ScriptPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__NOM = eINSTANCE.getScript_Nom();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__ARGUMENTS = eINSTANCE.getScript_Arguments();

		/**
		 * The meta object literal for the '<em><b>Resultat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__RESULTAT = eINSTANCE.getScript_Resultat();

		/**
		 * The meta object literal for the '<em><b>Blocs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__BLOCS = eINSTANCE.getScript_Blocs();

		/**
		 * The meta object literal for the '{@link script.impl.ResultatImpl <em>Resultat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.ResultatImpl
		 * @see script.impl.ScriptPackageImpl#getResultat()
		 * @generated
		 */
		EClass RESULTAT = eINSTANCE.getResultat();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTAT__ENTREE = eINSTANCE.getResultat_Entree();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTAT__SCRIPT = eINSTANCE.getResultat_Script();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTAT__NOM = eINSTANCE.getResultat_Nom();

		/**
		 * The meta object literal for the '{@link script.Bloc <em>Bloc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.Bloc
		 * @see script.impl.ScriptPackageImpl#getBloc()
		 * @generated
		 */
		EClass BLOC = eINSTANCE.getBloc();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOC__SCRIPT = eINSTANCE.getBloc_Script();

		/**
		 * The meta object literal for the '{@link script.impl.SortieImpl <em>Sortie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.SortieImpl
		 * @see script.impl.ScriptPackageImpl#getSortie()
		 * @generated
		 */
		EClass SORTIE = eINSTANCE.getSortie();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTIE__ENTREE = eINSTANCE.getSortie_Entree();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTIE__NOM = eINSTANCE.getSortie_Nom();

		/**
		 * The meta object literal for the '{@link script.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.ArgumentImpl
		 * @see script.impl.ScriptPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NOM = eINSTANCE.getArgument_Nom();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__SORTIE = eINSTANCE.getArgument_Sortie();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__SCRIPT = eINSTANCE.getArgument_Script();

		/**
		 * The meta object literal for the '{@link script.impl.EntreeImpl <em>Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.EntreeImpl
		 * @see script.impl.ScriptPackageImpl#getEntree()
		 * @generated
		 */
		EClass ENTREE = eINSTANCE.getEntree();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTREE__SORTIE = eINSTANCE.getEntree_Sortie();

		/**
		 * The meta object literal for the '{@link script.impl.ConstanteImpl <em>Constante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.ConstanteImpl
		 * @see script.impl.ScriptPackageImpl#getConstante()
		 * @generated
		 */
		EClass CONSTANTE = eINSTANCE.getConstante();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTE__VALEUR = eINSTANCE.getConstante_Valeur();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANTE__SORTIE = eINSTANCE.getConstante_Sortie();

		/**
		 * The meta object literal for the '{@link script.impl.FonctionUnaireImpl <em>Fonction Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.FonctionUnaireImpl
		 * @see script.impl.ScriptPackageImpl#getFonctionUnaire()
		 * @generated
		 */
		EClass FONCTION_UNAIRE = eINSTANCE.getFonctionUnaire();

		/**
		 * The meta object literal for the '<em><b>Fonction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONCTION_UNAIRE__FONCTION = eINSTANCE.getFonctionUnaire_Fonction();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FONCTION_UNAIRE__ENTREE = eINSTANCE.getFonctionUnaire_Entree();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FONCTION_UNAIRE__SORTIE = eINSTANCE.getFonctionUnaire_Sortie();

		/**
		 * The meta object literal for the '{@link script.impl.OperationBinaireImpl <em>Operation Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.OperationBinaireImpl
		 * @see script.impl.ScriptPackageImpl#getOperationBinaire()
		 * @generated
		 */
		EClass OPERATION_BINAIRE = eINSTANCE.getOperationBinaire();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_BINAIRE__OPERATION = eINSTANCE.getOperationBinaire_Operation();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BINAIRE__ENTREE = eINSTANCE.getOperationBinaire_Entree();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BINAIRE__SORTIE = eINSTANCE.getOperationBinaire_Sortie();

		/**
		 * The meta object literal for the '{@link script.TypeFonctionUnaire <em>Type Fonction Unaire</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.TypeFonctionUnaire
		 * @see script.impl.ScriptPackageImpl#getTypeFonctionUnaire()
		 * @generated
		 */
		EEnum TYPE_FONCTION_UNAIRE = eINSTANCE.getTypeFonctionUnaire();

		/**
		 * The meta object literal for the '{@link script.TypeOperationBinaire <em>Type Operation Binaire</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.TypeOperationBinaire
		 * @see script.impl.ScriptPackageImpl#getTypeOperationBinaire()
		 * @generated
		 */
		EEnum TYPE_OPERATION_BINAIRE = eINSTANCE.getTypeOperationBinaire();

	}

} //ScriptPackage
