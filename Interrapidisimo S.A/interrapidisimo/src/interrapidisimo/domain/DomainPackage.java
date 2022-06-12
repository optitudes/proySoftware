/**
 */
package interrapidisimo.domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see interrapidisimo.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///interrapidisimo/domain.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "interrapidisimo.domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = interrapidisimo.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link interrapidisimo.domain.impl.ClienteImpl <em>Cliente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interrapidisimo.domain.impl.ClienteImpl
	 * @see interrapidisimo.domain.impl.DomainPackageImpl#getCliente()
	 * @generated
	 */
	int CLIENTE = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__ID = 1;

	/**
	 * The feature id for the '<em><b>Edad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__EDAD = 2;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__TELEFONO = 3;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__DIRECCION = 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__EMAIL = 5;

	/**
	 * The feature id for the '<em><b>Tipo Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__TIPO_CLIENTE = 6;

	/**
	 * The feature id for the '<em><b>Lst Factory Gestion Humana</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__LST_FACTORY_GESTION_HUMANA = 7;

	/**
	 * The number of structural features of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link interrapidisimo.domain.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interrapidisimo.domain.impl.DomainImpl
	 * @see interrapidisimo.domain.impl.DomainPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Owned By Factory Bodega</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__OWNED_BY_FACTORY_BODEGA = 1;

	/**
	 * The feature id for the '<em><b>The Factory Gestion Humana</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_FACTORY_GESTION_HUMANA = 2;

	/**
	 * The feature id for the '<em><b>Lst Factory Pago</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LST_FACTORY_PAGO = 3;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_UI = 4;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link interrapidisimo.domain.impl.EmpleadoImpl <em>Empleado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interrapidisimo.domain.impl.EmpleadoImpl
	 * @see interrapidisimo.domain.impl.DomainPackageImpl#getEmpleado()
	 * @generated
	 */
	int EMPLEADO = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__ID = 1;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__TELEFONO = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Tipo Empleado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__TIPO_EMPLEADO = 4;

	/**
	 * The feature id for the '<em><b>Estado Empleado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__ESTADO_EMPLEADO = 5;

	/**
	 * The feature id for the '<em><b>Lst Factory Gestion Humana</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__LST_FACTORY_GESTION_HUMANA = 6;

	/**
	 * The number of structural features of the '<em>Empleado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link interrapidisimo.domain.impl.FactoryBodegaImpl <em>Factory Bodega</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interrapidisimo.domain.impl.FactoryBodegaImpl
	 * @see interrapidisimo.domain.impl.DomainPackageImpl#getFactoryBodega()
	 * @generated
	 */
	int FACTORY_BODEGA = 3;

	/**
	 * The feature id for the '<em><b>Lst Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_BODEGA__LST_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Lst Guia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_BODEGA__LST_GUIA = 1;

	/**
	 * The feature id for the '<em><b>Lst Paquete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_BODEGA__LST_PAQUETE = 2;

	/**
	 * The number of structural features of the '<em>Factory Bodega</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_BODEGA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link interrapidisimo.domain.impl.FactoryGestionHumanaImpl <em>Factory Gestion Humana</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interrapidisimo.domain.impl.FactoryGestionHumanaImpl
	 * @see interrapidisimo.domain.impl.DomainPackageImpl#getFactoryGestionHumana()
	 * @generated
	 */
	int FACTORY_GESTION_HUMANA = 4;

	/**
	 * The feature id for the '<em><b>Lst Cliente</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_HUMANA__LST_CLIENTE = 0;

	/**
	 * The feature id for the '<em><b>Lst Empleado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_HUMANA__LST_EMPLEADO = 1;

	/**
	 * The feature id for the '<em><b>Owned By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN = 2;

	/**
	 * The feature id for the '<em><b>Lst Transportador</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_HUMANA__LST_TRANSPORTADOR = 3;

	/**
	 * The number of structural features of the '<em>Factory Gestion Humana</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_HUMANA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link interrapidisimo.domain.impl.FactoryPagoImpl <em>Factory Pago</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interrapidisimo.domain.impl.FactoryPagoImpl
	 * @see interrapidisimo.domain.impl.DomainPackageImpl#getFactoryPago()
	 * @generated
	 */
	int FACTORY_PAGO = 5;

	/**
	 * The feature id for the '<em><b>Owned By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PAGO__OWNED_BY_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Lst Factura</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PAGO__LST_FACTURA = 1;

	/**
	 * The number of structural features of the '<em>Factory Pago</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PAGO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link interrapidisimo.domain.impl.FacturaImpl <em>Factura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interrapidisimo.domain.impl.FacturaImpl
	 * @see interrapidisimo.domain.impl.DomainPackageImpl#getFactura()
	 * @generated
	 */
	int FACTURA = 6;

	/**
	 * The feature id for the '<em><b>Tipo Pago</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA__TIPO_PAGO = 0;

	/**
	 * The feature id for the '<em><b>Costo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA__COSTO = 1;

	/**
	 * The feature id for the '<em><b>Lst Factory Pago</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA__LST_FACTORY_PAGO = 2;

	/**
	 * The number of structural features of the '<em>Factura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link interrapidisimo.domain.impl.GuiaImpl <em>Guia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interrapidisimo.domain.impl.GuiaImpl
	 * @see interrapidisimo.domain.impl.DomainPackageImpl#getGuia()
	 * @generated
	 */
	int GUIA = 7;

	/**
	 * The feature id for the '<em><b>Destinatario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__DESTINATARIO = 0;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__DIRECCION = 1;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__ESTADO = 2;

	/**
	 * The feature id for the '<em><b>Fecha Estimada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__FECHA_ESTIMADA = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__ID = 4;

	/**
	 * The feature id for the '<em><b>Remitente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__REMITENTE = 5;

	/**
	 * The feature id for the '<em><b>Tipo Entrega</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__TIPO_ENTREGA = 6;

	/**
	 * The feature id for the '<em><b>Lst Factory Bodega</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__LST_FACTORY_BODEGA = 7;

	/**
	 * The number of structural features of the '<em>Guia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link interrapidisimo.domain.impl.PaqueteImpl <em>Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interrapidisimo.domain.impl.PaqueteImpl
	 * @see interrapidisimo.domain.impl.DomainPackageImpl#getPaquete()
	 * @generated
	 */
	int PAQUETE = 8;

	/**
	 * The feature id for the '<em><b>Medidas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__MEDIDAS = 0;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__ESTADO = 1;

	/**
	 * The feature id for the '<em><b>Peso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__PESO = 2;

	/**
	 * The feature id for the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__FECHA = 3;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__DESCRIPCION = 4;

	/**
	 * The feature id for the '<em><b>Lst Factory Bodega</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__LST_FACTORY_BODEGA = 5;

	/**
	 * The number of structural features of the '<em>Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link interrapidisimo.domain.impl.TransportadorImpl <em>Transportador</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interrapidisimo.domain.impl.TransportadorImpl
	 * @see interrapidisimo.domain.impl.DomainPackageImpl#getTransportador()
	 * @generated
	 */
	int TRANSPORTADOR = 9;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTADOR__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTADOR__ID = 1;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTADOR__TELEFONO = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTADOR__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Estado Empleado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTADOR__ESTADO_EMPLEADO = 4;

	/**
	 * The feature id for the '<em><b>Lst Factory Gestion Humana</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA = 5;

	/**
	 * The number of structural features of the '<em>Transportador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTADOR_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link interrapidisimo.domain.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente</em>'.
	 * @see interrapidisimo.domain.Cliente
	 * @generated
	 */
	EClass getCliente();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Cliente#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see interrapidisimo.domain.Cliente#getNombre()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Cliente#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see interrapidisimo.domain.Cliente#getID()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_ID();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Cliente#getEdad <em>Edad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edad</em>'.
	 * @see interrapidisimo.domain.Cliente#getEdad()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Edad();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Cliente#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see interrapidisimo.domain.Cliente#getTelefono()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Telefono();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Cliente#getDireccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion</em>'.
	 * @see interrapidisimo.domain.Cliente#getDireccion()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Direccion();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Cliente#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see interrapidisimo.domain.Cliente#getEmail()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Email();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Cliente#getTipoCliente <em>Tipo Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Cliente</em>'.
	 * @see interrapidisimo.domain.Cliente#getTipoCliente()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_TipoCliente();

	/**
	 * Returns the meta object for the container reference '{@link interrapidisimo.domain.Cliente#getLstFactoryGestionHumana <em>Lst Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lst Factory Gestion Humana</em>'.
	 * @see interrapidisimo.domain.Cliente#getLstFactoryGestionHumana()
	 * @see #getCliente()
	 * @generated
	 */
	EReference getCliente_LstFactoryGestionHumana();

	/**
	 * Returns the meta object for class '{@link interrapidisimo.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see interrapidisimo.domain.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the container reference '{@link interrapidisimo.domain.Domain#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see interrapidisimo.domain.Domain#getTheModelFactory()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheModelFactory();

	/**
	 * Returns the meta object for the containment reference '{@link interrapidisimo.domain.Domain#getOwnedByFactoryBodega <em>Owned By Factory Bodega</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned By Factory Bodega</em>'.
	 * @see interrapidisimo.domain.Domain#getOwnedByFactoryBodega()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_OwnedByFactoryBodega();

	/**
	 * Returns the meta object for the containment reference '{@link interrapidisimo.domain.Domain#getTheFactoryGestionHumana <em>The Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Factory Gestion Humana</em>'.
	 * @see interrapidisimo.domain.Domain#getTheFactoryGestionHumana()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheFactoryGestionHumana();

	/**
	 * Returns the meta object for the containment reference list '{@link interrapidisimo.domain.Domain#getLstFactoryPago <em>Lst Factory Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Factory Pago</em>'.
	 * @see interrapidisimo.domain.Domain#getLstFactoryPago()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_LstFactoryPago();

	/**
	 * Returns the meta object for the reference '{@link interrapidisimo.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The UI</em>'.
	 * @see interrapidisimo.domain.Domain#getTheUI()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheUI();

	/**
	 * Returns the meta object for class '{@link interrapidisimo.domain.Empleado <em>Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empleado</em>'.
	 * @see interrapidisimo.domain.Empleado
	 * @generated
	 */
	EClass getEmpleado();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Empleado#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see interrapidisimo.domain.Empleado#getNombre()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Empleado#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see interrapidisimo.domain.Empleado#getID()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_ID();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Empleado#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see interrapidisimo.domain.Empleado#getTelefono()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_Telefono();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Empleado#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see interrapidisimo.domain.Empleado#getEmail()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_Email();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Empleado#getTipoEmpleado <em>Tipo Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Empleado</em>'.
	 * @see interrapidisimo.domain.Empleado#getTipoEmpleado()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_TipoEmpleado();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Empleado#getEstadoEmpleado <em>Estado Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado Empleado</em>'.
	 * @see interrapidisimo.domain.Empleado#getEstadoEmpleado()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_EstadoEmpleado();

	/**
	 * Returns the meta object for the container reference '{@link interrapidisimo.domain.Empleado#getLstFactoryGestionHumana <em>Lst Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lst Factory Gestion Humana</em>'.
	 * @see interrapidisimo.domain.Empleado#getLstFactoryGestionHumana()
	 * @see #getEmpleado()
	 * @generated
	 */
	EReference getEmpleado_LstFactoryGestionHumana();

	/**
	 * Returns the meta object for class '{@link interrapidisimo.domain.FactoryBodega <em>Factory Bodega</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Bodega</em>'.
	 * @see interrapidisimo.domain.FactoryBodega
	 * @generated
	 */
	EClass getFactoryBodega();

	/**
	 * Returns the meta object for the container reference '{@link interrapidisimo.domain.FactoryBodega#getLstDomain <em>Lst Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lst Domain</em>'.
	 * @see interrapidisimo.domain.FactoryBodega#getLstDomain()
	 * @see #getFactoryBodega()
	 * @generated
	 */
	EReference getFactoryBodega_LstDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link interrapidisimo.domain.FactoryBodega#getLstGuia <em>Lst Guia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Guia</em>'.
	 * @see interrapidisimo.domain.FactoryBodega#getLstGuia()
	 * @see #getFactoryBodega()
	 * @generated
	 */
	EReference getFactoryBodega_LstGuia();

	/**
	 * Returns the meta object for the containment reference list '{@link interrapidisimo.domain.FactoryBodega#getLstPaquete <em>Lst Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Paquete</em>'.
	 * @see interrapidisimo.domain.FactoryBodega#getLstPaquete()
	 * @see #getFactoryBodega()
	 * @generated
	 */
	EReference getFactoryBodega_LstPaquete();

	/**
	 * Returns the meta object for class '{@link interrapidisimo.domain.FactoryGestionHumana <em>Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Gestion Humana</em>'.
	 * @see interrapidisimo.domain.FactoryGestionHumana
	 * @generated
	 */
	EClass getFactoryGestionHumana();

	/**
	 * Returns the meta object for the containment reference list '{@link interrapidisimo.domain.FactoryGestionHumana#getLstCliente <em>Lst Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Cliente</em>'.
	 * @see interrapidisimo.domain.FactoryGestionHumana#getLstCliente()
	 * @see #getFactoryGestionHumana()
	 * @generated
	 */
	EReference getFactoryGestionHumana_LstCliente();

	/**
	 * Returns the meta object for the containment reference list '{@link interrapidisimo.domain.FactoryGestionHumana#getLstEmpleado <em>Lst Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Empleado</em>'.
	 * @see interrapidisimo.domain.FactoryGestionHumana#getLstEmpleado()
	 * @see #getFactoryGestionHumana()
	 * @generated
	 */
	EReference getFactoryGestionHumana_LstEmpleado();

	/**
	 * Returns the meta object for the container reference '{@link interrapidisimo.domain.FactoryGestionHumana#getOwnedByDomain <em>Owned By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Domain</em>'.
	 * @see interrapidisimo.domain.FactoryGestionHumana#getOwnedByDomain()
	 * @see #getFactoryGestionHumana()
	 * @generated
	 */
	EReference getFactoryGestionHumana_OwnedByDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link interrapidisimo.domain.FactoryGestionHumana#getLstTransportador <em>Lst Transportador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Transportador</em>'.
	 * @see interrapidisimo.domain.FactoryGestionHumana#getLstTransportador()
	 * @see #getFactoryGestionHumana()
	 * @generated
	 */
	EReference getFactoryGestionHumana_LstTransportador();

	/**
	 * Returns the meta object for class '{@link interrapidisimo.domain.FactoryPago <em>Factory Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Pago</em>'.
	 * @see interrapidisimo.domain.FactoryPago
	 * @generated
	 */
	EClass getFactoryPago();

	/**
	 * Returns the meta object for the container reference '{@link interrapidisimo.domain.FactoryPago#getOwnedByDomain <em>Owned By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Domain</em>'.
	 * @see interrapidisimo.domain.FactoryPago#getOwnedByDomain()
	 * @see #getFactoryPago()
	 * @generated
	 */
	EReference getFactoryPago_OwnedByDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link interrapidisimo.domain.FactoryPago#getLstFactura <em>Lst Factura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Factura</em>'.
	 * @see interrapidisimo.domain.FactoryPago#getLstFactura()
	 * @see #getFactoryPago()
	 * @generated
	 */
	EReference getFactoryPago_LstFactura();

	/**
	 * Returns the meta object for class '{@link interrapidisimo.domain.Factura <em>Factura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factura</em>'.
	 * @see interrapidisimo.domain.Factura
	 * @generated
	 */
	EClass getFactura();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Factura#getTipoPago <em>Tipo Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Pago</em>'.
	 * @see interrapidisimo.domain.Factura#getTipoPago()
	 * @see #getFactura()
	 * @generated
	 */
	EAttribute getFactura_TipoPago();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Factura#getCosto <em>Costo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Costo</em>'.
	 * @see interrapidisimo.domain.Factura#getCosto()
	 * @see #getFactura()
	 * @generated
	 */
	EAttribute getFactura_Costo();

	/**
	 * Returns the meta object for the container reference '{@link interrapidisimo.domain.Factura#getLstFactoryPago <em>Lst Factory Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lst Factory Pago</em>'.
	 * @see interrapidisimo.domain.Factura#getLstFactoryPago()
	 * @see #getFactura()
	 * @generated
	 */
	EReference getFactura_LstFactoryPago();

	/**
	 * Returns the meta object for class '{@link interrapidisimo.domain.Guia <em>Guia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guia</em>'.
	 * @see interrapidisimo.domain.Guia
	 * @generated
	 */
	EClass getGuia();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Guia#getDestinatario <em>Destinatario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destinatario</em>'.
	 * @see interrapidisimo.domain.Guia#getDestinatario()
	 * @see #getGuia()
	 * @generated
	 */
	EAttribute getGuia_Destinatario();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Guia#getDireccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion</em>'.
	 * @see interrapidisimo.domain.Guia#getDireccion()
	 * @see #getGuia()
	 * @generated
	 */
	EAttribute getGuia_Direccion();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Guia#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see interrapidisimo.domain.Guia#getEstado()
	 * @see #getGuia()
	 * @generated
	 */
	EAttribute getGuia_Estado();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Guia#getFechaEstimada <em>Fecha Estimada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Estimada</em>'.
	 * @see interrapidisimo.domain.Guia#getFechaEstimada()
	 * @see #getGuia()
	 * @generated
	 */
	EAttribute getGuia_FechaEstimada();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Guia#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see interrapidisimo.domain.Guia#getID()
	 * @see #getGuia()
	 * @generated
	 */
	EAttribute getGuia_ID();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Guia#getRemitente <em>Remitente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remitente</em>'.
	 * @see interrapidisimo.domain.Guia#getRemitente()
	 * @see #getGuia()
	 * @generated
	 */
	EAttribute getGuia_Remitente();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Guia#getTipoEntrega <em>Tipo Entrega</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Entrega</em>'.
	 * @see interrapidisimo.domain.Guia#getTipoEntrega()
	 * @see #getGuia()
	 * @generated
	 */
	EAttribute getGuia_TipoEntrega();

	/**
	 * Returns the meta object for the container reference '{@link interrapidisimo.domain.Guia#getLstFactoryBodega <em>Lst Factory Bodega</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lst Factory Bodega</em>'.
	 * @see interrapidisimo.domain.Guia#getLstFactoryBodega()
	 * @see #getGuia()
	 * @generated
	 */
	EReference getGuia_LstFactoryBodega();

	/**
	 * Returns the meta object for class '{@link interrapidisimo.domain.Paquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paquete</em>'.
	 * @see interrapidisimo.domain.Paquete
	 * @generated
	 */
	EClass getPaquete();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Paquete#getMedidas <em>Medidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medidas</em>'.
	 * @see interrapidisimo.domain.Paquete#getMedidas()
	 * @see #getPaquete()
	 * @generated
	 */
	EAttribute getPaquete_Medidas();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Paquete#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see interrapidisimo.domain.Paquete#getEstado()
	 * @see #getPaquete()
	 * @generated
	 */
	EAttribute getPaquete_Estado();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Paquete#getPeso <em>Peso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peso</em>'.
	 * @see interrapidisimo.domain.Paquete#getPeso()
	 * @see #getPaquete()
	 * @generated
	 */
	EAttribute getPaquete_Peso();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Paquete#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha</em>'.
	 * @see interrapidisimo.domain.Paquete#getFecha()
	 * @see #getPaquete()
	 * @generated
	 */
	EAttribute getPaquete_Fecha();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Paquete#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see interrapidisimo.domain.Paquete#getDescripcion()
	 * @see #getPaquete()
	 * @generated
	 */
	EAttribute getPaquete_Descripcion();

	/**
	 * Returns the meta object for the container reference '{@link interrapidisimo.domain.Paquete#getLstFactoryBodega <em>Lst Factory Bodega</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lst Factory Bodega</em>'.
	 * @see interrapidisimo.domain.Paquete#getLstFactoryBodega()
	 * @see #getPaquete()
	 * @generated
	 */
	EReference getPaquete_LstFactoryBodega();

	/**
	 * Returns the meta object for class '{@link interrapidisimo.domain.Transportador <em>Transportador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transportador</em>'.
	 * @see interrapidisimo.domain.Transportador
	 * @generated
	 */
	EClass getTransportador();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Transportador#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see interrapidisimo.domain.Transportador#getNombre()
	 * @see #getTransportador()
	 * @generated
	 */
	EAttribute getTransportador_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Transportador#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see interrapidisimo.domain.Transportador#getID()
	 * @see #getTransportador()
	 * @generated
	 */
	EAttribute getTransportador_ID();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Transportador#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see interrapidisimo.domain.Transportador#getTelefono()
	 * @see #getTransportador()
	 * @generated
	 */
	EAttribute getTransportador_Telefono();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Transportador#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see interrapidisimo.domain.Transportador#getEmail()
	 * @see #getTransportador()
	 * @generated
	 */
	EAttribute getTransportador_Email();

	/**
	 * Returns the meta object for the attribute '{@link interrapidisimo.domain.Transportador#getEstadoEmpleado <em>Estado Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado Empleado</em>'.
	 * @see interrapidisimo.domain.Transportador#getEstadoEmpleado()
	 * @see #getTransportador()
	 * @generated
	 */
	EAttribute getTransportador_EstadoEmpleado();

	/**
	 * Returns the meta object for the container reference '{@link interrapidisimo.domain.Transportador#getLstFactoryGestionHumana <em>Lst Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lst Factory Gestion Humana</em>'.
	 * @see interrapidisimo.domain.Transportador#getLstFactoryGestionHumana()
	 * @see #getTransportador()
	 * @generated
	 */
	EReference getTransportador_LstFactoryGestionHumana();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link interrapidisimo.domain.impl.ClienteImpl <em>Cliente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interrapidisimo.domain.impl.ClienteImpl
		 * @see interrapidisimo.domain.impl.DomainPackageImpl#getCliente()
		 * @generated
		 */
		EClass CLIENTE = eINSTANCE.getCliente();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__NOMBRE = eINSTANCE.getCliente_Nombre();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__ID = eINSTANCE.getCliente_ID();

		/**
		 * The meta object literal for the '<em><b>Edad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__EDAD = eINSTANCE.getCliente_Edad();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__TELEFONO = eINSTANCE.getCliente_Telefono();

		/**
		 * The meta object literal for the '<em><b>Direccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__DIRECCION = eINSTANCE.getCliente_Direccion();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__EMAIL = eINSTANCE.getCliente_Email();

		/**
		 * The meta object literal for the '<em><b>Tipo Cliente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__TIPO_CLIENTE = eINSTANCE.getCliente_TipoCliente();

		/**
		 * The meta object literal for the '<em><b>Lst Factory Gestion Humana</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE__LST_FACTORY_GESTION_HUMANA = eINSTANCE.getCliente_LstFactoryGestionHumana();

		/**
		 * The meta object literal for the '{@link interrapidisimo.domain.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interrapidisimo.domain.impl.DomainImpl
		 * @see interrapidisimo.domain.impl.DomainPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_MODEL_FACTORY = eINSTANCE.getDomain_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>Owned By Factory Bodega</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__OWNED_BY_FACTORY_BODEGA = eINSTANCE.getDomain_OwnedByFactoryBodega();

		/**
		 * The meta object literal for the '<em><b>The Factory Gestion Humana</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_FACTORY_GESTION_HUMANA = eINSTANCE.getDomain_TheFactoryGestionHumana();

		/**
		 * The meta object literal for the '<em><b>Lst Factory Pago</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LST_FACTORY_PAGO = eINSTANCE.getDomain_LstFactoryPago();

		/**
		 * The meta object literal for the '<em><b>The UI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_UI = eINSTANCE.getDomain_TheUI();

		/**
		 * The meta object literal for the '{@link interrapidisimo.domain.impl.EmpleadoImpl <em>Empleado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interrapidisimo.domain.impl.EmpleadoImpl
		 * @see interrapidisimo.domain.impl.DomainPackageImpl#getEmpleado()
		 * @generated
		 */
		EClass EMPLEADO = eINSTANCE.getEmpleado();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__NOMBRE = eINSTANCE.getEmpleado_Nombre();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__ID = eINSTANCE.getEmpleado_ID();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__TELEFONO = eINSTANCE.getEmpleado_Telefono();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__EMAIL = eINSTANCE.getEmpleado_Email();

		/**
		 * The meta object literal for the '<em><b>Tipo Empleado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__TIPO_EMPLEADO = eINSTANCE.getEmpleado_TipoEmpleado();

		/**
		 * The meta object literal for the '<em><b>Estado Empleado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__ESTADO_EMPLEADO = eINSTANCE.getEmpleado_EstadoEmpleado();

		/**
		 * The meta object literal for the '<em><b>Lst Factory Gestion Humana</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLEADO__LST_FACTORY_GESTION_HUMANA = eINSTANCE.getEmpleado_LstFactoryGestionHumana();

		/**
		 * The meta object literal for the '{@link interrapidisimo.domain.impl.FactoryBodegaImpl <em>Factory Bodega</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interrapidisimo.domain.impl.FactoryBodegaImpl
		 * @see interrapidisimo.domain.impl.DomainPackageImpl#getFactoryBodega()
		 * @generated
		 */
		EClass FACTORY_BODEGA = eINSTANCE.getFactoryBodega();

		/**
		 * The meta object literal for the '<em><b>Lst Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_BODEGA__LST_DOMAIN = eINSTANCE.getFactoryBodega_LstDomain();

		/**
		 * The meta object literal for the '<em><b>Lst Guia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_BODEGA__LST_GUIA = eINSTANCE.getFactoryBodega_LstGuia();

		/**
		 * The meta object literal for the '<em><b>Lst Paquete</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_BODEGA__LST_PAQUETE = eINSTANCE.getFactoryBodega_LstPaquete();

		/**
		 * The meta object literal for the '{@link interrapidisimo.domain.impl.FactoryGestionHumanaImpl <em>Factory Gestion Humana</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interrapidisimo.domain.impl.FactoryGestionHumanaImpl
		 * @see interrapidisimo.domain.impl.DomainPackageImpl#getFactoryGestionHumana()
		 * @generated
		 */
		EClass FACTORY_GESTION_HUMANA = eINSTANCE.getFactoryGestionHumana();

		/**
		 * The meta object literal for the '<em><b>Lst Cliente</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GESTION_HUMANA__LST_CLIENTE = eINSTANCE.getFactoryGestionHumana_LstCliente();

		/**
		 * The meta object literal for the '<em><b>Lst Empleado</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GESTION_HUMANA__LST_EMPLEADO = eINSTANCE.getFactoryGestionHumana_LstEmpleado();

		/**
		 * The meta object literal for the '<em><b>Owned By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN = eINSTANCE.getFactoryGestionHumana_OwnedByDomain();

		/**
		 * The meta object literal for the '<em><b>Lst Transportador</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GESTION_HUMANA__LST_TRANSPORTADOR = eINSTANCE.getFactoryGestionHumana_LstTransportador();

		/**
		 * The meta object literal for the '{@link interrapidisimo.domain.impl.FactoryPagoImpl <em>Factory Pago</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interrapidisimo.domain.impl.FactoryPagoImpl
		 * @see interrapidisimo.domain.impl.DomainPackageImpl#getFactoryPago()
		 * @generated
		 */
		EClass FACTORY_PAGO = eINSTANCE.getFactoryPago();

		/**
		 * The meta object literal for the '<em><b>Owned By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_PAGO__OWNED_BY_DOMAIN = eINSTANCE.getFactoryPago_OwnedByDomain();

		/**
		 * The meta object literal for the '<em><b>Lst Factura</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_PAGO__LST_FACTURA = eINSTANCE.getFactoryPago_LstFactura();

		/**
		 * The meta object literal for the '{@link interrapidisimo.domain.impl.FacturaImpl <em>Factura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interrapidisimo.domain.impl.FacturaImpl
		 * @see interrapidisimo.domain.impl.DomainPackageImpl#getFactura()
		 * @generated
		 */
		EClass FACTURA = eINSTANCE.getFactura();

		/**
		 * The meta object literal for the '<em><b>Tipo Pago</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTURA__TIPO_PAGO = eINSTANCE.getFactura_TipoPago();

		/**
		 * The meta object literal for the '<em><b>Costo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTURA__COSTO = eINSTANCE.getFactura_Costo();

		/**
		 * The meta object literal for the '<em><b>Lst Factory Pago</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTURA__LST_FACTORY_PAGO = eINSTANCE.getFactura_LstFactoryPago();

		/**
		 * The meta object literal for the '{@link interrapidisimo.domain.impl.GuiaImpl <em>Guia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interrapidisimo.domain.impl.GuiaImpl
		 * @see interrapidisimo.domain.impl.DomainPackageImpl#getGuia()
		 * @generated
		 */
		EClass GUIA = eINSTANCE.getGuia();

		/**
		 * The meta object literal for the '<em><b>Destinatario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIA__DESTINATARIO = eINSTANCE.getGuia_Destinatario();

		/**
		 * The meta object literal for the '<em><b>Direccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIA__DIRECCION = eINSTANCE.getGuia_Direccion();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIA__ESTADO = eINSTANCE.getGuia_Estado();

		/**
		 * The meta object literal for the '<em><b>Fecha Estimada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIA__FECHA_ESTIMADA = eINSTANCE.getGuia_FechaEstimada();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIA__ID = eINSTANCE.getGuia_ID();

		/**
		 * The meta object literal for the '<em><b>Remitente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIA__REMITENTE = eINSTANCE.getGuia_Remitente();

		/**
		 * The meta object literal for the '<em><b>Tipo Entrega</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIA__TIPO_ENTREGA = eINSTANCE.getGuia_TipoEntrega();

		/**
		 * The meta object literal for the '<em><b>Lst Factory Bodega</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUIA__LST_FACTORY_BODEGA = eINSTANCE.getGuia_LstFactoryBodega();

		/**
		 * The meta object literal for the '{@link interrapidisimo.domain.impl.PaqueteImpl <em>Paquete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interrapidisimo.domain.impl.PaqueteImpl
		 * @see interrapidisimo.domain.impl.DomainPackageImpl#getPaquete()
		 * @generated
		 */
		EClass PAQUETE = eINSTANCE.getPaquete();

		/**
		 * The meta object literal for the '<em><b>Medidas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAQUETE__MEDIDAS = eINSTANCE.getPaquete_Medidas();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAQUETE__ESTADO = eINSTANCE.getPaquete_Estado();

		/**
		 * The meta object literal for the '<em><b>Peso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAQUETE__PESO = eINSTANCE.getPaquete_Peso();

		/**
		 * The meta object literal for the '<em><b>Fecha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAQUETE__FECHA = eINSTANCE.getPaquete_Fecha();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAQUETE__DESCRIPCION = eINSTANCE.getPaquete_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Lst Factory Bodega</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAQUETE__LST_FACTORY_BODEGA = eINSTANCE.getPaquete_LstFactoryBodega();

		/**
		 * The meta object literal for the '{@link interrapidisimo.domain.impl.TransportadorImpl <em>Transportador</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interrapidisimo.domain.impl.TransportadorImpl
		 * @see interrapidisimo.domain.impl.DomainPackageImpl#getTransportador()
		 * @generated
		 */
		EClass TRANSPORTADOR = eINSTANCE.getTransportador();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTADOR__NOMBRE = eINSTANCE.getTransportador_Nombre();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTADOR__ID = eINSTANCE.getTransportador_ID();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTADOR__TELEFONO = eINSTANCE.getTransportador_Telefono();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTADOR__EMAIL = eINSTANCE.getTransportador_Email();

		/**
		 * The meta object literal for the '<em><b>Estado Empleado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTADOR__ESTADO_EMPLEADO = eINSTANCE.getTransportador_EstadoEmpleado();

		/**
		 * The meta object literal for the '<em><b>Lst Factory Gestion Humana</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA = eINSTANCE.getTransportador_LstFactoryGestionHumana();

	}

} //DomainPackage
