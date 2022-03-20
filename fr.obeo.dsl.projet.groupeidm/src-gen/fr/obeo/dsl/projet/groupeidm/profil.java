/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>profil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.profil#getAvatar <em>Avatar</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.profil#getCity <em>City</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.profil#getTel <em>Tel</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getprofil()
 * @model
 * @generated
 */
public interface profil extends EObject {

	/**
	 * Returns the value of the '<em><b>Avatar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avatar</em>' attribute.
	 * @see #setAvatar(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getprofil_Avatar()
	 * @model
	 * @generated
	 */
	String getAvatar();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.profil#getAvatar <em>Avatar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avatar</em>' attribute.
	 * @see #getAvatar()
	 * @generated
	 */
	void setAvatar(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getprofil_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.profil#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Tel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tel</em>' attribute.
	 * @see #setTel(int)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getprofil_Tel()
	 * @model
	 * @generated
	 */
	int getTel();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.profil#getTel <em>Tel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tel</em>' attribute.
	 * @see #getTel()
	 * @generated
	 */
	void setTel(int value);
} // profil
