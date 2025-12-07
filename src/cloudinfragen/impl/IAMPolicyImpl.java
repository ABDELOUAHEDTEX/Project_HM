/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.IAMPolicy;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IAM Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.IAMPolicyImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link cloudinfragen.impl.IAMPolicyImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IAMPolicyImpl extends CloudResourceImpl implements IAMPolicy {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> actions;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<String> resources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IAMPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.IAM_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getActions() {
		if (actions == null) {
			actions = new EDataTypeEList<String>(String.class, this, CloudinfragenPackage.IAM_POLICY__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getResources() {
		if (resources == null) {
			resources = new EDataTypeEList<String>(String.class, this, CloudinfragenPackage.IAM_POLICY__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudinfragenPackage.IAM_POLICY__ACTIONS:
				return getActions();
			case CloudinfragenPackage.IAM_POLICY__RESOURCES:
				return getResources();
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
			case CloudinfragenPackage.IAM_POLICY__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends String>)newValue);
				return;
			case CloudinfragenPackage.IAM_POLICY__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends String>)newValue);
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
			case CloudinfragenPackage.IAM_POLICY__ACTIONS:
				getActions().clear();
				return;
			case CloudinfragenPackage.IAM_POLICY__RESOURCES:
				getResources().clear();
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
			case CloudinfragenPackage.IAM_POLICY__ACTIONS:
				return actions != null && !actions.isEmpty();
			case CloudinfragenPackage.IAM_POLICY__RESOURCES:
				return resources != null && !resources.isEmpty();
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
		result.append(" (actions: ");
		result.append(actions);
		result.append(", resources: ");
		result.append(resources);
		result.append(')');
		return result.toString();
	}

} //IAMPolicyImpl
