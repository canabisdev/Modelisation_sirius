/**
 */
package fr.obeo.dsl.projet.groupeidm.util;

import fr.obeo.dsl.projet.groupeidm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage
 * @generated
 */
public class GroupeidmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GroupeidmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupeidmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GroupeidmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupeidmSwitch<Adapter> modelSwitch = new GroupeidmSwitch<Adapter>() {
		@Override
		public Adapter casegroupe(groupe object) {
			return creategroupeAdapter();
		}

		@Override
		public Adapter caseadmin(admin object) {
			return createadminAdapter();
		}

		@Override
		public Adapter caseauteur(auteur object) {
			return createauteurAdapter();
		}

		@Override
		public Adapter casemembre(membre object) {
			return createmembreAdapter();
		}

		@Override
		public Adapter casefromation(fromation object) {
			return createfromationAdapter();
		}

		@Override
		public Adapter casetuteur(tuteur object) {
			return createtuteurAdapter();
		}

		@Override
		public Adapter caseforum(forum object) {
			return createforumAdapter();
		}

		@Override
		public Adapter casechat(chat object) {
			return createchatAdapter();
		}

		@Override
		public Adapter casemail(mail object) {
			return createmailAdapter();
		}

		@Override
		public Adapter caserepository(repository object) {
			return createrepositoryAdapter();
		}

		@Override
		public Adapter casechapitre(chapitre object) {
			return createchapitreAdapter();
		}

		@Override
		public Adapter casemodule(module object) {
			return createmoduleAdapter();
		}

		@Override
		public Adapter casepage(page object) {
			return createpageAdapter();
		}

		@Override
		public Adapter casetracking(tracking object) {
			return createtrackingAdapter();
		}

		@Override
		public Adapter caseetudiant(etudiant object) {
			return createetudiantAdapter();
		}

		@Override
		public Adapter caseconnecte(connecte object) {
			return createconnecteAdapter();
		}

		@Override
		public Adapter caseprofil(profil object) {
			return createprofilAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.groupe <em>groupe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.groupe
	 * @generated
	 */
	public Adapter creategroupeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.admin <em>admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.admin
	 * @generated
	 */
	public Adapter createadminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.auteur <em>auteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.auteur
	 * @generated
	 */
	public Adapter createauteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.membre <em>membre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.membre
	 * @generated
	 */
	public Adapter createmembreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.fromation <em>fromation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.fromation
	 * @generated
	 */
	public Adapter createfromationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.tuteur <em>tuteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.tuteur
	 * @generated
	 */
	public Adapter createtuteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.forum <em>forum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.forum
	 * @generated
	 */
	public Adapter createforumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.chat <em>chat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.chat
	 * @generated
	 */
	public Adapter createchatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.mail <em>mail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.mail
	 * @generated
	 */
	public Adapter createmailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.repository <em>repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.repository
	 * @generated
	 */
	public Adapter createrepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.chapitre <em>chapitre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.chapitre
	 * @generated
	 */
	public Adapter createchapitreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.module <em>module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.module
	 * @generated
	 */
	public Adapter createmoduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.page <em>page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.page
	 * @generated
	 */
	public Adapter createpageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.tracking <em>tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.tracking
	 * @generated
	 */
	public Adapter createtrackingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.etudiant <em>etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.etudiant
	 * @generated
	 */
	public Adapter createetudiantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.connecte <em>connecte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.connecte
	 * @generated
	 */
	public Adapter createconnecteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.projet.groupeidm.profil <em>profil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.projet.groupeidm.profil
	 * @generated
	 */
	public Adapter createprofilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GroupeidmAdapterFactory
