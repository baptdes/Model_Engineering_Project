/**
 */
package script;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Fonction Unaire</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see script.ScriptPackage#getTypeFonctionUnaire()
 * @model
 * @generated
 */
public enum TypeFonctionUnaire implements Enumerator {
	/**
	 * The '<em><b>Exponentielle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPONENTIELLE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPONENTIELLE(0, "Exponentielle", "Exponentielle"),

	/**
	 * The '<em><b>Cosinus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSINUS_VALUE
	 * @generated
	 * @ordered
	 */
	COSINUS(0, "Cosinus", "Cosinus"),

	/**
	 * The '<em><b>Sinus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINUS_VALUE
	 * @generated
	 * @ordered
	 */
	SINUS(0, "Sinus", "Sinus"),

	/**
	 * The '<em><b>Racine Caree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RACINE_CAREE_VALUE
	 * @generated
	 * @ordered
	 */
	RACINE_CAREE(0, "RacineCaree", "RacineCaree"),

	/**
	 * The '<em><b>Inverse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVERSE_VALUE
	 * @generated
	 * @ordered
	 */
	INVERSE(0, "Inverse", "Inverse"),

	/**
	 * The '<em><b>Oppose</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPPOSE_VALUE
	 * @generated
	 * @ordered
	 */
	OPPOSE(0, "Oppose", "Oppose");

	/**
	 * The '<em><b>Exponentielle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPONENTIELLE
	 * @model name="Exponentielle"
	 * @generated
	 * @ordered
	 */
	public static final int EXPONENTIELLE_VALUE = 0;

	/**
	 * The '<em><b>Cosinus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSINUS
	 * @model name="Cosinus"
	 * @generated
	 * @ordered
	 */
	public static final int COSINUS_VALUE = 0;

	/**
	 * The '<em><b>Sinus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINUS
	 * @model name="Sinus"
	 * @generated
	 * @ordered
	 */
	public static final int SINUS_VALUE = 0;

	/**
	 * The '<em><b>Racine Caree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RACINE_CAREE
	 * @model name="RacineCaree"
	 * @generated
	 * @ordered
	 */
	public static final int RACINE_CAREE_VALUE = 0;

	/**
	 * The '<em><b>Inverse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVERSE
	 * @model name="Inverse"
	 * @generated
	 * @ordered
	 */
	public static final int INVERSE_VALUE = 0;

	/**
	 * The '<em><b>Oppose</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPPOSE
	 * @model name="Oppose"
	 * @generated
	 * @ordered
	 */
	public static final int OPPOSE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Type Fonction Unaire</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeFonctionUnaire[] VALUES_ARRAY = new TypeFonctionUnaire[] { EXPONENTIELLE, COSINUS, SINUS,
			RACINE_CAREE, INVERSE, OPPOSE, };

	/**
	 * A public read-only list of all the '<em><b>Type Fonction Unaire</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeFonctionUnaire> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Fonction Unaire</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeFonctionUnaire get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeFonctionUnaire result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Fonction Unaire</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeFonctionUnaire getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeFonctionUnaire result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Fonction Unaire</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeFonctionUnaire get(int value) {
		switch (value) {
		case EXPONENTIELLE_VALUE:
			return EXPONENTIELLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeFonctionUnaire(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //TypeFonctionUnaire
