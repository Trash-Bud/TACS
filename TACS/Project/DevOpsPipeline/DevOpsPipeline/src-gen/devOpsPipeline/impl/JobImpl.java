/**
 */
package devOpsPipeline.impl;

import devOpsPipeline.Action;
import devOpsPipeline.DevOpsPipelinePackage;
import devOpsPipeline.DownloadArtifactAction;
import devOpsPipeline.Job;
import devOpsPipeline.Token;
import devOpsPipeline.UploadArtifactAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOpsPipeline.impl.JobImpl#getDockerMachine <em>Docker Machine</em>}</li>
 *   <li>{@link devOpsPipeline.impl.JobImpl#getAction <em>Action</em>}</li>
 *   <li>{@link devOpsPipeline.impl.JobImpl#getName <em>Name</em>}</li>
 *   <li>{@link devOpsPipeline.impl.JobImpl#getToken <em>Token</em>}</li>
 *   <li>{@link devOpsPipeline.impl.JobImpl#getUploadartifactaction <em>Uploadartifactaction</em>}</li>
 *   <li>{@link devOpsPipeline.impl.JobImpl#getDownloadartifactaction <em>Downloadartifactaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job {
	/**
	 * The default value of the '{@link #getDockerMachine() <em>Docker Machine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerMachine()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCKER_MACHINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDockerMachine() <em>Docker Machine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerMachine()
	 * @generated
	 * @ordered
	 */
	protected String dockerMachine = DOCKER_MACHINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

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
	 * The cached value of the '{@link #getToken() <em>Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected Token token;

	/**
	 * The cached value of the '{@link #getUploadartifactaction() <em>Uploadartifactaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploadartifactaction()
	 * @generated
	 * @ordered
	 */
	protected EList<UploadArtifactAction> uploadartifactaction;

	/**
	 * The cached value of the '{@link #getDownloadartifactaction() <em>Downloadartifactaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadartifactaction()
	 * @generated
	 * @ordered
	 */
	protected EList<DownloadArtifactAction> downloadartifactaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPipelinePackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDockerMachine() {
		return dockerMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDockerMachine(String newDockerMachine) {
		String oldDockerMachine = dockerMachine;
		dockerMachine = newDockerMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPipelinePackage.JOB__DOCKER_MACHINE,
					oldDockerMachine, dockerMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, DevOpsPipelinePackage.JOB__ACTION);
		}
		return action;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPipelinePackage.JOB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Token getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToken(Token newToken, NotificationChain msgs) {
		Token oldToken = token;
		token = newToken;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DevOpsPipelinePackage.JOB__TOKEN, oldToken, newToken);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToken(Token newToken) {
		if (newToken != token) {
			NotificationChain msgs = null;
			if (token != null)
				msgs = ((InternalEObject) token).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DevOpsPipelinePackage.JOB__TOKEN, null, msgs);
			if (newToken != null)
				msgs = ((InternalEObject) newToken).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DevOpsPipelinePackage.JOB__TOKEN, null, msgs);
			msgs = basicSetToken(newToken, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPipelinePackage.JOB__TOKEN, newToken,
					newToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UploadArtifactAction> getUploadartifactaction() {
		if (uploadartifactaction == null) {
			uploadartifactaction = new EObjectContainmentEList<UploadArtifactAction>(UploadArtifactAction.class, this,
					DevOpsPipelinePackage.JOB__UPLOADARTIFACTACTION);
		}
		return uploadartifactaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DownloadArtifactAction> getDownloadartifactaction() {
		if (downloadartifactaction == null) {
			downloadartifactaction = new EObjectContainmentEList<DownloadArtifactAction>(DownloadArtifactAction.class,
					this, DevOpsPipelinePackage.JOB__DOWNLOADARTIFACTACTION);
		}
		return downloadartifactaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DevOpsPipelinePackage.JOB__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
		case DevOpsPipelinePackage.JOB__TOKEN:
			return basicSetToken(null, msgs);
		case DevOpsPipelinePackage.JOB__UPLOADARTIFACTACTION:
			return ((InternalEList<?>) getUploadartifactaction()).basicRemove(otherEnd, msgs);
		case DevOpsPipelinePackage.JOB__DOWNLOADARTIFACTACTION:
			return ((InternalEList<?>) getDownloadartifactaction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DevOpsPipelinePackage.JOB__DOCKER_MACHINE:
			return getDockerMachine();
		case DevOpsPipelinePackage.JOB__ACTION:
			return getAction();
		case DevOpsPipelinePackage.JOB__NAME:
			return getName();
		case DevOpsPipelinePackage.JOB__TOKEN:
			return getToken();
		case DevOpsPipelinePackage.JOB__UPLOADARTIFACTACTION:
			return getUploadartifactaction();
		case DevOpsPipelinePackage.JOB__DOWNLOADARTIFACTACTION:
			return getDownloadartifactaction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DevOpsPipelinePackage.JOB__DOCKER_MACHINE:
			setDockerMachine((String) newValue);
			return;
		case DevOpsPipelinePackage.JOB__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
			return;
		case DevOpsPipelinePackage.JOB__NAME:
			setName((String) newValue);
			return;
		case DevOpsPipelinePackage.JOB__TOKEN:
			setToken((Token) newValue);
			return;
		case DevOpsPipelinePackage.JOB__UPLOADARTIFACTACTION:
			getUploadartifactaction().clear();
			getUploadartifactaction().addAll((Collection<? extends UploadArtifactAction>) newValue);
			return;
		case DevOpsPipelinePackage.JOB__DOWNLOADARTIFACTACTION:
			getDownloadartifactaction().clear();
			getDownloadartifactaction().addAll((Collection<? extends DownloadArtifactAction>) newValue);
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
		case DevOpsPipelinePackage.JOB__DOCKER_MACHINE:
			setDockerMachine(DOCKER_MACHINE_EDEFAULT);
			return;
		case DevOpsPipelinePackage.JOB__ACTION:
			getAction().clear();
			return;
		case DevOpsPipelinePackage.JOB__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DevOpsPipelinePackage.JOB__TOKEN:
			setToken((Token) null);
			return;
		case DevOpsPipelinePackage.JOB__UPLOADARTIFACTACTION:
			getUploadartifactaction().clear();
			return;
		case DevOpsPipelinePackage.JOB__DOWNLOADARTIFACTACTION:
			getDownloadartifactaction().clear();
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
		case DevOpsPipelinePackage.JOB__DOCKER_MACHINE:
			return DOCKER_MACHINE_EDEFAULT == null ? dockerMachine != null
					: !DOCKER_MACHINE_EDEFAULT.equals(dockerMachine);
		case DevOpsPipelinePackage.JOB__ACTION:
			return action != null && !action.isEmpty();
		case DevOpsPipelinePackage.JOB__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DevOpsPipelinePackage.JOB__TOKEN:
			return token != null;
		case DevOpsPipelinePackage.JOB__UPLOADARTIFACTACTION:
			return uploadartifactaction != null && !uploadartifactaction.isEmpty();
		case DevOpsPipelinePackage.JOB__DOWNLOADARTIFACTACTION:
			return downloadartifactaction != null && !downloadartifactaction.isEmpty();
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
		result.append(" (dockerMachine: ");
		result.append(dockerMachine);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //JobImpl
