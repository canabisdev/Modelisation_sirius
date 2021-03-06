/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.etudiant;
import fr.obeo.dsl.projet.groupeidm.repository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.repositoryImpl#getEtudiant <em>Etudiant</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.repositoryImpl#getNameRp <em>Name Rp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class repositoryImpl extends MinimalEObjectImpl.Container implements repository {
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
	 * The default value of the '{@link #getNameRp() <em>Name Rp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameRp()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_RP_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNameRp() <em>Name Rp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameRp()
	 * @generated
	 * @ordered
	 */
	protected String nameRp = NAME_RP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected repositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupeidmPackage.Literals.REPOSITORY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.REPOSITORY__ETUDIANT,
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
					GroupeidmPackage.REPOSITORY__ETUDIANT, oldEtudiant, newEtudiant);
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
				msgs = ((InternalEObject) etudiant).eInverseRemove(this, GroupeidmPackage.ETUDIANT__REPOSITORY,
						etudiant.class, msgs);
			if (newEtudiant != null)
				msgs = ((InternalEObject) newEtudiant).eInverseAdd(this, GroupeidmPackage.ETUDIANT__REPOSITORY,
						etudiant.class, msgs);
			msgs = basicSetEtudiant(newEtudiant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.REPOSITORY__ETUDIANT, newEtudiant,
					newEtudiant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameRp() {
		return nameRp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameRp(String newNameRp) {
		String oldNameRp = nameRp;
		nameRp = newNameRp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.REPOSITORY__NAME_RP, oldNameRp,
					nameRp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GroupeidmPackage.REPOSITORY__ETUDIANT:
			if (etudiant != null)
				msgs = ((InternalEObject) etudiant).eInverseRemove(this, GroupeidmPackage.ETUDIANT__REPOSITORY,
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
		case GroupeidmPackage.REPOSITORY__ETUDIANT:
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
		case GroupeidmPackage.REPOSITORY__ETUDIANT:
			if (resolve)
				return getEtudiant();
			return basicGetEtudiant();
		case GroupeidmPackage.REPOSITORY__NAME_RP:
			return getNameRp();
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
		case GroupeidmPackage.REPOSITORY__ETUDIANT:
			setEtudiant((etudiant) newValue);
			return;
		case GroupeidmPackage.REPOSITORY__NAME_RP:
			setNameRp((String) newValue);
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
		case GroupeidmPackage.REPOSITORY__ETUDIANT:
			setEtudiant((etudiant) null);
			return;
		case GroupeidmPackage.REPOSITORY__NAME_RP:
			setNameRp(NAME_RP_EDEFAULT);
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
		case GroupeidmPackage.REPOSITORY__ETUDIANT:
			return etudiant != null;
		case GroupeidmPackage.REPOSITORY__NAME_RP:
			return NAME_RP_EDEFAULT == null ? nameRp != null : !NAME_RP_EDEFAULT.equals(nameRp);
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
		result.append(" (nameRp: ");
		result.append(nameRp);
		result.append(')');
		return result.toString();
	}

} //repositoryImpl
