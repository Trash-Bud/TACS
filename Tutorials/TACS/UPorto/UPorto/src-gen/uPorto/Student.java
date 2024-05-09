/**
 */
package uPorto;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uPorto.Student#getName <em>Name</em>}</li>
 *   <li>{@link uPorto.Student#getNumber <em>Number</em>}</li>
 *   <li>{@link uPorto.Student#getEmail <em>Email</em>}</li>
 *   <li>{@link uPorto.Student#getGender <em>Gender</em>}</li>
 *   <li>{@link uPorto.Student#getDate_of_birth <em>Date of birth</em>}</li>
 *   <li>{@link uPorto.Student#getMarital_status <em>Marital status</em>}</li>
 * </ul>
 *
 * @see uPorto.UPortoPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uPorto.UPortoPackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uPorto.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see uPorto.UPortoPackage#getStudent_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link uPorto.Student#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see uPorto.UPortoPackage#getStudent_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link uPorto.Student#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see #setGender(String)
	 * @see uPorto.UPortoPackage#getStudent_Gender()
	 * @model
	 * @generated
	 */
	String getGender();

	/**
	 * Sets the value of the '{@link uPorto.Student#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(String value);

	/**
	 * Returns the value of the '<em><b>Date of birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date of birth</em>' attribute.
	 * @see #setDate_of_birth(Date)
	 * @see uPorto.UPortoPackage#getStudent_Date_of_birth()
	 * @model
	 * @generated
	 */
	Date getDate_of_birth();

	/**
	 * Sets the value of the '{@link uPorto.Student#getDate_of_birth <em>Date of birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date of birth</em>' attribute.
	 * @see #getDate_of_birth()
	 * @generated
	 */
	void setDate_of_birth(Date value);

	/**
	 * Returns the value of the '<em><b>Marital status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marital status</em>' attribute.
	 * @see #setMarital_status(String)
	 * @see uPorto.UPortoPackage#getStudent_Marital_status()
	 * @model
	 * @generated
	 */
	String getMarital_status();

	/**
	 * Sets the value of the '{@link uPorto.Student#getMarital_status <em>Marital status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marital status</em>' attribute.
	 * @see #getMarital_status()
	 * @generated
	 */
	void setMarital_status(String value);

} // Student
