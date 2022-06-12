/**
 */
package interrapidisimo.domain.impl;

import interrapidisimo.domain.Cliente;
import interrapidisimo.domain.DomainPackage;
import interrapidisimo.domain.FactoryGestionHumana;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.impl.ClienteImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.ClienteImpl#getID <em>ID</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.ClienteImpl#getEdad <em>Edad</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.ClienteImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.ClienteImpl#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.ClienteImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.ClienteImpl#getTipoCliente <em>Tipo Cliente</em>}</li>
 *   <li>{@link interrapidisimo.domain.impl.ClienteImpl#getLstFactoryGestionHumana <em>Lst Factory Gestion Humana</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClienteImpl extends EObjectImpl implements Cliente {
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
	 * The default value of the '{@link #getEdad() <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdad()
	 * @generated
	 * @ordered
	 */
	protected static final String EDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdad() <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdad()
	 * @generated
	 * @ordered
	 */
	protected String edad = EDAD_EDEFAULT;

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
	 * The default value of the '{@link #getTipoCliente() <em>Tipo Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoCliente()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_CLIENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoCliente() <em>Tipo Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoCliente()
	 * @generated
	 * @ordered
	 */
	protected String tipoCliente = TIPO_CLIENTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClienteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.CLIENTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdad(String newEdad) {
		String oldEdad = edad;
		edad = newEdad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__EDAD, oldEdad, edad));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__TELEFONO, oldTelefono, telefono));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__DIRECCION, oldDireccion, direccion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoCliente() {
		return tipoCliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoCliente(String newTipoCliente) {
		String oldTipoCliente = tipoCliente;
		tipoCliente = newTipoCliente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__TIPO_CLIENTE, oldTipoCliente, tipoCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryGestionHumana getLstFactoryGestionHumana() {
		if (eContainerFeatureID() != DomainPackage.CLIENTE__LST_FACTORY_GESTION_HUMANA) return null;
		return (FactoryGestionHumana)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstFactoryGestionHumana(FactoryGestionHumana newLstFactoryGestionHumana, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLstFactoryGestionHumana, DomainPackage.CLIENTE__LST_FACTORY_GESTION_HUMANA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstFactoryGestionHumana(FactoryGestionHumana newLstFactoryGestionHumana) {
		if (newLstFactoryGestionHumana != eInternalContainer() || (eContainerFeatureID() != DomainPackage.CLIENTE__LST_FACTORY_GESTION_HUMANA && newLstFactoryGestionHumana != null)) {
			if (EcoreUtil.isAncestor(this, newLstFactoryGestionHumana))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLstFactoryGestionHumana != null)
				msgs = ((InternalEObject)newLstFactoryGestionHumana).eInverseAdd(this, DomainPackage.FACTORY_GESTION_HUMANA__LST_CLIENTE, FactoryGestionHumana.class, msgs);
			msgs = basicSetLstFactoryGestionHumana(newLstFactoryGestionHumana, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__LST_FACTORY_GESTION_HUMANA, newLstFactoryGestionHumana, newLstFactoryGestionHumana));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.CLIENTE__LST_FACTORY_GESTION_HUMANA:
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
			case DomainPackage.CLIENTE__LST_FACTORY_GESTION_HUMANA:
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
			case DomainPackage.CLIENTE__LST_FACTORY_GESTION_HUMANA:
				return eInternalContainer().eInverseRemove(this, DomainPackage.FACTORY_GESTION_HUMANA__LST_CLIENTE, FactoryGestionHumana.class, msgs);
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
			case DomainPackage.CLIENTE__NOMBRE:
				return getNombre();
			case DomainPackage.CLIENTE__ID:
				return getID();
			case DomainPackage.CLIENTE__EDAD:
				return getEdad();
			case DomainPackage.CLIENTE__TELEFONO:
				return getTelefono();
			case DomainPackage.CLIENTE__DIRECCION:
				return getDireccion();
			case DomainPackage.CLIENTE__EMAIL:
				return getEmail();
			case DomainPackage.CLIENTE__TIPO_CLIENTE:
				return getTipoCliente();
			case DomainPackage.CLIENTE__LST_FACTORY_GESTION_HUMANA:
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
			case DomainPackage.CLIENTE__NOMBRE:
				setNombre((String)newValue);
				return;
			case DomainPackage.CLIENTE__ID:
				setID((String)newValue);
				return;
			case DomainPackage.CLIENTE__EDAD:
				setEdad((String)newValue);
				return;
			case DomainPackage.CLIENTE__TELEFONO:
				setTelefono((String)newValue);
				return;
			case DomainPackage.CLIENTE__DIRECCION:
				setDireccion((String)newValue);
				return;
			case DomainPackage.CLIENTE__EMAIL:
				setEmail((String)newValue);
				return;
			case DomainPackage.CLIENTE__TIPO_CLIENTE:
				setTipoCliente((String)newValue);
				return;
			case DomainPackage.CLIENTE__LST_FACTORY_GESTION_HUMANA:
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
			case DomainPackage.CLIENTE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DomainPackage.CLIENTE__ID:
				setID(ID_EDEFAULT);
				return;
			case DomainPackage.CLIENTE__EDAD:
				setEdad(EDAD_EDEFAULT);
				return;
			case DomainPackage.CLIENTE__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
				return;
			case DomainPackage.CLIENTE__DIRECCION:
				setDireccion(DIRECCION_EDEFAULT);
				return;
			case DomainPackage.CLIENTE__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case DomainPackage.CLIENTE__TIPO_CLIENTE:
				setTipoCliente(TIPO_CLIENTE_EDEFAULT);
				return;
			case DomainPackage.CLIENTE__LST_FACTORY_GESTION_HUMANA:
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
			case DomainPackage.CLIENTE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DomainPackage.CLIENTE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case DomainPackage.CLIENTE__EDAD:
				return EDAD_EDEFAULT == null ? edad != null : !EDAD_EDEFAULT.equals(edad);
			case DomainPackage.CLIENTE__TELEFONO:
				return TELEFONO_EDEFAULT == null ? telefono != null : !TELEFONO_EDEFAULT.equals(telefono);
			case DomainPackage.CLIENTE__DIRECCION:
				return DIRECCION_EDEFAULT == null ? direccion != null : !DIRECCION_EDEFAULT.equals(direccion);
			case DomainPackage.CLIENTE__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case DomainPackage.CLIENTE__TIPO_CLIENTE:
				return TIPO_CLIENTE_EDEFAULT == null ? tipoCliente != null : !TIPO_CLIENTE_EDEFAULT.equals(tipoCliente);
			case DomainPackage.CLIENTE__LST_FACTORY_GESTION_HUMANA:
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
		result.append(", edad: ");
		result.append(edad);
		result.append(", telefono: ");
		result.append(telefono);
		result.append(", direccion: ");
		result.append(direccion);
		result.append(", email: ");
		result.append(email);
		result.append(", tipoCliente: ");
		result.append(tipoCliente);
		result.append(')');
		return result.toString();
	}

} //ClienteImpl
