/**
 */
package interrapidisimo.domain.impl;

import interrapidisimo.domain.DomainPackage;
import interrapidisimo.domain.FactoryBodega;
import interrapidisimo.domain.Paquete;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paquete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.impl.PaqueteImpl#getMedidas <em>Medidas</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.PaqueteImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.PaqueteImpl#getPeso <em>Peso</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.PaqueteImpl#getFecha <em>Fecha</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.PaqueteImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.PaqueteImpl#getLstFactoryBodega <em>Lst Factory Bodega</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaqueteImpl extends EObjectImpl implements Paquete {
	/**
	 * The default value of the '{@link #getMedidas() <em>Medidas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedidas()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIDAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedidas() <em>Medidas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedidas()
	 * @generated
	 * @ordered
	 */
	protected String medidas = MEDIDAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected String estado = ESTADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeso() <em>Peso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeso()
	 * @generated
	 * @ordered
	 */
	protected static final String PESO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeso() <em>Peso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeso()
	 * @generated
	 * @ordered
	 */
	protected String peso = PESO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected String fecha = FECHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaqueteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.PAQUETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMedidas() {
		return medidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedidas(String newMedidas) {
		String oldMedidas = medidas;
		medidas = newMedidas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PAQUETE__MEDIDAS, oldMedidas, medidas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(String newEstado) {
		String oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PAQUETE__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeso() {
		return peso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeso(String newPeso) {
		String oldPeso = peso;
		peso = newPeso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PAQUETE__PESO, oldPeso, peso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFecha(String newFecha) {
		String oldFecha = fecha;
		fecha = newFecha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PAQUETE__FECHA, oldFecha, fecha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PAQUETE__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryBodega getLstFactoryBodega() {
		if (eContainerFeatureID() != DomainPackage.PAQUETE__LST_FACTORY_BODEGA) return null;
		return (FactoryBodega)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstFactoryBodega(FactoryBodega newLstFactoryBodega, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLstFactoryBodega, DomainPackage.PAQUETE__LST_FACTORY_BODEGA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstFactoryBodega(FactoryBodega newLstFactoryBodega) {
		if (newLstFactoryBodega != eInternalContainer() || (eContainerFeatureID() != DomainPackage.PAQUETE__LST_FACTORY_BODEGA && newLstFactoryBodega != null)) {
			if (EcoreUtil.isAncestor(this, newLstFactoryBodega))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLstFactoryBodega != null)
				msgs = ((InternalEObject)newLstFactoryBodega).eInverseAdd(this, DomainPackage.FACTORY_BODEGA__LST_PAQUETE, FactoryBodega.class, msgs);
			msgs = basicSetLstFactoryBodega(newLstFactoryBodega, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PAQUETE__LST_FACTORY_BODEGA, newLstFactoryBodega, newLstFactoryBodega));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.PAQUETE__LST_FACTORY_BODEGA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLstFactoryBodega((FactoryBodega)otherEnd, msgs);
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
			case DomainPackage.PAQUETE__LST_FACTORY_BODEGA:
				return basicSetLstFactoryBodega(null, msgs);
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
			case DomainPackage.PAQUETE__LST_FACTORY_BODEGA:
				return eInternalContainer().eInverseRemove(this, DomainPackage.FACTORY_BODEGA__LST_PAQUETE, FactoryBodega.class, msgs);
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
			case DomainPackage.PAQUETE__MEDIDAS:
				return getMedidas();
			case DomainPackage.PAQUETE__ESTADO:
				return getEstado();
			case DomainPackage.PAQUETE__PESO:
				return getPeso();
			case DomainPackage.PAQUETE__FECHA:
				return getFecha();
			case DomainPackage.PAQUETE__DESCRIPCION:
				return getDescripcion();
			case DomainPackage.PAQUETE__LST_FACTORY_BODEGA:
				return getLstFactoryBodega();
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
			case DomainPackage.PAQUETE__MEDIDAS:
				setMedidas((String)newValue);
				return;
			case DomainPackage.PAQUETE__ESTADO:
				setEstado((String)newValue);
				return;
			case DomainPackage.PAQUETE__PESO:
				setPeso((String)newValue);
				return;
			case DomainPackage.PAQUETE__FECHA:
				setFecha((String)newValue);
				return;
			case DomainPackage.PAQUETE__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case DomainPackage.PAQUETE__LST_FACTORY_BODEGA:
				setLstFactoryBodega((FactoryBodega)newValue);
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
			case DomainPackage.PAQUETE__MEDIDAS:
				setMedidas(MEDIDAS_EDEFAULT);
				return;
			case DomainPackage.PAQUETE__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case DomainPackage.PAQUETE__PESO:
				setPeso(PESO_EDEFAULT);
				return;
			case DomainPackage.PAQUETE__FECHA:
				setFecha(FECHA_EDEFAULT);
				return;
			case DomainPackage.PAQUETE__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case DomainPackage.PAQUETE__LST_FACTORY_BODEGA:
				setLstFactoryBodega((FactoryBodega)null);
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
			case DomainPackage.PAQUETE__MEDIDAS:
				return MEDIDAS_EDEFAULT == null ? medidas != null : !MEDIDAS_EDEFAULT.equals(medidas);
			case DomainPackage.PAQUETE__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case DomainPackage.PAQUETE__PESO:
				return PESO_EDEFAULT == null ? peso != null : !PESO_EDEFAULT.equals(peso);
			case DomainPackage.PAQUETE__FECHA:
				return FECHA_EDEFAULT == null ? fecha != null : !FECHA_EDEFAULT.equals(fecha);
			case DomainPackage.PAQUETE__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case DomainPackage.PAQUETE__LST_FACTORY_BODEGA:
				return getLstFactoryBodega() != null;
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
		result.append(" (medidas: ");
		result.append(medidas);
		result.append(", estado: ");
		result.append(estado);
		result.append(", peso: ");
		result.append(peso);
		result.append(", fecha: ");
		result.append(fecha);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //PaqueteImpl
