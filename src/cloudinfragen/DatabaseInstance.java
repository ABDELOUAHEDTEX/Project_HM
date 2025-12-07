/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.DatabaseInstance#getEngine <em>Engine</em>}</li>
 *   <li>{@link cloudinfragen.DatabaseInstance#getVersion <em>Version</em>}</li>
 *   <li>{@link cloudinfragen.DatabaseInstance#getStorageSize <em>Storage Size</em>}</li>
 *   <li>{@link cloudinfragen.DatabaseInstance#isMultiAZ <em>Multi AZ</em>}</li>
 *   <li>{@link cloudinfragen.DatabaseInstance#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link cloudinfragen.DatabaseInstance#getSecurityGroups <em>Security Groups</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getDatabaseInstance()
 * @model
 * @generated
 */
public interface DatabaseInstance extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' attribute.
	 * @see #setEngine(String)
	 * @see cloudinfragen.CloudinfragenPackage#getDatabaseInstance_Engine()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getEngine();

	/**
	 * Sets the value of the '{@link cloudinfragen.DatabaseInstance#getEngine <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' attribute.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see cloudinfragen.CloudinfragenPackage#getDatabaseInstance_Version()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link cloudinfragen.DatabaseInstance#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Size</em>' attribute.
	 * @see #setStorageSize(int)
	 * @see cloudinfragen.CloudinfragenPackage#getDatabaseInstance_StorageSize()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getStorageSize();

	/**
	 * Sets the value of the '{@link cloudinfragen.DatabaseInstance#getStorageSize <em>Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Size</em>' attribute.
	 * @see #getStorageSize()
	 * @generated
	 */
	void setStorageSize(int value);

	/**
	 * Returns the value of the '<em><b>Multi AZ</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi AZ</em>' attribute.
	 * @see #setMultiAZ(boolean)
	 * @see cloudinfragen.CloudinfragenPackage#getDatabaseInstance_MultiAZ()
	 * @model default="false" unique="false" ordered="false"
	 * @generated
	 */
	boolean isMultiAZ();

	/**
	 * Sets the value of the '{@link cloudinfragen.DatabaseInstance#isMultiAZ <em>Multi AZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi AZ</em>' attribute.
	 * @see #isMultiAZ()
	 * @generated
	 */
	void setMultiAZ(boolean value);

	/**
	 * Returns the value of the '<em><b>Subnet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet</em>' reference.
	 * @see cloudinfragen.CloudinfragenPackage#getDatabaseInstance_Subnet()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	Subnet getSubnet();

	/**
	 * Returns the value of the '<em><b>Security Groups</b></em>' reference list.
	 * The list contents are of type {@link cloudinfragen.SecurityGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Groups</em>' reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getDatabaseInstance_SecurityGroups()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	EList<SecurityGroup> getSecurityGroups();

} // DatabaseInstance
