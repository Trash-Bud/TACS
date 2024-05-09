/**
 */
package uPorto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Faculty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uPorto.Faculty#getName <em>Name</em>}</li>
 *   <li>{@link uPorto.Faculty#getAddress <em>Address</em>}</li>
 *   <li>{@link uPorto.Faculty#getDegree <em>Degree</em>}</li>
 *   <li>{@link uPorto.Faculty#getProfessor <em>Professor</em>}</li>
 *   <li>{@link uPorto.Faculty#getDepartment <em>Department</em>}</li>
 *   <li>{@link uPorto.Faculty#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link uPorto.Faculty#getPolo <em>Polo</em>}</li>
 *   <li>{@link uPorto.Faculty#getPhone <em>Phone</em>}</li>
 *   <li>{@link uPorto.Faculty#getEmail <em>Email</em>}</li>
 *   <li>{@link uPorto.Faculty#getWebsite <em>Website</em>}</li>
 * </ul>
 *
 * @see uPorto.UPortoPackage#getFaculty()
 * @model
 * @generated
 */
public interface Faculty extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uPorto.UPortoPackage#getFaculty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uPorto.Faculty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see uPorto.UPortoPackage#getFaculty_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link uPorto.Faculty#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' containment reference list.
	 * The list contents are of type {@link uPorto.Degree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' containment reference list.
	 * @see uPorto.UPortoPackage#getFaculty_Degree()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Degree> getDegree();

	/**
	 * Returns the value of the '<em><b>Professor</b></em>' containment reference list.
	 * The list contents are of type {@link uPorto.Professor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professor</em>' containment reference list.
	 * @see uPorto.UPortoPackage#getFaculty_Professor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Professor> getProfessor();

	/**
	 * Returns the value of the '<em><b>Department</b></em>' containment reference list.
	 * The list contents are of type {@link uPorto.Department}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' containment reference list.
	 * @see uPorto.UPortoPackage#getFaculty_Department()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Department> getDepartment();

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acronym</em>' attribute.
	 * @see #setAcronym(String)
	 * @see uPorto.UPortoPackage#getFaculty_Acronym()
	 * @model
	 * @generated
	 */
	String getAcronym();

	/**
	 * Sets the value of the '{@link uPorto.Faculty#getAcronym <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acronym</em>' attribute.
	 * @see #getAcronym()
	 * @generated
	 */
	void setAcronym(String value);

	/**
	 * Returns the value of the '<em><b>Polo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polo</em>' attribute.
	 * @see #setPolo(String)
	 * @see uPorto.UPortoPackage#getFaculty_Polo()
	 * @model
	 * @generated
	 */
	String getPolo();

	/**
	 * Sets the value of the '{@link uPorto.Faculty#getPolo <em>Polo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polo</em>' attribute.
	 * @see #getPolo()
	 * @generated
	 */
	void setPolo(String value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(int)
	 * @see uPorto.UPortoPackage#getFaculty_Phone()
	 * @model
	 * @generated
	 */
	int getPhone();

	/**
	 * Sets the value of the '{@link uPorto.Faculty#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(int value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see uPorto.UPortoPackage#getFaculty_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link uPorto.Faculty#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website</em>' attribute.
	 * @see #setWebsite(String)
	 * @see uPorto.UPortoPackage#getFaculty_Website()
	 * @model
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link uPorto.Faculty#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

} // Faculty
