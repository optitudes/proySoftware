/**
 */
package interrapidisimo.domain.impl;

import interrapidisimo.domain.Cliente;
import interrapidisimo.domain.Domain;
import interrapidisimo.domain.DomainPackage;
import interrapidisimo.domain.Empleado;
import interrapidisimo.domain.FactoryGestionHumana;
import interrapidisimo.domain.Transportador;

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
 * An implementation of the model object '<em><b>Factory Gestion Humana</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.impl.FactoryGestionHumanaImpl#getLstCliente <em>Lst Cliente</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.FactoryGestionHumanaImpl#getLstEmpleado <em>Lst Empleado</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.FactoryGestionHumanaImpl#getOwnedByDomain <em>Owned By Domain</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.FactoryGestionHumanaImpl#getLstTransportador <em>Lst Transportador</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryGestionHumanaImpl extends EObjectImpl implements FactoryGestionHumana {
	/**
	 * The cached value of the '{@link #getLstCliente() <em>Lst Cliente</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstCliente()
	 * @generated
	 * @ordered
	 */
	protected EList<Cliente> lstCliente;

	/**
	 * The cached value of the '{@link #getLstEmpleado() <em>Lst Empleado</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstEmpleado()
	 * @generated
	 * @ordered
	 */
	protected EList<Empleado> lstEmpleado;

	/**
	 * The cached value of the '{@link #getLstTransportador() <em>Lst Transportador</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstTransportador()
	 * @generated
	 * @ordered
	 */
	protected EList<Transportador> lstTransportador;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryGestionHumanaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.FACTORY_GESTION_HUMANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cliente> getLstCliente() {
		if (lstCliente == null) {
			lstCliente = new EObjectContainmentWithInverseEList<Cliente>(Cliente.class, this, DomainPackage.FACTORY_GESTION_HUMANA__LST_CLIENTE, DomainPackage.CLIENTE__LST_FACTORY_GESTION_HUMANA);
		}
		return lstCliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Empleado> getLstEmpleado() {
		if (lstEmpleado == null) {
			lstEmpleado = new EObjectContainmentWithInverseEList<Empleado>(Empleado.class, this, DomainPackage.FACTORY_GESTION_HUMANA__LST_EMPLEADO, DomainPackage.EMPLEADO__LST_FACTORY_GESTION_HUMANA);
		}
		return lstEmpleado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getOwnedByDomain() {
		if (eContainerFeatureID() != DomainPackage.FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByDomain(Domain newOwnedByDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByDomain, DomainPackage.FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByDomain(Domain newOwnedByDomain) {
		if (newOwnedByDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN && newOwnedByDomain != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByDomain != null)
				msgs = ((InternalEObject)newOwnedByDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_FACTORY_GESTION_HUMANA, Domain.class, msgs);
			msgs = basicSetOwnedByDomain(newOwnedByDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN, newOwnedByDomain, newOwnedByDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transportador> getLstTransportador() {
		if (lstTransportador == null) {
			lstTransportador = new EObjectContainmentWithInverseEList<Transportador>(Transportador.class, this, DomainPackage.FACTORY_GESTION_HUMANA__LST_TRANSPORTADOR, DomainPackage.TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA);
		}
		return lstTransportador;
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
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_CLIENTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstCliente()).basicAdd(otherEnd, msgs);
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_EMPLEADO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstEmpleado()).basicAdd(otherEnd, msgs);
			case DomainPackage.FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByDomain((Domain)otherEnd, msgs);
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_TRANSPORTADOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstTransportador()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_CLIENTE:
				return ((InternalEList<?>)getLstCliente()).basicRemove(otherEnd, msgs);
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_EMPLEADO:
				return ((InternalEList<?>)getLstEmpleado()).basicRemove(otherEnd, msgs);
			case DomainPackage.FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN:
				return basicSetOwnedByDomain(null, msgs);
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_TRANSPORTADOR:
				return ((InternalEList<?>)getLstTransportador()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__THE_FACTORY_GESTION_HUMANA, Domain.class, msgs);
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
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_CLIENTE:
				return getLstCliente();
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_EMPLEADO:
				return getLstEmpleado();
			case DomainPackage.FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN:
				return getOwnedByDomain();
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_TRANSPORTADOR:
				return getLstTransportador();
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
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_CLIENTE:
				getLstCliente().clear();
				getLstCliente().addAll((Collection<? extends Cliente>)newValue);
				return;
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_EMPLEADO:
				getLstEmpleado().clear();
				getLstEmpleado().addAll((Collection<? extends Empleado>)newValue);
				return;
			case DomainPackage.FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN:
				setOwnedByDomain((Domain)newValue);
				return;
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_TRANSPORTADOR:
				getLstTransportador().clear();
				getLstTransportador().addAll((Collection<? extends Transportador>)newValue);
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
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_CLIENTE:
				getLstCliente().clear();
				return;
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_EMPLEADO:
				getLstEmpleado().clear();
				return;
			case DomainPackage.FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN:
				setOwnedByDomain((Domain)null);
				return;
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_TRANSPORTADOR:
				getLstTransportador().clear();
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
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_CLIENTE:
				return lstCliente != null && !lstCliente.isEmpty();
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_EMPLEADO:
				return lstEmpleado != null && !lstEmpleado.isEmpty();
			case DomainPackage.FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN:
				return getOwnedByDomain() != null;
			case DomainPackage.FACTORY_GESTION_HUMANA__LST_TRANSPORTADOR:
				return lstTransportador != null && !lstTransportador.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FactoryGestionHumanaImpl
