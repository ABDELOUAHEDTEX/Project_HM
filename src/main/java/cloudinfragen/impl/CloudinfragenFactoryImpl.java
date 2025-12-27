/**
 */
package cloudinfragen.impl;

import cloudinfragen.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudinfragenFactoryImpl extends EFactoryImpl implements CloudinfragenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloudinfragenFactory init() {
		try {
			CloudinfragenFactory theCloudinfragenFactory = (CloudinfragenFactory)EPackage.Registry.INSTANCE.getEFactory(CloudinfragenPackage.eNS_URI);
			if (theCloudinfragenFactory != null) {
				return theCloudinfragenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CloudinfragenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudinfragenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CloudinfragenPackage.INFRASTRUCTURE: return createInfrastructure();
			case CloudinfragenPackage.COMPUTE_INSTANCE: return createComputeInstance();
			case CloudinfragenPackage.AUTO_SCALING_GROUP: return createAutoScalingGroup();
			case CloudinfragenPackage.VOLUME: return createVolume();
			case CloudinfragenPackage.STORAGE_BUCKET: return createStorageBucket();
			case CloudinfragenPackage.FILE_SYSTEM: return createFileSystem();
			case CloudinfragenPackage.VPC: return createVPC();
			case CloudinfragenPackage.SUBNET: return createSubnet();
			case CloudinfragenPackage.ROUTE_TABLE: return createRouteTable();
			case CloudinfragenPackage.SECURITY_GROUP: return createSecurityGroup();
			case CloudinfragenPackage.LOAD_BALANCER: return createLoadBalancer();
			case CloudinfragenPackage.IAM_ENTITY: return createIAMEntity();
			case CloudinfragenPackage.CONTAINER_SERVICE: return createContainerService();
			case CloudinfragenPackage.FUNCTION: return createFunction();
			case CloudinfragenPackage.DATABASE_INSTANCE: return createDatabaseInstance();
			case CloudinfragenPackage.NO_SQL_DATABASE: return createNoSQLDatabase();
			case CloudinfragenPackage.NETWORK_INTERFACE: return createNetworkInterface();
			case CloudinfragenPackage.IAM_ROLE: return createIAMRole();
			case CloudinfragenPackage.IAM_POLICY: return createIAMPolicy();
			case CloudinfragenPackage.SECRET: return createSecret();
			case CloudinfragenPackage.MONITORING_SERVICE: return createMonitoringService();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Infrastructure createInfrastructure() {
		InfrastructureImpl infrastructure = new InfrastructureImpl();
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputeInstance createComputeInstance() {
		ComputeInstanceImpl computeInstance = new ComputeInstanceImpl();
		return computeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutoScalingGroup createAutoScalingGroup() {
		AutoScalingGroupImpl autoScalingGroup = new AutoScalingGroupImpl();
		return autoScalingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageBucket createStorageBucket() {
		StorageBucketImpl storageBucket = new StorageBucketImpl();
		return storageBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileSystem createFileSystem() {
		FileSystemImpl fileSystem = new FileSystemImpl();
		return fileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VPC createVPC() {
		VPCImpl vpc = new VPCImpl();
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subnet createSubnet() {
		SubnetImpl subnet = new SubnetImpl();
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteTable createRouteTable() {
		RouteTableImpl routeTable = new RouteTableImpl();
		return routeTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroup createSecurityGroup() {
		SecurityGroupImpl securityGroup = new SecurityGroupImpl();
		return securityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadBalancer createLoadBalancer() {
		LoadBalancerImpl loadBalancer = new LoadBalancerImpl();
		return loadBalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAMEntity createIAMEntity() {
		IAMEntityImpl iamEntity = new IAMEntityImpl();
		return iamEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerService createContainerService() {
		ContainerServiceImpl containerService = new ContainerServiceImpl();
		return containerService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseInstance createDatabaseInstance() {
		DatabaseInstanceImpl databaseInstance = new DatabaseInstanceImpl();
		return databaseInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoSQLDatabase createNoSQLDatabase() {
		NoSQLDatabaseImpl noSQLDatabase = new NoSQLDatabaseImpl();
		return noSQLDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkInterface createNetworkInterface() {
		NetworkInterfaceImpl networkInterface = new NetworkInterfaceImpl();
		return networkInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAMRole createIAMRole() {
		IAMRoleImpl iamRole = new IAMRoleImpl();
		return iamRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAMPolicy createIAMPolicy() {
		IAMPolicyImpl iamPolicy = new IAMPolicyImpl();
		return iamPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Secret createSecret() {
		SecretImpl secret = new SecretImpl();
		return secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonitoringService createMonitoringService() {
		MonitoringServiceImpl monitoringService = new MonitoringServiceImpl();
		return monitoringService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudinfragenPackage getCloudinfragenPackage() {
		return (CloudinfragenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CloudinfragenPackage getPackage() {
		return CloudinfragenPackage.eINSTANCE;
	}

} //CloudinfragenFactoryImpl
