/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>forum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.forum#getEtudiant <em>Etudiant</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.forum#getNameFrm <em>Name Frm</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.forum#getContenuFrm <em>Contenu Frm</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getforum()
 * @model
 * @generated
 */
public interface forum extends EObject {
	/**
	 * Returns the value of the '<em><b>Etudiant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getForum <em>Forum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etudiant</em>' reference.
	 * @see #setEtudiant(etudiant)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getforum_Etudiant()
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getForum
	 * @model opposite="forum"
	 * @generated
	 */
	etudiant getEtudiant();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.forum#getEtudiant <em>Etudiant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etudiant</em>' reference.
	 * @see #getEtudiant()
	 * @generated
	 */
	void setEtudiant(etudiant value);

	/**
	 * Returns the value of the '<em><b>Name Frm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Frm</em>' attribute.
	 * @see #setNameFrm(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getforum_NameFrm()
	 * @model
	 * @generated
	 */
	String getNameFrm();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.forum#getNameFrm <em>Name Frm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Frm</em>' attribute.
	 * @see #getNameFrm()
	 * @generated
	 */
	void setNameFrm(String value);

	/**
	 * Returns the value of the '<em><b>Contenu Frm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu Frm</em>' attribute.
	 * @see #setContenuFrm(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getforum_ContenuFrm()
	 * @model
	 * @generated
	 */
	String getContenuFrm();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.forum#getContenuFrm <em>Contenu Frm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu Frm</em>' attribute.
	 * @see #getContenuFrm()
	 * @generated
	 */
	void setContenuFrm(String value);

} // forum
