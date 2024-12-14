/**
 */
package SchemaTable.impl;

import SchemaTable.ColonneEtrangere;
import SchemaTable.SchemaDeTable;
import SchemaTable.SchemaTablePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne Etrangere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SchemaTable.impl.ColonneEtrangereImpl#getNomColonneEtrangere <em>Nom Colonne Etrangere</em>}</li>
 *   <li>{@link SchemaTable.impl.ColonneEtrangereImpl#getSchemaEntree <em>Schema Entree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColonneEtrangereImpl extends ColonneImpl implements ColonneEtrangere {
	/**
	 * The default value of the '{@link #getNomColonneEtrangere() <em>Nom Colonne Etrangere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomColonneEtrangere()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_COLONNE_ETRANGERE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomColonneEtrangere() <em>Nom Colonne Etrangere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomColonneEtrangere()
	 * @generated
	 * @ordered
	 */
	protected String nomColonneEtrangere = NOM_COLONNE_ETRANGERE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchemaEntree() <em>Schema Entree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaEntree()
	 * @generated
	 * @ordered
	 */
	protected SchemaDeTable schemaEntree;

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
	public String getNomColonneEtrangere() {
		return nomColonneEtrangere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNomColonneEtrangere(String newNomColonneEtrangere) {
		String oldNomColonneEtrangere = nomColonneEtrangere;
		nomColonneEtrangere = newNomColonneEtrangere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE_ETRANGERE__NOM_COLONNE_ETRANGERE, oldNomColonneEtrangere, nomColonneEtrangere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaDeTable getSchemaEntree() {
		if (schemaEntree != null && schemaEntree.eIsProxy()) {
			InternalEObject oldSchemaEntree = (InternalEObject)schemaEntree;
			schemaEntree = (SchemaDeTable)eResolveProxy(oldSchemaEntree);
			if (schemaEntree != oldSchemaEntree) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchemaTablePackage.COLONNE_ETRANGERE__SCHEMA_ENTREE, oldSchemaEntree, schemaEntree));
			}
		}
		return schemaEntree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaDeTable basicGetSchemaEntree() {
		return schemaEntree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaEntree(SchemaDeTable newSchemaEntree) {
		SchemaDeTable oldSchemaEntree = schemaEntree;
		schemaEntree = newSchemaEntree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE_ETRANGERE__SCHEMA_ENTREE, oldSchemaEntree, schemaEntree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaTablePackage.COLONNE_ETRANGERE__NOM_COLONNE_ETRANGERE:
				return getNomColonneEtrangere();
			case SchemaTablePackage.COLONNE_ETRANGERE__SCHEMA_ENTREE:
				if (resolve) return getSchemaEntree();
				return basicGetSchemaEntree();
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
			case SchemaTablePackage.COLONNE_ETRANGERE__NOM_COLONNE_ETRANGERE:
				setNomColonneEtrangere((String)newValue);
				return;
			case SchemaTablePackage.COLONNE_ETRANGERE__SCHEMA_ENTREE:
				setSchemaEntree((SchemaDeTable)newValue);
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
			case SchemaTablePackage.COLONNE_ETRANGERE__NOM_COLONNE_ETRANGERE:
				setNomColonneEtrangere(NOM_COLONNE_ETRANGERE_EDEFAULT);
				return;
			case SchemaTablePackage.COLONNE_ETRANGERE__SCHEMA_ENTREE:
				setSchemaEntree((SchemaDeTable)null);
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
			case SchemaTablePackage.COLONNE_ETRANGERE__NOM_COLONNE_ETRANGERE:
				return NOM_COLONNE_ETRANGERE_EDEFAULT == null ? nomColonneEtrangere != null : !NOM_COLONNE_ETRANGERE_EDEFAULT.equals(nomColonneEtrangere);
			case SchemaTablePackage.COLONNE_ETRANGERE__SCHEMA_ENTREE:
				return schemaEntree != null;
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
		result.append(" (nomColonneEtrangere: ");
		result.append(nomColonneEtrangere);
		result.append(')');
		return result.toString();
	}

} //ColonneEtrangereImpl
