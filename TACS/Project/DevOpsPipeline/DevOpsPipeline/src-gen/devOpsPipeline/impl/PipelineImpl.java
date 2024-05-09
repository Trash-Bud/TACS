/**
 */
package devOpsPipeline.impl;

import devOpsPipeline.DevOpsPipelinePackage;
import devOpsPipeline.Pipeline;
import devOpsPipeline.SourceRepo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOpsPipeline.impl.PipelineImpl#getSourcerepo <em>Sourcerepo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline {
	/**
	 * The cached value of the '{@link #getSourcerepo() <em>Sourcerepo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcerepo()
	 * @generated
	 * @ordered
	 */
	protected SourceRepo sourcerepo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPipelinePackage.Literals.PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceRepo getSourcerepo() {
		return sourcerepo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourcerepo(SourceRepo newSourcerepo, NotificationChain msgs) {
		SourceRepo oldSourcerepo = sourcerepo;
		sourcerepo = newSourcerepo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DevOpsPipelinePackage.PIPELINE__SOURCEREPO, oldSourcerepo, newSourcerepo);
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
	public void setSourcerepo(SourceRepo newSourcerepo) {
		if (newSourcerepo != sourcerepo) {
			NotificationChain msgs = null;
			if (sourcerepo != null)
				msgs = ((InternalEObject) sourcerepo).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DevOpsPipelinePackage.PIPELINE__SOURCEREPO, null, msgs);
			if (newSourcerepo != null)
				msgs = ((InternalEObject) newSourcerepo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DevOpsPipelinePackage.PIPELINE__SOURCEREPO, null, msgs);
			msgs = basicSetSourcerepo(newSourcerepo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPipelinePackage.PIPELINE__SOURCEREPO,
					newSourcerepo, newSourcerepo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DevOpsPipelinePackage.PIPELINE__SOURCEREPO:
			return basicSetSourcerepo(null, msgs);
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
		case DevOpsPipelinePackage.PIPELINE__SOURCEREPO:
			return getSourcerepo();
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
		case DevOpsPipelinePackage.PIPELINE__SOURCEREPO:
			setSourcerepo((SourceRepo) newValue);
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
		case DevOpsPipelinePackage.PIPELINE__SOURCEREPO:
			setSourcerepo((SourceRepo) null);
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
		case DevOpsPipelinePackage.PIPELINE__SOURCEREPO:
			return sourcerepo != null;
		}
		return super.eIsSet(featureID);
	}

} //PipelineImpl
