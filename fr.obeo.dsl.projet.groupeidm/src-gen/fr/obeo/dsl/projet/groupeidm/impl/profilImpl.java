/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.profil;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>profil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.profilImpl#getAvatar <em>Avatar</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.profilImpl#getCity <em>City</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.profilImpl#getTel <em>Tel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class profilImpl extends MinimalEObjectImpl.Container implements profil {
	/**
	 * The default value of the '{@link #getAvatar() <em>Avatar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvatar()
	 * @generated
	 * @ordered
	 */
	protected static final String AVATAR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAvatar() <em>Avatar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvatar()
	 * @generated
	 * @ordered
	 */
	protected String avatar = AVATAR_EDEFAULT;
	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getTel() <em>Tel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTel()
	 * @generated
	 * @ordered
	 */
	protected static final int TEL_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTel() <em>Tel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTel()
	 * @generated
	 * @ordered
	 */
	protected int tel = TEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected profilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupeidmPackage.Literals.PROFIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvatar(String newAvatar) {
		String oldAvatar = avatar;
		avatar = newAvatar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.PROFIL__AVATAR, oldAvatar, avatar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.PROFIL__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTel() {
		return tel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTel(int newTel) {
		int oldTel = tel;
		tel = newTel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.PROFIL__TEL, oldTel, tel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GroupeidmPackage.PROFIL__AVATAR:
			return getAvatar();
		case GroupeidmPackage.PROFIL__CITY:
			return getCity();
		case GroupeidmPackage.PROFIL__TEL:
			return getTel();
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
		case GroupeidmPackage.PROFIL__AVATAR:
			setAvatar((String) newValue);
			return;
		case GroupeidmPackage.PROFIL__CITY:
			setCity((String) newValue);
			return;
		case GroupeidmPackage.PROFIL__TEL:
			setTel((Integer) newValue);
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
		case GroupeidmPackage.PROFIL__AVATAR:
			setAvatar(AVATAR_EDEFAULT);
			return;
		case GroupeidmPackage.PROFIL__CITY:
			setCity(CITY_EDEFAULT);
			return;
		case GroupeidmPackage.PROFIL__TEL:
			setTel(TEL_EDEFAULT);
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
		case GroupeidmPackage.PROFIL__AVATAR:
			return AVATAR_EDEFAULT == null ? avatar != null : !AVATAR_EDEFAULT.equals(avatar);
		case GroupeidmPackage.PROFIL__CITY:
			return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
		case GroupeidmPackage.PROFIL__TEL:
			return tel != TEL_EDEFAULT;
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
		result.append(" (avatar: ");
		result.append(avatar);
		result.append(", city: ");
		result.append(city);
		result.append(", tel: ");
		result.append(tel);
		result.append(')');
		return result.toString();
	}

} //profilImpl
