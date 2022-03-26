/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.admin;
import fr.obeo.dsl.projet.groupeidm.chat;
import fr.obeo.dsl.projet.groupeidm.etudiant;
import fr.obeo.dsl.projet.groupeidm.forum;
import fr.obeo.dsl.projet.groupeidm.groupe;
import fr.obeo.dsl.projet.groupeidm.mail;
import fr.obeo.dsl.projet.groupeidm.repository;
import fr.obeo.dsl.projet.groupeidm.tuteur;

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
 * An implementation of the model object '<em><b>groupe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.groupeImpl#getAdmin <em>Admin</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.groupeImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.groupeImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.groupeImpl#getChat <em>Chat</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.groupeImpl#getForum <em>Forum</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.groupeImpl#getTuteur <em>Tuteur</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.groupeImpl#getEtudiant <em>Etudiant</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class groupeImpl extends MinimalEObjectImpl.Container implements groupe {
	/**
	 * The cached value of the '{@link #getAdmin() <em>Admin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmin()
	 * @generated
	 * @ordered
	 */
	protected admin admin;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected EList<repository> repository;

	/**
	 * The cached value of the '{@link #getMail() <em>Mail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected EList<mail> mail;

	/**
	 * The cached value of the '{@link #getChat() <em>Chat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChat()
	 * @generated
	 * @ordered
	 */
	protected EList<chat> chat;

	/**
	 * The cached value of the '{@link #getForum() <em>Forum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForum()
	 * @generated
	 * @ordered
	 */
	protected EList<forum> forum;

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
	 * The cached value of the '{@link #getEtudiant() <em>Etudiant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtudiant()
	 * @generated
	 * @ordered
	 */
	protected etudiant etudiant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected groupeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupeidmPackage.Literals.GROUPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public admin getAdmin() {
		if (admin != null && admin.eIsProxy()) {
			InternalEObject oldAdmin = (InternalEObject) admin;
			admin = (admin) eResolveProxy(oldAdmin);
			if (admin != oldAdmin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.GROUPE__ADMIN, oldAdmin,
							admin));
			}
		}
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public admin basicGetAdmin() {
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmin(admin newAdmin, NotificationChain msgs) {
		admin oldAdmin = admin;
		admin = newAdmin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.GROUPE__ADMIN, oldAdmin, newAdmin);
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
	public void setAdmin(admin newAdmin) {
		if (newAdmin != admin) {
			NotificationChain msgs = null;
			if (admin != null)
				msgs = ((InternalEObject) admin).eInverseRemove(this, GroupeidmPackage.ADMIN__GROUPE, admin.class,
						msgs);
			if (newAdmin != null)
				msgs = ((InternalEObject) newAdmin).eInverseAdd(this, GroupeidmPackage.ADMIN__GROUPE, admin.class,
						msgs);
			msgs = basicSetAdmin(newAdmin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.GROUPE__ADMIN, newAdmin, newAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<repository> getRepository() {
		if (repository == null) {
			repository = new EObjectContainmentEList<repository>(repository.class, this,
					GroupeidmPackage.GROUPE__REPOSITORY);
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<mail> getMail() {
		if (mail == null) {
			mail = new EObjectContainmentEList<mail>(mail.class, this, GroupeidmPackage.GROUPE__MAIL);
		}
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<chat> getChat() {
		if (chat == null) {
			chat = new EObjectContainmentEList<chat>(chat.class, this, GroupeidmPackage.GROUPE__CHAT);
		}
		return chat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<forum> getForum() {
		if (forum == null) {
			forum = new EObjectContainmentEList<forum>(forum.class, this, GroupeidmPackage.GROUPE__FORUM);
		}
		return forum;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.GROUPE__TUTEUR,
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
					GroupeidmPackage.GROUPE__TUTEUR, oldTuteur, newTuteur);
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
				msgs = ((InternalEObject) tuteur).eInverseRemove(this, GroupeidmPackage.TUTEUR__GROUPE, tuteur.class,
						msgs);
			if (newTuteur != null)
				msgs = ((InternalEObject) newTuteur).eInverseAdd(this, GroupeidmPackage.TUTEUR__GROUPE, tuteur.class,
						msgs);
			msgs = basicSetTuteur(newTuteur, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.GROUPE__TUTEUR, newTuteur,
					newTuteur));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.GROUPE__ETUDIANT,
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
					GroupeidmPackage.GROUPE__ETUDIANT, oldEtudiant, newEtudiant);
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
				msgs = ((InternalEObject) etudiant).eInverseRemove(this, GroupeidmPackage.ETUDIANT__GROUPE,
						etudiant.class, msgs);
			if (newEtudiant != null)
				msgs = ((InternalEObject) newEtudiant).eInverseAdd(this, GroupeidmPackage.ETUDIANT__GROUPE,
						etudiant.class, msgs);
			msgs = basicSetEtudiant(newEtudiant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.GROUPE__ETUDIANT, newEtudiant,
					newEtudiant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GroupeidmPackage.GROUPE__ADMIN:
			if (admin != null)
				msgs = ((InternalEObject) admin).eInverseRemove(this, GroupeidmPackage.ADMIN__GROUPE, admin.class,
						msgs);
			return basicSetAdmin((admin) otherEnd, msgs);
		case GroupeidmPackage.GROUPE__TUTEUR:
			if (tuteur != null)
				msgs = ((InternalEObject) tuteur).eInverseRemove(this, GroupeidmPackage.TUTEUR__GROUPE, tuteur.class,
						msgs);
			return basicSetTuteur((tuteur) otherEnd, msgs);
		case GroupeidmPackage.GROUPE__ETUDIANT:
			if (etudiant != null)
				msgs = ((InternalEObject) etudiant).eInverseRemove(this, GroupeidmPackage.ETUDIANT__GROUPE,
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
		case GroupeidmPackage.GROUPE__ADMIN:
			return basicSetAdmin(null, msgs);
		case GroupeidmPackage.GROUPE__REPOSITORY:
			return ((InternalEList<?>) getRepository()).basicRemove(otherEnd, msgs);
		case GroupeidmPackage.GROUPE__MAIL:
			return ((InternalEList<?>) getMail()).basicRemove(otherEnd, msgs);
		case GroupeidmPackage.GROUPE__CHAT:
			return ((InternalEList<?>) getChat()).basicRemove(otherEnd, msgs);
		case GroupeidmPackage.GROUPE__FORUM:
			return ((InternalEList<?>) getForum()).basicRemove(otherEnd, msgs);
		case GroupeidmPackage.GROUPE__TUTEUR:
			return basicSetTuteur(null, msgs);
		case GroupeidmPackage.GROUPE__ETUDIANT:
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
		case GroupeidmPackage.GROUPE__ADMIN:
			if (resolve)
				return getAdmin();
			return basicGetAdmin();
		case GroupeidmPackage.GROUPE__REPOSITORY:
			return getRepository();
		case GroupeidmPackage.GROUPE__MAIL:
			return getMail();
		case GroupeidmPackage.GROUPE__CHAT:
			return getChat();
		case GroupeidmPackage.GROUPE__FORUM:
			return getForum();
		case GroupeidmPackage.GROUPE__TUTEUR:
			if (resolve)
				return getTuteur();
			return basicGetTuteur();
		case GroupeidmPackage.GROUPE__ETUDIANT:
			if (resolve)
				return getEtudiant();
			return basicGetEtudiant();
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
		case GroupeidmPackage.GROUPE__ADMIN:
			setAdmin((admin) newValue);
			return;
		case GroupeidmPackage.GROUPE__REPOSITORY:
			getRepository().clear();
			getRepository().addAll((Collection<? extends repository>) newValue);
			return;
		case GroupeidmPackage.GROUPE__MAIL:
			getMail().clear();
			getMail().addAll((Collection<? extends mail>) newValue);
			return;
		case GroupeidmPackage.GROUPE__CHAT:
			getChat().clear();
			getChat().addAll((Collection<? extends chat>) newValue);
			return;
		case GroupeidmPackage.GROUPE__FORUM:
			getForum().clear();
			getForum().addAll((Collection<? extends forum>) newValue);
			return;
		case GroupeidmPackage.GROUPE__TUTEUR:
			setTuteur((tuteur) newValue);
			return;
		case GroupeidmPackage.GROUPE__ETUDIANT:
			setEtudiant((etudiant) newValue);
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
		case GroupeidmPackage.GROUPE__ADMIN:
			setAdmin((admin) null);
			return;
		case GroupeidmPackage.GROUPE__REPOSITORY:
			getRepository().clear();
			return;
		case GroupeidmPackage.GROUPE__MAIL:
			getMail().clear();
			return;
		case GroupeidmPackage.GROUPE__CHAT:
			getChat().clear();
			return;
		case GroupeidmPackage.GROUPE__FORUM:
			getForum().clear();
			return;
		case GroupeidmPackage.GROUPE__TUTEUR:
			setTuteur((tuteur) null);
			return;
		case GroupeidmPackage.GROUPE__ETUDIANT:
			setEtudiant((etudiant) null);
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
		case GroupeidmPackage.GROUPE__ADMIN:
			return admin != null;
		case GroupeidmPackage.GROUPE__REPOSITORY:
			return repository != null && !repository.isEmpty();
		case GroupeidmPackage.GROUPE__MAIL:
			return mail != null && !mail.isEmpty();
		case GroupeidmPackage.GROUPE__CHAT:
			return chat != null && !chat.isEmpty();
		case GroupeidmPackage.GROUPE__FORUM:
			return forum != null && !forum.isEmpty();
		case GroupeidmPackage.GROUPE__TUTEUR:
			return tuteur != null;
		case GroupeidmPackage.GROUPE__ETUDIANT:
			return etudiant != null;
		}
		return super.eIsSet(featureID);
	}

} //groupeImpl
