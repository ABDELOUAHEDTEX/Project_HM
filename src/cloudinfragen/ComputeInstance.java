/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compute Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.ComputeInstance#getOs <em>Os</em>}</li>
 *   <li>{@link cloudinfragen.ComputeInstance#getKeypair <em>Keypair</em>}</li>
 *   <li>{@link cloudinfragen.ComputeInstance#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link cloudinfragen.ComputeInstance#getSecurityGroups <em>Security Groups</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getComputeInstance()
 * @model
 * @generated
 */
public interface ComputeInstance extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see cloudinfragen.CloudinfragenPackage#getComputeInstance_Os()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link cloudinfragen.ComputeInstance#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

	/**
	 * Returns the value of the '<em><b>Keypair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keypair</em>' attribute.
	 * @see #setKeypair(String)
	 * @see cloudinfragen.CloudinfragenPackage#getComputeInstance_Keypair()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getKeypair();

	/**
	 * Sets the value of the '{@link cloudinfragen.ComputeInstance#getKeypair <em>Keypair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keypair</em>' attribute.
	 * @see #getKeypair()
	 * @generated
	 */
	void setKeypair(String value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' reference list.
	 * The list contents are of type {@link cloudinfragen.Volume}.
	 * It is bidirectional and its opposite is '{@link cloudinfragen.Volume#getAttachedTo <em>Attached To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getComputeInstance_Volumes()
	 * @see cloudinfragen.Volume#getAttachedTo
	 * @model opposite="attachedTo" changeable="false" ordered="false"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Security Groups</b></em>' reference list.
	 * The list contents are of type {@link cloudinfragen.SecurityGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Groups</em>' reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getComputeInstance_SecurityGroups()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	EList<SecurityGroup> getSecurityGroups();

} // ComputeInstance
