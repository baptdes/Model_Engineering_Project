/**
 */
package SchemaTable.tests;

import SchemaTable.ColonneCalculee;
import SchemaTable.SchemaTableFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Colonne Calculee</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColonneCalculeeTest extends ColonneTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColonneCalculeeTest.class);
	}

	/**
	 * Constructs a new Colonne Calculee test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColonneCalculeeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Colonne Calculee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ColonneCalculee getFixture() {
		return (ColonneCalculee)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SchemaTableFactory.eINSTANCE.createColonneCalculee());
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

} //ColonneCalculeeTest
