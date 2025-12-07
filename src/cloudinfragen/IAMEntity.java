/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAM Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.IAMEntity#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link cloudinfragen.IAMEntity#getActions <em>Actions</em>}</li>
 *   <li>{@link cloudinfragen.IAMEntity#getResources <em>Resources</em>}</li>
 *   <li>{@link cloudinfragen.IAMEntity#getAssumeRolePolicy <em>Assume Role Policy</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getIAMEntity()
 * @model
 * @generated
 */
public interface IAMEntity extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' attribute.
	 * @see #setEntityType(String)
	 * @see cloudinfragen.CloudinfragenPackage#getIAMEntity_EntityType()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getEntityType();

	/**
	 * Sets the value of the '{@link cloudinfragen.IAMEntity#getEntityType <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' attribute.
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' attribute list.
	 * @see cloudinfragen.CloudinfragenPackage#getIAMEntity_Actions()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getActions();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' attribute list.
	 * @see cloudinfragen.CloudinfragenPackage#getIAMEntity_Resources()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getResources();

	/**
	 * Returns the value of the '<em><b>Assume Role Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assume Role Policy</em>' attribute.
	 * @see #setAssumeRolePolicy(String)
	 * @see cloudinfragen.CloudinfragenPackage#getIAMEntity_AssumeRolePolicy()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getAssumeRolePolicy();

	/**
	 * Sets the value of the '{@link cloudinfragen.IAMEntity#getAssumeRolePolicy <em>Assume Role Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assume Role Policy</em>' attribute.
	 * @see #getAssumeRolePolicy()
	 * @generated
	 */
	void setAssumeRolePolicy(String value);

} // IAMEntity
