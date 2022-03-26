/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmFactory
 * @model kind="package"
 * @generated
 */
public interface GroupeidmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "groupeidm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/groupeidm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "groupeidm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GroupeidmPackage eINSTANCE = fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.groupeImpl <em>groupe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.groupeImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getgroupe()
	 * @generated
	 */
	int GROUPE = 0;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE__ADMIN = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE__REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE__MAIL = 2;

	/**
	 * The feature id for the '<em><b>Chat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE__CHAT = 3;

	/**
	 * The feature id for the '<em><b>Forum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE__FORUM = 4;

	/**
	 * The feature id for the '<em><b>Tuteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE__TUTEUR = 5;

	/**
	 * The feature id for the '<em><b>Etudiant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE__ETUDIANT = 6;

	/**
	 * The number of structural features of the '<em>groupe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>groupe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.membreImpl <em>membre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.membreImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getmembre()
	 * @generated
	 */
	int MEMBRE = 3;

	/**
	 * The number of structural features of the '<em>membre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>membre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.adminImpl <em>admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.adminImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getadmin()
	 * @generated
	 */
	int ADMIN = 1;

	/**
	 * The feature id for the '<em><b>Groupe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__GROUPE = MEMBRE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fromation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__FROMATION = MEMBRE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = MEMBRE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = MEMBRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.auteurImpl <em>auteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.auteurImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getauteur()
	 * @generated
	 */
	int AUTEUR = 2;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTEUR__MODULE = MEMBRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>auteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTEUR_FEATURE_COUNT = MEMBRE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>auteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTEUR_OPERATION_COUNT = MEMBRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.fromationImpl <em>fromation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.fromationImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getfromation()
	 * @generated
	 */
	int FROMATION = 4;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROMATION__ADMIN = 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROMATION__MODULE = 1;

	/**
	 * The number of structural features of the '<em>fromation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>fromation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.tuteurImpl <em>tuteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.tuteurImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#gettuteur()
	 * @generated
	 */
	int TUTEUR = 5;

	/**
	 * The feature id for the '<em><b>Tracking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTEUR__TRACKING = MEMBRE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groupe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTEUR__GROUPE = MEMBRE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>tuteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTEUR_FEATURE_COUNT = MEMBRE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>tuteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTEUR_OPERATION_COUNT = MEMBRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.forumImpl <em>forum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.forumImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getforum()
	 * @generated
	 */
	int FORUM = 6;

	/**
	 * The feature id for the '<em><b>Etudiant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__ETUDIANT = 0;

	/**
	 * The number of structural features of the '<em>forum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>forum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.chatImpl <em>chat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.chatImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getchat()
	 * @generated
	 */
	int CHAT = 7;

	/**
	 * The feature id for the '<em><b>Etudiant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT__ETUDIANT = 0;

	/**
	 * The number of structural features of the '<em>chat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>chat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.mailImpl <em>mail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.mailImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getmail()
	 * @generated
	 */
	int MAIL = 8;

	/**
	 * The feature id for the '<em><b>Etudiant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL__ETUDIANT = 0;

	/**
	 * The number of structural features of the '<em>mail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>mail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.repositoryImpl <em>repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.repositoryImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getrepository()
	 * @generated
	 */
	int REPOSITORY = 9;

	/**
	 * The feature id for the '<em><b>Etudiant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ETUDIANT = 0;

	/**
	 * The number of structural features of the '<em>repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.chapitreImpl <em>chapitre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.chapitreImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getchapitre()
	 * @generated
	 */
	int CHAPITRE = 10;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPITRE__PAGE = 0;

	/**
	 * The feature id for the '<em><b>Tracking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPITRE__TRACKING = 1;

	/**
	 * The number of structural features of the '<em>chapitre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPITRE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>chapitre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPITRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.moduleImpl <em>module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.moduleImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getmodule()
	 * @generated
	 */
	int MODULE = 11;

	/**
	 * The feature id for the '<em><b>Fromation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__FROMATION = 0;

	/**
	 * The feature id for the '<em><b>Auteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__AUTEUR = 1;

	/**
	 * The feature id for the '<em><b>Chapitre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CHAPITRE = 2;

	/**
	 * The feature id for the '<em><b>Tracking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TRACKING = 3;

	/**
	 * The number of structural features of the '<em>module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.pageImpl <em>page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.pageImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getpage()
	 * @generated
	 */
	int PAGE = 12;

	/**
	 * The number of structural features of the '<em>page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.trackingImpl <em>tracking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.trackingImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#gettracking()
	 * @generated
	 */
	int TRACKING = 13;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING__MODULE = 0;

	/**
	 * The feature id for the '<em><b>Chapitre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING__CHAPITRE = 1;

	/**
	 * The feature id for the '<em><b>Connecte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING__CONNECTE = 2;

	/**
	 * The feature id for the '<em><b>Tuteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING__TUTEUR = 3;

	/**
	 * The number of structural features of the '<em>tracking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>tracking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl <em>etudiant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getetudiant()
	 * @generated
	 */
	int ETUDIANT = 14;

	/**
	 * The feature id for the '<em><b>Profil</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__PROFIL = 0;

	/**
	 * The feature id for the '<em><b>Forum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__FORUM = 1;

	/**
	 * The feature id for the '<em><b>Chat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__CHAT = 2;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__MAIL = 3;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__REPOSITORY = 4;

	/**
	 * The feature id for the '<em><b>Groupe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__GROUPE = 5;

	/**
	 * The number of structural features of the '<em>etudiant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>etudiant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.connecteImpl <em>connecte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.connecteImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getconnecte()
	 * @generated
	 */
	int CONNECTE = 15;

	/**
	 * The feature id for the '<em><b>Profil</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__PROFIL = ETUDIANT__PROFIL;

	/**
	 * The feature id for the '<em><b>Forum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__FORUM = ETUDIANT__FORUM;

	/**
	 * The feature id for the '<em><b>Chat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__CHAT = ETUDIANT__CHAT;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__MAIL = ETUDIANT__MAIL;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__REPOSITORY = ETUDIANT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Groupe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__GROUPE = ETUDIANT__GROUPE;

	/**
	 * The feature id for the '<em><b>Tracking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__TRACKING = ETUDIANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>connecte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE_FEATURE_COUNT = ETUDIANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>connecte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE_OPERATION_COUNT = ETUDIANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.profilImpl <em>profil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.profilImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getprofil()
	 * @generated
	 */
	int PROFIL = 16;

	/**
	 * The number of structural features of the '<em>profil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>profil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.groupe <em>groupe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>groupe</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.groupe
	 * @generated
	 */
	EClass getgroupe();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.groupe#getAdmin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Admin</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.groupe#getAdmin()
	 * @see #getgroupe()
	 * @generated
	 */
	EReference getgroupe_Admin();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.projet.groupeidm.groupe#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repository</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.groupe#getRepository()
	 * @see #getgroupe()
	 * @generated
	 */
	EReference getgroupe_Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.projet.groupeidm.groupe#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mail</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.groupe#getMail()
	 * @see #getgroupe()
	 * @generated
	 */
	EReference getgroupe_Mail();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.projet.groupeidm.groupe#getChat <em>Chat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chat</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.groupe#getChat()
	 * @see #getgroupe()
	 * @generated
	 */
	EReference getgroupe_Chat();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.projet.groupeidm.groupe#getForum <em>Forum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forum</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.groupe#getForum()
	 * @see #getgroupe()
	 * @generated
	 */
	EReference getgroupe_Forum();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.groupe#getTuteur <em>Tuteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tuteur</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.groupe#getTuteur()
	 * @see #getgroupe()
	 * @generated
	 */
	EReference getgroupe_Tuteur();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.groupe#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Etudiant</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.groupe#getEtudiant()
	 * @see #getgroupe()
	 * @generated
	 */
	EReference getgroupe_Etudiant();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.admin <em>admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>admin</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.admin
	 * @generated
	 */
	EClass getadmin();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.admin#getGroupe <em>Groupe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Groupe</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.admin#getGroupe()
	 * @see #getadmin()
	 * @generated
	 */
	EReference getadmin_Groupe();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.admin#getFromation <em>Fromation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fromation</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.admin#getFromation()
	 * @see #getadmin()
	 * @generated
	 */
	EReference getadmin_Fromation();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.auteur <em>auteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>auteur</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.auteur
	 * @generated
	 */
	EClass getauteur();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.auteur#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.auteur#getModule()
	 * @see #getauteur()
	 * @generated
	 */
	EReference getauteur_Module();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.membre <em>membre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>membre</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.membre
	 * @generated
	 */
	EClass getmembre();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.fromation <em>fromation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>fromation</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.fromation
	 * @generated
	 */
	EClass getfromation();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.fromation#getAdmin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Admin</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.fromation#getAdmin()
	 * @see #getfromation()
	 * @generated
	 */
	EReference getfromation_Admin();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.fromation#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.fromation#getModule()
	 * @see #getfromation()
	 * @generated
	 */
	EReference getfromation_Module();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.tuteur <em>tuteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tuteur</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.tuteur
	 * @generated
	 */
	EClass gettuteur();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getTracking <em>Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tracking</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.tuteur#getTracking()
	 * @see #gettuteur()
	 * @generated
	 */
	EReference gettuteur_Tracking();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getGroupe <em>Groupe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Groupe</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.tuteur#getGroupe()
	 * @see #gettuteur()
	 * @generated
	 */
	EReference gettuteur_Groupe();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.forum <em>forum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>forum</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.forum
	 * @generated
	 */
	EClass getforum();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.forum#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Etudiant</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.forum#getEtudiant()
	 * @see #getforum()
	 * @generated
	 */
	EReference getforum_Etudiant();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.chat <em>chat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>chat</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.chat
	 * @generated
	 */
	EClass getchat();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.chat#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Etudiant</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.chat#getEtudiant()
	 * @see #getchat()
	 * @generated
	 */
	EReference getchat_Etudiant();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.mail <em>mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>mail</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.mail
	 * @generated
	 */
	EClass getmail();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.mail#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Etudiant</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.mail#getEtudiant()
	 * @see #getmail()
	 * @generated
	 */
	EReference getmail_Etudiant();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.repository <em>repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>repository</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.repository
	 * @generated
	 */
	EClass getrepository();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.repository#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Etudiant</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.repository#getEtudiant()
	 * @see #getrepository()
	 * @generated
	 */
	EReference getrepository_Etudiant();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.chapitre <em>chapitre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>chapitre</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.chapitre
	 * @generated
	 */
	EClass getchapitre();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.projet.groupeidm.chapitre#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.chapitre#getPage()
	 * @see #getchapitre()
	 * @generated
	 */
	EReference getchapitre_Page();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.chapitre#getTracking <em>Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tracking</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.chapitre#getTracking()
	 * @see #getchapitre()
	 * @generated
	 */
	EReference getchapitre_Tracking();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.module <em>module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>module</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.module
	 * @generated
	 */
	EClass getmodule();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.module#getFromation <em>Fromation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fromation</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.module#getFromation()
	 * @see #getmodule()
	 * @generated
	 */
	EReference getmodule_Fromation();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.module#getAuteur <em>Auteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auteur</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.module#getAuteur()
	 * @see #getmodule()
	 * @generated
	 */
	EReference getmodule_Auteur();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.projet.groupeidm.module#getChapitre <em>Chapitre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chapitre</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.module#getChapitre()
	 * @see #getmodule()
	 * @generated
	 */
	EReference getmodule_Chapitre();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.module#getTracking <em>Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tracking</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.module#getTracking()
	 * @see #getmodule()
	 * @generated
	 */
	EReference getmodule_Tracking();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.page <em>page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>page</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.page
	 * @generated
	 */
	EClass getpage();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.tracking <em>tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tracking</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.tracking
	 * @generated
	 */
	EClass gettracking();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.tracking#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.tracking#getModule()
	 * @see #gettracking()
	 * @generated
	 */
	EReference gettracking_Module();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.tracking#getChapitre <em>Chapitre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chapitre</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.tracking#getChapitre()
	 * @see #gettracking()
	 * @generated
	 */
	EReference gettracking_Chapitre();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.tracking#getConnecte <em>Connecte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connecte</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.tracking#getConnecte()
	 * @see #gettracking()
	 * @generated
	 */
	EReference gettracking_Connecte();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.tracking#getTuteur <em>Tuteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tuteur</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.tracking#getTuteur()
	 * @see #gettracking()
	 * @generated
	 */
	EReference gettracking_Tuteur();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.etudiant <em>etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>etudiant</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant
	 * @generated
	 */
	EClass getetudiant();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getProfil <em>Profil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profil</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getProfil()
	 * @see #getetudiant()
	 * @generated
	 */
	EReference getetudiant_Profil();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getForum <em>Forum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forum</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getForum()
	 * @see #getetudiant()
	 * @generated
	 */
	EReference getetudiant_Forum();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getChat <em>Chat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chat</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getChat()
	 * @see #getetudiant()
	 * @generated
	 */
	EReference getetudiant_Chat();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mail</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getMail()
	 * @see #getetudiant()
	 * @generated
	 */
	EReference getetudiant_Mail();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getRepository()
	 * @see #getetudiant()
	 * @generated
	 */
	EReference getetudiant_Repository();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getGroupe <em>Groupe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Groupe</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getGroupe()
	 * @see #getetudiant()
	 * @generated
	 */
	EReference getetudiant_Groupe();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.connecte <em>connecte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>connecte</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.connecte
	 * @generated
	 */
	EClass getconnecte();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.connecte#getTracking <em>Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tracking</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.connecte#getTracking()
	 * @see #getconnecte()
	 * @generated
	 */
	EReference getconnecte_Tracking();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.profil <em>profil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>profil</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.profil
	 * @generated
	 */
	EClass getprofil();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GroupeidmFactory getGroupeidmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.groupeImpl <em>groupe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.groupeImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getgroupe()
		 * @generated
		 */
		EClass GROUPE = eINSTANCE.getgroupe();

		/**
		 * The meta object literal for the '<em><b>Admin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPE__ADMIN = eINSTANCE.getgroupe_Admin();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPE__REPOSITORY = eINSTANCE.getgroupe_Repository();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPE__MAIL = eINSTANCE.getgroupe_Mail();

		/**
		 * The meta object literal for the '<em><b>Chat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPE__CHAT = eINSTANCE.getgroupe_Chat();

		/**
		 * The meta object literal for the '<em><b>Forum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPE__FORUM = eINSTANCE.getgroupe_Forum();

		/**
		 * The meta object literal for the '<em><b>Tuteur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPE__TUTEUR = eINSTANCE.getgroupe_Tuteur();

		/**
		 * The meta object literal for the '<em><b>Etudiant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPE__ETUDIANT = eINSTANCE.getgroupe_Etudiant();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.adminImpl <em>admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.adminImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getadmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getadmin();

		/**
		 * The meta object literal for the '<em><b>Groupe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__GROUPE = eINSTANCE.getadmin_Groupe();

		/**
		 * The meta object literal for the '<em><b>Fromation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__FROMATION = eINSTANCE.getadmin_Fromation();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.auteurImpl <em>auteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.auteurImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getauteur()
		 * @generated
		 */
		EClass AUTEUR = eINSTANCE.getauteur();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTEUR__MODULE = eINSTANCE.getauteur_Module();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.membreImpl <em>membre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.membreImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getmembre()
		 * @generated
		 */
		EClass MEMBRE = eINSTANCE.getmembre();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.fromationImpl <em>fromation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.fromationImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getfromation()
		 * @generated
		 */
		EClass FROMATION = eINSTANCE.getfromation();

		/**
		 * The meta object literal for the '<em><b>Admin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROMATION__ADMIN = eINSTANCE.getfromation_Admin();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROMATION__MODULE = eINSTANCE.getfromation_Module();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.tuteurImpl <em>tuteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.tuteurImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#gettuteur()
		 * @generated
		 */
		EClass TUTEUR = eINSTANCE.gettuteur();

		/**
		 * The meta object literal for the '<em><b>Tracking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUTEUR__TRACKING = eINSTANCE.gettuteur_Tracking();

		/**
		 * The meta object literal for the '<em><b>Groupe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUTEUR__GROUPE = eINSTANCE.gettuteur_Groupe();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.forumImpl <em>forum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.forumImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getforum()
		 * @generated
		 */
		EClass FORUM = eINSTANCE.getforum();

		/**
		 * The meta object literal for the '<em><b>Etudiant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORUM__ETUDIANT = eINSTANCE.getforum_Etudiant();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.chatImpl <em>chat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.chatImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getchat()
		 * @generated
		 */
		EClass CHAT = eINSTANCE.getchat();

		/**
		 * The meta object literal for the '<em><b>Etudiant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAT__ETUDIANT = eINSTANCE.getchat_Etudiant();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.mailImpl <em>mail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.mailImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getmail()
		 * @generated
		 */
		EClass MAIL = eINSTANCE.getmail();

		/**
		 * The meta object literal for the '<em><b>Etudiant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIL__ETUDIANT = eINSTANCE.getmail_Etudiant();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.repositoryImpl <em>repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.repositoryImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getrepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getrepository();

		/**
		 * The meta object literal for the '<em><b>Etudiant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__ETUDIANT = eINSTANCE.getrepository_Etudiant();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.chapitreImpl <em>chapitre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.chapitreImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getchapitre()
		 * @generated
		 */
		EClass CHAPITRE = eINSTANCE.getchapitre();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAPITRE__PAGE = eINSTANCE.getchapitre_Page();

		/**
		 * The meta object literal for the '<em><b>Tracking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAPITRE__TRACKING = eINSTANCE.getchapitre_Tracking();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.moduleImpl <em>module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.moduleImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getmodule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getmodule();

		/**
		 * The meta object literal for the '<em><b>Fromation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__FROMATION = eINSTANCE.getmodule_Fromation();

		/**
		 * The meta object literal for the '<em><b>Auteur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__AUTEUR = eINSTANCE.getmodule_Auteur();

		/**
		 * The meta object literal for the '<em><b>Chapitre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__CHAPITRE = eINSTANCE.getmodule_Chapitre();

		/**
		 * The meta object literal for the '<em><b>Tracking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__TRACKING = eINSTANCE.getmodule_Tracking();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.pageImpl <em>page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.pageImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getpage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getpage();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.trackingImpl <em>tracking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.trackingImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#gettracking()
		 * @generated
		 */
		EClass TRACKING = eINSTANCE.gettracking();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING__MODULE = eINSTANCE.gettracking_Module();

		/**
		 * The meta object literal for the '<em><b>Chapitre</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING__CHAPITRE = eINSTANCE.gettracking_Chapitre();

		/**
		 * The meta object literal for the '<em><b>Connecte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING__CONNECTE = eINSTANCE.gettracking_Connecte();

		/**
		 * The meta object literal for the '<em><b>Tuteur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING__TUTEUR = eINSTANCE.gettracking_Tuteur();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl <em>etudiant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getetudiant()
		 * @generated
		 */
		EClass ETUDIANT = eINSTANCE.getetudiant();

		/**
		 * The meta object literal for the '<em><b>Profil</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETUDIANT__PROFIL = eINSTANCE.getetudiant_Profil();

		/**
		 * The meta object literal for the '<em><b>Forum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETUDIANT__FORUM = eINSTANCE.getetudiant_Forum();

		/**
		 * The meta object literal for the '<em><b>Chat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETUDIANT__CHAT = eINSTANCE.getetudiant_Chat();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETUDIANT__MAIL = eINSTANCE.getetudiant_Mail();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETUDIANT__REPOSITORY = eINSTANCE.getetudiant_Repository();

		/**
		 * The meta object literal for the '<em><b>Groupe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETUDIANT__GROUPE = eINSTANCE.getetudiant_Groupe();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.connecteImpl <em>connecte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.connecteImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getconnecte()
		 * @generated
		 */
		EClass CONNECTE = eINSTANCE.getconnecte();

		/**
		 * The meta object literal for the '<em><b>Tracking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTE__TRACKING = eINSTANCE.getconnecte_Tracking();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.profilImpl <em>profil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.profilImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getprofil()
		 * @generated
		 */
		EClass PROFIL = eINSTANCE.getprofil();

	}

} //GroupeidmPackage
