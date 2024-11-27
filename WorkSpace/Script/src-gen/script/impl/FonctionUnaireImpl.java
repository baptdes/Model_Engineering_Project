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
import script.Entree;
import script.FonctionUnaire;
import script.Script;
import script.ScriptPackage;
import script.Sortie;
import script.TypeFonctionUnaire;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fonction Unaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.impl.FonctionUnaireImpl#getScript <em>Script</em>}</li>
 *   <li>{@link script.impl.FonctionUnaireImpl#getFonction <em>Fonction</em>}</li>
 *   <li>{@link script.impl.FonctionUnaireImpl#getEntree <em>Entree</em>}</li>
 *   <li>{@link script.impl.FonctionUnaireImpl#getSortie <em>Sortie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FonctionUnaireImpl extends MinimalEObjectImpl.Container implements FonctionUnaire {
	/**
	 * The default value of the '{@link #getFonction() <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected static final TypeFonctionUnaire FONCTION_EDEFAULT = TypeFonctionUnaire.EXPONENTIELLE;

	/**
	 * The cached value of the '{@link #getFonction() <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected TypeFonctionUnaire fonction = FONCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntree() <em>Entree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree()
	 * @generated
	 * @ordered
	 */
	protected Entree entree;

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
	protected FonctionUnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScriptPackage.Literals.FONCTION_UNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Script getScript() {
		if (eContainerFeatureID() != ScriptPackage.FONCTION_UNAIRE__SCRIPT)
			return null;
		return (Script) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(Script newScript, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newScript, ScriptPackage.FONCTION_UNAIRE__SCRIPT, msgs);
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
				|| (eContainerFeatureID() != ScriptPackage.FONCTION_UNAIRE__SCRIPT && newScript != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.FONCTION_UNAIRE__SCRIPT, newScript,
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
					ScriptPackage.FONCTION_UNAIRE__SORTIE, oldSortie, newSortie);
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
						EOPPOSITE_FEATURE_BASE - ScriptPackage.FONCTION_UNAIRE__SORTIE, null, msgs);
			if (newSortie != null)
				msgs = ((InternalEObject) newSortie).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ScriptPackage.FONCTION_UNAIRE__SORTIE, null, msgs);
			msgs = basicSetSortie(newSortie, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.FONCTION_UNAIRE__SORTIE, newSortie,
					newSortie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeFonctionUnaire getFonction() {
		return fonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFonction(TypeFonctionUnaire newFonction) {
		TypeFonctionUnaire oldFonction = fonction;
		fonction = newFonction == null ? FONCTION_EDEFAULT : newFonction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.FONCTION_UNAIRE__FONCTION, oldFonction,
					fonction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entree getEntree() {
		return entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntree(Entree newEntree, NotificationChain msgs) {
		Entree oldEntree = entree;
		entree = newEntree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScriptPackage.FONCTION_UNAIRE__ENTREE, oldEntree, newEntree);
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
	public void setEntree(Entree newEntree) {
		if (newEntree != entree) {
			NotificationChain msgs = null;
			if (entree != null)
				msgs = ((InternalEObject) entree).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ScriptPackage.FONCTION_UNAIRE__ENTREE, null, msgs);
			if (newEntree != null)
				msgs = ((InternalEObject) newEntree).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ScriptPackage.FONCTION_UNAIRE__ENTREE, null, msgs);
			msgs = basicSetEntree(newEntree, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.FONCTION_UNAIRE__ENTREE, newEntree,
					newEntree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScriptPackage.FONCTION_UNAIRE__SCRIPT:
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
		case ScriptPackage.FONCTION_UNAIRE__SCRIPT:
			return basicSetScript(null, msgs);
		case ScriptPackage.FONCTION_UNAIRE__ENTREE:
			return basicSetEntree(null, msgs);
		case ScriptPackage.FONCTION_UNAIRE__SORTIE:
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
		case ScriptPackage.FONCTION_UNAIRE__SCRIPT:
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
		case ScriptPackage.FONCTION_UNAIRE__SCRIPT:
			return getScript();
		case ScriptPackage.FONCTION_UNAIRE__FONCTION:
			return getFonction();
		case ScriptPackage.FONCTION_UNAIRE__ENTREE:
			return getEntree();
		case ScriptPackage.FONCTION_UNAIRE__SORTIE:
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
		case ScriptPackage.FONCTION_UNAIRE__SCRIPT:
			setScript((Script) newValue);
			return;
		case ScriptPackage.FONCTION_UNAIRE__FONCTION:
			setFonction((TypeFonctionUnaire) newValue);
			return;
		case ScriptPackage.FONCTION_UNAIRE__ENTREE:
			setEntree((Entree) newValue);
			return;
		case ScriptPackage.FONCTION_UNAIRE__SORTIE:
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
		case ScriptPackage.FONCTION_UNAIRE__SCRIPT:
			setScript((Script) null);
			return;
		case ScriptPackage.FONCTION_UNAIRE__FONCTION:
			setFonction(FONCTION_EDEFAULT);
			return;
		case ScriptPackage.FONCTION_UNAIRE__ENTREE:
			setEntree((Entree) null);
			return;
		case ScriptPackage.FONCTION_UNAIRE__SORTIE:
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
		case ScriptPackage.FONCTION_UNAIRE__SCRIPT:
			return getScript() != null;
		case ScriptPackage.FONCTION_UNAIRE__FONCTION:
			return fonction != FONCTION_EDEFAULT;
		case ScriptPackage.FONCTION_UNAIRE__ENTREE:
			return entree != null;
		case ScriptPackage.FONCTION_UNAIRE__SORTIE:
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
		result.append(" (fonction: ");
		result.append(fonction);
		result.append(')');
		return result.toString();
	}

} //FonctionUnaireImpl
