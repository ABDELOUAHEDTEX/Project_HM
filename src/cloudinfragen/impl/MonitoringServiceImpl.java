/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudResource;
import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.MonitoringService;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitoring Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.MonitoringServiceImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link cloudinfragen.impl.MonitoringServiceImpl#getAlerts <em>Alerts</em>}</li>
 *   <li>{@link cloudinfragen.impl.MonitoringServiceImpl#getMonitoredResources <em>Monitored Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoringServiceImpl extends CloudResourceImpl implements MonitoringService {
	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<String> metrics;

	/**
	 * The cached value of the '{@link #getAlerts() <em>Alerts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlerts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> alerts;

	/**
	 * The cached value of the '{@link #getMonitoredResources() <em>Monitored Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredResources()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudResource> monitoredResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoringServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.MONITORING_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMetrics() {
		if (metrics == null) {
			metrics = new EDataTypeEList<String>(String.class, this, CloudinfragenPackage.MONITORING_SERVICE__METRICS);
		}
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAlerts() {
		if (alerts == null) {
			alerts = new EDataTypeEList<String>(String.class, this, CloudinfragenPackage.MONITORING_SERVICE__ALERTS);
		}
		return alerts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CloudResource> getMonitoredResources() {
		if (monitoredResources == null) {
			monitoredResources = new EObjectResolvingEList<CloudResource>(CloudResource.class, this, CloudinfragenPackage.MONITORING_SERVICE__MONITORED_RESOURCES);
		}
		return monitoredResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudinfragenPackage.MONITORING_SERVICE__METRICS:
				return getMetrics();
			case CloudinfragenPackage.MONITORING_SERVICE__ALERTS:
				return getAlerts();
			case CloudinfragenPackage.MONITORING_SERVICE__MONITORED_RESOURCES:
				return getMonitoredResources();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CloudinfragenPackage.MONITORING_SERVICE__METRICS:
				getMetrics().clear();
				getMetrics().addAll((Collection<? extends String>)newValue);
				return;
			case CloudinfragenPackage.MONITORING_SERVICE__ALERTS:
				getAlerts().clear();
				getAlerts().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CloudinfragenPackage.MONITORING_SERVICE__METRICS:
				getMetrics().clear();
				return;
			case CloudinfragenPackage.MONITORING_SERVICE__ALERTS:
				getAlerts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CloudinfragenPackage.MONITORING_SERVICE__METRICS:
				return metrics != null && !metrics.isEmpty();
			case CloudinfragenPackage.MONITORING_SERVICE__ALERTS:
				return alerts != null && !alerts.isEmpty();
			case CloudinfragenPackage.MONITORING_SERVICE__MONITORED_RESOURCES:
				return monitoredResources != null && !monitoredResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (metrics: ");
		result.append(metrics);
		result.append(", alerts: ");
		result.append(alerts);
		result.append(')');
		return result.toString();
	}

} //MonitoringServiceImpl
