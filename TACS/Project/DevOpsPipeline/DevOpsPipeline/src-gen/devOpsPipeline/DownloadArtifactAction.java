/**
 */
package devOpsPipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Download Artifact Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOpsPipeline.DownloadArtifactAction#getName <em>Name</em>}</li>
 *   <li>{@link devOpsPipeline.DownloadArtifactAction#getUploadartifactaction <em>Uploadartifactaction</em>}</li>
 * </ul>
 *
 * @see devOpsPipeline.DevOpsPipelinePackage#getDownloadArtifactAction()
 * @model
 * @generated
 */
public interface DownloadArtifactAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getDownloadArtifactAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link devOpsPipeline.DownloadArtifactAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uploadartifactaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uploadartifactaction</em>' reference.
	 * @see #setUploadartifactaction(UploadArtifactAction)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getDownloadArtifactAction_Uploadartifactaction()
	 * @model required="true"
	 * @generated
	 */
	UploadArtifactAction getUploadartifactaction();

	/**
	 * Sets the value of the '{@link devOpsPipeline.DownloadArtifactAction#getUploadartifactaction <em>Uploadartifactaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uploadartifactaction</em>' reference.
	 * @see #getUploadartifactaction()
	 * @generated
	 */
	void setUploadartifactaction(UploadArtifactAction value);

} // DownloadArtifactAction
