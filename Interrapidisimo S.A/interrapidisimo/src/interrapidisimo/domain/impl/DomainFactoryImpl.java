/**
 */
package interrapidisimo.domain.impl;

import interrapidisimo.domain.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainFactoryImpl extends EFactoryImpl implements DomainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainFactory init() {
		try {
			DomainFactory theDomainFactory = (DomainFactory)EPackage.Registry.INSTANCE.getEFactory(DomainPackage.eNS_URI);
			if (theDomainFactory != null) {
				return theDomainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DomainPackage.CLIENTE: return createCliente();
			case DomainPackage.DOMAIN: return createDomain();
			case DomainPackage.EMPLEADO: return createEmpleado();
			case DomainPackage.FACTORY_BODEGA: return createFactoryBodega();
			case DomainPackage.FACTORY_GESTION_HUMANA: return createFactoryGestionHumana();
			case DomainPackage.FACTORY_PAGO: return createFactoryPago();
			case DomainPackage.FACTURA: return createFactura();
			case DomainPackage.GUIA: return createGuia();
			case DomainPackage.PAQUETE: return createPaquete();
			case DomainPackage.TRANSPORTADOR: return createTransportador();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente createCliente() {
		ClienteImpl cliente = new ClienteImpl();
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empleado createEmpleado() {
		EmpleadoImpl empleado = new EmpleadoImpl();
		return empleado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryBodega createFactoryBodega() {
		FactoryBodegaImpl factoryBodega = new FactoryBodegaImpl();
		return factoryBodega;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryGestionHumana createFactoryGestionHumana() {
		FactoryGestionHumanaImpl factoryGestionHumana = new FactoryGestionHumanaImpl();
		return factoryGestionHumana;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryPago createFactoryPago() {
		FactoryPagoImpl factoryPago = new FactoryPagoImpl();
		return factoryPago;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factura createFactura() {
		FacturaImpl factura = new FacturaImpl();
		return factura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guia createGuia() {
		GuiaImpl guia = new GuiaImpl();
		return guia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paquete createPaquete() {
		PaqueteImpl paquete = new PaqueteImpl();
		return paquete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transportador createTransportador() {
		TransportadorImpl transportador = new TransportadorImpl();
		return transportador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPackage getDomainPackage() {
		return (DomainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomainPackage getPackage() {
		return DomainPackage.eINSTANCE;
	}

} //DomainFactoryImpl
