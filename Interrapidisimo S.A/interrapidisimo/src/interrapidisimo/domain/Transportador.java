/**
 */
package interrapidisimo.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transportador</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.Transportador#getNombre <em>Nombre</em>}</li>
 *   <li>{@link interrapidisimo.domain.Transportador#getID <em>ID</em>}</li>
 *   <li>{@link interrapidisimo.domain.Transportador#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link interrapidisimo.domain.Transportador#getEmail <em>Email</em>}</li>
 *   <li>{@link interrapidisimo.domain.Transportador#getEstadoEmpleado <em>Estado Empleado</em>}</li>
 *   <li>{@link interrapidisimo.domain.Transportador#getLstFactoryGestionHumana <em>Lst Factory Gestion Humana</em>}</li>
 * </ul>
 *
 * @see interrapidisimo.domain.DomainPackage#getTransportador()
 * @model
 * @generated
 */
public interface Transportador extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see interrapidisimo.domain.DomainPackage#getTransportador_Nombre()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Transportador#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

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
	 * @see interrapidisimo.domain.DomainPackage#getTransportador_ID()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Transportador#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telefono</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefono</em>' attribute.
	 * @see #setTelefono(String)
	 * @see interrapidisimo.domain.DomainPackage#getTransportador_Telefono()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getTelefono();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Transportador#getTelefono <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefono</em>' attribute.
	 * @see #getTelefono()
	 * @generated
	 */
	void setTelefono(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see interrapidisimo.domain.DomainPackage#getTransportador_Email()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Transportador#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Estado Empleado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado Empleado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado Empleado</em>' attribute.
	 * @see #setEstadoEmpleado(String)
	 * @see interrapidisimo.domain.DomainPackage#getTransportador_EstadoEmpleado()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getEstadoEmpleado();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Transportador#getEstadoEmpleado <em>Estado Empleado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado Empleado</em>' attribute.
	 * @see #getEstadoEmpleado()
	 * @generated
	 */
	void setEstadoEmpleado(String value);

	/**
	 * Returns the value of the '<em><b>Lst Factory Gestion Humana</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.FactoryGestionHumana#getLstTransportador <em>Lst Transportador</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Factory Gestion Humana</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Factory Gestion Humana</em>' container reference.
	 * @see #setLstFactoryGestionHumana(FactoryGestionHumana)
	 * @see interrapidisimo.domain.DomainPackage#getTransportador_LstFactoryGestionHumana()
	 * @see interrapidisimo.domain.FactoryGestionHumana#getLstTransportador
	 * @model opposite="lstTransportador" transient="false"
	 * @generated
	 */
	FactoryGestionHumana getLstFactoryGestionHumana();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Transportador#getLstFactoryGestionHumana <em>Lst Factory Gestion Humana</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Factory Gestion Humana</em>' container reference.
	 * @see #getLstFactoryGestionHumana()
	 * @generated
	 */
	void setLstFactoryGestionHumana(FactoryGestionHumana value);

} // Transportador
