/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.FileSystem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.FileSystemImpl#getMountPoint <em>Mount Point</em>}</li>
 *   <li>{@link cloudinfragen.impl.FileSystemImpl#getCapacityGB <em>Capacity GB</em>}</li>
 *   <li>{@link cloudinfragen.impl.FileSystemImpl#isEncrypted <em>Encrypted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileSystemImpl extends CloudResourceImpl implements FileSystem {
	/**
	 * The default value of the '{@link #getMountPoint() <em>Mount Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String MOUNT_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMountPoint() <em>Mount Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountPoint()
	 * @generated
	 * @ordered
	 */
	protected String mountPoint = MOUNT_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacityGB() <em>Capacity GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityGB()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_GB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacityGB() <em>Capacity GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityGB()
	 * @generated
	 * @ordered
	 */
	protected int capacityGB = CAPACITY_GB_EDEFAULT;

	/**
	 * The default value of the '{@link #isEncrypted() <em>Encrypted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncrypted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENCRYPTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEncrypted() <em>Encrypted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncrypted()
	 * @generated
	 * @ordered
	 */
	protected boolean encrypted = ENCRYPTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.FILE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMountPoint() {
		return mountPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMountPoint(String newMountPoint) {
		String oldMountPoint = mountPoint;
		mountPoint = newMountPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.FILE_SYSTEM__MOUNT_POINT, oldMountPoint, mountPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacityGB() {
		return capacityGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacityGB(int newCapacityGB) {
		int oldCapacityGB = capacityGB;
		capacityGB = newCapacityGB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.FILE_SYSTEM__CAPACITY_GB, oldCapacityGB, capacityGB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEncrypted() {
		return encrypted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncrypted(boolean newEncrypted) {
		boolean oldEncrypted = encrypted;
		encrypted = newEncrypted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.FILE_SYSTEM__ENCRYPTED, oldEncrypted, encrypted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudinfragenPackage.FILE_SYSTEM__MOUNT_POINT:
				return getMountPoint();
			case CloudinfragenPackage.FILE_SYSTEM__CAPACITY_GB:
				return getCapacityGB();
			case CloudinfragenPackage.FILE_SYSTEM__ENCRYPTED:
				return isEncrypted();
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
			case CloudinfragenPackage.FILE_SYSTEM__MOUNT_POINT:
				setMountPoint((String)newValue);
				return;
			case CloudinfragenPackage.FILE_SYSTEM__CAPACITY_GB:
				setCapacityGB((Integer)newValue);
				return;
			case CloudinfragenPackage.FILE_SYSTEM__ENCRYPTED:
				setEncrypted((Boolean)newValue);
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
			case CloudinfragenPackage.FILE_SYSTEM__MOUNT_POINT:
				setMountPoint(MOUNT_POINT_EDEFAULT);
				return;
			case CloudinfragenPackage.FILE_SYSTEM__CAPACITY_GB:
				setCapacityGB(CAPACITY_GB_EDEFAULT);
				return;
			case CloudinfragenPackage.FILE_SYSTEM__ENCRYPTED:
				setEncrypted(ENCRYPTED_EDEFAULT);
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
			case CloudinfragenPackage.FILE_SYSTEM__MOUNT_POINT:
				return MOUNT_POINT_EDEFAULT == null ? mountPoint != null : !MOUNT_POINT_EDEFAULT.equals(mountPoint);
			case CloudinfragenPackage.FILE_SYSTEM__CAPACITY_GB:
				return capacityGB != CAPACITY_GB_EDEFAULT;
			case CloudinfragenPackage.FILE_SYSTEM__ENCRYPTED:
				return encrypted != ENCRYPTED_EDEFAULT;
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
		result.append(" (mountPoint: ");
		result.append(mountPoint);
		result.append(", capacityGB: ");
		result.append(capacityGB);
		result.append(", encrypted: ");
		result.append(encrypted);
		result.append(')');
		return result.toString();
	}

} //FileSystemImpl
