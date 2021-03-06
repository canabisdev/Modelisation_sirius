/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.module#getFromation <em>Fromation</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.module#getAuteur <em>Auteur</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.module#getChapitre <em>Chapitre</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.module#getTracking <em>Tracking</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.module#getCoeff <em>Coeff</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.module#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getmodule()
 * @model
 * @generated
 */
public interface module extends EObject {
	/**
	 * Returns the value of the '<em><b>Fromation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.formation#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fromation</em>' reference.
	 * @see #setFromation(formation)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getmodule_Fromation()
	 * @see fr.obeo.dsl.projet.groupeidm.formation#getModule
	 * @model opposite="module"
	 * @generated
	 */
	formation getFromation();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.module#getFromation <em>Fromation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fromation</em>' reference.
	 * @see #getFromation()
	 * @generated
	 */
	void setFromation(formation value);

	/**
	 * Returns the value of the '<em><b>Auteur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.auteur#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auteur</em>' reference.
	 * @see #setAuteur(auteur)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getmodule_Auteur()
	 * @see fr.obeo.dsl.projet.groupeidm.auteur#getModule
	 * @model opposite="module"
	 * @generated
	 */
	auteur getAuteur();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.module#getAuteur <em>Auteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auteur</em>' reference.
	 * @see #getAuteur()
	 * @generated
	 */
	void setAuteur(auteur value);

	/**
	 * Returns the value of the '<em><b>Chapitre</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.projet.groupeidm.chapitre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chapitre</em>' containment reference list.
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getmodule_Chapitre()
	 * @model containment="true"
	 * @generated
	 */
	EList<chapitre> getChapitre();

	/**
	 * Returns the value of the '<em><b>Tracking</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.tracking#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking</em>' reference.
	 * @see #setTracking(tracking)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getmodule_Tracking()
	 * @see fr.obeo.dsl.projet.groupeidm.tracking#getModule
	 * @model opposite="module"
	 * @generated
	 */
	tracking getTracking();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.module#getTracking <em>Tracking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking</em>' reference.
	 * @see #getTracking()
	 * @generated
	 */
	void setTracking(tracking value);

	/**
	 * Returns the value of the '<em><b>Coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coeff</em>' attribute.
	 * @see #setCoeff(int)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getmodule_Coeff()
	 * @model
	 * @generated
	 */
	int getCoeff();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.module#getCoeff <em>Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coeff</em>' attribute.
	 * @see #getCoeff()
	 * @generated
	 */
	void setCoeff(int value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getmodule_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.module#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

} // module
