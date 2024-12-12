/**
 */
package SchemaTable.tests;

import SchemaTable.ColonneBrute;
import SchemaTable.SchemaTableFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Colonne Brute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColonneBruteTest extends ColonneTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColonneBruteTest.class);
	}

	/**
	 * Constructs a new Colonne Brute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColonneBruteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Colonne Brute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ColonneBrute getFixture() {
		return (ColonneBrute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SchemaTableFactory.eINSTANCE.createColonneBrute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ColonneBruteTest
