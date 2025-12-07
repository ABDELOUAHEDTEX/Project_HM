/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.ContainerService;
import cloudinfragen.SecurityGroup;
import cloudinfragen.Subnet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.ContainerServiceImpl#getClusterName <em>Cluster Name</em>}</li>
 *   <li>{@link cloudinfragen.impl.ContainerServiceImpl#getNumberOfContainers <em>Number Of Containers</em>}</li>
 *   <li>{@link cloudinfragen.impl.ContainerServiceImpl#getImage <em>Image</em>}</li>
 *   <li>{@link cloudinfragen.impl.ContainerServiceImpl#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link cloudinfragen.impl.ContainerServiceImpl#getSecurityGroups <em>Security Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerServiceImpl extends CloudResourceImpl implements ContainerService {
	/**
	 * The default value of the '{@link #getClusterName() <em>Cluster Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLUSTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClusterName() <em>Cluster Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterName()
	 * @generated
	 * @ordered
	 */
	protected String clusterName = CLUSTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfContainers() <em>Number Of Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfContainers()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_CONTAINERS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumberOfContainers() <em>Number Of Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfContainers()
	 * @generated
	 * @ordered
	 */
	protected int numberOfContainers = NUMBER_OF_CONTAINERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubnets() <em>Subnets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnets()
	 * @generated
	 * @ordered
	 */
	protected EList<Subnet> subnets;

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
	protected ContainerServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.CONTAINER_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClusterName() {
		return clusterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClusterName(String newClusterName) {
		String oldClusterName = clusterName;
		clusterName = newClusterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.CONTAINER_SERVICE__CLUSTER_NAME, oldClusterName, clusterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfContainers() {
		return numberOfContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfContainers(int newNumberOfContainers) {
		int oldNumberOfContainers = numberOfContainers;
		numberOfContainers = newNumberOfContainers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.CONTAINER_SERVICE__NUMBER_OF_CONTAINERS, oldNumberOfContainers, numberOfContainers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.CONTAINER_SERVICE__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subnet> getSubnets() {
		if (subnets == null) {
			subnets = new EObjectResolvingEList<Subnet>(Subnet.class, this, CloudinfragenPackage.CONTAINER_SERVICE__SUBNETS);
		}
		return subnets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityGroup> getSecurityGroups() {
		if (securityGroups == null) {
			securityGroups = new EObjectResolvingEList<SecurityGroup>(SecurityGroup.class, this, CloudinfragenPackage.CONTAINER_SERVICE__SECURITY_GROUPS);
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
			case CloudinfragenPackage.CONTAINER_SERVICE__CLUSTER_NAME:
				return getClusterName();
			case CloudinfragenPackage.CONTAINER_SERVICE__NUMBER_OF_CONTAINERS:
				return getNumberOfContainers();
			case CloudinfragenPackage.CONTAINER_SERVICE__IMAGE:
				return getImage();
			case CloudinfragenPackage.CONTAINER_SERVICE__SUBNETS:
				return getSubnets();
			case CloudinfragenPackage.CONTAINER_SERVICE__SECURITY_GROUPS:
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
			case CloudinfragenPackage.CONTAINER_SERVICE__CLUSTER_NAME:
				setClusterName((String)newValue);
				return;
			case CloudinfragenPackage.CONTAINER_SERVICE__NUMBER_OF_CONTAINERS:
				setNumberOfContainers((Integer)newValue);
				return;
			case CloudinfragenPackage.CONTAINER_SERVICE__IMAGE:
				setImage((String)newValue);
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
			case CloudinfragenPackage.CONTAINER_SERVICE__CLUSTER_NAME:
				setClusterName(CLUSTER_NAME_EDEFAULT);
				return;
			case CloudinfragenPackage.CONTAINER_SERVICE__NUMBER_OF_CONTAINERS:
				setNumberOfContainers(NUMBER_OF_CONTAINERS_EDEFAULT);
				return;
			case CloudinfragenPackage.CONTAINER_SERVICE__IMAGE:
				setImage(IMAGE_EDEFAULT);
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
			case CloudinfragenPackage.CONTAINER_SERVICE__CLUSTER_NAME:
				return CLUSTER_NAME_EDEFAULT == null ? clusterName != null : !CLUSTER_NAME_EDEFAULT.equals(clusterName);
			case CloudinfragenPackage.CONTAINER_SERVICE__NUMBER_OF_CONTAINERS:
				return numberOfContainers != NUMBER_OF_CONTAINERS_EDEFAULT;
			case CloudinfragenPackage.CONTAINER_SERVICE__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case CloudinfragenPackage.CONTAINER_SERVICE__SUBNETS:
				return subnets != null && !subnets.isEmpty();
			case CloudinfragenPackage.CONTAINER_SERVICE__SECURITY_GROUPS:
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
		result.append(" (clusterName: ");
		result.append(clusterName);
		result.append(", numberOfContainers: ");
		result.append(numberOfContainers);
		result.append(", image: ");
		result.append(image);
		result.append(')');
		return result.toString();
	}

} //ContainerServiceImpl
