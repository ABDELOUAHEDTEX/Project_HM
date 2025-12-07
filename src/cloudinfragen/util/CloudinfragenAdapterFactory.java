/**
 */
package cloudinfragen.util;

import cloudinfragen.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cloudinfragen.CloudinfragenPackage
 * @generated
 */
public class CloudinfragenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CloudinfragenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudinfragenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CloudinfragenPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudinfragenSwitch<Adapter> modelSwitch =
		new CloudinfragenSwitch<Adapter>() {
			@Override
			public Adapter caseInfrastructure(Infrastructure object) {
				return createInfrastructureAdapter();
			}
			@Override
			public Adapter caseCloudResource(CloudResource object) {
				return createCloudResourceAdapter();
			}
			@Override
			public Adapter caseComputeInstance(ComputeInstance object) {
				return createComputeInstanceAdapter();
			}
			@Override
			public Adapter caseAutoScalingGroup(AutoScalingGroup object) {
				return createAutoScalingGroupAdapter();
			}
			@Override
			public Adapter caseVolume(Volume object) {
				return createVolumeAdapter();
			}
			@Override
			public Adapter caseStorageBucket(StorageBucket object) {
				return createStorageBucketAdapter();
			}
			@Override
			public Adapter caseFileSystem(FileSystem object) {
				return createFileSystemAdapter();
			}
			@Override
			public Adapter caseVPC(VPC object) {
				return createVPCAdapter();
			}
			@Override
			public Adapter caseSubnet(Subnet object) {
				return createSubnetAdapter();
			}
			@Override
			public Adapter caseRouteTable(RouteTable object) {
				return createRouteTableAdapter();
			}
			@Override
			public Adapter caseSecurityGroup(SecurityGroup object) {
				return createSecurityGroupAdapter();
			}
			@Override
			public Adapter caseLoadBalancer(LoadBalancer object) {
				return createLoadBalancerAdapter();
			}
			@Override
			public Adapter caseIAMEntity(IAMEntity object) {
				return createIAMEntityAdapter();
			}
			@Override
			public Adapter caseMonitoringService(MonitoringService object) {
				return createMonitoringServiceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cloudinfragen.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudinfragen.Infrastructure
	 * @generated
	 */
	public Adapter createInfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudinfragen.CloudResource <em>Cloud Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudinfragen.CloudResource
	 * @generated
	 */
	public Adapter createCloudResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudinfragen.ComputeInstance <em>Compute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudinfragen.ComputeInstance
	 * @generated
	 */
	public Adapter createComputeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudinfragen.AutoScalingGroup <em>Auto Scaling Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudinfragen.AutoScalingGroup
	 * @generated
	 */
	public Adapter createAutoScalingGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudinfragen.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudinfragen.Volume
	 * @generated
	 */
	public Adapter createVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudinfragen.StorageBucket <em>Storage Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudinfragen.StorageBucket
	 * @generated
	 */
	public Adapter createStorageBucketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudinfragen.FileSystem <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudinfragen.FileSystem
	 * @generated
	 */
	public Adapter createFileSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudinfragen.VPC <em>VPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudinfragen.VPC
	 * @generated
	 */
	public Adapter createVPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudinfragen.Subnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudinfragen.Subnet
	 * @generated
	 */
	public Adapter createSubnetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudinfragen.RouteTable <em>Route Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudinfragen.RouteTable
	 * @generated
	 */
	public Adapter createRouteTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudinfragen.SecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudinfragen.SecurityGroup
	 * @generated
	 */
	public Adapter createSecurityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudinfragen.LoadBalancer <em>Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudinfragen.LoadBalancer
	 * @generated
	 */
	public Adapter createLoadBalancerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudinfragen.IAMEntity <em>IAM Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudinfragen.IAMEntity
	 * @generated
	 */
	public Adapter createIAMEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudinfragen.MonitoringService <em>Monitoring Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudinfragen.MonitoringService
	 * @generated
	 */
	public Adapter createMonitoringServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CloudinfragenAdapterFactory
