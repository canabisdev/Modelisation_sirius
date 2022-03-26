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

} // auteur
