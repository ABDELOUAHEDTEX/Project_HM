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
 *   <li>{@link cloudinfragen.impl.VPCImpl#getCidrBlock <em>Cidr Block</em>}</li>
 *   <li>{@link cloudinfragen.impl.VPCImpl#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link cloudinfragen.impl.VPCImpl#getRouteTables <em>Route Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VPCImpl extends CloudResourceImpl implements VPC {
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
		result.append(" (cidrBlock: ");
		result.append(cidrBlock);
		result.append(')');
		return result.toString();
	}

} //VPCImpl
