/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>chapitre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.chapitre#getPage <em>Page</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.chapitre#getTracking <em>Tracking</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getchapitre()
 * @model
 * @generated
 */
public interface chapitre extends EObject {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.projet.groupeidm.page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getchapitre_Page()
	 * @model containment="true"
	 * @generated
	 */
	EList<page> getPage();

	/**
	 * Returns the value of the '<em><b>Tracking</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.tracking#getChapitre <em>Chapitre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking</em>' reference.
	 * @see #setTracking(tracking)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getchapitre_Tracking()
	 * @see fr.obeo.dsl.projet.groupeidm.tracking#getChapitre
	 * @model opposite="chapitre"
	 * @generated
	 */
	tracking getTracking();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.chapitre#getTracking <em>Tracking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking</em>' reference.
	 * @see #getTracking()
	 * @generated
	 */
	void setTracking(tracking value);

} // chapitre
