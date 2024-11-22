/**
 */
package script.impl;

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

import script.Bloc;
import script.BlocAvecSortie;
import script.OperationBinaire;
import script.Script;
import script.ScriptPackage;
import script.TypeOperationBinaire;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Binaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.impl.OperationBinaireImpl#getScript <em>Script</em>}</li>
 *   <li>{@link script.impl.OperationBinaireImpl#getSortie <em>Sortie</em>}</li>
 *   <li>{@link script.impl.OperationBinaireImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link script.impl.OperationBinaireImpl#getEntrees <em>Entrees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationBinaireImpl extends MinimalEObjectImpl.Container implements OperationBinaire {
	/**
	 * The cached value of the '{@link #getSortie() <em>Sortie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortie()
	 * @generated
	 * @ordered
	 */
	protected Bloc sortie;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeOperationBinaire OPERATION_EDEFAULT = TypeOperationBinaire.ADDITION;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected TypeOperationBinaire operation = OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntrees() <em>Entrees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrees()
	 * @generated
	 * @ordered
	 */
	protected EList<BlocAvecSortie> entrees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationBinaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScriptPackage.Literals.OPERATION_BINAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Script getScript() {
		if (eContainerFeatureID() != ScriptPackage.OPERATION_BINAIRE__SCRIPT)
			return null;
		return (Script) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(Script newScript, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newScript, ScriptPackage.OPERATION_BINAIRE__SCRIPT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScript(Script newScript) {
		if (newScript != eInternalContainer()
				|| (eContainerFeatureID() != ScriptPackage.OPERATION_BINAIRE__SCRIPT && newScript != null)) {
			if (EcoreUtil.isAncestor(this, newScript))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScript != null)
				msgs = ((InternalEObject) newScript).eInverseAdd(this, ScriptPackage.SCRIPT__BLOCS, Script.class, msgs);
			msgs = basicSetScript(newScript, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.OPERATION_BINAIRE__SCRIPT, newScript,
					newScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bloc getSortie() {
		if (sortie != null && sortie.eIsProxy()) {
			InternalEObject oldSortie = (InternalEObject) sortie;
			sortie = (Bloc) eResolveProxy(oldSortie);
			if (sortie != oldSortie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScriptPackage.OPERATION_BINAIRE__SORTIE,
							oldSortie, sortie));
			}
		}
		return sortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloc basicGetSortie() {
		return sortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSortie(Bloc newSortie) {
		Bloc oldSortie = sortie;
		sortie = newSortie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.OPERATION_BINAIRE__SORTIE, oldSortie,
					sortie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeOperationBinaire getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(TypeOperationBinaire newOperation) {
		TypeOperationBinaire oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.OPERATION_BINAIRE__OPERATION,
					oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlocAvecSortie> getEntrees() {
		if (entrees == null) {
			entrees = new EObjectResolvingEList<BlocAvecSortie>(BlocAvecSortie.class, this,
					ScriptPackage.OPERATION_BINAIRE__ENTREES);
		}
		return entrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScriptPackage.OPERATION_BINAIRE__SCRIPT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetScript((Script) otherEnd, msgs);
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
		case ScriptPackage.OPERATION_BINAIRE__SCRIPT:
			return basicSetScript(null, msgs);
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
		case ScriptPackage.OPERATION_BINAIRE__SCRIPT:
			return eInternalContainer().eInverseRemove(this, ScriptPackage.SCRIPT__BLOCS, Script.class, msgs);
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
		case ScriptPackage.OPERATION_BINAIRE__SCRIPT:
			return getScript();
		case ScriptPackage.OPERATION_BINAIRE__SORTIE:
			if (resolve)
				return getSortie();
			return basicGetSortie();
		case ScriptPackage.OPERATION_BINAIRE__OPERATION:
			return getOperation();
		case ScriptPackage.OPERATION_BINAIRE__ENTREES:
			return getEntrees();
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
		case ScriptPackage.OPERATION_BINAIRE__SCRIPT:
			setScript((Script) newValue);
			return;
		case ScriptPackage.OPERATION_BINAIRE__SORTIE:
			setSortie((Bloc) newValue);
			return;
		case ScriptPackage.OPERATION_BINAIRE__OPERATION:
			setOperation((TypeOperationBinaire) newValue);
			return;
		case ScriptPackage.OPERATION_BINAIRE__ENTREES:
			getEntrees().clear();
			getEntrees().addAll((Collection<? extends BlocAvecSortie>) newValue);
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
		case ScriptPackage.OPERATION_BINAIRE__SCRIPT:
			setScript((Script) null);
			return;
		case ScriptPackage.OPERATION_BINAIRE__SORTIE:
			setSortie((Bloc) null);
			return;
		case ScriptPackage.OPERATION_BINAIRE__OPERATION:
			setOperation(OPERATION_EDEFAULT);
			return;
		case ScriptPackage.OPERATION_BINAIRE__ENTREES:
			getEntrees().clear();
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
		case ScriptPackage.OPERATION_BINAIRE__SCRIPT:
			return getScript() != null;
		case ScriptPackage.OPERATION_BINAIRE__SORTIE:
			return sortie != null;
		case ScriptPackage.OPERATION_BINAIRE__OPERATION:
			return operation != OPERATION_EDEFAULT;
		case ScriptPackage.OPERATION_BINAIRE__ENTREES:
			return entrees != null && !entrees.isEmpty();
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
		result.append(" (operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

} //OperationBinaireImpl
