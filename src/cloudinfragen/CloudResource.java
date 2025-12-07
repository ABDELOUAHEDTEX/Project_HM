/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.CloudResource#getId <em>Id</em>}</li>
 *   <li>{@link cloudinfragen.CloudResource#getName <em>Name</em>}</li>
 *   <li>{@link cloudinfragen.CloudResource#getRegion <em>Region</em>}</li>
 *   <li>{@link cloudinfragen.CloudResource#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getCloudResource()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CloudResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see cloudinfragen.CloudinfragenPackage#getCloudResource_Id()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cloudinfragen.CloudResource#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cloudinfragen.CloudinfragenPackage#getCloudResource_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudinfragen.CloudResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see cloudinfragen.CloudinfragenPackage#getCloudResource_Region()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link cloudinfragen.CloudResource#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see cloudinfragen.CloudinfragenPackage#getCloudResource_Tags()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getTags();

} // CloudResource
