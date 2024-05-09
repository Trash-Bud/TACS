/**
 */
package uPorto.impl;

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

import uPorto.Course;
import uPorto.Degree;
import uPorto.Professor;
import uPorto.UPortoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Degree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uPorto.impl.DegreeImpl#getName <em>Name</em>}</li>
 *   <li>{@link uPorto.impl.DegreeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link uPorto.impl.DegreeImpl#getAcademic_degree <em>Academic degree</em>}</li>
 *   <li>{@link uPorto.impl.DegreeImpl#getType_of_course <em>Type of course</em>}</li>
 *   <li>{@link uPorto.impl.DegreeImpl#getOfficial_code <em>Official code</em>}</li>
 *   <li>{@link uPorto.impl.DegreeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link uPorto.impl.DegreeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link uPorto.impl.DegreeImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link uPorto.impl.DegreeImpl#getDirector <em>Director</em>}</li>
 *   <li>{@link uPorto.impl.DegreeImpl#getAssistant_director <em>Assistant director</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DegreeImpl extends MinimalEObjectImpl.Container implements Degree {
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
	 * The default value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcronym()
	 * @generated
	 * @ordered
	 */
	protected static final String ACRONYM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcronym()
	 * @generated
	 * @ordered
	 */
	protected String acronym = ACRONYM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcademic_degree() <em>Academic degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcademic_degree()
	 * @generated
	 * @ordered
	 */
	protected static final String ACADEMIC_DEGREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcademic_degree() <em>Academic degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcademic_degree()
	 * @generated
	 * @ordered
	 */
	protected String academic_degree = ACADEMIC_DEGREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType_of_course() <em>Type of course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_of_course()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_OF_COURSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType_of_course() <em>Type of course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_of_course()
	 * @generated
	 * @ordered
	 */
	protected String type_of_course = TYPE_OF_COURSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOfficial_code() <em>Official code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfficial_code()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFICIAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOfficial_code() <em>Official code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfficial_code()
	 * @generated
	 * @ordered
	 */
	protected String official_code = OFFICIAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final String START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected String start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

	/**
	 * The cached value of the '{@link #getDirector() <em>Director</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirector()
	 * @generated
	 * @ordered
	 */
	protected Professor director;

	/**
	 * The cached value of the '{@link #getAssistant_director() <em>Assistant director</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssistant_director()
	 * @generated
	 * @ordered
	 */
	protected Professor assistant_director;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UPortoPackage.Literals.DEGREE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.DEGREE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcronym() {
		return acronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcronym(String newAcronym) {
		String oldAcronym = acronym;
		acronym = newAcronym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.DEGREE__ACRONYM, oldAcronym, acronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcademic_degree() {
		return academic_degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcademic_degree(String newAcademic_degree) {
		String oldAcademic_degree = academic_degree;
		academic_degree = newAcademic_degree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.DEGREE__ACADEMIC_DEGREE,
					oldAcademic_degree, academic_degree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType_of_course() {
		return type_of_course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType_of_course(String newType_of_course) {
		String oldType_of_course = type_of_course;
		type_of_course = newType_of_course;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.DEGREE__TYPE_OF_COURSE,
					oldType_of_course, type_of_course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOfficial_code() {
		return official_code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOfficial_code(String newOfficial_code) {
		String oldOfficial_code = official_code;
		official_code = newOfficial_code;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.DEGREE__OFFICIAL_CODE, oldOfficial_code,
					official_code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(String newStart) {
		String oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.DEGREE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.DEGREE__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectContainmentEList<Course>(Course.class, this, UPortoPackage.DEGREE__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Professor getDirector() {
		if (director != null && director.eIsProxy()) {
			InternalEObject oldDirector = (InternalEObject) director;
			director = (Professor) eResolveProxy(oldDirector);
			if (director != oldDirector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UPortoPackage.DEGREE__DIRECTOR,
							oldDirector, director));
			}
		}
		return director;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor basicGetDirector() {
		return director;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirector(Professor newDirector) {
		Professor oldDirector = director;
		director = newDirector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.DEGREE__DIRECTOR, oldDirector,
					director));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Professor getAssistant_director() {
		if (assistant_director != null && assistant_director.eIsProxy()) {
			InternalEObject oldAssistant_director = (InternalEObject) assistant_director;
			assistant_director = (Professor) eResolveProxy(oldAssistant_director);
			if (assistant_director != oldAssistant_director) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UPortoPackage.DEGREE__ASSISTANT_DIRECTOR,
							oldAssistant_director, assistant_director));
			}
		}
		return assistant_director;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor basicGetAssistant_director() {
		return assistant_director;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssistant_director(Professor newAssistant_director) {
		Professor oldAssistant_director = assistant_director;
		assistant_director = newAssistant_director;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.DEGREE__ASSISTANT_DIRECTOR,
					oldAssistant_director, assistant_director));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UPortoPackage.DEGREE__COURSE:
			return ((InternalEList<?>) getCourse()).basicRemove(otherEnd, msgs);
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
		case UPortoPackage.DEGREE__NAME:
			return getName();
		case UPortoPackage.DEGREE__ACRONYM:
			return getAcronym();
		case UPortoPackage.DEGREE__ACADEMIC_DEGREE:
			return getAcademic_degree();
		case UPortoPackage.DEGREE__TYPE_OF_COURSE:
			return getType_of_course();
		case UPortoPackage.DEGREE__OFFICIAL_CODE:
			return getOfficial_code();
		case UPortoPackage.DEGREE__START:
			return getStart();
		case UPortoPackage.DEGREE__DURATION:
			return getDuration();
		case UPortoPackage.DEGREE__COURSE:
			return getCourse();
		case UPortoPackage.DEGREE__DIRECTOR:
			if (resolve)
				return getDirector();
			return basicGetDirector();
		case UPortoPackage.DEGREE__ASSISTANT_DIRECTOR:
			if (resolve)
				return getAssistant_director();
			return basicGetAssistant_director();
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
		case UPortoPackage.DEGREE__NAME:
			setName((String) newValue);
			return;
		case UPortoPackage.DEGREE__ACRONYM:
			setAcronym((String) newValue);
			return;
		case UPortoPackage.DEGREE__ACADEMIC_DEGREE:
			setAcademic_degree((String) newValue);
			return;
		case UPortoPackage.DEGREE__TYPE_OF_COURSE:
			setType_of_course((String) newValue);
			return;
		case UPortoPackage.DEGREE__OFFICIAL_CODE:
			setOfficial_code((String) newValue);
			return;
		case UPortoPackage.DEGREE__START:
			setStart((String) newValue);
			return;
		case UPortoPackage.DEGREE__DURATION:
			setDuration((Integer) newValue);
			return;
		case UPortoPackage.DEGREE__COURSE:
			getCourse().clear();
			getCourse().addAll((Collection<? extends Course>) newValue);
			return;
		case UPortoPackage.DEGREE__DIRECTOR:
			setDirector((Professor) newValue);
			return;
		case UPortoPackage.DEGREE__ASSISTANT_DIRECTOR:
			setAssistant_director((Professor) newValue);
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
		case UPortoPackage.DEGREE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UPortoPackage.DEGREE__ACRONYM:
			setAcronym(ACRONYM_EDEFAULT);
			return;
		case UPortoPackage.DEGREE__ACADEMIC_DEGREE:
			setAcademic_degree(ACADEMIC_DEGREE_EDEFAULT);
			return;
		case UPortoPackage.DEGREE__TYPE_OF_COURSE:
			setType_of_course(TYPE_OF_COURSE_EDEFAULT);
			return;
		case UPortoPackage.DEGREE__OFFICIAL_CODE:
			setOfficial_code(OFFICIAL_CODE_EDEFAULT);
			return;
		case UPortoPackage.DEGREE__START:
			setStart(START_EDEFAULT);
			return;
		case UPortoPackage.DEGREE__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case UPortoPackage.DEGREE__COURSE:
			getCourse().clear();
			return;
		case UPortoPackage.DEGREE__DIRECTOR:
			setDirector((Professor) null);
			return;
		case UPortoPackage.DEGREE__ASSISTANT_DIRECTOR:
			setAssistant_director((Professor) null);
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
		case UPortoPackage.DEGREE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UPortoPackage.DEGREE__ACRONYM:
			return ACRONYM_EDEFAULT == null ? acronym != null : !ACRONYM_EDEFAULT.equals(acronym);
		case UPortoPackage.DEGREE__ACADEMIC_DEGREE:
			return ACADEMIC_DEGREE_EDEFAULT == null ? academic_degree != null
					: !ACADEMIC_DEGREE_EDEFAULT.equals(academic_degree);
		case UPortoPackage.DEGREE__TYPE_OF_COURSE:
			return TYPE_OF_COURSE_EDEFAULT == null ? type_of_course != null
					: !TYPE_OF_COURSE_EDEFAULT.equals(type_of_course);
		case UPortoPackage.DEGREE__OFFICIAL_CODE:
			return OFFICIAL_CODE_EDEFAULT == null ? official_code != null
					: !OFFICIAL_CODE_EDEFAULT.equals(official_code);
		case UPortoPackage.DEGREE__START:
			return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
		case UPortoPackage.DEGREE__DURATION:
			return duration != DURATION_EDEFAULT;
		case UPortoPackage.DEGREE__COURSE:
			return course != null && !course.isEmpty();
		case UPortoPackage.DEGREE__DIRECTOR:
			return director != null;
		case UPortoPackage.DEGREE__ASSISTANT_DIRECTOR:
			return assistant_director != null;
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
		result.append(", acronym: ");
		result.append(acronym);
		result.append(", academic_degree: ");
		result.append(academic_degree);
		result.append(", type_of_course: ");
		result.append(type_of_course);
		result.append(", official_code: ");
		result.append(official_code);
		result.append(", start: ");
		result.append(start);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //DegreeImpl
