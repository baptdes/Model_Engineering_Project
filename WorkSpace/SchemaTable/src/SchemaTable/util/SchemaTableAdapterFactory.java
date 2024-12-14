/**
 */
package SchemaTable.util;

import SchemaTable.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SchemaTable.SchemaTablePackage
 * @generated
 */
public class SchemaTableAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchemaTablePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaTableAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SchemaTablePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaTableSwitch<Adapter> modelSwitch =
		new SchemaTableSwitch<Adapter>() {
			@Override
			public Adapter caseSchemaDeTable(SchemaDeTable object) {
				return createSchemaDeTableAdapter();
			}
			@Override
			public Adapter caseColonne(Colonne object) {
				return createColonneAdapter();
			}
			@Override
			public Adapter caseColonneBrute(ColonneBrute object) {
				return createColonneBruteAdapter();
			}
			@Override
			public Adapter caseColonneCalculee(ColonneCalculee object) {
				return createColonneCalculeeAdapter();
			}
			@Override
			public Adapter caseColonneEtrangere(ColonneEtrangere object) {
				return createColonneEtrangereAdapter();
			}
			@Override
			public Adapter caseAlgorithme(Algorithme object) {
				return createAlgorithmeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link SchemaTable.SchemaDeTable <em>Schema De Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SchemaTable.SchemaDeTable
	 * @generated
	 */
	public Adapter createSchemaDeTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SchemaTable.Colonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SchemaTable.Colonne
	 * @generated
	 */
	public Adapter createColonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SchemaTable.ColonneBrute <em>Colonne Brute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SchemaTable.ColonneBrute
	 * @generated
	 */
	public Adapter createColonneBruteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SchemaTable.ColonneCalculee <em>Colonne Calculee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SchemaTable.ColonneCalculee
	 * @generated
	 */
	public Adapter createColonneCalculeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SchemaTable.ColonneEtrangere <em>Colonne Etrangere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SchemaTable.ColonneEtrangere
	 * @generated
	 */
	public Adapter createColonneEtrangereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SchemaTable.Algorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SchemaTable.Algorithme
	 * @generated
	 */
	public Adapter createAlgorithmeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SchemaTableAdapterFactory
