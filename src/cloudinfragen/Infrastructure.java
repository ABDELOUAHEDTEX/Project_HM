/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.Infrastructure#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getInfrastructure()
 * @model
 * @generated
 */
public interface Infrastructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link cloudinfragen.CloudResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getInfrastructure_Resources()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CloudResource> getResources();

} // Infrastructure
