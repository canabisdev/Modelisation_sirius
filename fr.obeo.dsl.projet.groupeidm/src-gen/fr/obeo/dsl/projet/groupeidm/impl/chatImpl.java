/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.chat;
import fr.obeo.dsl.projet.groupeidm.etudiant;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>chat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.chatImpl#getEtudiant <em>Etudiant</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.chatImpl#getPseudoChat <em>Pseudo Chat</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.chatImpl#isStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class chatImpl extends MinimalEObjectImpl.Container implements chat {
	/**
	 * The cached value of the '{@link #getEtudiant() <em>Etudiant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtudiant()
	 * @generated
	 * @ordered
	 */
	protected etudiant etudiant;

	/**
	 * The default value of the '{@link #getPseudoChat() <em>Pseudo Chat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudoChat()
	 * @generated
	 * @ordered
	 */
	protected static final String PSEUDO_CHAT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPseudoChat() <em>Pseudo Chat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudoChat()
	 * @generated
	 * @ordered
	 */
	protected String pseudoChat = PSEUDO_CHAT_EDEFAULT;
	/**
	 * The default value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected chatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupeidmPackage.Literals.CHAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public etudiant getEtudiant() {
		if (etudiant != null && etudiant.eIsProxy()) {
			InternalEObject oldEtudiant = (InternalEObject) etudiant;
			etudiant = (etudiant) eResolveProxy(oldEtudiant);
			if (etudiant != oldEtudiant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.CHAT__ETUDIANT,
							oldEtudiant, etudiant));
			}
		}
		return etudiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public etudiant basicGetEtudiant() {
		return etudiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtudiant(etudiant newEtudiant, NotificationChain msgs) {
		etudiant oldEtudiant = etudiant;
		etudiant = newEtudiant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.CHAT__ETUDIANT, oldEtudiant, newEtudiant);
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
	public void setEtudiant(etudiant newEtudiant) {
		if (newEtudiant != etudiant) {
			NotificationChain msgs = null;
			if (etudiant != null)
				msgs = ((InternalEObject) etudiant).eInverseRemove(this, GroupeidmPackage.ETUDIANT__CHAT,
						etudiant.class, msgs);
			if (newEtudiant != null)
				msgs = ((InternalEObject) newEtudiant).eInverseAdd(this, GroupeidmPackage.ETUDIANT__CHAT,
						etudiant.class, msgs);
			msgs = basicSetEtudiant(newEtudiant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.CHAT__ETUDIANT, newEtudiant,
					newEtudiant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPseudoChat() {
		return pseudoChat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPseudoChat(String newPseudoChat) {
		String oldPseudoChat = pseudoChat;
		pseudoChat = newPseudoChat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.CHAT__PSEUDO_CHAT, oldPseudoChat,
					pseudoChat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(boolean newStatus) {
		boolean oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.CHAT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GroupeidmPackage.CHAT__ETUDIANT:
			if (etudiant != null)
				msgs = ((InternalEObject) etudiant).eInverseRemove(this, GroupeidmPackage.ETUDIANT__CHAT,
						etudiant.class, msgs);
			return basicSetEtudiant((etudiant) otherEnd, msgs);
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
		case GroupeidmPackage.CHAT__ETUDIANT:
			return basicSetEtudiant(null, msgs);
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
		case GroupeidmPackage.CHAT__ETUDIANT:
			if (resolve)
				return getEtudiant();
			return basicGetEtudiant();
		case GroupeidmPackage.CHAT__PSEUDO_CHAT:
			return getPseudoChat();
		case GroupeidmPackage.CHAT__STATUS:
			return isStatus();
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
		case GroupeidmPackage.CHAT__ETUDIANT:
			setEtudiant((etudiant) newValue);
			return;
		case GroupeidmPackage.CHAT__PSEUDO_CHAT:
			setPseudoChat((String) newValue);
			return;
		case GroupeidmPackage.CHAT__STATUS:
			setStatus((Boolean) newValue);
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
		case GroupeidmPackage.CHAT__ETUDIANT:
			setEtudiant((etudiant) null);
			return;
		case GroupeidmPackage.CHAT__PSEUDO_CHAT:
			setPseudoChat(PSEUDO_CHAT_EDEFAULT);
			return;
		case GroupeidmPackage.CHAT__STATUS:
			setStatus(STATUS_EDEFAULT);
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
		case GroupeidmPackage.CHAT__ETUDIANT:
			return etudiant != null;
		case GroupeidmPackage.CHAT__PSEUDO_CHAT:
			return PSEUDO_CHAT_EDEFAULT == null ? pseudoChat != null : !PSEUDO_CHAT_EDEFAULT.equals(pseudoChat);
		case GroupeidmPackage.CHAT__STATUS:
			return status != STATUS_EDEFAULT;
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
		result.append(" (pseudoChat: ");
		result.append(pseudoChat);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //chatImpl
