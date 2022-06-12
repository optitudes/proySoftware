/**
 */
package interrapidisimo.domain.impl;

import interrapidisimo.domain.Domain;
import interrapidisimo.domain.DomainPackage;
import interrapidisimo.domain.FactoryPago;
import interrapidisimo.domain.Factura;

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
 * An implementation of the model object '<em><b>Factory Pago</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.impl.FactoryPagoImpl#getOwnedByDomain <em>Owned By Domain</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.FactoryPagoImpl#getLstFactura <em>Lst Factura</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryPagoImpl extends EObjectImpl implements FactoryPago {
	/**
	 * The cached value of the '{@link #getLstFactura() <em>Lst Factura</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstFactura()
	 * @generated
	 * @ordered
	 */
	protected EList<Factura> lstFactura;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryPagoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.FACTORY_PAGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getOwnedByDomain() {
		if (eContainerFeatureID() != DomainPackage.FACTORY_PAGO__OWNED_BY_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByDomain(Domain newOwnedByDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByDomain, DomainPackage.FACTORY_PAGO__OWNED_BY_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByDomain(Domain newOwnedByDomain) {
		if (newOwnedByDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.FACTORY_PAGO__OWNED_BY_DOMAIN && newOwnedByDomain != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByDomain != null)
				msgs = ((InternalEObject)newOwnedByDomain).eInverseAdd(this, DomainPackage.DOMAIN__LST_FACTORY_PAGO, Domain.class, msgs);
			msgs = basicSetOwnedByDomain(newOwnedByDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FACTORY_PAGO__OWNED_BY_DOMAIN, newOwnedByDomain, newOwnedByDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Factura> getLstFactura() {
		if (lstFactura == null) {
			lstFactura = new EObjectContainmentWithInverseEList<Factura>(Factura.class, this, DomainPackage.FACTORY_PAGO__LST_FACTURA, DomainPackage.FACTURA__LST_FACTORY_PAGO);
		}
		return lstFactura;
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
			case DomainPackage.FACTORY_PAGO__OWNED_BY_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByDomain((Domain)otherEnd, msgs);
			case DomainPackage.FACTORY_PAGO__LST_FACTURA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstFactura()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.FACTORY_PAGO__OWNED_BY_DOMAIN:
				return basicSetOwnedByDomain(null, msgs);
			case DomainPackage.FACTORY_PAGO__LST_FACTURA:
				return ((InternalEList<?>)getLstFactura()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.FACTORY_PAGO__OWNED_BY_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LST_FACTORY_PAGO, Domain.class, msgs);
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
			case DomainPackage.FACTORY_PAGO__OWNED_BY_DOMAIN:
				return getOwnedByDomain();
			case DomainPackage.FACTORY_PAGO__LST_FACTURA:
				return getLstFactura();
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
			case DomainPackage.FACTORY_PAGO__OWNED_BY_DOMAIN:
				setOwnedByDomain((Domain)newValue);
				return;
			case DomainPackage.FACTORY_PAGO__LST_FACTURA:
				getLstFactura().clear();
				getLstFactura().addAll((Collection<? extends Factura>)newValue);
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
			case DomainPackage.FACTORY_PAGO__OWNED_BY_DOMAIN:
				setOwnedByDomain((Domain)null);
				return;
			case DomainPackage.FACTORY_PAGO__LST_FACTURA:
				getLstFactura().clear();
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
			case DomainPackage.FACTORY_PAGO__OWNED_BY_DOMAIN:
				return getOwnedByDomain() != null;
			case DomainPackage.FACTORY_PAGO__LST_FACTURA:
				return lstFactura != null && !lstFactura.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FactoryPagoImpl
