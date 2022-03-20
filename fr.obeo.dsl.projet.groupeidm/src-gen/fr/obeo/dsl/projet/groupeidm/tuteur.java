/**
 */
package fr.obeo.dsl.projet.groupeidm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tuteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.tuteur#getTracking <em>Tracking</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.tuteur#getGroupe <em>Groupe</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.tuteur#getFirstNameTr <em>First Name Tr</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.tuteur#getLastNameTr <em>Last Name Tr</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.tuteur#getNumTr <em>Num Tr</em>}</li>
 *   <li>{@link fr.obeo.dsl.projet.groupeidm.tuteur#getMatiere <em>Matiere</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettuteur()
 * @model
 * @generated
 */
public interface tuteur extends membre {
	/**
	 * Returns the value of the '<em><b>Tracking</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.tracking#getTuteur <em>Tuteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking</em>' reference.
	 * @see #setTracking(tracking)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettuteur_Tracking()
	 * @see fr.obeo.dsl.projet.groupeidm.tracking#getTuteur
	 * @model opposite="tuteur"
	 * @generated
	 */
	tracking getTracking();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getTracking <em>Tracking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking</em>' reference.
	 * @see #getTracking()
	 * @generated
	 */
	void setTracking(tracking value);

	/**
	 * Returns the value of the '<em><b>Groupe</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.projet.groupeidm.groupe#getTuteur <em>Tuteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupe</em>' reference.
	 * @see #setGroupe(groupe)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettuteur_Groupe()
	 * @see fr.obeo.dsl.projet.groupeidm.groupe#getTuteur
	 * @model opposite="tuteur"
	 * @generated
	 */
	groupe getGroupe();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getGroupe <em>Groupe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groupe</em>' reference.
	 * @see #getGroupe()
	 * @generated
	 */
	void setGroupe(groupe value);

	/**
	 * Returns the value of the '<em><b>First Name Tr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name Tr</em>' attribute.
	 * @see #setFirstNameTr(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettuteur_FirstNameTr()
	 * @model
	 * @generated
	 */
	String getFirstNameTr();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getFirstNameTr <em>First Name Tr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name Tr</em>' attribute.
	 * @see #getFirstNameTr()
	 * @generated
	 */
	void setFirstNameTr(String value);

	/**
	 * Returns the value of the '<em><b>Last Name Tr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name Tr</em>' attribute.
	 * @see #setLastNameTr(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettuteur_LastNameTr()
	 * @model
	 * @generated
	 */
	String getLastNameTr();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getLastNameTr <em>Last Name Tr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name Tr</em>' attribute.
	 * @see #getLastNameTr()
	 * @generated
	 */
	void setLastNameTr(String value);

	/**
	 * Returns the value of the '<em><b>Num Tr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Tr</em>' attribute.
	 * @see #setNumTr(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettuteur_NumTr()
	 * @model
	 * @generated
	 */
	String getNumTr();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getNumTr <em>Num Tr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Tr</em>' attribute.
	 * @see #getNumTr()
	 * @generated
	 */
	void setNumTr(String value);

	/**
	 * Returns the value of the '<em><b>Matiere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matiere</em>' attribute.
	 * @see #setMatiere(String)
	 * @see fr.obeo.dsl.projet.groupeidm.GroupeidmPackage#gettuteur_Matiere()
	 * @model
	 * @generated
	 */
	String getMatiere();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.projet.groupeidm.tuteur#getMatiere <em>Matiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matiere</em>' attribute.
	 * @see #getMatiere()
	 * @generated
	 */
	void setMatiere(String value);

} // tuteur
