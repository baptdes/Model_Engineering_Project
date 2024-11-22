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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import script.Bloc;
import script.Entree;
import script.Resultat;
import script.Script;
import script.ScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.impl.ScriptImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link script.impl.ScriptImpl#getEntrees <em>Entrees</em>}</li>
 *   <li>{@link script.impl.ScriptImpl#getResultat <em>Resultat</em>}</li>
 *   <li>{@link script.impl.ScriptImpl#getBlocs <em>Blocs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script {
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
	 * The cached value of the '{@link #getEntrees() <em>Entrees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrees()
	 * @generated
	 * @ordered
	 */
	protected EList<Entree> entrees;

	/**
	 * The cached value of the '{@link #getResultat() <em>Resultat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultat()
	 * @generated
	 * @ordered
	 */
	protected Resultat resultat;

	/**
	 * The cached value of the '{@link #getBlocs() <em>Blocs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocs()
	 * @generated
	 * @ordered
	 */
	protected EList<Bloc> blocs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScriptPackage.Literals.SCRIPT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.SCRIPT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entree> getEntrees() {
		if (entrees == null) {
			entrees = new EObjectResolvingEList<Entree>(Entree.class, this, ScriptPackage.SCRIPT__ENTREES);
		}
		return entrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resultat getResultat() {
		if (resultat != null && resultat.eIsProxy()) {
			InternalEObject oldResultat = (InternalEObject) resultat;
			resultat = (Resultat) eResolveProxy(oldResultat);
			if (resultat != oldResultat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScriptPackage.SCRIPT__RESULTAT,
							oldResultat, resultat));
			}
		}
		return resultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resultat basicGetResultat() {
		return resultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultat(Resultat newResultat) {
		Resultat oldResultat = resultat;
		resultat = newResultat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.SCRIPT__RESULTAT, oldResultat,
					resultat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bloc> getBlocs() {
		if (blocs == null) {
			blocs = new EObjectContainmentWithInverseEList<Bloc>(Bloc.class, this, ScriptPackage.SCRIPT__BLOCS,
					ScriptPackage.BLOC__SCRIPT);
		}
		return blocs;
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
		case ScriptPackage.SCRIPT__BLOCS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBlocs()).basicAdd(otherEnd, msgs);
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
		case ScriptPackage.SCRIPT__BLOCS:
			return ((InternalEList<?>) getBlocs()).basicRemove(otherEnd, msgs);
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
		case ScriptPackage.SCRIPT__NOM:
			return getNom();
		case ScriptPackage.SCRIPT__ENTREES:
			return getEntrees();
		case ScriptPackage.SCRIPT__RESULTAT:
			if (resolve)
				return getResultat();
			return basicGetResultat();
		case ScriptPackage.SCRIPT__BLOCS:
			return getBlocs();
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
		case ScriptPackage.SCRIPT__NOM:
			setNom((String) newValue);
			return;
		case ScriptPackage.SCRIPT__ENTREES:
			getEntrees().clear();
			getEntrees().addAll((Collection<? extends Entree>) newValue);
			return;
		case ScriptPackage.SCRIPT__RESULTAT:
			setResultat((Resultat) newValue);
			return;
		case ScriptPackage.SCRIPT__BLOCS:
			getBlocs().clear();
			getBlocs().addAll((Collection<? extends Bloc>) newValue);
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
		case ScriptPackage.SCRIPT__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case ScriptPackage.SCRIPT__ENTREES:
			getEntrees().clear();
			return;
		case ScriptPackage.SCRIPT__RESULTAT:
			setResultat((Resultat) null);
			return;
		case ScriptPackage.SCRIPT__BLOCS:
			getBlocs().clear();
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
		case ScriptPackage.SCRIPT__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case ScriptPackage.SCRIPT__ENTREES:
			return entrees != null && !entrees.isEmpty();
		case ScriptPackage.SCRIPT__RESULTAT:
			return resultat != null;
		case ScriptPackage.SCRIPT__BLOCS:
			return blocs != null && !blocs.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //ScriptImpl
