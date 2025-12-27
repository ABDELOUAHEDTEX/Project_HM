/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.IAMPolicy;
import cloudinfragen.IAMRole;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IAM Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.IAMRoleImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudinfragen.impl.IAMRoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudinfragen.impl.IAMRoleImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link cloudinfragen.impl.IAMRoleImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link cloudinfragen.impl.IAMRoleImpl#getAssumeRolePolicy <em>Assume Role Policy</em>}</li>
 *   <li>{@link cloudinfragen.impl.IAMRoleImpl#getPolicies <em>Policies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IAMRoleImpl extends MinimalEObjectImpl.Container implements IAMRole {
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
	 * The default value of the '{@link #getAssumeRolePolicy() <em>Assume Role Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumeRolePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSUME_ROLE_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssumeRolePolicy() <em>Assume Role Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumeRolePolicy()
	 * @generated
	 * @ordered
	 */
	protected String assumeRolePolicy = ASSUME_ROLE_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPolicies() <em>Policies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<IAMPolicy> policies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IAMRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.IAM_ROLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.IAM_ROLE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.IAM_ROLE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.IAM_ROLE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CloudinfragenPackage.IAM_ROLE__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssumeRolePolicy() {
		return assumeRolePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssumeRolePolicy(String newAssumeRolePolicy) {
		String oldAssumeRolePolicy = assumeRolePolicy;
		assumeRolePolicy = newAssumeRolePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.IAM_ROLE__ASSUME_ROLE_POLICY, oldAssumeRolePolicy, assumeRolePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IAMPolicy> getPolicies() {
		if (policies == null) {
			policies = new EObjectResolvingEList<IAMPolicy>(IAMPolicy.class, this, CloudinfragenPackage.IAM_ROLE__POLICIES);
		}
		return policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudinfragenPackage.IAM_ROLE__ID:
				return getId();
			case CloudinfragenPackage.IAM_ROLE__NAME:
				return getName();
			case CloudinfragenPackage.IAM_ROLE__REGION:
				return getRegion();
			case CloudinfragenPackage.IAM_ROLE__TAGS:
				return getTags();
			case CloudinfragenPackage.IAM_ROLE__ASSUME_ROLE_POLICY:
				return getAssumeRolePolicy();
			case CloudinfragenPackage.IAM_ROLE__POLICIES:
				return getPolicies();
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
			case CloudinfragenPackage.IAM_ROLE__ID:
				setId((String)newValue);
				return;
			case CloudinfragenPackage.IAM_ROLE__NAME:
				setName((String)newValue);
				return;
			case CloudinfragenPackage.IAM_ROLE__REGION:
				setRegion((String)newValue);
				return;
			case CloudinfragenPackage.IAM_ROLE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case CloudinfragenPackage.IAM_ROLE__ASSUME_ROLE_POLICY:
				setAssumeRolePolicy((String)newValue);
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
			case CloudinfragenPackage.IAM_ROLE__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudinfragenPackage.IAM_ROLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudinfragenPackage.IAM_ROLE__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CloudinfragenPackage.IAM_ROLE__TAGS:
				getTags().clear();
				return;
			case CloudinfragenPackage.IAM_ROLE__ASSUME_ROLE_POLICY:
				setAssumeRolePolicy(ASSUME_ROLE_POLICY_EDEFAULT);
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
			case CloudinfragenPackage.IAM_ROLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudinfragenPackage.IAM_ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudinfragenPackage.IAM_ROLE__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CloudinfragenPackage.IAM_ROLE__TAGS:
				return tags != null && !tags.isEmpty();
			case CloudinfragenPackage.IAM_ROLE__ASSUME_ROLE_POLICY:
				return ASSUME_ROLE_POLICY_EDEFAULT == null ? assumeRolePolicy != null : !ASSUME_ROLE_POLICY_EDEFAULT.equals(assumeRolePolicy);
			case CloudinfragenPackage.IAM_ROLE__POLICIES:
				return policies != null && !policies.isEmpty();
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
		result.append(", assumeRolePolicy: ");
		result.append(assumeRolePolicy);
		result.append(')');
		return result.toString();
	}

} //IAMRoleImpl
