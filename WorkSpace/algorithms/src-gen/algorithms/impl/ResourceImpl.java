/**
 */
package algorithms.impl;

import algorithms.AlgorithmsPackage;
import algorithms.Resource;
import algorithms.TypeDeRessource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithms.impl.ResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link algorithms.impl.ResourceImpl#getEmplacement <em>Emplacement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDeRessource TYPE_EDEFAULT = TypeDeRessource.PYTHON;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDeRessource type = TYPE_EDEFAULT;

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
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmsPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDeRessource getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeDeRessource newType) {
		TypeDeRessource oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.RESOURCE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.RESOURCE__EMPLACEMENT,
					oldEmplacement, emplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlgorithmsPackage.RESOURCE__TYPE:
			return getType();
		case AlgorithmsPackage.RESOURCE__EMPLACEMENT:
			return getEmplacement();
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
		case AlgorithmsPackage.RESOURCE__TYPE:
			setType((TypeDeRessource) newValue);
			return;
		case AlgorithmsPackage.RESOURCE__EMPLACEMENT:
			setEmplacement((String) newValue);
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
		case AlgorithmsPackage.RESOURCE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case AlgorithmsPackage.RESOURCE__EMPLACEMENT:
			setEmplacement(EMPLACEMENT_EDEFAULT);
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
		case AlgorithmsPackage.RESOURCE__TYPE:
			return type != TYPE_EDEFAULT;
		case AlgorithmsPackage.RESOURCE__EMPLACEMENT:
			return EMPLACEMENT_EDEFAULT == null ? emplacement != null : !EMPLACEMENT_EDEFAULT.equals(emplacement);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Type: ");
		result.append(type);
		result.append(", Emplacement: ");
		result.append(emplacement);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
