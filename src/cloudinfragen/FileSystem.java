/**
 */
package cloudinfragen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.FileSystem#getMountPoint <em>Mount Point</em>}</li>
 *   <li>{@link cloudinfragen.FileSystem#getCapacityGB <em>Capacity GB</em>}</li>
 *   <li>{@link cloudinfragen.FileSystem#isEncrypted <em>Encrypted</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getFileSystem()
 * @model
 * @generated
 */
public interface FileSystem extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Mount Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mount Point</em>' attribute.
	 * @see #setMountPoint(String)
	 * @see cloudinfragen.CloudinfragenPackage#getFileSystem_MountPoint()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getMountPoint();

	/**
	 * Sets the value of the '{@link cloudinfragen.FileSystem#getMountPoint <em>Mount Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount Point</em>' attribute.
	 * @see #getMountPoint()
	 * @generated
	 */
	void setMountPoint(String value);

	/**
	 * Returns the value of the '<em><b>Capacity GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity GB</em>' attribute.
	 * @see #setCapacityGB(int)
	 * @see cloudinfragen.CloudinfragenPackage#getFileSystem_CapacityGB()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getCapacityGB();

	/**
	 * Sets the value of the '{@link cloudinfragen.FileSystem#getCapacityGB <em>Capacity GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity GB</em>' attribute.
	 * @see #getCapacityGB()
	 * @generated
	 */
	void setCapacityGB(int value);

	/**
	 * Returns the value of the '<em><b>Encrypted</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted</em>' attribute.
	 * @see #setEncrypted(boolean)
	 * @see cloudinfragen.CloudinfragenPackage#getFileSystem_Encrypted()
	 * @model default="false" unique="false" ordered="false"
	 * @generated
	 */
	boolean isEncrypted();

	/**
	 * Sets the value of the '{@link cloudinfragen.FileSystem#isEncrypted <em>Encrypted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted</em>' attribute.
	 * @see #isEncrypted()
	 * @generated
	 */
	void setEncrypted(boolean value);

} // FileSystem
