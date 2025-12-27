/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.VPC#getCidrBlock <em>Cidr Block</em>}</li>
 *   <li>{@link cloudinfragen.VPC#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link cloudinfragen.VPC#getRouteTables <em>Route Tables</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getVPC()
 * @model
 * @generated
 */
public interface VPC extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Cidr Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr Block</em>' attribute.
	 * @see #setCidrBlock(String)
	 * @see cloudinfragen.CloudinfragenPackage#getVPC_CidrBlock()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getCidrBlock();

	/**
	 * Sets the value of the '{@link cloudinfragen.VPC#getCidrBlock <em>Cidr Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr Block</em>' attribute.
	 * @see #getCidrBlock()
	 * @generated
	 */
	void setCidrBlock(String value);

	/**
	 * Returns the value of the '<em><b>Subnets</b></em>' containment reference list.
	 * The list contents are of type {@link cloudinfragen.Subnet}.
	 * It is bidirectional and its opposite is '{@link cloudinfragen.Subnet#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets</em>' containment reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getVPC_Subnets()
	 * @see cloudinfragen.Subnet#getVpc
	 * @model opposite="vpc" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Subnet> getSubnets();

	/**
	 * Returns the value of the '<em><b>Route Tables</b></em>' containment reference list.
	 * The list contents are of type {@link cloudinfragen.RouteTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Tables</em>' containment reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getVPC_RouteTables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RouteTable> getRouteTables();

} // VPC
