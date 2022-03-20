/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.connecte;
import fr.obeo.dsl.projet.groupeidm.tracking;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>connecte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.connecteImpl#getTracking <em>Tracking</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.connecteImpl#isIsConnect <em>Is Connect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class connecteImpl extends etudiantImpl implements connecte {
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
	 * The default value of the '{@link #isIsConnect() <em>Is Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONNECT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsConnect() <em>Is Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnect()
	 * @generated
	 * @ordered
	 */
	protected boolean isConnect = IS_CONNECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected connecteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupeidmPackage.Literals.CONNECTE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.CONNECTE__TRACKING,
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
					GroupeidmPackage.CONNECTE__TRACKING, oldTracking, newTracking);
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
				msgs = ((InternalEObject) tracking).eInverseRemove(this, GroupeidmPackage.TRACKING__CONNECTE,
						tracking.class, msgs);
			if (newTracking != null)
				msgs = ((InternalEObject) newTracking).eInverseAdd(this, GroupeidmPackage.TRACKING__CONNECTE,
						tracking.class, msgs);
			msgs = basicSetTracking(newTracking, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.CONNECTE__TRACKING, newTracking,
					newTracking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConnect() {
		return isConnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConnect(boolean newIsConnect) {
		boolean oldIsConnect = isConnect;
		isConnect = newIsConnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.CONNECTE__IS_CONNECT, oldIsConnect,
					isConnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GroupeidmPackage.CONNECTE__TRACKING:
			if (tracking != null)
				msgs = ((InternalEObject) tracking).eInverseRemove(this, GroupeidmPackage.TRACKING__CONNECTE,
						tracking.class, msgs);
			return basicSetTracking((tracking) otherEnd, msgs);
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
		case GroupeidmPackage.CONNECTE__TRACKING:
			return basicSetTracking(null, msgs);
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
		case GroupeidmPackage.CONNECTE__TRACKING:
			if (resolve)
				return getTracking();
			return basicGetTracking();
		case GroupeidmPackage.CONNECTE__IS_CONNECT:
			return isIsConnect();
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
		case GroupeidmPackage.CONNECTE__TRACKING:
			setTracking((tracking) newValue);
			return;
		case GroupeidmPackage.CONNECTE__IS_CONNECT:
			setIsConnect((Boolean) newValue);
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
		case GroupeidmPackage.CONNECTE__TRACKING:
			setTracking((tracking) null);
			return;
		case GroupeidmPackage.CONNECTE__IS_CONNECT:
			setIsConnect(IS_CONNECT_EDEFAULT);
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
		case GroupeidmPackage.CONNECTE__TRACKING:
			return tracking != null;
		case GroupeidmPackage.CONNECTE__IS_CONNECT:
			return isConnect != IS_CONNECT_EDEFAULT;
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
		result.append(" (isConnect: ");
		result.append(isConnect);
		result.append(')');
		return result.toString();
	}

} //connecteImpl
