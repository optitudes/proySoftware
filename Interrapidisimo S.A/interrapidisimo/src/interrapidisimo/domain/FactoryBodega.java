/**
 */
package interrapidisimo.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Bodega</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.FactoryBodega#getLstDomain <em>Lst Domain</em>}</li>
 *   <li>{@link interrapidisimo.domain.FactoryBodega#getLstGuia <em>Lst Guia</em>}</li>
 *   <li>{@link interrapidisimo.domain.FactoryBodega#getLstPaquete <em>Lst Paquete</em>}</li>
 * </ul>
 *
 * @see interrapidisimo.domain.DomainPackage#getFactoryBodega()
 * @model
 * @generated
 */
public interface FactoryBodega extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.Domain#getOwnedByFactoryBodega <em>Owned By Factory Bodega</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Domain</em>' container reference.
	 * @see #setLstDomain(Domain)
	 * @see interrapidisimo.domain.DomainPackage#getFactoryBodega_LstDomain()
	 * @see interrapidisimo.domain.Domain#getOwnedByFactoryBodega
	 * @model opposite="ownedByFactoryBodega" transient="false"
	 * @generated
	 */
	Domain getLstDomain();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.FactoryBodega#getLstDomain <em>Lst Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Domain</em>' container reference.
	 * @see #getLstDomain()
	 * @generated
	 */
	void setLstDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Lst Guia</b></em>' containment reference list.
	 * The list contents are of type {@link interrapidisimo.domain.Guia}.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.Guia#getLstFactoryBodega <em>Lst Factory Bodega</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Guia</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Guia</em>' containment reference list.
	 * @see interrapidisimo.domain.DomainPackage#getFactoryBodega_LstGuia()
	 * @see interrapidisimo.domain.Guia#getLstFactoryBodega
	 * @model opposite="lstFactoryBodega" containment="true"
	 * @generated
	 */
	EList<Guia> getLstGuia();

	/**
	 * Returns the value of the '<em><b>Lst Paquete</b></em>' containment reference list.
	 * The list contents are of type {@link interrapidisimo.domain.Paquete}.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.Paquete#getLstFactoryBodega <em>Lst Factory Bodega</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Paquete</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Paquete</em>' containment reference list.
	 * @see interrapidisimo.domain.DomainPackage#getFactoryBodega_LstPaquete()
	 * @see interrapidisimo.domain.Paquete#getLstFactoryBodega
	 * @model opposite="lstFactoryBodega" containment="true"
	 * @generated
	 */
	EList<Paquete> getLstPaquete();

} // FactoryBodega
