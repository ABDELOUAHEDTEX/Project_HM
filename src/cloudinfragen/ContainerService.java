/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.ContainerService#getClusterName <em>Cluster Name</em>}</li>
 *   <li>{@link cloudinfragen.ContainerService#getNumberOfContainers <em>Number Of Containers</em>}</li>
 *   <li>{@link cloudinfragen.ContainerService#getImage <em>Image</em>}</li>
 *   <li>{@link cloudinfragen.ContainerService#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link cloudinfragen.ContainerService#getSecurityGroups <em>Security Groups</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getContainerService()
 * @model
 * @generated
 */
public interface ContainerService extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Cluster Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster Name</em>' attribute.
	 * @see #setClusterName(String)
	 * @see cloudinfragen.CloudinfragenPackage#getContainerService_ClusterName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getClusterName();

	/**
	 * Sets the value of the '{@link cloudinfragen.ContainerService#getClusterName <em>Cluster Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster Name</em>' attribute.
	 * @see #getClusterName()
	 * @generated
	 */
	void setClusterName(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Containers</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Containers</em>' attribute.
	 * @see #setNumberOfContainers(int)
	 * @see cloudinfragen.CloudinfragenPackage#getContainerService_NumberOfContainers()
	 * @model default="1" unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfContainers();

	/**
	 * Sets the value of the '{@link cloudinfragen.ContainerService#getNumberOfContainers <em>Number Of Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Containers</em>' attribute.
	 * @see #getNumberOfContainers()
	 * @generated
	 */
	void setNumberOfContainers(int value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see cloudinfragen.CloudinfragenPackage#getContainerService_Image()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link cloudinfragen.ContainerService#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Subnets</b></em>' reference list.
	 * The list contents are of type {@link cloudinfragen.Subnet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets</em>' reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getContainerService_Subnets()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	EList<Subnet> getSubnets();

	/**
	 * Returns the value of the '<em><b>Security Groups</b></em>' reference list.
	 * The list contents are of type {@link cloudinfragen.SecurityGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Groups</em>' reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getContainerService_SecurityGroups()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	EList<SecurityGroup> getSecurityGroups();

} // ContainerService
