/**
 */
package cloudinfragen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.ConfigParameter#getKey <em>Key</em>}</li>
 *   <li>{@link cloudinfragen.ConfigParameter#getValue <em>Value</em>}</li>
 *   <li>{@link cloudinfragen.ConfigParameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getConfigParameter()
 * @model
 * @generated
 */
public interface ConfigParameter extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see cloudinfragen.CloudinfragenPackage#getConfigParameter_Key()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link cloudinfragen.ConfigParameter#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see cloudinfragen.CloudinfragenPackage#getConfigParameter_Value()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link cloudinfragen.ConfigParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see cloudinfragen.CloudinfragenPackage#getConfigParameter_Type()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link cloudinfragen.ConfigParameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // ConfigParameter
