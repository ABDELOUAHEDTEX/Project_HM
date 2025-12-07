/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.IAMPolicy;
import cloudinfragen.IAMRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IAM Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.IAMRoleImpl#getAssumeRolePolicy <em>Assume Role Policy</em>}</li>
 *   <li>{@link cloudinfragen.impl.IAMRoleImpl#getPolicies <em>Policies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IAMRoleImpl extends CloudResourceImpl implements IAMRole {
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		result.append(" (assumeRolePolicy: ");
		result.append(assumeRolePolicy);
		result.append(')');
		return result.toString();
	}

} //IAMRoleImpl
