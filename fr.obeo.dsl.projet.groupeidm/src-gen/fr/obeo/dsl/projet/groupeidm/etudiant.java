/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>etudiant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.etudiant#getProfil <em>Profil</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.etudiant#getForum <em>Forum</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.etudiant#getChat <em>Chat</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.etudiant#getMail <em>Mail</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.etudiant#getRepository <em>Repository</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.etudiant#getGroupe <em>Groupe</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getetudiant()
 * @model
 * @generated
 */
public interface etudiant extends EObject {
	/**
	 * Returns the value of the '<em><b>Profil</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.projet.groupeidm.profil}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profil</em>' containment reference list.
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getetudiant_Profil()
	 * @model containment="true"
	 * @generated
	 */
	EList<profil> getProfil();

	/**
	 * Returns the value of the '<em><b>Forum</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.forum#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forum</em>' reference.
	 * @see #setForum(forum)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getetudiant_Forum()
	 * @see fr.obeo.dsl.projet.groupeidm.forum#getEtudiant
	 * @model opposite="etudiant"
	 * @generated
	 */
	forum getForum();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getForum <em>Forum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forum</em>' reference.
	 * @see #getForum()
	 * @generated
	 */
	void setForum(forum value);

	/**
	 * Returns the value of the '<em><b>Chat</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.chat#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chat</em>' reference.
	 * @see #setChat(chat)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getetudiant_Chat()
	 * @see fr.obeo.dsl.projet.groupeidm.chat#getEtudiant
	 * @model opposite="etudiant"
	 * @generated
	 */
	chat getChat();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getChat <em>Chat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chat</em>' reference.
	 * @see #getChat()
	 * @generated
	 */
	void setChat(chat value);

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.mail#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail</em>' reference.
	 * @see #setMail(mail)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getetudiant_Mail()
	 * @see fr.obeo.dsl.projet.groupeidm.mail#getEtudiant
	 * @model opposite="etudiant"
	 * @generated
	 */
	mail getMail();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getMail <em>Mail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' reference.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(mail value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.repository#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(repository)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getetudiant_Repository()
	 * @see fr.obeo.dsl.projet.groupeidm.repository#getEtudiant
	 * @model opposite="etudiant"
	 * @generated
	 */
	repository getRepository();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(repository value);

	/**
	 * Returns the value of the '<em><b>Groupe</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.groupe#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupe</em>' reference.
	 * @see #setGroupe(groupe)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getetudiant_Groupe()
	 * @see fr.obeo.dsl.projet.groupeidm.groupe#getEtudiant
	 * @model opposite="etudiant"
	 * @generated
	 */
	groupe getGroupe();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getGroupe <em>Groupe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groupe</em>' reference.
	 * @see #getGroupe()
	 * @generated
	 */
	void setGroupe(groupe value);

} // etudiant
