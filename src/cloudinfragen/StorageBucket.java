/**
 */
package cloudinfragen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.StorageBucket#isVersioning <em>Versioning</em>}</li>
 *   <li>{@link cloudinfragen.StorageBucket#isPublicAccess <em>Public Access</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getStorageBucket()
 * @model
 * @generated
 */
public interface StorageBucket extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Versioning</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versioning</em>' attribute.
	 * @see #setVersioning(boolean)
	 * @see cloudinfragen.CloudinfragenPackage#getStorageBucket_Versioning()
	 * @model default="false" unique="false" ordered="false"
	 * @generated
	 */
	boolean isVersioning();

	/**
	 * Sets the value of the '{@link cloudinfragen.StorageBucket#isVersioning <em>Versioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioning</em>' attribute.
	 * @see #isVersioning()
	 * @generated
	 */
	void setVersioning(boolean value);

	/**
	 * Returns the value of the '<em><b>Public Access</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Access</em>' attribute.
	 * @see #setPublicAccess(boolean)
	 * @see cloudinfragen.CloudinfragenPackage#getStorageBucket_PublicAccess()
	 * @model default="false" unique="false" ordered="false"
	 * @generated
	 */
	boolean isPublicAccess();

	/**
	 * Sets the value of the '{@link cloudinfragen.StorageBucket#isPublicAccess <em>Public Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Access</em>' attribute.
	 * @see #isPublicAccess()
	 * @generated
	 */
	void setPublicAccess(boolean value);

} // StorageBucket
