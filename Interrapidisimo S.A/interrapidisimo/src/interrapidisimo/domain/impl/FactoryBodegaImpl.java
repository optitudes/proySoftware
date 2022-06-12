/**
 */
package interrapidisimo.domain.impl;

import interrapidisimo.domain.Domain;
import interrapidisimo.domain.DomainPackage;
import interrapidisimo.domain.FactoryBodega;
import interrapidisimo.domain.Guia;
import interrapidisimo.domain.Paquete;

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
 * An implementation of the model object '<em><b>Factory Bodega</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.impl.FactoryBodegaImpl#getLstDomain <em>Lst Domain</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.FactoryBodegaImpl#getLstGuia <em>Lst Guia</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.FactoryBodegaImpl#getLstPaquete <em>Lst Paquete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryBodegaImpl extends EObjectImpl implements FactoryBodega {
	/**
	 * The cached value of the '{@link #getLstGuia() <em>Lst Guia</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstGuia()
	 * @generated
	 * @ordered
	 */
	protected EList<Guia> lstGuia;

	/**
	 * The cached value of the '{@link #getLstPaquete() <em>Lst Paquete</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPaquete()
	 * @generated
	 * @ordered
	 */
	protected EList<Paquete> lstPaquete;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryBodegaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.FACTORY_BODEGA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getLstDomain() {
		if (eContainerFeatureID() != DomainPackage.FACTORY_BODEGA__LST_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstDomain(Domain newLstDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLstDomain, DomainPackage.FACTORY_BODEGA__LST_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstDomain(Domain newLstDomain) {
		if (newLstDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.FACTORY_BODEGA__LST_DOMAIN && newLstDomain != null)) {
			if (EcoreUtil.isAncestor(this, newLstDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLstDomain != null)
				msgs = ((InternalEObject)newLstDomain).eInverseAdd(this, DomainPackage.DOMAIN__OWNED_BY_FACTORY_BODEGA, Domain.class, msgs);
			msgs = basicSetLstDomain(newLstDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FACTORY_BODEGA__LST_DOMAIN, newLstDomain, newLstDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guia> getLstGuia() {
		if (lstGuia == null) {
			lstGuia = new EObjectContainmentWithInverseEList<Guia>(Guia.class, this, DomainPackage.FACTORY_BODEGA__LST_GUIA, DomainPackage.GUIA__LST_FACTORY_BODEGA);
		}
		return lstGuia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paquete> getLstPaquete() {
		if (lstPaquete == null) {
			lstPaquete = new EObjectContainmentWithInverseEList<Paquete>(Paquete.class, this, DomainPackage.FACTORY_BODEGA__LST_PAQUETE, DomainPackage.PAQUETE__LST_FACTORY_BODEGA);
		}
		return lstPaquete;
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
			case DomainPackage.FACTORY_BODEGA__LST_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLstDomain((Domain)otherEnd, msgs);
			case DomainPackage.FACTORY_BODEGA__LST_GUIA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstGuia()).basicAdd(otherEnd, msgs);
			case DomainPackage.FACTORY_BODEGA__LST_PAQUETE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstPaquete()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.FACTORY_BODEGA__LST_DOMAIN:
				return basicSetLstDomain(null, msgs);
			case DomainPackage.FACTORY_BODEGA__LST_GUIA:
				return ((InternalEList<?>)getLstGuia()).basicRemove(otherEnd, msgs);
			case DomainPackage.FACTORY_BODEGA__LST_PAQUETE:
				return ((InternalEList<?>)getLstPaquete()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.FACTORY_BODEGA__LST_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__OWNED_BY_FACTORY_BODEGA, Domain.class, msgs);
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
			case DomainPackage.FACTORY_BODEGA__LST_DOMAIN:
				return getLstDomain();
			case DomainPackage.FACTORY_BODEGA__LST_GUIA:
				return getLstGuia();
			case DomainPackage.FACTORY_BODEGA__LST_PAQUETE:
				return getLstPaquete();
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
			case DomainPackage.FACTORY_BODEGA__LST_DOMAIN:
				setLstDomain((Domain)newValue);
				return;
			case DomainPackage.FACTORY_BODEGA__LST_GUIA:
				getLstGuia().clear();
				getLstGuia().addAll((Collection<? extends Guia>)newValue);
				return;
			case DomainPackage.FACTORY_BODEGA__LST_PAQUETE:
				getLstPaquete().clear();
				getLstPaquete().addAll((Collection<? extends Paquete>)newValue);
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
			case DomainPackage.FACTORY_BODEGA__LST_DOMAIN:
				setLstDomain((Domain)null);
				return;
			case DomainPackage.FACTORY_BODEGA__LST_GUIA:
				getLstGuia().clear();
				return;
			case DomainPackage.FACTORY_BODEGA__LST_PAQUETE:
				getLstPaquete().clear();
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
			case DomainPackage.FACTORY_BODEGA__LST_DOMAIN:
				return getLstDomain() != null;
			case DomainPackage.FACTORY_BODEGA__LST_GUIA:
				return lstGuia != null && !lstGuia.isEmpty();
			case DomainPackage.FACTORY_BODEGA__LST_PAQUETE:
				return lstPaquete != null && !lstPaquete.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FactoryBodegaImpl
