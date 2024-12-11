/**
 */
package SchemaTable;

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
 * @see SchemaTable.SchemaTableFactory
 * @model kind="package"
 * @generated
 */
public interface SchemaTablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SchemaTable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schematable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "schematable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchemaTablePackage eINSTANCE = SchemaTable.impl.SchemaTablePackageImpl.init();

	/**
	 * The meta object id for the '{@link SchemaTable.impl.SchemaDeTableImpl <em>Schema De Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SchemaTable.impl.SchemaDeTableImpl
	 * @see SchemaTable.impl.SchemaTablePackageImpl#getSchemaDeTable()
	 * @generated
	 */
	int SCHEMA_DE_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DE_TABLE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Colonnes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DE_TABLE__COLONNES = 1;

	/**
	 * The feature id for the '<em><b>Colonne Identifiants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DE_TABLE__COLONNE_IDENTIFIANTS = 2;

	/**
	 * The number of structural features of the '<em>Schema De Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DE_TABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Schema De Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DE_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SchemaTable.impl.ColonneImpl <em>Colonne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SchemaTable.impl.ColonneImpl
	 * @see SchemaTable.impl.SchemaTablePackageImpl#getColonne()
	 * @generated
	 */
	int COLONNE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Identifiant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__IDENTIFIANT = 2;

	/**
	 * The feature id for the '<em><b>Type Donnees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__TYPE_DONNEES = 3;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__CONTRAINTES = 4;

	/**
	 * The number of structural features of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SchemaTable.impl.ColonneBruteImpl <em>Colonne Brute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SchemaTable.impl.ColonneBruteImpl
	 * @see SchemaTable.impl.SchemaTablePackageImpl#getColonneBrute()
	 * @generated
	 */
	int COLONNE_BRUTE = 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_BRUTE__SCHEMA = COLONNE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_BRUTE__NOM = COLONNE__NOM;

	/**
	 * The feature id for the '<em><b>Identifiant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_BRUTE__IDENTIFIANT = COLONNE__IDENTIFIANT;

	/**
	 * The feature id for the '<em><b>Type Donnees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_BRUTE__TYPE_DONNEES = COLONNE__TYPE_DONNEES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_BRUTE__CONTRAINTES = COLONNE__CONTRAINTES;

	/**
	 * The number of structural features of the '<em>Colonne Brute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_BRUTE_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Colonne Brute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_BRUTE_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SchemaTable.impl.ColonneCalculeeImpl <em>Colonne Calculee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SchemaTable.impl.ColonneCalculeeImpl
	 * @see SchemaTable.impl.SchemaTablePackageImpl#getColonneCalculee()
	 * @generated
	 */
	int COLONNE_CALCULEE = 3;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_CALCULEE__SCHEMA = COLONNE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_CALCULEE__NOM = COLONNE__NOM;

	/**
	 * The feature id for the '<em><b>Identifiant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_CALCULEE__IDENTIFIANT = COLONNE__IDENTIFIANT;

	/**
	 * The feature id for the '<em><b>Type Donnees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_CALCULEE__TYPE_DONNEES = COLONNE__TYPE_DONNEES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_CALCULEE__CONTRAINTES = COLONNE__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Algorithme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_CALCULEE__ALGORITHME = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifiants Colonnes Entree</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_CALCULEE__IDENTIFIANTS_COLONNES_ENTREE = COLONNE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Colonne Calculee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_CALCULEE_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Colonne Calculee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_CALCULEE_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SchemaTable.impl.ColonneEtrangereImpl <em>Colonne Etrangere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SchemaTable.impl.ColonneEtrangereImpl
	 * @see SchemaTable.impl.SchemaTablePackageImpl#getColonneEtrangere()
	 * @generated
	 */
	int COLONNE_ETRANGERE = 4;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ETRANGERE__SCHEMA = COLONNE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ETRANGERE__NOM = COLONNE__NOM;

	/**
	 * The feature id for the '<em><b>Identifiant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ETRANGERE__IDENTIFIANT = COLONNE__IDENTIFIANT;

	/**
	 * The feature id for the '<em><b>Type Donnees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ETRANGERE__TYPE_DONNEES = COLONNE__TYPE_DONNEES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ETRANGERE__CONTRAINTES = COLONNE__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Identifiant Colonne Etrangere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ETRANGERE__IDENTIFIANT_COLONNE_ETRANGERE = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Colonne Etrangere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ETRANGERE_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Colonne Etrangere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ETRANGERE_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SchemaTable.impl.AlgorithmeImpl <em>Algorithme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SchemaTable.impl.AlgorithmeImpl
	 * @see SchemaTable.impl.SchemaTablePackageImpl#getAlgorithme()
	 * @generated
	 */
	int ALGORITHME = 5;

	/**
	 * The number of structural features of the '<em>Algorithme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Algorithme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SchemaTable.impl.ContrainteImpl <em>Contrainte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SchemaTable.impl.ContrainteImpl
	 * @see SchemaTable.impl.SchemaTablePackageImpl#getContrainte()
	 * @generated
	 */
	int CONTRAINTE = 6;

	/**
	 * The feature id for the '<em><b>Colonnes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE__COLONNES = 0;

	/**
	 * The feature id for the '<em><b>Algorithme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE__ALGORITHME = 1;

	/**
	 * The number of structural features of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SchemaTable.TypeDonnee <em>Type Donnee</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SchemaTable.TypeDonnee
	 * @see SchemaTable.impl.SchemaTablePackageImpl#getTypeDonnee()
	 * @generated
	 */
	int TYPE_DONNEE = 7;


	/**
	 * Returns the meta object for class '{@link SchemaTable.SchemaDeTable <em>Schema De Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema De Table</em>'.
	 * @see SchemaTable.SchemaDeTable
	 * @generated
	 */
	EClass getSchemaDeTable();

	/**
	 * Returns the meta object for the attribute '{@link SchemaTable.SchemaDeTable#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see SchemaTable.SchemaDeTable#getNom()
	 * @see #getSchemaDeTable()
	 * @generated
	 */
	EAttribute getSchemaDeTable_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link SchemaTable.SchemaDeTable#getColonnes <em>Colonnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colonnes</em>'.
	 * @see SchemaTable.SchemaDeTable#getColonnes()
	 * @see #getSchemaDeTable()
	 * @generated
	 */
	EReference getSchemaDeTable_Colonnes();

	/**
	 * Returns the meta object for the reference '{@link SchemaTable.SchemaDeTable#getColonneIdentifiants <em>Colonne Identifiants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colonne Identifiants</em>'.
	 * @see SchemaTable.SchemaDeTable#getColonneIdentifiants()
	 * @see #getSchemaDeTable()
	 * @generated
	 */
	EReference getSchemaDeTable_ColonneIdentifiants();

	/**
	 * Returns the meta object for class '{@link SchemaTable.Colonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne</em>'.
	 * @see SchemaTable.Colonne
	 * @generated
	 */
	EClass getColonne();

	/**
	 * Returns the meta object for the container reference '{@link SchemaTable.Colonne#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see SchemaTable.Colonne#getSchema()
	 * @see #getColonne()
	 * @generated
	 */
	EReference getColonne_Schema();

	/**
	 * Returns the meta object for the attribute '{@link SchemaTable.Colonne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see SchemaTable.Colonne#getNom()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Nom();

	/**
	 * Returns the meta object for the attribute '{@link SchemaTable.Colonne#getIdentifiant <em>Identifiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifiant</em>'.
	 * @see SchemaTable.Colonne#getIdentifiant()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Identifiant();

	/**
	 * Returns the meta object for the attribute '{@link SchemaTable.Colonne#getTypeDonnees <em>Type Donnees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Donnees</em>'.
	 * @see SchemaTable.Colonne#getTypeDonnees()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_TypeDonnees();

	/**
	 * Returns the meta object for the reference list '{@link SchemaTable.Colonne#getContraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contraintes</em>'.
	 * @see SchemaTable.Colonne#getContraintes()
	 * @see #getColonne()
	 * @generated
	 */
	EReference getColonne_Contraintes();

	/**
	 * Returns the meta object for class '{@link SchemaTable.ColonneBrute <em>Colonne Brute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne Brute</em>'.
	 * @see SchemaTable.ColonneBrute
	 * @generated
	 */
	EClass getColonneBrute();

	/**
	 * Returns the meta object for class '{@link SchemaTable.ColonneCalculee <em>Colonne Calculee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne Calculee</em>'.
	 * @see SchemaTable.ColonneCalculee
	 * @generated
	 */
	EClass getColonneCalculee();

	/**
	 * Returns the meta object for the reference '{@link SchemaTable.ColonneCalculee#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Algorithme</em>'.
	 * @see SchemaTable.ColonneCalculee#getAlgorithme()
	 * @see #getColonneCalculee()
	 * @generated
	 */
	EReference getColonneCalculee_Algorithme();

	/**
	 * Returns the meta object for the attribute list '{@link SchemaTable.ColonneCalculee#getIdentifiantsColonnesEntree <em>Identifiants Colonnes Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifiants Colonnes Entree</em>'.
	 * @see SchemaTable.ColonneCalculee#getIdentifiantsColonnesEntree()
	 * @see #getColonneCalculee()
	 * @generated
	 */
	EAttribute getColonneCalculee_IdentifiantsColonnesEntree();

	/**
	 * Returns the meta object for class '{@link SchemaTable.ColonneEtrangere <em>Colonne Etrangere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne Etrangere</em>'.
	 * @see SchemaTable.ColonneEtrangere
	 * @generated
	 */
	EClass getColonneEtrangere();

	/**
	 * Returns the meta object for the attribute '{@link SchemaTable.ColonneEtrangere#getIdentifiantColonneEtrangere <em>Identifiant Colonne Etrangere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifiant Colonne Etrangere</em>'.
	 * @see SchemaTable.ColonneEtrangere#getIdentifiantColonneEtrangere()
	 * @see #getColonneEtrangere()
	 * @generated
	 */
	EAttribute getColonneEtrangere_IdentifiantColonneEtrangere();

	/**
	 * Returns the meta object for class '{@link SchemaTable.Algorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithme</em>'.
	 * @see SchemaTable.Algorithme
	 * @generated
	 */
	EClass getAlgorithme();

	/**
	 * Returns the meta object for class '{@link SchemaTable.Contrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte</em>'.
	 * @see SchemaTable.Contrainte
	 * @generated
	 */
	EClass getContrainte();

	/**
	 * Returns the meta object for the reference list '{@link SchemaTable.Contrainte#getColonnes <em>Colonnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Colonnes</em>'.
	 * @see SchemaTable.Contrainte#getColonnes()
	 * @see #getContrainte()
	 * @generated
	 */
	EReference getContrainte_Colonnes();

	/**
	 * Returns the meta object for the reference '{@link SchemaTable.Contrainte#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Algorithme</em>'.
	 * @see SchemaTable.Contrainte#getAlgorithme()
	 * @see #getContrainte()
	 * @generated
	 */
	EReference getContrainte_Algorithme();

	/**
	 * Returns the meta object for enum '{@link SchemaTable.TypeDonnee <em>Type Donnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Donnee</em>'.
	 * @see SchemaTable.TypeDonnee
	 * @generated
	 */
	EEnum getTypeDonnee();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchemaTableFactory getSchemaTableFactory();

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
		 * The meta object literal for the '{@link SchemaTable.impl.SchemaDeTableImpl <em>Schema De Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SchemaTable.impl.SchemaDeTableImpl
		 * @see SchemaTable.impl.SchemaTablePackageImpl#getSchemaDeTable()
		 * @generated
		 */
		EClass SCHEMA_DE_TABLE = eINSTANCE.getSchemaDeTable();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_DE_TABLE__NOM = eINSTANCE.getSchemaDeTable_Nom();

		/**
		 * The meta object literal for the '<em><b>Colonnes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_DE_TABLE__COLONNES = eINSTANCE.getSchemaDeTable_Colonnes();

		/**
		 * The meta object literal for the '<em><b>Colonne Identifiants</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_DE_TABLE__COLONNE_IDENTIFIANTS = eINSTANCE.getSchemaDeTable_ColonneIdentifiants();

		/**
		 * The meta object literal for the '{@link SchemaTable.impl.ColonneImpl <em>Colonne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SchemaTable.impl.ColonneImpl
		 * @see SchemaTable.impl.SchemaTablePackageImpl#getColonne()
		 * @generated
		 */
		EClass COLONNE = eINSTANCE.getColonne();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE__SCHEMA = eINSTANCE.getColonne_Schema();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__NOM = eINSTANCE.getColonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Identifiant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__IDENTIFIANT = eINSTANCE.getColonne_Identifiant();

		/**
		 * The meta object literal for the '<em><b>Type Donnees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__TYPE_DONNEES = eINSTANCE.getColonne_TypeDonnees();

		/**
		 * The meta object literal for the '<em><b>Contraintes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE__CONTRAINTES = eINSTANCE.getColonne_Contraintes();

		/**
		 * The meta object literal for the '{@link SchemaTable.impl.ColonneBruteImpl <em>Colonne Brute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SchemaTable.impl.ColonneBruteImpl
		 * @see SchemaTable.impl.SchemaTablePackageImpl#getColonneBrute()
		 * @generated
		 */
		EClass COLONNE_BRUTE = eINSTANCE.getColonneBrute();

		/**
		 * The meta object literal for the '{@link SchemaTable.impl.ColonneCalculeeImpl <em>Colonne Calculee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SchemaTable.impl.ColonneCalculeeImpl
		 * @see SchemaTable.impl.SchemaTablePackageImpl#getColonneCalculee()
		 * @generated
		 */
		EClass COLONNE_CALCULEE = eINSTANCE.getColonneCalculee();

		/**
		 * The meta object literal for the '<em><b>Algorithme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE_CALCULEE__ALGORITHME = eINSTANCE.getColonneCalculee_Algorithme();

		/**
		 * The meta object literal for the '<em><b>Identifiants Colonnes Entree</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE_CALCULEE__IDENTIFIANTS_COLONNES_ENTREE = eINSTANCE.getColonneCalculee_IdentifiantsColonnesEntree();

		/**
		 * The meta object literal for the '{@link SchemaTable.impl.ColonneEtrangereImpl <em>Colonne Etrangere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SchemaTable.impl.ColonneEtrangereImpl
		 * @see SchemaTable.impl.SchemaTablePackageImpl#getColonneEtrangere()
		 * @generated
		 */
		EClass COLONNE_ETRANGERE = eINSTANCE.getColonneEtrangere();

		/**
		 * The meta object literal for the '<em><b>Identifiant Colonne Etrangere</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE_ETRANGERE__IDENTIFIANT_COLONNE_ETRANGERE = eINSTANCE.getColonneEtrangere_IdentifiantColonneEtrangere();

		/**
		 * The meta object literal for the '{@link SchemaTable.impl.AlgorithmeImpl <em>Algorithme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SchemaTable.impl.AlgorithmeImpl
		 * @see SchemaTable.impl.SchemaTablePackageImpl#getAlgorithme()
		 * @generated
		 */
		EClass ALGORITHME = eINSTANCE.getAlgorithme();

		/**
		 * The meta object literal for the '{@link SchemaTable.impl.ContrainteImpl <em>Contrainte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SchemaTable.impl.ContrainteImpl
		 * @see SchemaTable.impl.SchemaTablePackageImpl#getContrainte()
		 * @generated
		 */
		EClass CONTRAINTE = eINSTANCE.getContrainte();

		/**
		 * The meta object literal for the '<em><b>Colonnes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRAINTE__COLONNES = eINSTANCE.getContrainte_Colonnes();

		/**
		 * The meta object literal for the '<em><b>Algorithme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRAINTE__ALGORITHME = eINSTANCE.getContrainte_Algorithme();

		/**
		 * The meta object literal for the '{@link SchemaTable.TypeDonnee <em>Type Donnee</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SchemaTable.TypeDonnee
		 * @see SchemaTable.impl.SchemaTablePackageImpl#getTypeDonnee()
		 * @generated
		 */
		EEnum TYPE_DONNEE = eINSTANCE.getTypeDonnee();

	}

} //SchemaTablePackage
