/**
 */
package fr.obeo.dsl.projet.groupeidm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage
 * @generated
 */
public interface GroupeidmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GroupeidmFactory eINSTANCE = fr.obeo.dsl.projet.groupeidm.impl.GroupeidmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>groupe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>groupe</em>'.
	 * @generated
	 */
	groupe creategroupe();

	/**
	 * Returns a new object of class '<em>admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>admin</em>'.
	 * @generated
	 */
	admin createadmin();

	/**
	 * Returns a new object of class '<em>auteur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>auteur</em>'.
	 * @generated
	 */
	auteur createauteur();

	/**
	 * Returns a new object of class '<em>membre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>membre</em>'.
	 * @generated
	 */
	membre createmembre();

	/**
	 * Returns a new object of class '<em>formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>formation</em>'.
	 * @generated
	 */
	formation createformation();

	/**
	 * Returns a new object of class '<em>tuteur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tuteur</em>'.
	 * @generated
	 */
	tuteur createtuteur();

	/**
	 * Returns a new object of class '<em>forum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>forum</em>'.
	 * @generated
	 */
	forum createforum();

	/**
	 * Returns a new object of class '<em>chat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>chat</em>'.
	 * @generated
	 */
	chat createchat();

	/**
	 * Returns a new object of class '<em>mail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>mail</em>'.
	 * @generated
	 */
	mail createmail();

	/**
	 * Returns a new object of class '<em>repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>repository</em>'.
	 * @generated
	 */
	repository createrepository();

	/**
	 * Returns a new object of class '<em>chapitre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>chapitre</em>'.
	 * @generated
	 */
	chapitre createchapitre();

	/**
	 * Returns a new object of class '<em>module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>module</em>'.
	 * @generated
	 */
	module createmodule();

	/**
	 * Returns a new object of class '<em>page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>page</em>'.
	 * @generated
	 */
	page createpage();

	/**
	 * Returns a new object of class '<em>tracking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tracking</em>'.
	 * @generated
	 */
	tracking createtracking();

	/**
	 * Returns a new object of class '<em>etudiant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>etudiant</em>'.
	 * @generated
	 */
	etudiant createetudiant();

	/**
	 * Returns a new object of class '<em>connecte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>connecte</em>'.
	 * @generated
	 */
	connecte createconnecte();

	/**
	 * Returns a new object of class '<em>profil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>profil</em>'.
	 * @generated
	 */
	profil createprofil();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GroupeidmPackage getGroupeidmPackage();

} //GroupeidmFactory
