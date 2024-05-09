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

import uPorto.Degree;
import uPorto.Department;
import uPorto.Faculty;
import uPorto.Professor;
import uPorto.UPortoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Faculty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uPorto.impl.FacultyImpl#getName <em>Name</em>}</li>
 *   <li>{@link uPorto.impl.FacultyImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link uPorto.impl.FacultyImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link uPorto.impl.FacultyImpl#getProfessor <em>Professor</em>}</li>
 *   <li>{@link uPorto.impl.FacultyImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link uPorto.impl.FacultyImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link uPorto.impl.FacultyImpl#getPolo <em>Polo</em>}</li>
 *   <li>{@link uPorto.impl.FacultyImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link uPorto.impl.FacultyImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link uPorto.impl.FacultyImpl#getWebsite <em>Website</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacultyImpl extends MinimalEObjectImpl.Container implements Faculty {
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
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected EList<Degree> degree;

	/**
	 * The cached value of the '{@link #getProfessor() <em>Professor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Professor> professor;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected EList<Department> department;

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
	 * The default value of the '{@link #getPolo() <em>Polo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolo()
	 * @generated
	 * @ordered
	 */
	protected static final String POLO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolo() <em>Polo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolo()
	 * @generated
	 * @ordered
	 */
	protected String polo = POLO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final int PHONE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected int phone = PHONE_EDEFAULT;

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
	 * The default value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected String website = WEBSITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacultyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UPortoPackage.Literals.FACULTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.FACULTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.FACULTY__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Degree> getDegree() {
		if (degree == null) {
			degree = new EObjectContainmentEList<Degree>(Degree.class, this, UPortoPackage.FACULTY__DEGREE);
		}
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Professor> getProfessor() {
		if (professor == null) {
			professor = new EObjectContainmentEList<Professor>(Professor.class, this, UPortoPackage.FACULTY__PROFESSOR);
		}
		return professor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Department> getDepartment() {
		if (department == null) {
			department = new EObjectContainmentEList<Department>(Department.class, this,
					UPortoPackage.FACULTY__DEPARTMENT);
		}
		return department;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.FACULTY__ACRONYM, oldAcronym, acronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolo() {
		return polo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolo(String newPolo) {
		String oldPolo = polo;
		polo = newPolo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.FACULTY__POLO, oldPolo, polo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhone(int newPhone) {
		int oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.FACULTY__PHONE, oldPhone, phone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.FACULTY__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebsite() {
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebsite(String newWebsite) {
		String oldWebsite = website;
		website = newWebsite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.FACULTY__WEBSITE, oldWebsite, website));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UPortoPackage.FACULTY__DEGREE:
			return ((InternalEList<?>) getDegree()).basicRemove(otherEnd, msgs);
		case UPortoPackage.FACULTY__PROFESSOR:
			return ((InternalEList<?>) getProfessor()).basicRemove(otherEnd, msgs);
		case UPortoPackage.FACULTY__DEPARTMENT:
			return ((InternalEList<?>) getDepartment()).basicRemove(otherEnd, msgs);
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
		case UPortoPackage.FACULTY__NAME:
			return getName();
		case UPortoPackage.FACULTY__ADDRESS:
			return getAddress();
		case UPortoPackage.FACULTY__DEGREE:
			return getDegree();
		case UPortoPackage.FACULTY__PROFESSOR:
			return getProfessor();
		case UPortoPackage.FACULTY__DEPARTMENT:
			return getDepartment();
		case UPortoPackage.FACULTY__ACRONYM:
			return getAcronym();
		case UPortoPackage.FACULTY__POLO:
			return getPolo();
		case UPortoPackage.FACULTY__PHONE:
			return getPhone();
		case UPortoPackage.FACULTY__EMAIL:
			return getEmail();
		case UPortoPackage.FACULTY__WEBSITE:
			return getWebsite();
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
		case UPortoPackage.FACULTY__NAME:
			setName((String) newValue);
			return;
		case UPortoPackage.FACULTY__ADDRESS:
			setAddress((String) newValue);
			return;
		case UPortoPackage.FACULTY__DEGREE:
			getDegree().clear();
			getDegree().addAll((Collection<? extends Degree>) newValue);
			return;
		case UPortoPackage.FACULTY__PROFESSOR:
			getProfessor().clear();
			getProfessor().addAll((Collection<? extends Professor>) newValue);
			return;
		case UPortoPackage.FACULTY__DEPARTMENT:
			getDepartment().clear();
			getDepartment().addAll((Collection<? extends Department>) newValue);
			return;
		case UPortoPackage.FACULTY__ACRONYM:
			setAcronym((String) newValue);
			return;
		case UPortoPackage.FACULTY__POLO:
			setPolo((String) newValue);
			return;
		case UPortoPackage.FACULTY__PHONE:
			setPhone((Integer) newValue);
			return;
		case UPortoPackage.FACULTY__EMAIL:
			setEmail((String) newValue);
			return;
		case UPortoPackage.FACULTY__WEBSITE:
			setWebsite((String) newValue);
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
		case UPortoPackage.FACULTY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UPortoPackage.FACULTY__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case UPortoPackage.FACULTY__DEGREE:
			getDegree().clear();
			return;
		case UPortoPackage.FACULTY__PROFESSOR:
			getProfessor().clear();
			return;
		case UPortoPackage.FACULTY__DEPARTMENT:
			getDepartment().clear();
			return;
		case UPortoPackage.FACULTY__ACRONYM:
			setAcronym(ACRONYM_EDEFAULT);
			return;
		case UPortoPackage.FACULTY__POLO:
			setPolo(POLO_EDEFAULT);
			return;
		case UPortoPackage.FACULTY__PHONE:
			setPhone(PHONE_EDEFAULT);
			return;
		case UPortoPackage.FACULTY__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case UPortoPackage.FACULTY__WEBSITE:
			setWebsite(WEBSITE_EDEFAULT);
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
		case UPortoPackage.FACULTY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UPortoPackage.FACULTY__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case UPortoPackage.FACULTY__DEGREE:
			return degree != null && !degree.isEmpty();
		case UPortoPackage.FACULTY__PROFESSOR:
			return professor != null && !professor.isEmpty();
		case UPortoPackage.FACULTY__DEPARTMENT:
			return department != null && !department.isEmpty();
		case UPortoPackage.FACULTY__ACRONYM:
			return ACRONYM_EDEFAULT == null ? acronym != null : !ACRONYM_EDEFAULT.equals(acronym);
		case UPortoPackage.FACULTY__POLO:
			return POLO_EDEFAULT == null ? polo != null : !POLO_EDEFAULT.equals(polo);
		case UPortoPackage.FACULTY__PHONE:
			return phone != PHONE_EDEFAULT;
		case UPortoPackage.FACULTY__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case UPortoPackage.FACULTY__WEBSITE:
			return WEBSITE_EDEFAULT == null ? website != null : !WEBSITE_EDEFAULT.equals(website);
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
		result.append(", address: ");
		result.append(address);
		result.append(", acronym: ");
		result.append(acronym);
		result.append(", polo: ");
		result.append(polo);
		result.append(", phone: ");
		result.append(phone);
		result.append(", email: ");
		result.append(email);
		result.append(", website: ");
		result.append(website);
		result.append(')');
		return result.toString();
	}

} //FacultyImpl
