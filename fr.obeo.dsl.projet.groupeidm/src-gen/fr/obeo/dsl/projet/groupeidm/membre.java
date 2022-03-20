/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>membre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.membre#getCounts <em>Counts</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getmembre()
 * @model
 * @generated
 */
public interface membre extends EObject {

	/**
	 * Returns the value of the '<em><b>Counts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counts</em>' attribute.
	 * @see #setCounts(int)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#getmembre_Counts()
	 * @model
	 * @generated
	 */
	int getCounts();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.membre#getCounts <em>Counts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counts</em>' attribute.
	 * @see #getCounts()
	 * @generated
	 */
	void setCounts(int value);
} // membre
