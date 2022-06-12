/**
 */
package interrapidisimo.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Gestion Humana</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.FactoryGestionHumana#getLstCliente <em>Lst Cliente</em>}</li>
 *   <li>{@link interrapidisimo.domain.FactoryGestionHumana#getLstEmpleado <em>Lst Empleado</em>}</li>
 *   <li>{@link interrapidisimo.domain.FactoryGestionHumana#getOwnedByDomain <em>Owned By Domain</em>}</li>
 *   <li>{@link interrapidisimo.domain.FactoryGestionHumana#getLstTransportador <em>Lst Transportador</em>}</li>
 * </ul>
 *
 * @see interrapidisimo.domain.DomainPackage#getFactoryGestionHumana()
 * @model
 * @generated
 */
public interface FactoryGestionHumana extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Cliente</b></em>' containment reference list.
	 * The list contents are of type {@link interrapidisimo.domain.Cliente}.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.Cliente#getLstFactoryGestionHumana <em>Lst Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Cliente</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Cliente</em>' containment reference list.
	 * @see interrapidisimo.domain.DomainPackage#getFactoryGestionHumana_LstCliente()
	 * @see interrapidisimo.domain.Cliente#getLstFactoryGestionHumana
	 * @model opposite="lstFactoryGestionHumana" containment="true"
	 * @generated
	 */
	EList<Cliente> getLstCliente();

	/**
	 * Returns the value of the '<em><b>Lst Empleado</b></em>' containment reference list.
	 * The list contents are of type {@link interrapidisimo.domain.Empleado}.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.Empleado#getLstFactoryGestionHumana <em>Lst Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Empleado</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Empleado</em>' containment reference list.
	 * @see interrapidisimo.domain.DomainPackage#getFactoryGestionHumana_LstEmpleado()
	 * @see interrapidisimo.domain.Empleado#getLstFactoryGestionHumana
	 * @model opposite="lstFactoryGestionHumana" containment="true"
	 * @generated
	 */
	EList<Empleado> getLstEmpleado();

	/**
	 * Returns the value of the '<em><b>Owned By Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.Domain#getTheFactoryGestionHumana <em>The Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Domain</em>' container reference.
	 * @see #setOwnedByDomain(Domain)
	 * @see interrapidisimo.domain.DomainPackage#getFactoryGestionHumana_OwnedByDomain()
	 * @see interrapidisimo.domain.Domain#getTheFactoryGestionHumana
	 * @model opposite="theFactoryGestionHumana" transient="false"
	 * @generated
	 */
	Domain getOwnedByDomain();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.FactoryGestionHumana#getOwnedByDomain <em>Owned By Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Domain</em>' container reference.
	 * @see #getOwnedByDomain()
	 * @generated
	 */
	void setOwnedByDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Lst Transportador</b></em>' containment reference list.
	 * The list contents are of type {@link interrapidisimo.domain.Transportador}.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.Transportador#getLstFactoryGestionHumana <em>Lst Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Transportador</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Transportador</em>' containment reference list.
	 * @see interrapidisimo.domain.DomainPackage#getFactoryGestionHumana_LstTransportador()
	 * @see interrapidisimo.domain.Transportador#getLstFactoryGestionHumana
	 * @model opposite="lstFactoryGestionHumana" containment="true"
	 * @generated
	 */
	EList<Transportador> getLstTransportador();

} // FactoryGestionHumana
