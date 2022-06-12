/**
 */
package interrapidisimo.domain.impl;

import interrapidisimo.domain.DomainPackage;
import interrapidisimo.domain.FactoryBodega;
import interrapidisimo.domain.Guia;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.impl.GuiaImpl#getDestinatario <em>Destinatario</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.GuiaImpl#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.GuiaImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.GuiaImpl#getFechaEstimada <em>Fecha Estimada</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.GuiaImpl#getID <em>ID</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.GuiaImpl#getRemitente <em>Remitente</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.GuiaImpl#getTipoEntrega <em>Tipo Entrega</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.GuiaImpl#getLstFactoryBodega <em>Lst Factory Bodega</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuiaImpl extends EObjectImpl implements Guia {
	/**
	 * The default value of the '{@link #getDestinatario() <em>Destinatario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinatario()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATARIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinatario() <em>Destinatario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinatario()
	 * @generated
	 * @ordered
	 */
	protected String destinatario = DESTINATARIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected String direccion = DIRECCION_EDEFAULT;

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
	 * The default value of the '{@link #getFechaEstimada() <em>Fecha Estimada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaEstimada()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_ESTIMADA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaEstimada() <em>Fecha Estimada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaEstimada()
	 * @generated
	 * @ordered
	 */
	protected String fechaEstimada = FECHA_ESTIMADA_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemitente() <em>Remitente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemitente()
	 * @generated
	 * @ordered
	 */
	protected static final String REMITENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemitente() <em>Remitente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemitente()
	 * @generated
	 * @ordered
	 */
	protected String remitente = REMITENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoEntrega() <em>Tipo Entrega</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoEntrega()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_ENTREGA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoEntrega() <em>Tipo Entrega</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoEntrega()
	 * @generated
	 * @ordered
	 */
	protected String tipoEntrega = TIPO_ENTREGA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.GUIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinatario() {
		return destinatario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinatario(String newDestinatario) {
		String oldDestinatario = destinatario;
		destinatario = newDestinatario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GUIA__DESTINATARIO, oldDestinatario, destinatario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDireccion(String newDireccion) {
		String oldDireccion = direccion;
		direccion = newDireccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GUIA__DIRECCION, oldDireccion, direccion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GUIA__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaEstimada() {
		return fechaEstimada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaEstimada(String newFechaEstimada) {
		String oldFechaEstimada = fechaEstimada;
		fechaEstimada = newFechaEstimada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GUIA__FECHA_ESTIMADA, oldFechaEstimada, fechaEstimada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GUIA__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemitente() {
		return remitente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemitente(String newRemitente) {
		String oldRemitente = remitente;
		remitente = newRemitente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GUIA__REMITENTE, oldRemitente, remitente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoEntrega() {
		return tipoEntrega;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoEntrega(String newTipoEntrega) {
		String oldTipoEntrega = tipoEntrega;
		tipoEntrega = newTipoEntrega;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GUIA__TIPO_ENTREGA, oldTipoEntrega, tipoEntrega));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryBodega getLstFactoryBodega() {
		if (eContainerFeatureID() != DomainPackage.GUIA__LST_FACTORY_BODEGA) return null;
		return (FactoryBodega)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstFactoryBodega(FactoryBodega newLstFactoryBodega, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLstFactoryBodega, DomainPackage.GUIA__LST_FACTORY_BODEGA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstFactoryBodega(FactoryBodega newLstFactoryBodega) {
		if (newLstFactoryBodega != eInternalContainer() || (eContainerFeatureID() != DomainPackage.GUIA__LST_FACTORY_BODEGA && newLstFactoryBodega != null)) {
			if (EcoreUtil.isAncestor(this, newLstFactoryBodega))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLstFactoryBodega != null)
				msgs = ((InternalEObject)newLstFactoryBodega).eInverseAdd(this, DomainPackage.FACTORY_BODEGA__LST_GUIA, FactoryBodega.class, msgs);
			msgs = basicSetLstFactoryBodega(newLstFactoryBodega, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GUIA__LST_FACTORY_BODEGA, newLstFactoryBodega, newLstFactoryBodega));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.GUIA__LST_FACTORY_BODEGA:
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
			case DomainPackage.GUIA__LST_FACTORY_BODEGA:
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
			case DomainPackage.GUIA__LST_FACTORY_BODEGA:
				return eInternalContainer().eInverseRemove(this, DomainPackage.FACTORY_BODEGA__LST_GUIA, FactoryBodega.class, msgs);
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
			case DomainPackage.GUIA__DESTINATARIO:
				return getDestinatario();
			case DomainPackage.GUIA__DIRECCION:
				return getDireccion();
			case DomainPackage.GUIA__ESTADO:
				return getEstado();
			case DomainPackage.GUIA__FECHA_ESTIMADA:
				return getFechaEstimada();
			case DomainPackage.GUIA__ID:
				return getID();
			case DomainPackage.GUIA__REMITENTE:
				return getRemitente();
			case DomainPackage.GUIA__TIPO_ENTREGA:
				return getTipoEntrega();
			case DomainPackage.GUIA__LST_FACTORY_BODEGA:
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
			case DomainPackage.GUIA__DESTINATARIO:
				setDestinatario((String)newValue);
				return;
			case DomainPackage.GUIA__DIRECCION:
				setDireccion((String)newValue);
				return;
			case DomainPackage.GUIA__ESTADO:
				setEstado((String)newValue);
				return;
			case DomainPackage.GUIA__FECHA_ESTIMADA:
				setFechaEstimada((String)newValue);
				return;
			case DomainPackage.GUIA__ID:
				setID((String)newValue);
				return;
			case DomainPackage.GUIA__REMITENTE:
				setRemitente((String)newValue);
				return;
			case DomainPackage.GUIA__TIPO_ENTREGA:
				setTipoEntrega((String)newValue);
				return;
			case DomainPackage.GUIA__LST_FACTORY_BODEGA:
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
			case DomainPackage.GUIA__DESTINATARIO:
				setDestinatario(DESTINATARIO_EDEFAULT);
				return;
			case DomainPackage.GUIA__DIRECCION:
				setDireccion(DIRECCION_EDEFAULT);
				return;
			case DomainPackage.GUIA__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case DomainPackage.GUIA__FECHA_ESTIMADA:
				setFechaEstimada(FECHA_ESTIMADA_EDEFAULT);
				return;
			case DomainPackage.GUIA__ID:
				setID(ID_EDEFAULT);
				return;
			case DomainPackage.GUIA__REMITENTE:
				setRemitente(REMITENTE_EDEFAULT);
				return;
			case DomainPackage.GUIA__TIPO_ENTREGA:
				setTipoEntrega(TIPO_ENTREGA_EDEFAULT);
				return;
			case DomainPackage.GUIA__LST_FACTORY_BODEGA:
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
			case DomainPackage.GUIA__DESTINATARIO:
				return DESTINATARIO_EDEFAULT == null ? destinatario != null : !DESTINATARIO_EDEFAULT.equals(destinatario);
			case DomainPackage.GUIA__DIRECCION:
				return DIRECCION_EDEFAULT == null ? direccion != null : !DIRECCION_EDEFAULT.equals(direccion);
			case DomainPackage.GUIA__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case DomainPackage.GUIA__FECHA_ESTIMADA:
				return FECHA_ESTIMADA_EDEFAULT == null ? fechaEstimada != null : !FECHA_ESTIMADA_EDEFAULT.equals(fechaEstimada);
			case DomainPackage.GUIA__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case DomainPackage.GUIA__REMITENTE:
				return REMITENTE_EDEFAULT == null ? remitente != null : !REMITENTE_EDEFAULT.equals(remitente);
			case DomainPackage.GUIA__TIPO_ENTREGA:
				return TIPO_ENTREGA_EDEFAULT == null ? tipoEntrega != null : !TIPO_ENTREGA_EDEFAULT.equals(tipoEntrega);
			case DomainPackage.GUIA__LST_FACTORY_BODEGA:
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
		result.append(" (destinatario: ");
		result.append(destinatario);
		result.append(", direccion: ");
		result.append(direccion);
		result.append(", estado: ");
		result.append(estado);
		result.append(", fechaEstimada: ");
		result.append(fechaEstimada);
		result.append(", iD: ");
		result.append(iD);
		result.append(", remitente: ");
		result.append(remitente);
		result.append(", tipoEntrega: ");
		result.append(tipoEntrega);
		result.append(')');
		return result.toString();
	}

} //GuiaImpl
