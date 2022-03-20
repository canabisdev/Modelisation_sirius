/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.admin;
import fr.obeo.dsl.projet.groupeidm.formation;
import fr.obeo.dsl.projet.groupeidm.module;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>formation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.formationImpl#getAdmin <em>Admin</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.formationImpl#getModule <em>Module</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.formationImpl#getNameFrm <em>Name Frm</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.formationImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.formationImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class formationImpl extends MinimalEObjectImpl.Container implements formation {
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
	 * The default value of the '{@link #getNameFrm() <em>Name Frm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFrm()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_FRM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameFrm() <em>Name Frm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFrm()
	 * @generated
	 * @ordered
	 */
	protected String nameFrm = NAME_FRM_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Date DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Date duration = DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected formationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupeidmPackage.Literals.FORMATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.FORMATION__ADMIN,
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
					GroupeidmPackage.FORMATION__ADMIN, oldAdmin, newAdmin);
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
				msgs = ((InternalEObject) admin).eInverseRemove(this, GroupeidmPackage.ADMIN__FORMATION, admin.class,
						msgs);
			if (newAdmin != null)
				msgs = ((InternalEObject) newAdmin).eInverseAdd(this, GroupeidmPackage.ADMIN__FORMATION, admin.class,
						msgs);
			msgs = basicSetAdmin(newAdmin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.FORMATION__ADMIN, newAdmin,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.FORMATION__MODULE,
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
					GroupeidmPackage.FORMATION__MODULE, oldModule, newModule);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.FORMATION__MODULE, newModule,
					newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameFrm() {
		return nameFrm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameFrm(String newNameFrm) {
		String oldNameFrm = nameFrm;
		nameFrm = newNameFrm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.FORMATION__NAME_FRM, oldNameFrm,
					nameFrm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.FORMATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Date newDuration) {
		Date oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.FORMATION__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GroupeidmPackage.FORMATION__ADMIN:
			if (admin != null)
				msgs = ((InternalEObject) admin).eInverseRemove(this, GroupeidmPackage.ADMIN__FORMATION, admin.class,
						msgs);
			return basicSetAdmin((admin) otherEnd, msgs);
		case GroupeidmPackage.FORMATION__MODULE:
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
		case GroupeidmPackage.FORMATION__ADMIN:
			return basicSetAdmin(null, msgs);
		case GroupeidmPackage.FORMATION__MODULE:
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
		case GroupeidmPackage.FORMATION__ADMIN:
			if (resolve)
				return getAdmin();
			return basicGetAdmin();
		case GroupeidmPackage.FORMATION__MODULE:
			if (resolve)
				return getModule();
			return basicGetModule();
		case GroupeidmPackage.FORMATION__NAME_FRM:
			return getNameFrm();
		case GroupeidmPackage.FORMATION__TYPE:
			return getType();
		case GroupeidmPackage.FORMATION__DURATION:
			return getDuration();
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
		case GroupeidmPackage.FORMATION__ADMIN:
			setAdmin((admin) newValue);
			return;
		case GroupeidmPackage.FORMATION__MODULE:
			setModule((module) newValue);
			return;
		case GroupeidmPackage.FORMATION__NAME_FRM:
			setNameFrm((String) newValue);
			return;
		case GroupeidmPackage.FORMATION__TYPE:
			setType((String) newValue);
			return;
		case GroupeidmPackage.FORMATION__DURATION:
			setDuration((Date) newValue);
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
		case GroupeidmPackage.FORMATION__ADMIN:
			setAdmin((admin) null);
			return;
		case GroupeidmPackage.FORMATION__MODULE:
			setModule((module) null);
			return;
		case GroupeidmPackage.FORMATION__NAME_FRM:
			setNameFrm(NAME_FRM_EDEFAULT);
			return;
		case GroupeidmPackage.FORMATION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case GroupeidmPackage.FORMATION__DURATION:
			setDuration(DURATION_EDEFAULT);
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
		case GroupeidmPackage.FORMATION__ADMIN:
			return admin != null;
		case GroupeidmPackage.FORMATION__MODULE:
			return module != null;
		case GroupeidmPackage.FORMATION__NAME_FRM:
			return NAME_FRM_EDEFAULT == null ? nameFrm != null : !NAME_FRM_EDEFAULT.equals(nameFrm);
		case GroupeidmPackage.FORMATION__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case GroupeidmPackage.FORMATION__DURATION:
			return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nameFrm: ");
		result.append(nameFrm);
		result.append(", type: ");
		result.append(type);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //formationImpl
