/**
 */
package interrapidisimo.impl;

import interrapidisimo.ModelFactory;

import interrapidisimo.domain.Domain;
import interrapidisimo.domain.DomainPackage;

import interrapidisimo.interrapidisimoPackage;

import interrapidisimo.ui.UI;
import interrapidisimo.ui.UiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interrapidisimo.impl.ModelFactoryImpl#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link interrapidisimo.impl.ModelFactoryImpl#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryImpl extends EObjectImpl implements ModelFactory {
	/**
	 * The cached value of the '{@link #getTheDomain() <em>The Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain theDomain;

	/**
	 * The cached value of the '{@link #getTheUI() <em>The UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheUI()
	 * @generated
	 * @ordered
	 */
	protected UI theUI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return interrapidisimoPackage.Literals.MODEL_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		return theDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		Domain oldTheDomain = theDomain;
		theDomain = newTheDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, interrapidisimoPackage.MODEL_FACTORY__THE_DOMAIN, oldTheDomain, newTheDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != theDomain) {
			NotificationChain msgs = null;
			if (theDomain != null)
				msgs = ((InternalEObject)theDomain).eInverseRemove(this, DomainPackage.DOMAIN__THE_MODEL_FACTORY, Domain.class, msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_MODEL_FACTORY, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, interrapidisimoPackage.MODEL_FACTORY__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getTheUI() {
		return theUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheUI(UI newTheUI, NotificationChain msgs) {
		UI oldTheUI = theUI;
		theUI = newTheUI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, interrapidisimoPackage.MODEL_FACTORY__THE_UI, oldTheUI, newTheUI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheUI(UI newTheUI) {
		if (newTheUI != theUI) {
			NotificationChain msgs = null;
			if (theUI != null)
				msgs = ((InternalEObject)theUI).eInverseRemove(this, UiPackage.UI__THE_MODEL_FACTORY, UI.class, msgs);
			if (newTheUI != null)
				msgs = ((InternalEObject)newTheUI).eInverseAdd(this, UiPackage.UI__THE_MODEL_FACTORY, UI.class, msgs);
			msgs = basicSetTheUI(newTheUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, interrapidisimoPackage.MODEL_FACTORY__THE_UI, newTheUI, newTheUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory cargar(final String ruta) {
		ModelFactory modelFactory = null;
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/"+ruta);
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
		resource.load(java.util.Collections.EMPTY_MAP);
		modelFactory = (ModelFactory) resource.getContents().get(0);
		} catch (java.io.IOException e) {
		// TO-DO Auto-generated catch block
		e.printStackTrace();
		}
		
		return modelFactory;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void salvar(final String ruta) {
		ModelFactory modelFactory = this;
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/"+ruta);
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactory);
		try {
		resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
		// TO-DO Auto-generated catch block
		e.printStackTrace();
		}
		
		return;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		//TODO implementarModelo
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case interrapidisimoPackage.MODEL_FACTORY__THE_DOMAIN:
				if (theDomain != null)
					msgs = ((InternalEObject)theDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - interrapidisimoPackage.MODEL_FACTORY__THE_DOMAIN, null, msgs);
				return basicSetTheDomain((Domain)otherEnd, msgs);
			case interrapidisimoPackage.MODEL_FACTORY__THE_UI:
				if (theUI != null)
					msgs = ((InternalEObject)theUI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - interrapidisimoPackage.MODEL_FACTORY__THE_UI, null, msgs);
				return basicSetTheUI((UI)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case interrapidisimoPackage.MODEL_FACTORY__THE_DOMAIN:
				return basicSetTheDomain(null, msgs);
			case interrapidisimoPackage.MODEL_FACTORY__THE_UI:
				return basicSetTheUI(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case interrapidisimoPackage.MODEL_FACTORY__THE_DOMAIN:
				return getTheDomain();
			case interrapidisimoPackage.MODEL_FACTORY__THE_UI:
				return getTheUI();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case interrapidisimoPackage.MODEL_FACTORY__THE_DOMAIN:
				setTheDomain((Domain)newValue);
				return;
			case interrapidisimoPackage.MODEL_FACTORY__THE_UI:
				setTheUI((UI)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case interrapidisimoPackage.MODEL_FACTORY__THE_DOMAIN:
				setTheDomain((Domain)null);
				return;
			case interrapidisimoPackage.MODEL_FACTORY__THE_UI:
				setTheUI((UI)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case interrapidisimoPackage.MODEL_FACTORY__THE_DOMAIN:
				return theDomain != null;
			case interrapidisimoPackage.MODEL_FACTORY__THE_UI:
				return theUI != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelFactoryImpl
