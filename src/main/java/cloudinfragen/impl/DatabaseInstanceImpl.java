/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.DatabaseInstance;
import cloudinfragen.SecurityGroup;
import cloudinfragen.Subnet;

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
 * An implementation of the model object '<em><b>Database Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.DatabaseInstanceImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudinfragen.impl.DatabaseInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudinfragen.impl.DatabaseInstanceImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link cloudinfragen.impl.DatabaseInstanceImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link cloudinfragen.impl.DatabaseInstanceImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link cloudinfragen.impl.DatabaseInstanceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link cloudinfragen.impl.DatabaseInstanceImpl#getStorageSize <em>Storage Size</em>}</li>
 *   <li>{@link cloudinfragen.impl.DatabaseInstanceImpl#isMultiAZ <em>Multi AZ</em>}</li>
 *   <li>{@link cloudinfragen.impl.DatabaseInstanceImpl#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link cloudinfragen.impl.DatabaseInstanceImpl#getSecurityGroups <em>Security Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseInstanceImpl extends MinimalEObjectImpl.Container implements DatabaseInstance {
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
	 * The default value of the '{@link #getEngine() <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngine() <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected String engine = ENGINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageSize() <em>Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageSize()
	 * @generated
	 * @ordered
	 */
	protected static final int STORAGE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStorageSize() <em>Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageSize()
	 * @generated
	 * @ordered
	 */
	protected int storageSize = STORAGE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiAZ() <em>Multi AZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiAZ()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_AZ_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiAZ() <em>Multi AZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiAZ()
	 * @generated
	 * @ordered
	 */
	protected boolean multiAZ = MULTI_AZ_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubnet() <em>Subnet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected Subnet subnet;

	/**
	 * The cached value of the '{@link #getSecurityGroups() <em>Security Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGroup> securityGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.DATABASE_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.DATABASE_INSTANCE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.DATABASE_INSTANCE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.DATABASE_INSTANCE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CloudinfragenPackage.DATABASE_INSTANCE__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEngine() {
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngine(String newEngine) {
		String oldEngine = engine;
		engine = newEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.DATABASE_INSTANCE__ENGINE, oldEngine, engine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.DATABASE_INSTANCE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStorageSize() {
		return storageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageSize(int newStorageSize) {
		int oldStorageSize = storageSize;
		storageSize = newStorageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.DATABASE_INSTANCE__STORAGE_SIZE, oldStorageSize, storageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultiAZ() {
		return multiAZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiAZ(boolean newMultiAZ) {
		boolean oldMultiAZ = multiAZ;
		multiAZ = newMultiAZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.DATABASE_INSTANCE__MULTI_AZ, oldMultiAZ, multiAZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subnet getSubnet() {
		if (subnet != null && subnet.eIsProxy()) {
			InternalEObject oldSubnet = (InternalEObject)subnet;
			subnet = (Subnet)eResolveProxy(oldSubnet);
			if (subnet != oldSubnet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudinfragenPackage.DATABASE_INSTANCE__SUBNET, oldSubnet, subnet));
			}
		}
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subnet basicGetSubnet() {
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityGroup> getSecurityGroups() {
		if (securityGroups == null) {
			securityGroups = new EObjectResolvingEList<SecurityGroup>(SecurityGroup.class, this, CloudinfragenPackage.DATABASE_INSTANCE__SECURITY_GROUPS);
		}
		return securityGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudinfragenPackage.DATABASE_INSTANCE__ID:
				return getId();
			case CloudinfragenPackage.DATABASE_INSTANCE__NAME:
				return getName();
			case CloudinfragenPackage.DATABASE_INSTANCE__REGION:
				return getRegion();
			case CloudinfragenPackage.DATABASE_INSTANCE__TAGS:
				return getTags();
			case CloudinfragenPackage.DATABASE_INSTANCE__ENGINE:
				return getEngine();
			case CloudinfragenPackage.DATABASE_INSTANCE__VERSION:
				return getVersion();
			case CloudinfragenPackage.DATABASE_INSTANCE__STORAGE_SIZE:
				return getStorageSize();
			case CloudinfragenPackage.DATABASE_INSTANCE__MULTI_AZ:
				return isMultiAZ();
			case CloudinfragenPackage.DATABASE_INSTANCE__SUBNET:
				if (resolve) return getSubnet();
				return basicGetSubnet();
			case CloudinfragenPackage.DATABASE_INSTANCE__SECURITY_GROUPS:
				return getSecurityGroups();
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
			case CloudinfragenPackage.DATABASE_INSTANCE__ID:
				setId((String)newValue);
				return;
			case CloudinfragenPackage.DATABASE_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case CloudinfragenPackage.DATABASE_INSTANCE__REGION:
				setRegion((String)newValue);
				return;
			case CloudinfragenPackage.DATABASE_INSTANCE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case CloudinfragenPackage.DATABASE_INSTANCE__ENGINE:
				setEngine((String)newValue);
				return;
			case CloudinfragenPackage.DATABASE_INSTANCE__VERSION:
				setVersion((String)newValue);
				return;
			case CloudinfragenPackage.DATABASE_INSTANCE__STORAGE_SIZE:
				setStorageSize((Integer)newValue);
				return;
			case CloudinfragenPackage.DATABASE_INSTANCE__MULTI_AZ:
				setMultiAZ((Boolean)newValue);
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
			case CloudinfragenPackage.DATABASE_INSTANCE__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudinfragenPackage.DATABASE_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudinfragenPackage.DATABASE_INSTANCE__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CloudinfragenPackage.DATABASE_INSTANCE__TAGS:
				getTags().clear();
				return;
			case CloudinfragenPackage.DATABASE_INSTANCE__ENGINE:
				setEngine(ENGINE_EDEFAULT);
				return;
			case CloudinfragenPackage.DATABASE_INSTANCE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CloudinfragenPackage.DATABASE_INSTANCE__STORAGE_SIZE:
				setStorageSize(STORAGE_SIZE_EDEFAULT);
				return;
			case CloudinfragenPackage.DATABASE_INSTANCE__MULTI_AZ:
				setMultiAZ(MULTI_AZ_EDEFAULT);
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
			case CloudinfragenPackage.DATABASE_INSTANCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudinfragenPackage.DATABASE_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudinfragenPackage.DATABASE_INSTANCE__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CloudinfragenPackage.DATABASE_INSTANCE__TAGS:
				return tags != null && !tags.isEmpty();
			case CloudinfragenPackage.DATABASE_INSTANCE__ENGINE:
				return ENGINE_EDEFAULT == null ? engine != null : !ENGINE_EDEFAULT.equals(engine);
			case CloudinfragenPackage.DATABASE_INSTANCE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CloudinfragenPackage.DATABASE_INSTANCE__STORAGE_SIZE:
				return storageSize != STORAGE_SIZE_EDEFAULT;
			case CloudinfragenPackage.DATABASE_INSTANCE__MULTI_AZ:
				return multiAZ != MULTI_AZ_EDEFAULT;
			case CloudinfragenPackage.DATABASE_INSTANCE__SUBNET:
				return subnet != null;
			case CloudinfragenPackage.DATABASE_INSTANCE__SECURITY_GROUPS:
				return securityGroups != null && !securityGroups.isEmpty();
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
		result.append(", engine: ");
		result.append(engine);
		result.append(", version: ");
		result.append(version);
		result.append(", storageSize: ");
		result.append(storageSize);
		result.append(", multiAZ: ");
		result.append(multiAZ);
		result.append(')');
		return result.toString();
	}

} //DatabaseInstanceImpl
