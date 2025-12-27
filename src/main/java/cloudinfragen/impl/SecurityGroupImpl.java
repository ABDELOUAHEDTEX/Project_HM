/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.SecurityGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.SecurityGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudinfragen.impl.SecurityGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudinfragen.impl.SecurityGroupImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link cloudinfragen.impl.SecurityGroupImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link cloudinfragen.impl.SecurityGroupImpl#getInboundRules <em>Inbound Rules</em>}</li>
 *   <li>{@link cloudinfragen.impl.SecurityGroupImpl#getOutboundRules <em>Outbound Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityGroupImpl extends MinimalEObjectImpl.Container implements SecurityGroup {
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.SECURITY_GROUP__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.SECURITY_GROUP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.SECURITY_GROUP__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CloudinfragenPackage.SECURITY_GROUP__TAGS);
		}
		return tags;
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
			case CloudinfragenPackage.SECURITY_GROUP__ID:
				return getId();
			case CloudinfragenPackage.SECURITY_GROUP__NAME:
				return getName();
			case CloudinfragenPackage.SECURITY_GROUP__REGION:
				return getRegion();
			case CloudinfragenPackage.SECURITY_GROUP__TAGS:
				return getTags();
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
			case CloudinfragenPackage.SECURITY_GROUP__ID:
				setId((String)newValue);
				return;
			case CloudinfragenPackage.SECURITY_GROUP__NAME:
				setName((String)newValue);
				return;
			case CloudinfragenPackage.SECURITY_GROUP__REGION:
				setRegion((String)newValue);
				return;
			case CloudinfragenPackage.SECURITY_GROUP__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
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
			case CloudinfragenPackage.SECURITY_GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudinfragenPackage.SECURITY_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudinfragenPackage.SECURITY_GROUP__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CloudinfragenPackage.SECURITY_GROUP__TAGS:
				getTags().clear();
				return;
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
			case CloudinfragenPackage.SECURITY_GROUP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudinfragenPackage.SECURITY_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudinfragenPackage.SECURITY_GROUP__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CloudinfragenPackage.SECURITY_GROUP__TAGS:
				return tags != null && !tags.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", region: ");
		result.append(region);
		result.append(", tags: ");
		result.append(tags);
		result.append(", inboundRules: ");
		result.append(inboundRules);
		result.append(", outboundRules: ");
		result.append(outboundRules);
		result.append(')');
		return result.toString();
	}

} //SecurityGroupImpl
