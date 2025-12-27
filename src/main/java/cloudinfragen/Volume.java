/**
 */
package cloudinfragen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.Volume#getSize <em>Size</em>}</li>
 *   <li>{@link cloudinfragen.Volume#isEncrypted <em>Encrypted</em>}</li>
 *   <li>{@link cloudinfragen.Volume#getAttachedTo <em>Attached To</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getVolume()
 * @model
 * @generated
 */
public interface Volume extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see cloudinfragen.CloudinfragenPackage#getVolume_Size()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link cloudinfragen.Volume#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Encrypted</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted</em>' attribute.
	 * @see #setEncrypted(boolean)
	 * @see cloudinfragen.CloudinfragenPackage#getVolume_Encrypted()
	 * @model default="false" unique="false" ordered="false"
	 * @generated
	 */
	boolean isEncrypted();

	/**
	 * Sets the value of the '{@link cloudinfragen.Volume#isEncrypted <em>Encrypted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted</em>' attribute.
	 * @see #isEncrypted()
	 * @generated
	 */
	void setEncrypted(boolean value);

	/**
	 * Returns the value of the '<em><b>Attached To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cloudinfragen.ComputeInstance#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached To</em>' reference.
	 * @see cloudinfragen.CloudinfragenPackage#getVolume_AttachedTo()
	 * @see cloudinfragen.ComputeInstance#getVolumes
	 * @model opposite="volumes" changeable="false" ordered="false"
	 * @generated
	 */
	ComputeInstance getAttachedTo();

} // Volume
