/**
 */
package interrapidisimo.domain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see interrapidisimo.domain.DomainPackage
 * @generated
 */
public interface DomainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainFactory eINSTANCE = interrapidisimo.domain.impl.DomainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cliente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cliente</em>'.
	 * @generated
	 */
	Cliente createCliente();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>Empleado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empleado</em>'.
	 * @generated
	 */
	Empleado createEmpleado();

	/**
	 * Returns a new object of class '<em>Factory Bodega</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factory Bodega</em>'.
	 * @generated
	 */
	FactoryBodega createFactoryBodega();

	/**
	 * Returns a new object of class '<em>Factory Gestion Humana</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factory Gestion Humana</em>'.
	 * @generated
	 */
	FactoryGestionHumana createFactoryGestionHumana();

	/**
	 * Returns a new object of class '<em>Factory Pago</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factory Pago</em>'.
	 * @generated
	 */
	FactoryPago createFactoryPago();

	/**
	 * Returns a new object of class '<em>Factura</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factura</em>'.
	 * @generated
	 */
	Factura createFactura();

	/**
	 * Returns a new object of class '<em>Guia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guia</em>'.
	 * @generated
	 */
	Guia createGuia();

	/**
	 * Returns a new object of class '<em>Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paquete</em>'.
	 * @generated
	 */
	Paquete createPaquete();

	/**
	 * Returns a new object of class '<em>Transportador</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transportador</em>'.
	 * @generated
	 */
	Transportador createTransportador();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DomainPackage getDomainPackage();

} //DomainFactory
