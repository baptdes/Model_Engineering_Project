/**
 */
package SchemaTable.tests;

import SchemaTable.Contrainte;
import SchemaTable.SchemaTableFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Contrainte</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContrainteTest extends TestCase {

	/**
	 * The fixture for this Contrainte test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Contrainte fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContrainteTest.class);
	}

	/**
	 * Constructs a new Contrainte test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Contrainte test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Contrainte fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Contrainte test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Contrainte getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SchemaTableFactory.eINSTANCE.createContrainte());
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

} //ContrainteTest
