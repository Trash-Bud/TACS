/**
 */
package uPorto.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uPorto.Department;
import uPorto.Professor;
import uPorto.UPortoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uPorto.impl.ProfessorImpl#getName <em>Name</em>}</li>
 *   <li>{@link uPorto.impl.ProfessorImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link uPorto.impl.ProfessorImpl#getCode <em>Code</em>}</li>
 *   <li>{@link uPorto.impl.ProfessorImpl#getState <em>State</em>}</li>
 *   <li>{@link uPorto.impl.ProfessorImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link uPorto.impl.ProfessorImpl#getVoipd <em>Voipd</em>}</li>
 *   <li>{@link uPorto.impl.ProfessorImpl#getPhone_extention <em>Phone extention</em>}</li>
 *   <li>{@link uPorto.impl.ProfessorImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link uPorto.impl.ProfessorImpl#getCareer <em>Career</em>}</li>
 *   <li>{@link uPorto.impl.ProfessorImpl#getProfessional_group <em>Professional group</em>}</li>
 *   <li>{@link uPorto.impl.ProfessorImpl#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfessorImpl extends MinimalEObjectImpl.Container implements Professor {
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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected int code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoipd() <em>Voipd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoipd()
	 * @generated
	 * @ordered
	 */
	protected static final int VOIPD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVoipd() <em>Voipd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoipd()
	 * @generated
	 * @ordered
	 */
	protected int voipd = VOIPD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone_extention() <em>Phone extention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone_extention()
	 * @generated
	 * @ordered
	 */
	protected static final int PHONE_EXTENTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhone_extention() <em>Phone extention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone_extention()
	 * @generated
	 * @ordered
	 */
	protected int phone_extention = PHONE_EXTENTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCareer() <em>Career</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareer()
	 * @generated
	 * @ordered
	 */
	protected static final String CAREER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCareer() <em>Career</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareer()
	 * @generated
	 * @ordered
	 */
	protected String career = CAREER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfessional_group() <em>Professional group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessional_group()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFESSIONAL_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfessional_group() <em>Professional group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessional_group()
	 * @generated
	 * @ordered
	 */
	protected String professional_group = PROFESSIONAL_GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected Department department;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UPortoPackage.Literals.PROFESSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.PROFESSOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.PROFESSOR__ACRONYM, oldAcronym,
					acronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(int newCode) {
		int oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.PROFESSOR__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.PROFESSOR__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.PROFESSOR__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVoipd() {
		return voipd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoipd(int newVoipd) {
		int oldVoipd = voipd;
		voipd = newVoipd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.PROFESSOR__VOIPD, oldVoipd, voipd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPhone_extention() {
		return phone_extention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhone_extention(int newPhone_extention) {
		int oldPhone_extention = phone_extention;
		phone_extention = newPhone_extention;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.PROFESSOR__PHONE_EXTENTION,
					oldPhone_extention, phone_extention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.PROFESSOR__CATEGORY, oldCategory,
					category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCareer() {
		return career;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCareer(String newCareer) {
		String oldCareer = career;
		career = newCareer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.PROFESSOR__CAREER, oldCareer, career));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProfessional_group() {
		return professional_group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProfessional_group(String newProfessional_group) {
		String oldProfessional_group = professional_group;
		professional_group = newProfessional_group;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.PROFESSOR__PROFESSIONAL_GROUP,
					oldProfessional_group, professional_group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department getDepartment() {
		if (department != null && department.eIsProxy()) {
			InternalEObject oldDepartment = (InternalEObject) department;
			department = (Department) eResolveProxy(oldDepartment);
			if (department != oldDepartment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UPortoPackage.PROFESSOR__DEPARTMENT,
							oldDepartment, department));
			}
		}
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department basicGetDepartment() {
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepartment(Department newDepartment) {
		Department oldDepartment = department;
		department = newDepartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.PROFESSOR__DEPARTMENT, oldDepartment,
					department));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UPortoPackage.PROFESSOR__NAME:
			return getName();
		case UPortoPackage.PROFESSOR__ACRONYM:
			return getAcronym();
		case UPortoPackage.PROFESSOR__CODE:
			return getCode();
		case UPortoPackage.PROFESSOR__STATE:
			return getState();
		case UPortoPackage.PROFESSOR__EMAIL:
			return getEmail();
		case UPortoPackage.PROFESSOR__VOIPD:
			return getVoipd();
		case UPortoPackage.PROFESSOR__PHONE_EXTENTION:
			return getPhone_extention();
		case UPortoPackage.PROFESSOR__CATEGORY:
			return getCategory();
		case UPortoPackage.PROFESSOR__CAREER:
			return getCareer();
		case UPortoPackage.PROFESSOR__PROFESSIONAL_GROUP:
			return getProfessional_group();
		case UPortoPackage.PROFESSOR__DEPARTMENT:
			if (resolve)
				return getDepartment();
			return basicGetDepartment();
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
		case UPortoPackage.PROFESSOR__NAME:
			setName((String) newValue);
			return;
		case UPortoPackage.PROFESSOR__ACRONYM:
			setAcronym((String) newValue);
			return;
		case UPortoPackage.PROFESSOR__CODE:
			setCode((Integer) newValue);
			return;
		case UPortoPackage.PROFESSOR__STATE:
			setState((String) newValue);
			return;
		case UPortoPackage.PROFESSOR__EMAIL:
			setEmail((String) newValue);
			return;
		case UPortoPackage.PROFESSOR__VOIPD:
			setVoipd((Integer) newValue);
			return;
		case UPortoPackage.PROFESSOR__PHONE_EXTENTION:
			setPhone_extention((Integer) newValue);
			return;
		case UPortoPackage.PROFESSOR__CATEGORY:
			setCategory((String) newValue);
			return;
		case UPortoPackage.PROFESSOR__CAREER:
			setCareer((String) newValue);
			return;
		case UPortoPackage.PROFESSOR__PROFESSIONAL_GROUP:
			setProfessional_group((String) newValue);
			return;
		case UPortoPackage.PROFESSOR__DEPARTMENT:
			setDepartment((Department) newValue);
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
		case UPortoPackage.PROFESSOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UPortoPackage.PROFESSOR__ACRONYM:
			setAcronym(ACRONYM_EDEFAULT);
			return;
		case UPortoPackage.PROFESSOR__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case UPortoPackage.PROFESSOR__STATE:
			setState(STATE_EDEFAULT);
			return;
		case UPortoPackage.PROFESSOR__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case UPortoPackage.PROFESSOR__VOIPD:
			setVoipd(VOIPD_EDEFAULT);
			return;
		case UPortoPackage.PROFESSOR__PHONE_EXTENTION:
			setPhone_extention(PHONE_EXTENTION_EDEFAULT);
			return;
		case UPortoPackage.PROFESSOR__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case UPortoPackage.PROFESSOR__CAREER:
			setCareer(CAREER_EDEFAULT);
			return;
		case UPortoPackage.PROFESSOR__PROFESSIONAL_GROUP:
			setProfessional_group(PROFESSIONAL_GROUP_EDEFAULT);
			return;
		case UPortoPackage.PROFESSOR__DEPARTMENT:
			setDepartment((Department) null);
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
		case UPortoPackage.PROFESSOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UPortoPackage.PROFESSOR__ACRONYM:
			return ACRONYM_EDEFAULT == null ? acronym != null : !ACRONYM_EDEFAULT.equals(acronym);
		case UPortoPackage.PROFESSOR__CODE:
			return code != CODE_EDEFAULT;
		case UPortoPackage.PROFESSOR__STATE:
			return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
		case UPortoPackage.PROFESSOR__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case UPortoPackage.PROFESSOR__VOIPD:
			return voipd != VOIPD_EDEFAULT;
		case UPortoPackage.PROFESSOR__PHONE_EXTENTION:
			return phone_extention != PHONE_EXTENTION_EDEFAULT;
		case UPortoPackage.PROFESSOR__CATEGORY:
			return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
		case UPortoPackage.PROFESSOR__CAREER:
			return CAREER_EDEFAULT == null ? career != null : !CAREER_EDEFAULT.equals(career);
		case UPortoPackage.PROFESSOR__PROFESSIONAL_GROUP:
			return PROFESSIONAL_GROUP_EDEFAULT == null ? professional_group != null
					: !PROFESSIONAL_GROUP_EDEFAULT.equals(professional_group);
		case UPortoPackage.PROFESSOR__DEPARTMENT:
			return department != null;
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
		result.append(", code: ");
		result.append(code);
		result.append(", state: ");
		result.append(state);
		result.append(", email: ");
		result.append(email);
		result.append(", voipd: ");
		result.append(voipd);
		result.append(", phone_extention: ");
		result.append(phone_extention);
		result.append(", category: ");
		result.append(category);
		result.append(", career: ");
		result.append(career);
		result.append(", professional_group: ");
		result.append(professional_group);
		result.append(')');
		return result.toString();
	}

} //ProfessorImpl
