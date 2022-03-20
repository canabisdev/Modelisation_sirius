/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

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
	 * The feature id for the '<em><b>Name Gp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE__NAME_GP = 7;

	/**
	 * The number of structural features of the '<em>groupe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE_FEATURE_COUNT = 8;

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
	 * The feature id for the '<em><b>Counts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRE__COUNTS = 0;

	/**
	 * The number of structural features of the '<em>membre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRE_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Counts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__COUNTS = MEMBRE__COUNTS;

	/**
	 * The feature id for the '<em><b>Groupe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__GROUPE = MEMBRE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__FORMATION = MEMBRE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name Adm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__NAME_ADM = MEMBRE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Password Adm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__PASSWORD_ADM = MEMBRE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = MEMBRE_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Counts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTEUR__COUNTS = MEMBRE__COUNTS;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTEUR__MODULE = MEMBRE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Atr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTEUR__NAME_ATR = MEMBRE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>auteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTEUR_FEATURE_COUNT = MEMBRE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>auteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTEUR_OPERATION_COUNT = MEMBRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.formationImpl <em>formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.formationImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getformation()
	 * @generated
	 */
	int FORMATION = 4;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__ADMIN = 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__MODULE = 1;

	/**
	 * The feature id for the '<em><b>Name Frm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NAME_FRM = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__DURATION = 4;

	/**
	 * The number of structural features of the '<em>formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.forumImpl <em>forum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.forumImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getforum()
	 * @generated
	 */
	int FORUM = 6;

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
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.mailImpl <em>mail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.mailImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getmail()
	 * @generated
	 */
	int MAIL = 8;

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
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.chapitreImpl <em>chapitre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.chapitreImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getchapitre()
	 * @generated
	 */
	int CHAPITRE = 10;

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
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.pageImpl <em>page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.pageImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getpage()
	 * @generated
	 */
	int PAGE = 12;

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
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl <em>etudiant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.etudiantImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getetudiant()
	 * @generated
	 */
	int ETUDIANT = 14;

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
	 * The meta object id for the '{@link fr.obeo.dsl.projet.groupeidm.impl.profilImpl <em>profil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.projet.groupeidm.impl.profilImpl
	 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getprofil()
	 * @generated
	 */
	int PROFIL = 16;

	EStructuralFeature FROMATION__ADMIN = null;

	/**
	 * The feature id for the '<em><b>Counts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTEUR__COUNTS = MEMBRE__COUNTS;

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
	 * The feature id for the '<em><b>First Name Tr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTEUR__FIRST_NAME_TR = MEMBRE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Name Tr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTEUR__LAST_NAME_TR = MEMBRE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Num Tr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTEUR__NUM_TR = MEMBRE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Matiere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTEUR__MATIERE = MEMBRE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>tuteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTEUR_FEATURE_COUNT = MEMBRE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>tuteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTEUR_OPERATION_COUNT = MEMBRE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Etudiant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__ETUDIANT = 0;

	/**
	 * The feature id for the '<em><b>Name Frm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__NAME_FRM = 1;

	/**
	 * The feature id for the '<em><b>Contenu Frm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__CONTENU_FRM = 2;

	/**
	 * The number of structural features of the '<em>forum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>forum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Etudiant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT__ETUDIANT = 0;

	/**
	 * The feature id for the '<em><b>Pseudo Chat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT__PSEUDO_CHAT = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT__STATUS = 2;

	/**
	 * The number of structural features of the '<em>chat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>chat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Etudiant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL__ETUDIANT = 0;

	/**
	 * The feature id for the '<em><b>Adresse Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL__ADRESSE_MAIL = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL__PASSWORD = 2;

	/**
	 * The number of structural features of the '<em>mail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>mail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Etudiant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ETUDIANT = 0;

	/**
	 * The feature id for the '<em><b>Name Rp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME_RP = 1;

	/**
	 * The number of structural features of the '<em>repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Name Chp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPITRE__NAME_CHP = 2;

	/**
	 * The number of structural features of the '<em>chapitre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPITRE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>chapitre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPITRE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COEFF = 4;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LEVEL = 5;

	/**
	 * The number of structural features of the '<em>module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Number Pg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NUMBER_PG = 0;

	/**
	 * The number of structural features of the '<em>page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>First Name Et</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__FIRST_NAME_ET = 6;

	/**
	 * The feature id for the '<em><b>Last Name Et</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__LAST_NAME_ET = 7;

	/**
	 * The feature id for the '<em><b>Num Et</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__NUM_ET = 8;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__CLASSE = 9;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__LEVEL = 10;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__NOTE = 11;

	/**
	 * The number of structural features of the '<em>etudiant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>etudiant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>First Name Et</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__FIRST_NAME_ET = ETUDIANT__FIRST_NAME_ET;

	/**
	 * The feature id for the '<em><b>Last Name Et</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__LAST_NAME_ET = ETUDIANT__LAST_NAME_ET;

	/**
	 * The feature id for the '<em><b>Num Et</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__NUM_ET = ETUDIANT__NUM_ET;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__CLASSE = ETUDIANT__CLASSE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__LEVEL = ETUDIANT__LEVEL;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__NOTE = ETUDIANT__NOTE;

	/**
	 * The feature id for the '<em><b>Tracking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__TRACKING = ETUDIANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE__IS_CONNECT = ETUDIANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>connecte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE_FEATURE_COUNT = ETUDIANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>connecte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTE_OPERATION_COUNT = ETUDIANT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Avatar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIL__AVATAR = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIL__CITY = 1;

	/**
	 * The feature id for the '<em><b>Tel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIL__TEL = 2;

	/**
	 * The number of structural features of the '<em>profil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIL_FEATURE_COUNT = 3;

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
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.groupe#getNameGp <em>Name Gp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Gp</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.groupe#getNameGp()
	 * @see #getgroupe()
	 * @generated
	 */
	EAttribute getgroupe_NameGp();

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
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.admin#getFormation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formation</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.admin#getFormation()
	 * @see #getadmin()
	 * @generated
	 */
	EReference getadmin_Formation();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.admin#getNameAdm <em>Name Adm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Adm</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.admin#getNameAdm()
	 * @see #getadmin()
	 * @generated
	 */
	EAttribute getadmin_NameAdm();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.admin#getPasswordAdm <em>Password Adm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Adm</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.admin#getPasswordAdm()
	 * @see #getadmin()
	 * @generated
	 */
	EAttribute getadmin_PasswordAdm();

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
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.auteur#getNameAtr <em>Name Atr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Atr</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.auteur#getNameAtr()
	 * @see #getauteur()
	 * @generated
	 */
	EAttribute getauteur_NameAtr();

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
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.membre#getCounts <em>Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counts</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.membre#getCounts()
	 * @see #getmembre()
	 * @generated
	 */
	EAttribute getmembre_Counts();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.projet.groupeidm.formation <em>formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>formation</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.formation
	 * @generated
	 */
	EClass getformation();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.formation#getAdmin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Admin</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.formation#getAdmin()
	 * @see #getformation()
	 * @generated
	 */
	EReference getformation_Admin();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.projet.groupeidm.formation#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.formation#getModule()
	 * @see #getformation()
	 * @generated
	 */
	EReference getformation_Module();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.formation#getNameFrm <em>Name Frm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Frm</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.formation#getNameFrm()
	 * @see #getformation()
	 * @generated
	 */
	EAttribute getformation_NameFrm();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.formation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.formation#getType()
	 * @see #getformation()
	 * @generated
	 */
	EAttribute getformation_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.formation#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.formation#getDuration()
	 * @see #getformation()
	 * @generated
	 */
	EAttribute getformation_Duration();

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
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getFirstNameTr <em>First Name Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name Tr</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.tuteur#getFirstNameTr()
	 * @see #gettuteur()
	 * @generated
	 */
	EAttribute gettuteur_FirstNameTr();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getLastNameTr <em>Last Name Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name Tr</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.tuteur#getLastNameTr()
	 * @see #gettuteur()
	 * @generated
	 */
	EAttribute gettuteur_LastNameTr();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getNumTr <em>Num Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Tr</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.tuteur#getNumTr()
	 * @see #gettuteur()
	 * @generated
	 */
	EAttribute gettuteur_NumTr();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getMatiere <em>Matiere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matiere</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.tuteur#getMatiere()
	 * @see #gettuteur()
	 * @generated
	 */
	EAttribute gettuteur_Matiere();

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
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.forum#getNameFrm <em>Name Frm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Frm</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.forum#getNameFrm()
	 * @see #getforum()
	 * @generated
	 */
	EAttribute getforum_NameFrm();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.forum#getContenuFrm <em>Contenu Frm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenu Frm</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.forum#getContenuFrm()
	 * @see #getforum()
	 * @generated
	 */
	EAttribute getforum_ContenuFrm();

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
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.chat#getPseudoChat <em>Pseudo Chat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudo Chat</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.chat#getPseudoChat()
	 * @see #getchat()
	 * @generated
	 */
	EAttribute getchat_PseudoChat();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.chat#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.chat#isStatus()
	 * @see #getchat()
	 * @generated
	 */
	EAttribute getchat_Status();

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
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.mail#getAdresseMail <em>Adresse Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse Mail</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.mail#getAdresseMail()
	 * @see #getmail()
	 * @generated
	 */
	EAttribute getmail_AdresseMail();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.mail#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.mail#getPassword()
	 * @see #getmail()
	 * @generated
	 */
	EAttribute getmail_Password();

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
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.repository#getNameRp <em>Name Rp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Rp</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.repository#getNameRp()
	 * @see #getrepository()
	 * @generated
	 */
	EAttribute getrepository_NameRp();

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
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.chapitre#getNameChp <em>Name Chp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Chp</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.chapitre#getNameChp()
	 * @see #getchapitre()
	 * @generated
	 */
	EAttribute getchapitre_NameChp();

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
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.module#getCoeff <em>Coeff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coeff</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.module#getCoeff()
	 * @see #getmodule()
	 * @generated
	 */
	EAttribute getmodule_Coeff();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.module#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.module#getLevel()
	 * @see #getmodule()
	 * @generated
	 */
	EAttribute getmodule_Level();

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
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.page#getNumberPg <em>Number Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Pg</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.page#getNumberPg()
	 * @see #getpage()
	 * @generated
	 */
	EAttribute getpage_NumberPg();

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
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getFirstNameEt <em>First Name Et</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name Et</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getFirstNameEt()
	 * @see #getetudiant()
	 * @generated
	 */
	EAttribute getetudiant_FirstNameEt();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getLastNameEt <em>Last Name Et</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name Et</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getLastNameEt()
	 * @see #getetudiant()
	 * @generated
	 */
	EAttribute getetudiant_LastNameEt();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getNumEt <em>Num Et</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Et</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getNumEt()
	 * @see #getetudiant()
	 * @generated
	 */
	EAttribute getetudiant_NumEt();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getClasse <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classe</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getClasse()
	 * @see #getetudiant()
	 * @generated
	 */
	EAttribute getetudiant_Classe();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getLevel()
	 * @see #getetudiant()
	 * @generated
	 */
	EAttribute getetudiant_Level();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getNote()
	 * @see #getetudiant()
	 * @generated
	 */
	EAttribute getetudiant_Note();

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
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.connecte#isIsConnect <em>Is Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Connect</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.connecte#isIsConnect()
	 * @see #getconnecte()
	 * @generated
	 */
	EAttribute getconnecte_IsConnect();

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
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.profil#getAvatar <em>Avatar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avatar</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.profil#getAvatar()
	 * @see #getprofil()
	 * @generated
	 */
	EAttribute getprofil_Avatar();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.profil#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.profil#getCity()
	 * @see #getprofil()
	 * @generated
	 */
	EAttribute getprofil_City();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.projet.groupeidm.profil#getTel <em>Tel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tel</em>'.
	 * @see fr.obeo.dsl.projet.groupeidm.profil#getTel()
	 * @see #getprofil()
	 * @generated
	 */
	EAttribute getprofil_Tel();

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
		 * The meta object literal for the '<em><b>Name Gp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPE__NAME_GP = eINSTANCE.getgroupe_NameGp();

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
		 * The meta object literal for the '<em><b>Formation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__FORMATION = eINSTANCE.getadmin_Formation();

		/**
		 * The meta object literal for the '<em><b>Name Adm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN__NAME_ADM = eINSTANCE.getadmin_NameAdm();

		/**
		 * The meta object literal for the '<em><b>Password Adm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN__PASSWORD_ADM = eINSTANCE.getadmin_PasswordAdm();

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
		 * The meta object literal for the '<em><b>Name Atr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTEUR__NAME_ATR = eINSTANCE.getauteur_NameAtr();

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
		 * The meta object literal for the '<em><b>Counts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBRE__COUNTS = eINSTANCE.getmembre_Counts();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.formationImpl <em>formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.formationImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getformation()
		 * @generated
		 */
		EClass FORMATION = eINSTANCE.getformation();

		/**
		 * The meta object literal for the '<em><b>Admin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__ADMIN = eINSTANCE.getformation_Admin();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__MODULE = eINSTANCE.getformation_Module();

		/**
		 * The meta object literal for the '<em><b>Name Frm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__NAME_FRM = eINSTANCE.getformation_NameFrm();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__TYPE = eINSTANCE.getformation_Type();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__DURATION = eINSTANCE.getformation_Duration();

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
		 * The meta object literal for the '<em><b>First Name Tr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUTEUR__FIRST_NAME_TR = eINSTANCE.gettuteur_FirstNameTr();

		/**
		 * The meta object literal for the '<em><b>Last Name Tr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUTEUR__LAST_NAME_TR = eINSTANCE.gettuteur_LastNameTr();

		/**
		 * The meta object literal for the '<em><b>Num Tr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUTEUR__NUM_TR = eINSTANCE.gettuteur_NumTr();

		/**
		 * The meta object literal for the '<em><b>Matiere</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUTEUR__MATIERE = eINSTANCE.gettuteur_Matiere();

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
		 * The meta object literal for the '<em><b>Name Frm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORUM__NAME_FRM = eINSTANCE.getforum_NameFrm();

		/**
		 * The meta object literal for the '<em><b>Contenu Frm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORUM__CONTENU_FRM = eINSTANCE.getforum_ContenuFrm();

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
		 * The meta object literal for the '<em><b>Pseudo Chat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAT__PSEUDO_CHAT = eINSTANCE.getchat_PseudoChat();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAT__STATUS = eINSTANCE.getchat_Status();

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
		 * The meta object literal for the '<em><b>Adresse Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIL__ADRESSE_MAIL = eINSTANCE.getmail_AdresseMail();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIL__PASSWORD = eINSTANCE.getmail_Password();

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
		 * The meta object literal for the '<em><b>Name Rp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__NAME_RP = eINSTANCE.getrepository_NameRp();

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
		 * The meta object literal for the '<em><b>Name Chp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAPITRE__NAME_CHP = eINSTANCE.getchapitre_NameChp();

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
		 * The meta object literal for the '<em><b>Coeff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__COEFF = eINSTANCE.getmodule_Coeff();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__LEVEL = eINSTANCE.getmodule_Level();

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
		 * The meta object literal for the '<em><b>Number Pg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NUMBER_PG = eINSTANCE.getpage_NumberPg();

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
		 * The meta object literal for the '<em><b>First Name Et</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETUDIANT__FIRST_NAME_ET = eINSTANCE.getetudiant_FirstNameEt();

		/**
		 * The meta object literal for the '<em><b>Last Name Et</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETUDIANT__LAST_NAME_ET = eINSTANCE.getetudiant_LastNameEt();

		/**
		 * The meta object literal for the '<em><b>Num Et</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETUDIANT__NUM_ET = eINSTANCE.getetudiant_NumEt();

		/**
		 * The meta object literal for the '<em><b>Classe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETUDIANT__CLASSE = eINSTANCE.getetudiant_Classe();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETUDIANT__LEVEL = eINSTANCE.getetudiant_Level();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETUDIANT__NOTE = eINSTANCE.getetudiant_Note();

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
		 * The meta object literal for the '<em><b>Is Connect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTE__IS_CONNECT = eINSTANCE.getconnecte_IsConnect();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.projet.groupeidm.impl.profilImpl <em>profil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.projet.groupeidm.impl.profilImpl
		 * @see fr.obeo.dsl.projet.groupeidm.impl.GroupeidmPackageImpl#getprofil()
		 * @generated
		 */
		EClass PROFIL = eINSTANCE.getprofil();

		/**
		 * The meta object literal for the '<em><b>Avatar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFIL__AVATAR = eINSTANCE.getprofil_Avatar();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFIL__CITY = eINSTANCE.getprofil_City();

		/**
		 * The meta object literal for the '<em><b>Tel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFIL__TEL = eINSTANCE.getprofil_Tel();

	}

} //GroupeidmPackage
