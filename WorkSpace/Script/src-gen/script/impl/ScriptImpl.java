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
import org.eclipse.emf.ecore.util.InternalEList;

import script.Argument;
import script.Bloc;
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
 *   <li>{@link script.impl.ScriptImpl#getArguments <em>Arguments</em>}</li>
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
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

	/**
	 * The cached value of the '{@link #getResultat() <em>Resultat</em>}' containment reference.
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
	public EList<Argument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentWithInverseEList<Argument>(Argument.class, this,
					ScriptPackage.SCRIPT__ARGUMENTS, ScriptPackage.ARGUMENT__SCRIPT);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resultat getResultat() {
		return resultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultat(Resultat newResultat, NotificationChain msgs) {
		Resultat oldResultat = resultat;
		resultat = newResultat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScriptPackage.SCRIPT__RESULTAT, oldResultat, newResultat);
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
	public void setResultat(Resultat newResultat) {
		if (newResultat != resultat) {
			NotificationChain msgs = null;
			if (resultat != null)
				msgs = ((InternalEObject) resultat).eInverseRemove(this, ScriptPackage.RESULTAT__SCRIPT, Resultat.class,
						msgs);
			if (newResultat != null)
				msgs = ((InternalEObject) newResultat).eInverseAdd(this, ScriptPackage.RESULTAT__SCRIPT, Resultat.class,
						msgs);
			msgs = basicSetResultat(newResultat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.SCRIPT__RESULTAT, newResultat,
					newResultat));
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
		case ScriptPackage.SCRIPT__ARGUMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getArguments()).basicAdd(otherEnd, msgs);
		case ScriptPackage.SCRIPT__RESULTAT:
			if (resultat != null)
				msgs = ((InternalEObject) resultat).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ScriptPackage.SCRIPT__RESULTAT, null, msgs);
			return basicSetResultat((Resultat) otherEnd, msgs);
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
		case ScriptPackage.SCRIPT__ARGUMENTS:
			return ((InternalEList<?>) getArguments()).basicRemove(otherEnd, msgs);
		case ScriptPackage.SCRIPT__RESULTAT:
			return basicSetResultat(null, msgs);
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
		case ScriptPackage.SCRIPT__ARGUMENTS:
			return getArguments();
		case ScriptPackage.SCRIPT__RESULTAT:
			return getResultat();
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
		case ScriptPackage.SCRIPT__ARGUMENTS:
			getArguments().clear();
			getArguments().addAll((Collection<? extends Argument>) newValue);
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
		case ScriptPackage.SCRIPT__ARGUMENTS:
			getArguments().clear();
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
		case ScriptPackage.SCRIPT__ARGUMENTS:
			return arguments != null && !arguments.isEmpty();
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
