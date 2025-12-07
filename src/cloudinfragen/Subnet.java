/**
 */
package cloudinfragen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.Subnet#getCidr <em>Cidr</em>}</li>
 *   <li>{@link cloudinfragen.Subnet#getAvailabilityZone <em>Availability Zone</em>}</li>
 *   <li>{@link cloudinfragen.Subnet#getVpc <em>Vpc</em>}</li>
 *   <li>{@link cloudinfragen.Subnet#getRouteTable <em>Route Table</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getSubnet()
 * @model
 * @generated
 */
public interface Subnet extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr</em>' attribute.
	 * @see #setCidr(String)
	 * @see cloudinfragen.CloudinfragenPackage#getSubnet_Cidr()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getCidr();

	/**
	 * Sets the value of the '{@link cloudinfragen.Subnet#getCidr <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr</em>' attribute.
	 * @see #getCidr()
	 * @generated
	 */
	void setCidr(String value);

	/**
	 * Returns the value of the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Zone</em>' attribute.
	 * @see #setAvailabilityZone(String)
	 * @see cloudinfragen.CloudinfragenPackage#getSubnet_AvailabilityZone()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getAvailabilityZone();

	/**
	 * Sets the value of the '{@link cloudinfragen.Subnet#getAvailabilityZone <em>Availability Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Zone</em>' attribute.
	 * @see #getAvailabilityZone()
	 * @generated
	 */
	void setAvailabilityZone(String value);

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cloudinfragen.VPC#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' container reference.
	 * @see cloudinfragen.CloudinfragenPackage#getSubnet_Vpc()
	 * @see cloudinfragen.VPC#getSubnets
	 * @model opposite="subnets" required="true" transient="false" changeable="false" ordered="false"
	 * @generated
	 */
	VPC getVpc();

	/**
	 * Returns the value of the '<em><b>Route Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cloudinfragen.RouteTable#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Table</em>' reference.
	 * @see cloudinfragen.CloudinfragenPackage#getSubnet_RouteTable()
	 * @see cloudinfragen.RouteTable#getSubnets
	 * @model opposite="subnets" changeable="false" ordered="false"
	 * @generated
	 */
	RouteTable getRouteTable();

} // Subnet
