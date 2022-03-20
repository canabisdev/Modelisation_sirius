/**
 */
package fr.obeo.dsl.projet.groupeidm;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.formation#getAdmin <em>Admin</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.formation#getModule <em>Module</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.formation#getNameFrm <em>Name Frm</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.formation#getType <em>Type</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.formation#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getformation()
 * @model
 * @generated
 */
public interface formation extends EObject {
	/**
	 * Returns the value of the '<em><b>Admin</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.admin#getFormation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin</em>' reference.
	 * @see #setAdmin(admin)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getformation_Admin()
	 * @see fr.obeo.dsl.projet.groupeidm.admin#getFormation
	 * @model opposite="formation"
	 * @generated
	 */
	admin getAdmin();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.formation#getAdmin <em>Admin</em>}' reference.
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
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getformation_Module()
	 * @see fr.obeo.dsl.projet.groupeidm.module#getFromation
	 * @model opposite="fromation"
	 * @generated
	 */
	module getModule();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.formation#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(module value);

	/**
	 * Returns the value of the '<em><b>Name Frm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Frm</em>' attribute.
	 * @see #setNameFrm(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getformation_NameFrm()
	 * @model
	 * @generated
	 */
	String getNameFrm();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.formation#getNameFrm <em>Name Frm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Frm</em>' attribute.
	 * @see #getNameFrm()
	 * @generated
	 */
	void setNameFrm(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getformation_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.formation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Date)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getformation_Duration()
	 * @model
	 * @generated
	 */
	Date getDuration();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.formation#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Date value);

} // formation
