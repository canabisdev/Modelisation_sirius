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
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.admin#getFormation <em>Formation</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.admin#getNameAdm <em>Name Adm</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.admin#getPasswordAdm <em>Password Adm</em>}</li>
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
	 * Returns the value of the '<em><b>Formation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.formation#getAdmin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formation</em>' reference.
	 * @see #setFormation(formation)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getadmin_Formation()
	 * @see fr.obeo.dsl.projet.groupeidm.formation#getAdmin
	 * @model opposite="admin"
	 * @generated
	 */
	formation getFormation();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.admin#getFormation <em>Formation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formation</em>' reference.
	 * @see #getFormation()
	 * @generated
	 */
	void setFormation(formation value);

	/**
	 * Returns the value of the '<em><b>Name Adm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Adm</em>' attribute.
	 * @see #setNameAdm(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getadmin_NameAdm()
	 * @model
	 * @generated
	 */
	String getNameAdm();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.admin#getNameAdm <em>Name Adm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Adm</em>' attribute.
	 * @see #getNameAdm()
	 * @generated
	 */
	void setNameAdm(String value);

	/**
	 * Returns the value of the '<em><b>Password Adm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Adm</em>' attribute.
	 * @see #setPasswordAdm(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getadmin_PasswordAdm()
	 * @model
	 * @generated
	 */
	String getPasswordAdm();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.admin#getPasswordAdm <em>Password Adm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Adm</em>' attribute.
	 * @see #getPasswordAdm()
	 * @generated
	 */
	void setPasswordAdm(String value);

} // admin
