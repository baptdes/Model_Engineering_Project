/**
 */
package SchemaTable.impl;

import AlgorithmeTable.Algorithme;

import SchemaTable.Contrainte;
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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contrainte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SchemaTable.impl.ContrainteImpl#getAlgorithme <em>Algorithme</em>}</li>
 *   <li>{@link SchemaTable.impl.ContrainteImpl#getIdentifiantsColonnesEntree <em>Identifiants Colonnes Entree</em>}</li>
 *   <li>{@link SchemaTable.impl.ContrainteImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContrainteImpl extends MinimalEObjectImpl.Container implements Contrainte {
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
	protected ContrainteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTablePackage.Literals.CONTRAINTE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchemaTablePackage.CONTRAINTE__ALGORITHME, oldAlgorithme, algorithme));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.CONTRAINTE__ALGORITHME, oldAlgorithme, algorithme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getIdentifiantsColonnesEntree() {
		if (identifiantsColonnesEntree == null) {
			identifiantsColonnesEntree = new EDataTypeUniqueEList<String>(String.class, this, SchemaTablePackage.CONTRAINTE__IDENTIFIANTS_COLONNES_ENTREE);
		}
		return identifiantsColonnesEntree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaDeTable getSchema() {
		if (eContainerFeatureID() != SchemaTablePackage.CONTRAINTE__SCHEMA) return null;
		return (SchemaDeTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(SchemaDeTable newSchema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchema, SchemaTablePackage.CONTRAINTE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchema(SchemaDeTable newSchema) {
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != SchemaTablePackage.CONTRAINTE__SCHEMA && newSchema != null)) {
			if (EcoreUtil.isAncestor(this, newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = ((InternalEObject)newSchema).eInverseAdd(this, SchemaTablePackage.SCHEMA_DE_TABLE__CONTRAINTES, SchemaDeTable.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.CONTRAINTE__SCHEMA, newSchema, newSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaTablePackage.CONTRAINTE__SCHEMA:
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
			case SchemaTablePackage.CONTRAINTE__SCHEMA:
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
			case SchemaTablePackage.CONTRAINTE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, SchemaTablePackage.SCHEMA_DE_TABLE__CONTRAINTES, SchemaDeTable.class, msgs);
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
			case SchemaTablePackage.CONTRAINTE__ALGORITHME:
				if (resolve) return getAlgorithme();
				return basicGetAlgorithme();
			case SchemaTablePackage.CONTRAINTE__IDENTIFIANTS_COLONNES_ENTREE:
				return getIdentifiantsColonnesEntree();
			case SchemaTablePackage.CONTRAINTE__SCHEMA:
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
			case SchemaTablePackage.CONTRAINTE__ALGORITHME:
				setAlgorithme((Algorithme)newValue);
				return;
			case SchemaTablePackage.CONTRAINTE__IDENTIFIANTS_COLONNES_ENTREE:
				getIdentifiantsColonnesEntree().clear();
				getIdentifiantsColonnesEntree().addAll((Collection<? extends String>)newValue);
				return;
			case SchemaTablePackage.CONTRAINTE__SCHEMA:
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
			case SchemaTablePackage.CONTRAINTE__ALGORITHME:
				setAlgorithme((Algorithme)null);
				return;
			case SchemaTablePackage.CONTRAINTE__IDENTIFIANTS_COLONNES_ENTREE:
				getIdentifiantsColonnesEntree().clear();
				return;
			case SchemaTablePackage.CONTRAINTE__SCHEMA:
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
			case SchemaTablePackage.CONTRAINTE__ALGORITHME:
				return algorithme != null;
			case SchemaTablePackage.CONTRAINTE__IDENTIFIANTS_COLONNES_ENTREE:
				return identifiantsColonnesEntree != null && !identifiantsColonnesEntree.isEmpty();
			case SchemaTablePackage.CONTRAINTE__SCHEMA:
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
		result.append(" (identifiantsColonnesEntree: ");
		result.append(identifiantsColonnesEntree);
		result.append(')');
		return result.toString();
	}

} //ContrainteImpl
