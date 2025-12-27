/**
 */
package cloudinfragen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.Function#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link cloudinfragen.Function#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link cloudinfragen.Function#getIamRole <em>Iam Role</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see #setRuntime(String)
	 * @see cloudinfragen.CloudinfragenPackage#getFunction_Runtime()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getRuntime();

	/**
	 * Sets the value of the '{@link cloudinfragen.Function#getRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' attribute.
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(String)
	 * @see cloudinfragen.CloudinfragenPackage#getFunction_Trigger()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getTrigger();

	/**
	 * Sets the value of the '{@link cloudinfragen.Function#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Iam Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iam Role</em>' reference.
	 * @see #setIamRole(IAMRole)
	 * @see cloudinfragen.CloudinfragenPackage#getFunction_IamRole()
	 * @model ordered="false"
	 * @generated
	 */
	IAMRole getIamRole();

	/**
	 * Sets the value of the '{@link cloudinfragen.Function#getIamRole <em>Iam Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iam Role</em>' reference.
	 * @see #getIamRole()
	 * @generated
	 */
	void setIamRole(IAMRole value);

} // Function
