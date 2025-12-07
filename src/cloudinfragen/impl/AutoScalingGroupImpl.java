/**
 */
package cloudinfragen.impl;

import cloudinfragen.AutoScalingGroup;
import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.ComputeInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Scaling Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.AutoScalingGroupImpl#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link cloudinfragen.impl.AutoScalingGroupImpl#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link cloudinfragen.impl.AutoScalingGroupImpl#getDesiredCapacity <em>Desired Capacity</em>}</li>
 *   <li>{@link cloudinfragen.impl.AutoScalingGroupImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutoScalingGroupImpl extends CloudResourceImpl implements AutoScalingGroup {
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
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MIN_SIZE:
				return getMinSize();
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MAX_SIZE:
				return getMaxSize();
			case CloudinfragenPackage.AUTO_SCALING_GROUP__DESIRED_CAPACITY:
				return getDesiredCapacity();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MIN_SIZE:
				setMinSize((Integer)newValue);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MAX_SIZE:
				setMaxSize((Integer)newValue);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__DESIRED_CAPACITY:
				setDesiredCapacity((Integer)newValue);
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
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MIN_SIZE:
				setMinSize(MIN_SIZE_EDEFAULT);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MAX_SIZE:
				setMaxSize(MAX_SIZE_EDEFAULT);
				return;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__DESIRED_CAPACITY:
				setDesiredCapacity(DESIRED_CAPACITY_EDEFAULT);
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
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MIN_SIZE:
				return minSize != MIN_SIZE_EDEFAULT;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__MAX_SIZE:
				return maxSize != MAX_SIZE_EDEFAULT;
			case CloudinfragenPackage.AUTO_SCALING_GROUP__DESIRED_CAPACITY:
				return desiredCapacity != DESIRED_CAPACITY_EDEFAULT;
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
		result.append(" (minSize: ");
		result.append(minSize);
		result.append(", maxSize: ");
		result.append(maxSize);
		result.append(", desiredCapacity: ");
		result.append(desiredCapacity);
		result.append(')');
		return result.toString();
	}

} //AutoScalingGroupImpl
