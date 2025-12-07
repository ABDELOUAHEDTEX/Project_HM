/**
 */
package cloudinfragen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cloudinfragen.CloudinfragenPackage
 * @generated
 */
public interface CloudinfragenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudinfragenFactory eINSTANCE = cloudinfragen.impl.CloudinfragenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure</em>'.
	 * @generated
	 */
	Infrastructure createInfrastructure();

	/**
	 * Returns a new object of class '<em>Compute Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compute Instance</em>'.
	 * @generated
	 */
	ComputeInstance createComputeInstance();

	/**
	 * Returns a new object of class '<em>Auto Scaling Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Scaling Group</em>'.
	 * @generated
	 */
	AutoScalingGroup createAutoScalingGroup();

	/**
	 * Returns a new object of class '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume</em>'.
	 * @generated
	 */
	Volume createVolume();

	/**
	 * Returns a new object of class '<em>Storage Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Bucket</em>'.
	 * @generated
	 */
	StorageBucket createStorageBucket();

	/**
	 * Returns a new object of class '<em>File System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File System</em>'.
	 * @generated
	 */
	FileSystem createFileSystem();

	/**
	 * Returns a new object of class '<em>VPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VPC</em>'.
	 * @generated
	 */
	VPC createVPC();

	/**
	 * Returns a new object of class '<em>Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subnet</em>'.
	 * @generated
	 */
	Subnet createSubnet();

	/**
	 * Returns a new object of class '<em>Route Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Table</em>'.
	 * @generated
	 */
	RouteTable createRouteTable();

	/**
	 * Returns a new object of class '<em>Network Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Interface</em>'.
	 * @generated
	 */
	NetworkInterface createNetworkInterface();

	/**
	 * Returns a new object of class '<em>Security Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Group</em>'.
	 * @generated
	 */
	SecurityGroup createSecurityGroup();

	/**
	 * Returns a new object of class '<em>Load Balancer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Balancer</em>'.
	 * @generated
	 */
	LoadBalancer createLoadBalancer();

	/**
	 * Returns a new object of class '<em>Database Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Instance</em>'.
	 * @generated
	 */
	DatabaseInstance createDatabaseInstance();

	/**
	 * Returns a new object of class '<em>No SQL Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No SQL Database</em>'.
	 * @generated
	 */
	NoSQLDatabase createNoSQLDatabase();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Container Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Service</em>'.
	 * @generated
	 */
	ContainerService createContainerService();

	/**
	 * Returns a new object of class '<em>IAM Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IAM Role</em>'.
	 * @generated
	 */
	IAMRole createIAMRole();

	/**
	 * Returns a new object of class '<em>IAM Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IAM Policy</em>'.
	 * @generated
	 */
	IAMPolicy createIAMPolicy();

	/**
	 * Returns a new object of class '<em>Config Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Parameter</em>'.
	 * @generated
	 */
	ConfigParameter createConfigParameter();

	/**
	 * Returns a new object of class '<em>Secret</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secret</em>'.
	 * @generated
	 */
	Secret createSecret();

	/**
	 * Returns a new object of class '<em>Monitoring Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitoring Service</em>'.
	 * @generated
	 */
	MonitoringService createMonitoringService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CloudinfragenPackage getCloudinfragenPackage();

} //CloudinfragenFactory
