/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.SecurityGroup;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.SecurityGroupImpl#getInboundRules <em>Inbound Rules</em>}</li>
 *   <li>{@link cloudinfragen.impl.SecurityGroupImpl#getOutboundRules <em>Outbound Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityGroupImpl extends CloudResourceImpl implements SecurityGroup {
	/**
	 * The cached value of the '{@link #getInboundRules() <em>Inbound Rules</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInboundRules()
	 * @generated
	 * @ordered
	 */
	protected EList<String> inboundRules;

	/**
	 * The cached value of the '{@link #getOutboundRules() <em>Outbound Rules</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutboundRules()
	 * @generated
	 * @ordered
	 */
	protected EList<String> outboundRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.SECURITY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInboundRules() {
		if (inboundRules == null) {
			inboundRules = new EDataTypeEList<String>(String.class, this, CloudinfragenPackage.SECURITY_GROUP__INBOUND_RULES);
		}
		return inboundRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOutboundRules() {
		if (outboundRules == null) {
			outboundRules = new EDataTypeEList<String>(String.class, this, CloudinfragenPackage.SECURITY_GROUP__OUTBOUND_RULES);
		}
		return outboundRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudinfragenPackage.SECURITY_GROUP__INBOUND_RULES:
				return getInboundRules();
			case CloudinfragenPackage.SECURITY_GROUP__OUTBOUND_RULES:
				return getOutboundRules();
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
			case CloudinfragenPackage.SECURITY_GROUP__INBOUND_RULES:
				getInboundRules().clear();
				getInboundRules().addAll((Collection<? extends String>)newValue);
				return;
			case CloudinfragenPackage.SECURITY_GROUP__OUTBOUND_RULES:
				getOutboundRules().clear();
				getOutboundRules().addAll((Collection<? extends String>)newValue);
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
			case CloudinfragenPackage.SECURITY_GROUP__INBOUND_RULES:
				getInboundRules().clear();
				return;
			case CloudinfragenPackage.SECURITY_GROUP__OUTBOUND_RULES:
				getOutboundRules().clear();
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
			case CloudinfragenPackage.SECURITY_GROUP__INBOUND_RULES:
				return inboundRules != null && !inboundRules.isEmpty();
			case CloudinfragenPackage.SECURITY_GROUP__OUTBOUND_RULES:
				return outboundRules != null && !outboundRules.isEmpty();
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
		result.append(" (inboundRules: ");
		result.append(inboundRules);
		result.append(", outboundRules: ");
		result.append(outboundRules);
		result.append(')');
		return result.toString();
	}

} //SecurityGroupImpl
