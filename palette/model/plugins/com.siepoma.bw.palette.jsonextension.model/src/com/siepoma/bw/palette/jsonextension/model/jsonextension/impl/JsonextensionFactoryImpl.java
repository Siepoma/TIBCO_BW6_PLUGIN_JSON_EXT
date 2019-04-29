/**
 */
package com.siepoma.bw.palette.jsonextension.model.jsonextension.impl;

import com.siepoma.bw.palette.jsonextension.model.jsonextension.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonextensionFactoryImpl extends EFactoryImpl implements JsonextensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JsonextensionFactory init() {
		try {
			JsonextensionFactory theJsonextensionFactory = (JsonextensionFactory)EPackage.Registry.INSTANCE.getEFactory(JsonextensionPackage.eNS_URI);
			if (theJsonextensionFactory != null) {
				return theJsonextensionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JsonextensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonextensionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JsonextensionPackage.VALIDATE_JSON: return createValidateJSON();
			case JsonextensionPackage.REMOVE_NULL: return createRemoveNull();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateJSON createValidateJSON() {
		ValidateJSONImpl validateJSON = new ValidateJSONImpl();
		return validateJSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveNull createRemoveNull() {
		RemoveNullImpl removeNull = new RemoveNullImpl();
		return removeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonextensionPackage getJsonextensionPackage() {
		return (JsonextensionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JsonextensionPackage getPackage() {
		return JsonextensionPackage.eINSTANCE;
	}

} //JsonextensionFactoryImpl
