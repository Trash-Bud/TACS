/**
 */
package devOpsPipeline;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see devOpsPipeline.DevOpsPipelineFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface DevOpsPipelinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "devOpsPipeline";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/devOpsPipeline";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "devOpsPipeline";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevOpsPipelinePackage eINSTANCE = devOpsPipeline.impl.DevOpsPipelinePackageImpl.init();

	/**
	 * The meta object id for the '{@link devOpsPipeline.impl.SourceRepoImpl <em>Source Repo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOpsPipeline.impl.SourceRepoImpl
	 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getSourceRepo()
	 * @generated
	 */
	int SOURCE_REPO = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REPO__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REPO__BRANCH = 1;

	/**
	 * The feature id for the '<em><b>Job</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REPO__JOB = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REPO__NAME = 3;

	/**
	 * The number of structural features of the '<em>Source Repo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REPO_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Push Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REPO___PUSH_CODE = 0;

	/**
	 * The operation id for the '<em>Commit Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REPO___COMMIT_CHANGES = 1;

	/**
	 * The operation id for the '<em>Create Branch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REPO___CREATE_BRANCH = 2;

	/**
	 * The operation id for the '<em>Create Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REPO___CREATE_TRIGGER = 3;

	/**
	 * The operation id for the '<em>Merge Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REPO___MERGE_TRIGGER = 4;

	/**
	 * The operation id for the '<em>Notify Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REPO___NOTIFY_CHANGES = 5;

	/**
	 * The operation id for the '<em>Valid Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REPO___VALID_LOCATION__DIAGNOSTICCHAIN_MAP = 6;

	/**
	 * The number of operations of the '<em>Source Repo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REPO_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link devOpsPipeline.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOpsPipeline.impl.TokenImpl
	 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__TOKEN = 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devOpsPipeline.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOpsPipeline.impl.BranchImpl
	 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = 0;

	/**
	 * The feature id for the '<em><b>On Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__ON_PUSH = 1;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__MERGE = 2;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devOpsPipeline.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOpsPipeline.impl.ActionImpl
	 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TOOL = 1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SCRIPT = 2;

	/**
	 * The feature id for the '<em><b>Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TOKEN = 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devOpsPipeline.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOpsPipeline.impl.JobImpl
	 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getJob()
	 * @generated
	 */
	int JOB = 4;

	/**
	 * The feature id for the '<em><b>Docker Machine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DOCKER_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = 2;

	/**
	 * The feature id for the '<em><b>Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TOKEN = 3;

	/**
	 * The feature id for the '<em><b>Uploadartifactaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__UPLOADARTIFACTACTION = 4;

	/**
	 * The feature id for the '<em><b>Downloadartifactaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DOWNLOADARTIFACTACTION = 5;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devOpsPipeline.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOpsPipeline.impl.PipelineImpl
	 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 5;

	/**
	 * The feature id for the '<em><b>Sourcerepo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SOURCEREPO = 0;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devOpsPipeline.impl.UploadArtifactActionImpl <em>Upload Artifact Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOpsPipeline.impl.UploadArtifactActionImpl
	 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getUploadArtifactAction()
	 * @generated
	 */
	int UPLOAD_ARTIFACT_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOAD_ARTIFACT_ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOAD_ARTIFACT_ACTION__ARTIFACT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOAD_ARTIFACT_ACTION__PATH = 2;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOAD_ARTIFACT_ACTION__JOB = 3;

	/**
	 * The number of structural features of the '<em>Upload Artifact Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOAD_ARTIFACT_ACTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Upload Artifact Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOAD_ARTIFACT_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devOpsPipeline.impl.DownloadArtifactActionImpl <em>Download Artifact Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOpsPipeline.impl.DownloadArtifactActionImpl
	 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getDownloadArtifactAction()
	 * @generated
	 */
	int DOWNLOAD_ARTIFACT_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNLOAD_ARTIFACT_ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uploadartifactaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNLOAD_ARTIFACT_ACTION__UPLOADARTIFACTACTION = 1;

	/**
	 * The number of structural features of the '<em>Download Artifact Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNLOAD_ARTIFACT_ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Download Artifact Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNLOAD_ARTIFACT_ACTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link devOpsPipeline.SourceRepo <em>Source Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Repo</em>'.
	 * @see devOpsPipeline.SourceRepo
	 * @generated
	 */
	EClass getSourceRepo();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.SourceRepo#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see devOpsPipeline.SourceRepo#getLocation()
	 * @see #getSourceRepo()
	 * @generated
	 */
	EAttribute getSourceRepo_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link devOpsPipeline.SourceRepo#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branch</em>'.
	 * @see devOpsPipeline.SourceRepo#getBranch()
	 * @see #getSourceRepo()
	 * @generated
	 */
	EReference getSourceRepo_Branch();

	/**
	 * Returns the meta object for the containment reference list '{@link devOpsPipeline.SourceRepo#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Job</em>'.
	 * @see devOpsPipeline.SourceRepo#getJob()
	 * @see #getSourceRepo()
	 * @generated
	 */
	EReference getSourceRepo_Job();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.SourceRepo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see devOpsPipeline.SourceRepo#getName()
	 * @see #getSourceRepo()
	 * @generated
	 */
	EAttribute getSourceRepo_Name();

	/**
	 * Returns the meta object for the '{@link devOpsPipeline.SourceRepo#pushCode() <em>Push Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Push Code</em>' operation.
	 * @see devOpsPipeline.SourceRepo#pushCode()
	 * @generated
	 */
	EOperation getSourceRepo__PushCode();

	/**
	 * Returns the meta object for the '{@link devOpsPipeline.SourceRepo#commitChanges() <em>Commit Changes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Commit Changes</em>' operation.
	 * @see devOpsPipeline.SourceRepo#commitChanges()
	 * @generated
	 */
	EOperation getSourceRepo__CommitChanges();

	/**
	 * Returns the meta object for the '{@link devOpsPipeline.SourceRepo#createBranch() <em>Create Branch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Branch</em>' operation.
	 * @see devOpsPipeline.SourceRepo#createBranch()
	 * @generated
	 */
	EOperation getSourceRepo__CreateBranch();

	/**
	 * Returns the meta object for the '{@link devOpsPipeline.SourceRepo#createTrigger() <em>Create Trigger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Trigger</em>' operation.
	 * @see devOpsPipeline.SourceRepo#createTrigger()
	 * @generated
	 */
	EOperation getSourceRepo__CreateTrigger();

	/**
	 * Returns the meta object for the '{@link devOpsPipeline.SourceRepo#mergeTrigger() <em>Merge Trigger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merge Trigger</em>' operation.
	 * @see devOpsPipeline.SourceRepo#mergeTrigger()
	 * @generated
	 */
	EOperation getSourceRepo__MergeTrigger();

	/**
	 * Returns the meta object for the '{@link devOpsPipeline.SourceRepo#notifyChanges() <em>Notify Changes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Notify Changes</em>' operation.
	 * @see devOpsPipeline.SourceRepo#notifyChanges()
	 * @generated
	 */
	EOperation getSourceRepo__NotifyChanges();

	/**
	 * Returns the meta object for the '{@link devOpsPipeline.SourceRepo#ValidLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Location</em>' operation.
	 * @see devOpsPipeline.SourceRepo#ValidLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSourceRepo__ValidLocation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link devOpsPipeline.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see devOpsPipeline.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.Token#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see devOpsPipeline.Token#getToken()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Token();

	/**
	 * Returns the meta object for class '{@link devOpsPipeline.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see devOpsPipeline.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.Branch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see devOpsPipeline.Branch#getName()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Name();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.Branch#isOnPush <em>On Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Push</em>'.
	 * @see devOpsPipeline.Branch#isOnPush()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_OnPush();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.Branch#isMerge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge</em>'.
	 * @see devOpsPipeline.Branch#isMerge()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Merge();

	/**
	 * Returns the meta object for class '{@link devOpsPipeline.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see devOpsPipeline.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see devOpsPipeline.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.Action#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see devOpsPipeline.Action#getTool()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Tool();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.Action#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see devOpsPipeline.Action#getScript()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Script();

	/**
	 * Returns the meta object for the containment reference '{@link devOpsPipeline.Action#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Token</em>'.
	 * @see devOpsPipeline.Action#getToken()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Token();

	/**
	 * Returns the meta object for class '{@link devOpsPipeline.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see devOpsPipeline.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.Job#getDockerMachine <em>Docker Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker Machine</em>'.
	 * @see devOpsPipeline.Job#getDockerMachine()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_DockerMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link devOpsPipeline.Job#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see devOpsPipeline.Job#getAction()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Action();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see devOpsPipeline.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for the containment reference '{@link devOpsPipeline.Job#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Token</em>'.
	 * @see devOpsPipeline.Job#getToken()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Token();

	/**
	 * Returns the meta object for the containment reference list '{@link devOpsPipeline.Job#getUploadartifactaction <em>Uploadartifactaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uploadartifactaction</em>'.
	 * @see devOpsPipeline.Job#getUploadartifactaction()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Uploadartifactaction();

	/**
	 * Returns the meta object for the containment reference list '{@link devOpsPipeline.Job#getDownloadartifactaction <em>Downloadartifactaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Downloadartifactaction</em>'.
	 * @see devOpsPipeline.Job#getDownloadartifactaction()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Downloadartifactaction();

	/**
	 * Returns the meta object for class '{@link devOpsPipeline.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see devOpsPipeline.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference '{@link devOpsPipeline.Pipeline#getSourcerepo <em>Sourcerepo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sourcerepo</em>'.
	 * @see devOpsPipeline.Pipeline#getSourcerepo()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Sourcerepo();

	/**
	 * Returns the meta object for class '{@link devOpsPipeline.UploadArtifactAction <em>Upload Artifact Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upload Artifact Action</em>'.
	 * @see devOpsPipeline.UploadArtifactAction
	 * @generated
	 */
	EClass getUploadArtifactAction();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.UploadArtifactAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see devOpsPipeline.UploadArtifactAction#getName()
	 * @see #getUploadArtifactAction()
	 * @generated
	 */
	EAttribute getUploadArtifactAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.UploadArtifactAction#getArtifactName <em>Artifact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Name</em>'.
	 * @see devOpsPipeline.UploadArtifactAction#getArtifactName()
	 * @see #getUploadArtifactAction()
	 * @generated
	 */
	EAttribute getUploadArtifactAction_ArtifactName();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.UploadArtifactAction#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see devOpsPipeline.UploadArtifactAction#getPath()
	 * @see #getUploadArtifactAction()
	 * @generated
	 */
	EAttribute getUploadArtifactAction_Path();

	/**
	 * Returns the meta object for the reference '{@link devOpsPipeline.UploadArtifactAction#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job</em>'.
	 * @see devOpsPipeline.UploadArtifactAction#getJob()
	 * @see #getUploadArtifactAction()
	 * @generated
	 */
	EReference getUploadArtifactAction_Job();

	/**
	 * Returns the meta object for class '{@link devOpsPipeline.DownloadArtifactAction <em>Download Artifact Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Download Artifact Action</em>'.
	 * @see devOpsPipeline.DownloadArtifactAction
	 * @generated
	 */
	EClass getDownloadArtifactAction();

	/**
	 * Returns the meta object for the attribute '{@link devOpsPipeline.DownloadArtifactAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see devOpsPipeline.DownloadArtifactAction#getName()
	 * @see #getDownloadArtifactAction()
	 * @generated
	 */
	EAttribute getDownloadArtifactAction_Name();

	/**
	 * Returns the meta object for the reference '{@link devOpsPipeline.DownloadArtifactAction#getUploadartifactaction <em>Uploadartifactaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uploadartifactaction</em>'.
	 * @see devOpsPipeline.DownloadArtifactAction#getUploadartifactaction()
	 * @see #getDownloadArtifactAction()
	 * @generated
	 */
	EReference getDownloadArtifactAction_Uploadartifactaction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DevOpsPipelineFactory getDevOpsPipelineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link devOpsPipeline.impl.SourceRepoImpl <em>Source Repo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOpsPipeline.impl.SourceRepoImpl
		 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getSourceRepo()
		 * @generated
		 */
		EClass SOURCE_REPO = eINSTANCE.getSourceRepo();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REPO__LOCATION = eINSTANCE.getSourceRepo_Location();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_REPO__BRANCH = eINSTANCE.getSourceRepo_Branch();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_REPO__JOB = eINSTANCE.getSourceRepo_Job();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REPO__NAME = eINSTANCE.getSourceRepo_Name();

		/**
		 * The meta object literal for the '<em><b>Push Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE_REPO___PUSH_CODE = eINSTANCE.getSourceRepo__PushCode();

		/**
		 * The meta object literal for the '<em><b>Commit Changes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE_REPO___COMMIT_CHANGES = eINSTANCE.getSourceRepo__CommitChanges();

		/**
		 * The meta object literal for the '<em><b>Create Branch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE_REPO___CREATE_BRANCH = eINSTANCE.getSourceRepo__CreateBranch();

		/**
		 * The meta object literal for the '<em><b>Create Trigger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE_REPO___CREATE_TRIGGER = eINSTANCE.getSourceRepo__CreateTrigger();

		/**
		 * The meta object literal for the '<em><b>Merge Trigger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE_REPO___MERGE_TRIGGER = eINSTANCE.getSourceRepo__MergeTrigger();

		/**
		 * The meta object literal for the '<em><b>Notify Changes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE_REPO___NOTIFY_CHANGES = eINSTANCE.getSourceRepo__NotifyChanges();

		/**
		 * The meta object literal for the '<em><b>Valid Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE_REPO___VALID_LOCATION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getSourceRepo__ValidLocation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link devOpsPipeline.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOpsPipeline.impl.TokenImpl
		 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__TOKEN = eINSTANCE.getToken_Token();

		/**
		 * The meta object literal for the '{@link devOpsPipeline.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOpsPipeline.impl.BranchImpl
		 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__NAME = eINSTANCE.getBranch_Name();

		/**
		 * The meta object literal for the '<em><b>On Push</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__ON_PUSH = eINSTANCE.getBranch_OnPush();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__MERGE = eINSTANCE.getBranch_Merge();

		/**
		 * The meta object literal for the '{@link devOpsPipeline.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOpsPipeline.impl.ActionImpl
		 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__TOOL = eINSTANCE.getAction_Tool();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__SCRIPT = eINSTANCE.getAction_Script();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__TOKEN = eINSTANCE.getAction_Token();

		/**
		 * The meta object literal for the '{@link devOpsPipeline.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOpsPipeline.impl.JobImpl
		 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Docker Machine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__DOCKER_MACHINE = eINSTANCE.getJob_DockerMachine();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ACTION = eINSTANCE.getJob_Action();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NAME = eINSTANCE.getJob_Name();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__TOKEN = eINSTANCE.getJob_Token();

		/**
		 * The meta object literal for the '<em><b>Uploadartifactaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__UPLOADARTIFACTACTION = eINSTANCE.getJob_Uploadartifactaction();

		/**
		 * The meta object literal for the '<em><b>Downloadartifactaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__DOWNLOADARTIFACTACTION = eINSTANCE.getJob_Downloadartifactaction();

		/**
		 * The meta object literal for the '{@link devOpsPipeline.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOpsPipeline.impl.PipelineImpl
		 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Sourcerepo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__SOURCEREPO = eINSTANCE.getPipeline_Sourcerepo();

		/**
		 * The meta object literal for the '{@link devOpsPipeline.impl.UploadArtifactActionImpl <em>Upload Artifact Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOpsPipeline.impl.UploadArtifactActionImpl
		 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getUploadArtifactAction()
		 * @generated
		 */
		EClass UPLOAD_ARTIFACT_ACTION = eINSTANCE.getUploadArtifactAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPLOAD_ARTIFACT_ACTION__NAME = eINSTANCE.getUploadArtifactAction_Name();

		/**
		 * The meta object literal for the '<em><b>Artifact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPLOAD_ARTIFACT_ACTION__ARTIFACT_NAME = eINSTANCE.getUploadArtifactAction_ArtifactName();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPLOAD_ARTIFACT_ACTION__PATH = eINSTANCE.getUploadArtifactAction_Path();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPLOAD_ARTIFACT_ACTION__JOB = eINSTANCE.getUploadArtifactAction_Job();

		/**
		 * The meta object literal for the '{@link devOpsPipeline.impl.DownloadArtifactActionImpl <em>Download Artifact Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOpsPipeline.impl.DownloadArtifactActionImpl
		 * @see devOpsPipeline.impl.DevOpsPipelinePackageImpl#getDownloadArtifactAction()
		 * @generated
		 */
		EClass DOWNLOAD_ARTIFACT_ACTION = eINSTANCE.getDownloadArtifactAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOWNLOAD_ARTIFACT_ACTION__NAME = eINSTANCE.getDownloadArtifactAction_Name();

		/**
		 * The meta object literal for the '<em><b>Uploadartifactaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOWNLOAD_ARTIFACT_ACTION__UPLOADARTIFACTACTION = eINSTANCE
				.getDownloadArtifactAction_Uploadartifactaction();

	}

} //DevOpsPipelinePackage
