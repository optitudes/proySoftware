/**
 */
package interrapidisimo.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Pago</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.FactoryPago#getOwnedByDomain <em>Owned By Domain</em>}</li>
 *   <li>{@link interrapidisimo.domain.FactoryPago#getLstFactura <em>Lst Factura</em>}</li>
 * </ul>
 *
 * @see interrapidisimo.domain.DomainPackage#getFactoryPago()
 * @model
 * @generated
 */
public interface FactoryPago extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.Domain#getLstFactoryPago <em>Lst Factory Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Domain</em>' container reference.
	 * @see #setOwnedByDomain(Domain)
	 * @see interrapidisimo.domain.DomainPackage#getFactoryPago_OwnedByDomain()
	 * @see interrapidisimo.domain.Domain#getLstFactoryPago
	 * @model opposite="lstFactoryPago" transient="false"
	 * @generated
	 */
	Domain getOwnedByDomain();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.FactoryPago#getOwnedByDomain <em>Owned By Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Domain</em>' container reference.
	 * @see #getOwnedByDomain()
	 * @generated
	 */
	void setOwnedByDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Lst Factura</b></em>' containment reference list.
	 * The list contents are of type {@link interrapidisimo.domain.Factura}.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.Factura#getLstFactoryPago <em>Lst Factory Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Factura</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Factura</em>' containment reference list.
	 * @see interrapidisimo.domain.DomainPackage#getFactoryPago_LstFactura()
	 * @see interrapidisimo.domain.Factura#getLstFactoryPago
	 * @model opposite="lstFactoryPago" containment="true"
	 * @generated
	 */
	EList<Factura> getLstFactura();

} // FactoryPago
