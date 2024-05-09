/**
 */
package devOpsPipeline;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Repo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOpsPipeline.SourceRepo#getLocation <em>Location</em>}</li>
 *   <li>{@link devOpsPipeline.SourceRepo#getBranch <em>Branch</em>}</li>
 *   <li>{@link devOpsPipeline.SourceRepo#getJob <em>Job</em>}</li>
 *   <li>{@link devOpsPipeline.SourceRepo#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see devOpsPipeline.DevOpsPipelinePackage#getSourceRepo()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidLocation'"
 * @generated
 */
public interface SourceRepo extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getSourceRepo_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link devOpsPipeline.SourceRepo#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' containment reference list.
	 * The list contents are of type {@link devOpsPipeline.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' containment reference list.
	 * @see devOpsPipeline.DevOpsPipelinePackage#getSourceRepo_Branch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Branch> getBranch();

	/**
	 * Returns the value of the '<em><b>Job</b></em>' containment reference list.
	 * The list contents are of type {@link devOpsPipeline.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' containment reference list.
	 * @see devOpsPipeline.DevOpsPipelinePackage#getSourceRepo_Job()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Job> getJob();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getSourceRepo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link devOpsPipeline.SourceRepo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void pushCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void commitChanges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createBranch();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createTrigger();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void mergeTrigger();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void notifyChanges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.location-&gt;isEmpty() or (self.location.matches(\'^(https?|ftp)://[\\\\S/$.?#][\\\\S]*$\') or self.location.matches(\'^(\\\\.\\\\./|\\\\./)?(?:[\\\\w-]+/)*[\\\\w-]+(\\\\.[\\\\w-]+)?$\') or self.location.matches(\'^/[^/].*\'))'"
	 * @generated
	 */
	boolean ValidLocation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SourceRepo
