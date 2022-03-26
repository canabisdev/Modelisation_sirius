/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>groupe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.groupe#getAdmin <em>Admin</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.groupe#getRepository <em>Repository</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.groupe#getMail <em>Mail</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.groupe#getChat <em>Chat</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.groupe#getForum <em>Forum</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.groupe#getTuteur <em>Tuteur</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.groupe#getEtudiant <em>Etudiant</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getgroupe()
 * @model abstract="true"
 * @generated
 */
public interface groupe extends EObject {
	/**
	 * Returns the value of the '<em><b>Admin</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.admin#getGroupe <em>Groupe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin</em>' reference.
	 * @see #setAdmin(admin)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getgroupe_Admin()
	 * @see fr.obeo.dsl.projet.groupeidm.admin#getGroupe
	 * @model opposite="groupe"
	 * @generated
	 */
	admin getAdmin();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.groupe#getAdmin <em>Admin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin</em>' reference.
	 * @see #getAdmin()
	 * @generated
	 */
	void setAdmin(admin value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.projet.groupeidm.repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference list.
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getgroupe_Repository()
	 * @model containment="true"
	 * @generated
	 */
	EList<repository> getRepository();

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.projet.groupeidm.mail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail</em>' containment reference list.
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getgroupe_Mail()
	 * @model containment="true"
	 * @generated
	 */
	EList<mail> getMail();

	/**
	 * Returns the value of the '<em><b>Chat</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.projet.groupeidm.chat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chat</em>' containment reference list.
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getgroupe_Chat()
	 * @model containment="true"
	 * @generated
	 */
	EList<chat> getChat();

	/**
	 * Returns the value of the '<em><b>Forum</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.projet.groupeidm.forum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forum</em>' containment reference list.
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getgroupe_Forum()
	 * @model containment="true"
	 * @generated
	 */
	EList<forum> getForum();

	/**
	 * Returns the value of the '<em><b>Tuteur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getGroupe <em>Groupe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuteur</em>' reference.
	 * @see #setTuteur(tuteur)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getgroupe_Tuteur()
	 * @see fr.obeo.dsl.projet.groupeidm.tuteur#getGroupe
	 * @model opposite="groupe"
	 * @generated
	 */
	tuteur getTuteur();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.groupe#getTuteur <em>Tuteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuteur</em>' reference.
	 * @see #getTuteur()
	 * @generated
	 */
	void setTuteur(tuteur value);

	/**
	 * Returns the value of the '<em><b>Etudiant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getGroupe <em>Groupe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etudiant</em>' reference.
	 * @see #setEtudiant(etudiant)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getgroupe_Etudiant()
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getGroupe
	 * @model opposite="groupe"
	 * @generated
	 */
	etudiant getEtudiant();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.groupe#getEtudiant <em>Etudiant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etudiant</em>' reference.
	 * @see #getEtudiant()
	 * @generated
	 */
	void setEtudiant(etudiant value);

} // groupe
