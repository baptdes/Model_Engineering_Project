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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;
import script.Entree;
import script.OperationBinaire;
import script.Script;
import script.ScriptPackage;
import script.Sortie;
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
 *   <li>{@link script.impl.OperationBinaireImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link script.impl.OperationBinaireImpl#getEntree <em>Entree</em>}</li>
 *   <li>{@link script.impl.OperationBinaireImpl#getSortie <em>Sortie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationBinaireImpl extends MinimalEObjectImpl.Container implements OperationBinaire {
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
	 * The cached value of the '{@link #getEntree() <em>Entree</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree()
	 * @generated
	 * @ordered
	 */
	protected EList<Entree> entree;

	/**
	 * The cached value of the '{@link #getSortie() <em>Sortie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortie()
	 * @generated
	 * @ordered
	 */
	protected Sortie sortie;

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
	public Sortie getSortie() {
		return sortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortie(Sortie newSortie, NotificationChain msgs) {
		Sortie oldSortie = sortie;
		sortie = newSortie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScriptPackage.OPERATION_BINAIRE__SORTIE, oldSortie, newSortie);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSortie(Sortie newSortie) {
		if (newSortie != sortie) {
			NotificationChain msgs = null;
			if (sortie != null)
				msgs = ((InternalEObject) sortie).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ScriptPackage.OPERATION_BINAIRE__SORTIE, null, msgs);
			if (newSortie != null)
				msgs = ((InternalEObject) newSortie).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ScriptPackage.OPERATION_BINAIRE__SORTIE, null, msgs);
			msgs = basicSetSortie(newSortie, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.OPERATION_BINAIRE__SORTIE, newSortie,
					newSortie));
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
	public EList<Entree> getEntree() {
		if (entree == null) {
			entree = new EObjectContainmentEList<Entree>(Entree.class, this, ScriptPackage.OPERATION_BINAIRE__ENTREE);
		}
		return entree;
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
		case ScriptPackage.OPERATION_BINAIRE__ENTREE:
			return ((InternalEList<?>) getEntree()).basicRemove(otherEnd, msgs);
		case ScriptPackage.OPERATION_BINAIRE__SORTIE:
			return basicSetSortie(null, msgs);
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
		case ScriptPackage.OPERATION_BINAIRE__OPERATION:
			return getOperation();
		case ScriptPackage.OPERATION_BINAIRE__ENTREE:
			return getEntree();
		case ScriptPackage.OPERATION_BINAIRE__SORTIE:
			return getSortie();
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
		case ScriptPackage.OPERATION_BINAIRE__OPERATION:
			setOperation((TypeOperationBinaire) newValue);
			return;
		case ScriptPackage.OPERATION_BINAIRE__ENTREE:
			getEntree().clear();
			getEntree().addAll((Collection<? extends Entree>) newValue);
			return;
		case ScriptPackage.OPERATION_BINAIRE__SORTIE:
			setSortie((Sortie) newValue);
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
		case ScriptPackage.OPERATION_BINAIRE__OPERATION:
			setOperation(OPERATION_EDEFAULT);
			return;
		case ScriptPackage.OPERATION_BINAIRE__ENTREE:
			getEntree().clear();
			return;
		case ScriptPackage.OPERATION_BINAIRE__SORTIE:
			setSortie((Sortie) null);
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
		case ScriptPackage.OPERATION_BINAIRE__OPERATION:
			return operation != OPERATION_EDEFAULT;
		case ScriptPackage.OPERATION_BINAIRE__ENTREE:
			return entree != null && !entree.isEmpty();
		case ScriptPackage.OPERATION_BINAIRE__SORTIE:
			return sortie != null;
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
