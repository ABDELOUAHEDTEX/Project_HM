/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.NetworkInterface#getPrivateIP <em>Private IP</em>}</li>
 *   <li>{@link cloudinfragen.NetworkInterface#getPublicIP <em>Public IP</em>}</li>
 *   <li>{@link cloudinfragen.NetworkInterface#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link cloudinfragen.NetworkInterface#getSecurityGroups <em>Security Groups</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getNetworkInterface()
 * @model
 * @generated
 */
public interface NetworkInterface extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Private IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private IP</em>' attribute.
	 * @see #setPrivateIP(String)
	 * @see cloudinfragen.CloudinfragenPackage#getNetworkInterface_PrivateIP()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getPrivateIP();

	/**
	 * Sets the value of the '{@link cloudinfragen.NetworkInterface#getPrivateIP <em>Private IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private IP</em>' attribute.
	 * @see #getPrivateIP()
	 * @generated
	 */
	void setPrivateIP(String value);

	/**
	 * Returns the value of the '<em><b>Public IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public IP</em>' attribute.
	 * @see #setPublicIP(String)
	 * @see cloudinfragen.CloudinfragenPackage#getNetworkInterface_PublicIP()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getPublicIP();

	/**
	 * Sets the value of the '{@link cloudinfragen.NetworkInterface#getPublicIP <em>Public IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public IP</em>' attribute.
	 * @see #getPublicIP()
	 * @generated
	 */
	void setPublicIP(String value);

	/**
	 * Returns the value of the '<em><b>Subnet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet</em>' reference.
	 * @see cloudinfragen.CloudinfragenPackage#getNetworkInterface_Subnet()
	 * @model required="true" changeable="false" ordered="false"
	 * @generated
	 */
	Subnet getSubnet();

	/**
	 * Returns the value of the '<em><b>Security Groups</b></em>' reference list.
	 * The list contents are of type {@link cloudinfragen.SecurityGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Groups</em>' reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getNetworkInterface_SecurityGroups()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	EList<SecurityGroup> getSecurityGroups();

} // NetworkInterface
