/**
 */
package interrapidisimo.domain;

import interrapidisimo.ModelFactory;

import interrapidisimo.ui.UI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.domain.Domain#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link interrapidisimo.domain.Domain#getOwnedByFactoryBodega <em>Owned By Factory Bodega</em>}</li>
 *   <li>{@link interrapidisimo.domain.Domain#getTheFactoryGestionHumana <em>The Factory Gestion Humana</em>}</li>
 *   <li>{@link interrapidisimo.domain.Domain#getLstFactoryPago <em>Lst Factory Pago</em>}</li>
 *   <li>{@link interrapidisimo.domain.Domain#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @see interrapidisimo.domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.ModelFactory#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see interrapidisimo.domain.DomainPackage#getDomain_TheModelFactory()
	 * @see interrapidisimo.ModelFactory#getTheDomain
	 * @model opposite="theDomain" transient="false"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Domain#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>Owned By Factory Bodega</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.FactoryBodega#getLstDomain <em>Lst Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Factory Bodega</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Factory Bodega</em>' containment reference.
	 * @see #setOwnedByFactoryBodega(FactoryBodega)
	 * @see interrapidisimo.domain.DomainPackage#getDomain_OwnedByFactoryBodega()
	 * @see interrapidisimo.domain.FactoryBodega#getLstDomain
	 * @model opposite="lstDomain" containment="true"
	 * @generated
	 */
	FactoryBodega getOwnedByFactoryBodega();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Domain#getOwnedByFactoryBodega <em>Owned By Factory Bodega</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Factory Bodega</em>' containment reference.
	 * @see #getOwnedByFactoryBodega()
	 * @generated
	 */
	void setOwnedByFactoryBodega(FactoryBodega value);

	/**
	 * Returns the value of the '<em><b>The Factory Gestion Humana</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.FactoryGestionHumana#getOwnedByDomain <em>Owned By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Factory Gestion Humana</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Factory Gestion Humana</em>' containment reference.
	 * @see #setTheFactoryGestionHumana(FactoryGestionHumana)
	 * @see interrapidisimo.domain.DomainPackage#getDomain_TheFactoryGestionHumana()
	 * @see interrapidisimo.domain.FactoryGestionHumana#getOwnedByDomain
	 * @model opposite="ownedByDomain" containment="true"
	 * @generated
	 */
	FactoryGestionHumana getTheFactoryGestionHumana();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Domain#getTheFactoryGestionHumana <em>The Factory Gestion Humana</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Factory Gestion Humana</em>' containment reference.
	 * @see #getTheFactoryGestionHumana()
	 * @generated
	 */
	void setTheFactoryGestionHumana(FactoryGestionHumana value);

	/**
	 * Returns the value of the '<em><b>Lst Factory Pago</b></em>' containment reference list.
	 * The list contents are of type {@link interrapidisimo.domain.FactoryPago}.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.FactoryPago#getOwnedByDomain <em>Owned By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Factory Pago</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Factory Pago</em>' containment reference list.
	 * @see interrapidisimo.domain.DomainPackage#getDomain_LstFactoryPago()
	 * @see interrapidisimo.domain.FactoryPago#getOwnedByDomain
	 * @model opposite="ownedByDomain" containment="true"
	 * @generated
	 */
	EList<FactoryPago> getLstFactoryPago();

	/**
	 * Returns the value of the '<em><b>The UI</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.ui.UI#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI</em>' reference.
	 * @see #setTheUI(UI)
	 * @see interrapidisimo.domain.DomainPackage#getDomain_TheUI()
	 * @see interrapidisimo.ui.UI#getTheDomain
	 * @model opposite="theDomain"
	 * @generated
	 */
	UI getTheUI();

	/**
	 * Sets the value of the '{@link interrapidisimo.domain.Domain#getTheUI <em>The UI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI</em>' reference.
	 * @see #getTheUI()
	 * @generated
	 */
	void setTheUI(UI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//TODO implementarModelo\n'"
	 * @generated
	 */
	void implementarModelo();

} // Domain
