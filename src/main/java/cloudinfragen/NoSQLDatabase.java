/**
 */
package cloudinfragen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No SQL Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.NoSQLDatabase#getEngine <em>Engine</em>}</li>
 *   <li>{@link cloudinfragen.NoSQLDatabase#getThroughputCapacity <em>Throughput Capacity</em>}</li>
 *   <li>{@link cloudinfragen.NoSQLDatabase#getReplicaCount <em>Replica Count</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getNoSQLDatabase()
 * @model
 * @generated
 */
public interface NoSQLDatabase extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' attribute.
	 * @see #setEngine(String)
	 * @see cloudinfragen.CloudinfragenPackage#getNoSQLDatabase_Engine()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getEngine();

	/**
	 * Sets the value of the '{@link cloudinfragen.NoSQLDatabase#getEngine <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' attribute.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(String value);

	/**
	 * Returns the value of the '<em><b>Throughput Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput Capacity</em>' attribute.
	 * @see #setThroughputCapacity(int)
	 * @see cloudinfragen.CloudinfragenPackage#getNoSQLDatabase_ThroughputCapacity()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getThroughputCapacity();

	/**
	 * Sets the value of the '{@link cloudinfragen.NoSQLDatabase#getThroughputCapacity <em>Throughput Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput Capacity</em>' attribute.
	 * @see #getThroughputCapacity()
	 * @generated
	 */
	void setThroughputCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Replica Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replica Count</em>' attribute.
	 * @see #setReplicaCount(int)
	 * @see cloudinfragen.CloudinfragenPackage#getNoSQLDatabase_ReplicaCount()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getReplicaCount();

	/**
	 * Sets the value of the '{@link cloudinfragen.NoSQLDatabase#getReplicaCount <em>Replica Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replica Count</em>' attribute.
	 * @see #getReplicaCount()
	 * @generated
	 */
	void setReplicaCount(int value);

} // NoSQLDatabase
