/**
 */
package fr.obeo.dsl.projet.groupeidm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tuteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.tuteur#getTracking <em>Tracking</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.tuteur#getGroupe <em>Groupe</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettuteur()
 * @model
 * @generated
 */
public interface tuteur extends membre {
	/**
	 * Returns the value of the '<em><b>Tracking</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.tracking#getTuteur <em>Tuteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking</em>' reference.
	 * @see #setTracking(tracking)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettuteur_Tracking()
	 * @see fr.obeo.dsl.projet.groupeidm.tracking#getTuteur
	 * @model opposite="tuteur"
	 * @generated
	 */
	tracking getTracking();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getTracking <em>Tracking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking</em>' reference.
	 * @see #getTracking()
	 * @generated
	 */
	void setTracking(tracking value);

	/**
	 * Returns the value of the '<em><b>Groupe</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.groupe#getTuteur <em>Tuteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupe</em>' reference.
	 * @see #setGroupe(groupe)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettuteur_Groupe()
	 * @see fr.obeo.dsl.projet.groupeidm.groupe#getTuteur
	 * @model opposite="tuteur"
	 * @generated
	 */
	groupe getGroupe();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getGroupe <em>Groupe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groupe</em>' reference.
	 * @see #getGroupe()
	 * @generated
	 */
	void setGroupe(groupe value);

} // tuteur
