/**
 */
package cloudinfragen.impl;

import cloudinfragen.AutoScalingGroup;
import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.ComputeInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Scaling Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.AutoScalingGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudinfragen.impl.AutoScalingGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudinfragen.impl.AutoScalingGroupImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link cloudinfragen.impl.AutoScalingGroupImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link cloudinfragen.impl.AutoScalingGroupImpl#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link cloudinfragen.impl.AutoScalingGroupImpl#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link cloudinfragen.impl.AutoScalingGroupImpl#getDesiredCapacity <em>Desired Capacity</em>}</li>
 *   <li>{@link cloudinfragen.impl.AutoScalingGroupImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link cloudinfragen.impl.AutoScalingGroupImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutoScalingGroupImpl extends MinimalEObjectImpl.Container implements AutoScalingGroup {
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
	 * The default value of the '{@link #getMinSize() <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_SIZE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMinSize() <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSize()
	 * @generated
	 * @ordered
	 */
	protected int minSize = MIN_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SIZE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected int maxSize = MAX_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesiredCapacity() <em>Desired Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int DESIRED_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDesiredCapacity() <em>Desired Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredCapacity()
	 * @generated
	 * @ordered
	 */
	protected int desiredCapacity = DESIRED_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected ComputeInstance template;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoScalingGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.AUTO_SCALING_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.AUTO_SCALING_GROUP__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.AUTO_SCALING_GROUP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.AUTO_SCALING_GROUP__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CloudinfragenPackage.AUTO_SCALING_GROUP__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinSize() {
		return minSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinSize(int newMinSize) {
		int oldMinSize = minSize;
		minSize = newMinSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.AUTO_SCALING_GROUP__MIN_SIZE, oldMinSize, minSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxSize() {
		return maxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSize(int newMaxSize) {
		int oldMaxSize = maxSize;
		maxSize = newMaxSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.AUTO_SCALING_GROUP__MAX_SIZE, oldMaxSize, maxSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDesiredCapacity() {
		return desiredCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesiredCapacity(int newDesiredCapacity) {
		int oldDesiredCapacity = desiredCapacity;
		desiredCapacity = newDesiredCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.AUTO_SCALING_GROUP__DESIRED_CAPACITY, oldDesiredCapacity, desiredCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputeInstance getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject)template;
			template = (ComputeInstance)eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudinfragenPackage.AUTO_SCALING_GROUP__TEMPLATE, oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeInstance basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplate(ComputeInstance newTemplate) {
		ComputeInstance oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.AUTO_SCALING_GROUP__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComputeInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectResolvingEList<ComputeInstance>(ComputeInstance.class, this, CloudinfragenPackage.AUTO_SCALING_GROUP__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudinfragenPackage.AUTO_SCALING_GROUP__ID:
				return getId();
			case CloudinfragenPackage.AUTO_SCALING_GROUP__NAME:
				return getName();
			case CloudinfragenPackage.AUTO_SCALING_GROUP__REGION:
				return getRegion();
			case CloudinfragenPackage.AUTO_SCALING_GROUP__TAGS:
				return getTags();
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MIN_SIZE:
				return getMinSize();
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MAX_SIZE:
				return getMaxSize();
			case CloudinfragenPackage.AUTO_SCALING_GROUP__DESIRED_CAPACITY:
				return getDesiredCapacity();
			case CloudinfragenPackage.AUTO_SCALING_GROUP__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
			case CloudinfragenPackage.AUTO_SCALING_GROUP__INSTANCES:
				return getInstances();
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
			case CloudinfragenPackage.AUTO_SCALING_GROUP__ID:
				setId((String)newValue);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__NAME:
				setName((String)newValue);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__REGION:
				setRegion((String)newValue);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MIN_SIZE:
				setMinSize((Integer)newValue);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MAX_SIZE:
				setMaxSize((Integer)newValue);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__DESIRED_CAPACITY:
				setDesiredCapacity((Integer)newValue);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__TEMPLATE:
				setTemplate((ComputeInstance)newValue);
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
			case CloudinfragenPackage.AUTO_SCALING_GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__TAGS:
				getTags().clear();
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MIN_SIZE:
				setMinSize(MIN_SIZE_EDEFAULT);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MAX_SIZE:
				setMaxSize(MAX_SIZE_EDEFAULT);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__DESIRED_CAPACITY:
				setDesiredCapacity(DESIRED_CAPACITY_EDEFAULT);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__TEMPLATE:
				setTemplate((ComputeInstance)null);
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
			case CloudinfragenPackage.AUTO_SCALING_GROUP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudinfragenPackage.AUTO_SCALING_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudinfragenPackage.AUTO_SCALING_GROUP__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CloudinfragenPackage.AUTO_SCALING_GROUP__TAGS:
				return tags != null && !tags.isEmpty();
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MIN_SIZE:
				return minSize != MIN_SIZE_EDEFAULT;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MAX_SIZE:
				return maxSize != MAX_SIZE_EDEFAULT;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__DESIRED_CAPACITY:
				return desiredCapacity != DESIRED_CAPACITY_EDEFAULT;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__TEMPLATE:
				return template != null;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__INSTANCES:
				return instances != null && !instances.isEmpty();
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
		result.append(", minSize: ");
		result.append(minSize);
		result.append(", maxSize: ");
		result.append(maxSize);
		result.append(", desiredCapacity: ");
		result.append(desiredCapacity);
		result.append(')');
		return result.toString();
	}

} //AutoScalingGroupImpl
