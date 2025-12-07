/**
 */
package cloudinfragen.impl;

import cloudinfragen.AutoScalingGroup;
import cloudinfragen.CloudResource;
import cloudinfragen.CloudinfragenFactory;
import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.ComputeInstance;
import cloudinfragen.ConfigParameter;
import cloudinfragen.ContainerService;
import cloudinfragen.DatabaseInstance;
import cloudinfragen.FileSystem;
import cloudinfragen.Function;
import cloudinfragen.IAMPolicy;
import cloudinfragen.IAMRole;
import cloudinfragen.Infrastructure;
import cloudinfragen.LoadBalancer;
import cloudinfragen.MonitoringService;
import cloudinfragen.NetworkInterface;
import cloudinfragen.NoSQLDatabase;
import cloudinfragen.RouteTable;
import cloudinfragen.Secret;
import cloudinfragen.SecurityGroup;
import cloudinfragen.StorageBucket;
import cloudinfragen.Subnet;
import cloudinfragen.Volume;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudinfragenPackageImpl extends EPackageImpl implements CloudinfragenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoScalingGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadBalancerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noSQLDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iamRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iamPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secretEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringServiceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cloudinfragen.CloudinfragenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CloudinfragenPackageImpl() {
		super(eNS_URI, CloudinfragenFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CloudinfragenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CloudinfragenPackage init() {
		if (isInited) return (CloudinfragenPackage)EPackage.Registry.INSTANCE.getEPackage(CloudinfragenPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCloudinfragenPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CloudinfragenPackageImpl theCloudinfragenPackage = registeredCloudinfragenPackage instanceof CloudinfragenPackageImpl ? (CloudinfragenPackageImpl)registeredCloudinfragenPackage : new CloudinfragenPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCloudinfragenPackage.createPackageContents();

		// Initialize created meta-data
		theCloudinfragenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCloudinfragenPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CloudinfragenPackage.eNS_URI, theCloudinfragenPackage);
		return theCloudinfragenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfrastructure() {
		return infrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructure_Resources() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCloudResource() {
		return cloudResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudResource_Id() {
		return (EAttribute)cloudResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudResource_Name() {
		return (EAttribute)cloudResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudResource_Region() {
		return (EAttribute)cloudResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudResource_Tags() {
		return (EAttribute)cloudResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputeInstance() {
		return computeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputeInstance_Os() {
		return (EAttribute)computeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputeInstance_Keypair() {
		return (EAttribute)computeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComputeInstance_NetworkInterfaces() {
		return (EReference)computeInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComputeInstance_Volumes() {
		return (EReference)computeInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComputeInstance_SecurityGroups() {
		return (EReference)computeInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAutoScalingGroup() {
		return autoScalingGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutoScalingGroup_MinSize() {
		return (EAttribute)autoScalingGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutoScalingGroup_MaxSize() {
		return (EAttribute)autoScalingGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutoScalingGroup_DesiredCapacity() {
		return (EAttribute)autoScalingGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutoScalingGroup_Instances() {
		return (EReference)autoScalingGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Size() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Encrypted() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVolume_AttachedTo() {
		return (EReference)volumeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorageBucket() {
		return storageBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageBucket_Versioning() {
		return (EAttribute)storageBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageBucket_PublicAccess() {
		return (EAttribute)storageBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileSystem() {
		return fileSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileSystem_MountPoint() {
		return (EAttribute)fileSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileSystem_CapacityGB() {
		return (EAttribute)fileSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileSystem_Encrypted() {
		return (EAttribute)fileSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVPC() {
		return vpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVPC_CidrBlock() {
		return (EAttribute)vpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVPC_Subnets() {
		return (EReference)vpcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVPC_RouteTables() {
		return (EReference)vpcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubnet() {
		return subnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnet_Cidr() {
		return (EAttribute)subnetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnet_AvailabilityZone() {
		return (EAttribute)subnetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubnet_Vpc() {
		return (EReference)subnetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubnet_RouteTable() {
		return (EReference)subnetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRouteTable() {
		return routeTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRouteTable_Routes() {
		return (EAttribute)routeTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRouteTable_Subnets() {
		return (EReference)routeTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkInterface() {
		return networkInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkInterface_PrivateIP() {
		return (EAttribute)networkInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkInterface_PublicIP() {
		return (EAttribute)networkInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkInterface_Subnet() {
		return (EReference)networkInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkInterface_SecurityGroups() {
		return (EReference)networkInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityGroup() {
		return securityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroup_InboundRules() {
		return (EAttribute)securityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroup_OutboundRules() {
		return (EAttribute)securityGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoadBalancer() {
		return loadBalancerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoadBalancer_Type() {
		return (EAttribute)loadBalancerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoadBalancer_AutoScalingGroups() {
		return (EReference)loadBalancerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoadBalancer_Instances() {
		return (EReference)loadBalancerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoadBalancer_Subnets() {
		return (EReference)loadBalancerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseInstance() {
		return databaseInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInstance_Engine() {
		return (EAttribute)databaseInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInstance_Version() {
		return (EAttribute)databaseInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInstance_StorageSize() {
		return (EAttribute)databaseInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInstance_MultiAZ() {
		return (EAttribute)databaseInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseInstance_Subnet() {
		return (EReference)databaseInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseInstance_SecurityGroups() {
		return (EReference)databaseInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoSQLDatabase() {
		return noSQLDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNoSQLDatabase_Engine() {
		return (EAttribute)noSQLDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNoSQLDatabase_ThroughputCapacity() {
		return (EAttribute)noSQLDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNoSQLDatabase_ReplicaCount() {
		return (EAttribute)noSQLDatabaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunction_Runtime() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunction_Trigger() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_IamRole() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerService() {
		return containerServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerService_ClusterName() {
		return (EAttribute)containerServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerService_NumberOfContainers() {
		return (EAttribute)containerServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerService_Image() {
		return (EAttribute)containerServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerService_Subnets() {
		return (EReference)containerServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerService_SecurityGroups() {
		return (EReference)containerServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIAMRole() {
		return iamRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIAMRole_AssumeRolePolicy() {
		return (EAttribute)iamRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIAMRole_Policies() {
		return (EReference)iamRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIAMPolicy() {
		return iamPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIAMPolicy_Actions() {
		return (EAttribute)iamPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIAMPolicy_Resources() {
		return (EAttribute)iamPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigParameter() {
		return configParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigParameter_Key() {
		return (EAttribute)configParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigParameter_Value() {
		return (EAttribute)configParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigParameter_Type() {
		return (EAttribute)configParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecret() {
		return secretEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecret_Key() {
		return (EAttribute)secretEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecret_Encrypted() {
		return (EAttribute)secretEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMonitoringService() {
		return monitoringServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonitoringService_Metrics() {
		return (EAttribute)monitoringServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonitoringService_Alerts() {
		return (EAttribute)monitoringServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMonitoringService_MonitoredResources() {
		return (EReference)monitoringServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudinfragenFactory getCloudinfragenFactory() {
		return (CloudinfragenFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		infrastructureEClass = createEClass(INFRASTRUCTURE);
		createEReference(infrastructureEClass, INFRASTRUCTURE__RESOURCES);

		cloudResourceEClass = createEClass(CLOUD_RESOURCE);
		createEAttribute(cloudResourceEClass, CLOUD_RESOURCE__ID);
		createEAttribute(cloudResourceEClass, CLOUD_RESOURCE__NAME);
		createEAttribute(cloudResourceEClass, CLOUD_RESOURCE__REGION);
		createEAttribute(cloudResourceEClass, CLOUD_RESOURCE__TAGS);

		computeInstanceEClass = createEClass(COMPUTE_INSTANCE);
		createEAttribute(computeInstanceEClass, COMPUTE_INSTANCE__OS);
		createEAttribute(computeInstanceEClass, COMPUTE_INSTANCE__KEYPAIR);
		createEReference(computeInstanceEClass, COMPUTE_INSTANCE__NETWORK_INTERFACES);
		createEReference(computeInstanceEClass, COMPUTE_INSTANCE__VOLUMES);
		createEReference(computeInstanceEClass, COMPUTE_INSTANCE__SECURITY_GROUPS);

		autoScalingGroupEClass = createEClass(AUTO_SCALING_GROUP);
		createEAttribute(autoScalingGroupEClass, AUTO_SCALING_GROUP__MIN_SIZE);
		createEAttribute(autoScalingGroupEClass, AUTO_SCALING_GROUP__MAX_SIZE);
		createEAttribute(autoScalingGroupEClass, AUTO_SCALING_GROUP__DESIRED_CAPACITY);
		createEReference(autoScalingGroupEClass, AUTO_SCALING_GROUP__INSTANCES);

		volumeEClass = createEClass(VOLUME);
		createEAttribute(volumeEClass, VOLUME__SIZE);
		createEAttribute(volumeEClass, VOLUME__ENCRYPTED);
		createEReference(volumeEClass, VOLUME__ATTACHED_TO);

		storageBucketEClass = createEClass(STORAGE_BUCKET);
		createEAttribute(storageBucketEClass, STORAGE_BUCKET__VERSIONING);
		createEAttribute(storageBucketEClass, STORAGE_BUCKET__PUBLIC_ACCESS);

		fileSystemEClass = createEClass(FILE_SYSTEM);
		createEAttribute(fileSystemEClass, FILE_SYSTEM__MOUNT_POINT);
		createEAttribute(fileSystemEClass, FILE_SYSTEM__CAPACITY_GB);
		createEAttribute(fileSystemEClass, FILE_SYSTEM__ENCRYPTED);

		vpcEClass = createEClass(VPC);
		createEAttribute(vpcEClass, VPC__CIDR_BLOCK);
		createEReference(vpcEClass, VPC__SUBNETS);
		createEReference(vpcEClass, VPC__ROUTE_TABLES);

		subnetEClass = createEClass(SUBNET);
		createEAttribute(subnetEClass, SUBNET__CIDR);
		createEAttribute(subnetEClass, SUBNET__AVAILABILITY_ZONE);
		createEReference(subnetEClass, SUBNET__VPC);
		createEReference(subnetEClass, SUBNET__ROUTE_TABLE);

		routeTableEClass = createEClass(ROUTE_TABLE);
		createEAttribute(routeTableEClass, ROUTE_TABLE__ROUTES);
		createEReference(routeTableEClass, ROUTE_TABLE__SUBNETS);

		networkInterfaceEClass = createEClass(NETWORK_INTERFACE);
		createEAttribute(networkInterfaceEClass, NETWORK_INTERFACE__PRIVATE_IP);
		createEAttribute(networkInterfaceEClass, NETWORK_INTERFACE__PUBLIC_IP);
		createEReference(networkInterfaceEClass, NETWORK_INTERFACE__SUBNET);
		createEReference(networkInterfaceEClass, NETWORK_INTERFACE__SECURITY_GROUPS);

		securityGroupEClass = createEClass(SECURITY_GROUP);
		createEAttribute(securityGroupEClass, SECURITY_GROUP__INBOUND_RULES);
		createEAttribute(securityGroupEClass, SECURITY_GROUP__OUTBOUND_RULES);

		loadBalancerEClass = createEClass(LOAD_BALANCER);
		createEAttribute(loadBalancerEClass, LOAD_BALANCER__TYPE);
		createEReference(loadBalancerEClass, LOAD_BALANCER__AUTO_SCALING_GROUPS);
		createEReference(loadBalancerEClass, LOAD_BALANCER__INSTANCES);
		createEReference(loadBalancerEClass, LOAD_BALANCER__SUBNETS);

		databaseInstanceEClass = createEClass(DATABASE_INSTANCE);
		createEAttribute(databaseInstanceEClass, DATABASE_INSTANCE__ENGINE);
		createEAttribute(databaseInstanceEClass, DATABASE_INSTANCE__VERSION);
		createEAttribute(databaseInstanceEClass, DATABASE_INSTANCE__STORAGE_SIZE);
		createEAttribute(databaseInstanceEClass, DATABASE_INSTANCE__MULTI_AZ);
		createEReference(databaseInstanceEClass, DATABASE_INSTANCE__SUBNET);
		createEReference(databaseInstanceEClass, DATABASE_INSTANCE__SECURITY_GROUPS);

		noSQLDatabaseEClass = createEClass(NO_SQL_DATABASE);
		createEAttribute(noSQLDatabaseEClass, NO_SQL_DATABASE__ENGINE);
		createEAttribute(noSQLDatabaseEClass, NO_SQL_DATABASE__THROUGHPUT_CAPACITY);
		createEAttribute(noSQLDatabaseEClass, NO_SQL_DATABASE__REPLICA_COUNT);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__RUNTIME);
		createEAttribute(functionEClass, FUNCTION__TRIGGER);
		createEReference(functionEClass, FUNCTION__IAM_ROLE);

		containerServiceEClass = createEClass(CONTAINER_SERVICE);
		createEAttribute(containerServiceEClass, CONTAINER_SERVICE__CLUSTER_NAME);
		createEAttribute(containerServiceEClass, CONTAINER_SERVICE__NUMBER_OF_CONTAINERS);
		createEAttribute(containerServiceEClass, CONTAINER_SERVICE__IMAGE);
		createEReference(containerServiceEClass, CONTAINER_SERVICE__SUBNETS);
		createEReference(containerServiceEClass, CONTAINER_SERVICE__SECURITY_GROUPS);

		iamRoleEClass = createEClass(IAM_ROLE);
		createEAttribute(iamRoleEClass, IAM_ROLE__ASSUME_ROLE_POLICY);
		createEReference(iamRoleEClass, IAM_ROLE__POLICIES);

		iamPolicyEClass = createEClass(IAM_POLICY);
		createEAttribute(iamPolicyEClass, IAM_POLICY__ACTIONS);
		createEAttribute(iamPolicyEClass, IAM_POLICY__RESOURCES);

		configParameterEClass = createEClass(CONFIG_PARAMETER);
		createEAttribute(configParameterEClass, CONFIG_PARAMETER__KEY);
		createEAttribute(configParameterEClass, CONFIG_PARAMETER__VALUE);
		createEAttribute(configParameterEClass, CONFIG_PARAMETER__TYPE);

		secretEClass = createEClass(SECRET);
		createEAttribute(secretEClass, SECRET__KEY);
		createEAttribute(secretEClass, SECRET__ENCRYPTED);

		monitoringServiceEClass = createEClass(MONITORING_SERVICE);
		createEAttribute(monitoringServiceEClass, MONITORING_SERVICE__METRICS);
		createEAttribute(monitoringServiceEClass, MONITORING_SERVICE__ALERTS);
		createEReference(monitoringServiceEClass, MONITORING_SERVICE__MONITORED_RESOURCES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		computeInstanceEClass.getESuperTypes().add(this.getCloudResource());
		autoScalingGroupEClass.getESuperTypes().add(this.getCloudResource());
		volumeEClass.getESuperTypes().add(this.getCloudResource());
		storageBucketEClass.getESuperTypes().add(this.getCloudResource());
		fileSystemEClass.getESuperTypes().add(this.getCloudResource());
		vpcEClass.getESuperTypes().add(this.getCloudResource());
		subnetEClass.getESuperTypes().add(this.getCloudResource());
		routeTableEClass.getESuperTypes().add(this.getCloudResource());
		networkInterfaceEClass.getESuperTypes().add(this.getCloudResource());
		securityGroupEClass.getESuperTypes().add(this.getCloudResource());
		loadBalancerEClass.getESuperTypes().add(this.getCloudResource());
		databaseInstanceEClass.getESuperTypes().add(this.getCloudResource());
		noSQLDatabaseEClass.getESuperTypes().add(this.getCloudResource());
		functionEClass.getESuperTypes().add(this.getCloudResource());
		containerServiceEClass.getESuperTypes().add(this.getCloudResource());
		iamRoleEClass.getESuperTypes().add(this.getCloudResource());
		iamPolicyEClass.getESuperTypes().add(this.getCloudResource());
		configParameterEClass.getESuperTypes().add(this.getCloudResource());
		secretEClass.getESuperTypes().add(this.getCloudResource());
		monitoringServiceEClass.getESuperTypes().add(this.getCloudResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(infrastructureEClass, Infrastructure.class, "Infrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructure_Resources(), this.getCloudResource(), null, "resources", null, 0, -1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cloudResourceEClass, CloudResource.class, "CloudResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudResource_Id(), ecorePackage.getEString(), "id", null, 1, 1, CloudResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCloudResource_Name(), ecorePackage.getEString(), "name", null, 1, 1, CloudResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCloudResource_Region(), ecorePackage.getEString(), "region", null, 0, 1, CloudResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCloudResource_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, CloudResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(computeInstanceEClass, ComputeInstance.class, "ComputeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputeInstance_Os(), ecorePackage.getEString(), "os", null, 0, 1, ComputeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComputeInstance_Keypair(), ecorePackage.getEString(), "keypair", null, 0, 1, ComputeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComputeInstance_NetworkInterfaces(), this.getNetworkInterface(), null, "networkInterfaces", null, 0, -1, ComputeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComputeInstance_Volumes(), this.getVolume(), this.getVolume_AttachedTo(), "volumes", null, 0, -1, ComputeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComputeInstance_SecurityGroups(), this.getSecurityGroup(), null, "securityGroups", null, 0, -1, ComputeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(autoScalingGroupEClass, AutoScalingGroup.class, "AutoScalingGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutoScalingGroup_MinSize(), ecorePackage.getEInt(), "minSize", "1", 1, 1, AutoScalingGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAutoScalingGroup_MaxSize(), ecorePackage.getEInt(), "maxSize", "1", 1, 1, AutoScalingGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAutoScalingGroup_DesiredCapacity(), ecorePackage.getEInt(), "desiredCapacity", null, 0, 1, AutoScalingGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAutoScalingGroup_Instances(), this.getComputeInstance(), null, "instances", null, 0, -1, AutoScalingGroup.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolume_Size(), ecorePackage.getEInt(), "size", null, 1, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVolume_Encrypted(), ecorePackage.getEBoolean(), "encrypted", "false", 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVolume_AttachedTo(), this.getComputeInstance(), this.getComputeInstance_Volumes(), "attachedTo", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(storageBucketEClass, StorageBucket.class, "StorageBucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorageBucket_Versioning(), ecorePackage.getEBoolean(), "versioning", "false", 0, 1, StorageBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStorageBucket_PublicAccess(), ecorePackage.getEBoolean(), "publicAccess", "false", 0, 1, StorageBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fileSystemEClass, FileSystem.class, "FileSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileSystem_MountPoint(), ecorePackage.getEString(), "mountPoint", null, 0, 1, FileSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFileSystem_CapacityGB(), ecorePackage.getEInt(), "capacityGB", null, 1, 1, FileSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFileSystem_Encrypted(), ecorePackage.getEBoolean(), "encrypted", "false", 0, 1, FileSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vpcEClass, cloudinfragen.VPC.class, "VPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVPC_CidrBlock(), ecorePackage.getEString(), "cidrBlock", null, 1, 1, cloudinfragen.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVPC_Subnets(), this.getSubnet(), this.getSubnet_Vpc(), "subnets", null, 1, -1, cloudinfragen.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVPC_RouteTables(), this.getRouteTable(), null, "routeTables", null, 0, -1, cloudinfragen.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subnetEClass, Subnet.class, "Subnet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubnet_Cidr(), ecorePackage.getEString(), "cidr", null, 1, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubnet_AvailabilityZone(), ecorePackage.getEString(), "availabilityZone", null, 0, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubnet_Vpc(), this.getVPC(), this.getVPC_Subnets(), "vpc", null, 1, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubnet_RouteTable(), this.getRouteTable(), this.getRouteTable_Subnets(), "routeTable", null, 0, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(routeTableEClass, RouteTable.class, "RouteTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRouteTable_Routes(), ecorePackage.getEString(), "routes", null, 0, -1, RouteTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRouteTable_Subnets(), this.getSubnet(), this.getSubnet_RouteTable(), "subnets", null, 0, -1, RouteTable.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(networkInterfaceEClass, NetworkInterface.class, "NetworkInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkInterface_PrivateIP(), ecorePackage.getEString(), "privateIP", null, 0, 1, NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNetworkInterface_PublicIP(), ecorePackage.getEString(), "publicIP", null, 0, 1, NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNetworkInterface_Subnet(), this.getSubnet(), null, "subnet", null, 1, 1, NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNetworkInterface_SecurityGroups(), this.getSecurityGroup(), null, "securityGroups", null, 0, -1, NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(securityGroupEClass, SecurityGroup.class, "SecurityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityGroup_InboundRules(), ecorePackage.getEString(), "inboundRules", null, 0, -1, SecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityGroup_OutboundRules(), ecorePackage.getEString(), "outboundRules", null, 0, -1, SecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(loadBalancerEClass, LoadBalancer.class, "LoadBalancer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadBalancer_Type(), ecorePackage.getEString(), "type", null, 1, 1, LoadBalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoadBalancer_AutoScalingGroups(), this.getAutoScalingGroup(), null, "autoScalingGroups", null, 0, -1, LoadBalancer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoadBalancer_Instances(), this.getComputeInstance(), null, "instances", null, 0, -1, LoadBalancer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoadBalancer_Subnets(), this.getSubnet(), null, "subnets", null, 0, -1, LoadBalancer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(databaseInstanceEClass, DatabaseInstance.class, "DatabaseInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseInstance_Engine(), ecorePackage.getEString(), "engine", null, 1, 1, DatabaseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatabaseInstance_Version(), ecorePackage.getEString(), "version", null, 0, 1, DatabaseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatabaseInstance_StorageSize(), ecorePackage.getEInt(), "storageSize", null, 1, 1, DatabaseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatabaseInstance_MultiAZ(), ecorePackage.getEBoolean(), "multiAZ", "false", 0, 1, DatabaseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDatabaseInstance_Subnet(), this.getSubnet(), null, "subnet", null, 0, 1, DatabaseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDatabaseInstance_SecurityGroups(), this.getSecurityGroup(), null, "securityGroups", null, 0, -1, DatabaseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(noSQLDatabaseEClass, NoSQLDatabase.class, "NoSQLDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoSQLDatabase_Engine(), ecorePackage.getEString(), "engine", null, 1, 1, NoSQLDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNoSQLDatabase_ThroughputCapacity(), ecorePackage.getEInt(), "throughputCapacity", null, 0, 1, NoSQLDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNoSQLDatabase_ReplicaCount(), ecorePackage.getEInt(), "replicaCount", null, 0, 1, NoSQLDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Runtime(), ecorePackage.getEString(), "runtime", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFunction_Trigger(), ecorePackage.getEString(), "trigger", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFunction_IamRole(), this.getIAMRole(), null, "iamRole", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(containerServiceEClass, ContainerService.class, "ContainerService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerService_ClusterName(), ecorePackage.getEString(), "clusterName", null, 1, 1, ContainerService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContainerService_NumberOfContainers(), ecorePackage.getEInt(), "numberOfContainers", "1", 1, 1, ContainerService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContainerService_Image(), ecorePackage.getEString(), "image", null, 1, 1, ContainerService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContainerService_Subnets(), this.getSubnet(), null, "subnets", null, 0, -1, ContainerService.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContainerService_SecurityGroups(), this.getSecurityGroup(), null, "securityGroups", null, 0, -1, ContainerService.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iamRoleEClass, IAMRole.class, "IAMRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIAMRole_AssumeRolePolicy(), ecorePackage.getEString(), "assumeRolePolicy", null, 0, 1, IAMRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIAMRole_Policies(), this.getIAMPolicy(), null, "policies", null, 0, -1, IAMRole.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iamPolicyEClass, IAMPolicy.class, "IAMPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIAMPolicy_Actions(), ecorePackage.getEString(), "actions", null, 0, -1, IAMPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIAMPolicy_Resources(), ecorePackage.getEString(), "resources", null, 0, -1, IAMPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(configParameterEClass, ConfigParameter.class, "ConfigParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigParameter_Key(), ecorePackage.getEString(), "key", null, 1, 1, ConfigParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfigParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, ConfigParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfigParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, ConfigParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(secretEClass, Secret.class, "Secret", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecret_Key(), ecorePackage.getEString(), "key", null, 1, 1, Secret.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecret_Encrypted(), ecorePackage.getEBoolean(), "encrypted", "true", 0, 1, Secret.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(monitoringServiceEClass, MonitoringService.class, "MonitoringService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonitoringService_Metrics(), ecorePackage.getEString(), "metrics", null, 0, -1, MonitoringService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMonitoringService_Alerts(), ecorePackage.getEString(), "alerts", null, 0, -1, MonitoringService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMonitoringService_MonitoredResources(), this.getCloudResource(), null, "monitoredResources", null, 0, -1, MonitoringService.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CloudinfragenPackageImpl
