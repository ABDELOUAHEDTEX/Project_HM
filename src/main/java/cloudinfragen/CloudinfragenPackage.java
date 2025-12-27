/**
 */
package cloudinfragen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cloudinfragen.CloudinfragenFactory
 * @model kind="package"
 * @generated
 */
public interface CloudinfragenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cloudinfragen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cloudinfragen.com/metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cloudinfragen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudinfragenPackage eINSTANCE = cloudinfragen.impl.CloudinfragenPackageImpl.init();

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.InfrastructureImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getInfrastructure()
	 * @generated
	 */
	int INFRASTRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__RESOURCES = 1;

	/**
	 * The number of structural features of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.CloudResource <em>Cloud Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.CloudResource
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getCloudResource()
	 * @generated
	 */
	int CLOUD_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__REGION = 2;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__TAGS = 3;

	/**
	 * The number of structural features of the '<em>Cloud Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Cloud Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.ComputeInstanceImpl <em>Compute Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.ComputeInstanceImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getComputeInstance()
	 * @generated
	 */
	int COMPUTE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE__OS = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Keypair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE__KEYPAIR = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE__SUBNET = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE__VOLUMES = CLOUD_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Security Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE__SECURITY_GROUPS = CLOUD_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Compute Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Compute Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.AutoScalingGroupImpl <em>Auto Scaling Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.AutoScalingGroupImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getAutoScalingGroup()
	 * @generated
	 */
	int AUTO_SCALING_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__MIN_SIZE = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__MAX_SIZE = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Desired Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__DESIRED_CAPACITY = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__TEMPLATE = CLOUD_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__INSTANCES = CLOUD_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Auto Scaling Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Auto Scaling Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.VolumeImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SIZE = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encrypted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__ENCRYPTED = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attached To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__ATTACHED_TO = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.StorageBucketImpl <em>Storage Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.StorageBucketImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getStorageBucket()
	 * @generated
	 */
	int STORAGE_BUCKET = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_BUCKET__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_BUCKET__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_BUCKET__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_BUCKET__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Versioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_BUCKET__VERSIONING = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Public Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_BUCKET__PUBLIC_ACCESS = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Storage Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_BUCKET_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Storage Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_BUCKET_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.FileSystemImpl <em>File System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.FileSystemImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getFileSystem()
	 * @generated
	 */
	int FILE_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Mount Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__MOUNT_POINT = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__CAPACITY_GB = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Encrypted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__ENCRYPTED = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>File System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>File System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.VPCImpl <em>VPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.VPCImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getVPC()
	 * @generated
	 */
	int VPC = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Cidr Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__CIDR_BLOCK = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__SUBNETS = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Route Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__ROUTE_TABLES = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.SubnetImpl <em>Subnet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.SubnetImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getSubnet()
	 * @generated
	 */
	int SUBNET = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__CIDR = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__TYPE_SUBNET = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__AVAILABILITY_ZONE = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__VPC = CLOUD_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Route Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__ROUTE_TABLE = CLOUD_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.RouteTableImpl <em>Route Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.RouteTableImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getRouteTable()
	 * @generated
	 */
	int ROUTE_TABLE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TABLE__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TABLE__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TABLE__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TABLE__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TABLE__ROUTES = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TABLE__SUBNETS = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Route Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TABLE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Route Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TABLE_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.SecurityGroupImpl <em>Security Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.SecurityGroupImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getSecurityGroup()
	 * @generated
	 */
	int SECURITY_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Inbound Rules</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__INBOUND_RULES = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outbound Rules</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__OUTBOUND_RULES = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.LoadBalancerImpl <em>Load Balancer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.LoadBalancerImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getLoadBalancer()
	 * @generated
	 */
	int LOAD_BALANCER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__TYPE = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auto Scaling Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__AUTO_SCALING_GROUPS = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__INSTANCES = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__SUBNETS = CLOUD_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Load Balancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Load Balancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.IAMEntityImpl <em>IAM Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.IAMEntityImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getIAMEntity()
	 * @generated
	 */
	int IAM_ENTITY = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ENTITY__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ENTITY__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ENTITY__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ENTITY__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ENTITY__ENTITY_TYPE = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ENTITY__ACTIONS = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ENTITY__RESOURCES = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assume Role Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ENTITY__ASSUME_ROLE_POLICY = CLOUD_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IAM Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ENTITY_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>IAM Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ENTITY_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.ContainerServiceImpl <em>Container Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.ContainerServiceImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getContainerService()
	 * @generated
	 */
	int CONTAINER_SERVICE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SERVICE__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SERVICE__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SERVICE__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SERVICE__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Cluster Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SERVICE__CLUSTER_NAME = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Containers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SERVICE__NUMBER_OF_CONTAINERS = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SERVICE__IMAGE = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SERVICE__SUBNETS = CLOUD_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Security Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SERVICE__SECURITY_GROUPS = CLOUD_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Container Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SERVICE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Container Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SERVICE_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.FunctionImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RUNTIME = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TRIGGER = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Iam Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IAM_ROLE = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.DatabaseInstanceImpl <em>Database Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.DatabaseInstanceImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getDatabaseInstance()
	 * @generated
	 */
	int DATABASE_INSTANCE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INSTANCE__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INSTANCE__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INSTANCE__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INSTANCE__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INSTANCE__ENGINE = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INSTANCE__VERSION = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INSTANCE__STORAGE_SIZE = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multi AZ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INSTANCE__MULTI_AZ = CLOUD_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INSTANCE__SUBNET = CLOUD_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Security Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INSTANCE__SECURITY_GROUPS = CLOUD_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Database Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INSTANCE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Database Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INSTANCE_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.NoSQLDatabaseImpl <em>No SQL Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.NoSQLDatabaseImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getNoSQLDatabase()
	 * @generated
	 */
	int NO_SQL_DATABASE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DATABASE__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DATABASE__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DATABASE__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DATABASE__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DATABASE__ENGINE = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Throughput Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DATABASE__THROUGHPUT_CAPACITY = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Replica Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DATABASE__REPLICA_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>No SQL Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DATABASE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>No SQL Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DATABASE_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.NetworkInterfaceImpl <em>Network Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.NetworkInterfaceImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getNetworkInterface()
	 * @generated
	 */
	int NETWORK_INTERFACE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Private IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__PRIVATE_IP = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Public IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__PUBLIC_IP = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__SUBNET = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Security Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__SECURITY_GROUPS = CLOUD_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Network Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Network Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.IAMRoleImpl <em>IAM Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.IAMRoleImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getIAMRole()
	 * @generated
	 */
	int IAM_ROLE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ROLE__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ROLE__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ROLE__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ROLE__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Assume Role Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ROLE__ASSUME_ROLE_POLICY = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ROLE__POLICIES = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IAM Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ROLE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IAM Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_ROLE_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.IAMPolicyImpl <em>IAM Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.IAMPolicyImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getIAMPolicy()
	 * @generated
	 */
	int IAM_POLICY = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_POLICY__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_POLICY__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_POLICY__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_POLICY__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_POLICY__ACTIONS = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_POLICY__RESOURCES = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IAM Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_POLICY_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IAM Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAM_POLICY_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.SecretImpl <em>Secret</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.SecretImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getSecret()
	 * @generated
	 */
	int SECRET = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__KEY = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encrypted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__ENCRYPTED = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudinfragen.impl.MonitoringServiceImpl <em>Monitoring Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudinfragen.impl.MonitoringServiceImpl
	 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getMonitoringService()
	 * @generated
	 */
	int MONITORING_SERVICE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__REGION = CLOUD_RESOURCE__REGION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__TAGS = CLOUD_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__METRICS = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alerts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__ALERTS = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Monitored Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__MONITORED_RESOURCES = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Monitoring Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Monitoring Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link cloudinfragen.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure</em>'.
	 * @see cloudinfragen.Infrastructure
	 * @generated
	 */
	EClass getInfrastructure();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.Infrastructure#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see cloudinfragen.Infrastructure#getProvider()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EAttribute getInfrastructure_Provider();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudinfragen.Infrastructure#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see cloudinfragen.Infrastructure#getResources()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_Resources();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.CloudResource <em>Cloud Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Resource</em>'.
	 * @see cloudinfragen.CloudResource
	 * @generated
	 */
	EClass getCloudResource();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.CloudResource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudinfragen.CloudResource#getId()
	 * @see #getCloudResource()
	 * @generated
	 */
	EAttribute getCloudResource_Id();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.CloudResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudinfragen.CloudResource#getName()
	 * @see #getCloudResource()
	 * @generated
	 */
	EAttribute getCloudResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.CloudResource#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see cloudinfragen.CloudResource#getRegion()
	 * @see #getCloudResource()
	 * @generated
	 */
	EAttribute getCloudResource_Region();

	/**
	 * Returns the meta object for the attribute list '{@link cloudinfragen.CloudResource#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see cloudinfragen.CloudResource#getTags()
	 * @see #getCloudResource()
	 * @generated
	 */
	EAttribute getCloudResource_Tags();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.ComputeInstance <em>Compute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compute Instance</em>'.
	 * @see cloudinfragen.ComputeInstance
	 * @generated
	 */
	EClass getComputeInstance();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.ComputeInstance#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see cloudinfragen.ComputeInstance#getOs()
	 * @see #getComputeInstance()
	 * @generated
	 */
	EAttribute getComputeInstance_Os();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.ComputeInstance#getKeypair <em>Keypair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keypair</em>'.
	 * @see cloudinfragen.ComputeInstance#getKeypair()
	 * @see #getComputeInstance()
	 * @generated
	 */
	EAttribute getComputeInstance_Keypair();

	/**
	 * Returns the meta object for the reference '{@link cloudinfragen.ComputeInstance#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subnet</em>'.
	 * @see cloudinfragen.ComputeInstance#getSubnet()
	 * @see #getComputeInstance()
	 * @generated
	 */
	EReference getComputeInstance_Subnet();

	/**
	 * Returns the meta object for the reference list '{@link cloudinfragen.ComputeInstance#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Volumes</em>'.
	 * @see cloudinfragen.ComputeInstance#getVolumes()
	 * @see #getComputeInstance()
	 * @generated
	 */
	EReference getComputeInstance_Volumes();

	/**
	 * Returns the meta object for the reference list '{@link cloudinfragen.ComputeInstance#getSecurityGroups <em>Security Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Groups</em>'.
	 * @see cloudinfragen.ComputeInstance#getSecurityGroups()
	 * @see #getComputeInstance()
	 * @generated
	 */
	EReference getComputeInstance_SecurityGroups();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.AutoScalingGroup <em>Auto Scaling Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Scaling Group</em>'.
	 * @see cloudinfragen.AutoScalingGroup
	 * @generated
	 */
	EClass getAutoScalingGroup();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.AutoScalingGroup#getMinSize <em>Min Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Size</em>'.
	 * @see cloudinfragen.AutoScalingGroup#getMinSize()
	 * @see #getAutoScalingGroup()
	 * @generated
	 */
	EAttribute getAutoScalingGroup_MinSize();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.AutoScalingGroup#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Size</em>'.
	 * @see cloudinfragen.AutoScalingGroup#getMaxSize()
	 * @see #getAutoScalingGroup()
	 * @generated
	 */
	EAttribute getAutoScalingGroup_MaxSize();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.AutoScalingGroup#getDesiredCapacity <em>Desired Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desired Capacity</em>'.
	 * @see cloudinfragen.AutoScalingGroup#getDesiredCapacity()
	 * @see #getAutoScalingGroup()
	 * @generated
	 */
	EAttribute getAutoScalingGroup_DesiredCapacity();

	/**
	 * Returns the meta object for the reference '{@link cloudinfragen.AutoScalingGroup#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see cloudinfragen.AutoScalingGroup#getTemplate()
	 * @see #getAutoScalingGroup()
	 * @generated
	 */
	EReference getAutoScalingGroup_Template();

	/**
	 * Returns the meta object for the reference list '{@link cloudinfragen.AutoScalingGroup#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see cloudinfragen.AutoScalingGroup#getInstances()
	 * @see #getAutoScalingGroup()
	 * @generated
	 */
	EReference getAutoScalingGroup_Instances();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see cloudinfragen.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.Volume#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see cloudinfragen.Volume#getSize()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Size();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.Volume#isEncrypted <em>Encrypted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypted</em>'.
	 * @see cloudinfragen.Volume#isEncrypted()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Encrypted();

	/**
	 * Returns the meta object for the reference '{@link cloudinfragen.Volume#getAttachedTo <em>Attached To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attached To</em>'.
	 * @see cloudinfragen.Volume#getAttachedTo()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_AttachedTo();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.StorageBucket <em>Storage Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Bucket</em>'.
	 * @see cloudinfragen.StorageBucket
	 * @generated
	 */
	EClass getStorageBucket();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.StorageBucket#isVersioning <em>Versioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Versioning</em>'.
	 * @see cloudinfragen.StorageBucket#isVersioning()
	 * @see #getStorageBucket()
	 * @generated
	 */
	EAttribute getStorageBucket_Versioning();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.StorageBucket#isPublicAccess <em>Public Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Access</em>'.
	 * @see cloudinfragen.StorageBucket#isPublicAccess()
	 * @see #getStorageBucket()
	 * @generated
	 */
	EAttribute getStorageBucket_PublicAccess();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.FileSystem <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System</em>'.
	 * @see cloudinfragen.FileSystem
	 * @generated
	 */
	EClass getFileSystem();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.FileSystem#getMountPoint <em>Mount Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mount Point</em>'.
	 * @see cloudinfragen.FileSystem#getMountPoint()
	 * @see #getFileSystem()
	 * @generated
	 */
	EAttribute getFileSystem_MountPoint();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.FileSystem#getCapacityGB <em>Capacity GB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity GB</em>'.
	 * @see cloudinfragen.FileSystem#getCapacityGB()
	 * @see #getFileSystem()
	 * @generated
	 */
	EAttribute getFileSystem_CapacityGB();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.FileSystem#isEncrypted <em>Encrypted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypted</em>'.
	 * @see cloudinfragen.FileSystem#isEncrypted()
	 * @see #getFileSystem()
	 * @generated
	 */
	EAttribute getFileSystem_Encrypted();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.VPC <em>VPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VPC</em>'.
	 * @see cloudinfragen.VPC
	 * @generated
	 */
	EClass getVPC();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.VPC#getCidrBlock <em>Cidr Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block</em>'.
	 * @see cloudinfragen.VPC#getCidrBlock()
	 * @see #getVPC()
	 * @generated
	 */
	EAttribute getVPC_CidrBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudinfragen.VPC#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnets</em>'.
	 * @see cloudinfragen.VPC#getSubnets()
	 * @see #getVPC()
	 * @generated
	 */
	EReference getVPC_Subnets();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudinfragen.VPC#getRouteTables <em>Route Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route Tables</em>'.
	 * @see cloudinfragen.VPC#getRouteTables()
	 * @see #getVPC()
	 * @generated
	 */
	EReference getVPC_RouteTables();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.Subnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet</em>'.
	 * @see cloudinfragen.Subnet
	 * @generated
	 */
	EClass getSubnet();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.Subnet#getCidr <em>Cidr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr</em>'.
	 * @see cloudinfragen.Subnet#getCidr()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Cidr();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.Subnet#getTypeSubnet <em>Type Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Subnet</em>'.
	 * @see cloudinfragen.Subnet#getTypeSubnet()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_TypeSubnet();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.Subnet#getAvailabilityZone <em>Availability Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone</em>'.
	 * @see cloudinfragen.Subnet#getAvailabilityZone()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_AvailabilityZone();

	/**
	 * Returns the meta object for the container reference '{@link cloudinfragen.Subnet#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Vpc</em>'.
	 * @see cloudinfragen.Subnet#getVpc()
	 * @see #getSubnet()
	 * @generated
	 */
	EReference getSubnet_Vpc();

	/**
	 * Returns the meta object for the reference '{@link cloudinfragen.Subnet#getRouteTable <em>Route Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route Table</em>'.
	 * @see cloudinfragen.Subnet#getRouteTable()
	 * @see #getSubnet()
	 * @generated
	 */
	EReference getSubnet_RouteTable();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.RouteTable <em>Route Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Table</em>'.
	 * @see cloudinfragen.RouteTable
	 * @generated
	 */
	EClass getRouteTable();

	/**
	 * Returns the meta object for the attribute list '{@link cloudinfragen.RouteTable#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Routes</em>'.
	 * @see cloudinfragen.RouteTable#getRoutes()
	 * @see #getRouteTable()
	 * @generated
	 */
	EAttribute getRouteTable_Routes();

	/**
	 * Returns the meta object for the reference list '{@link cloudinfragen.RouteTable#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subnets</em>'.
	 * @see cloudinfragen.RouteTable#getSubnets()
	 * @see #getRouteTable()
	 * @generated
	 */
	EReference getRouteTable_Subnets();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.SecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Group</em>'.
	 * @see cloudinfragen.SecurityGroup
	 * @generated
	 */
	EClass getSecurityGroup();

	/**
	 * Returns the meta object for the attribute list '{@link cloudinfragen.SecurityGroup#getInboundRules <em>Inbound Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inbound Rules</em>'.
	 * @see cloudinfragen.SecurityGroup#getInboundRules()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EAttribute getSecurityGroup_InboundRules();

	/**
	 * Returns the meta object for the attribute list '{@link cloudinfragen.SecurityGroup#getOutboundRules <em>Outbound Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Outbound Rules</em>'.
	 * @see cloudinfragen.SecurityGroup#getOutboundRules()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EAttribute getSecurityGroup_OutboundRules();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.LoadBalancer <em>Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balancer</em>'.
	 * @see cloudinfragen.LoadBalancer
	 * @generated
	 */
	EClass getLoadBalancer();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.LoadBalancer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cloudinfragen.LoadBalancer#getType()
	 * @see #getLoadBalancer()
	 * @generated
	 */
	EAttribute getLoadBalancer_Type();

	/**
	 * Returns the meta object for the reference list '{@link cloudinfragen.LoadBalancer#getAutoScalingGroups <em>Auto Scaling Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auto Scaling Groups</em>'.
	 * @see cloudinfragen.LoadBalancer#getAutoScalingGroups()
	 * @see #getLoadBalancer()
	 * @generated
	 */
	EReference getLoadBalancer_AutoScalingGroups();

	/**
	 * Returns the meta object for the reference list '{@link cloudinfragen.LoadBalancer#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see cloudinfragen.LoadBalancer#getInstances()
	 * @see #getLoadBalancer()
	 * @generated
	 */
	EReference getLoadBalancer_Instances();

	/**
	 * Returns the meta object for the reference list '{@link cloudinfragen.LoadBalancer#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subnets</em>'.
	 * @see cloudinfragen.LoadBalancer#getSubnets()
	 * @see #getLoadBalancer()
	 * @generated
	 */
	EReference getLoadBalancer_Subnets();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.IAMEntity <em>IAM Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAM Entity</em>'.
	 * @see cloudinfragen.IAMEntity
	 * @generated
	 */
	EClass getIAMEntity();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.IAMEntity#getEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Type</em>'.
	 * @see cloudinfragen.IAMEntity#getEntityType()
	 * @see #getIAMEntity()
	 * @generated
	 */
	EAttribute getIAMEntity_EntityType();

	/**
	 * Returns the meta object for the attribute list '{@link cloudinfragen.IAMEntity#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actions</em>'.
	 * @see cloudinfragen.IAMEntity#getActions()
	 * @see #getIAMEntity()
	 * @generated
	 */
	EAttribute getIAMEntity_Actions();

	/**
	 * Returns the meta object for the attribute list '{@link cloudinfragen.IAMEntity#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resources</em>'.
	 * @see cloudinfragen.IAMEntity#getResources()
	 * @see #getIAMEntity()
	 * @generated
	 */
	EAttribute getIAMEntity_Resources();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.IAMEntity#getAssumeRolePolicy <em>Assume Role Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assume Role Policy</em>'.
	 * @see cloudinfragen.IAMEntity#getAssumeRolePolicy()
	 * @see #getIAMEntity()
	 * @generated
	 */
	EAttribute getIAMEntity_AssumeRolePolicy();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.ContainerService <em>Container Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Service</em>'.
	 * @see cloudinfragen.ContainerService
	 * @generated
	 */
	EClass getContainerService();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.ContainerService#getClusterName <em>Cluster Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cluster Name</em>'.
	 * @see cloudinfragen.ContainerService#getClusterName()
	 * @see #getContainerService()
	 * @generated
	 */
	EAttribute getContainerService_ClusterName();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.ContainerService#getNumberOfContainers <em>Number Of Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Containers</em>'.
	 * @see cloudinfragen.ContainerService#getNumberOfContainers()
	 * @see #getContainerService()
	 * @generated
	 */
	EAttribute getContainerService_NumberOfContainers();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.ContainerService#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see cloudinfragen.ContainerService#getImage()
	 * @see #getContainerService()
	 * @generated
	 */
	EAttribute getContainerService_Image();

	/**
	 * Returns the meta object for the reference list '{@link cloudinfragen.ContainerService#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subnets</em>'.
	 * @see cloudinfragen.ContainerService#getSubnets()
	 * @see #getContainerService()
	 * @generated
	 */
	EReference getContainerService_Subnets();

	/**
	 * Returns the meta object for the reference list '{@link cloudinfragen.ContainerService#getSecurityGroups <em>Security Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Groups</em>'.
	 * @see cloudinfragen.ContainerService#getSecurityGroups()
	 * @see #getContainerService()
	 * @generated
	 */
	EReference getContainerService_SecurityGroups();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see cloudinfragen.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.Function#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime</em>'.
	 * @see cloudinfragen.Function#getRuntime()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Runtime();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.Function#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see cloudinfragen.Function#getTrigger()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Trigger();

	/**
	 * Returns the meta object for the reference '{@link cloudinfragen.Function#getIamRole <em>Iam Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iam Role</em>'.
	 * @see cloudinfragen.Function#getIamRole()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_IamRole();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.DatabaseInstance <em>Database Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Instance</em>'.
	 * @see cloudinfragen.DatabaseInstance
	 * @generated
	 */
	EClass getDatabaseInstance();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.DatabaseInstance#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine</em>'.
	 * @see cloudinfragen.DatabaseInstance#getEngine()
	 * @see #getDatabaseInstance()
	 * @generated
	 */
	EAttribute getDatabaseInstance_Engine();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.DatabaseInstance#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see cloudinfragen.DatabaseInstance#getVersion()
	 * @see #getDatabaseInstance()
	 * @generated
	 */
	EAttribute getDatabaseInstance_Version();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.DatabaseInstance#getStorageSize <em>Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Size</em>'.
	 * @see cloudinfragen.DatabaseInstance#getStorageSize()
	 * @see #getDatabaseInstance()
	 * @generated
	 */
	EAttribute getDatabaseInstance_StorageSize();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.DatabaseInstance#isMultiAZ <em>Multi AZ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi AZ</em>'.
	 * @see cloudinfragen.DatabaseInstance#isMultiAZ()
	 * @see #getDatabaseInstance()
	 * @generated
	 */
	EAttribute getDatabaseInstance_MultiAZ();

	/**
	 * Returns the meta object for the reference '{@link cloudinfragen.DatabaseInstance#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subnet</em>'.
	 * @see cloudinfragen.DatabaseInstance#getSubnet()
	 * @see #getDatabaseInstance()
	 * @generated
	 */
	EReference getDatabaseInstance_Subnet();

	/**
	 * Returns the meta object for the reference list '{@link cloudinfragen.DatabaseInstance#getSecurityGroups <em>Security Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Groups</em>'.
	 * @see cloudinfragen.DatabaseInstance#getSecurityGroups()
	 * @see #getDatabaseInstance()
	 * @generated
	 */
	EReference getDatabaseInstance_SecurityGroups();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.NoSQLDatabase <em>No SQL Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No SQL Database</em>'.
	 * @see cloudinfragen.NoSQLDatabase
	 * @generated
	 */
	EClass getNoSQLDatabase();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.NoSQLDatabase#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine</em>'.
	 * @see cloudinfragen.NoSQLDatabase#getEngine()
	 * @see #getNoSQLDatabase()
	 * @generated
	 */
	EAttribute getNoSQLDatabase_Engine();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.NoSQLDatabase#getThroughputCapacity <em>Throughput Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Capacity</em>'.
	 * @see cloudinfragen.NoSQLDatabase#getThroughputCapacity()
	 * @see #getNoSQLDatabase()
	 * @generated
	 */
	EAttribute getNoSQLDatabase_ThroughputCapacity();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.NoSQLDatabase#getReplicaCount <em>Replica Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replica Count</em>'.
	 * @see cloudinfragen.NoSQLDatabase#getReplicaCount()
	 * @see #getNoSQLDatabase()
	 * @generated
	 */
	EAttribute getNoSQLDatabase_ReplicaCount();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.NetworkInterface <em>Network Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Interface</em>'.
	 * @see cloudinfragen.NetworkInterface
	 * @generated
	 */
	EClass getNetworkInterface();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.NetworkInterface#getPrivateIP <em>Private IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private IP</em>'.
	 * @see cloudinfragen.NetworkInterface#getPrivateIP()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EAttribute getNetworkInterface_PrivateIP();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.NetworkInterface#getPublicIP <em>Public IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public IP</em>'.
	 * @see cloudinfragen.NetworkInterface#getPublicIP()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EAttribute getNetworkInterface_PublicIP();

	/**
	 * Returns the meta object for the reference '{@link cloudinfragen.NetworkInterface#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subnet</em>'.
	 * @see cloudinfragen.NetworkInterface#getSubnet()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EReference getNetworkInterface_Subnet();

	/**
	 * Returns the meta object for the reference list '{@link cloudinfragen.NetworkInterface#getSecurityGroups <em>Security Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Groups</em>'.
	 * @see cloudinfragen.NetworkInterface#getSecurityGroups()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EReference getNetworkInterface_SecurityGroups();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.IAMRole <em>IAM Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAM Role</em>'.
	 * @see cloudinfragen.IAMRole
	 * @generated
	 */
	EClass getIAMRole();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.IAMRole#getAssumeRolePolicy <em>Assume Role Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assume Role Policy</em>'.
	 * @see cloudinfragen.IAMRole#getAssumeRolePolicy()
	 * @see #getIAMRole()
	 * @generated
	 */
	EAttribute getIAMRole_AssumeRolePolicy();

	/**
	 * Returns the meta object for the reference list '{@link cloudinfragen.IAMRole#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Policies</em>'.
	 * @see cloudinfragen.IAMRole#getPolicies()
	 * @see #getIAMRole()
	 * @generated
	 */
	EReference getIAMRole_Policies();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.IAMPolicy <em>IAM Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAM Policy</em>'.
	 * @see cloudinfragen.IAMPolicy
	 * @generated
	 */
	EClass getIAMPolicy();

	/**
	 * Returns the meta object for the attribute list '{@link cloudinfragen.IAMPolicy#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actions</em>'.
	 * @see cloudinfragen.IAMPolicy#getActions()
	 * @see #getIAMPolicy()
	 * @generated
	 */
	EAttribute getIAMPolicy_Actions();

	/**
	 * Returns the meta object for the attribute list '{@link cloudinfragen.IAMPolicy#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resources</em>'.
	 * @see cloudinfragen.IAMPolicy#getResources()
	 * @see #getIAMPolicy()
	 * @generated
	 */
	EAttribute getIAMPolicy_Resources();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.Secret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secret</em>'.
	 * @see cloudinfragen.Secret
	 * @generated
	 */
	EClass getSecret();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.Secret#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see cloudinfragen.Secret#getKey()
	 * @see #getSecret()
	 * @generated
	 */
	EAttribute getSecret_Key();

	/**
	 * Returns the meta object for the attribute '{@link cloudinfragen.Secret#isEncrypted <em>Encrypted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypted</em>'.
	 * @see cloudinfragen.Secret#isEncrypted()
	 * @see #getSecret()
	 * @generated
	 */
	EAttribute getSecret_Encrypted();

	/**
	 * Returns the meta object for class '{@link cloudinfragen.MonitoringService <em>Monitoring Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring Service</em>'.
	 * @see cloudinfragen.MonitoringService
	 * @generated
	 */
	EClass getMonitoringService();

	/**
	 * Returns the meta object for the attribute list '{@link cloudinfragen.MonitoringService#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Metrics</em>'.
	 * @see cloudinfragen.MonitoringService#getMetrics()
	 * @see #getMonitoringService()
	 * @generated
	 */
	EAttribute getMonitoringService_Metrics();

	/**
	 * Returns the meta object for the attribute list '{@link cloudinfragen.MonitoringService#getAlerts <em>Alerts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alerts</em>'.
	 * @see cloudinfragen.MonitoringService#getAlerts()
	 * @see #getMonitoringService()
	 * @generated
	 */
	EAttribute getMonitoringService_Alerts();

	/**
	 * Returns the meta object for the reference list '{@link cloudinfragen.MonitoringService#getMonitoredResources <em>Monitored Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Monitored Resources</em>'.
	 * @see cloudinfragen.MonitoringService#getMonitoredResources()
	 * @see #getMonitoringService()
	 * @generated
	 */
	EReference getMonitoringService_MonitoredResources();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CloudinfragenFactory getCloudinfragenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.InfrastructureImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getInfrastructure()
		 * @generated
		 */
		EClass INFRASTRUCTURE = eINSTANCE.getInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE__PROVIDER = eINSTANCE.getInfrastructure_Provider();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__RESOURCES = eINSTANCE.getInfrastructure_Resources();

		/**
		 * The meta object literal for the '{@link cloudinfragen.CloudResource <em>Cloud Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.CloudResource
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getCloudResource()
		 * @generated
		 */
		EClass CLOUD_RESOURCE = eINSTANCE.getCloudResource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_RESOURCE__ID = eINSTANCE.getCloudResource_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_RESOURCE__NAME = eINSTANCE.getCloudResource_Name();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_RESOURCE__REGION = eINSTANCE.getCloudResource_Region();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_RESOURCE__TAGS = eINSTANCE.getCloudResource_Tags();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.ComputeInstanceImpl <em>Compute Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.ComputeInstanceImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getComputeInstance()
		 * @generated
		 */
		EClass COMPUTE_INSTANCE = eINSTANCE.getComputeInstance();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE_INSTANCE__OS = eINSTANCE.getComputeInstance_Os();

		/**
		 * The meta object literal for the '<em><b>Keypair</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE_INSTANCE__KEYPAIR = eINSTANCE.getComputeInstance_Keypair();

		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTE_INSTANCE__SUBNET = eINSTANCE.getComputeInstance_Subnet();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTE_INSTANCE__VOLUMES = eINSTANCE.getComputeInstance_Volumes();

		/**
		 * The meta object literal for the '<em><b>Security Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTE_INSTANCE__SECURITY_GROUPS = eINSTANCE.getComputeInstance_SecurityGroups();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.AutoScalingGroupImpl <em>Auto Scaling Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.AutoScalingGroupImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getAutoScalingGroup()
		 * @generated
		 */
		EClass AUTO_SCALING_GROUP = eINSTANCE.getAutoScalingGroup();

		/**
		 * The meta object literal for the '<em><b>Min Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_SCALING_GROUP__MIN_SIZE = eINSTANCE.getAutoScalingGroup_MinSize();

		/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_SCALING_GROUP__MAX_SIZE = eINSTANCE.getAutoScalingGroup_MaxSize();

		/**
		 * The meta object literal for the '<em><b>Desired Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_SCALING_GROUP__DESIRED_CAPACITY = eINSTANCE.getAutoScalingGroup_DesiredCapacity();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTO_SCALING_GROUP__TEMPLATE = eINSTANCE.getAutoScalingGroup_Template();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTO_SCALING_GROUP__INSTANCES = eINSTANCE.getAutoScalingGroup_Instances();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.VolumeImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__SIZE = eINSTANCE.getVolume_Size();

		/**
		 * The meta object literal for the '<em><b>Encrypted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__ENCRYPTED = eINSTANCE.getVolume_Encrypted();

		/**
		 * The meta object literal for the '<em><b>Attached To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__ATTACHED_TO = eINSTANCE.getVolume_AttachedTo();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.StorageBucketImpl <em>Storage Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.StorageBucketImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getStorageBucket()
		 * @generated
		 */
		EClass STORAGE_BUCKET = eINSTANCE.getStorageBucket();

		/**
		 * The meta object literal for the '<em><b>Versioning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_BUCKET__VERSIONING = eINSTANCE.getStorageBucket_Versioning();

		/**
		 * The meta object literal for the '<em><b>Public Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_BUCKET__PUBLIC_ACCESS = eINSTANCE.getStorageBucket_PublicAccess();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.FileSystemImpl <em>File System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.FileSystemImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getFileSystem()
		 * @generated
		 */
		EClass FILE_SYSTEM = eINSTANCE.getFileSystem();

		/**
		 * The meta object literal for the '<em><b>Mount Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SYSTEM__MOUNT_POINT = eINSTANCE.getFileSystem_MountPoint();

		/**
		 * The meta object literal for the '<em><b>Capacity GB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SYSTEM__CAPACITY_GB = eINSTANCE.getFileSystem_CapacityGB();

		/**
		 * The meta object literal for the '<em><b>Encrypted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SYSTEM__ENCRYPTED = eINSTANCE.getFileSystem_Encrypted();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.VPCImpl <em>VPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.VPCImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getVPC()
		 * @generated
		 */
		EClass VPC = eINSTANCE.getVPC();

		/**
		 * The meta object literal for the '<em><b>Cidr Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC__CIDR_BLOCK = eINSTANCE.getVPC_CidrBlock();

		/**
		 * The meta object literal for the '<em><b>Subnets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC__SUBNETS = eINSTANCE.getVPC_Subnets();

		/**
		 * The meta object literal for the '<em><b>Route Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC__ROUTE_TABLES = eINSTANCE.getVPC_RouteTables();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.SubnetImpl <em>Subnet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.SubnetImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getSubnet()
		 * @generated
		 */
		EClass SUBNET = eINSTANCE.getSubnet();

		/**
		 * The meta object literal for the '<em><b>Cidr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__CIDR = eINSTANCE.getSubnet_Cidr();

		/**
		 * The meta object literal for the '<em><b>Type Subnet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__TYPE_SUBNET = eINSTANCE.getSubnet_TypeSubnet();

		/**
		 * The meta object literal for the '<em><b>Availability Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__AVAILABILITY_ZONE = eINSTANCE.getSubnet_AvailabilityZone();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNET__VPC = eINSTANCE.getSubnet_Vpc();

		/**
		 * The meta object literal for the '<em><b>Route Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNET__ROUTE_TABLE = eINSTANCE.getSubnet_RouteTable();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.RouteTableImpl <em>Route Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.RouteTableImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getRouteTable()
		 * @generated
		 */
		EClass ROUTE_TABLE = eINSTANCE.getRouteTable();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_TABLE__ROUTES = eINSTANCE.getRouteTable_Routes();

		/**
		 * The meta object literal for the '<em><b>Subnets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_TABLE__SUBNETS = eINSTANCE.getRouteTable_Subnets();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.SecurityGroupImpl <em>Security Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.SecurityGroupImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getSecurityGroup()
		 * @generated
		 */
		EClass SECURITY_GROUP = eINSTANCE.getSecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Inbound Rules</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP__INBOUND_RULES = eINSTANCE.getSecurityGroup_InboundRules();

		/**
		 * The meta object literal for the '<em><b>Outbound Rules</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP__OUTBOUND_RULES = eINSTANCE.getSecurityGroup_OutboundRules();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.LoadBalancerImpl <em>Load Balancer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.LoadBalancerImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getLoadBalancer()
		 * @generated
		 */
		EClass LOAD_BALANCER = eINSTANCE.getLoadBalancer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER__TYPE = eINSTANCE.getLoadBalancer_Type();

		/**
		 * The meta object literal for the '<em><b>Auto Scaling Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCER__AUTO_SCALING_GROUPS = eINSTANCE.getLoadBalancer_AutoScalingGroups();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCER__INSTANCES = eINSTANCE.getLoadBalancer_Instances();

		/**
		 * The meta object literal for the '<em><b>Subnets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCER__SUBNETS = eINSTANCE.getLoadBalancer_Subnets();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.IAMEntityImpl <em>IAM Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.IAMEntityImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getIAMEntity()
		 * @generated
		 */
		EClass IAM_ENTITY = eINSTANCE.getIAMEntity();

		/**
		 * The meta object literal for the '<em><b>Entity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IAM_ENTITY__ENTITY_TYPE = eINSTANCE.getIAMEntity_EntityType();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IAM_ENTITY__ACTIONS = eINSTANCE.getIAMEntity_Actions();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IAM_ENTITY__RESOURCES = eINSTANCE.getIAMEntity_Resources();

		/**
		 * The meta object literal for the '<em><b>Assume Role Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IAM_ENTITY__ASSUME_ROLE_POLICY = eINSTANCE.getIAMEntity_AssumeRolePolicy();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.ContainerServiceImpl <em>Container Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.ContainerServiceImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getContainerService()
		 * @generated
		 */
		EClass CONTAINER_SERVICE = eINSTANCE.getContainerService();

		/**
		 * The meta object literal for the '<em><b>Cluster Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_SERVICE__CLUSTER_NAME = eINSTANCE.getContainerService_ClusterName();

		/**
		 * The meta object literal for the '<em><b>Number Of Containers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_SERVICE__NUMBER_OF_CONTAINERS = eINSTANCE.getContainerService_NumberOfContainers();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_SERVICE__IMAGE = eINSTANCE.getContainerService_Image();

		/**
		 * The meta object literal for the '<em><b>Subnets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_SERVICE__SUBNETS = eINSTANCE.getContainerService_Subnets();

		/**
		 * The meta object literal for the '<em><b>Security Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_SERVICE__SECURITY_GROUPS = eINSTANCE.getContainerService_SecurityGroups();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.FunctionImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__RUNTIME = eINSTANCE.getFunction_Runtime();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__TRIGGER = eINSTANCE.getFunction_Trigger();

		/**
		 * The meta object literal for the '<em><b>Iam Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__IAM_ROLE = eINSTANCE.getFunction_IamRole();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.DatabaseInstanceImpl <em>Database Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.DatabaseInstanceImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getDatabaseInstance()
		 * @generated
		 */
		EClass DATABASE_INSTANCE = eINSTANCE.getDatabaseInstance();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_INSTANCE__ENGINE = eINSTANCE.getDatabaseInstance_Engine();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_INSTANCE__VERSION = eINSTANCE.getDatabaseInstance_Version();

		/**
		 * The meta object literal for the '<em><b>Storage Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_INSTANCE__STORAGE_SIZE = eINSTANCE.getDatabaseInstance_StorageSize();

		/**
		 * The meta object literal for the '<em><b>Multi AZ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_INSTANCE__MULTI_AZ = eINSTANCE.getDatabaseInstance_MultiAZ();

		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_INSTANCE__SUBNET = eINSTANCE.getDatabaseInstance_Subnet();

		/**
		 * The meta object literal for the '<em><b>Security Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_INSTANCE__SECURITY_GROUPS = eINSTANCE.getDatabaseInstance_SecurityGroups();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.NoSQLDatabaseImpl <em>No SQL Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.NoSQLDatabaseImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getNoSQLDatabase()
		 * @generated
		 */
		EClass NO_SQL_DATABASE = eINSTANCE.getNoSQLDatabase();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NO_SQL_DATABASE__ENGINE = eINSTANCE.getNoSQLDatabase_Engine();

		/**
		 * The meta object literal for the '<em><b>Throughput Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NO_SQL_DATABASE__THROUGHPUT_CAPACITY = eINSTANCE.getNoSQLDatabase_ThroughputCapacity();

		/**
		 * The meta object literal for the '<em><b>Replica Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NO_SQL_DATABASE__REPLICA_COUNT = eINSTANCE.getNoSQLDatabase_ReplicaCount();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.NetworkInterfaceImpl <em>Network Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.NetworkInterfaceImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getNetworkInterface()
		 * @generated
		 */
		EClass NETWORK_INTERFACE = eINSTANCE.getNetworkInterface();

		/**
		 * The meta object literal for the '<em><b>Private IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE__PRIVATE_IP = eINSTANCE.getNetworkInterface_PrivateIP();

		/**
		 * The meta object literal for the '<em><b>Public IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE__PUBLIC_IP = eINSTANCE.getNetworkInterface_PublicIP();

		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INTERFACE__SUBNET = eINSTANCE.getNetworkInterface_Subnet();

		/**
		 * The meta object literal for the '<em><b>Security Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INTERFACE__SECURITY_GROUPS = eINSTANCE.getNetworkInterface_SecurityGroups();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.IAMRoleImpl <em>IAM Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.IAMRoleImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getIAMRole()
		 * @generated
		 */
		EClass IAM_ROLE = eINSTANCE.getIAMRole();

		/**
		 * The meta object literal for the '<em><b>Assume Role Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IAM_ROLE__ASSUME_ROLE_POLICY = eINSTANCE.getIAMRole_AssumeRolePolicy();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IAM_ROLE__POLICIES = eINSTANCE.getIAMRole_Policies();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.IAMPolicyImpl <em>IAM Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.IAMPolicyImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getIAMPolicy()
		 * @generated
		 */
		EClass IAM_POLICY = eINSTANCE.getIAMPolicy();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IAM_POLICY__ACTIONS = eINSTANCE.getIAMPolicy_Actions();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IAM_POLICY__RESOURCES = eINSTANCE.getIAMPolicy_Resources();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.SecretImpl <em>Secret</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.SecretImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getSecret()
		 * @generated
		 */
		EClass SECRET = eINSTANCE.getSecret();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET__KEY = eINSTANCE.getSecret_Key();

		/**
		 * The meta object literal for the '<em><b>Encrypted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET__ENCRYPTED = eINSTANCE.getSecret_Encrypted();

		/**
		 * The meta object literal for the '{@link cloudinfragen.impl.MonitoringServiceImpl <em>Monitoring Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudinfragen.impl.MonitoringServiceImpl
		 * @see cloudinfragen.impl.CloudinfragenPackageImpl#getMonitoringService()
		 * @generated
		 */
		EClass MONITORING_SERVICE = eINSTANCE.getMonitoringService();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING_SERVICE__METRICS = eINSTANCE.getMonitoringService_Metrics();

		/**
		 * The meta object literal for the '<em><b>Alerts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING_SERVICE__ALERTS = eINSTANCE.getMonitoringService_Alerts();

		/**
		 * The meta object literal for the '<em><b>Monitored Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING_SERVICE__MONITORED_RESOURCES = eINSTANCE.getMonitoringService_MonitoredResources();

	}

} //CloudinfragenPackage
