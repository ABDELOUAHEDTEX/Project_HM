/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Balancer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.LoadBalancer#getType <em>Type</em>}</li>
 *   <li>{@link cloudinfragen.LoadBalancer#getAutoScalingGroups <em>Auto Scaling Groups</em>}</li>
 *   <li>{@link cloudinfragen.LoadBalancer#getInstances <em>Instances</em>}</li>
 *   <li>{@link cloudinfragen.LoadBalancer#getSubnets <em>Subnets</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getLoadBalancer()
 * @model
 * @generated
 */
public interface LoadBalancer extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see cloudinfragen.CloudinfragenPackage#getLoadBalancer_Type()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link cloudinfragen.LoadBalancer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Auto Scaling Groups</b></em>' reference list.
	 * The list contents are of type {@link cloudinfragen.AutoScalingGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Scaling Groups</em>' reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getLoadBalancer_AutoScalingGroups()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	EList<AutoScalingGroup> getAutoScalingGroups();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link cloudinfragen.ComputeInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getLoadBalancer_Instances()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	EList<ComputeInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Subnets</b></em>' reference list.
	 * The list contents are of type {@link cloudinfragen.Subnet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets</em>' reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getLoadBalancer_Subnets()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	EList<Subnet> getSubnets();

} // LoadBalancer
