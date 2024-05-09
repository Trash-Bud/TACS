/**
 */
package devOpsPipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOpsPipeline.Branch#getName <em>Name</em>}</li>
 *   <li>{@link devOpsPipeline.Branch#isOnPush <em>On Push</em>}</li>
 *   <li>{@link devOpsPipeline.Branch#isMerge <em>Merge</em>}</li>
 * </ul>
 *
 * @see devOpsPipeline.DevOpsPipelinePackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getBranch_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link devOpsPipeline.Branch#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>On Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Push</em>' attribute.
	 * @see #setOnPush(boolean)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getBranch_OnPush()
	 * @model
	 * @generated
	 */
	boolean isOnPush();

	/**
	 * Sets the value of the '{@link devOpsPipeline.Branch#isOnPush <em>On Push</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Push</em>' attribute.
	 * @see #isOnPush()
	 * @generated
	 */
	void setOnPush(boolean value);

	/**
	 * Returns the value of the '<em><b>Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge</em>' attribute.
	 * @see #setMerge(boolean)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getBranch_Merge()
	 * @model
	 * @generated
	 */
	boolean isMerge();

	/**
	 * Sets the value of the '{@link devOpsPipeline.Branch#isMerge <em>Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge</em>' attribute.
	 * @see #isMerge()
	 * @generated
	 */
	void setMerge(boolean value);

} // Branch
