/**
 */
package cloudinfragen.impl;

import cloudinfragen.AutoScalingGroup;
import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.ComputeInstance;
import cloudinfragen.LoadBalancer;
import cloudinfragen.Subnet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Balancer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.LoadBalancerImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudinfragen.impl.LoadBalancerImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudinfragen.impl.LoadBalancerImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link cloudinfragen.impl.LoadBalancerImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link cloudinfragen.impl.LoadBalancerImpl#getType <em>Type</em>}</li>
 *   <li>{@link cloudinfragen.impl.LoadBalancerImpl#getAutoScalingGroups <em>Auto Scaling Groups</em>}</li>
 *   <li>{@link cloudinfragen.impl.LoadBalancerImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link cloudinfragen.impl.LoadBalancerImpl#getSubnets <em>Subnets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadBalancerImpl extends MinimalEObjectImpl.Container implements LoadBalancer {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

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
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.LOAD_BALANCER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.LOAD_BALANCER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.LOAD_BALANCER__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CloudinfragenPackage.LOAD_BALANCER__TAGS);
		}
		return tags;
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
			case CloudinfragenPackage.LOAD_BALANCER__ID:
				return getId();
			case CloudinfragenPackage.LOAD_BALANCER__NAME:
				return getName();
			case CloudinfragenPackage.LOAD_BALANCER__REGION:
				return getRegion();
			case CloudinfragenPackage.LOAD_BALANCER__TAGS:
				return getTags();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CloudinfragenPackage.LOAD_BALANCER__ID:
				setId((String)newValue);
				return;
			case CloudinfragenPackage.LOAD_BALANCER__NAME:
				setName((String)newValue);
				return;
			case CloudinfragenPackage.LOAD_BALANCER__REGION:
				setRegion((String)newValue);
				return;
			case CloudinfragenPackage.LOAD_BALANCER__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
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
			case CloudinfragenPackage.LOAD_BALANCER__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudinfragenPackage.LOAD_BALANCER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudinfragenPackage.LOAD_BALANCER__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CloudinfragenPackage.LOAD_BALANCER__TAGS:
				getTags().clear();
				return;
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
			case CloudinfragenPackage.LOAD_BALANCER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudinfragenPackage.LOAD_BALANCER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudinfragenPackage.LOAD_BALANCER__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CloudinfragenPackage.LOAD_BALANCER__TAGS:
				return tags != null && !tags.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", region: ");
		result.append(region);
		result.append(", tags: ");
		result.append(tags);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LoadBalancerImpl
