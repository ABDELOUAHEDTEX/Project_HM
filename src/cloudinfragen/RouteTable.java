/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.RouteTable#getRoutes <em>Routes</em>}</li>
 *   <li>{@link cloudinfragen.RouteTable#getSubnets <em>Subnets</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getRouteTable()
 * @model
 * @generated
 */
public interface RouteTable extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Routes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' attribute list.
	 * @see cloudinfragen.CloudinfragenPackage#getRouteTable_Routes()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getRoutes();

	/**
	 * Returns the value of the '<em><b>Subnets</b></em>' reference list.
	 * The list contents are of type {@link cloudinfragen.Subnet}.
	 * It is bidirectional and its opposite is '{@link cloudinfragen.Subnet#getRouteTable <em>Route Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets</em>' reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getRouteTable_Subnets()
	 * @see cloudinfragen.Subnet#getRouteTable
	 * @model opposite="routeTable" changeable="false" ordered="false"
	 * @generated
	 */
	EList<Subnet> getSubnets();

} // RouteTable
