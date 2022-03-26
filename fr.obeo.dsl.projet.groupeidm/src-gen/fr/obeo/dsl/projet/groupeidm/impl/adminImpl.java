/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.admin;
import fr.obeo.dsl.projet.groupeidm.fromation;
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
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.adminImpl#getFromation <em>Fromation</em>}</li>
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
	 * The cached value of the '{@link #getFromation() <em>Fromation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromation()
	 * @generated
	 * @ordered
	 */
	protected fromation fromation;

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
	public fromation getFromation() {
		if (fromation != null && fromation.eIsProxy()) {
			InternalEObject oldFromation = (InternalEObject) fromation;
			fromation = (fromation) eResolveProxy(oldFromation);
			if (fromation != oldFromation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.ADMIN__FROMATION,
							oldFromation, fromation));
			}
		}
		return fromation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fromation basicGetFromation() {
		return fromation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromation(fromation newFromation, NotificationChain msgs) {
		fromation oldFromation = fromation;
		fromation = newFromation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.ADMIN__FROMATION, oldFromation, newFromation);
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
	public void setFromation(fromation newFromation) {
		if (newFromation != fromation) {
			NotificationChain msgs = null;
			if (fromation != null)
				msgs = ((InternalEObject) fromation).eInverseRemove(this, GroupeidmPackage.FROMATION__ADMIN,
						fromation.class, msgs);
			if (newFromation != null)
				msgs = ((InternalEObject) newFromation).eInverseAdd(this, GroupeidmPackage.FROMATION__ADMIN,
						fromation.class, msgs);
			msgs = basicSetFromation(newFromation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ADMIN__FROMATION, newFromation,
					newFromation));
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
		case GroupeidmPackage.ADMIN__FROMATION:
			if (fromation != null)
				msgs = ((InternalEObject) fromation).eInverseRemove(this, GroupeidmPackage.FROMATION__ADMIN,
						fromation.class, msgs);
			return basicSetFromation((fromation) otherEnd, msgs);
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
		case GroupeidmPackage.ADMIN__FROMATION:
			return basicSetFromation(null, msgs);
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
		case GroupeidmPackage.ADMIN__FROMATION:
			if (resolve)
				return getFromation();
			return basicGetFromation();
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
		case GroupeidmPackage.ADMIN__FROMATION:
			setFromation((fromation) newValue);
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
		case GroupeidmPackage.ADMIN__FROMATION:
			setFromation((fromation) null);
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
		case GroupeidmPackage.ADMIN__FROMATION:
			return fromation != null;
		}
		return super.eIsSet(featureID);
	}

} //adminImpl
