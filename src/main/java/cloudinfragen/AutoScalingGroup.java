/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Scaling Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.AutoScalingGroup#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link cloudinfragen.AutoScalingGroup#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link cloudinfragen.AutoScalingGroup#getDesiredCapacity <em>Desired Capacity</em>}</li>
 *   <li>{@link cloudinfragen.AutoScalingGroup#getTemplate <em>Template</em>}</li>
 *   <li>{@link cloudinfragen.AutoScalingGroup#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getAutoScalingGroup()
 * @model
 * @generated
 */
public interface AutoScalingGroup extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Min Size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Size</em>' attribute.
	 * @see #setMinSize(int)
	 * @see cloudinfragen.CloudinfragenPackage#getAutoScalingGroup_MinSize()
	 * @model default="1" unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getMinSize();

	/**
	 * Sets the value of the '{@link cloudinfragen.AutoScalingGroup#getMinSize <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Size</em>' attribute.
	 * @see #getMinSize()
	 * @generated
	 */
	void setMinSize(int value);

	/**
	 * Returns the value of the '<em><b>Max Size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Size</em>' attribute.
	 * @see #setMaxSize(int)
	 * @see cloudinfragen.CloudinfragenPackage#getAutoScalingGroup_MaxSize()
	 * @model default="1" unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getMaxSize();

	/**
	 * Sets the value of the '{@link cloudinfragen.AutoScalingGroup#getMaxSize <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' attribute.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(int value);

	/**
	 * Returns the value of the '<em><b>Desired Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired Capacity</em>' attribute.
	 * @see #setDesiredCapacity(int)
	 * @see cloudinfragen.CloudinfragenPackage#getAutoScalingGroup_DesiredCapacity()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getDesiredCapacity();

	/**
	 * Sets the value of the '{@link cloudinfragen.AutoScalingGroup#getDesiredCapacity <em>Desired Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Capacity</em>' attribute.
	 * @see #getDesiredCapacity()
	 * @generated
	 */
	void setDesiredCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(ComputeInstance)
	 * @see cloudinfragen.CloudinfragenPackage#getAutoScalingGroup_Template()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComputeInstance getTemplate();

	/**
	 * Sets the value of the '{@link cloudinfragen.AutoScalingGroup#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(ComputeInstance value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link cloudinfragen.ComputeInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getAutoScalingGroup_Instances()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	EList<ComputeInstance> getInstances();

} // AutoScalingGroup
