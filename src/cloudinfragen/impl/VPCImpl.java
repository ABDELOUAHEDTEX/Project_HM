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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.VPCImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudinfragen.impl.VPCImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudinfragen.impl.VPCImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link cloudinfragen.impl.VPCImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link cloudinfragen.impl.VPCImpl#getCidrBlock <em>Cidr Block</em>}</li>
 *   <li>{@link cloudinfragen.impl.VPCImpl#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link cloudinfragen.impl.VPCImpl#getRouteTables <em>Route Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VPCImpl extends MinimalEObjectImpl.Container implements VPC {
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
	 * The default value of the '{@link #getCidrBlock() <em>Cidr Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrBlock()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_BLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidrBlock() <em>Cidr Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrBlock()
	 * @generated
	 * @ordered
	 */
	protected String cidrBlock = CIDR_BLOCK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubnets() <em>Subnets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnets()
	 * @generated
	 * @ordered
	 */
	protected EList<Subnet> subnets;

	/**
	 * The cached value of the '{@link #getRouteTables() <em>Route Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteTables()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteTable> routeTables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.VPC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.VPC__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.VPC__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.VPC__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CloudinfragenPackage.VPC__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCidrBlock() {
		return cidrBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCidrBlock(String newCidrBlock) {
		String oldCidrBlock = cidrBlock;
		cidrBlock = newCidrBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.VPC__CIDR_BLOCK, oldCidrBlock, cidrBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subnet> getSubnets() {
		if (subnets == null) {
			subnets = new EObjectContainmentWithInverseEList<Subnet>(Subnet.class, this, CloudinfragenPackage.VPC__SUBNETS, CloudinfragenPackage.SUBNET__VPC);
		}
		return subnets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteTable> getRouteTables() {
		if (routeTables == null) {
			routeTables = new EObjectContainmentEList<RouteTable>(RouteTable.class, this, CloudinfragenPackage.VPC__ROUTE_TABLES);
		}
		return routeTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudinfragenPackage.VPC__SUBNETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubnets()).basicAdd(otherEnd, msgs);
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
			case CloudinfragenPackage.VPC__SUBNETS:
				return ((InternalEList<?>)getSubnets()).basicRemove(otherEnd, msgs);
			case CloudinfragenPackage.VPC__ROUTE_TABLES:
				return ((InternalEList<?>)getRouteTables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudinfragenPackage.VPC__ID:
				return getId();
			case CloudinfragenPackage.VPC__NAME:
				return getName();
			case CloudinfragenPackage.VPC__REGION:
				return getRegion();
			case CloudinfragenPackage.VPC__TAGS:
				return getTags();
			case CloudinfragenPackage.VPC__CIDR_BLOCK:
				return getCidrBlock();
			case CloudinfragenPackage.VPC__SUBNETS:
				return getSubnets();
			case CloudinfragenPackage.VPC__ROUTE_TABLES:
				return getRouteTables();
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
			case CloudinfragenPackage.VPC__ID:
				setId((String)newValue);
				return;
			case CloudinfragenPackage.VPC__NAME:
				setName((String)newValue);
				return;
			case CloudinfragenPackage.VPC__REGION:
				setRegion((String)newValue);
				return;
			case CloudinfragenPackage.VPC__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case CloudinfragenPackage.VPC__CIDR_BLOCK:
				setCidrBlock((String)newValue);
				return;
			case CloudinfragenPackage.VPC__SUBNETS:
				getSubnets().clear();
				getSubnets().addAll((Collection<? extends Subnet>)newValue);
				return;
			case CloudinfragenPackage.VPC__ROUTE_TABLES:
				getRouteTables().clear();
				getRouteTables().addAll((Collection<? extends RouteTable>)newValue);
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
			case CloudinfragenPackage.VPC__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudinfragenPackage.VPC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudinfragenPackage.VPC__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CloudinfragenPackage.VPC__TAGS:
				getTags().clear();
				return;
			case CloudinfragenPackage.VPC__CIDR_BLOCK:
				setCidrBlock(CIDR_BLOCK_EDEFAULT);
				return;
			case CloudinfragenPackage.VPC__SUBNETS:
				getSubnets().clear();
				return;
			case CloudinfragenPackage.VPC__ROUTE_TABLES:
				getRouteTables().clear();
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
			case CloudinfragenPackage.VPC__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudinfragenPackage.VPC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudinfragenPackage.VPC__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CloudinfragenPackage.VPC__TAGS:
				return tags != null && !tags.isEmpty();
			case CloudinfragenPackage.VPC__CIDR_BLOCK:
				return CIDR_BLOCK_EDEFAULT == null ? cidrBlock != null : !CIDR_BLOCK_EDEFAULT.equals(cidrBlock);
			case CloudinfragenPackage.VPC__SUBNETS:
				return subnets != null && !subnets.isEmpty();
			case CloudinfragenPackage.VPC__ROUTE_TABLES:
				return routeTables != null && !routeTables.isEmpty();
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
		result.append(", cidrBlock: ");
		result.append(cidrBlock);
		result.append(')');
		return result.toString();
	}

} //VPCImpl
