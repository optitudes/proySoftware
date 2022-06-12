/**
 */
package interrapidisimo.domain.util;

import interrapidisimo.domain.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see interrapidisimo.domain.DomainPackage
 * @generated
 */
public class DomainAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DomainPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DomainPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSwitch<Adapter> modelSwitch =
		new DomainSwitch<Adapter>() {
			@Override
			public Adapter caseCliente(Cliente object) {
				return createClienteAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseEmpleado(Empleado object) {
				return createEmpleadoAdapter();
			}
			@Override
			public Adapter caseFactoryBodega(FactoryBodega object) {
				return createFactoryBodegaAdapter();
			}
			@Override
			public Adapter caseFactoryGestionHumana(FactoryGestionHumana object) {
				return createFactoryGestionHumanaAdapter();
			}
			@Override
			public Adapter caseFactoryPago(FactoryPago object) {
				return createFactoryPagoAdapter();
			}
			@Override
			public Adapter caseFactura(Factura object) {
				return createFacturaAdapter();
			}
			@Override
			public Adapter caseGuia(Guia object) {
				return createGuiaAdapter();
			}
			@Override
			public Adapter casePaquete(Paquete object) {
				return createPaqueteAdapter();
			}
			@Override
			public Adapter caseTransportador(Transportador object) {
				return createTransportadorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link interrapidisimo.domain.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see interrapidisimo.domain.Cliente
	 * @generated
	 */
	public Adapter createClienteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link interrapidisimo.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see interrapidisimo.domain.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link interrapidisimo.domain.Empleado <em>Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see interrapidisimo.domain.Empleado
	 * @generated
	 */
	public Adapter createEmpleadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link interrapidisimo.domain.FactoryBodega <em>Factory Bodega</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see interrapidisimo.domain.FactoryBodega
	 * @generated
	 */
	public Adapter createFactoryBodegaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link interrapidisimo.domain.FactoryGestionHumana <em>Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see interrapidisimo.domain.FactoryGestionHumana
	 * @generated
	 */
	public Adapter createFactoryGestionHumanaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link interrapidisimo.domain.FactoryPago <em>Factory Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see interrapidisimo.domain.FactoryPago
	 * @generated
	 */
	public Adapter createFactoryPagoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link interrapidisimo.domain.Factura <em>Factura</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see interrapidisimo.domain.Factura
	 * @generated
	 */
	public Adapter createFacturaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link interrapidisimo.domain.Guia <em>Guia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see interrapidisimo.domain.Guia
	 * @generated
	 */
	public Adapter createGuiaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link interrapidisimo.domain.Paquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see interrapidisimo.domain.Paquete
	 * @generated
	 */
	public Adapter createPaqueteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link interrapidisimo.domain.Transportador <em>Transportador</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see interrapidisimo.domain.Transportador
	 * @generated
	 */
	public Adapter createTransportadorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DomainAdapterFactory
