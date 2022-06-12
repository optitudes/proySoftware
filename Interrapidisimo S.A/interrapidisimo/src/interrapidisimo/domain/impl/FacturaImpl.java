/**
 */
package interrapidisimo.domain.impl;

import interrapidisimo.domain.DomainPackage;
import interrapidisimo.domain.FactoryPago;
import interrapidisimo.domain.Factura;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factura</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.impl.FacturaImpl#getTipoPago <em>Tipo Pago</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.FacturaImpl#getCosto <em>Costo</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.FacturaImpl#getLstFactoryPago <em>Lst Factory Pago</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacturaImpl extends EObjectImpl implements Factura {
	/**
	 * The default value of the '{@link #getTipoPago() <em>Tipo Pago</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoPago()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_PAGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoPago() <em>Tipo Pago</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoPago()
	 * @generated
	 * @ordered
	 */
	protected String tipoPago = TIPO_PAGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCosto() <em>Costo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosto()
	 * @generated
	 * @ordered
	 */
	protected static final String COSTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCosto() <em>Costo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosto()
	 * @generated
	 * @ordered
	 */
	protected String costo = COSTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacturaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.FACTURA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoPago() {
		return tipoPago;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoPago(String newTipoPago) {
		String oldTipoPago = tipoPago;
		tipoPago = newTipoPago;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FACTURA__TIPO_PAGO, oldTipoPago, tipoPago));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCosto() {
		return costo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCosto(String newCosto) {
		String oldCosto = costo;
		costo = newCosto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FACTURA__COSTO, oldCosto, costo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryPago getLstFactoryPago() {
		if (eContainerFeatureID() != DomainPackage.FACTURA__LST_FACTORY_PAGO) return null;
		return (FactoryPago)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstFactoryPago(FactoryPago newLstFactoryPago, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLstFactoryPago, DomainPackage.FACTURA__LST_FACTORY_PAGO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstFactoryPago(FactoryPago newLstFactoryPago) {
		if (newLstFactoryPago != eInternalContainer() || (eContainerFeatureID() != DomainPackage.FACTURA__LST_FACTORY_PAGO && newLstFactoryPago != null)) {
			if (EcoreUtil.isAncestor(this, newLstFactoryPago))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLstFactoryPago != null)
				msgs = ((InternalEObject)newLstFactoryPago).eInverseAdd(this, DomainPackage.FACTORY_PAGO__LST_FACTURA, FactoryPago.class, msgs);
			msgs = basicSetLstFactoryPago(newLstFactoryPago, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FACTURA__LST_FACTORY_PAGO, newLstFactoryPago, newLstFactoryPago));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.FACTURA__LST_FACTORY_PAGO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLstFactoryPago((FactoryPago)otherEnd, msgs);
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
			case DomainPackage.FACTURA__LST_FACTORY_PAGO:
				return basicSetLstFactoryPago(null, msgs);
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
			case DomainPackage.FACTURA__LST_FACTORY_PAGO:
				return eInternalContainer().eInverseRemove(this, DomainPackage.FACTORY_PAGO__LST_FACTURA, FactoryPago.class, msgs);
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
			case DomainPackage.FACTURA__TIPO_PAGO:
				return getTipoPago();
			case DomainPackage.FACTURA__COSTO:
				return getCosto();
			case DomainPackage.FACTURA__LST_FACTORY_PAGO:
				return getLstFactoryPago();
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
			case DomainPackage.FACTURA__TIPO_PAGO:
				setTipoPago((String)newValue);
				return;
			case DomainPackage.FACTURA__COSTO:
				setCosto((String)newValue);
				return;
			case DomainPackage.FACTURA__LST_FACTORY_PAGO:
				setLstFactoryPago((FactoryPago)newValue);
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
			case DomainPackage.FACTURA__TIPO_PAGO:
				setTipoPago(TIPO_PAGO_EDEFAULT);
				return;
			case DomainPackage.FACTURA__COSTO:
				setCosto(COSTO_EDEFAULT);
				return;
			case DomainPackage.FACTURA__LST_FACTORY_PAGO:
				setLstFactoryPago((FactoryPago)null);
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
			case DomainPackage.FACTURA__TIPO_PAGO:
				return TIPO_PAGO_EDEFAULT == null ? tipoPago != null : !TIPO_PAGO_EDEFAULT.equals(tipoPago);
			case DomainPackage.FACTURA__COSTO:
				return COSTO_EDEFAULT == null ? costo != null : !COSTO_EDEFAULT.equals(costo);
			case DomainPackage.FACTURA__LST_FACTORY_PAGO:
				return getLstFactoryPago() != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tipoPago: ");
		result.append(tipoPago);
		result.append(", costo: ");
		result.append(costo);
		result.append(')');
		return result.toString();
	}

} //FacturaImpl
