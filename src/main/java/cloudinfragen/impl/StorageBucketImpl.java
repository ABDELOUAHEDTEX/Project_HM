/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.StorageBucket;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.StorageBucketImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudinfragen.impl.StorageBucketImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudinfragen.impl.StorageBucketImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link cloudinfragen.impl.StorageBucketImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link cloudinfragen.impl.StorageBucketImpl#isVersioning <em>Versioning</em>}</li>
 *   <li>{@link cloudinfragen.impl.StorageBucketImpl#isPublicAccess <em>Public Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageBucketImpl extends MinimalEObjectImpl.Container implements StorageBucket {
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.STORAGE_BUCKET__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.STORAGE_BUCKET__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.STORAGE_BUCKET__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CloudinfragenPackage.STORAGE_BUCKET__TAGS);
		}
		return tags;
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
			case CloudinfragenPackage.STORAGE_BUCKET__ID:
				return getId();
			case CloudinfragenPackage.STORAGE_BUCKET__NAME:
				return getName();
			case CloudinfragenPackage.STORAGE_BUCKET__REGION:
				return getRegion();
			case CloudinfragenPackage.STORAGE_BUCKET__TAGS:
				return getTags();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CloudinfragenPackage.STORAGE_BUCKET__ID:
				setId((String)newValue);
				return;
			case CloudinfragenPackage.STORAGE_BUCKET__NAME:
				setName((String)newValue);
				return;
			case CloudinfragenPackage.STORAGE_BUCKET__REGION:
				setRegion((String)newValue);
				return;
			case CloudinfragenPackage.STORAGE_BUCKET__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
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
			case CloudinfragenPackage.STORAGE_BUCKET__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudinfragenPackage.STORAGE_BUCKET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudinfragenPackage.STORAGE_BUCKET__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CloudinfragenPackage.STORAGE_BUCKET__TAGS:
				getTags().clear();
				return;
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
			case CloudinfragenPackage.STORAGE_BUCKET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudinfragenPackage.STORAGE_BUCKET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudinfragenPackage.STORAGE_BUCKET__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CloudinfragenPackage.STORAGE_BUCKET__TAGS:
				return tags != null && !tags.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", region: ");
		result.append(region);
		result.append(", tags: ");
		result.append(tags);
		result.append(", versioning: ");
		result.append(versioning);
		result.append(", publicAccess: ");
		result.append(publicAccess);
		result.append(')');
		return result.toString();
	}

} //StorageBucketImpl
