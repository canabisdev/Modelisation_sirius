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
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.etudiant#getFirstNameEt <em>First Name Et</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.etudiant#getLastNameEt <em>Last Name Et</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.etudiant#getNumEt <em>Num Et</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.etudiant#getClasse <em>Classe</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.etudiant#getLevel <em>Level</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.etudiant#getNote <em>Note</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>First Name Et</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name Et</em>' attribute.
	 * @see #setFirstNameEt(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getetudiant_FirstNameEt()
	 * @model
	 * @generated
	 */
	String getFirstNameEt();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getFirstNameEt <em>First Name Et</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name Et</em>' attribute.
	 * @see #getFirstNameEt()
	 * @generated
	 */
	void setFirstNameEt(String value);

	/**
	 * Returns the value of the '<em><b>Last Name Et</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name Et</em>' attribute.
	 * @see #setLastNameEt(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getetudiant_LastNameEt()
	 * @model
	 * @generated
	 */
	String getLastNameEt();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getLastNameEt <em>Last Name Et</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name Et</em>' attribute.
	 * @see #getLastNameEt()
	 * @generated
	 */
	void setLastNameEt(String value);

	/**
	 * Returns the value of the '<em><b>Num Et</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Et</em>' attribute.
	 * @see #setNumEt(int)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getetudiant_NumEt()
	 * @model
	 * @generated
	 */
	int getNumEt();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getNumEt <em>Num Et</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Et</em>' attribute.
	 * @see #getNumEt()
	 * @generated
	 */
	void setNumEt(int value);

	/**
	 * Returns the value of the '<em><b>Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe</em>' attribute.
	 * @see #setClasse(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getetudiant_Classe()
	 * @model
	 * @generated
	 */
	String getClasse();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getClasse <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe</em>' attribute.
	 * @see #getClasse()
	 * @generated
	 */
	void setClasse(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getetudiant_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(double)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getetudiant_Note()
	 * @model
	 * @generated
	 */
	double getNote();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(double value);

} // etudiant
