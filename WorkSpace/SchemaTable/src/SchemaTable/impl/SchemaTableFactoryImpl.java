/**
 */
package SchemaTable.impl;

import SchemaTable.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaTableFactoryImpl extends EFactoryImpl implements SchemaTableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchemaTableFactory init() {
		try {
			SchemaTableFactory theSchemaTableFactory = (SchemaTableFactory)EPackage.Registry.INSTANCE.getEFactory(SchemaTablePackage.eNS_URI);
			if (theSchemaTableFactory != null) {
				return theSchemaTableFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SchemaTableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaTableFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SchemaTablePackage.SCHEMA_DE_TABLE: return createSchemaDeTable();
			case SchemaTablePackage.COLONNE_BRUTE: return createColonneBrute();
			case SchemaTablePackage.COLONNE_CALCULEE: return createColonneCalculee();
			case SchemaTablePackage.COLONNE_ETRANGERE: return createColonneEtrangere();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaDeTable createSchemaDeTable() {
		SchemaDeTableImpl schemaDeTable = new SchemaDeTableImpl();
		return schemaDeTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColonneBrute createColonneBrute() {
		ColonneBruteImpl colonneBrute = new ColonneBruteImpl();
		return colonneBrute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColonneCalculee createColonneCalculee() {
		ColonneCalculeeImpl colonneCalculee = new ColonneCalculeeImpl();
		return colonneCalculee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColonneEtrangere createColonneEtrangere() {
		ColonneEtrangereImpl colonneEtrangere = new ColonneEtrangereImpl();
		return colonneEtrangere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaTablePackage getSchemaTablePackage() {
		return (SchemaTablePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SchemaTablePackage getPackage() {
		return SchemaTablePackage.eINSTANCE;
	}

} //SchemaTableFactoryImpl
