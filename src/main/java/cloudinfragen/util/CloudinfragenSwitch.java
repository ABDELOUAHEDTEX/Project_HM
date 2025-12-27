/**
 */
package cloudinfragen.util;

import cloudinfragen.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cloudinfragen.CloudinfragenPackage
 * @generated
 */
public class CloudinfragenSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CloudinfragenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudinfragenSwitch() {
		if (modelPackage == null) {
			modelPackage = CloudinfragenPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CloudinfragenPackage.INFRASTRUCTURE: {
				Infrastructure infrastructure = (Infrastructure)theEObject;
				T result = caseInfrastructure(infrastructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.CLOUD_RESOURCE: {
				CloudResource cloudResource = (CloudResource)theEObject;
				T result = caseCloudResource(cloudResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.COMPUTE_INSTANCE: {
				ComputeInstance computeInstance = (ComputeInstance)theEObject;
				T result = caseComputeInstance(computeInstance);
				if (result == null) result = caseCloudResource(computeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.AUTO_SCALING_GROUP: {
				AutoScalingGroup autoScalingGroup = (AutoScalingGroup)theEObject;
				T result = caseAutoScalingGroup(autoScalingGroup);
				if (result == null) result = caseCloudResource(autoScalingGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.VOLUME: {
				Volume volume = (Volume)theEObject;
				T result = caseVolume(volume);
				if (result == null) result = caseCloudResource(volume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.STORAGE_BUCKET: {
				StorageBucket storageBucket = (StorageBucket)theEObject;
				T result = caseStorageBucket(storageBucket);
				if (result == null) result = caseCloudResource(storageBucket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.FILE_SYSTEM: {
				FileSystem fileSystem = (FileSystem)theEObject;
				T result = caseFileSystem(fileSystem);
				if (result == null) result = caseCloudResource(fileSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.VPC: {
				VPC vpc = (VPC)theEObject;
				T result = caseVPC(vpc);
				if (result == null) result = caseCloudResource(vpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.SUBNET: {
				Subnet subnet = (Subnet)theEObject;
				T result = caseSubnet(subnet);
				if (result == null) result = caseCloudResource(subnet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.ROUTE_TABLE: {
				RouteTable routeTable = (RouteTable)theEObject;
				T result = caseRouteTable(routeTable);
				if (result == null) result = caseCloudResource(routeTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.SECURITY_GROUP: {
				SecurityGroup securityGroup = (SecurityGroup)theEObject;
				T result = caseSecurityGroup(securityGroup);
				if (result == null) result = caseCloudResource(securityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.LOAD_BALANCER: {
				LoadBalancer loadBalancer = (LoadBalancer)theEObject;
				T result = caseLoadBalancer(loadBalancer);
				if (result == null) result = caseCloudResource(loadBalancer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.IAM_ENTITY: {
				IAMEntity iamEntity = (IAMEntity)theEObject;
				T result = caseIAMEntity(iamEntity);
				if (result == null) result = caseCloudResource(iamEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.CONTAINER_SERVICE: {
				ContainerService containerService = (ContainerService)theEObject;
				T result = caseContainerService(containerService);
				if (result == null) result = caseCloudResource(containerService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseCloudResource(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.DATABASE_INSTANCE: {
				DatabaseInstance databaseInstance = (DatabaseInstance)theEObject;
				T result = caseDatabaseInstance(databaseInstance);
				if (result == null) result = caseCloudResource(databaseInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.NO_SQL_DATABASE: {
				NoSQLDatabase noSQLDatabase = (NoSQLDatabase)theEObject;
				T result = caseNoSQLDatabase(noSQLDatabase);
				if (result == null) result = caseCloudResource(noSQLDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.NETWORK_INTERFACE: {
				NetworkInterface networkInterface = (NetworkInterface)theEObject;
				T result = caseNetworkInterface(networkInterface);
				if (result == null) result = caseCloudResource(networkInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.IAM_ROLE: {
				IAMRole iamRole = (IAMRole)theEObject;
				T result = caseIAMRole(iamRole);
				if (result == null) result = caseCloudResource(iamRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.IAM_POLICY: {
				IAMPolicy iamPolicy = (IAMPolicy)theEObject;
				T result = caseIAMPolicy(iamPolicy);
				if (result == null) result = caseCloudResource(iamPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.SECRET: {
				Secret secret = (Secret)theEObject;
				T result = caseSecret(secret);
				if (result == null) result = caseCloudResource(secret);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudinfragenPackage.MONITORING_SERVICE: {
				MonitoringService monitoringService = (MonitoringService)theEObject;
				T result = caseMonitoringService(monitoringService);
				if (result == null) result = caseCloudResource(monitoringService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructure(Infrastructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudResource(CloudResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compute Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compute Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputeInstance(ComputeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Scaling Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Scaling Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoScalingGroup(AutoScalingGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolume(Volume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageBucket(StorageBucket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSystem(FileSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVPC(VPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnet(Subnet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteTable(RouteTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityGroup(SecurityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Balancer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Balancer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadBalancer(LoadBalancer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAM Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAM Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAMEntity(IAMEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerService(ContainerService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseInstance(DatabaseInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No SQL Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No SQL Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoSQLDatabase(NoSQLDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkInterface(NetworkInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAM Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAM Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAMRole(IAMRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAM Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAM Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAMPolicy(IAMPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secret</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secret</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecret(Secret object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitoring Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitoring Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoringService(MonitoringService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CloudinfragenSwitch
