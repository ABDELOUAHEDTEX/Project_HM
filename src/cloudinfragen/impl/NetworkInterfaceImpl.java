/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.NetworkInterface;
import cloudinfragen.SecurityGroup;
import cloudinfragen.Subnet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.NetworkInterfaceImpl#getPrivateIP <em>Private IP</em>}</li>
 *   <li>{@link cloudinfragen.impl.NetworkInterfaceImpl#getPublicIP <em>Public IP</em>}</li>
 *   <li>{@link cloudinfragen.impl.NetworkInterfaceImpl#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link cloudinfragen.impl.NetworkInterfaceImpl#getSecurityGroups <em>Security Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkInterfaceImpl extends CloudResourceImpl implements NetworkInterface {
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		result.append(" (privateIP: ");
		result.append(privateIP);
		result.append(", publicIP: ");
		result.append(publicIP);
		result.append(')');
		return result.toString();
	}

} //NetworkInterfaceImpl
