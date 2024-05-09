/**
 */
package devOpsPipeline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOpsPipeline.Job#getDockerMachine <em>Docker Machine</em>}</li>
 *   <li>{@link devOpsPipeline.Job#getAction <em>Action</em>}</li>
 *   <li>{@link devOpsPipeline.Job#getName <em>Name</em>}</li>
 *   <li>{@link devOpsPipeline.Job#getToken <em>Token</em>}</li>
 *   <li>{@link devOpsPipeline.Job#getUploadartifactaction <em>Uploadartifactaction</em>}</li>
 *   <li>{@link devOpsPipeline.Job#getDownloadartifactaction <em>Downloadartifactaction</em>}</li>
 * </ul>
 *
 * @see devOpsPipeline.DevOpsPipelinePackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>Docker Machine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Machine</em>' attribute.
	 * @see #setDockerMachine(String)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getJob_DockerMachine()
	 * @model
	 * @generated
	 */
	String getDockerMachine();

	/**
	 * Sets the value of the '{@link devOpsPipeline.Job#getDockerMachine <em>Docker Machine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Machine</em>' attribute.
	 * @see #getDockerMachine()
	 * @generated
	 */
	void setDockerMachine(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link devOpsPipeline.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see devOpsPipeline.DevOpsPipelinePackage#getJob_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getJob_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link devOpsPipeline.Job#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' containment reference.
	 * @see #setToken(Token)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getJob_Token()
	 * @model containment="true"
	 * @generated
	 */
	Token getToken();

	/**
	 * Sets the value of the '{@link devOpsPipeline.Job#getToken <em>Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' containment reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Token value);

	/**
	 * Returns the value of the '<em><b>Uploadartifactaction</b></em>' containment reference list.
	 * The list contents are of type {@link devOpsPipeline.UploadArtifactAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uploadartifactaction</em>' containment reference list.
	 * @see devOpsPipeline.DevOpsPipelinePackage#getJob_Uploadartifactaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<UploadArtifactAction> getUploadartifactaction();

	/**
	 * Returns the value of the '<em><b>Downloadartifactaction</b></em>' containment reference list.
	 * The list contents are of type {@link devOpsPipeline.DownloadArtifactAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downloadartifactaction</em>' containment reference list.
	 * @see devOpsPipeline.DevOpsPipelinePackage#getJob_Downloadartifactaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<DownloadArtifactAction> getDownloadartifactaction();

} // Job
