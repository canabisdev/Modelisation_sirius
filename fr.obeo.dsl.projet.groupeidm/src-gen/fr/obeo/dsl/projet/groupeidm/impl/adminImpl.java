/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.admin;
import fr.obeo.dsl.projet.groupeidm.formation;
import fr.obeo.dsl.projet.groupeidm.groupe;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.adminImpl#getGroupe <em>Groupe</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.adminImpl#getFormation <em>Formation</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.adminImpl#getNameAdm <em>Name Adm</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.adminImpl#getPasswordAdm <em>Password Adm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class adminImpl extends membreImpl implements admin {
	/**
	 * The cached value of the '{@link #getGroupe() <em>Groupe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupe()
	 * @generated
	 * @ordered
	 */
	protected groupe groupe;

	/**
	 * The cached value of the '{@link #getFormation() <em>Formation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormation()
	 * @generated
	 * @ordered
	 */
	protected formation formation;

	/**
	 * The default value of the '{@link #getNameAdm() <em>Name Adm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAdm()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_ADM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameAdm() <em>Name Adm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAdm()
	 * @generated
	 * @ordered
	 */
	protected String nameAdm = NAME_ADM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordAdm() <em>Password Adm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordAdm()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_ADM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPasswordAdm() <em>Password Adm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordAdm()
	 * @generated
	 * @ordered
	 */
	protected String passwordAdm = PASSWORD_ADM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected adminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupeidmPackage.Literals.ADMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public groupe getGroupe() {
		if (groupe != null && groupe.eIsProxy()) {
			InternalEObject oldGroupe = (InternalEObject) groupe;
			groupe = (groupe) eResolveProxy(oldGroupe);
			if (groupe != oldGroupe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.ADMIN__GROUPE, oldGroupe,
							groupe));
			}
		}
		return groupe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public groupe basicGetGroupe() {
		return groupe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupe(groupe newGroupe, NotificationChain msgs) {
		groupe oldGroupe = groupe;
		groupe = newGroupe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.ADMIN__GROUPE, oldGroupe, newGroupe);
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
	public void setGroupe(groupe newGroupe) {
		if (newGroupe != groupe) {
			NotificationChain msgs = null;
			if (groupe != null)
				msgs = ((InternalEObject) groupe).eInverseRemove(this, GroupeidmPackage.GROUPE__ADMIN, groupe.class,
						msgs);
			if (newGroupe != null)
				msgs = ((InternalEObject) newGroupe).eInverseAdd(this, GroupeidmPackage.GROUPE__ADMIN, groupe.class,
						msgs);
			msgs = basicSetGroupe(newGroupe, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ADMIN__GROUPE, newGroupe,
					newGroupe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formation getFormation() {
		if (formation != null && formation.eIsProxy()) {
			InternalEObject oldFormation = (InternalEObject) formation;
			formation = (formation) eResolveProxy(oldFormation);
			if (formation != oldFormation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.ADMIN__FORMATION,
							oldFormation, formation));
			}
		}
		return formation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formation basicGetFormation() {
		return formation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormation(formation newFormation, NotificationChain msgs) {
		formation oldFormation = formation;
		formation = newFormation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.ADMIN__FORMATION, oldFormation, newFormation);
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
	public void setFormation(formation newFormation) {
		if (newFormation != formation) {
			NotificationChain msgs = null;
			if (formation != null)
				msgs = ((InternalEObject) formation).eInverseRemove(this, GroupeidmPackage.FORMATION__ADMIN,
						formation.class, msgs);
			if (newFormation != null)
				msgs = ((InternalEObject) newFormation).eInverseAdd(this, GroupeidmPackage.FORMATION__ADMIN,
						formation.class, msgs);
			msgs = basicSetFormation(newFormation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ADMIN__FORMATION, newFormation,
					newFormation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameAdm() {
		return nameAdm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameAdm(String newNameAdm) {
		String oldNameAdm = nameAdm;
		nameAdm = newNameAdm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ADMIN__NAME_ADM, oldNameAdm,
					nameAdm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPasswordAdm() {
		return passwordAdm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordAdm(String newPasswordAdm) {
		String oldPasswordAdm = passwordAdm;
		passwordAdm = newPasswordAdm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ADMIN__PASSWORD_ADM, oldPasswordAdm,
					passwordAdm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GroupeidmPackage.ADMIN__GROUPE:
			if (groupe != null)
				msgs = ((InternalEObject) groupe).eInverseRemove(this, GroupeidmPackage.GROUPE__ADMIN, groupe.class,
						msgs);
			return basicSetGroupe((groupe) otherEnd, msgs);
		case GroupeidmPackage.ADMIN__FORMATION:
			if (formation != null)
				msgs = ((InternalEObject) formation).eInverseRemove(this, GroupeidmPackage.FORMATION__ADMIN,
						formation.class, msgs);
			return basicSetFormation((formation) otherEnd, msgs);
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
		case GroupeidmPackage.ADMIN__GROUPE:
			return basicSetGroupe(null, msgs);
		case GroupeidmPackage.ADMIN__FORMATION:
			return basicSetFormation(null, msgs);
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
		case GroupeidmPackage.ADMIN__GROUPE:
			if (resolve)
				return getGroupe();
			return basicGetGroupe();
		case GroupeidmPackage.ADMIN__FORMATION:
			if (resolve)
				return getFormation();
			return basicGetFormation();
		case GroupeidmPackage.ADMIN__NAME_ADM:
			return getNameAdm();
		case GroupeidmPackage.ADMIN__PASSWORD_ADM:
			return getPasswordAdm();
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
		case GroupeidmPackage.ADMIN__GROUPE:
			setGroupe((groupe) newValue);
			return;
		case GroupeidmPackage.ADMIN__FORMATION:
			setFormation((formation) newValue);
			return;
		case GroupeidmPackage.ADMIN__NAME_ADM:
			setNameAdm((String) newValue);
			return;
		case GroupeidmPackage.ADMIN__PASSWORD_ADM:
			setPasswordAdm((String) newValue);
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
		case GroupeidmPackage.ADMIN__GROUPE:
			setGroupe((groupe) null);
			return;
		case GroupeidmPackage.ADMIN__FORMATION:
			setFormation((formation) null);
			return;
		case GroupeidmPackage.ADMIN__NAME_ADM:
			setNameAdm(NAME_ADM_EDEFAULT);
			return;
		case GroupeidmPackage.ADMIN__PASSWORD_ADM:
			setPasswordAdm(PASSWORD_ADM_EDEFAULT);
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
		case GroupeidmPackage.ADMIN__GROUPE:
			return groupe != null;
		case GroupeidmPackage.ADMIN__FORMATION:
			return formation != null;
		case GroupeidmPackage.ADMIN__NAME_ADM:
			return NAME_ADM_EDEFAULT == null ? nameAdm != null : !NAME_ADM_EDEFAULT.equals(nameAdm);
		case GroupeidmPackage.ADMIN__PASSWORD_ADM:
			return PASSWORD_ADM_EDEFAULT == null ? passwordAdm != null : !PASSWORD_ADM_EDEFAULT.equals(passwordAdm);
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
		result.append(" (nameAdm: ");
		result.append(nameAdm);
		result.append(", passwordAdm: ");
		result.append(passwordAdm);
		result.append(')');
		return result.toString();
	}

} //adminImpl
