/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.RouteTable;
import cloudinfragen.Subnet;
import cloudinfragen.VPC;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subnet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.SubnetImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudinfragen.impl.SubnetImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudinfragen.impl.SubnetImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link cloudinfragen.impl.SubnetImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link cloudinfragen.impl.SubnetImpl#getCidr <em>Cidr</em>}</li>
 *   <li>{@link cloudinfragen.impl.SubnetImpl#getAvailabilityZone <em>Availability Zone</em>}</li>
 *   <li>{@link cloudinfragen.impl.SubnetImpl#getVpc <em>Vpc</em>}</li>
 *   <li>{@link cloudinfragen.impl.SubnetImpl#getRouteTable <em>Route Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubnetImpl extends MinimalEObjectImpl.Container implements Subnet {
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
	 * The default value of the '{@link #getCidr() <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidr() <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr()
	 * @generated
	 * @ordered
	 */
	protected String cidr = CIDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailabilityZone() <em>Availability Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityZone()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityZone() <em>Availability Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityZone()
	 * @generated
	 * @ordered
	 */
	protected String availabilityZone = AVAILABILITY_ZONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRouteTable() <em>Route Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteTable()
	 * @generated
	 * @ordered
	 */
	protected RouteTable routeTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubnetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.SUBNET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.SUBNET__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.SUBNET__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.SUBNET__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CloudinfragenPackage.SUBNET__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCidr() {
		return cidr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCidr(String newCidr) {
		String oldCidr = cidr;
		cidr = newCidr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.SUBNET__CIDR, oldCidr, cidr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvailabilityZone() {
		return availabilityZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailabilityZone(String newAvailabilityZone) {
		String oldAvailabilityZone = availabilityZone;
		availabilityZone = newAvailabilityZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.SUBNET__AVAILABILITY_ZONE, oldAvailabilityZone, availabilityZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VPC getVpc() {
		if (eContainerFeatureID() != CloudinfragenPackage.SUBNET__VPC) return null;
		return (VPC)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteTable getRouteTable() {
		if (routeTable != null && routeTable.eIsProxy()) {
			InternalEObject oldRouteTable = (InternalEObject)routeTable;
			routeTable = (RouteTable)eResolveProxy(oldRouteTable);
			if (routeTable != oldRouteTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudinfragenPackage.SUBNET__ROUTE_TABLE, oldRouteTable, routeTable));
			}
		}
		return routeTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteTable basicGetRouteTable() {
		return routeTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteTable(RouteTable newRouteTable, NotificationChain msgs) {
		RouteTable oldRouteTable = routeTable;
		routeTable = newRouteTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.SUBNET__ROUTE_TABLE, oldRouteTable, newRouteTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudinfragenPackage.SUBNET__VPC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, CloudinfragenPackage.SUBNET__VPC, msgs);
			case CloudinfragenPackage.SUBNET__ROUTE_TABLE:
				if (routeTable != null)
					msgs = ((InternalEObject)routeTable).eInverseRemove(this, CloudinfragenPackage.ROUTE_TABLE__SUBNETS, RouteTable.class, msgs);
				return basicSetRouteTable((RouteTable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudinfragenPackage.SUBNET__VPC:
				return eBasicSetContainer(null, CloudinfragenPackage.SUBNET__VPC, msgs);
			case CloudinfragenPackage.SUBNET__ROUTE_TABLE:
				return basicSetRouteTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CloudinfragenPackage.SUBNET__VPC:
				return eInternalContainer().eInverseRemove(this, CloudinfragenPackage.VPC__SUBNETS, VPC.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudinfragenPackage.SUBNET__ID:
				return getId();
			case CloudinfragenPackage.SUBNET__NAME:
				return getName();
			case CloudinfragenPackage.SUBNET__REGION:
				return getRegion();
			case CloudinfragenPackage.SUBNET__TAGS:
				return getTags();
			case CloudinfragenPackage.SUBNET__CIDR:
				return getCidr();
			case CloudinfragenPackage.SUBNET__AVAILABILITY_ZONE:
				return getAvailabilityZone();
			case CloudinfragenPackage.SUBNET__VPC:
				return getVpc();
			case CloudinfragenPackage.SUBNET__ROUTE_TABLE:
				if (resolve) return getRouteTable();
				return basicGetRouteTable();
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
			case CloudinfragenPackage.SUBNET__ID:
				setId((String)newValue);
				return;
			case CloudinfragenPackage.SUBNET__NAME:
				setName((String)newValue);
				return;
			case CloudinfragenPackage.SUBNET__REGION:
				setRegion((String)newValue);
				return;
			case CloudinfragenPackage.SUBNET__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case CloudinfragenPackage.SUBNET__CIDR:
				setCidr((String)newValue);
				return;
			case CloudinfragenPackage.SUBNET__AVAILABILITY_ZONE:
				setAvailabilityZone((String)newValue);
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
			case CloudinfragenPackage.SUBNET__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudinfragenPackage.SUBNET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudinfragenPackage.SUBNET__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CloudinfragenPackage.SUBNET__TAGS:
				getTags().clear();
				return;
			case CloudinfragenPackage.SUBNET__CIDR:
				setCidr(CIDR_EDEFAULT);
				return;
			case CloudinfragenPackage.SUBNET__AVAILABILITY_ZONE:
				setAvailabilityZone(AVAILABILITY_ZONE_EDEFAULT);
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
			case CloudinfragenPackage.SUBNET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudinfragenPackage.SUBNET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudinfragenPackage.SUBNET__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CloudinfragenPackage.SUBNET__TAGS:
				return tags != null && !tags.isEmpty();
			case CloudinfragenPackage.SUBNET__CIDR:
				return CIDR_EDEFAULT == null ? cidr != null : !CIDR_EDEFAULT.equals(cidr);
			case CloudinfragenPackage.SUBNET__AVAILABILITY_ZONE:
				return AVAILABILITY_ZONE_EDEFAULT == null ? availabilityZone != null : !AVAILABILITY_ZONE_EDEFAULT.equals(availabilityZone);
			case CloudinfragenPackage.SUBNET__VPC:
				return getVpc() != null;
			case CloudinfragenPackage.SUBNET__ROUTE_TABLE:
				return routeTable != null;
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
		result.append(", cidr: ");
		result.append(cidr);
		result.append(", availabilityZone: ");
		result.append(availabilityZone);
		result.append(')');
		return result.toString();
	}

} //SubnetImpl
