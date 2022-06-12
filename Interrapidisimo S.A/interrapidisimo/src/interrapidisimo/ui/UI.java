/**
 */
package interrapidisimo.ui;

import interrapidisimo.ModelFactory;

import interrapidisimo.domain.Domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.ui.UI#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link interrapidisimo.ui.UI#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @see interrapidisimo.ui.UiPackage#getUI()
 * @model
 * @generated
 */
public interface UI extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.ModelFactory#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see interrapidisimo.ui.UiPackage#getUI_TheModelFactory()
	 * @see interrapidisimo.ModelFactory#getTheUI
	 * @model opposite="theUI" transient="false"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link interrapidisimo.ui.UI#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link interrapidisimo.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' reference.
	 * @see #setTheDomain(Domain)
	 * @see interrapidisimo.ui.UiPackage#getUI_TheDomain()
	 * @see interrapidisimo.domain.Domain#getTheUI
	 * @model opposite="theUI"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link interrapidisimo.ui.UI#getTheDomain <em>The Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//TODO implementarModelo\n'"
	 * @generated
	 */
	void implementarModelo();

} // UI
