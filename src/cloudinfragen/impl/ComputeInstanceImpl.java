/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.ComputeInstance;
import cloudinfragen.NetworkInterface;
import cloudinfragen.SecurityGroup;
import cloudinfragen.Volume;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compute Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.ComputeInstanceImpl#getOs <em>Os</em>}</li>
 *   <li>{@link cloudinfragen.impl.ComputeInstanceImpl#getKeypair <em>Keypair</em>}</li>
 *   <li>{@link cloudinfragen.impl.ComputeInstanceImpl#getNetworkInterfaces <em>Network Interfaces</em>}</li>
 *   <li>{@link cloudinfragen.impl.ComputeInstanceImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link cloudinfragen.impl.ComputeInstanceImpl#getSecurityGroups <em>Security Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputeInstanceImpl extends CloudResourceImpl implements ComputeInstance {
	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeypair() <em>Keypair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeypair()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYPAIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeypair() <em>Keypair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeypair()
	 * @generated
	 * @ordered
	 */
	protected String keypair = KEYPAIR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNetworkInterfaces() <em>Network Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkInterface> networkInterfaces;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<Volume> volumes;

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
	protected ComputeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.COMPUTE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOs(String newOs) {
		String oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.COMPUTE_INSTANCE__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeypair() {
		return keypair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeypair(String newKeypair) {
		String oldKeypair = keypair;
		keypair = newKeypair;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.COMPUTE_INSTANCE__KEYPAIR, oldKeypair, keypair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NetworkInterface> getNetworkInterfaces() {
		if (networkInterfaces == null) {
			networkInterfaces = new EObjectContainmentEList<NetworkInterface>(NetworkInterface.class, this, CloudinfragenPackage.COMPUTE_INSTANCE__NETWORK_INTERFACES);
		}
		return networkInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Volume> getVolumes() {
		if (volumes == null) {
			volumes = new EObjectWithInverseResolvingEList<Volume>(Volume.class, this, CloudinfragenPackage.COMPUTE_INSTANCE__VOLUMES, CloudinfragenPackage.VOLUME__ATTACHED_TO);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityGroup> getSecurityGroups() {
		if (securityGroups == null) {
			securityGroups = new EObjectResolvingEList<SecurityGroup>(SecurityGroup.class, this, CloudinfragenPackage.COMPUTE_INSTANCE__SECURITY_GROUPS);
		}
		return securityGroups;
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
			case CloudinfragenPackage.COMPUTE_INSTANCE__VOLUMES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVolumes()).basicAdd(otherEnd, msgs);
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
			case CloudinfragenPackage.COMPUTE_INSTANCE__NETWORK_INTERFACES:
				return ((InternalEList<?>)getNetworkInterfaces()).basicRemove(otherEnd, msgs);
			case CloudinfragenPackage.COMPUTE_INSTANCE__VOLUMES:
				return ((InternalEList<?>)getVolumes()).basicRemove(otherEnd, msgs);
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
			case CloudinfragenPackage.COMPUTE_INSTANCE__OS:
				return getOs();
			case CloudinfragenPackage.COMPUTE_INSTANCE__KEYPAIR:
				return getKeypair();
			case CloudinfragenPackage.COMPUTE_INSTANCE__NETWORK_INTERFACES:
				return getNetworkInterfaces();
			case CloudinfragenPackage.COMPUTE_INSTANCE__VOLUMES:
				return getVolumes();
			case CloudinfragenPackage.COMPUTE_INSTANCE__SECURITY_GROUPS:
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
			case CloudinfragenPackage.COMPUTE_INSTANCE__OS:
				setOs((String)newValue);
				return;
			case CloudinfragenPackage.COMPUTE_INSTANCE__KEYPAIR:
				setKeypair((String)newValue);
				return;
			case CloudinfragenPackage.COMPUTE_INSTANCE__NETWORK_INTERFACES:
				getNetworkInterfaces().clear();
				getNetworkInterfaces().addAll((Collection<? extends NetworkInterface>)newValue);
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
			case CloudinfragenPackage.COMPUTE_INSTANCE__OS:
				setOs(OS_EDEFAULT);
				return;
			case CloudinfragenPackage.COMPUTE_INSTANCE__KEYPAIR:
				setKeypair(KEYPAIR_EDEFAULT);
				return;
			case CloudinfragenPackage.COMPUTE_INSTANCE__NETWORK_INTERFACES:
				getNetworkInterfaces().clear();
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
			case CloudinfragenPackage.COMPUTE_INSTANCE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case CloudinfragenPackage.COMPUTE_INSTANCE__KEYPAIR:
				return KEYPAIR_EDEFAULT == null ? keypair != null : !KEYPAIR_EDEFAULT.equals(keypair);
			case CloudinfragenPackage.COMPUTE_INSTANCE__NETWORK_INTERFACES:
				return networkInterfaces != null && !networkInterfaces.isEmpty();
			case CloudinfragenPackage.COMPUTE_INSTANCE__VOLUMES:
				return volumes != null && !volumes.isEmpty();
			case CloudinfragenPackage.COMPUTE_INSTANCE__SECURITY_GROUPS:
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
		result.append(" (os: ");
		result.append(os);
		result.append(", keypair: ");
		result.append(keypair);
		result.append(')');
		return result.toString();
	}

} //ComputeInstanceImpl
