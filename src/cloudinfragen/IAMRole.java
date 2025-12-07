/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAM Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.IAMRole#getAssumeRolePolicy <em>Assume Role Policy</em>}</li>
 *   <li>{@link cloudinfragen.IAMRole#getPolicies <em>Policies</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getIAMRole()
 * @model
 * @generated
 */
public interface IAMRole extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Assume Role Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assume Role Policy</em>' attribute.
	 * @see #setAssumeRolePolicy(String)
	 * @see cloudinfragen.CloudinfragenPackage#getIAMRole_AssumeRolePolicy()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getAssumeRolePolicy();

	/**
	 * Sets the value of the '{@link cloudinfragen.IAMRole#getAssumeRolePolicy <em>Assume Role Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assume Role Policy</em>' attribute.
	 * @see #getAssumeRolePolicy()
	 * @generated
	 */
	void setAssumeRolePolicy(String value);

	/**
	 * Returns the value of the '<em><b>Policies</b></em>' reference list.
	 * The list contents are of type {@link cloudinfragen.IAMPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policies</em>' reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getIAMRole_Policies()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	EList<IAMPolicy> getPolicies();

} // IAMRole
