/**
 */
package devOpsPipeline.impl;

import devOpsPipeline.Branch;
import devOpsPipeline.DevOpsPipelinePackage;
import devOpsPipeline.DevOpsPipelineTables;
import devOpsPipeline.Job;
import devOpsPipeline.SourceRepo;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Repo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOpsPipeline.impl.SourceRepoImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link devOpsPipeline.impl.SourceRepoImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link devOpsPipeline.impl.SourceRepoImpl#getJob <em>Job</em>}</li>
 *   <li>{@link devOpsPipeline.impl.SourceRepoImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceRepoImpl extends MinimalEObjectImpl.Container implements SourceRepo {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBranch() <em>Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected EList<Branch> branch;

	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> job;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceRepoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPipelinePackage.Literals.SOURCE_REPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPipelinePackage.SOURCE_REPO__LOCATION,
					oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Branch> getBranch() {
		if (branch == null) {
			branch = new EObjectContainmentEList<Branch>(Branch.class, this, DevOpsPipelinePackage.SOURCE_REPO__BRANCH);
		}
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getJob() {
		if (job == null) {
			job = new EObjectContainmentEList<Job>(Job.class, this, DevOpsPipelinePackage.SOURCE_REPO__JOB);
		}
		return job;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPipelinePackage.SOURCE_REPO__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void pushCode() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/devOpsPipeline!SourceRepo!pushCode()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void commitChanges() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/devOpsPipeline!SourceRepo!commitChanges()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void createBranch() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/devOpsPipeline!SourceRepo!createBranch()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void createTrigger() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/devOpsPipeline!SourceRepo!createTrigger()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void mergeTrigger() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/devOpsPipeline!SourceRepo!mergeTrigger()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanges() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/devOpsPipeline!SourceRepo!notifyChanges()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidLocation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "SourceRepo::ValidLocation";
		try {
			/**
			 *
			 * inv ValidLocation:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.location->isEmpty() or
			 *         self.location.matches('^(https?|ftp)://[\\S/$.?#][\\S]*$') or
			 *         self.location.matches('^(\\.\\./|\\./)?(?:[\\w-]+/)*[\\w-]+(\\.[\\w-]+)?$') or
			 *         self.location.matches('^/[^/].*')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					DevOpsPipelinePackage.Literals.SOURCE_REPO___VALID_LOCATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, DevOpsPipelineTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_isEmpty;
					try {
						final /*@NonInvalid*/ String location = this.getLocation();
						final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
								DevOpsPipelineTables.SET_PRIMid_String, location);
						final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(oclAsSet)
								.booleanValue();
						CAUGHT_isEmpty = isEmpty;
					} catch (Exception e) {
						CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_isEmpty == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_or_0;
						try {
							/*@Caught*/ Object CAUGHT_or;
							try {
								/*@Caught*/ Object CAUGHT_matches;
								try {
									final /*@NonInvalid*/ String location_0 = this.getLocation();
									if (location_0 == null) {
										throw new InvalidValueException(
												"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
									}
									final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(
											executor, TypeId.BOOLEAN, location_0,
											DevOpsPipelineTables.STR__94_o_https_63_124_ftp_e_c_s_s_91_92_S_s_$_63_35_93_91_92_S_93_a_$)
											.booleanValue();
									CAUGHT_matches = matches;
								} catch (Exception e) {
									CAUGHT_matches = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean or;
								if (CAUGHT_matches == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									/*@Caught*/ Object CAUGHT_matches_0;
									try {
										final /*@NonInvalid*/ String location_1 = this.getLocation();
										if (location_1 == null) {
											throw new InvalidValueException(
													"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
										}
										final /*@Thrown*/ boolean matches_0 = StringMatchesOperation.INSTANCE.evaluate(
												executor, TypeId.BOOLEAN, location_1,
												DevOpsPipelineTables.STR__94_o_92__92__s_124_92__s_e_63_o_63_c_91_92_w_m_93_p_s_e_a_91_92_w_m_93_p_o_92__91_92_w_m_93_p_e_63_$)
												.booleanValue();
										CAUGHT_matches_0 = matches_0;
									} catch (Exception e) {
										CAUGHT_matches_0 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_matches_0 == ValueUtil.TRUE_VALUE) {
										or = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_matches instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_matches;
										}
										if (CAUGHT_matches_0 instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_matches_0;
										}
										or = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_or = or;
							} catch (Exception e) {
								CAUGHT_or = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or_0;
							if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
								or_0 = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_matches_1;
								try {
									final /*@NonInvalid*/ String location_2 = this.getLocation();
									if (location_2 == null) {
										throw new InvalidValueException(
												"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
									}
									final /*@Thrown*/ boolean matches_1 = StringMatchesOperation.INSTANCE
											.evaluate(executor, TypeId.BOOLEAN, location_2,
													DevOpsPipelineTables.STR__94_s_91_94_s_93__a)
											.booleanValue();
									CAUGHT_matches_1 = matches_1;
								} catch (Exception e) {
									CAUGHT_matches_1 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_matches_1 == ValueUtil.TRUE_VALUE) {
									or_0 = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_or instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_or;
									}
									if (CAUGHT_matches_1 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_matches_1;
									}
									if (CAUGHT_or == null) {
										or_0 = null;
									} else {
										or_0 = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_or_0 = or_0;
						} catch (Exception e) {
							CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_or_0 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_isEmpty instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_isEmpty;
							}
							if (CAUGHT_or_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_or_0;
							}
							if (CAUGHT_or_0 == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, DevOpsPipelineTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DevOpsPipelinePackage.SOURCE_REPO__BRANCH:
			return ((InternalEList<?>) getBranch()).basicRemove(otherEnd, msgs);
		case DevOpsPipelinePackage.SOURCE_REPO__JOB:
			return ((InternalEList<?>) getJob()).basicRemove(otherEnd, msgs);
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
		case DevOpsPipelinePackage.SOURCE_REPO__LOCATION:
			return getLocation();
		case DevOpsPipelinePackage.SOURCE_REPO__BRANCH:
			return getBranch();
		case DevOpsPipelinePackage.SOURCE_REPO__JOB:
			return getJob();
		case DevOpsPipelinePackage.SOURCE_REPO__NAME:
			return getName();
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
		case DevOpsPipelinePackage.SOURCE_REPO__LOCATION:
			setLocation((String) newValue);
			return;
		case DevOpsPipelinePackage.SOURCE_REPO__BRANCH:
			getBranch().clear();
			getBranch().addAll((Collection<? extends Branch>) newValue);
			return;
		case DevOpsPipelinePackage.SOURCE_REPO__JOB:
			getJob().clear();
			getJob().addAll((Collection<? extends Job>) newValue);
			return;
		case DevOpsPipelinePackage.SOURCE_REPO__NAME:
			setName((String) newValue);
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
		case DevOpsPipelinePackage.SOURCE_REPO__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case DevOpsPipelinePackage.SOURCE_REPO__BRANCH:
			getBranch().clear();
			return;
		case DevOpsPipelinePackage.SOURCE_REPO__JOB:
			getJob().clear();
			return;
		case DevOpsPipelinePackage.SOURCE_REPO__NAME:
			setName(NAME_EDEFAULT);
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
		case DevOpsPipelinePackage.SOURCE_REPO__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case DevOpsPipelinePackage.SOURCE_REPO__BRANCH:
			return branch != null && !branch.isEmpty();
		case DevOpsPipelinePackage.SOURCE_REPO__JOB:
			return job != null && !job.isEmpty();
		case DevOpsPipelinePackage.SOURCE_REPO__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DevOpsPipelinePackage.SOURCE_REPO___PUSH_CODE:
			pushCode();
			return null;
		case DevOpsPipelinePackage.SOURCE_REPO___COMMIT_CHANGES:
			commitChanges();
			return null;
		case DevOpsPipelinePackage.SOURCE_REPO___CREATE_BRANCH:
			createBranch();
			return null;
		case DevOpsPipelinePackage.SOURCE_REPO___CREATE_TRIGGER:
			createTrigger();
			return null;
		case DevOpsPipelinePackage.SOURCE_REPO___MERGE_TRIGGER:
			mergeTrigger();
			return null;
		case DevOpsPipelinePackage.SOURCE_REPO___NOTIFY_CHANGES:
			notifyChanges();
			return null;
		case DevOpsPipelinePackage.SOURCE_REPO___VALID_LOCATION__DIAGNOSTICCHAIN_MAP:
			return ValidLocation((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (location: ");
		result.append(location);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SourceRepoImpl
