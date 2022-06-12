/**
 */
package interrapidisimo.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.Guia#getDestinatario <em>Destinatario</em>}</li>
 *   <li>{@link interrapidisimo.domain.Guia#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link interrapidisimo.domain.Guia#getEstado <em>Estado</em>}</li>
 *   <li>{@link interrapidisimo.domain.Guia#getFechaEstimada <em>Fecha Estimada</em>}</li>
 *   <li>{@link interrapidisimo.domain.Guia#getID <em>ID</em>}</li>
 *   <li>{@link interrapidisimo.domain.Guia#getRemitente <em>Remitente</em>}</li>
 *   <li>{@link interrapidisimo.domain.Guia#getTipoEntrega <em>Tipo Entrega</em>}</li>
 *   <li>{@link interrapidisimo.domain.Guia#getLstFactoryBodega <em>Lst Factory Bodega</em>}</li>
 * </ul>
 *
 * @see interrapidisimo.domain.DomainPackage#getGuia()
 * @model
 * @generated
 */
public interface Guia extends EObject {
	/**
	 * Returns the value of the '<em><b>Destinatario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destinatario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destinatario</em>' attribute.
	 * @see #setDestinatario(String)
	 * @see interrapidisimo.domain.DomainPackage#getGuia_Destinatario()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getDestinatario();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Guia#getDestinatario <em>Destinatario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destinatario</em>' attribute.
	 * @see #getDestinatario()
	 * @generated
	 */
	void setDestinatario(String value);

	/**
	 * Returns the value of the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direccion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion</em>' attribute.
	 * @see #setDireccion(String)
	 * @see interrapidisimo.domain.DomainPackage#getGuia_Direccion()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getDireccion();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Guia#getDireccion <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion</em>' attribute.
	 * @see #getDireccion()
	 * @generated
	 */
	void setDireccion(String value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(String)
	 * @see interrapidisimo.domain.DomainPackage#getGuia_Estado()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Guia#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Estimada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Estimada</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Estimada</em>' attribute.
	 * @see #setFechaEstimada(String)
	 * @see interrapidisimo.domain.DomainPackage#getGuia_FechaEstimada()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getFechaEstimada();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Guia#getFechaEstimada <em>Fecha Estimada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Estimada</em>' attribute.
	 * @see #getFechaEstimada()
	 * @generated
	 */
	void setFechaEstimada(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see interrapidisimo.domain.DomainPackage#getGuia_ID()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Guia#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Remitente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remitente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remitente</em>' attribute.
	 * @see #setRemitente(String)
	 * @see interrapidisimo.domain.DomainPackage#getGuia_Remitente()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getRemitente();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Guia#getRemitente <em>Remitente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remitente</em>' attribute.
	 * @see #getRemitente()
	 * @generated
	 */
	void setRemitente(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Entrega</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Entrega</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Entrega</em>' attribute.
	 * @see #setTipoEntrega(String)
	 * @see interrapidisimo.domain.DomainPackage#getGuia_TipoEntrega()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getTipoEntrega();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Guia#getTipoEntrega <em>Tipo Entrega</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Entrega</em>' attribute.
	 * @see #getTipoEntrega()
	 * @generated
	 */
	void setTipoEntrega(String value);

	/**
	 * Returns the value of the '<em><b>Lst Factory Bodega</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.FactoryBodega#getLstGuia <em>Lst Guia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Factory Bodega</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Factory Bodega</em>' container reference.
	 * @see #setLstFactoryBodega(FactoryBodega)
	 * @see interrapidisimo.domain.DomainPackage#getGuia_LstFactoryBodega()
	 * @see interrapidisimo.domain.FactoryBodega#getLstGuia
	 * @model opposite="lstGuia" transient="false"
	 * @generated
	 */
	FactoryBodega getLstFactoryBodega();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Guia#getLstFactoryBodega <em>Lst Factory Bodega</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Factory Bodega</em>' container reference.
	 * @see #getLstFactoryBodega()
	 * @generated
	 */
	void setLstFactoryBodega(FactoryBodega value);

} // Guia
