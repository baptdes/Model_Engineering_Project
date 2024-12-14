/**
 */
package algorithms.impl;

import algorithms.Algorithme;
import algorithms.AlgorithmsPackage;
import algorithms.Ressource;
import algorithms.TypeRessource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithms.impl.RessourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link algorithms.impl.RessourceImpl#getEmplacement <em>Emplacement</em>}</li>
 *   <li>{@link algorithms.impl.RessourceImpl#getAlgorithme <em>Algorithme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceImpl extends MinimalEObjectImpl.Container implements Ressource {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRessource TYPE_EDEFAULT = TypeRessource.PYTHON;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeRessource type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmplacement() <em>Emplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplacement()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLACEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmplacement() <em>Emplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplacement()
	 * @generated
	 * @ordered
	 */
	protected String emplacement = EMPLACEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmsPackage.Literals.RESSOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeRessource getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeRessource newType) {
		TypeRessource oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.RESSOURCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmplacement() {
		return emplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplacement(String newEmplacement) {
		String oldEmplacement = emplacement;
		emplacement = newEmplacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.RESSOURCE__EMPLACEMENT, oldEmplacement, emplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithme getAlgorithme() {
		if (eContainerFeatureID() != AlgorithmsPackage.RESSOURCE__ALGORITHME) return null;
		return (Algorithme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithme(Algorithme newAlgorithme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAlgorithme, AlgorithmsPackage.RESSOURCE__ALGORITHME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithme(Algorithme newAlgorithme) {
		if (newAlgorithme != eInternalContainer() || (eContainerFeatureID() != AlgorithmsPackage.RESSOURCE__ALGORITHME && newAlgorithme != null)) {
			if (EcoreUtil.isAncestor(this, newAlgorithme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAlgorithme != null)
				msgs = ((InternalEObject)newAlgorithme).eInverseAdd(this, AlgorithmsPackage.ALGORITHME__RESSOURCE, Algorithme.class, msgs);
			msgs = basicSetAlgorithme(newAlgorithme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.RESSOURCE__ALGORITHME, newAlgorithme, newAlgorithme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmsPackage.RESSOURCE__ALGORITHME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAlgorithme((Algorithme)otherEnd, msgs);
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
			case AlgorithmsPackage.RESSOURCE__ALGORITHME:
				return basicSetAlgorithme(null, msgs);
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
			case AlgorithmsPackage.RESSOURCE__ALGORITHME:
				return eInternalContainer().eInverseRemove(this, AlgorithmsPackage.ALGORITHME__RESSOURCE, Algorithme.class, msgs);
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
			case AlgorithmsPackage.RESSOURCE__TYPE:
				return getType();
			case AlgorithmsPackage.RESSOURCE__EMPLACEMENT:
				return getEmplacement();
			case AlgorithmsPackage.RESSOURCE__ALGORITHME:
				return getAlgorithme();
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
			case AlgorithmsPackage.RESSOURCE__TYPE:
				setType((TypeRessource)newValue);
				return;
			case AlgorithmsPackage.RESSOURCE__EMPLACEMENT:
				setEmplacement((String)newValue);
				return;
			case AlgorithmsPackage.RESSOURCE__ALGORITHME:
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
			case AlgorithmsPackage.RESSOURCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AlgorithmsPackage.RESSOURCE__EMPLACEMENT:
				setEmplacement(EMPLACEMENT_EDEFAULT);
				return;
			case AlgorithmsPackage.RESSOURCE__ALGORITHME:
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
			case AlgorithmsPackage.RESSOURCE__TYPE:
				return type != TYPE_EDEFAULT;
			case AlgorithmsPackage.RESSOURCE__EMPLACEMENT:
				return EMPLACEMENT_EDEFAULT == null ? emplacement != null : !EMPLACEMENT_EDEFAULT.equals(emplacement);
			case AlgorithmsPackage.RESSOURCE__ALGORITHME:
				return getAlgorithme() != null;
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
		result.append(" (Type: ");
		result.append(type);
		result.append(", Emplacement: ");
		result.append(emplacement);
		result.append(')');
		return result.toString();
	}

} //RessourceImpl
