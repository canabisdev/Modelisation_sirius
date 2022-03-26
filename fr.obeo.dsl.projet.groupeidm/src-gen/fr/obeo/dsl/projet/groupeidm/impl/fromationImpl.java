/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.admin;
import fr.obeo.dsl.projet.groupeidm.fromation;
import fr.obeo.dsl.projet.groupeidm.module;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>fromation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.fromationImpl#getAdmin <em>Admin</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.fromationImpl#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class fromationImpl extends MinimalEObjectImpl.Container implements fromation {
	/**
	 * The cached value of the '{@link #getAdmin() <em>Admin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmin()
	 * @generated
	 * @ordered
	 */
	protected admin admin;

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
	protected fromationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupeidmPackage.Literals.FROMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public admin getAdmin() {
		if (admin != null && admin.eIsProxy()) {
			InternalEObject oldAdmin = (InternalEObject) admin;
			admin = (admin) eResolveProxy(oldAdmin);
			if (admin != oldAdmin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.FROMATION__ADMIN,
							oldAdmin, admin));
			}
		}
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public admin basicGetAdmin() {
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmin(admin newAdmin, NotificationChain msgs) {
		admin oldAdmin = admin;
		admin = newAdmin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.FROMATION__ADMIN, oldAdmin, newAdmin);
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
	public void setAdmin(admin newAdmin) {
		if (newAdmin != admin) {
			NotificationChain msgs = null;
			if (admin != null)
				msgs = ((InternalEObject) admin).eInverseRemove(this, GroupeidmPackage.ADMIN__FROMATION, admin.class,
						msgs);
			if (newAdmin != null)
				msgs = ((InternalEObject) newAdmin).eInverseAdd(this, GroupeidmPackage.ADMIN__FROMATION, admin.class,
						msgs);
			msgs = basicSetAdmin(newAdmin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.FROMATION__ADMIN, newAdmin,
					newAdmin));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.FROMATION__MODULE,
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
					GroupeidmPackage.FROMATION__MODULE, oldModule, newModule);
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
				msgs = ((InternalEObject) module).eInverseRemove(this, GroupeidmPackage.MODULE__FROMATION, module.class,
						msgs);
			if (newModule != null)
				msgs = ((InternalEObject) newModule).eInverseAdd(this, GroupeidmPackage.MODULE__FROMATION, module.class,
						msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.FROMATION__MODULE, newModule,
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
		case GroupeidmPackage.FROMATION__ADMIN:
			if (admin != null)
				msgs = ((InternalEObject) admin).eInverseRemove(this, GroupeidmPackage.ADMIN__FROMATION, admin.class,
						msgs);
			return basicSetAdmin((admin) otherEnd, msgs);
		case GroupeidmPackage.FROMATION__MODULE:
			if (module != null)
				msgs = ((InternalEObject) module).eInverseRemove(this, GroupeidmPackage.MODULE__FROMATION, module.class,
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
		case GroupeidmPackage.FROMATION__ADMIN:
			return basicSetAdmin(null, msgs);
		case GroupeidmPackage.FROMATION__MODULE:
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
		case GroupeidmPackage.FROMATION__ADMIN:
			if (resolve)
				return getAdmin();
			return basicGetAdmin();
		case GroupeidmPackage.FROMATION__MODULE:
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
		case GroupeidmPackage.FROMATION__ADMIN:
			setAdmin((admin) newValue);
			return;
		case GroupeidmPackage.FROMATION__MODULE:
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
		case GroupeidmPackage.FROMATION__ADMIN:
			setAdmin((admin) null);
			return;
		case GroupeidmPackage.FROMATION__MODULE:
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
		case GroupeidmPackage.FROMATION__ADMIN:
			return admin != null;
		case GroupeidmPackage.FROMATION__MODULE:
			return module != null;
		}
		return super.eIsSet(featureID);
	}

} //fromationImpl
