/**
 */
package script.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import script.Constante;
import script.Script;
import script.ScriptPackage;
import script.Sortie;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.impl.ConstanteImpl#getScript <em>Script</em>}</li>
 *   <li>{@link script.impl.ConstanteImpl#getValeur <em>Valeur</em>}</li>
 *   <li>{@link script.impl.ConstanteImpl#getSortie <em>Sortie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstanteImpl extends MinimalEObjectImpl.Container implements Constante {
	/**
	 * The default value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected static final float VALEUR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected float valeur = VALEUR_EDEFAULT;

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
	protected ConstanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScriptPackage.Literals.CONSTANTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Script getScript() {
		if (eContainerFeatureID() != ScriptPackage.CONSTANTE__SCRIPT)
			return null;
		return (Script) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(Script newScript, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newScript, ScriptPackage.CONSTANTE__SCRIPT, msgs);
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
				|| (eContainerFeatureID() != ScriptPackage.CONSTANTE__SCRIPT && newScript != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.CONSTANTE__SCRIPT, newScript,
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
					ScriptPackage.CONSTANTE__SORTIE, oldSortie, newSortie);
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
						EOPPOSITE_FEATURE_BASE - ScriptPackage.CONSTANTE__SORTIE, null, msgs);
			if (newSortie != null)
				msgs = ((InternalEObject) newSortie).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ScriptPackage.CONSTANTE__SORTIE, null, msgs);
			msgs = basicSetSortie(newSortie, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.CONSTANTE__SORTIE, newSortie,
					newSortie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getValeur() {
		return valeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValeur(float newValeur) {
		float oldValeur = valeur;
		valeur = newValeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.CONSTANTE__VALEUR, oldValeur, valeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScriptPackage.CONSTANTE__SCRIPT:
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
		case ScriptPackage.CONSTANTE__SCRIPT:
			return basicSetScript(null, msgs);
		case ScriptPackage.CONSTANTE__SORTIE:
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
		case ScriptPackage.CONSTANTE__SCRIPT:
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
		case ScriptPackage.CONSTANTE__SCRIPT:
			return getScript();
		case ScriptPackage.CONSTANTE__VALEUR:
			return getValeur();
		case ScriptPackage.CONSTANTE__SORTIE:
			return getSortie();
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
		case ScriptPackage.CONSTANTE__SCRIPT:
			setScript((Script) newValue);
			return;
		case ScriptPackage.CONSTANTE__VALEUR:
			setValeur((Float) newValue);
			return;
		case ScriptPackage.CONSTANTE__SORTIE:
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
		case ScriptPackage.CONSTANTE__SCRIPT:
			setScript((Script) null);
			return;
		case ScriptPackage.CONSTANTE__VALEUR:
			setValeur(VALEUR_EDEFAULT);
			return;
		case ScriptPackage.CONSTANTE__SORTIE:
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
		case ScriptPackage.CONSTANTE__SCRIPT:
			return getScript() != null;
		case ScriptPackage.CONSTANTE__VALEUR:
			return valeur != VALEUR_EDEFAULT;
		case ScriptPackage.CONSTANTE__SORTIE:
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
		result.append(" (valeur: ");
		result.append(valeur);
		result.append(')');
		return result.toString();
	}

} //ConstanteImpl
