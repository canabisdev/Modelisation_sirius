/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tracking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.tracking#getModule <em>Module</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.tracking#getChapitre <em>Chapitre</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.tracking#getConnecte <em>Connecte</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.tracking#getTuteur <em>Tuteur</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettracking()
 * @model
 * @generated
 */
public interface tracking extends EObject {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.module#getTracking <em>Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(module)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettracking_Module()
	 * @see fr.obeo.dsl.projet.groupeidm.module#getTracking
	 * @model opposite="tracking"
	 * @generated
	 */
	module getModule();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.tracking#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(module value);

	/**
	 * Returns the value of the '<em><b>Chapitre</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.chapitre#getTracking <em>Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chapitre</em>' reference.
	 * @see #setChapitre(chapitre)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettracking_Chapitre()
	 * @see fr.obeo.dsl.projet.groupeidm.chapitre#getTracking
	 * @model opposite="tracking"
	 * @generated
	 */
	chapitre getChapitre();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.tracking#getChapitre <em>Chapitre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chapitre</em>' reference.
	 * @see #getChapitre()
	 * @generated
	 */
	void setChapitre(chapitre value);

	/**
	 * Returns the value of the '<em><b>Connecte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.connecte#getTracking <em>Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connecte</em>' reference.
	 * @see #setConnecte(connecte)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettracking_Connecte()
	 * @see fr.obeo.dsl.projet.groupeidm.connecte#getTracking
	 * @model opposite="tracking"
	 * @generated
	 */
	connecte getConnecte();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.tracking#getConnecte <em>Connecte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connecte</em>' reference.
	 * @see #getConnecte()
	 * @generated
	 */
	void setConnecte(connecte value);

	/**
	 * Returns the value of the '<em><b>Tuteur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getTracking <em>Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuteur</em>' reference.
	 * @see #setTuteur(tuteur)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettracking_Tuteur()
	 * @see fr.obeo.dsl.projet.groupeidm.tuteur#getTracking
	 * @model opposite="tracking"
	 * @generated
	 */
	tuteur getTuteur();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.tracking#getTuteur <em>Tuteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuteur</em>' reference.
	 * @see #getTuteur()
	 * @generated
	 */
	void setTuteur(tuteur value);

} // tracking
