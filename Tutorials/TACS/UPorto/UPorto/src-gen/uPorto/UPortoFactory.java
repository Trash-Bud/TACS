/**
 */
package uPorto;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uPorto.UPortoPackage
 * @generated
 */
public interface UPortoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UPortoFactory eINSTANCE = uPorto.impl.UPortoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>University</em>'.
	 * @generated
	 */
	University createUniversity();

	/**
	 * Returns a new object of class '<em>Faculty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Faculty</em>'.
	 * @generated
	 */
	Faculty createFaculty();

	/**
	 * Returns a new object of class '<em>Degree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Degree</em>'.
	 * @generated
	 */
	Degree createDegree();

	/**
	 * Returns a new object of class '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professor</em>'.
	 * @generated
	 */
	Professor createProfessor();

	/**
	 * Returns a new object of class '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Department</em>'.
	 * @generated
	 */
	Department createDepartment();

	/**
	 * Returns a new object of class '<em>Edition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edition</em>'.
	 * @generated
	 */
	Edition createEdition();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	Student createStudent();

	/**
	 * Returns a new object of class '<em>Grade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grade</em>'.
	 * @generated
	 */
	Grade createGrade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UPortoPackage getUPortoPackage();

} //UPortoFactory
