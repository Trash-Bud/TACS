/**
 */
package devOpsPipeline.impl;

import devOpsPipeline.DevOpsPipelinePackage;
import devOpsPipeline.Job;
import devOpsPipeline.UploadArtifactAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Upload Artifact Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOpsPipeline.impl.UploadArtifactActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link devOpsPipeline.impl.UploadArtifactActionImpl#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link devOpsPipeline.impl.UploadArtifactActionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link devOpsPipeline.impl.UploadArtifactActionImpl#getJob <em>Job</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UploadArtifactActionImpl extends MinimalEObjectImpl.Container implements UploadArtifactAction {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected String artifactName = ARTIFACT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected Job job;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UploadArtifactActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPipelinePackage.Literals.UPLOAD_ARTIFACT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactName() {
		return artifactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactName(String newArtifactName) {
		String oldArtifactName = artifactName;
		artifactName = newArtifactName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__ARTIFACT_NAME, oldArtifactName, artifactName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__PATH,
					oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Job getJob() {
		if (job != null && job.eIsProxy()) {
			InternalEObject oldJob = (InternalEObject) job;
			job = (Job) eResolveProxy(oldJob);
			if (job != oldJob) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__JOB, oldJob, job));
			}
		}
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job basicGetJob() {
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJob(Job newJob) {
		Job oldJob = job;
		job = newJob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__JOB,
					oldJob, job));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__NAME:
			return getName();
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__ARTIFACT_NAME:
			return getArtifactName();
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__PATH:
			return getPath();
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__JOB:
			if (resolve)
				return getJob();
			return basicGetJob();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__NAME:
			setName((String) newValue);
			return;
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__ARTIFACT_NAME:
			setArtifactName((String) newValue);
			return;
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__PATH:
			setPath((String) newValue);
			return;
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__JOB:
			setJob((Job) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__ARTIFACT_NAME:
			setArtifactName(ARTIFACT_NAME_EDEFAULT);
			return;
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__JOB:
			setJob((Job) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__ARTIFACT_NAME:
			return ARTIFACT_NAME_EDEFAULT == null ? artifactName != null : !ARTIFACT_NAME_EDEFAULT.equals(artifactName);
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case DevOpsPipelinePackage.UPLOAD_ARTIFACT_ACTION__JOB:
			return job != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", artifactName: ");
		result.append(artifactName);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //UploadArtifactActionImpl
