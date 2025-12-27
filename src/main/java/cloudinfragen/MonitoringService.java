/**
 */
package cloudinfragen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitoring Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.MonitoringService#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link cloudinfragen.MonitoringService#getAlerts <em>Alerts</em>}</li>
 *   <li>{@link cloudinfragen.MonitoringService#getMonitoredResources <em>Monitored Resources</em>}</li>
 * </ul>
 *
 * @see cloudinfragen.CloudinfragenPackage#getMonitoringService()
 * @model
 * @generated
 */
public interface MonitoringService extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' attribute list.
	 * @see cloudinfragen.CloudinfragenPackage#getMonitoringService_Metrics()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getMetrics();

	/**
	 * Returns the value of the '<em><b>Alerts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alerts</em>' attribute list.
	 * @see cloudinfragen.CloudinfragenPackage#getMonitoringService_Alerts()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getAlerts();

	/**
	 * Returns the value of the '<em><b>Monitored Resources</b></em>' reference list.
	 * The list contents are of type {@link cloudinfragen.CloudResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Resources</em>' reference list.
	 * @see cloudinfragen.CloudinfragenPackage#getMonitoringService_MonitoredResources()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	EList<CloudResource> getMonitoredResources();

} // MonitoringService
