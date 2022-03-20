/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>mail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.mail#getEtudiant <em>Etudiant</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.mail#getAdresseMail <em>Adresse Mail</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.mail#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getmail()
 * @model
 * @generated
 */
public interface mail extends EObject {
	/**
	 * Returns the value of the '<em><b>Etudiant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etudiant</em>' reference.
	 * @see #setEtudiant(etudiant)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getmail_Etudiant()
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getMail
	 * @model opposite="mail"
	 * @generated
	 */
	etudiant getEtudiant();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.mail#getEtudiant <em>Etudiant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etudiant</em>' reference.
	 * @see #getEtudiant()
	 * @generated
	 */
	void setEtudiant(etudiant value);

	/**
	 * Returns the value of the '<em><b>Adresse Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse Mail</em>' attribute.
	 * @see #setAdresseMail(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getmail_AdresseMail()
	 * @model
	 * @generated
	 */
	String getAdresseMail();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.mail#getAdresseMail <em>Adresse Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse Mail</em>' attribute.
	 * @see #getAdresseMail()
	 * @generated
	 */
	void setAdresseMail(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getmail_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.mail#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // mail
