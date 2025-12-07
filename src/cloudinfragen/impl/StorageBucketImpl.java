/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.StorageBucket;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.StorageBucketImpl#isVersioning <em>Versioning</em>}</li>
 *   <li>{@link cloudinfragen.impl.StorageBucketImpl#isPublicAccess <em>Public Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageBucketImpl extends CloudResourceImpl implements StorageBucket {
	/**
	 * The default value of the '{@link #isVersioning() <em>Versioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersioning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERSIONING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVersioning() <em>Versioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersioning()
	 * @generated
	 * @ordered
	 */
	protected boolean versioning = VERSIONING_EDEFAULT;

	/**
	 * The default value of the '{@link #isPublicAccess() <em>Public Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublicAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLIC_ACCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublicAccess() <em>Public Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublicAccess()
	 * @generated
	 * @ordered
	 */
	protected boolean publicAccess = PUBLIC_ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.STORAGE_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVersioning() {
		return versioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersioning(boolean newVersioning) {
		boolean oldVersioning = versioning;
		versioning = newVersioning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.STORAGE_BUCKET__VERSIONING, oldVersioning, versioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPublicAccess() {
		return publicAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicAccess(boolean newPublicAccess) {
		boolean oldPublicAccess = publicAccess;
		publicAccess = newPublicAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.STORAGE_BUCKET__PUBLIC_ACCESS, oldPublicAccess, publicAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudinfragenPackage.STORAGE_BUCKET__VERSIONING:
				return isVersioning();
			case CloudinfragenPackage.STORAGE_BUCKET__PUBLIC_ACCESS:
				return isPublicAccess();
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
			case CloudinfragenPackage.STORAGE_BUCKET__VERSIONING:
				setVersioning((Boolean)newValue);
				return;
			case CloudinfragenPackage.STORAGE_BUCKET__PUBLIC_ACCESS:
				setPublicAccess((Boolean)newValue);
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
			case CloudinfragenPackage.STORAGE_BUCKET__VERSIONING:
				setVersioning(VERSIONING_EDEFAULT);
				return;
			case CloudinfragenPackage.STORAGE_BUCKET__PUBLIC_ACCESS:
				setPublicAccess(PUBLIC_ACCESS_EDEFAULT);
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
			case CloudinfragenPackage.STORAGE_BUCKET__VERSIONING:
				return versioning != VERSIONING_EDEFAULT;
			case CloudinfragenPackage.STORAGE_BUCKET__PUBLIC_ACCESS:
				return publicAccess != PUBLIC_ACCESS_EDEFAULT;
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
		result.append(" (versioning: ");
		result.append(versioning);
		result.append(", publicAccess: ");
		result.append(publicAccess);
		result.append(')');
		return result.toString();
	}

} //StorageBucketImpl
