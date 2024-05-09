/**
 */
package uPorto.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uPorto.Student;
import uPorto.UPortoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uPorto.impl.StudentImpl#getName <em>Name</em>}</li>
 *   <li>{@link uPorto.impl.StudentImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link uPorto.impl.StudentImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link uPorto.impl.StudentImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link uPorto.impl.StudentImpl#getDate_of_birth <em>Date of birth</em>}</li>
 *   <li>{@link uPorto.impl.StudentImpl#getMarital_status <em>Marital status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student {
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
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final String GENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected String gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_of_birth() <em>Date of birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_of_birth()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate_of_birth() <em>Date of birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_of_birth()
	 * @generated
	 * @ordered
	 */
	protected Date date_of_birth = DATE_OF_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarital_status() <em>Marital status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarital_status()
	 * @generated
	 * @ordered
	 */
	protected static final String MARITAL_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarital_status() <em>Marital status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarital_status()
	 * @generated
	 * @ordered
	 */
	protected String marital_status = MARITAL_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UPortoPackage.Literals.STUDENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.STUDENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.STUDENT__NUMBER, oldNumber, number));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.STUDENT__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(String newGender) {
		String oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.STUDENT__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate_of_birth() {
		return date_of_birth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate_of_birth(Date newDate_of_birth) {
		Date oldDate_of_birth = date_of_birth;
		date_of_birth = newDate_of_birth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.STUDENT__DATE_OF_BIRTH,
					oldDate_of_birth, date_of_birth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarital_status() {
		return marital_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarital_status(String newMarital_status) {
		String oldMarital_status = marital_status;
		marital_status = newMarital_status;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPortoPackage.STUDENT__MARITAL_STATUS,
					oldMarital_status, marital_status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UPortoPackage.STUDENT__NAME:
			return getName();
		case UPortoPackage.STUDENT__NUMBER:
			return getNumber();
		case UPortoPackage.STUDENT__EMAIL:
			return getEmail();
		case UPortoPackage.STUDENT__GENDER:
			return getGender();
		case UPortoPackage.STUDENT__DATE_OF_BIRTH:
			return getDate_of_birth();
		case UPortoPackage.STUDENT__MARITAL_STATUS:
			return getMarital_status();
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
		case UPortoPackage.STUDENT__NAME:
			setName((String) newValue);
			return;
		case UPortoPackage.STUDENT__NUMBER:
			setNumber((Integer) newValue);
			return;
		case UPortoPackage.STUDENT__EMAIL:
			setEmail((String) newValue);
			return;
		case UPortoPackage.STUDENT__GENDER:
			setGender((String) newValue);
			return;
		case UPortoPackage.STUDENT__DATE_OF_BIRTH:
			setDate_of_birth((Date) newValue);
			return;
		case UPortoPackage.STUDENT__MARITAL_STATUS:
			setMarital_status((String) newValue);
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
		case UPortoPackage.STUDENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UPortoPackage.STUDENT__NUMBER:
			setNumber(NUMBER_EDEFAULT);
			return;
		case UPortoPackage.STUDENT__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case UPortoPackage.STUDENT__GENDER:
			setGender(GENDER_EDEFAULT);
			return;
		case UPortoPackage.STUDENT__DATE_OF_BIRTH:
			setDate_of_birth(DATE_OF_BIRTH_EDEFAULT);
			return;
		case UPortoPackage.STUDENT__MARITAL_STATUS:
			setMarital_status(MARITAL_STATUS_EDEFAULT);
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
		case UPortoPackage.STUDENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UPortoPackage.STUDENT__NUMBER:
			return number != NUMBER_EDEFAULT;
		case UPortoPackage.STUDENT__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case UPortoPackage.STUDENT__GENDER:
			return GENDER_EDEFAULT == null ? gender != null : !GENDER_EDEFAULT.equals(gender);
		case UPortoPackage.STUDENT__DATE_OF_BIRTH:
			return DATE_OF_BIRTH_EDEFAULT == null ? date_of_birth != null
					: !DATE_OF_BIRTH_EDEFAULT.equals(date_of_birth);
		case UPortoPackage.STUDENT__MARITAL_STATUS:
			return MARITAL_STATUS_EDEFAULT == null ? marital_status != null
					: !MARITAL_STATUS_EDEFAULT.equals(marital_status);
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
		result.append(", number: ");
		result.append(number);
		result.append(", email: ");
		result.append(email);
		result.append(", gender: ");
		result.append(gender);
		result.append(", date_of_birth: ");
		result.append(date_of_birth);
		result.append(", marital_status: ");
		result.append(marital_status);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
