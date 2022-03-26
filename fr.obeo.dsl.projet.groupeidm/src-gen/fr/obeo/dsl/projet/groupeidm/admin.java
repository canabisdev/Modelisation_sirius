/**
 */
package fr.obeo.dsl.projet.groupeidm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.admin#getGroupe <em>Groupe</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.admin#getFromation <em>Fromation</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getadmin()
 * @model
 * @generated
 */
public interface admin extends membre {
	/**
	 * Returns the value of the '<em><b>Groupe</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.groupe#getAdmin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupe</em>' reference.
	 * @see #setGroupe(groupe)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getadmin_Groupe()
	 * @see fr.obeo.dsl.projet.groupeidm.groupe#getAdmin
	 * @model opposite="admin"
	 * @generated
	 */
	groupe getGroupe();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.admin#getGroupe <em>Groupe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groupe</em>' reference.
	 * @see #getGroupe()
	 * @generated
	 */
	void setGroupe(groupe value);

	/**
	 * Returns the value of the '<em><b>Fromation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.fromation#getAdmin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fromation</em>' reference.
	 * @see #setFromation(fromation)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getadmin_Fromation()
	 * @see fr.obeo.dsl.projet.groupeidm.fromation#getAdmin
	 * @model opposite="admin"
	 * @generated
	 */
	fromation getFromation();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.admin#getFromation <em>Fromation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fromation</em>' reference.
	 * @see #getFromation()
	 * @generated
	 */
	void setFromation(fromation value);

} // admin
