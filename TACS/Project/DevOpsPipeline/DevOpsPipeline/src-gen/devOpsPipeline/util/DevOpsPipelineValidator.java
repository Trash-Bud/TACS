/**
 */
package devOpsPipeline.util;

import devOpsPipeline.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see devOpsPipeline.DevOpsPipelinePackage
 * @generated
 */
public class DevOpsPipelineValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DevOpsPipelineValidator INSTANCE = new DevOpsPipelineValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "devOpsPipeline";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Location' of 'Source Repo'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOURCE_REPO__VALID_LOCATION = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevOpsPipelineValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return DevOpsPipelinePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case DevOpsPipelinePackage.SOURCE_REPO:
			return validateSourceRepo((SourceRepo) value, diagnostics, context);
		case DevOpsPipelinePackage.TOKEN:
			return validateToken((Token) value, diagnostics, context);
		case DevOpsPipelinePackage.BRANCH:
			return validateBranch((Branch) value, diagnostics, context);
		case DevOpsPipelinePackage.ACTION:
			return validateAction((Action) value, diagnostics, context);
		case DevOpsPipelinePackage.JOB:
			return validateJob((Job) value, diagnostics, context);
		case DevOpsPipelinePackage.PIPELINE:
			return validatePipeline((Pipeline) value, diagnostics, context);
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION:
			return validateUploadArtifactAction((UploadArtifactAction) value, diagnostics, context);
		case DevOpsPipelinePackage.DOWNLOAD_ARTIFACT_ACTION:
			return validateDownloadArtifactAction((DownloadArtifactAction) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceRepo(SourceRepo sourceRepo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceRepo, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(sourceRepo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(sourceRepo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(sourceRepo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(sourceRepo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(sourceRepo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(sourceRepo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(sourceRepo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(sourceRepo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSourceRepo_ValidLocation(sourceRepo, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidLocation constraint of '<em>Source Repo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceRepo_ValidLocation(SourceRepo sourceRepo, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return sourceRepo.ValidLocation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToken(Token token, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(token, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(branch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJob(Job job, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(job, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePipeline(Pipeline pipeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pipeline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUploadArtifactAction(UploadArtifactAction uploadArtifactAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uploadArtifactAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDownloadArtifactAction(DownloadArtifactAction downloadArtifactAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(downloadArtifactAction, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DevOpsPipelineValidator
