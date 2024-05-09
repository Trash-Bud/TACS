/**
 */
package uPorto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uPorto.Degree#getName <em>Name</em>}</li>
 *   <li>{@link uPorto.Degree#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link uPorto.Degree#getAcademic_degree <em>Academic degree</em>}</li>
 *   <li>{@link uPorto.Degree#getType_of_course <em>Type of course</em>}</li>
 *   <li>{@link uPorto.Degree#getOfficial_code <em>Official code</em>}</li>
 *   <li>{@link uPorto.Degree#getStart <em>Start</em>}</li>
 *   <li>{@link uPorto.Degree#getDuration <em>Duration</em>}</li>
 *   <li>{@link uPorto.Degree#getCourse <em>Course</em>}</li>
 *   <li>{@link uPorto.Degree#getDirector <em>Director</em>}</li>
 *   <li>{@link uPorto.Degree#getAssistant_director <em>Assistant director</em>}</li>
 * </ul>
 *
 * @see uPorto.UPortoPackage#getDegree()
 * @model
 * @generated
 */
public interface Degree extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uPorto.UPortoPackage#getDegree_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uPorto.Degree#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acronym</em>' attribute.
	 * @see #setAcronym(String)
	 * @see uPorto.UPortoPackage#getDegree_Acronym()
	 * @model
	 * @generated
	 */
	String getAcronym();

	/**
	 * Sets the value of the '{@link uPorto.Degree#getAcronym <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acronym</em>' attribute.
	 * @see #getAcronym()
	 * @generated
	 */
	void setAcronym(String value);

	/**
	 * Returns the value of the '<em><b>Academic degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Academic degree</em>' attribute.
	 * @see #setAcademic_degree(String)
	 * @see uPorto.UPortoPackage#getDegree_Academic_degree()
	 * @model
	 * @generated
	 */
	String getAcademic_degree();

	/**
	 * Sets the value of the '{@link uPorto.Degree#getAcademic_degree <em>Academic degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Academic degree</em>' attribute.
	 * @see #getAcademic_degree()
	 * @generated
	 */
	void setAcademic_degree(String value);

	/**
	 * Returns the value of the '<em><b>Type of course</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type of course</em>' attribute.
	 * @see #setType_of_course(String)
	 * @see uPorto.UPortoPackage#getDegree_Type_of_course()
	 * @model
	 * @generated
	 */
	String getType_of_course();

	/**
	 * Sets the value of the '{@link uPorto.Degree#getType_of_course <em>Type of course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type of course</em>' attribute.
	 * @see #getType_of_course()
	 * @generated
	 */
	void setType_of_course(String value);

	/**
	 * Returns the value of the '<em><b>Official code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Official code</em>' attribute.
	 * @see #setOfficial_code(String)
	 * @see uPorto.UPortoPackage#getDegree_Official_code()
	 * @model
	 * @generated
	 */
	String getOfficial_code();

	/**
	 * Sets the value of the '{@link uPorto.Degree#getOfficial_code <em>Official code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Official code</em>' attribute.
	 * @see #getOfficial_code()
	 * @generated
	 */
	void setOfficial_code(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(String)
	 * @see uPorto.UPortoPackage#getDegree_Start()
	 * @model
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link uPorto.Degree#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see uPorto.UPortoPackage#getDegree_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link uPorto.Degree#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link uPorto.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see uPorto.UPortoPackage#getDegree_Course()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>Director</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Director</em>' reference.
	 * @see #setDirector(Professor)
	 * @see uPorto.UPortoPackage#getDegree_Director()
	 * @model required="true"
	 * @generated
	 */
	Professor getDirector();

	/**
	 * Sets the value of the '{@link uPorto.Degree#getDirector <em>Director</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Director</em>' reference.
	 * @see #getDirector()
	 * @generated
	 */
	void setDirector(Professor value);

	/**
	 * Returns the value of the '<em><b>Assistant director</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assistant director</em>' reference.
	 * @see #setAssistant_director(Professor)
	 * @see uPorto.UPortoPackage#getDegree_Assistant_director()
	 * @model required="true"
	 * @generated
	 */
	Professor getAssistant_director();

	/**
	 * Sets the value of the '{@link uPorto.Degree#getAssistant_director <em>Assistant director</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assistant director</em>' reference.
	 * @see #getAssistant_director()
	 * @generated
	 */
	void setAssistant_director(Professor value);

} // Degree
