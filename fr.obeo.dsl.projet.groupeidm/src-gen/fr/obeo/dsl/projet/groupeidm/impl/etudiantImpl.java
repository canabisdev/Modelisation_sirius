/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.chat;
import fr.obeo.dsl.projet.groupeidm.etudiant;
import fr.obeo.dsl.projet.groupeidm.forum;
import fr.obeo.dsl.projet.groupeidm.groupe;
import fr.obeo.dsl.projet.groupeidm.mail;
import fr.obeo.dsl.projet.groupeidm.profil;
import fr.obeo.dsl.projet.groupeidm.repository;

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
 * An implementation of the model object '<em><b>etudiant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl#getProfil <em>Profil</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl#getForum <em>Forum</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl#getChat <em>Chat</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl#getGroupe <em>Groupe</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl#getFirstNameEt <em>First Name Et</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl#getLastNameEt <em>Last Name Et</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl#getNumEt <em>Num Et</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl#getClasse <em>Classe</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class etudiantImpl extends MinimalEObjectImpl.Container implements etudiant {
	/**
	 * The cached value of the '{@link #getProfil() <em>Profil</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfil()
	 * @generated
	 * @ordered
	 */
	protected EList<profil> profil;

	/**
	 * The cached value of the '{@link #getForum() <em>Forum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForum()
	 * @generated
	 * @ordered
	 */
	protected forum forum;

	/**
	 * The cached value of the '{@link #getChat() <em>Chat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChat()
	 * @generated
	 * @ordered
	 */
	protected chat chat;

	/**
	 * The cached value of the '{@link #getMail() <em>Mail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected mail mail;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected repository repository;

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
	 * The default value of the '{@link #getFirstNameEt() <em>First Name Et</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstNameEt()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_ET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstNameEt() <em>First Name Et</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstNameEt()
	 * @generated
	 * @ordered
	 */
	protected String firstNameEt = FIRST_NAME_ET_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastNameEt() <em>Last Name Et</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastNameEt()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_ET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastNameEt() <em>Last Name Et</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastNameEt()
	 * @generated
	 * @ordered
	 */
	protected String lastNameEt = LAST_NAME_ET_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumEt() <em>Num Et</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumEt()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_ET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumEt() <em>Num Et</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumEt()
	 * @generated
	 * @ordered
	 */
	protected int numEt = NUM_ET_EDEFAULT;

	/**
	 * The default value of the '{@link #getClasse() <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasse()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClasse() <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasse()
	 * @generated
	 * @ordered
	 */
	protected String classe = CLASSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final double NOTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected double note = NOTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected etudiantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupeidmPackage.Literals.ETUDIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<profil> getProfil() {
		if (profil == null) {
			profil = new EObjectContainmentEList<profil>(profil.class, this, GroupeidmPackage.ETUDIANT__PROFIL);
		}
		return profil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public forum getForum() {
		if (forum != null && forum.eIsProxy()) {
			InternalEObject oldForum = (InternalEObject) forum;
			forum = (forum) eResolveProxy(oldForum);
			if (forum != oldForum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.ETUDIANT__FORUM,
							oldForum, forum));
			}
		}
		return forum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public forum basicGetForum() {
		return forum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForum(forum newForum, NotificationChain msgs) {
		forum oldForum = forum;
		forum = newForum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.ETUDIANT__FORUM, oldForum, newForum);
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
	public void setForum(forum newForum) {
		if (newForum != forum) {
			NotificationChain msgs = null;
			if (forum != null)
				msgs = ((InternalEObject) forum).eInverseRemove(this, GroupeidmPackage.FORUM__ETUDIANT, forum.class,
						msgs);
			if (newForum != null)
				msgs = ((InternalEObject) newForum).eInverseAdd(this, GroupeidmPackage.FORUM__ETUDIANT, forum.class,
						msgs);
			msgs = basicSetForum(newForum, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ETUDIANT__FORUM, newForum,
					newForum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public chat getChat() {
		if (chat != null && chat.eIsProxy()) {
			InternalEObject oldChat = (InternalEObject) chat;
			chat = (chat) eResolveProxy(oldChat);
			if (chat != oldChat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.ETUDIANT__CHAT, oldChat,
							chat));
			}
		}
		return chat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public chat basicGetChat() {
		return chat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChat(chat newChat, NotificationChain msgs) {
		chat oldChat = chat;
		chat = newChat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.ETUDIANT__CHAT, oldChat, newChat);
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
	public void setChat(chat newChat) {
		if (newChat != chat) {
			NotificationChain msgs = null;
			if (chat != null)
				msgs = ((InternalEObject) chat).eInverseRemove(this, GroupeidmPackage.CHAT__ETUDIANT, chat.class, msgs);
			if (newChat != null)
				msgs = ((InternalEObject) newChat).eInverseAdd(this, GroupeidmPackage.CHAT__ETUDIANT, chat.class, msgs);
			msgs = basicSetChat(newChat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ETUDIANT__CHAT, newChat, newChat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mail getMail() {
		if (mail != null && mail.eIsProxy()) {
			InternalEObject oldMail = (InternalEObject) mail;
			mail = (mail) eResolveProxy(oldMail);
			if (mail != oldMail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.ETUDIANT__MAIL, oldMail,
							mail));
			}
		}
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mail basicGetMail() {
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMail(mail newMail, NotificationChain msgs) {
		mail oldMail = mail;
		mail = newMail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.ETUDIANT__MAIL, oldMail, newMail);
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
	public void setMail(mail newMail) {
		if (newMail != mail) {
			NotificationChain msgs = null;
			if (mail != null)
				msgs = ((InternalEObject) mail).eInverseRemove(this, GroupeidmPackage.MAIL__ETUDIANT, mail.class, msgs);
			if (newMail != null)
				msgs = ((InternalEObject) newMail).eInverseAdd(this, GroupeidmPackage.MAIL__ETUDIANT, mail.class, msgs);
			msgs = basicSetMail(newMail, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ETUDIANT__MAIL, newMail, newMail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public repository getRepository() {
		if (repository != null && repository.eIsProxy()) {
			InternalEObject oldRepository = (InternalEObject) repository;
			repository = (repository) eResolveProxy(oldRepository);
			if (repository != oldRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.ETUDIANT__REPOSITORY,
							oldRepository, repository));
			}
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public repository basicGetRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(repository newRepository, NotificationChain msgs) {
		repository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GroupeidmPackage.ETUDIANT__REPOSITORY, oldRepository, newRepository);
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
	public void setRepository(repository newRepository) {
		if (newRepository != repository) {
			NotificationChain msgs = null;
			if (repository != null)
				msgs = ((InternalEObject) repository).eInverseRemove(this, GroupeidmPackage.REPOSITORY__ETUDIANT,
						repository.class, msgs);
			if (newRepository != null)
				msgs = ((InternalEObject) newRepository).eInverseAdd(this, GroupeidmPackage.REPOSITORY__ETUDIANT,
						repository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ETUDIANT__REPOSITORY, newRepository,
					newRepository));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupeidmPackage.ETUDIANT__GROUPE,
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
					GroupeidmPackage.ETUDIANT__GROUPE, oldGroupe, newGroupe);
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
				msgs = ((InternalEObject) groupe).eInverseRemove(this, GroupeidmPackage.GROUPE__ETUDIANT, groupe.class,
						msgs);
			if (newGroupe != null)
				msgs = ((InternalEObject) newGroupe).eInverseAdd(this, GroupeidmPackage.GROUPE__ETUDIANT, groupe.class,
						msgs);
			msgs = basicSetGroupe(newGroupe, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ETUDIANT__GROUPE, newGroupe,
					newGroupe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstNameEt() {
		return firstNameEt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstNameEt(String newFirstNameEt) {
		String oldFirstNameEt = firstNameEt;
		firstNameEt = newFirstNameEt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ETUDIANT__FIRST_NAME_ET,
					oldFirstNameEt, firstNameEt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastNameEt() {
		return lastNameEt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastNameEt(String newLastNameEt) {
		String oldLastNameEt = lastNameEt;
		lastNameEt = newLastNameEt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ETUDIANT__LAST_NAME_ET,
					oldLastNameEt, lastNameEt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumEt() {
		return numEt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumEt(int newNumEt) {
		int oldNumEt = numEt;
		numEt = newNumEt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ETUDIANT__NUM_ET, oldNumEt, numEt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClasse() {
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasse(String newClasse) {
		String oldClasse = classe;
		classe = newClasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ETUDIANT__CLASSE, oldClasse,
					classe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ETUDIANT__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(double newNote) {
		double oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupeidmPackage.ETUDIANT__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GroupeidmPackage.ETUDIANT__FORUM:
			if (forum != null)
				msgs = ((InternalEObject) forum).eInverseRemove(this, GroupeidmPackage.FORUM__ETUDIANT, forum.class,
						msgs);
			return basicSetForum((forum) otherEnd, msgs);
		case GroupeidmPackage.ETUDIANT__CHAT:
			if (chat != null)
				msgs = ((InternalEObject) chat).eInverseRemove(this, GroupeidmPackage.CHAT__ETUDIANT, chat.class, msgs);
			return basicSetChat((chat) otherEnd, msgs);
		case GroupeidmPackage.ETUDIANT__MAIL:
			if (mail != null)
				msgs = ((InternalEObject) mail).eInverseRemove(this, GroupeidmPackage.MAIL__ETUDIANT, mail.class, msgs);
			return basicSetMail((mail) otherEnd, msgs);
		case GroupeidmPackage.ETUDIANT__REPOSITORY:
			if (repository != null)
				msgs = ((InternalEObject) repository).eInverseRemove(this, GroupeidmPackage.REPOSITORY__ETUDIANT,
						repository.class, msgs);
			return basicSetRepository((repository) otherEnd, msgs);
		case GroupeidmPackage.ETUDIANT__GROUPE:
			if (groupe != null)
				msgs = ((InternalEObject) groupe).eInverseRemove(this, GroupeidmPackage.GROUPE__ETUDIANT, groupe.class,
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
		case GroupeidmPackage.ETUDIANT__PROFIL:
			return ((InternalEList<?>) getProfil()).basicRemove(otherEnd, msgs);
		case GroupeidmPackage.ETUDIANT__FORUM:
			return basicSetForum(null, msgs);
		case GroupeidmPackage.ETUDIANT__CHAT:
			return basicSetChat(null, msgs);
		case GroupeidmPackage.ETUDIANT__MAIL:
			return basicSetMail(null, msgs);
		case GroupeidmPackage.ETUDIANT__REPOSITORY:
			return basicSetRepository(null, msgs);
		case GroupeidmPackage.ETUDIANT__GROUPE:
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
		case GroupeidmPackage.ETUDIANT__PROFIL:
			return getProfil();
		case GroupeidmPackage.ETUDIANT__FORUM:
			if (resolve)
				return getForum();
			return basicGetForum();
		case GroupeidmPackage.ETUDIANT__CHAT:
			if (resolve)
				return getChat();
			return basicGetChat();
		case GroupeidmPackage.ETUDIANT__MAIL:
			if (resolve)
				return getMail();
			return basicGetMail();
		case GroupeidmPackage.ETUDIANT__REPOSITORY:
			if (resolve)
				return getRepository();
			return basicGetRepository();
		case GroupeidmPackage.ETUDIANT__GROUPE:
			if (resolve)
				return getGroupe();
			return basicGetGroupe();
		case GroupeidmPackage.ETUDIANT__FIRST_NAME_ET:
			return getFirstNameEt();
		case GroupeidmPackage.ETUDIANT__LAST_NAME_ET:
			return getLastNameEt();
		case GroupeidmPackage.ETUDIANT__NUM_ET:
			return getNumEt();
		case GroupeidmPackage.ETUDIANT__CLASSE:
			return getClasse();
		case GroupeidmPackage.ETUDIANT__LEVEL:
			return getLevel();
		case GroupeidmPackage.ETUDIANT__NOTE:
			return getNote();
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
		case GroupeidmPackage.ETUDIANT__PROFIL:
			getProfil().clear();
			getProfil().addAll((Collection<? extends profil>) newValue);
			return;
		case GroupeidmPackage.ETUDIANT__FORUM:
			setForum((forum) newValue);
			return;
		case GroupeidmPackage.ETUDIANT__CHAT:
			setChat((chat) newValue);
			return;
		case GroupeidmPackage.ETUDIANT__MAIL:
			setMail((mail) newValue);
			return;
		case GroupeidmPackage.ETUDIANT__REPOSITORY:
			setRepository((repository) newValue);
			return;
		case GroupeidmPackage.ETUDIANT__GROUPE:
			setGroupe((groupe) newValue);
			return;
		case GroupeidmPackage.ETUDIANT__FIRST_NAME_ET:
			setFirstNameEt((String) newValue);
			return;
		case GroupeidmPackage.ETUDIANT__LAST_NAME_ET:
			setLastNameEt((String) newValue);
			return;
		case GroupeidmPackage.ETUDIANT__NUM_ET:
			setNumEt((Integer) newValue);
			return;
		case GroupeidmPackage.ETUDIANT__CLASSE:
			setClasse((String) newValue);
			return;
		case GroupeidmPackage.ETUDIANT__LEVEL:
			setLevel((Integer) newValue);
			return;
		case GroupeidmPackage.ETUDIANT__NOTE:
			setNote((Double) newValue);
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
		case GroupeidmPackage.ETUDIANT__PROFIL:
			getProfil().clear();
			return;
		case GroupeidmPackage.ETUDIANT__FORUM:
			setForum((forum) null);
			return;
		case GroupeidmPackage.ETUDIANT__CHAT:
			setChat((chat) null);
			return;
		case GroupeidmPackage.ETUDIANT__MAIL:
			setMail((mail) null);
			return;
		case GroupeidmPackage.ETUDIANT__REPOSITORY:
			setRepository((repository) null);
			return;
		case GroupeidmPackage.ETUDIANT__GROUPE:
			setGroupe((groupe) null);
			return;
		case GroupeidmPackage.ETUDIANT__FIRST_NAME_ET:
			setFirstNameEt(FIRST_NAME_ET_EDEFAULT);
			return;
		case GroupeidmPackage.ETUDIANT__LAST_NAME_ET:
			setLastNameEt(LAST_NAME_ET_EDEFAULT);
			return;
		case GroupeidmPackage.ETUDIANT__NUM_ET:
			setNumEt(NUM_ET_EDEFAULT);
			return;
		case GroupeidmPackage.ETUDIANT__CLASSE:
			setClasse(CLASSE_EDEFAULT);
			return;
		case GroupeidmPackage.ETUDIANT__LEVEL:
			setLevel(LEVEL_EDEFAULT);
			return;
		case GroupeidmPackage.ETUDIANT__NOTE:
			setNote(NOTE_EDEFAULT);
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
		case GroupeidmPackage.ETUDIANT__PROFIL:
			return profil != null && !profil.isEmpty();
		case GroupeidmPackage.ETUDIANT__FORUM:
			return forum != null;
		case GroupeidmPackage.ETUDIANT__CHAT:
			return chat != null;
		case GroupeidmPackage.ETUDIANT__MAIL:
			return mail != null;
		case GroupeidmPackage.ETUDIANT__REPOSITORY:
			return repository != null;
		case GroupeidmPackage.ETUDIANT__GROUPE:
			return groupe != null;
		case GroupeidmPackage.ETUDIANT__FIRST_NAME_ET:
			return FIRST_NAME_ET_EDEFAULT == null ? firstNameEt != null : !FIRST_NAME_ET_EDEFAULT.equals(firstNameEt);
		case GroupeidmPackage.ETUDIANT__LAST_NAME_ET:
			return LAST_NAME_ET_EDEFAULT == null ? lastNameEt != null : !LAST_NAME_ET_EDEFAULT.equals(lastNameEt);
		case GroupeidmPackage.ETUDIANT__NUM_ET:
			return numEt != NUM_ET_EDEFAULT;
		case GroupeidmPackage.ETUDIANT__CLASSE:
			return CLASSE_EDEFAULT == null ? classe != null : !CLASSE_EDEFAULT.equals(classe);
		case GroupeidmPackage.ETUDIANT__LEVEL:
			return level != LEVEL_EDEFAULT;
		case GroupeidmPackage.ETUDIANT__NOTE:
			return note != NOTE_EDEFAULT;
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
		result.append(" (firstNameEt: ");
		result.append(firstNameEt);
		result.append(", lastNameEt: ");
		result.append(lastNameEt);
		result.append(", numEt: ");
		result.append(numEt);
		result.append(", classe: ");
		result.append(classe);
		result.append(", level: ");
		result.append(level);
		result.append(", Note: ");
		result.append(note);
		result.append(')');
		return result.toString();
	}

} //etudiantImpl
