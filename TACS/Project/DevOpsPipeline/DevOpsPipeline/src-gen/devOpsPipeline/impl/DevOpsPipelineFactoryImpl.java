/**
 */
package devOpsPipeline.impl;

import devOpsPipeline.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevOpsPipelineFactoryImpl extends EFactoryImpl implements DevOpsPipelineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DevOpsPipelineFactory init() {
		try {
			DevOpsPipelineFactory theDevOpsPipelineFactory = (DevOpsPipelineFactory) EPackage.Registry.INSTANCE
					.getEFactory(DevOpsPipelinePackage.eNS_URI);
			if (theDevOpsPipelineFactory != null) {
				return theDevOpsPipelineFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DevOpsPipelineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevOpsPipelineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DevOpsPipelinePackage.SOURCE_REPO:
			return createSourceRepo();
		case DevOpsPipelinePackage.TOKEN:
			return createToken();
		case DevOpsPipelinePackage.BRANCH:
			return createBranch();
		case DevOpsPipelinePackage.ACTION:
			return createAction();
		case DevOpsPipelinePackage.JOB:
			return createJob();
		case DevOpsPipelinePackage.PIPELINE:
			return createPipeline();
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION:
			return createUploadArtifactAction();
		case DevOpsPipelinePackage.DOWNLOAD_ARTIFACT_ACTION:
			return createDownloadArtifactAction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceRepo createSourceRepo() {
		SourceRepoImpl sourceRepo = new SourceRepoImpl();
		return sourceRepo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Job createJob() {
		JobImpl job = new JobImpl();
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pipeline createPipeline() {
		PipelineImpl pipeline = new PipelineImpl();
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UploadArtifactAction createUploadArtifactAction() {
		UploadArtifactActionImpl uploadArtifactAction = new UploadArtifactActionImpl();
		return uploadArtifactAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DownloadArtifactAction createDownloadArtifactAction() {
		DownloadArtifactActionImpl downloadArtifactAction = new DownloadArtifactActionImpl();
		return downloadArtifactAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DevOpsPipelinePackage getDevOpsPipelinePackage() {
		return (DevOpsPipelinePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DevOpsPipelinePackage getPackage() {
		return DevOpsPipelinePackage.eINSTANCE;
	}

} //DevOpsPipelineFactoryImpl
