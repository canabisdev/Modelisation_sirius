/**
 */
package fr.obeo.dsl.projet.groupeidm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>auteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.auteur#getModule <em>Module</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.auteur#getNameAtr <em>Name Atr</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getauteur()
 * @model
 * @generated
 */
public interface auteur extends membre {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.module#getAuteur <em>Auteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(module)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getauteur_Module()
	 * @see fr.obeo.dsl.projet.groupeidm.module#getAuteur
	 * @model opposite="auteur"
	 * @generated
	 */
	module getModule();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.auteur#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(module value);

	/**
	 * Returns the value of the '<em><b>Name Atr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Atr</em>' attribute.
	 * @see #setNameAtr(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getauteur_NameAtr()
	 * @model
	 * @generated
	 */
	String getNameAtr();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.auteur#getNameAtr <em>Name Atr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Atr</em>' attribute.
	 * @see #getNameAtr()
	 * @generated
	 */
	void setNameAtr(String value);

} // auteur
