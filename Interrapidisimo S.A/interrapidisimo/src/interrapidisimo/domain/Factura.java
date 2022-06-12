/**
 */
package interrapidisimo.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factura</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.Factura#getTipoPago <em>Tipo Pago</em>}</li>
 *   <li>{@link interrapidisimo.domain.Factura#getCosto <em>Costo</em>}</li>
 *   <li>{@link interrapidisimo.domain.Factura#getLstFactoryPago <em>Lst Factory Pago</em>}</li>
 * </ul>
 *
 * @see interrapidisimo.domain.DomainPackage#getFactura()
 * @model
 * @generated
 */
public interface Factura extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo Pago</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Pago</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Pago</em>' attribute.
	 * @see #setTipoPago(String)
	 * @see interrapidisimo.domain.DomainPackage#getFactura_TipoPago()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getTipoPago();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Factura#getTipoPago <em>Tipo Pago</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Pago</em>' attribute.
	 * @see #getTipoPago()
	 * @generated
	 */
	void setTipoPago(String value);

	/**
	 * Returns the value of the '<em><b>Costo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Costo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costo</em>' attribute.
	 * @see #setCosto(String)
	 * @see interrapidisimo.domain.DomainPackage#getFactura_Costo()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getCosto();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Factura#getCosto <em>Costo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Costo</em>' attribute.
	 * @see #getCosto()
	 * @generated
	 */
	void setCosto(String value);

	/**
	 * Returns the value of the '<em><b>Lst Factory Pago</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.FactoryPago#getLstFactura <em>Lst Factura</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Factory Pago</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Factory Pago</em>' container reference.
	 * @see #setLstFactoryPago(FactoryPago)
	 * @see interrapidisimo.domain.DomainPackage#getFactura_LstFactoryPago()
	 * @see interrapidisimo.domain.FactoryPago#getLstFactura
	 * @model opposite="lstFactura" transient="false"
	 * @generated
	 */
	FactoryPago getLstFactoryPago();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Factura#getLstFactoryPago <em>Lst Factory Pago</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Factory Pago</em>' container reference.
	 * @see #getLstFactoryPago()
	 * @generated
	 */
	void setLstFactoryPago(FactoryPago value);

} // Factura
