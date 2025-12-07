/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.RouteTable;
import cloudinfragen.Subnet;
import cloudinfragen.VPC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subnet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.SubnetImpl#getCidr <em>Cidr</em>}</li>
 *   <li>{@link cloudinfragen.impl.SubnetImpl#getAvailabilityZone <em>Availability Zone</em>}</li>
 *   <li>{@link cloudinfragen.impl.SubnetImpl#getVpc <em>Vpc</em>}</li>
 *   <li>{@link cloudinfragen.impl.SubnetImpl#getRouteTable <em>Route Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubnetImpl extends CloudResourceImpl implements Subnet {
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		result.append(" (cidr: ");
		result.append(cidr);
		result.append(", availabilityZone: ");
		result.append(availabilityZone);
		result.append(')');
		return result.toString();
	}

} //SubnetImpl
