/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.ComputeInstance;
import cloudinfragen.SecurityGroup;
import cloudinfragen.Subnet;
import cloudinfragen.Volume;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
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
 *   <li>{@link cloudinfragen.impl.ComputeInstanceImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudinfragen.impl.ComputeInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudinfragen.impl.ComputeInstanceImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link cloudinfragen.impl.ComputeInstanceImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link cloudinfragen.impl.ComputeInstanceImpl#getOs <em>Os</em>}</li>
 *   <li>{@link cloudinfragen.impl.ComputeInstanceImpl#getKeypair <em>Keypair</em>}</li>
 *   <li>{@link cloudinfragen.impl.ComputeInstanceImpl#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link cloudinfragen.impl.ComputeInstanceImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link cloudinfragen.impl.ComputeInstanceImpl#getSecurityGroups <em>Security Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputeInstanceImpl extends MinimalEObjectImpl.Container implements ComputeInstance {
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
	 * The cached value of the '{@link #getSubnet() <em>Subnet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected Subnet subnet;

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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.COMPUTE_INSTANCE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.COMPUTE_INSTANCE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.COMPUTE_INSTANCE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CloudinfragenPackage.COMPUTE_INSTANCE__TAGS);
		}
		return tags;
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
	public Subnet getSubnet() {
		if (subnet != null && subnet.eIsProxy()) {
			InternalEObject oldSubnet = (InternalEObject)subnet;
			subnet = (Subnet)eResolveProxy(oldSubnet);
			if (subnet != oldSubnet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudinfragenPackage.COMPUTE_INSTANCE__SUBNET, oldSubnet, subnet));
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
			case CloudinfragenPackage.COMPUTE_INSTANCE__ID:
				return getId();
			case CloudinfragenPackage.COMPUTE_INSTANCE__NAME:
				return getName();
			case CloudinfragenPackage.COMPUTE_INSTANCE__REGION:
				return getRegion();
			case CloudinfragenPackage.COMPUTE_INSTANCE__TAGS:
				return getTags();
			case CloudinfragenPackage.COMPUTE_INSTANCE__OS:
				return getOs();
			case CloudinfragenPackage.COMPUTE_INSTANCE__KEYPAIR:
				return getKeypair();
			case CloudinfragenPackage.COMPUTE_INSTANCE__SUBNET:
				if (resolve) return getSubnet();
				return basicGetSubnet();
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
			case CloudinfragenPackage.COMPUTE_INSTANCE__ID:
				setId((String)newValue);
				return;
			case CloudinfragenPackage.COMPUTE_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case CloudinfragenPackage.COMPUTE_INSTANCE__REGION:
				setRegion((String)newValue);
				return;
			case CloudinfragenPackage.COMPUTE_INSTANCE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case CloudinfragenPackage.COMPUTE_INSTANCE__OS:
				setOs((String)newValue);
				return;
			case CloudinfragenPackage.COMPUTE_INSTANCE__KEYPAIR:
				setKeypair((String)newValue);
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
			case CloudinfragenPackage.COMPUTE_INSTANCE__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudinfragenPackage.COMPUTE_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudinfragenPackage.COMPUTE_INSTANCE__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CloudinfragenPackage.COMPUTE_INSTANCE__TAGS:
				getTags().clear();
				return;
			case CloudinfragenPackage.COMPUTE_INSTANCE__OS:
				setOs(OS_EDEFAULT);
				return;
			case CloudinfragenPackage.COMPUTE_INSTANCE__KEYPAIR:
				setKeypair(KEYPAIR_EDEFAULT);
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
			case CloudinfragenPackage.COMPUTE_INSTANCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudinfragenPackage.COMPUTE_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudinfragenPackage.COMPUTE_INSTANCE__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CloudinfragenPackage.COMPUTE_INSTANCE__TAGS:
				return tags != null && !tags.isEmpty();
			case CloudinfragenPackage.COMPUTE_INSTANCE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case CloudinfragenPackage.COMPUTE_INSTANCE__KEYPAIR:
				return KEYPAIR_EDEFAULT == null ? keypair != null : !KEYPAIR_EDEFAULT.equals(keypair);
			case CloudinfragenPackage.COMPUTE_INSTANCE__SUBNET:
				return subnet != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", region: ");
		result.append(region);
		result.append(", tags: ");
		result.append(tags);
		result.append(", os: ");
		result.append(os);
		result.append(", keypair: ");
		result.append(keypair);
		result.append(')');
		return result.toString();
	}

} //ComputeInstanceImpl
