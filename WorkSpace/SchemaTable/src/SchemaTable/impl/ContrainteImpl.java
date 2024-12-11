/**
 */
package SchemaTable.impl;

import SchemaTable.Algorithme;
import SchemaTable.Colonne;
import SchemaTable.Contrainte;
import SchemaTable.SchemaTablePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contrainte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SchemaTable.impl.ContrainteImpl#getColonnes <em>Colonnes</em>}</li>
 *   <li>{@link SchemaTable.impl.ContrainteImpl#getAlgorithme <em>Algorithme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContrainteImpl extends MinimalEObjectImpl.Container implements Contrainte {
	/**
	 * The cached value of the '{@link #getColonnes() <em>Colonnes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonnes()
	 * @generated
	 * @ordered
	 */
	protected EList<Colonne> colonnes;

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
	public EList<Colonne> getColonnes() {
		if (colonnes == null) {
			colonnes = new EObjectWithInverseResolvingEList.ManyInverse<Colonne>(Colonne.class, this, SchemaTablePackage.CONTRAINTE__COLONNES, SchemaTablePackage.COLONNE__CONTRAINTES);
		}
		return colonnes;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaTablePackage.CONTRAINTE__COLONNES:
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
			case SchemaTablePackage.CONTRAINTE__COLONNES:
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
			case SchemaTablePackage.CONTRAINTE__COLONNES:
				return getColonnes();
			case SchemaTablePackage.CONTRAINTE__ALGORITHME:
				if (resolve) return getAlgorithme();
				return basicGetAlgorithme();
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
			case SchemaTablePackage.CONTRAINTE__COLONNES:
				getColonnes().clear();
				getColonnes().addAll((Collection<? extends Colonne>)newValue);
				return;
			case SchemaTablePackage.CONTRAINTE__ALGORITHME:
				setAlgorithme((Algorithme)newValue);
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
			case SchemaTablePackage.CONTRAINTE__COLONNES:
				getColonnes().clear();
				return;
			case SchemaTablePackage.CONTRAINTE__ALGORITHME:
				setAlgorithme((Algorithme)null);
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
			case SchemaTablePackage.CONTRAINTE__COLONNES:
				return colonnes != null && !colonnes.isEmpty();
			case SchemaTablePackage.CONTRAINTE__ALGORITHME:
				return algorithme != null;
		}
		return super.eIsSet(featureID);
	}

} //ContrainteImpl
