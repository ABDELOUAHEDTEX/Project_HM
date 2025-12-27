/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAM Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.IAMPolicy#getActions <em>Actions</em>}</li>
 *   <li>{@link cloudinfragen.IAMPolicy#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getIAMPolicy()
 * @model
 * @generated
 */
public interface IAMPolicy extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' attribute list.
	 * @see cloudinfragen.CloudinfragenPackage#getIAMPolicy_Actions()
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
	 * @see cloudinfragen.CloudinfragenPackage#getIAMPolicy_Resources()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getResources();

} // IAMPolicy
