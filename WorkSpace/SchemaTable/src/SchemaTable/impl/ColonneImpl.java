/**
 */
package SchemaTable.impl;

import SchemaTable.Algorithme;
import SchemaTable.Colonne;
import SchemaTable.SchemaDeTable;
import SchemaTable.SchemaTablePackage;
import algorithms.TypeDonnees;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SchemaTable.impl.ColonneImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link SchemaTable.impl.ColonneImpl#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link SchemaTable.impl.ColonneImpl#getTypeDonnees <em>Type Donnees</em>}</li>
 *   <li>{@link SchemaTable.impl.ColonneImpl#getContraintes <em>Contraintes</em>}</li>
 *   <li>{@link SchemaTable.impl.ColonneImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ColonneImpl extends MinimalEObjectImpl.Container implements Colonne {
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
	 * The default value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiant()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiant()
	 * @generated
	 * @ordered
	 */
	protected String identifiant = IDENTIFIANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeDonnees() <em>Type Donnees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDonnees()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDonnees TYPE_DONNEES_EDEFAULT = TypeDonnees.FLOTTANT;

	/**
	 * The cached value of the '{@link #getTypeDonnees() <em>Type Donnees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDonnees()
	 * @generated
	 * @ordered
	 */
	protected TypeDonnees typeDonnees = TYPE_DONNEES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContraintes() <em>Contraintes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintes()
	 * @generated
	 * @ordered
	 */
	protected EList<Algorithme> contraintes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTablePackage.Literals.COLONNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaDeTable getSchema() {
		if (eContainerFeatureID() != SchemaTablePackage.COLONNE__SCHEMA) return null;
		return (SchemaDeTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(SchemaDeTable newSchema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchema, SchemaTablePackage.COLONNE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchema(SchemaDeTable newSchema) {
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != SchemaTablePackage.COLONNE__SCHEMA && newSchema != null)) {
			if (EcoreUtil.isAncestor(this, newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = ((InternalEObject)newSchema).eInverseAdd(this, SchemaTablePackage.SCHEMA_DE_TABLE__COLONNES, SchemaDeTable.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE__SCHEMA, newSchema, newSchema));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifiant(String newIdentifiant) {
		String oldIdentifiant = identifiant;
		identifiant = newIdentifiant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE__IDENTIFIANT, oldIdentifiant, identifiant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDonnees getTypeDonnees() {
		return typeDonnees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeDonnees(TypeDonnees newTypeDonnees) {
		TypeDonnees oldTypeDonnees = typeDonnees;
		typeDonnees = newTypeDonnees == null ? TYPE_DONNEES_EDEFAULT : newTypeDonnees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE__TYPE_DONNEES, oldTypeDonnees, typeDonnees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Algorithme> getContraintes() {
		if (contraintes == null) {
			contraintes = new EObjectResolvingEList<Algorithme>(Algorithme.class, this, SchemaTablePackage.COLONNE__CONTRAINTES);
		}
		return contraintes;
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
			case SchemaTablePackage.COLONNE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((SchemaDeTable)otherEnd, msgs);
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
			case SchemaTablePackage.COLONNE__SCHEMA:
				return basicSetSchema(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SchemaTablePackage.COLONNE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, SchemaTablePackage.SCHEMA_DE_TABLE__COLONNES, SchemaDeTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaTablePackage.COLONNE__NOM:
				return getNom();
			case SchemaTablePackage.COLONNE__IDENTIFIANT:
				return getIdentifiant();
			case SchemaTablePackage.COLONNE__TYPE_DONNEES:
				return getTypeDonnees();
			case SchemaTablePackage.COLONNE__CONTRAINTES:
				return getContraintes();
			case SchemaTablePackage.COLONNE__SCHEMA:
				return getSchema();
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
			case SchemaTablePackage.COLONNE__NOM:
				setNom((String)newValue);
				return;
			case SchemaTablePackage.COLONNE__IDENTIFIANT:
				setIdentifiant((String)newValue);
				return;
			case SchemaTablePackage.COLONNE__TYPE_DONNEES:
				setTypeDonnees((TypeDonnees)newValue);
				return;
			case SchemaTablePackage.COLONNE__CONTRAINTES:
				getContraintes().clear();
				getContraintes().addAll((Collection<? extends Algorithme>)newValue);
				return;
			case SchemaTablePackage.COLONNE__SCHEMA:
				setSchema((SchemaDeTable)newValue);
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
			case SchemaTablePackage.COLONNE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaTablePackage.COLONNE__IDENTIFIANT:
				setIdentifiant(IDENTIFIANT_EDEFAULT);
				return;
			case SchemaTablePackage.COLONNE__TYPE_DONNEES:
				setTypeDonnees(TYPE_DONNEES_EDEFAULT);
				return;
			case SchemaTablePackage.COLONNE__CONTRAINTES:
				getContraintes().clear();
				return;
			case SchemaTablePackage.COLONNE__SCHEMA:
				setSchema((SchemaDeTable)null);
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
			case SchemaTablePackage.COLONNE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaTablePackage.COLONNE__IDENTIFIANT:
				return IDENTIFIANT_EDEFAULT == null ? identifiant != null : !IDENTIFIANT_EDEFAULT.equals(identifiant);
			case SchemaTablePackage.COLONNE__TYPE_DONNEES:
				return typeDonnees != TYPE_DONNEES_EDEFAULT;
			case SchemaTablePackage.COLONNE__CONTRAINTES:
				return contraintes != null && !contraintes.isEmpty();
			case SchemaTablePackage.COLONNE__SCHEMA:
				return getSchema() != null;
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
		result.append(", identifiant: ");
		result.append(identifiant);
		result.append(", typeDonnees: ");
		result.append(typeDonnees);
		result.append(')');
		return result.toString();
	}

} //ColonneImpl
