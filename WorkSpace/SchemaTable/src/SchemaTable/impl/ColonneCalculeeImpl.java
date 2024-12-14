/**
 */
package SchemaTable.impl;

import AlgorithmeTable.Algorithme;
import SchemaTable.ColonneCalculee;
import SchemaTable.SchemaTablePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne Calculee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SchemaTable.impl.ColonneCalculeeImpl#getAlgorithme <em>Algorithme</em>}</li>
 *   <li>{@link SchemaTable.impl.ColonneCalculeeImpl#getIdentifiantsColonnesEntree <em>Identifiants Colonnes Entree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColonneCalculeeImpl extends ColonneImpl implements ColonneCalculee {
	/**
	 * The cached value of the '{@link #getAlgorithme() <em>Algorithme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithme()
	 * @generated
	 * @ordered
	 */
	protected Algorithme algorithme;

	/**
	 * The cached value of the '{@link #getIdentifiantsColonnesEntree() <em>Identifiants Colonnes Entree</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantsColonnesEntree()
	 * @generated
	 * @ordered
	 */
	protected EList<String> identifiantsColonnesEntree;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneCalculeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTablePackage.Literals.COLONNE_CALCULEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithme getAlgorithme() {
		if (algorithme != null && algorithme.eIsProxy()) {
			InternalEObject oldAlgorithme = (InternalEObject)algorithme;
			algorithme = (Algorithme)eResolveProxy(oldAlgorithme);
			if (algorithme != oldAlgorithme) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchemaTablePackage.COLONNE_CALCULEE__ALGORITHME, oldAlgorithme, algorithme));
			}
		}
		return algorithme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algorithme basicGetAlgorithme() {
		return algorithme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithme(Algorithme newAlgorithme) {
		Algorithme oldAlgorithme = algorithme;
		algorithme = newAlgorithme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE_CALCULEE__ALGORITHME, oldAlgorithme, algorithme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getIdentifiantsColonnesEntree() {
		if (identifiantsColonnesEntree == null) {
			identifiantsColonnesEntree = new EDataTypeUniqueEList<String>(String.class, this, SchemaTablePackage.COLONNE_CALCULEE__IDENTIFIANTS_COLONNES_ENTREE);
		}
		return identifiantsColonnesEntree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaTablePackage.COLONNE_CALCULEE__ALGORITHME:
				if (resolve) return getAlgorithme();
				return basicGetAlgorithme();
			case SchemaTablePackage.COLONNE_CALCULEE__IDENTIFIANTS_COLONNES_ENTREE:
				return getIdentifiantsColonnesEntree();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaTablePackage.COLONNE_CALCULEE__ALGORITHME:
				setAlgorithme((Algorithme)newValue);
				return;
			case SchemaTablePackage.COLONNE_CALCULEE__IDENTIFIANTS_COLONNES_ENTREE:
				getIdentifiantsColonnesEntree().clear();
				getIdentifiantsColonnesEntree().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchemaTablePackage.COLONNE_CALCULEE__ALGORITHME:
				setAlgorithme((Algorithme)null);
				return;
			case SchemaTablePackage.COLONNE_CALCULEE__IDENTIFIANTS_COLONNES_ENTREE:
				getIdentifiantsColonnesEntree().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchemaTablePackage.COLONNE_CALCULEE__ALGORITHME:
				return algorithme != null;
			case SchemaTablePackage.COLONNE_CALCULEE__IDENTIFIANTS_COLONNES_ENTREE:
				return identifiantsColonnesEntree != null && !identifiantsColonnesEntree.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (identifiantsColonnesEntree: ");
		result.append(identifiantsColonnesEntree);
		result.append(')');
		return result.toString();
	}

} //ColonneCalculeeImpl
