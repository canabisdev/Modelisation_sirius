/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.auteur;
import fr.obeo.dsl.projet.groupeidm.module;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>auteur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.auteurImpl#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class auteurImpl extends membreImpl implements auteur {
	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected module module;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected auteurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupeidmPackage.Literals.AUTEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public module getModule() {
		if (module != null && module.eIsProxy()) {
			InternalEObject oldModule = (InternalEObject) module;
			module = (module) eResolveProxy(oldModule);
			if (module != oldModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.AUTEUR__MODULE,
							oldModule, module));
			}
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public module basicGetModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(module newModule, NotificationChain msgs) {
		module oldModule = module;
		module = newModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.AUTEUR__MODULE, oldModule, newModule);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(module newModule) {
		if (newModule != module) {
			NotificationChain msgs = null;
			if (module != null)
				msgs = ((InternalEObject) module).eInverseRemove(this, GroupeidmPackage.MODULE__AUTEUR, module.class,
						msgs);
			if (newModule != null)
				msgs = ((InternalEObject) newModule).eInverseAdd(this, GroupeidmPackage.MODULE__AUTEUR, module.class,
						msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.AUTEUR__MODULE, newModule,
					newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GroupeidmPackage.AUTEUR__MODULE:
			if (module != null)
				msgs = ((InternalEObject) module).eInverseRemove(this, GroupeidmPackage.MODULE__AUTEUR, module.class,
						msgs);
			return basicSetModule((module) otherEnd, msgs);
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
		case GroupeidmPackage.AUTEUR__MODULE:
			return basicSetModule(null, msgs);
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
		case GroupeidmPackage.AUTEUR__MODULE:
			if (resolve)
				return getModule();
			return basicGetModule();
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
		case GroupeidmPackage.AUTEUR__MODULE:
			setModule((module) newValue);
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
		case GroupeidmPackage.AUTEUR__MODULE:
			setModule((module) null);
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
		case GroupeidmPackage.AUTEUR__MODULE:
			return module != null;
		}
		return super.eIsSet(featureID);
	}

} //auteurImpl
