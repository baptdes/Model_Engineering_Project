/**
 */
package SchemaTable.impl;

import SchemaTable.Colonne;
import SchemaTable.SchemaDeTable;
import SchemaTable.SchemaTablePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema De Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SchemaTable.impl.SchemaDeTableImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link SchemaTable.impl.SchemaDeTableImpl#getColonnes <em>Colonnes</em>}</li>
 *   <li>{@link SchemaTable.impl.SchemaDeTableImpl#getColonneIdentifiants <em>Colonne Identifiants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaDeTableImpl extends MinimalEObjectImpl.Container implements SchemaDeTable {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColonnes() <em>Colonnes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonnes()
	 * @generated
	 * @ordered
	 */
	protected EList<Colonne> colonnes;

	/**
	 * The cached value of the '{@link #getColonneIdentifiants() <em>Colonne Identifiants</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonneIdentifiants()
	 * @generated
	 * @ordered
	 */
	protected Colonne colonneIdentifiants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaDeTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTablePackage.Literals.SCHEMA_DE_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.SCHEMA_DE_TABLE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Colonne> getColonnes() {
		if (colonnes == null) {
			colonnes = new EObjectContainmentWithInverseEList<Colonne>(Colonne.class, this, SchemaTablePackage.SCHEMA_DE_TABLE__COLONNES, SchemaTablePackage.COLONNE__SCHEMA);
		}
		return colonnes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colonne getColonneIdentifiants() {
		if (colonneIdentifiants != null && colonneIdentifiants.eIsProxy()) {
			InternalEObject oldColonneIdentifiants = (InternalEObject)colonneIdentifiants;
			colonneIdentifiants = (Colonne)eResolveProxy(oldColonneIdentifiants);
			if (colonneIdentifiants != oldColonneIdentifiants) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchemaTablePackage.SCHEMA_DE_TABLE__COLONNE_IDENTIFIANTS, oldColonneIdentifiants, colonneIdentifiants));
			}
		}
		return colonneIdentifiants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colonne basicGetColonneIdentifiants() {
		return colonneIdentifiants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColonneIdentifiants(Colonne newColonneIdentifiants) {
		Colonne oldColonneIdentifiants = colonneIdentifiants;
		colonneIdentifiants = newColonneIdentifiants;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.SCHEMA_DE_TABLE__COLONNE_IDENTIFIANTS, oldColonneIdentifiants, colonneIdentifiants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaTablePackage.SCHEMA_DE_TABLE__COLONNES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColonnes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaTablePackage.SCHEMA_DE_TABLE__COLONNES:
				return ((InternalEList<?>)getColonnes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaTablePackage.SCHEMA_DE_TABLE__NOM:
				return getNom();
			case SchemaTablePackage.SCHEMA_DE_TABLE__COLONNES:
				return getColonnes();
			case SchemaTablePackage.SCHEMA_DE_TABLE__COLONNE_IDENTIFIANTS:
				if (resolve) return getColonneIdentifiants();
				return basicGetColonneIdentifiants();
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
			case SchemaTablePackage.SCHEMA_DE_TABLE__NOM:
				setNom((String)newValue);
				return;
			case SchemaTablePackage.SCHEMA_DE_TABLE__COLONNES:
				getColonnes().clear();
				getColonnes().addAll((Collection<? extends Colonne>)newValue);
				return;
			case SchemaTablePackage.SCHEMA_DE_TABLE__COLONNE_IDENTIFIANTS:
				setColonneIdentifiants((Colonne)newValue);
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
			case SchemaTablePackage.SCHEMA_DE_TABLE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaTablePackage.SCHEMA_DE_TABLE__COLONNES:
				getColonnes().clear();
				return;
			case SchemaTablePackage.SCHEMA_DE_TABLE__COLONNE_IDENTIFIANTS:
				setColonneIdentifiants((Colonne)null);
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
			case SchemaTablePackage.SCHEMA_DE_TABLE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaTablePackage.SCHEMA_DE_TABLE__COLONNES:
				return colonnes != null && !colonnes.isEmpty();
			case SchemaTablePackage.SCHEMA_DE_TABLE__COLONNE_IDENTIFIANTS:
				return colonneIdentifiants != null;
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //SchemaDeTableImpl
