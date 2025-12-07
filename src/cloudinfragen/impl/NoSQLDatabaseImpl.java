/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.NoSQLDatabase;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No SQL Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.NoSQLDatabaseImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link cloudinfragen.impl.NoSQLDatabaseImpl#getThroughputCapacity <em>Throughput Capacity</em>}</li>
 *   <li>{@link cloudinfragen.impl.NoSQLDatabaseImpl#getReplicaCount <em>Replica Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoSQLDatabaseImpl extends CloudResourceImpl implements NoSQLDatabase {
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		result.append(" (engine: ");
		result.append(engine);
		result.append(", throughputCapacity: ");
		result.append(throughputCapacity);
		result.append(", replicaCount: ");
		result.append(replicaCount);
		result.append(')');
		return result.toString();
	}

} //NoSQLDatabaseImpl
