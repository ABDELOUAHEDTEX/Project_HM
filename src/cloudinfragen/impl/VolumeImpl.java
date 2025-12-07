/**
 */
package cloudinfragen.impl;

import cloudinfragen.CloudinfragenPackage;
import cloudinfragen.ComputeInstance;
import cloudinfragen.Volume;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudinfragen.impl.VolumeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link cloudinfragen.impl.VolumeImpl#isEncrypted <em>Encrypted</em>}</li>
 *   <li>{@link cloudinfragen.impl.VolumeImpl#getAttachedTo <em>Attached To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeImpl extends CloudResourceImpl implements Volume {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEncrypted() <em>Encrypted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncrypted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENCRYPTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEncrypted() <em>Encrypted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncrypted()
	 * @generated
	 * @ordered
	 */
	protected boolean encrypted = ENCRYPTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttachedTo() <em>Attached To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedTo()
	 * @generated
	 * @ordered
	 */
	protected ComputeInstance attachedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudinfragenPackage.Literals.VOLUME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.VOLUME__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEncrypted() {
		return encrypted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncrypted(boolean newEncrypted) {
		boolean oldEncrypted = encrypted;
		encrypted = newEncrypted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.VOLUME__ENCRYPTED, oldEncrypted, encrypted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputeInstance getAttachedTo() {
		if (attachedTo != null && attachedTo.eIsProxy()) {
			InternalEObject oldAttachedTo = (InternalEObject)attachedTo;
			attachedTo = (ComputeInstance)eResolveProxy(oldAttachedTo);
			if (attachedTo != oldAttachedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudinfragenPackage.VOLUME__ATTACHED_TO, oldAttachedTo, attachedTo));
			}
		}
		return attachedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeInstance basicGetAttachedTo() {
		return attachedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachedTo(ComputeInstance newAttachedTo, NotificationChain msgs) {
		ComputeInstance oldAttachedTo = attachedTo;
		attachedTo = newAttachedTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudinfragenPackage.VOLUME__ATTACHED_TO, oldAttachedTo, newAttachedTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudinfragenPackage.VOLUME__ATTACHED_TO:
				if (attachedTo != null)
					msgs = ((InternalEObject)attachedTo).eInverseRemove(this, CloudinfragenPackage.COMPUTE_INSTANCE__VOLUMES, ComputeInstance.class, msgs);
				return basicSetAttachedTo((ComputeInstance)otherEnd, msgs);
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
			case CloudinfragenPackage.VOLUME__ATTACHED_TO:
				return basicSetAttachedTo(null, msgs);
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
			case CloudinfragenPackage.VOLUME__SIZE:
				return getSize();
			case CloudinfragenPackage.VOLUME__ENCRYPTED:
				return isEncrypted();
			case CloudinfragenPackage.VOLUME__ATTACHED_TO:
				if (resolve) return getAttachedTo();
				return basicGetAttachedTo();
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
			case CloudinfragenPackage.VOLUME__SIZE:
				setSize((Integer)newValue);
				return;
			case CloudinfragenPackage.VOLUME__ENCRYPTED:
				setEncrypted((Boolean)newValue);
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
			case CloudinfragenPackage.VOLUME__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case CloudinfragenPackage.VOLUME__ENCRYPTED:
				setEncrypted(ENCRYPTED_EDEFAULT);
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
			case CloudinfragenPackage.VOLUME__SIZE:
				return size != SIZE_EDEFAULT;
			case CloudinfragenPackage.VOLUME__ENCRYPTED:
				return encrypted != ENCRYPTED_EDEFAULT;
			case CloudinfragenPackage.VOLUME__ATTACHED_TO:
				return attachedTo != null;
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
		result.append(" (size: ");
		result.append(size);
		result.append(", encrypted: ");
		result.append(encrypted);
		result.append(')');
		return result.toString();
	}

} //VolumeImpl
