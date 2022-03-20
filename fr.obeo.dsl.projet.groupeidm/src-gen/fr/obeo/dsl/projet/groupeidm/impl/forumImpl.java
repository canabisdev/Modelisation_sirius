/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.etudiant;
import fr.obeo.dsl.projet.groupeidm.forum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>forum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.forumImpl#getEtudiant <em>Etudiant</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.forumImpl#getNameFrm <em>Name Frm</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.forumImpl#getContenuFrm <em>Contenu Frm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class forumImpl extends MinimalEObjectImpl.Container implements forum {
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
	 * The default value of the '{@link #getContenuFrm() <em>Contenu Frm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenuFrm()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENU_FRM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContenuFrm() <em>Contenu Frm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenuFrm()
	 * @generated
	 * @ordered
	 */
	protected String contenuFrm = CONTENU_FRM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected forumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupeidmPackage.Literals.FORUM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.FORUM__ETUDIANT,
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
					GroupeidmPackage.FORUM__ETUDIANT, oldEtudiant, newEtudiant);
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
				msgs = ((InternalEObject) etudiant).eInverseRemove(this, GroupeidmPackage.ETUDIANT__FORUM,
						etudiant.class, msgs);
			if (newEtudiant != null)
				msgs = ((InternalEObject) newEtudiant).eInverseAdd(this, GroupeidmPackage.ETUDIANT__FORUM,
						etudiant.class, msgs);
			msgs = basicSetEtudiant(newEtudiant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.FORUM__ETUDIANT, newEtudiant,
					newEtudiant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.FORUM__NAME_FRM, oldNameFrm,
					nameFrm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContenuFrm() {
		return contenuFrm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenuFrm(String newContenuFrm) {
		String oldContenuFrm = contenuFrm;
		contenuFrm = newContenuFrm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.FORUM__CONTENU_FRM, oldContenuFrm,
					contenuFrm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GroupeidmPackage.FORUM__ETUDIANT:
			if (etudiant != null)
				msgs = ((InternalEObject) etudiant).eInverseRemove(this, GroupeidmPackage.ETUDIANT__FORUM,
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
		case GroupeidmPackage.FORUM__ETUDIANT:
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
		case GroupeidmPackage.FORUM__ETUDIANT:
			if (resolve)
				return getEtudiant();
			return basicGetEtudiant();
		case GroupeidmPackage.FORUM__NAME_FRM:
			return getNameFrm();
		case GroupeidmPackage.FORUM__CONTENU_FRM:
			return getContenuFrm();
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
		case GroupeidmPackage.FORUM__ETUDIANT:
			setEtudiant((etudiant) newValue);
			return;
		case GroupeidmPackage.FORUM__NAME_FRM:
			setNameFrm((String) newValue);
			return;
		case GroupeidmPackage.FORUM__CONTENU_FRM:
			setContenuFrm((String) newValue);
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
		case GroupeidmPackage.FORUM__ETUDIANT:
			setEtudiant((etudiant) null);
			return;
		case GroupeidmPackage.FORUM__NAME_FRM:
			setNameFrm(NAME_FRM_EDEFAULT);
			return;
		case GroupeidmPackage.FORUM__CONTENU_FRM:
			setContenuFrm(CONTENU_FRM_EDEFAULT);
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
		case GroupeidmPackage.FORUM__ETUDIANT:
			return etudiant != null;
		case GroupeidmPackage.FORUM__NAME_FRM:
			return NAME_FRM_EDEFAULT == null ? nameFrm != null : !NAME_FRM_EDEFAULT.equals(nameFrm);
		case GroupeidmPackage.FORUM__CONTENU_FRM:
			return CONTENU_FRM_EDEFAULT == null ? contenuFrm != null : !CONTENU_FRM_EDEFAULT.equals(contenuFrm);
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
		result.append(", contenuFrm: ");
		result.append(contenuFrm);
		result.append(')');
		return result.toString();
	}

} //forumImpl
