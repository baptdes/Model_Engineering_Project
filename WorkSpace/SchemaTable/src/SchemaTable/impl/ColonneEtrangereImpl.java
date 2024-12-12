/**
 */
package SchemaTable.impl;

import SchemaTable.ColonneEtrangere;
import SchemaTable.SchemaTablePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne Etrangere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SchemaTable.impl.ColonneEtrangereImpl#getIdentifiantColonneEtrangere <em>Identifiant Colonne Etrangere</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColonneEtrangereImpl extends ColonneImpl implements ColonneEtrangere {
	/**
	 * The default value of the '{@link #getIdentifiantColonneEtrangere() <em>Identifiant Colonne Etrangere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantColonneEtrangere()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_COLONNE_ETRANGERE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiantColonneEtrangere() <em>Identifiant Colonne Etrangere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantColonneEtrangere()
	 * @generated
	 * @ordered
	 */
	protected String identifiantColonneEtrangere = IDENTIFIANT_COLONNE_ETRANGERE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneEtrangereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTablePackage.Literals.COLONNE_ETRANGERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifiantColonneEtrangere() {
		return identifiantColonneEtrangere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifiantColonneEtrangere(String newIdentifiantColonneEtrangere) {
		String oldIdentifiantColonneEtrangere = identifiantColonneEtrangere;
		identifiantColonneEtrangere = newIdentifiantColonneEtrangere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE_ETRANGERE__IDENTIFIANT_COLONNE_ETRANGERE, oldIdentifiantColonneEtrangere, identifiantColonneEtrangere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaTablePackage.COLONNE_ETRANGERE__IDENTIFIANT_COLONNE_ETRANGERE:
				return getIdentifiantColonneEtrangere();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaTablePackage.COLONNE_ETRANGERE__IDENTIFIANT_COLONNE_ETRANGERE:
				setIdentifiantColonneEtrangere((String)newValue);
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
			case SchemaTablePackage.COLONNE_ETRANGERE__IDENTIFIANT_COLONNE_ETRANGERE:
				setIdentifiantColonneEtrangere(IDENTIFIANT_COLONNE_ETRANGERE_EDEFAULT);
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
			case SchemaTablePackage.COLONNE_ETRANGERE__IDENTIFIANT_COLONNE_ETRANGERE:
				return IDENTIFIANT_COLONNE_ETRANGERE_EDEFAULT == null ? identifiantColonneEtrangere != null : !IDENTIFIANT_COLONNE_ETRANGERE_EDEFAULT.equals(identifiantColonneEtrangere);
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
		result.append(" (identifiantColonneEtrangere: ");
		result.append(identifiantColonneEtrangere);
		result.append(')');
		return result.toString();
	}

} //ColonneEtrangereImpl
