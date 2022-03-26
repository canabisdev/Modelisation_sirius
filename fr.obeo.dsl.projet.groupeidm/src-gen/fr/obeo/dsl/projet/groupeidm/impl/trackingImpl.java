/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.chapitre;
import fr.obeo.dsl.projet.groupeidm.connecte;
import fr.obeo.dsl.projet.groupeidm.module;
import fr.obeo.dsl.projet.groupeidm.tracking;
import fr.obeo.dsl.projet.groupeidm.tuteur;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tracking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.trackingImpl#getModule <em>Module</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.trackingImpl#getChapitre <em>Chapitre</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.trackingImpl#getConnecte <em>Connecte</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.trackingImpl#getTuteur <em>Tuteur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class trackingImpl extends MinimalEObjectImpl.Container implements tracking {
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
	 * The cached value of the '{@link #getChapitre() <em>Chapitre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChapitre()
	 * @generated
	 * @ordered
	 */
	protected chapitre chapitre;

	/**
	 * The cached value of the '{@link #getConnecte() <em>Connecte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnecte()
	 * @generated
	 * @ordered
	 */
	protected connecte connecte;

	/**
	 * The cached value of the '{@link #getTuteur() <em>Tuteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuteur()
	 * @generated
	 * @ordered
	 */
	protected tuteur tuteur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected trackingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupeidmPackage.Literals.TRACKING;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.TRACKING__MODULE,
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
					GroupeidmPackage.TRACKING__MODULE, oldModule, newModule);
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
				msgs = ((InternalEObject) module).eInverseRemove(this, GroupeidmPackage.MODULE__TRACKING, module.class,
						msgs);
			if (newModule != null)
				msgs = ((InternalEObject) newModule).eInverseAdd(this, GroupeidmPackage.MODULE__TRACKING, module.class,
						msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.TRACKING__MODULE, newModule,
					newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public chapitre getChapitre() {
		if (chapitre != null && chapitre.eIsProxy()) {
			InternalEObject oldChapitre = (InternalEObject) chapitre;
			chapitre = (chapitre) eResolveProxy(oldChapitre);
			if (chapitre != oldChapitre) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.TRACKING__CHAPITRE,
							oldChapitre, chapitre));
			}
		}
		return chapitre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public chapitre basicGetChapitre() {
		return chapitre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChapitre(chapitre newChapitre, NotificationChain msgs) {
		chapitre oldChapitre = chapitre;
		chapitre = newChapitre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.TRACKING__CHAPITRE, oldChapitre, newChapitre);
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
	public void setChapitre(chapitre newChapitre) {
		if (newChapitre != chapitre) {
			NotificationChain msgs = null;
			if (chapitre != null)
				msgs = ((InternalEObject) chapitre).eInverseRemove(this, GroupeidmPackage.CHAPITRE__TRACKING,
						chapitre.class, msgs);
			if (newChapitre != null)
				msgs = ((InternalEObject) newChapitre).eInverseAdd(this, GroupeidmPackage.CHAPITRE__TRACKING,
						chapitre.class, msgs);
			msgs = basicSetChapitre(newChapitre, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.TRACKING__CHAPITRE, newChapitre,
					newChapitre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public connecte getConnecte() {
		if (connecte != null && connecte.eIsProxy()) {
			InternalEObject oldConnecte = (InternalEObject) connecte;
			connecte = (connecte) eResolveProxy(oldConnecte);
			if (connecte != oldConnecte) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.TRACKING__CONNECTE,
							oldConnecte, connecte));
			}
		}
		return connecte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public connecte basicGetConnecte() {
		return connecte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnecte(connecte newConnecte, NotificationChain msgs) {
		connecte oldConnecte = connecte;
		connecte = newConnecte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.TRACKING__CONNECTE, oldConnecte, newConnecte);
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
	public void setConnecte(connecte newConnecte) {
		if (newConnecte != connecte) {
			NotificationChain msgs = null;
			if (connecte != null)
				msgs = ((InternalEObject) connecte).eInverseRemove(this, GroupeidmPackage.CONNECTE__TRACKING,
						connecte.class, msgs);
			if (newConnecte != null)
				msgs = ((InternalEObject) newConnecte).eInverseAdd(this, GroupeidmPackage.CONNECTE__TRACKING,
						connecte.class, msgs);
			msgs = basicSetConnecte(newConnecte, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.TRACKING__CONNECTE, newConnecte,
					newConnecte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tuteur getTuteur() {
		if (tuteur != null && tuteur.eIsProxy()) {
			InternalEObject oldTuteur = (InternalEObject) tuteur;
			tuteur = (tuteur) eResolveProxy(oldTuteur);
			if (tuteur != oldTuteur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.TRACKING__TUTEUR,
							oldTuteur, tuteur));
			}
		}
		return tuteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tuteur basicGetTuteur() {
		return tuteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTuteur(tuteur newTuteur, NotificationChain msgs) {
		tuteur oldTuteur = tuteur;
		tuteur = newTuteur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.TRACKING__TUTEUR, oldTuteur, newTuteur);
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
	public void setTuteur(tuteur newTuteur) {
		if (newTuteur != tuteur) {
			NotificationChain msgs = null;
			if (tuteur != null)
				msgs = ((InternalEObject) tuteur).eInverseRemove(this, GroupeidmPackage.TUTEUR__TRACKING, tuteur.class,
						msgs);
			if (newTuteur != null)
				msgs = ((InternalEObject) newTuteur).eInverseAdd(this, GroupeidmPackage.TUTEUR__TRACKING, tuteur.class,
						msgs);
			msgs = basicSetTuteur(newTuteur, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.TRACKING__TUTEUR, newTuteur,
					newTuteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GroupeidmPackage.TRACKING__MODULE:
			if (module != null)
				msgs = ((InternalEObject) module).eInverseRemove(this, GroupeidmPackage.MODULE__TRACKING, module.class,
						msgs);
			return basicSetModule((module) otherEnd, msgs);
		case GroupeidmPackage.TRACKING__CHAPITRE:
			if (chapitre != null)
				msgs = ((InternalEObject) chapitre).eInverseRemove(this, GroupeidmPackage.CHAPITRE__TRACKING,
						chapitre.class, msgs);
			return basicSetChapitre((chapitre) otherEnd, msgs);
		case GroupeidmPackage.TRACKING__CONNECTE:
			if (connecte != null)
				msgs = ((InternalEObject) connecte).eInverseRemove(this, GroupeidmPackage.CONNECTE__TRACKING,
						connecte.class, msgs);
			return basicSetConnecte((connecte) otherEnd, msgs);
		case GroupeidmPackage.TRACKING__TUTEUR:
			if (tuteur != null)
				msgs = ((InternalEObject) tuteur).eInverseRemove(this, GroupeidmPackage.TUTEUR__TRACKING, tuteur.class,
						msgs);
			return basicSetTuteur((tuteur) otherEnd, msgs);
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
		case GroupeidmPackage.TRACKING__MODULE:
			return basicSetModule(null, msgs);
		case GroupeidmPackage.TRACKING__CHAPITRE:
			return basicSetChapitre(null, msgs);
		case GroupeidmPackage.TRACKING__CONNECTE:
			return basicSetConnecte(null, msgs);
		case GroupeidmPackage.TRACKING__TUTEUR:
			return basicSetTuteur(null, msgs);
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
		case GroupeidmPackage.TRACKING__MODULE:
			if (resolve)
				return getModule();
			return basicGetModule();
		case GroupeidmPackage.TRACKING__CHAPITRE:
			if (resolve)
				return getChapitre();
			return basicGetChapitre();
		case GroupeidmPackage.TRACKING__CONNECTE:
			if (resolve)
				return getConnecte();
			return basicGetConnecte();
		case GroupeidmPackage.TRACKING__TUTEUR:
			if (resolve)
				return getTuteur();
			return basicGetTuteur();
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
		case GroupeidmPackage.TRACKING__MODULE:
			setModule((module) newValue);
			return;
		case GroupeidmPackage.TRACKING__CHAPITRE:
			setChapitre((chapitre) newValue);
			return;
		case GroupeidmPackage.TRACKING__CONNECTE:
			setConnecte((connecte) newValue);
			return;
		case GroupeidmPackage.TRACKING__TUTEUR:
			setTuteur((tuteur) newValue);
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
		case GroupeidmPackage.TRACKING__MODULE:
			setModule((module) null);
			return;
		case GroupeidmPackage.TRACKING__CHAPITRE:
			setChapitre((chapitre) null);
			return;
		case GroupeidmPackage.TRACKING__CONNECTE:
			setConnecte((connecte) null);
			return;
		case GroupeidmPackage.TRACKING__TUTEUR:
			setTuteur((tuteur) null);
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
		case GroupeidmPackage.TRACKING__MODULE:
			return module != null;
		case GroupeidmPackage.TRACKING__CHAPITRE:
			return chapitre != null;
		case GroupeidmPackage.TRACKING__CONNECTE:
			return connecte != null;
		case GroupeidmPackage.TRACKING__TUTEUR:
			return tuteur != null;
		}
		return super.eIsSet(featureID);
	}

} //trackingImpl
