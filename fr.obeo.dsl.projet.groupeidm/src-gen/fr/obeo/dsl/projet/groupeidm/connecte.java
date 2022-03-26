/**
 */
package fr.obeo.dsl.projet.groupeidm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>connecte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.connecte#getTracking <em>Tracking</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getconnecte()
 * @model
 * @generated
 */
public interface connecte extends etudiant {
	/**
	 * Returns the value of the '<em><b>Tracking</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.tracking#getConnecte <em>Connecte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking</em>' reference.
	 * @see #setTracking(tracking)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getconnecte_Tracking()
	 * @see fr.obeo.dsl.projet.groupeidm.tracking#getConnecte
	 * @model opposite="connecte"
	 * @generated
	 */
	tracking getTracking();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.connecte#getTracking <em>Tracking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking</em>' reference.
	 * @see #getTracking()
	 * @generated
	 */
	void setTracking(tracking value);

} // connecte
