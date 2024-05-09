/**
 */
package devOpsPipeline.impl;

import devOpsPipeline.DevOpsPipelinePackage;
import devOpsPipeline.DownloadArtifactAction;
import devOpsPipeline.UploadArtifactAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Download Artifact Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOpsPipeline.impl.DownloadArtifactActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link devOpsPipeline.impl.DownloadArtifactActionImpl#getUploadartifactaction <em>Uploadartifactaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DownloadArtifactActionImpl extends MinimalEObjectImpl.Container implements DownloadArtifactAction {
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
	 * The cached value of the '{@link #getUploadartifactaction() <em>Uploadartifactaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploadartifactaction()
	 * @generated
	 * @ordered
	 */
	protected UploadArtifactAction uploadartifactaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DownloadArtifactActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPipelinePackage.Literals.DOWNLOAD_ARTIFACT_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPipelinePackage.DOWNLOAD_ARTIFACT_ACTION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UploadArtifactAction getUploadartifactaction() {
		if (uploadartifactaction != null && uploadartifactaction.eIsProxy()) {
			InternalEObject oldUploadartifactaction = (InternalEObject) uploadartifactaction;
			uploadartifactaction = (UploadArtifactAction) eResolveProxy(oldUploadartifactaction);
			if (uploadartifactaction != oldUploadartifactaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DevOpsPipelinePackage.DOWNLOAD_ARTIFACT_ACTION__UPLOADARTIFACTACTION,
							oldUploadartifactaction, uploadartifactaction));
			}
		}
		return uploadartifactaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UploadArtifactAction basicGetUploadartifactaction() {
		return uploadartifactaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUploadartifactaction(UploadArtifactAction newUploadartifactaction) {
		UploadArtifactAction oldUploadartifactaction = uploadartifactaction;
		uploadartifactaction = newUploadartifactaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DevOpsPipelinePackage.DOWNLOAD_ARTIFACT_ACTION__UPLOADARTIFACTACTION, oldUploadartifactaction,
					uploadartifactaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DevOpsPipelinePackage.DOWNLOAD_ARTIFACT_ACTION__NAME:
			return getName();
		case DevOpsPipelinePackage.DOWNLOAD_ARTIFACT_ACTION__UPLOADARTIFACTACTION:
			if (resolve)
				return getUploadartifactaction();
			return basicGetUploadartifactaction();
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
		case DevOpsPipelinePackage.DOWNLOAD_ARTIFACT_ACTION__NAME:
			setName((String) newValue);
			return;
		case DevOpsPipelinePackage.DOWNLOAD_ARTIFACT_ACTION__UPLOADARTIFACTACTION:
			setUploadartifactaction((UploadArtifactAction) newValue);
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
		case DevOpsPipelinePackage.DOWNLOAD_ARTIFACT_ACTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DevOpsPipelinePackage.DOWNLOAD_ARTIFACT_ACTION__UPLOADARTIFACTACTION:
			setUploadartifactaction((UploadArtifactAction) null);
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
		case DevOpsPipelinePackage.DOWNLOAD_ARTIFACT_ACTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DevOpsPipelinePackage.DOWNLOAD_ARTIFACT_ACTION__UPLOADARTIFACTACTION:
			return uploadartifactaction != null;
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
		result.append(')');
		return result.toString();
	}

} //DownloadArtifactActionImpl
