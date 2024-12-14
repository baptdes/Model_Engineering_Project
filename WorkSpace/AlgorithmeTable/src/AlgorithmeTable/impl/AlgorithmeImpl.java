/**
 */
package AlgorithmeTable.impl;

import AlgorithmeTable.Algorithme;
import AlgorithmeTable.AlgorithmeTablePackage;
import AlgorithmeTable.Catalogue;
import AlgorithmeTable.Port;
import AlgorithmeTable.Ressource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlgorithmeTable.impl.AlgorithmeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link AlgorithmeTable.impl.AlgorithmeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link AlgorithmeTable.impl.AlgorithmeImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link AlgorithmeTable.impl.AlgorithmeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link AlgorithmeTable.impl.AlgorithmeImpl#getCatalogue <em>Catalogue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgorithmeImpl extends MinimalEObjectImpl.Container implements Algorithme {
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
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected Ressource ressource;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmeTablePackage.Literals.ALGORITHME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmeTablePackage.ALGORITHME__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmeTablePackage.ALGORITHME__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ressource getRessource() {
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRessource(Ressource newRessource, NotificationChain msgs) {
		Ressource oldRessource = ressource;
		ressource = newRessource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmeTablePackage.ALGORITHME__RESSOURCE, oldRessource, newRessource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRessource(Ressource newRessource) {
		if (newRessource != ressource) {
			NotificationChain msgs = null;
			if (ressource != null)
				msgs = ((InternalEObject)ressource).eInverseRemove(this, AlgorithmeTablePackage.RESSOURCE__ALGORITHME, Ressource.class, msgs);
			if (newRessource != null)
				msgs = ((InternalEObject)newRessource).eInverseAdd(this, AlgorithmeTablePackage.RESSOURCE__ALGORITHME, Ressource.class, msgs);
			msgs = basicSetRessource(newRessource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmeTablePackage.ALGORITHME__RESSOURCE, newRessource, newRessource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentWithInverseEList<Port>(Port.class, this, AlgorithmeTablePackage.ALGORITHME__PORT, AlgorithmeTablePackage.PORT__ALGORITHME);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalogue getCatalogue() {
		if (eContainerFeatureID() != AlgorithmeTablePackage.ALGORITHME__CATALOGUE) return null;
		return (Catalogue)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalogue(Catalogue newCatalogue, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCatalogue, AlgorithmeTablePackage.ALGORITHME__CATALOGUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalogue(Catalogue newCatalogue) {
		if (newCatalogue != eInternalContainer() || (eContainerFeatureID() != AlgorithmeTablePackage.ALGORITHME__CATALOGUE && newCatalogue != null)) {
			if (EcoreUtil.isAncestor(this, newCatalogue))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCatalogue != null)
				msgs = ((InternalEObject)newCatalogue).eInverseAdd(this, AlgorithmeTablePackage.CATALOGUE__ALGORITHME, Catalogue.class, msgs);
			msgs = basicSetCatalogue(newCatalogue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmeTablePackage.ALGORITHME__CATALOGUE, newCatalogue, newCatalogue));
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
			case AlgorithmeTablePackage.ALGORITHME__RESSOURCE:
				if (ressource != null)
					msgs = ((InternalEObject)ressource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgorithmeTablePackage.ALGORITHME__RESSOURCE, null, msgs);
				return basicSetRessource((Ressource)otherEnd, msgs);
			case AlgorithmeTablePackage.ALGORITHME__PORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPort()).basicAdd(otherEnd, msgs);
			case AlgorithmeTablePackage.ALGORITHME__CATALOGUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCatalogue((Catalogue)otherEnd, msgs);
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
			case AlgorithmeTablePackage.ALGORITHME__RESSOURCE:
				return basicSetRessource(null, msgs);
			case AlgorithmeTablePackage.ALGORITHME__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case AlgorithmeTablePackage.ALGORITHME__CATALOGUE:
				return basicSetCatalogue(null, msgs);
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
			case AlgorithmeTablePackage.ALGORITHME__CATALOGUE:
				return eInternalContainer().eInverseRemove(this, AlgorithmeTablePackage.CATALOGUE__ALGORITHME, Catalogue.class, msgs);
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
			case AlgorithmeTablePackage.ALGORITHME__NOM:
				return getNom();
			case AlgorithmeTablePackage.ALGORITHME__DOCUMENTATION:
				return getDocumentation();
			case AlgorithmeTablePackage.ALGORITHME__RESSOURCE:
				return getRessource();
			case AlgorithmeTablePackage.ALGORITHME__PORT:
				return getPort();
			case AlgorithmeTablePackage.ALGORITHME__CATALOGUE:
				return getCatalogue();
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
			case AlgorithmeTablePackage.ALGORITHME__NOM:
				setNom((String)newValue);
				return;
			case AlgorithmeTablePackage.ALGORITHME__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AlgorithmeTablePackage.ALGORITHME__RESSOURCE:
				setRessource((Ressource)newValue);
				return;
			case AlgorithmeTablePackage.ALGORITHME__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
				return;
			case AlgorithmeTablePackage.ALGORITHME__CATALOGUE:
				setCatalogue((Catalogue)newValue);
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
			case AlgorithmeTablePackage.ALGORITHME__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case AlgorithmeTablePackage.ALGORITHME__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AlgorithmeTablePackage.ALGORITHME__RESSOURCE:
				setRessource((Ressource)null);
				return;
			case AlgorithmeTablePackage.ALGORITHME__PORT:
				getPort().clear();
				return;
			case AlgorithmeTablePackage.ALGORITHME__CATALOGUE:
				setCatalogue((Catalogue)null);
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
			case AlgorithmeTablePackage.ALGORITHME__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case AlgorithmeTablePackage.ALGORITHME__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AlgorithmeTablePackage.ALGORITHME__RESSOURCE:
				return ressource != null;
			case AlgorithmeTablePackage.ALGORITHME__PORT:
				return port != null && !port.isEmpty();
			case AlgorithmeTablePackage.ALGORITHME__CATALOGUE:
				return getCatalogue() != null;
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //AlgorithmeImpl
