/**
 */
package org.eclipse.emfforms.coffee.model.coffee;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RAM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfforms.coffee.model.coffee.RAM#getClockSpeed <em>Clock Speed</em>}</li>
 *   <li>{@link org.eclipse.emfforms.coffee.model.coffee.RAM#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.emfforms.coffee.model.coffee.RAM#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfforms.coffee.model.coffee.CoffeePackage#getRAM()
 * @model
 * @generated
 */
public interface RAM extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Speed</em>' attribute.
	 * @see #setClockSpeed(int)
	 * @see org.eclipse.emfforms.coffee.model.coffee.CoffeePackage#getRAM_ClockSpeed()
	 * @model
	 * @generated
	 */
	int getClockSpeed();

	/**
	 * Sets the value of the '{@link org.eclipse.emfforms.coffee.model.coffee.RAM#getClockSpeed <em>Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Speed</em>' attribute.
	 * @see #getClockSpeed()
	 * @generated
	 */
	void setClockSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.eclipse.emfforms.coffee.model.coffee.CoffeePackage#getRAM_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.emfforms.coffee.model.coffee.RAM#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emfforms.coffee.model.coffee.RamType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emfforms.coffee.model.coffee.RamType
	 * @see #setType(RamType)
	 * @see org.eclipse.emfforms.coffee.model.coffee.CoffeePackage#getRAM_Type()
	 * @model
	 * @generated
	 */
	RamType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emfforms.coffee.model.coffee.RAM#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emfforms.coffee.model.coffee.RamType
	 * @see #getType()
	 * @generated
	 */
	void setType(RamType value);

} // RAM
