/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupeidmFactoryImpl extends EFactoryImpl implements GroupeidmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GroupeidmFactory init() {
		try {
			GroupeidmFactory theGroupeidmFactory = (GroupeidmFactory) EPackage.Registry.INSTANCE
					.getEFactory(GroupeidmPackage.eNS_URI);
			if (theGroupeidmFactory != null) {
				return theGroupeidmFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GroupeidmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupeidmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GroupeidmPackage.GROUPE:
			return creategroupe();
		case GroupeidmPackage.ADMIN:
			return createadmin();
		case GroupeidmPackage.AUTEUR:
			return createauteur();
		case GroupeidmPackage.MEMBRE:
			return createmembre();
		case GroupeidmPackage.FORMATION:
			return createformation();
		case GroupeidmPackage.TUTEUR:
			return createtuteur();
		case GroupeidmPackage.FORUM:
			return createforum();
		case GroupeidmPackage.CHAT:
			return createchat();
		case GroupeidmPackage.MAIL:
			return createmail();
		case GroupeidmPackage.REPOSITORY:
			return createrepository();
		case GroupeidmPackage.CHAPITRE:
			return createchapitre();
		case GroupeidmPackage.MODULE:
			return createmodule();
		case GroupeidmPackage.PAGE:
			return createpage();
		case GroupeidmPackage.TRACKING:
			return createtracking();
		case GroupeidmPackage.ETUDIANT:
			return createetudiant();
		case GroupeidmPackage.CONNECTE:
			return createconnecte();
		case GroupeidmPackage.PROFIL:
			return createprofil();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public groupe creategroupe() {
		groupeImpl groupe = new groupeImpl();
		return groupe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public admin createadmin() {
		adminImpl admin = new adminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public auteur createauteur() {
		auteurImpl auteur = new auteurImpl();
		return auteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public membre createmembre() {
		membreImpl membre = new membreImpl();
		return membre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formation createformation() {
		formationImpl formation = new formationImpl();
		return formation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tuteur createtuteur() {
		tuteurImpl tuteur = new tuteurImpl();
		return tuteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public forum createforum() {
		forumImpl forum = new forumImpl();
		return forum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public chat createchat() {
		chatImpl chat = new chatImpl();
		return chat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mail createmail() {
		mailImpl mail = new mailImpl();
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public repository createrepository() {
		repositoryImpl repository = new repositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public chapitre createchapitre() {
		chapitreImpl chapitre = new chapitreImpl();
		return chapitre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public module createmodule() {
		moduleImpl module = new moduleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public page createpage() {
		pageImpl page = new pageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tracking createtracking() {
		trackingImpl tracking = new trackingImpl();
		return tracking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public etudiant createetudiant() {
		etudiantImpl etudiant = new etudiantImpl();
		return etudiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public connecte createconnecte() {
		connecteImpl connecte = new connecteImpl();
		return connecte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public profil createprofil() {
		profilImpl profil = new profilImpl();
		return profil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupeidmPackage getGroupeidmPackage() {
		return (GroupeidmPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GroupeidmPackage getPackage() {
		return GroupeidmPackage.eINSTANCE;
	}

} //GroupeidmFactoryImpl
