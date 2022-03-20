/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.auteur;
import fr.obeo.dsl.projet.groupeidm.chapitre;
import fr.obeo.dsl.projet.groupeidm.formation;
import fr.obeo.dsl.projet.groupeidm.module;
import fr.obeo.dsl.projet.groupeidm.tracking;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.moduleImpl#getFromation <em>Fromation</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.moduleImpl#getAuteur <em>Auteur</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.moduleImpl#getChapitre <em>Chapitre</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.moduleImpl#getTracking <em>Tracking</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.moduleImpl#getCoeff <em>Coeff</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.moduleImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class moduleImpl extends MinimalEObjectImpl.Container implements module {
	/**
	 * The cached value of the '{@link #getFromation() <em>Fromation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromation()
	 * @generated
	 * @ordered
	 */
	protected formation fromation;

	/**
	 * The cached value of the '{@link #getAuteur() <em>Auteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuteur()
	 * @generated
	 * @ordered
	 */
	protected auteur auteur;

	/**
	 * The cached value of the '{@link #getChapitre() <em>Chapitre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChapitre()
	 * @generated
	 * @ordered
	 */
	protected EList<chapitre> chapitre;

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
	 * The default value of the '{@link #getCoeff() <em>Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoeff()
	 * @generated
	 * @ordered
	 */
	protected static final int COEFF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoeff() <em>Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoeff()
	 * @generated
	 * @ordered
	 */
	protected int coeff = COEFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected moduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupeidmPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formation getFromation() {
		if (fromation != null && fromation.eIsProxy()) {
			InternalEObject oldFromation = (InternalEObject) fromation;
			fromation = (formation) eResolveProxy(oldFromation);
			if (fromation != oldFromation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.MODULE__FROMATION,
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
	public formation basicGetFromation() {
		return fromation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromation(formation newFromation, NotificationChain msgs) {
		formation oldFromation = fromation;
		fromation = newFromation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.MODULE__FROMATION, oldFromation, newFromation);
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
	public void setFromation(formation newFromation) {
		if (newFromation != fromation) {
			NotificationChain msgs = null;
			if (fromation != null)
				msgs = ((InternalEObject) fromation).eInverseRemove(this, GroupeidmPackage.FORMATION__MODULE,
						formation.class, msgs);
			if (newFromation != null)
				msgs = ((InternalEObject) newFromation).eInverseAdd(this, GroupeidmPackage.FORMATION__MODULE,
						formation.class, msgs);
			msgs = basicSetFromation(newFromation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.MODULE__FROMATION, newFromation,
					newFromation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public auteur getAuteur() {
		if (auteur != null && auteur.eIsProxy()) {
			InternalEObject oldAuteur = (InternalEObject) auteur;
			auteur = (auteur) eResolveProxy(oldAuteur);
			if (auteur != oldAuteur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.MODULE__AUTEUR,
							oldAuteur, auteur));
			}
		}
		return auteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public auteur basicGetAuteur() {
		return auteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuteur(auteur newAuteur, NotificationChain msgs) {
		auteur oldAuteur = auteur;
		auteur = newAuteur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.MODULE__AUTEUR, oldAuteur, newAuteur);
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
	public void setAuteur(auteur newAuteur) {
		if (newAuteur != auteur) {
			NotificationChain msgs = null;
			if (auteur != null)
				msgs = ((InternalEObject) auteur).eInverseRemove(this, GroupeidmPackage.AUTEUR__MODULE, auteur.class,
						msgs);
			if (newAuteur != null)
				msgs = ((InternalEObject) newAuteur).eInverseAdd(this, GroupeidmPackage.AUTEUR__MODULE, auteur.class,
						msgs);
			msgs = basicSetAuteur(newAuteur, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.MODULE__AUTEUR, newAuteur,
					newAuteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<chapitre> getChapitre() {
		if (chapitre == null) {
			chapitre = new EObjectContainmentEList<chapitre>(chapitre.class, this, GroupeidmPackage.MODULE__CHAPITRE);
		}
		return chapitre;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.MODULE__TRACKING,
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
					GroupeidmPackage.MODULE__TRACKING, oldTracking, newTracking);
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
				msgs = ((InternalEObject) tracking).eInverseRemove(this, GroupeidmPackage.TRACKING__MODULE,
						tracking.class, msgs);
			if (newTracking != null)
				msgs = ((InternalEObject) newTracking).eInverseAdd(this, GroupeidmPackage.TRACKING__MODULE,
						tracking.class, msgs);
			msgs = basicSetTracking(newTracking, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.MODULE__TRACKING, newTracking,
					newTracking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoeff() {
		return coeff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoeff(int newCoeff) {
		int oldCoeff = coeff;
		coeff = newCoeff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.MODULE__COEFF, oldCoeff, coeff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.MODULE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GroupeidmPackage.MODULE__FROMATION:
			if (fromation != null)
				msgs = ((InternalEObject) fromation).eInverseRemove(this, GroupeidmPackage.FORMATION__MODULE,
						formation.class, msgs);
			return basicSetFromation((formation) otherEnd, msgs);
		case GroupeidmPackage.MODULE__AUTEUR:
			if (auteur != null)
				msgs = ((InternalEObject) auteur).eInverseRemove(this, GroupeidmPackage.AUTEUR__MODULE, auteur.class,
						msgs);
			return basicSetAuteur((auteur) otherEnd, msgs);
		case GroupeidmPackage.MODULE__TRACKING:
			if (tracking != null)
				msgs = ((InternalEObject) tracking).eInverseRemove(this, GroupeidmPackage.TRACKING__MODULE,
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
		case GroupeidmPackage.MODULE__FROMATION:
			return basicSetFromation(null, msgs);
		case GroupeidmPackage.MODULE__AUTEUR:
			return basicSetAuteur(null, msgs);
		case GroupeidmPackage.MODULE__CHAPITRE:
			return ((InternalEList<?>) getChapitre()).basicRemove(otherEnd, msgs);
		case GroupeidmPackage.MODULE__TRACKING:
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
		case GroupeidmPackage.MODULE__FROMATION:
			if (resolve)
				return getFromation();
			return basicGetFromation();
		case GroupeidmPackage.MODULE__AUTEUR:
			if (resolve)
				return getAuteur();
			return basicGetAuteur();
		case GroupeidmPackage.MODULE__CHAPITRE:
			return getChapitre();
		case GroupeidmPackage.MODULE__TRACKING:
			if (resolve)
				return getTracking();
			return basicGetTracking();
		case GroupeidmPackage.MODULE__COEFF:
			return getCoeff();
		case GroupeidmPackage.MODULE__LEVEL:
			return getLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GroupeidmPackage.MODULE__FROMATION:
			setFromation((formation) newValue);
			return;
		case GroupeidmPackage.MODULE__AUTEUR:
			setAuteur((auteur) newValue);
			return;
		case GroupeidmPackage.MODULE__CHAPITRE:
			getChapitre().clear();
			getChapitre().addAll((Collection<? extends chapitre>) newValue);
			return;
		case GroupeidmPackage.MODULE__TRACKING:
			setTracking((tracking) newValue);
			return;
		case GroupeidmPackage.MODULE__COEFF:
			setCoeff((Integer) newValue);
			return;
		case GroupeidmPackage.MODULE__LEVEL:
			setLevel((String) newValue);
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
		case GroupeidmPackage.MODULE__FROMATION:
			setFromation((formation) null);
			return;
		case GroupeidmPackage.MODULE__AUTEUR:
			setAuteur((auteur) null);
			return;
		case GroupeidmPackage.MODULE__CHAPITRE:
			getChapitre().clear();
			return;
		case GroupeidmPackage.MODULE__TRACKING:
			setTracking((tracking) null);
			return;
		case GroupeidmPackage.MODULE__COEFF:
			setCoeff(COEFF_EDEFAULT);
			return;
		case GroupeidmPackage.MODULE__LEVEL:
			setLevel(LEVEL_EDEFAULT);
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
		case GroupeidmPackage.MODULE__FROMATION:
			return fromation != null;
		case GroupeidmPackage.MODULE__AUTEUR:
			return auteur != null;
		case GroupeidmPackage.MODULE__CHAPITRE:
			return chapitre != null && !chapitre.isEmpty();
		case GroupeidmPackage.MODULE__TRACKING:
			return tracking != null;
		case GroupeidmPackage.MODULE__COEFF:
			return coeff != COEFF_EDEFAULT;
		case GroupeidmPackage.MODULE__LEVEL:
			return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
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
		result.append(" (coeff: ");
		result.append(coeff);
		result.append(", Level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //moduleImpl
