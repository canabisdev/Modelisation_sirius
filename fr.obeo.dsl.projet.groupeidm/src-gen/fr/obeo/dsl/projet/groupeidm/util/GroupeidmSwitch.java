/**
 */
package fr.obeo.dsl.projet.groupeidm.util;

import fr.obeo.dsl.projet.groupeidm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage
 * @generated
 */
public class GroupeidmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GroupeidmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupeidmSwitch() {
		if (modelPackage == null) {
			modelPackage = GroupeidmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GroupeidmPackage.GROUPE: {
			groupe groupe = (groupe) theEObject;
			T result = casegroupe(groupe);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.ADMIN: {
			admin admin = (admin) theEObject;
			T result = caseadmin(admin);
			if (result == null)
				result = casemembre(admin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.AUTEUR: {
			auteur auteur = (auteur) theEObject;
			T result = caseauteur(auteur);
			if (result == null)
				result = casemembre(auteur);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.MEMBRE: {
			membre membre = (membre) theEObject;
			T result = casemembre(membre);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.FROMATION: {
			fromation fromation = (fromation) theEObject;
			T result = casefromation(fromation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.TUTEUR: {
			tuteur tuteur = (tuteur) theEObject;
			T result = casetuteur(tuteur);
			if (result == null)
				result = casemembre(tuteur);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.FORUM: {
			forum forum = (forum) theEObject;
			T result = caseforum(forum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.CHAT: {
			chat chat = (chat) theEObject;
			T result = casechat(chat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.MAIL: {
			mail mail = (mail) theEObject;
			T result = casemail(mail);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.REPOSITORY: {
			repository repository = (repository) theEObject;
			T result = caserepository(repository);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.CHAPITRE: {
			chapitre chapitre = (chapitre) theEObject;
			T result = casechapitre(chapitre);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.MODULE: {
			module module = (module) theEObject;
			T result = casemodule(module);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.PAGE: {
			page page = (page) theEObject;
			T result = casepage(page);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.TRACKING: {
			tracking tracking = (tracking) theEObject;
			T result = casetracking(tracking);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.ETUDIANT: {
			etudiant etudiant = (etudiant) theEObject;
			T result = caseetudiant(etudiant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.CONNECTE: {
			connecte connecte = (connecte) theEObject;
			T result = caseconnecte(connecte);
			if (result == null)
				result = caseetudiant(connecte);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GroupeidmPackage.PROFIL: {
			profil profil = (profil) theEObject;
			T result = caseprofil(profil);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>groupe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>groupe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casegroupe(groupe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseadmin(admin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>auteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>auteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseauteur(auteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>membre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>membre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemembre(membre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>fromation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>fromation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefromation(fromation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tuteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tuteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetuteur(tuteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>forum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>forum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseforum(forum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>chat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>chat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casechat(chat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>mail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>mail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemail(mail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caserepository(repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>chapitre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>chapitre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casechapitre(chapitre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemodule(module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepage(page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tracking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tracking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetracking(tracking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>etudiant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>etudiant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseetudiant(etudiant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>connecte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>connecte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconnecte(connecte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>profil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>profil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseprofil(profil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GroupeidmSwitch
