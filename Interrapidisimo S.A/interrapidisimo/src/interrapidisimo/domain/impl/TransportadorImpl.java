/**
 */
package interrapidisimo.domain.impl;

import interrapidisimo.domain.DomainPackage;
import interrapidisimo.domain.FactoryGestionHumana;
import interrapidisimo.domain.Transportador;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transportador</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.impl.TransportadorImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.TransportadorImpl#getID <em>ID</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.TransportadorImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.TransportadorImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.TransportadorImpl#getEstadoEmpleado <em>Estado Empleado</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.TransportadorImpl#getLstFactoryGestionHumana <em>Lst Factory Gestion Humana</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransportadorImpl extends EObjectImpl implements Transportador {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

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
	 * The default value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected String telefono = TELEFONO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstadoEmpleado() <em>Estado Empleado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstadoEmpleado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EMPLEADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstadoEmpleado() <em>Estado Empleado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstadoEmpleado()
	 * @generated
	 * @ordered
	 */
	protected String estadoEmpleado = ESTADO_EMPLEADO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportadorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.TRANSPORTADOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TRANSPORTADOR__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TRANSPORTADOR__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefono(String newTelefono) {
		String oldTelefono = telefono;
		telefono = newTelefono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TRANSPORTADOR__TELEFONO, oldTelefono, telefono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TRANSPORTADOR__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstadoEmpleado() {
		return estadoEmpleado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstadoEmpleado(String newEstadoEmpleado) {
		String oldEstadoEmpleado = estadoEmpleado;
		estadoEmpleado = newEstadoEmpleado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TRANSPORTADOR__ESTADO_EMPLEADO, oldEstadoEmpleado, estadoEmpleado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryGestionHumana getLstFactoryGestionHumana() {
		if (eContainerFeatureID() != DomainPackage.TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA) return null;
		return (FactoryGestionHumana)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstFactoryGestionHumana(FactoryGestionHumana newLstFactoryGestionHumana, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLstFactoryGestionHumana, DomainPackage.TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstFactoryGestionHumana(FactoryGestionHumana newLstFactoryGestionHumana) {
		if (newLstFactoryGestionHumana != eInternalContainer() || (eContainerFeatureID() != DomainPackage.TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA && newLstFactoryGestionHumana != null)) {
			if (EcoreUtil.isAncestor(this, newLstFactoryGestionHumana))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLstFactoryGestionHumana != null)
				msgs = ((InternalEObject)newLstFactoryGestionHumana).eInverseAdd(this, DomainPackage.FACTORY_GESTION_HUMANA__LST_TRANSPORTADOR, FactoryGestionHumana.class, msgs);
			msgs = basicSetLstFactoryGestionHumana(newLstFactoryGestionHumana, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA, newLstFactoryGestionHumana, newLstFactoryGestionHumana));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLstFactoryGestionHumana((FactoryGestionHumana)otherEnd, msgs);
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
			case DomainPackage.TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA:
				return basicSetLstFactoryGestionHumana(null, msgs);
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
			case DomainPackage.TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA:
				return eInternalContainer().eInverseRemove(this, DomainPackage.FACTORY_GESTION_HUMANA__LST_TRANSPORTADOR, FactoryGestionHumana.class, msgs);
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
			case DomainPackage.TRANSPORTADOR__NOMBRE:
				return getNombre();
			case DomainPackage.TRANSPORTADOR__ID:
				return getID();
			case DomainPackage.TRANSPORTADOR__TELEFONO:
				return getTelefono();
			case DomainPackage.TRANSPORTADOR__EMAIL:
				return getEmail();
			case DomainPackage.TRANSPORTADOR__ESTADO_EMPLEADO:
				return getEstadoEmpleado();
			case DomainPackage.TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA:
				return getLstFactoryGestionHumana();
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
			case DomainPackage.TRANSPORTADOR__NOMBRE:
				setNombre((String)newValue);
				return;
			case DomainPackage.TRANSPORTADOR__ID:
				setID((String)newValue);
				return;
			case DomainPackage.TRANSPORTADOR__TELEFONO:
				setTelefono((String)newValue);
				return;
			case DomainPackage.TRANSPORTADOR__EMAIL:
				setEmail((String)newValue);
				return;
			case DomainPackage.TRANSPORTADOR__ESTADO_EMPLEADO:
				setEstadoEmpleado((String)newValue);
				return;
			case DomainPackage.TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA:
				setLstFactoryGestionHumana((FactoryGestionHumana)newValue);
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
			case DomainPackage.TRANSPORTADOR__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DomainPackage.TRANSPORTADOR__ID:
				setID(ID_EDEFAULT);
				return;
			case DomainPackage.TRANSPORTADOR__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
				return;
			case DomainPackage.TRANSPORTADOR__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case DomainPackage.TRANSPORTADOR__ESTADO_EMPLEADO:
				setEstadoEmpleado(ESTADO_EMPLEADO_EDEFAULT);
				return;
			case DomainPackage.TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA:
				setLstFactoryGestionHumana((FactoryGestionHumana)null);
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
			case DomainPackage.TRANSPORTADOR__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DomainPackage.TRANSPORTADOR__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case DomainPackage.TRANSPORTADOR__TELEFONO:
				return TELEFONO_EDEFAULT == null ? telefono != null : !TELEFONO_EDEFAULT.equals(telefono);
			case DomainPackage.TRANSPORTADOR__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case DomainPackage.TRANSPORTADOR__ESTADO_EMPLEADO:
				return ESTADO_EMPLEADO_EDEFAULT == null ? estadoEmpleado != null : !ESTADO_EMPLEADO_EDEFAULT.equals(estadoEmpleado);
			case DomainPackage.TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA:
				return getLstFactoryGestionHumana() != null;
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", iD: ");
		result.append(iD);
		result.append(", telefono: ");
		result.append(telefono);
		result.append(", email: ");
		result.append(email);
		result.append(", estadoEmpleado: ");
		result.append(estadoEmpleado);
		result.append(')');
		return result.toString();
	}

} //TransportadorImpl
