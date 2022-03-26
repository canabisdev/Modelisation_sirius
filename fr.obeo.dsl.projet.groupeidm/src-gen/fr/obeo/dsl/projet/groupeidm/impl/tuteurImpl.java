/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.groupe;
import fr.obeo.dsl.projet.groupeidm.tracking;
import fr.obeo.dsl.projet.groupeidm.tuteur;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tuteur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.tuteurImpl#getTracking <em>Tracking</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.tuteurImpl#getGroupe <em>Groupe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class tuteurImpl extends membreImpl implements tuteur {
	/**
	 * The cached value of the '{@link #getTracking() <em>Tracking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracking()
	 * @generated
	 * @ordered
	 */
	protected tracking tracking;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tuteurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupeidmPackage.Literals.TUTEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tracking getTracking() {
		if (tracking != null && tracking.eIsProxy()) {
			InternalEObject oldTracking = (InternalEObject) tracking;
			tracking = (tracking) eResolveProxy(oldTracking);
			if (tracking != oldTracking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.TUTEUR__TRACKING,
							oldTracking, tracking));
			}
		}
		return tracking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tracking basicGetTracking() {
		return tracking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTracking(tracking newTracking, NotificationChain msgs) {
		tracking oldTracking = tracking;
		tracking = newTracking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.TUTEUR__TRACKING, oldTracking, newTracking);
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
	public void setTracking(tracking newTracking) {
		if (newTracking != tracking) {
			NotificationChain msgs = null;
			if (tracking != null)
				msgs = ((InternalEObject) tracking).eInverseRemove(this, GroupeidmPackage.TRACKING__TUTEUR,
						tracking.class, msgs);
			if (newTracking != null)
				msgs = ((InternalEObject) newTracking).eInverseAdd(this, GroupeidmPackage.TRACKING__TUTEUR,
						tracking.class, msgs);
			msgs = basicSetTracking(newTracking, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.TUTEUR__TRACKING, newTracking,
					newTracking));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.TUTEUR__GROUPE,
							oldGroupe, groupe));
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
					GroupeidmPackage.TUTEUR__GROUPE, oldGroupe, newGroupe);
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
				msgs = ((InternalEObject) groupe).eInverseRemove(this, GroupeidmPackage.GROUPE__TUTEUR, groupe.class,
						msgs);
			if (newGroupe != null)
				msgs = ((InternalEObject) newGroupe).eInverseAdd(this, GroupeidmPackage.GROUPE__TUTEUR, groupe.class,
						msgs);
			msgs = basicSetGroupe(newGroupe, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.TUTEUR__GROUPE, newGroupe,
					newGroupe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GroupeidmPackage.TUTEUR__TRACKING:
			if (tracking != null)
				msgs = ((InternalEObject) tracking).eInverseRemove(this, GroupeidmPackage.TRACKING__TUTEUR,
						tracking.class, msgs);
			return basicSetTracking((tracking) otherEnd, msgs);
		case GroupeidmPackage.TUTEUR__GROUPE:
			if (groupe != null)
				msgs = ((InternalEObject) groupe).eInverseRemove(this, GroupeidmPackage.GROUPE__TUTEUR, groupe.class,
						msgs);
			return basicSetGroupe((groupe) otherEnd, msgs);
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
		case GroupeidmPackage.TUTEUR__TRACKING:
			return basicSetTracking(null, msgs);
		case GroupeidmPackage.TUTEUR__GROUPE:
			return basicSetGroupe(null, msgs);
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
		case GroupeidmPackage.TUTEUR__TRACKING:
			if (resolve)
				return getTracking();
			return basicGetTracking();
		case GroupeidmPackage.TUTEUR__GROUPE:
			if (resolve)
				return getGroupe();
			return basicGetGroupe();
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
		case GroupeidmPackage.TUTEUR__TRACKING:
			setTracking((tracking) newValue);
			return;
		case GroupeidmPackage.TUTEUR__GROUPE:
			setGroupe((groupe) newValue);
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
		case GroupeidmPackage.TUTEUR__TRACKING:
			setTracking((tracking) null);
			return;
		case GroupeidmPackage.TUTEUR__GROUPE:
			setGroupe((groupe) null);
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
		case GroupeidmPackage.TUTEUR__TRACKING:
			return tracking != null;
		case GroupeidmPackage.TUTEUR__GROUPE:
			return groupe != null;
		}
		return super.eIsSet(featureID);
	}

} //tuteurImpl
