/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.repository#getEtudiant <em>Etudiant</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.repository#getNameRp <em>Name Rp</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getrepository()
 * @model
 * @generated
 */
public interface repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Etudiant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.etudiant#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etudiant</em>' reference.
	 * @see #setEtudiant(etudiant)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getrepository_Etudiant()
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant#getRepository
	 * @model opposite="repository"
	 * @generated
	 */
	etudiant getEtudiant();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.repository#getEtudiant <em>Etudiant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etudiant</em>' reference.
	 * @see #getEtudiant()
	 * @generated
	 */
	void setEtudiant(etudiant value);

	/**
	 * Returns the value of the '<em><b>Name Rp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Rp</em>' attribute.
	 * @see #setNameRp(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getrepository_NameRp()
	 * @model
	 * @generated
	 */
	String getNameRp();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.repository#getNameRp <em>Name Rp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Rp</em>' attribute.
	 * @see #getNameRp()
	 * @generated
	 */
	void setNameRp(String value);

} // repository
