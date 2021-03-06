/**
 */
package fr.obeo.dsl.projet.groupeidm.impl;

import fr.obeo.dsl.projet.groupeidm.GroupeidmFactory;
import fr.obeo.dsl.projet.groupeidm.GroupeidmPackage;
import fr.obeo.dsl.projet.groupeidm.admin;
import fr.obeo.dsl.projet.groupeidm.auteur;
import fr.obeo.dsl.projet.groupeidm.chapitre;
import fr.obeo.dsl.projet.groupeidm.chat;
import fr.obeo.dsl.projet.groupeidm.connecte;
import fr.obeo.dsl.projet.groupeidm.etudiant;
import fr.obeo.dsl.projet.groupeidm.formation;
import fr.obeo.dsl.projet.groupeidm.forum;
import fr.obeo.dsl.projet.groupeidm.groupe;
import fr.obeo.dsl.projet.groupeidm.mail;
import fr.obeo.dsl.projet.groupeidm.membre;
import fr.obeo.dsl.projet.groupeidm.module;
import fr.obeo.dsl.projet.groupeidm.page;
import fr.obeo.dsl.projet.groupeidm.profil;
import fr.obeo.dsl.projet.groupeidm.repository;
import fr.obeo.dsl.projet.groupeidm.tracking;
import fr.obeo.dsl.projet.groupeidm.tuteur;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupeidmPackageImpl extends EPackageImpl implements GroupeidmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auteurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass membreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuteurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chapitreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trackingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etudiantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connecteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profilEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GroupeidmPackageImpl() {
		super(eNS_URI, GroupeidmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GroupeidmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GroupeidmPackage init() {
		if (isInited)
			return (GroupeidmPackage) EPackage.Registry.INSTANCE.getEPackage(GroupeidmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGroupeidmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GroupeidmPackageImpl theGroupeidmPackage = registeredGroupeidmPackage instanceof GroupeidmPackageImpl
				? (GroupeidmPackageImpl) registeredGroupeidmPackage
				: new GroupeidmPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGroupeidmPackage.createPackageContents();

		// Initialize created meta-data
		theGroupeidmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGroupeidmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GroupeidmPackage.eNS_URI, theGroupeidmPackage);
		return theGroupeidmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getgroupe() {
		return groupeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgroupe_Admin() {
		return (EReference) groupeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgroupe_Repository() {
		return (EReference) groupeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgroupe_Mail() {
		return (EReference) groupeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgroupe_Chat() {
		return (EReference) groupeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgroupe_Forum() {
		return (EReference) groupeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgroupe_Tuteur() {
		return (EReference) groupeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgroupe_Etudiant() {
		return (EReference) groupeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getgroupe_NameGp() {
		return (EAttribute) groupeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getadmin() {
		return adminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getadmin_Groupe() {
		return (EReference) adminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getadmin_Formation() {
		return (EReference) adminEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getadmin_NameAdm() {
		return (EAttribute) adminEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getadmin_PasswordAdm() {
		return (EAttribute) adminEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getauteur() {
		return auteurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getauteur_Module() {
		return (EReference) auteurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getauteur_NameAtr() {
		return (EAttribute) auteurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmembre() {
		return membreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmembre_Counts() {
		return (EAttribute) membreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getformation() {
		return formationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getformation_Admin() {
		return (EReference) formationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getformation_Module() {
		return (EReference) formationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getformation_NameFrm() {
		return (EAttribute) formationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getformation_Type() {
		return (EAttribute) formationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getformation_Duration() {
		return (EAttribute) formationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettuteur() {
		return tuteurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettuteur_Tracking() {
		return (EReference) tuteurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettuteur_Groupe() {
		return (EReference) tuteurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettuteur_FirstNameTr() {
		return (EAttribute) tuteurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettuteur_LastNameTr() {
		return (EAttribute) tuteurEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettuteur_NumTr() {
		return (EAttribute) tuteurEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettuteur_Matiere() {
		return (EAttribute) tuteurEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getforum() {
		return forumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getforum_Etudiant() {
		return (EReference) forumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getforum_NameFrm() {
		return (EAttribute) forumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getforum_ContenuFrm() {
		return (EAttribute) forumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getchat() {
		return chatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getchat_Etudiant() {
		return (EReference) chatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getchat_PseudoChat() {
		return (EAttribute) chatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getchat_Status() {
		return (EAttribute) chatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmail() {
		return mailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmail_Etudiant() {
		return (EReference) mailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmail_AdresseMail() {
		return (EAttribute) mailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmail_Password() {
		return (EAttribute) mailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getrepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getrepository_Etudiant() {
		return (EReference) repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getrepository_NameRp() {
		return (EAttribute) repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getchapitre() {
		return chapitreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getchapitre_Page() {
		return (EReference) chapitreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getchapitre_Tracking() {
		return (EReference) chapitreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getchapitre_NameChp() {
		return (EAttribute) chapitreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmodule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmodule_Fromation() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmodule_Auteur() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmodule_Chapitre() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmodule_Tracking() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmodule_Coeff() {
		return (EAttribute) moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmodule_Level() {
		return (EAttribute) moduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpage_NumberPg() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettracking() {
		return trackingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettracking_Module() {
		return (EReference) trackingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettracking_Chapitre() {
		return (EReference) trackingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettracking_Connecte() {
		return (EReference) trackingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettracking_Tuteur() {
		return (EReference) trackingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getetudiant() {
		return etudiantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getetudiant_Profil() {
		return (EReference) etudiantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getetudiant_Forum() {
		return (EReference) etudiantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getetudiant_Chat() {
		return (EReference) etudiantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getetudiant_Mail() {
		return (EReference) etudiantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getetudiant_Repository() {
		return (EReference) etudiantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getetudiant_Groupe() {
		return (EReference) etudiantEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getetudiant_FirstNameEt() {
		return (EAttribute) etudiantEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getetudiant_LastNameEt() {
		return (EAttribute) etudiantEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getetudiant_NumEt() {
		return (EAttribute) etudiantEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getetudiant_Classe() {
		return (EAttribute) etudiantEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getetudiant_Level() {
		return (EAttribute) etudiantEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getetudiant_Note() {
		return (EAttribute) etudiantEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getconnecte() {
		return connecteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getconnecte_Tracking() {
		return (EReference) connecteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getconnecte_IsConnect() {
		return (EAttribute) connecteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getprofil() {
		return profilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprofil_Avatar() {
		return (EAttribute) profilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprofil_City() {
		return (EAttribute) profilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprofil_Tel() {
		return (EAttribute) profilEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupeidmFactory getGroupeidmFactory() {
		return (GroupeidmFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		groupeEClass = createEClass(GROUPE);
		createEReference(groupeEClass, GROUPE__ADMIN);
		createEReference(groupeEClass, GROUPE__REPOSITORY);
		createEReference(groupeEClass, GROUPE__MAIL);
		createEReference(groupeEClass, GROUPE__CHAT);
		createEReference(groupeEClass, GROUPE__FORUM);
		createEReference(groupeEClass, GROUPE__TUTEUR);
		createEReference(groupeEClass, GROUPE__ETUDIANT);
		createEAttribute(groupeEClass, GROUPE__NAME_GP);

		adminEClass = createEClass(ADMIN);
		createEReference(adminEClass, ADMIN__GROUPE);
		createEReference(adminEClass, ADMIN__FORMATION);
		createEAttribute(adminEClass, ADMIN__NAME_ADM);
		createEAttribute(adminEClass, ADMIN__PASSWORD_ADM);

		auteurEClass = createEClass(AUTEUR);
		createEReference(auteurEClass, AUTEUR__MODULE);
		createEAttribute(auteurEClass, AUTEUR__NAME_ATR);

		membreEClass = createEClass(MEMBRE);
		createEAttribute(membreEClass, MEMBRE__COUNTS);

		formationEClass = createEClass(FORMATION);
		createEReference(formationEClass, FORMATION__ADMIN);
		createEReference(formationEClass, FORMATION__MODULE);
		createEAttribute(formationEClass, FORMATION__NAME_FRM);
		createEAttribute(formationEClass, FORMATION__TYPE);
		createEAttribute(formationEClass, FORMATION__DURATION);

		tuteurEClass = createEClass(TUTEUR);
		createEReference(tuteurEClass, TUTEUR__TRACKING);
		createEReference(tuteurEClass, TUTEUR__GROUPE);
		createEAttribute(tuteurEClass, TUTEUR__FIRST_NAME_TR);
		createEAttribute(tuteurEClass, TUTEUR__LAST_NAME_TR);
		createEAttribute(tuteurEClass, TUTEUR__NUM_TR);
		createEAttribute(tuteurEClass, TUTEUR__MATIERE);

		forumEClass = createEClass(FORUM);
		createEReference(forumEClass, FORUM__ETUDIANT);
		createEAttribute(forumEClass, FORUM__NAME_FRM);
		createEAttribute(forumEClass, FORUM__CONTENU_FRM);

		chatEClass = createEClass(CHAT);
		createEReference(chatEClass, CHAT__ETUDIANT);
		createEAttribute(chatEClass, CHAT__PSEUDO_CHAT);
		createEAttribute(chatEClass, CHAT__STATUS);

		mailEClass = createEClass(MAIL);
		createEReference(mailEClass, MAIL__ETUDIANT);
		createEAttribute(mailEClass, MAIL__ADRESSE_MAIL);
		createEAttribute(mailEClass, MAIL__PASSWORD);

		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__ETUDIANT);
		createEAttribute(repositoryEClass, REPOSITORY__NAME_RP);

		chapitreEClass = createEClass(CHAPITRE);
		createEReference(chapitreEClass, CHAPITRE__PAGE);
		createEReference(chapitreEClass, CHAPITRE__TRACKING);
		createEAttribute(chapitreEClass, CHAPITRE__NAME_CHP);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__FROMATION);
		createEReference(moduleEClass, MODULE__AUTEUR);
		createEReference(moduleEClass, MODULE__CHAPITRE);
		createEReference(moduleEClass, MODULE__TRACKING);
		createEAttribute(moduleEClass, MODULE__COEFF);
		createEAttribute(moduleEClass, MODULE__LEVEL);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__NUMBER_PG);

		trackingEClass = createEClass(TRACKING);
		createEReference(trackingEClass, TRACKING__MODULE);
		createEReference(trackingEClass, TRACKING__CHAPITRE);
		createEReference(trackingEClass, TRACKING__CONNECTE);
		createEReference(trackingEClass, TRACKING__TUTEUR);

		etudiantEClass = createEClass(ETUDIANT);
		createEReference(etudiantEClass, ETUDIANT__PROFIL);
		createEReference(etudiantEClass, ETUDIANT__FORUM);
		createEReference(etudiantEClass, ETUDIANT__CHAT);
		createEReference(etudiantEClass, ETUDIANT__MAIL);
		createEReference(etudiantEClass, ETUDIANT__REPOSITORY);
		createEReference(etudiantEClass, ETUDIANT__GROUPE);
		createEAttribute(etudiantEClass, ETUDIANT__FIRST_NAME_ET);
		createEAttribute(etudiantEClass, ETUDIANT__LAST_NAME_ET);
		createEAttribute(etudiantEClass, ETUDIANT__NUM_ET);
		createEAttribute(etudiantEClass, ETUDIANT__CLASSE);
		createEAttribute(etudiantEClass, ETUDIANT__LEVEL);
		createEAttribute(etudiantEClass, ETUDIANT__NOTE);

		connecteEClass = createEClass(CONNECTE);
		createEReference(connecteEClass, CONNECTE__TRACKING);
		createEAttribute(connecteEClass, CONNECTE__IS_CONNECT);

		profilEClass = createEClass(PROFIL);
		createEAttribute(profilEClass, PROFIL__AVATAR);
		createEAttribute(profilEClass, PROFIL__CITY);
		createEAttribute(profilEClass, PROFIL__TEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		adminEClass.getESuperTypes().add(this.getmembre());
		auteurEClass.getESuperTypes().add(this.getmembre());
		tuteurEClass.getESuperTypes().add(this.getmembre());
		connecteEClass.getESuperTypes().add(this.getetudiant());

		// Initialize classes, features, and operations; add parameters
		initEClass(groupeEClass, groupe.class, "groupe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getgroupe_Admin(), this.getadmin(), this.getadmin_Groupe(), "admin", null, 0, 1, groupe.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getgroupe_Repository(), this.getrepository(), null, "repository", null, 0, -1, groupe.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getgroupe_Mail(), this.getmail(), null, "mail", null, 0, -1, groupe.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getgroupe_Chat(), this.getchat(), null, "chat", null, 0, -1, groupe.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getgroupe_Forum(), this.getforum(), null, "forum", null, 0, -1, groupe.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getgroupe_Tuteur(), this.gettuteur(), this.gettuteur_Groupe(), "tuteur", null, 0, 1,
				groupe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getgroupe_Etudiant(), this.getetudiant(), this.getetudiant_Groupe(), "etudiant", null, 0, 1,
				groupe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getgroupe_NameGp(), ecorePackage.getEString(), "nameGp", null, 0, 1, groupe.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adminEClass, admin.class, "admin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getadmin_Groupe(), this.getgroupe(), this.getgroupe_Admin(), "groupe", null, 0, 1, admin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getadmin_Formation(), this.getformation(), this.getformation_Admin(), "formation", null, 0, 1,
				admin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getadmin_NameAdm(), ecorePackage.getEString(), "nameAdm", null, 0, 1, admin.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getadmin_PasswordAdm(), ecorePackage.getEString(), "passwordAdm", null, 0, 1, admin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auteurEClass, auteur.class, "auteur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getauteur_Module(), this.getmodule(), this.getmodule_Auteur(), "module", null, 0, 1,
				auteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getauteur_NameAtr(), ecorePackage.getEString(), "nameAtr", null, 0, 1, auteur.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(membreEClass, membre.class, "membre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getmembre_Counts(), ecorePackage.getEInt(), "counts", null, 0, 1, membre.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formationEClass, formation.class, "formation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getformation_Admin(), this.getadmin(), this.getadmin_Formation(), "admin", null, 0, 1,
				formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getformation_Module(), this.getmodule(), this.getmodule_Fromation(), "module", null, 0, 1,
				formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getformation_NameFrm(), ecorePackage.getEString(), "nameFrm", null, 0, 1, formation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getformation_Type(), ecorePackage.getEString(), "type", null, 0, 1, formation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getformation_Duration(), ecorePackage.getEDate(), "duration", null, 0, 1, formation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuteurEClass, tuteur.class, "tuteur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettuteur_Tracking(), this.gettracking(), this.gettracking_Tuteur(), "tracking", null, 0, 1,
				tuteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettuteur_Groupe(), this.getgroupe(), this.getgroupe_Tuteur(), "groupe", null, 0, 1,
				tuteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettuteur_FirstNameTr(), ecorePackage.getEString(), "firstNameTr", null, 0, 1, tuteur.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettuteur_LastNameTr(), ecorePackage.getEString(), "lastNameTr", null, 0, 1, tuteur.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettuteur_NumTr(), ecorePackage.getEString(), "numTr", null, 0, 1, tuteur.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettuteur_Matiere(), ecorePackage.getEString(), "matiere", null, 0, 1, tuteur.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forumEClass, forum.class, "forum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getforum_Etudiant(), this.getetudiant(), this.getetudiant_Forum(), "etudiant", null, 0, 1,
				forum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getforum_NameFrm(), ecorePackage.getEString(), "nameFrm", null, 0, 1, forum.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getforum_ContenuFrm(), ecorePackage.getEString(), "contenuFrm", null, 0, 1, forum.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chatEClass, chat.class, "chat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getchat_Etudiant(), this.getetudiant(), this.getetudiant_Chat(), "etudiant", null, 0, 1,
				chat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getchat_PseudoChat(), ecorePackage.getEString(), "pseudoChat", null, 0, 1, chat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getchat_Status(), ecorePackage.getEBoolean(), "status", "false", 0, 1, chat.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mailEClass, mail.class, "mail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmail_Etudiant(), this.getetudiant(), this.getetudiant_Mail(), "etudiant", null, 0, 1,
				mail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getmail_AdresseMail(), ecorePackage.getEString(), "adresseMail", null, 0, 1, mail.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getmail_Password(), ecorePackage.getEString(), "password", null, 0, 1, mail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryEClass, repository.class, "repository", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getrepository_Etudiant(), this.getetudiant(), this.getetudiant_Repository(), "etudiant", null, 0,
				1, repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getrepository_NameRp(), ecorePackage.getEString(), "nameRp", null, 0, 1, repository.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chapitreEClass, chapitre.class, "chapitre", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getchapitre_Page(), this.getpage(), null, "page", null, 0, -1, chapitre.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getchapitre_Tracking(), this.gettracking(), this.gettracking_Chapitre(), "tracking", null, 0, 1,
				chapitre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getchapitre_NameChp(), ecorePackage.getEString(), "nameChp", null, 0, 1, chapitre.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, module.class, "module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmodule_Fromation(), this.getformation(), this.getformation_Module(), "fromation", null, 0, 1,
				module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getmodule_Auteur(), this.getauteur(), this.getauteur_Module(), "auteur", null, 0, 1,
				module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getmodule_Chapitre(), this.getchapitre(), null, "chapitre", null, 0, -1, module.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getmodule_Tracking(), this.gettracking(), this.gettracking_Module(), "tracking", null, 0, 1,
				module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getmodule_Coeff(), ecorePackage.getEInt(), "coeff", null, 0, 1, module.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getmodule_Level(), ecorePackage.getEString(), "Level", null, 0, 1, module.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, page.class, "page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getpage_NumberPg(), ecorePackage.getEInt(), "numberPg", null, 0, 1, page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trackingEClass, tracking.class, "tracking", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettracking_Module(), this.getmodule(), this.getmodule_Tracking(), "module", null, 0, 1,
				tracking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettracking_Chapitre(), this.getchapitre(), this.getchapitre_Tracking(), "chapitre", null, 0, 1,
				tracking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettracking_Connecte(), this.getconnecte(), this.getconnecte_Tracking(), "connecte", null, 0, 1,
				tracking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettracking_Tuteur(), this.gettuteur(), this.gettuteur_Tracking(), "tuteur", null, 0, 1,
				tracking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etudiantEClass, etudiant.class, "etudiant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getetudiant_Profil(), this.getprofil(), null, "profil", null, 0, -1, etudiant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getetudiant_Forum(), this.getforum(), this.getforum_Etudiant(), "forum", null, 0, 1,
				etudiant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getetudiant_Chat(), this.getchat(), this.getchat_Etudiant(), "chat", null, 0, 1, etudiant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getetudiant_Mail(), this.getmail(), this.getmail_Etudiant(), "mail", null, 0, 1, etudiant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getetudiant_Repository(), this.getrepository(), this.getrepository_Etudiant(), "repository",
				null, 0, 1, etudiant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getetudiant_Groupe(), this.getgroupe(), this.getgroupe_Etudiant(), "groupe", null, 0, 1,
				etudiant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getetudiant_FirstNameEt(), ecorePackage.getEString(), "firstNameEt", null, 0, 1, etudiant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getetudiant_LastNameEt(), ecorePackage.getEString(), "lastNameEt", null, 0, 1, etudiant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getetudiant_NumEt(), ecorePackage.getEInt(), "numEt", null, 0, 1, etudiant.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getetudiant_Classe(), ecorePackage.getEString(), "classe", null, 0, 1, etudiant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getetudiant_Level(), ecorePackage.getEInt(), "level", null, 0, 1, etudiant.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getetudiant_Note(), ecorePackage.getEDouble(), "Note", null, 0, 1, etudiant.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connecteEClass, connecte.class, "connecte", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getconnecte_Tracking(), this.gettracking(), this.gettracking_Connecte(), "tracking", null, 0, 1,
				connecte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getconnecte_IsConnect(), ecorePackage.getEBoolean(), "isConnect", "false", 0, 1, connecte.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(profilEClass, profil.class, "profil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getprofil_Avatar(), ecorePackage.getEString(), "avatar", null, 0, 1, profil.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getprofil_City(), ecorePackage.getEString(), "city", null, 0, 1, profil.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getprofil_Tel(), ecorePackage.getEInt(), "tel", null, 0, 1, profil.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GroupeidmPackageImpl
