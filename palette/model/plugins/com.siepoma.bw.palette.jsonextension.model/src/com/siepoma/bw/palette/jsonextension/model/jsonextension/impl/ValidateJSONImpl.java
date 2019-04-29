/**
 */
package com.siepoma.bw.palette.jsonextension.model.jsonextension.impl;

import com.siepoma.bw.palette.jsonextension.model.jsonextension.JsonextensionPackage;
import com.siepoma.bw.palette.jsonextension.model.jsonextension.ValidateJSON;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validate JSON</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.ValidateJSONImpl#getPathToJSONRef <em>Path To JSON Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidateJSONImpl extends EObjectImpl implements ValidateJSON {
	/**
	 * The default value of the '{@link #getPathToJSONRef() <em>Path To JSON Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToJSONRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_TO_JSON_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathToJSONRef() <em>Path To JSON Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToJSONRef()
	 * @generated
	 * @ordered
	 */
	protected String pathToJSONRef = PATH_TO_JSON_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidateJSONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonextensionPackage.Literals.VALIDATE_JSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathToJSONRef() {
		return pathToJSONRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathToJSONRef(String newPathToJSONRef) {
		String oldPathToJSONRef = pathToJSONRef;
		pathToJSONRef = newPathToJSONRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsonextensionPackage.VALIDATE_JSON__PATH_TO_JSON_REF, oldPathToJSONRef, pathToJSONRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JsonextensionPackage.VALIDATE_JSON__PATH_TO_JSON_REF:
				return getPathToJSONRef();
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
			case JsonextensionPackage.VALIDATE_JSON__PATH_TO_JSON_REF:
				setPathToJSONRef((String)newValue);
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
			case JsonextensionPackage.VALIDATE_JSON__PATH_TO_JSON_REF:
				setPathToJSONRef(PATH_TO_JSON_REF_EDEFAULT);
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
			case JsonextensionPackage.VALIDATE_JSON__PATH_TO_JSON_REF:
				return PATH_TO_JSON_REF_EDEFAULT == null ? pathToJSONRef != null : !PATH_TO_JSON_REF_EDEFAULT.equals(pathToJSONRef);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (PathToJSONRef: ");
		result.append(pathToJSONRef);
		result.append(')');
		return result.toString();
	}

} //ValidateJSONImpl
