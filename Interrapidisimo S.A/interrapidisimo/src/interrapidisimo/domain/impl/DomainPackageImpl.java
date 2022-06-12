/**
 */
package interrapidisimo.domain.impl;

import interrapidisimo.domain.Cliente;
import interrapidisimo.domain.Domain;
import interrapidisimo.domain.DomainFactory;
import interrapidisimo.domain.DomainPackage;
import interrapidisimo.domain.Empleado;
import interrapidisimo.domain.FactoryBodega;
import interrapidisimo.domain.FactoryGestionHumana;
import interrapidisimo.domain.FactoryPago;
import interrapidisimo.domain.Factura;
import interrapidisimo.domain.Guia;
import interrapidisimo.domain.Paquete;
import interrapidisimo.domain.Transportador;

import interrapidisimo.impl.interrapidisimoPackageImpl;

import interrapidisimo.interrapidisimoPackage;

import interrapidisimo.ui.UiPackage;

import interrapidisimo.ui.impl.UiPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clienteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empleadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryBodegaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryGestionHumanaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryPagoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facturaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paqueteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportadorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see interrapidisimo.domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		interrapidisimoPackageImpl theinterrapidisimoPackage = (interrapidisimoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(interrapidisimoPackage.eNS_URI) instanceof interrapidisimoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(interrapidisimoPackage.eNS_URI) : interrapidisimoPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theDomainPackage.createPackageContents();
		theinterrapidisimoPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();
		theinterrapidisimoPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCliente() {
		return clienteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_Nombre() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_ID() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_Edad() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_Telefono() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_Direccion() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_Email() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_TipoCliente() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCliente_LstFactoryGestionHumana() {
		return (EReference)clienteEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheModelFactory() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_OwnedByFactoryBodega() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheFactoryGestionHumana() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_LstFactoryPago() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheUI() {
		return (EReference)domainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmpleado() {
		return empleadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_Nombre() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_ID() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_Telefono() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_Email() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_TipoEmpleado() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_EstadoEmpleado() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmpleado_LstFactoryGestionHumana() {
		return (EReference)empleadoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactoryBodega() {
		return factoryBodegaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryBodega_LstDomain() {
		return (EReference)factoryBodegaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryBodega_LstGuia() {
		return (EReference)factoryBodegaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryBodega_LstPaquete() {
		return (EReference)factoryBodegaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactoryGestionHumana() {
		return factoryGestionHumanaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGestionHumana_LstCliente() {
		return (EReference)factoryGestionHumanaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGestionHumana_LstEmpleado() {
		return (EReference)factoryGestionHumanaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGestionHumana_OwnedByDomain() {
		return (EReference)factoryGestionHumanaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGestionHumana_LstTransportador() {
		return (EReference)factoryGestionHumanaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactoryPago() {
		return factoryPagoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryPago_OwnedByDomain() {
		return (EReference)factoryPagoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryPago_LstFactura() {
		return (EReference)factoryPagoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactura() {
		return facturaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactura_TipoPago() {
		return (EAttribute)facturaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactura_Costo() {
		return (EAttribute)facturaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactura_LstFactoryPago() {
		return (EReference)facturaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuia() {
		return guiaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuia_Destinatario() {
		return (EAttribute)guiaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuia_Direccion() {
		return (EAttribute)guiaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuia_Estado() {
		return (EAttribute)guiaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuia_FechaEstimada() {
		return (EAttribute)guiaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuia_ID() {
		return (EAttribute)guiaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuia_Remitente() {
		return (EAttribute)guiaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuia_TipoEntrega() {
		return (EAttribute)guiaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuia_LstFactoryBodega() {
		return (EReference)guiaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaquete() {
		return paqueteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaquete_Medidas() {
		return (EAttribute)paqueteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaquete_Estado() {
		return (EAttribute)paqueteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaquete_Peso() {
		return (EAttribute)paqueteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaquete_Fecha() {
		return (EAttribute)paqueteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaquete_Descripcion() {
		return (EAttribute)paqueteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaquete_LstFactoryBodega() {
		return (EReference)paqueteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportador() {
		return transportadorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportador_Nombre() {
		return (EAttribute)transportadorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportador_ID() {
		return (EAttribute)transportadorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportador_Telefono() {
		return (EAttribute)transportadorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportador_Email() {
		return (EAttribute)transportadorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportador_EstadoEmpleado() {
		return (EAttribute)transportadorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportador_LstFactoryGestionHumana() {
		return (EReference)transportadorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		clienteEClass = createEClass(CLIENTE);
		createEAttribute(clienteEClass, CLIENTE__NOMBRE);
		createEAttribute(clienteEClass, CLIENTE__ID);
		createEAttribute(clienteEClass, CLIENTE__EDAD);
		createEAttribute(clienteEClass, CLIENTE__TELEFONO);
		createEAttribute(clienteEClass, CLIENTE__DIRECCION);
		createEAttribute(clienteEClass, CLIENTE__EMAIL);
		createEAttribute(clienteEClass, CLIENTE__TIPO_CLIENTE);
		createEReference(clienteEClass, CLIENTE__LST_FACTORY_GESTION_HUMANA);

		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__THE_MODEL_FACTORY);
		createEReference(domainEClass, DOMAIN__OWNED_BY_FACTORY_BODEGA);
		createEReference(domainEClass, DOMAIN__THE_FACTORY_GESTION_HUMANA);
		createEReference(domainEClass, DOMAIN__LST_FACTORY_PAGO);
		createEReference(domainEClass, DOMAIN__THE_UI);

		empleadoEClass = createEClass(EMPLEADO);
		createEAttribute(empleadoEClass, EMPLEADO__NOMBRE);
		createEAttribute(empleadoEClass, EMPLEADO__ID);
		createEAttribute(empleadoEClass, EMPLEADO__TELEFONO);
		createEAttribute(empleadoEClass, EMPLEADO__EMAIL);
		createEAttribute(empleadoEClass, EMPLEADO__TIPO_EMPLEADO);
		createEAttribute(empleadoEClass, EMPLEADO__ESTADO_EMPLEADO);
		createEReference(empleadoEClass, EMPLEADO__LST_FACTORY_GESTION_HUMANA);

		factoryBodegaEClass = createEClass(FACTORY_BODEGA);
		createEReference(factoryBodegaEClass, FACTORY_BODEGA__LST_DOMAIN);
		createEReference(factoryBodegaEClass, FACTORY_BODEGA__LST_GUIA);
		createEReference(factoryBodegaEClass, FACTORY_BODEGA__LST_PAQUETE);

		factoryGestionHumanaEClass = createEClass(FACTORY_GESTION_HUMANA);
		createEReference(factoryGestionHumanaEClass, FACTORY_GESTION_HUMANA__LST_CLIENTE);
		createEReference(factoryGestionHumanaEClass, FACTORY_GESTION_HUMANA__LST_EMPLEADO);
		createEReference(factoryGestionHumanaEClass, FACTORY_GESTION_HUMANA__OWNED_BY_DOMAIN);
		createEReference(factoryGestionHumanaEClass, FACTORY_GESTION_HUMANA__LST_TRANSPORTADOR);

		factoryPagoEClass = createEClass(FACTORY_PAGO);
		createEReference(factoryPagoEClass, FACTORY_PAGO__OWNED_BY_DOMAIN);
		createEReference(factoryPagoEClass, FACTORY_PAGO__LST_FACTURA);

		facturaEClass = createEClass(FACTURA);
		createEAttribute(facturaEClass, FACTURA__TIPO_PAGO);
		createEAttribute(facturaEClass, FACTURA__COSTO);
		createEReference(facturaEClass, FACTURA__LST_FACTORY_PAGO);

		guiaEClass = createEClass(GUIA);
		createEAttribute(guiaEClass, GUIA__DESTINATARIO);
		createEAttribute(guiaEClass, GUIA__DIRECCION);
		createEAttribute(guiaEClass, GUIA__ESTADO);
		createEAttribute(guiaEClass, GUIA__FECHA_ESTIMADA);
		createEAttribute(guiaEClass, GUIA__ID);
		createEAttribute(guiaEClass, GUIA__REMITENTE);
		createEAttribute(guiaEClass, GUIA__TIPO_ENTREGA);
		createEReference(guiaEClass, GUIA__LST_FACTORY_BODEGA);

		paqueteEClass = createEClass(PAQUETE);
		createEAttribute(paqueteEClass, PAQUETE__MEDIDAS);
		createEAttribute(paqueteEClass, PAQUETE__ESTADO);
		createEAttribute(paqueteEClass, PAQUETE__PESO);
		createEAttribute(paqueteEClass, PAQUETE__FECHA);
		createEAttribute(paqueteEClass, PAQUETE__DESCRIPCION);
		createEReference(paqueteEClass, PAQUETE__LST_FACTORY_BODEGA);

		transportadorEClass = createEClass(TRANSPORTADOR);
		createEAttribute(transportadorEClass, TRANSPORTADOR__NOMBRE);
		createEAttribute(transportadorEClass, TRANSPORTADOR__ID);
		createEAttribute(transportadorEClass, TRANSPORTADOR__TELEFONO);
		createEAttribute(transportadorEClass, TRANSPORTADOR__EMAIL);
		createEAttribute(transportadorEClass, TRANSPORTADOR__ESTADO_EMPLEADO);
		createEReference(transportadorEClass, TRANSPORTADOR__LST_FACTORY_GESTION_HUMANA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		interrapidisimoPackage theinterrapidisimoPackage = (interrapidisimoPackage)EPackage.Registry.INSTANCE.getEPackage(interrapidisimoPackage.eNS_URI);
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(clienteEClass, Cliente.class, "Cliente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCliente_Nombre(), theinterrapidisimoPackage.getString(), "nombre", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_ID(), theinterrapidisimoPackage.getString(), "iD", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_Edad(), theinterrapidisimoPackage.getString(), "edad", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_Telefono(), theinterrapidisimoPackage.getString(), "telefono", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_Direccion(), theinterrapidisimoPackage.getString(), "direccion", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_Email(), theinterrapidisimoPackage.getString(), "email", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_TipoCliente(), theinterrapidisimoPackage.getString(), "tipoCliente", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCliente_LstFactoryGestionHumana(), this.getFactoryGestionHumana(), this.getFactoryGestionHumana_LstCliente(), "lstFactoryGestionHumana", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_TheModelFactory(), theinterrapidisimoPackage.getModelFactory(), theinterrapidisimoPackage.getModelFactory_TheDomain(), "theModelFactory", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_OwnedByFactoryBodega(), this.getFactoryBodega(), this.getFactoryBodega_LstDomain(), "ownedByFactoryBodega", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_TheFactoryGestionHumana(), this.getFactoryGestionHumana(), this.getFactoryGestionHumana_OwnedByDomain(), "theFactoryGestionHumana", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_LstFactoryPago(), this.getFactoryPago(), this.getFactoryPago_OwnedByDomain(), "lstFactoryPago", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_TheUI(), theUiPackage.getUI(), theUiPackage.getUI_TheDomain(), "theUI", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(domainEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(empleadoEClass, Empleado.class, "Empleado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmpleado_Nombre(), theinterrapidisimoPackage.getString(), "nombre", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_ID(), theinterrapidisimoPackage.getString(), "iD", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_Telefono(), theinterrapidisimoPackage.getString(), "telefono", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_Email(), theinterrapidisimoPackage.getString(), "email", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_TipoEmpleado(), theinterrapidisimoPackage.getString(), "tipoEmpleado", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_EstadoEmpleado(), theinterrapidisimoPackage.getString(), "estadoEmpleado", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmpleado_LstFactoryGestionHumana(), this.getFactoryGestionHumana(), this.getFactoryGestionHumana_LstEmpleado(), "lstFactoryGestionHumana", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factoryBodegaEClass, FactoryBodega.class, "FactoryBodega", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactoryBodega_LstDomain(), this.getDomain(), this.getDomain_OwnedByFactoryBodega(), "lstDomain", null, 0, 1, FactoryBodega.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryBodega_LstGuia(), this.getGuia(), this.getGuia_LstFactoryBodega(), "lstGuia", null, 0, -1, FactoryBodega.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryBodega_LstPaquete(), this.getPaquete(), this.getPaquete_LstFactoryBodega(), "lstPaquete", null, 0, -1, FactoryBodega.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factoryGestionHumanaEClass, FactoryGestionHumana.class, "FactoryGestionHumana", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactoryGestionHumana_LstCliente(), this.getCliente(), this.getCliente_LstFactoryGestionHumana(), "lstCliente", null, 0, -1, FactoryGestionHumana.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryGestionHumana_LstEmpleado(), this.getEmpleado(), this.getEmpleado_LstFactoryGestionHumana(), "lstEmpleado", null, 0, -1, FactoryGestionHumana.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryGestionHumana_OwnedByDomain(), this.getDomain(), this.getDomain_TheFactoryGestionHumana(), "ownedByDomain", null, 0, 1, FactoryGestionHumana.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryGestionHumana_LstTransportador(), this.getTransportador(), this.getTransportador_LstFactoryGestionHumana(), "lstTransportador", null, 0, -1, FactoryGestionHumana.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factoryPagoEClass, FactoryPago.class, "FactoryPago", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactoryPago_OwnedByDomain(), this.getDomain(), this.getDomain_LstFactoryPago(), "ownedByDomain", null, 0, 1, FactoryPago.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryPago_LstFactura(), this.getFactura(), this.getFactura_LstFactoryPago(), "lstFactura", null, 0, -1, FactoryPago.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facturaEClass, Factura.class, "Factura", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactura_TipoPago(), theinterrapidisimoPackage.getString(), "tipoPago", null, 0, 1, Factura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactura_Costo(), theinterrapidisimoPackage.getString(), "costo", null, 0, 1, Factura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactura_LstFactoryPago(), this.getFactoryPago(), this.getFactoryPago_LstFactura(), "lstFactoryPago", null, 0, 1, Factura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiaEClass, Guia.class, "Guia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuia_Destinatario(), theinterrapidisimoPackage.getString(), "destinatario", null, 0, 1, Guia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuia_Direccion(), theinterrapidisimoPackage.getString(), "direccion", null, 0, 1, Guia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuia_Estado(), theinterrapidisimoPackage.getString(), "estado", null, 0, 1, Guia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuia_FechaEstimada(), theinterrapidisimoPackage.getString(), "fechaEstimada", null, 0, 1, Guia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuia_ID(), theinterrapidisimoPackage.getString(), "iD", null, 0, 1, Guia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuia_Remitente(), theinterrapidisimoPackage.getString(), "remitente", null, 0, 1, Guia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuia_TipoEntrega(), theinterrapidisimoPackage.getString(), "tipoEntrega", null, 0, 1, Guia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuia_LstFactoryBodega(), this.getFactoryBodega(), this.getFactoryBodega_LstGuia(), "lstFactoryBodega", null, 0, 1, Guia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paqueteEClass, Paquete.class, "Paquete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaquete_Medidas(), theinterrapidisimoPackage.getString(), "medidas", null, 0, 1, Paquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaquete_Estado(), theinterrapidisimoPackage.getString(), "estado", null, 0, 1, Paquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaquete_Peso(), theinterrapidisimoPackage.getString(), "peso", null, 0, 1, Paquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaquete_Fecha(), theinterrapidisimoPackage.getString(), "fecha", null, 0, 1, Paquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaquete_Descripcion(), theinterrapidisimoPackage.getString(), "descripcion", null, 0, 1, Paquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaquete_LstFactoryBodega(), this.getFactoryBodega(), this.getFactoryBodega_LstPaquete(), "lstFactoryBodega", null, 0, 1, Paquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportadorEClass, Transportador.class, "Transportador", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransportador_Nombre(), theinterrapidisimoPackage.getString(), "nombre", null, 0, 1, Transportador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportador_ID(), theinterrapidisimoPackage.getString(), "iD", null, 0, 1, Transportador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportador_Telefono(), theinterrapidisimoPackage.getString(), "telefono", null, 0, 1, Transportador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportador_Email(), theinterrapidisimoPackage.getString(), "email", null, 0, 1, Transportador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportador_EstadoEmpleado(), theinterrapidisimoPackage.getString(), "estadoEmpleado", null, 0, 1, Transportador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportador_LstFactoryGestionHumana(), this.getFactoryGestionHumana(), this.getFactoryGestionHumana_LstTransportador(), "lstFactoryGestionHumana", null, 0, 1, Transportador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DomainPackageImpl
