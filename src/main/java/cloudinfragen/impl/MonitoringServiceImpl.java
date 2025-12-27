/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudResource;
import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.MonitoringService;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitoring Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.MonitoringServiceImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudinfragen.impl.MonitoringServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudinfragen.impl.MonitoringServiceImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link cloudinfragen.impl.MonitoringServiceImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link cloudinfragen.impl.MonitoringServiceImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link cloudinfragen.impl.MonitoringServiceImpl#getAlerts <em>Alerts</em>}</li>
 *   <li>{@link cloudinfragen.impl.MonitoringServiceImpl#getMonitoredResources <em>Monitored Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoringServiceImpl extends MinimalEObjectImpl.Container implements MonitoringService {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

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
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.MONITORING_SERVICE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.MONITORING_SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.MONITORING_SERVICE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CloudinfragenPackage.MONITORING_SERVICE__TAGS);
		}
		return tags;
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
			case CloudinfragenPackage.MONITORING_SERVICE__ID:
				return getId();
			case CloudinfragenPackage.MONITORING_SERVICE__NAME:
				return getName();
			case CloudinfragenPackage.MONITORING_SERVICE__REGION:
				return getRegion();
			case CloudinfragenPackage.MONITORING_SERVICE__TAGS:
				return getTags();
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
			case CloudinfragenPackage.MONITORING_SERVICE__ID:
				setId((String)newValue);
				return;
			case CloudinfragenPackage.MONITORING_SERVICE__NAME:
				setName((String)newValue);
				return;
			case CloudinfragenPackage.MONITORING_SERVICE__REGION:
				setRegion((String)newValue);
				return;
			case CloudinfragenPackage.MONITORING_SERVICE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
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
			case CloudinfragenPackage.MONITORING_SERVICE__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudinfragenPackage.MONITORING_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudinfragenPackage.MONITORING_SERVICE__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CloudinfragenPackage.MONITORING_SERVICE__TAGS:
				getTags().clear();
				return;
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
			case CloudinfragenPackage.MONITORING_SERVICE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudinfragenPackage.MONITORING_SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudinfragenPackage.MONITORING_SERVICE__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CloudinfragenPackage.MONITORING_SERVICE__TAGS:
				return tags != null && !tags.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", region: ");
		result.append(region);
		result.append(", tags: ");
		result.append(tags);
		result.append(", metrics: ");
		result.append(metrics);
		result.append(", alerts: ");
		result.append(alerts);
		result.append(')');
		return result.toString();
	}

} //MonitoringServiceImpl
