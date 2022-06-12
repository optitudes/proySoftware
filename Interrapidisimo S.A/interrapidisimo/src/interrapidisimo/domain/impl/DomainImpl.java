/**
 */
package interrapidisimo.domain.impl;

import interrapidisimo.ModelFactory;

import interrapidisimo.domain.Domain;
import interrapidisimo.domain.DomainPackage;
import interrapidisimo.domain.FactoryBodega;
import interrapidisimo.domain.FactoryGestionHumana;
import interrapidisimo.domain.FactoryPago;

import interrapidisimo.interrapidisimoPackage;

import interrapidisimo.ui.UI;
import interrapidisimo.ui.UiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.impl.DomainImpl#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.DomainImpl#getOwnedByFactoryBodega <em>Owned By Factory Bodega</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.DomainImpl#getTheFactoryGestionHumana <em>The Factory Gestion Humana</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.DomainImpl#getLstFactoryPago <em>Lst Factory Pago</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.DomainImpl#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends EObjectImpl implements Domain {
	/**
	 * The cached value of the '{@link #getOwnedByFactoryBodega() <em>Owned By Factory Bodega</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedByFactoryBodega()
	 * @generated
	 * @ordered
	 */
	protected FactoryBodega ownedByFactoryBodega;

	/**
	 * The cached value of the '{@link #getTheFactoryGestionHumana() <em>The Factory Gestion Humana</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheFactoryGestionHumana()
	 * @generated
	 * @ordered
	 */
	protected FactoryGestionHumana theFactoryGestionHumana;

	/**
	 * The cached value of the '{@link #getLstFactoryPago() <em>Lst Factory Pago</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstFactoryPago()
	 * @generated
	 * @ordered
	 */
	protected EList<FactoryPago> lstFactoryPago;

	/**
	 * The cached value of the '{@link #getTheUI() <em>The UI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheUI()
	 * @generated
	 * @ordered
	 */
	protected UI theUI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getTheModelFactory() {
		if (eContainerFeatureID() != DomainPackage.DOMAIN__THE_MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheModelFactory(ModelFactory newTheModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheModelFactory, DomainPackage.DOMAIN__THE_MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheModelFactory(ModelFactory newTheModelFactory) {
		if (newTheModelFactory != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DOMAIN__THE_MODEL_FACTORY && newTheModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newTheModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheModelFactory != null)
				msgs = ((InternalEObject)newTheModelFactory).eInverseAdd(this, interrapidisimoPackage.MODEL_FACTORY__THE_DOMAIN, ModelFactory.class, msgs);
			msgs = basicSetTheModelFactory(newTheModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_MODEL_FACTORY, newTheModelFactory, newTheModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryBodega getOwnedByFactoryBodega() {
		return ownedByFactoryBodega;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByFactoryBodega(FactoryBodega newOwnedByFactoryBodega, NotificationChain msgs) {
		FactoryBodega oldOwnedByFactoryBodega = ownedByFactoryBodega;
		ownedByFactoryBodega = newOwnedByFactoryBodega;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__OWNED_BY_FACTORY_BODEGA, oldOwnedByFactoryBodega, newOwnedByFactoryBodega);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByFactoryBodega(FactoryBodega newOwnedByFactoryBodega) {
		if (newOwnedByFactoryBodega != ownedByFactoryBodega) {
			NotificationChain msgs = null;
			if (ownedByFactoryBodega != null)
				msgs = ((InternalEObject)ownedByFactoryBodega).eInverseRemove(this, DomainPackage.FACTORY_BODEGA__LST_DOMAIN, FactoryBodega.class, msgs);
			if (newOwnedByFactoryBodega != null)
				msgs = ((InternalEObject)newOwnedByFactoryBodega).eInverseAdd(this, DomainPackage.FACTORY_BODEGA__LST_DOMAIN, FactoryBodega.class, msgs);
			msgs = basicSetOwnedByFactoryBodega(newOwnedByFactoryBodega, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__OWNED_BY_FACTORY_BODEGA, newOwnedByFactoryBodega, newOwnedByFactoryBodega));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryGestionHumana getTheFactoryGestionHumana() {
		return theFactoryGestionHumana;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheFactoryGestionHumana(FactoryGestionHumana newTheFactoryGestionHumana, NotificationChain msgs) {
		FactoryGestionHumana oldTheFactoryGestionHumana = theFactoryGestionHumana;
		theFactoryGestionHumana = newTheFactoryGestionHumana;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_FACTORY_GESTION_HUMANA, oldTheFactoryGestionHumana, newTheFactoryGestionHumana);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheFactoryGestionHumana(FactoryGestionHumana newTheFactoryGestionHumana) {
		if (newTheFactoryGestionHumana != theFactoryGestionHumana) {
			NotificationChain msgs = null;
			if (theFactoryGestionHumana != null)
				msgs = ((InternalEObject)theFactoryGestionHumana).eInverseRemove(this, DomainPackage.FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN, FactoryGestionHumana.class, msgs);
			if (newTheFactoryGestionHumana != null)
				msgs = ((InternalEObject)newTheFactoryGestionHumana).eInverseAdd(this, DomainPackage.FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN, FactoryGestionHumana.class, msgs);
			msgs = basicSetTheFactoryGestionHumana(newTheFactoryGestionHumana, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_FACTORY_GESTION_HUMANA, newTheFactoryGestionHumana, newTheFactoryGestionHumana));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactoryPago> getLstFactoryPago() {
		if (lstFactoryPago == null) {
			lstFactoryPago = new EObjectContainmentWithInverseEList<FactoryPago>(FactoryPago.class, this, DomainPackage.DOMAIN__LST_FACTORY_PAGO, DomainPackage.FACTORY_PAGO__OWNED_BY_DOMAIN);
		}
		return lstFactoryPago;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getTheUI() {
		if (theUI != null && theUI.eIsProxy()) {
			InternalEObject oldTheUI = (InternalEObject)theUI;
			theUI = (UI)eResolveProxy(oldTheUI);
			if (theUI != oldTheUI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DOMAIN__THE_UI, oldTheUI, theUI));
			}
		}
		return theUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI basicGetTheUI() {
		return theUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheUI(UI newTheUI, NotificationChain msgs) {
		UI oldTheUI = theUI;
		theUI = newTheUI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UI, oldTheUI, newTheUI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheUI(UI newTheUI) {
		if (newTheUI != theUI) {
			NotificationChain msgs = null;
			if (theUI != null)
				msgs = ((InternalEObject)theUI).eInverseRemove(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
			if (newTheUI != null)
				msgs = ((InternalEObject)newTheUI).eInverseAdd(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
			msgs = basicSetTheUI(newTheUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UI, newTheUI, newTheUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		//TODO implementarModelo
		
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheModelFactory((ModelFactory)otherEnd, msgs);
			case DomainPackage.DOMAIN__OWNED_BY_FACTORY_BODEGA:
				if (ownedByFactoryBodega != null)
					msgs = ((InternalEObject)ownedByFactoryBodega).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__OWNED_BY_FACTORY_BODEGA, null, msgs);
				return basicSetOwnedByFactoryBodega((FactoryBodega)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_FACTORY_GESTION_HUMANA:
				if (theFactoryGestionHumana != null)
					msgs = ((InternalEObject)theFactoryGestionHumana).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_FACTORY_GESTION_HUMANA, null, msgs);
				return basicSetTheFactoryGestionHumana((FactoryGestionHumana)otherEnd, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_PAGO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstFactoryPago()).basicAdd(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_UI:
				if (theUI != null)
					msgs = ((InternalEObject)theUI).eInverseRemove(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
				return basicSetTheUI((UI)otherEnd, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return basicSetTheModelFactory(null, msgs);
			case DomainPackage.DOMAIN__OWNED_BY_FACTORY_BODEGA:
				return basicSetOwnedByFactoryBodega(null, msgs);
			case DomainPackage.DOMAIN__THE_FACTORY_GESTION_HUMANA:
				return basicSetTheFactoryGestionHumana(null, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_PAGO:
				return ((InternalEList<?>)getLstFactoryPago()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_UI:
				return basicSetTheUI(null, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, interrapidisimoPackage.MODEL_FACTORY__THE_DOMAIN, ModelFactory.class, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return getTheModelFactory();
			case DomainPackage.DOMAIN__OWNED_BY_FACTORY_BODEGA:
				return getOwnedByFactoryBodega();
			case DomainPackage.DOMAIN__THE_FACTORY_GESTION_HUMANA:
				return getTheFactoryGestionHumana();
			case DomainPackage.DOMAIN__LST_FACTORY_PAGO:
				return getLstFactoryPago();
			case DomainPackage.DOMAIN__THE_UI:
				if (resolve) return getTheUI();
				return basicGetTheUI();
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)newValue);
				return;
			case DomainPackage.DOMAIN__OWNED_BY_FACTORY_BODEGA:
				setOwnedByFactoryBodega((FactoryBodega)newValue);
				return;
			case DomainPackage.DOMAIN__THE_FACTORY_GESTION_HUMANA:
				setTheFactoryGestionHumana((FactoryGestionHumana)newValue);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_PAGO:
				getLstFactoryPago().clear();
				getLstFactoryPago().addAll((Collection<? extends FactoryPago>)newValue);
				return;
			case DomainPackage.DOMAIN__THE_UI:
				setTheUI((UI)newValue);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)null);
				return;
			case DomainPackage.DOMAIN__OWNED_BY_FACTORY_BODEGA:
				setOwnedByFactoryBodega((FactoryBodega)null);
				return;
			case DomainPackage.DOMAIN__THE_FACTORY_GESTION_HUMANA:
				setTheFactoryGestionHumana((FactoryGestionHumana)null);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_PAGO:
				getLstFactoryPago().clear();
				return;
			case DomainPackage.DOMAIN__THE_UI:
				setTheUI((UI)null);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return getTheModelFactory() != null;
			case DomainPackage.DOMAIN__OWNED_BY_FACTORY_BODEGA:
				return ownedByFactoryBodega != null;
			case DomainPackage.DOMAIN__THE_FACTORY_GESTION_HUMANA:
				return theFactoryGestionHumana != null;
			case DomainPackage.DOMAIN__LST_FACTORY_PAGO:
				return lstFactoryPago != null && !lstFactoryPago.isEmpty();
			case DomainPackage.DOMAIN__THE_UI:
				return theUI != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
