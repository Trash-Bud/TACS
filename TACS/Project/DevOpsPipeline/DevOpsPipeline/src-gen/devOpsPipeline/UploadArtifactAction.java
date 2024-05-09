/**
 */
package devOpsPipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upload Artifact Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOpsPipeline.UploadArtifactAction#getName <em>Name</em>}</li>
 *   <li>{@link devOpsPipeline.UploadArtifactAction#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link devOpsPipeline.UploadArtifactAction#getPath <em>Path</em>}</li>
 *   <li>{@link devOpsPipeline.UploadArtifactAction#getJob <em>Job</em>}</li>
 * </ul>
 *
 * @see devOpsPipeline.DevOpsPipelinePackage#getUploadArtifactAction()
 * @model
 * @generated
 */
public interface UploadArtifactAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getUploadArtifactAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link devOpsPipeline.UploadArtifactAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Name</em>' attribute.
	 * @see #setArtifactName(String)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getUploadArtifactAction_ArtifactName()
	 * @model
	 * @generated
	 */
	String getArtifactName();

	/**
	 * Sets the value of the '{@link devOpsPipeline.UploadArtifactAction#getArtifactName <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Name</em>' attribute.
	 * @see #getArtifactName()
	 * @generated
	 */
	void setArtifactName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getUploadArtifactAction_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link devOpsPipeline.UploadArtifactAction#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Job</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' reference.
	 * @see #setJob(Job)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getUploadArtifactAction_Job()
	 * @model required="true"
	 * @generated
	 */
	Job getJob();

	/**
	 * Sets the value of the '{@link devOpsPipeline.UploadArtifactAction#getJob <em>Job</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' reference.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(Job value);

} // UploadArtifactAction
