/**
 */
package SchemaTable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Donnee</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SchemaTable.SchemaTablePackage#getTypeDonnee()
 * @model
 * @generated
 */
public enum TypeDonnee implements Enumerator {
	/**
	 * The '<em><b>Entier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTIER_VALUE
	 * @generated
	 * @ordered
	 */
	ENTIER(0, "Entier", "Entier"),

	/**
	 * The '<em><b>Flottant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOTTANT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOTTANT(1, "Flottant", "Flottant"),

	/**
	 * The '<em><b>Texte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTE_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTE(2, "Texte", "Texte"),

	/**
	 * The '<em><b>Booleen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEEN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEEN(3, "Booleen", "Booleen");

	/**
	 * The '<em><b>Entier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTIER
	 * @model name="Entier"
	 * @generated
	 * @ordered
	 */
	public static final int ENTIER_VALUE = 0;

	/**
	 * The '<em><b>Flottant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOTTANT
	 * @model name="Flottant"
	 * @generated
	 * @ordered
	 */
	public static final int FLOTTANT_VALUE = 1;

	/**
	 * The '<em><b>Texte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTE
	 * @model name="Texte"
	 * @generated
	 * @ordered
	 */
	public static final int TEXTE_VALUE = 2;

	/**
	 * The '<em><b>Booleen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEEN
	 * @model name="Booleen"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEEN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Donnee</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDonnee[] VALUES_ARRAY =
		new TypeDonnee[] {
			ENTIER,
			FLOTTANT,
			TEXTE,
			BOOLEEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Donnee</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDonnee> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Donnee</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeDonnee get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDonnee result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Donnee</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeDonnee getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDonnee result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Donnee</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeDonnee get(int value) {
		switch (value) {
			case ENTIER_VALUE: return ENTIER;
			case FLOTTANT_VALUE: return FLOTTANT;
			case TEXTE_VALUE: return TEXTE;
			case BOOLEEN_VALUE: return BOOLEEN;
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
	private TypeDonnee(int value, String name, String literal) {
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
	
} //TypeDonnee
