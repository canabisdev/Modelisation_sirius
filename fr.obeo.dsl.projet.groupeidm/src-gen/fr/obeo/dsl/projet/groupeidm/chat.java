/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>chat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.chat#getEtudiant <em>Etudiant</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.chat#getPseudoChat <em>Pseudo Chat</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.chat#isStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getchat()
 * @model
 * @generated
 */
public interface chat extends EObject {
	/**
	 * Returns the value of the '<em><b>Etudiant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getChat <em>Chat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etudiant</em>' reference.
	 * @see #setEtudiant(etudiant)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getchat_Etudiant()
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getChat
	 * @model opposite="chat"
	 * @generated
	 */
	etudiant getEtudiant();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.chat#getEtudiant <em>Etudiant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etudiant</em>' reference.
	 * @see #getEtudiant()
	 * @generated
	 */
	void setEtudiant(etudiant value);

	/**
	 * Returns the value of the '<em><b>Pseudo Chat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pseudo Chat</em>' attribute.
	 * @see #setPseudoChat(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getchat_PseudoChat()
	 * @model
	 * @generated
	 */
	String getPseudoChat();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.chat#getPseudoChat <em>Pseudo Chat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudo Chat</em>' attribute.
	 * @see #getPseudoChat()
	 * @generated
	 */
	void setPseudoChat(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getchat_Status()
	 * @model default="false"
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.chat#isStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isStatus()
	 * @generated
	 */
	void setStatus(boolean value);

} // chat
