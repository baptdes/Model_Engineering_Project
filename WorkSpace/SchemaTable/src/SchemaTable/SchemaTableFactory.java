/**
 */
package SchemaTable;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SchemaTable.SchemaTablePackage
 * @generated
 */
public interface SchemaTableFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchemaTableFactory eINSTANCE = SchemaTable.impl.SchemaTableFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Schema De Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema De Table</em>'.
	 * @generated
	 */
	SchemaDeTable createSchemaDeTable();

	/**
	 * Returns a new object of class '<em>Colonne Brute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colonne Brute</em>'.
	 * @generated
	 */
	ColonneBrute createColonneBrute();

	/**
	 * Returns a new object of class '<em>Colonne Calculee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colonne Calculee</em>'.
	 * @generated
	 */
	ColonneCalculee createColonneCalculee();

	/**
	 * Returns a new object of class '<em>Colonne Etrangere</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colonne Etrangere</em>'.
	 * @generated
	 */
	ColonneEtrangere createColonneEtrangere();

	/**
	 * Returns a new object of class '<em>Contrainte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contrainte</em>'.
	 * @generated
	 */
	Contrainte createContrainte();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchemaTablePackage getSchemaTablePackage();

} //SchemaTableFactory
