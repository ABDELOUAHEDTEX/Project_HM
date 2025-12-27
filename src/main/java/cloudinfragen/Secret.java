/**
 */
package cloudinfragen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secret</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.Secret#getKey <em>Key</em>}</li>
 *   <li>{@link cloudinfragen.Secret#isEncrypted <em>Encrypted</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getSecret()
 * @model
 * @generated
 */
public interface Secret extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see cloudinfragen.CloudinfragenPackage#getSecret_Key()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link cloudinfragen.Secret#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Encrypted</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted</em>' attribute.
	 * @see #setEncrypted(boolean)
	 * @see cloudinfragen.CloudinfragenPackage#getSecret_Encrypted()
	 * @model default="true" unique="false" ordered="false"
	 * @generated
	 */
	boolean isEncrypted();

	/**
	 * Sets the value of the '{@link cloudinfragen.Secret#isEncrypted <em>Encrypted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted</em>' attribute.
	 * @see #isEncrypted()
	 * @generated
	 */
	void setEncrypted(boolean value);

} // Secret
