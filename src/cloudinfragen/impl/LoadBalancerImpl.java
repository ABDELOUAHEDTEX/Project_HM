/**
 */
package cloudinfragen.impl;

import cloudinfragen.AutoScalingGroup;
import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.ComputeInstance;
import cloudinfragen.LoadBalancer;
import cloudinfragen.Subnet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Balancer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.LoadBalancerImpl#getType <em>Type</em>}</li>
 *   <li>{@link cloudinfragen.impl.LoadBalancerImpl#getAutoScalingGroups <em>Auto Scaling Groups</em>}</li>
 *   <li>{@link cloudinfragen.impl.LoadBalancerImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link cloudinfragen.impl.LoadBalancerImpl#getSubnets <em>Subnets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadBalancerImpl extends CloudResourceImpl implements LoadBalancer {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAutoScalingGroups() <em>Auto Scaling Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoScalingGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<AutoScalingGroup> autoScalingGroups;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputeInstance> instances;

	/**
	 * The cached value of the '{@link #getSubnets() <em>Subnets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnets()
	 * @generated
	 * @ordered
	 */
	protected EList<Subnet> subnets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.LOAD_BALANCER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.LOAD_BALANCER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AutoScalingGroup> getAutoScalingGroups() {
		if (autoScalingGroups == null) {
			autoScalingGroups = new EObjectResolvingEList<AutoScalingGroup>(AutoScalingGroup.class, this, CloudinfragenPackage.LOAD_BALANCER__AUTO_SCALING_GROUPS);
		}
		return autoScalingGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComputeInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectResolvingEList<ComputeInstance>(ComputeInstance.class, this, CloudinfragenPackage.LOAD_BALANCER__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subnet> getSubnets() {
		if (subnets == null) {
			subnets = new EObjectResolvingEList<Subnet>(Subnet.class, this, CloudinfragenPackage.LOAD_BALANCER__SUBNETS);
		}
		return subnets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudinfragenPackage.LOAD_BALANCER__TYPE:
				return getType();
			case CloudinfragenPackage.LOAD_BALANCER__AUTO_SCALING_GROUPS:
				return getAutoScalingGroups();
			case CloudinfragenPackage.LOAD_BALANCER__INSTANCES:
				return getInstances();
			case CloudinfragenPackage.LOAD_BALANCER__SUBNETS:
				return getSubnets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CloudinfragenPackage.LOAD_BALANCER__TYPE:
				setType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CloudinfragenPackage.LOAD_BALANCER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CloudinfragenPackage.LOAD_BALANCER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CloudinfragenPackage.LOAD_BALANCER__AUTO_SCALING_GROUPS:
				return autoScalingGroups != null && !autoScalingGroups.isEmpty();
			case CloudinfragenPackage.LOAD_BALANCER__INSTANCES:
				return instances != null && !instances.isEmpty();
			case CloudinfragenPackage.LOAD_BALANCER__SUBNETS:
				return subnets != null && !subnets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LoadBalancerImpl
