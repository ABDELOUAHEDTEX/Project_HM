/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.SecurityGroup#getInboundRules <em>Inbound Rules</em>}</li>
 *   <li>{@link cloudinfragen.SecurityGroup#getOutboundRules <em>Outbound Rules</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getSecurityGroup()
 * @model
 * @generated
 */
public interface SecurityGroup extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Inbound Rules</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Rules</em>' attribute list.
	 * @see cloudinfragen.CloudinfragenPackage#getSecurityGroup_InboundRules()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getInboundRules();

	/**
	 * Returns the value of the '<em><b>Outbound Rules</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Rules</em>' attribute list.
	 * @see cloudinfragen.CloudinfragenPackage#getSecurityGroup_OutboundRules()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getOutboundRules();

} // SecurityGroup
