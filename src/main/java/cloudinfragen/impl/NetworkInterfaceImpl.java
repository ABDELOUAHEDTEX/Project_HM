/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.NetworkInterface;
import cloudinfragen.SecurityGroup;
import cloudinfragen.Subnet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.NetworkInterfaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudinfragen.impl.NetworkInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudinfragen.impl.NetworkInterfaceImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link cloudinfragen.impl.NetworkInterfaceImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link cloudinfragen.impl.NetworkInterfaceImpl#getPrivateIP <em>Private IP</em>}</li>
 *   <li>{@link cloudinfragen.impl.NetworkInterfaceImpl#getPublicIP <em>Public IP</em>}</li>
 *   <li>{@link cloudinfragen.impl.NetworkInterfaceImpl#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link cloudinfragen.impl.NetworkInterfaceImpl#getSecurityGroups <em>Security Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkInterfaceImpl extends MinimalEObjectImpl.Container implements NetworkInterface {
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
	 * The default value of the '{@link #getPrivateIP() <em>Private IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateIP()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateIP() <em>Private IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateIP()
	 * @generated
	 * @ordered
	 */
	protected String privateIP = PRIVATE_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicIP() <em>Public IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicIP()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicIP() <em>Public IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicIP()
	 * @generated
	 * @ordered
	 */
	protected String publicIP = PUBLIC_IP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubnet() <em>Subnet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected Subnet subnet;

	/**
	 * The cached value of the '{@link #getSecurityGroups() <em>Security Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGroup> securityGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.NETWORK_INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.NETWORK_INTERFACE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.NETWORK_INTERFACE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.NETWORK_INTERFACE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CloudinfragenPackage.NETWORK_INTERFACE__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrivateIP() {
		return privateIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateIP(String newPrivateIP) {
		String oldPrivateIP = privateIP;
		privateIP = newPrivateIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.NETWORK_INTERFACE__PRIVATE_IP, oldPrivateIP, privateIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublicIP() {
		return publicIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicIP(String newPublicIP) {
		String oldPublicIP = publicIP;
		publicIP = newPublicIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.NETWORK_INTERFACE__PUBLIC_IP, oldPublicIP, publicIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subnet getSubnet() {
		if (subnet != null && subnet.eIsProxy()) {
			InternalEObject oldSubnet = (InternalEObject)subnet;
			subnet = (Subnet)eResolveProxy(oldSubnet);
			if (subnet != oldSubnet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudinfragenPackage.NETWORK_INTERFACE__SUBNET, oldSubnet, subnet));
			}
		}
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subnet basicGetSubnet() {
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityGroup> getSecurityGroups() {
		if (securityGroups == null) {
			securityGroups = new EObjectResolvingEList<SecurityGroup>(SecurityGroup.class, this, CloudinfragenPackage.NETWORK_INTERFACE__SECURITY_GROUPS);
		}
		return securityGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudinfragenPackage.NETWORK_INTERFACE__ID:
				return getId();
			case CloudinfragenPackage.NETWORK_INTERFACE__NAME:
				return getName();
			case CloudinfragenPackage.NETWORK_INTERFACE__REGION:
				return getRegion();
			case CloudinfragenPackage.NETWORK_INTERFACE__TAGS:
				return getTags();
			case CloudinfragenPackage.NETWORK_INTERFACE__PRIVATE_IP:
				return getPrivateIP();
			case CloudinfragenPackage.NETWORK_INTERFACE__PUBLIC_IP:
				return getPublicIP();
			case CloudinfragenPackage.NETWORK_INTERFACE__SUBNET:
				if (resolve) return getSubnet();
				return basicGetSubnet();
			case CloudinfragenPackage.NETWORK_INTERFACE__SECURITY_GROUPS:
				return getSecurityGroups();
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
			case CloudinfragenPackage.NETWORK_INTERFACE__ID:
				setId((String)newValue);
				return;
			case CloudinfragenPackage.NETWORK_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case CloudinfragenPackage.NETWORK_INTERFACE__REGION:
				setRegion((String)newValue);
				return;
			case CloudinfragenPackage.NETWORK_INTERFACE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case CloudinfragenPackage.NETWORK_INTERFACE__PRIVATE_IP:
				setPrivateIP((String)newValue);
				return;
			case CloudinfragenPackage.NETWORK_INTERFACE__PUBLIC_IP:
				setPublicIP((String)newValue);
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
			case CloudinfragenPackage.NETWORK_INTERFACE__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudinfragenPackage.NETWORK_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudinfragenPackage.NETWORK_INTERFACE__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CloudinfragenPackage.NETWORK_INTERFACE__TAGS:
				getTags().clear();
				return;
			case CloudinfragenPackage.NETWORK_INTERFACE__PRIVATE_IP:
				setPrivateIP(PRIVATE_IP_EDEFAULT);
				return;
			case CloudinfragenPackage.NETWORK_INTERFACE__PUBLIC_IP:
				setPublicIP(PUBLIC_IP_EDEFAULT);
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
			case CloudinfragenPackage.NETWORK_INTERFACE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudinfragenPackage.NETWORK_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudinfragenPackage.NETWORK_INTERFACE__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CloudinfragenPackage.NETWORK_INTERFACE__TAGS:
				return tags != null && !tags.isEmpty();
			case CloudinfragenPackage.NETWORK_INTERFACE__PRIVATE_IP:
				return PRIVATE_IP_EDEFAULT == null ? privateIP != null : !PRIVATE_IP_EDEFAULT.equals(privateIP);
			case CloudinfragenPackage.NETWORK_INTERFACE__PUBLIC_IP:
				return PUBLIC_IP_EDEFAULT == null ? publicIP != null : !PUBLIC_IP_EDEFAULT.equals(publicIP);
			case CloudinfragenPackage.NETWORK_INTERFACE__SUBNET:
				return subnet != null;
			case CloudinfragenPackage.NETWORK_INTERFACE__SECURITY_GROUPS:
				return securityGroups != null && !securityGroups.isEmpty();
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
		result.append(", privateIP: ");
		result.append(privateIP);
		result.append(", publicIP: ");
		result.append(publicIP);
		result.append(')');
		return result.toString();
	}

} //NetworkInterfaceImpl
