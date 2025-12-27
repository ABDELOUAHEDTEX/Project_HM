/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.NoSQLDatabase;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No SQL Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.NoSQLDatabaseImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudinfragen.impl.NoSQLDatabaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudinfragen.impl.NoSQLDatabaseImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link cloudinfragen.impl.NoSQLDatabaseImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link cloudinfragen.impl.NoSQLDatabaseImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link cloudinfragen.impl.NoSQLDatabaseImpl#getThroughputCapacity <em>Throughput Capacity</em>}</li>
 *   <li>{@link cloudinfragen.impl.NoSQLDatabaseImpl#getReplicaCount <em>Replica Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoSQLDatabaseImpl extends MinimalEObjectImpl.Container implements NoSQLDatabase {
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
	 * The default value of the '{@link #getThroughputCapacity() <em>Throughput Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int THROUGHPUT_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThroughputCapacity() <em>Throughput Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputCapacity()
	 * @generated
	 * @ordered
	 */
	protected int throughputCapacity = THROUGHPUT_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplicaCount() <em>Replica Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicaCount()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICA_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplicaCount() <em>Replica Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicaCount()
	 * @generated
	 * @ordered
	 */
	protected int replicaCount = REPLICA_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoSQLDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.NO_SQL_DATABASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.NO_SQL_DATABASE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.NO_SQL_DATABASE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.NO_SQL_DATABASE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CloudinfragenPackage.NO_SQL_DATABASE__TAGS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.NO_SQL_DATABASE__ENGINE, oldEngine, engine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getThroughputCapacity() {
		return throughputCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThroughputCapacity(int newThroughputCapacity) {
		int oldThroughputCapacity = throughputCapacity;
		throughputCapacity = newThroughputCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.NO_SQL_DATABASE__THROUGHPUT_CAPACITY, oldThroughputCapacity, throughputCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReplicaCount() {
		return replicaCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplicaCount(int newReplicaCount) {
		int oldReplicaCount = replicaCount;
		replicaCount = newReplicaCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.NO_SQL_DATABASE__REPLICA_COUNT, oldReplicaCount, replicaCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudinfragenPackage.NO_SQL_DATABASE__ID:
				return getId();
			case CloudinfragenPackage.NO_SQL_DATABASE__NAME:
				return getName();
			case CloudinfragenPackage.NO_SQL_DATABASE__REGION:
				return getRegion();
			case CloudinfragenPackage.NO_SQL_DATABASE__TAGS:
				return getTags();
			case CloudinfragenPackage.NO_SQL_DATABASE__ENGINE:
				return getEngine();
			case CloudinfragenPackage.NO_SQL_DATABASE__THROUGHPUT_CAPACITY:
				return getThroughputCapacity();
			case CloudinfragenPackage.NO_SQL_DATABASE__REPLICA_COUNT:
				return getReplicaCount();
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
			case CloudinfragenPackage.NO_SQL_DATABASE__ID:
				setId((String)newValue);
				return;
			case CloudinfragenPackage.NO_SQL_DATABASE__NAME:
				setName((String)newValue);
				return;
			case CloudinfragenPackage.NO_SQL_DATABASE__REGION:
				setRegion((String)newValue);
				return;
			case CloudinfragenPackage.NO_SQL_DATABASE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case CloudinfragenPackage.NO_SQL_DATABASE__ENGINE:
				setEngine((String)newValue);
				return;
			case CloudinfragenPackage.NO_SQL_DATABASE__THROUGHPUT_CAPACITY:
				setThroughputCapacity((Integer)newValue);
				return;
			case CloudinfragenPackage.NO_SQL_DATABASE__REPLICA_COUNT:
				setReplicaCount((Integer)newValue);
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
			case CloudinfragenPackage.NO_SQL_DATABASE__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudinfragenPackage.NO_SQL_DATABASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudinfragenPackage.NO_SQL_DATABASE__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CloudinfragenPackage.NO_SQL_DATABASE__TAGS:
				getTags().clear();
				return;
			case CloudinfragenPackage.NO_SQL_DATABASE__ENGINE:
				setEngine(ENGINE_EDEFAULT);
				return;
			case CloudinfragenPackage.NO_SQL_DATABASE__THROUGHPUT_CAPACITY:
				setThroughputCapacity(THROUGHPUT_CAPACITY_EDEFAULT);
				return;
			case CloudinfragenPackage.NO_SQL_DATABASE__REPLICA_COUNT:
				setReplicaCount(REPLICA_COUNT_EDEFAULT);
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
			case CloudinfragenPackage.NO_SQL_DATABASE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudinfragenPackage.NO_SQL_DATABASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudinfragenPackage.NO_SQL_DATABASE__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CloudinfragenPackage.NO_SQL_DATABASE__TAGS:
				return tags != null && !tags.isEmpty();
			case CloudinfragenPackage.NO_SQL_DATABASE__ENGINE:
				return ENGINE_EDEFAULT == null ? engine != null : !ENGINE_EDEFAULT.equals(engine);
			case CloudinfragenPackage.NO_SQL_DATABASE__THROUGHPUT_CAPACITY:
				return throughputCapacity != THROUGHPUT_CAPACITY_EDEFAULT;
			case CloudinfragenPackage.NO_SQL_DATABASE__REPLICA_COUNT:
				return replicaCount != REPLICA_COUNT_EDEFAULT;
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
		result.append(", throughputCapacity: ");
		result.append(throughputCapacity);
		result.append(", replicaCount: ");
		result.append(replicaCount);
		result.append(')');
		return result.toString();
	}

} //NoSQLDatabaseImpl
