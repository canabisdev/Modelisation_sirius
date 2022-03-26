/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>fromation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.fromation#getAdmin <em>Admin</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.fromation#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getfromation()
 * @model
 * @generated
 */
public interface fromation extends EObject {
	/**
	 * Returns the value of the '<em><b>Admin</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.admin#getFromation <em>Fromation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin</em>' reference.
	 * @see #setAdmin(admin)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getfromation_Admin()
	 * @see fr.obeo.dsl.projet.groupeidm.admin#getFromation
	 * @model opposite="fromation"
	 * @generated
	 */
	admin getAdmin();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.fromation#getAdmin <em>Admin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin</em>' reference.
	 * @see #getAdmin()
	 * @generated
	 */
	void setAdmin(admin value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.module#getFromation <em>Fromation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(module)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getfromation_Module()
	 * @see fr.obeo.dsl.projet.groupeidm.module#getFromation
	 * @model opposite="fromation"
	 * @generated
	 */
	module getModule();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.fromation#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(module value);

} // fromation
