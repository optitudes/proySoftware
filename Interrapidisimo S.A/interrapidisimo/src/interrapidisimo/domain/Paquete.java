/**
 */
package interrapidisimo.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paquete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.Paquete#getMedidas <em>Medidas</em>}</li>
 *   <li>{@link interrapidisimo.domain.Paquete#getEstado <em>Estado</em>}</li>
 *   <li>{@link interrapidisimo.domain.Paquete#getPeso <em>Peso</em>}</li>
 *   <li>{@link interrapidisimo.domain.Paquete#getFecha <em>Fecha</em>}</li>
 *   <li>{@link interrapidisimo.domain.Paquete#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link interrapidisimo.domain.Paquete#getLstFactoryBodega <em>Lst Factory Bodega</em>}</li>
 * </ul>
 *
 * @see interrapidisimo.domain.DomainPackage#getPaquete()
 * @model
 * @generated
 */
public interface Paquete extends EObject {
	/**
	 * Returns the value of the '<em><b>Medidas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medidas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medidas</em>' attribute.
	 * @see #setMedidas(String)
	 * @see interrapidisimo.domain.DomainPackage#getPaquete_Medidas()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getMedidas();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Paquete#getMedidas <em>Medidas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medidas</em>' attribute.
	 * @see #getMedidas()
	 * @generated
	 */
	void setMedidas(String value);

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
	 * @see interrapidisimo.domain.DomainPackage#getPaquete_Estado()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Paquete#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Peso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peso</em>' attribute.
	 * @see #setPeso(String)
	 * @see interrapidisimo.domain.DomainPackage#getPaquete_Peso()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getPeso();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Paquete#getPeso <em>Peso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peso</em>' attribute.
	 * @see #getPeso()
	 * @generated
	 */
	void setPeso(String value);

	/**
	 * Returns the value of the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha</em>' attribute.
	 * @see #setFecha(String)
	 * @see interrapidisimo.domain.DomainPackage#getPaquete_Fecha()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getFecha();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Paquete#getFecha <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha</em>' attribute.
	 * @see #getFecha()
	 * @generated
	 */
	void setFecha(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see interrapidisimo.domain.DomainPackage#getPaquete_Descripcion()
	 * @model dataType="interrapidisimo.String"
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Paquete#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Lst Factory Bodega</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.FactoryBodega#getLstPaquete <em>Lst Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Factory Bodega</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Factory Bodega</em>' container reference.
	 * @see #setLstFactoryBodega(FactoryBodega)
	 * @see interrapidisimo.domain.DomainPackage#getPaquete_LstFactoryBodega()
	 * @see interrapidisimo.domain.FactoryBodega#getLstPaquete
	 * @model opposite="lstPaquete" transient="false"
	 * @generated
	 */
	FactoryBodega getLstFactoryBodega();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Paquete#getLstFactoryBodega <em>Lst Factory Bodega</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Factory Bodega</em>' container reference.
	 * @see #getLstFactoryBodega()
	 * @generated
	 */
	void setLstFactoryBodega(FactoryBodega value);

} // Paquete
