/**
 */
package com.siepoma.bw.palette.jsonextension.model.jsonextension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.JsonextensionFactory
 * @model kind="package"
 * @generated
 */
public interface JsonextensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jsonextension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ns.tibco.com/bw/palette/jsonextension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jsonextension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JsonextensionPackage eINSTANCE = com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.JsonextensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.ValidateJSONImpl <em>Validate JSON</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.ValidateJSONImpl
	 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.JsonextensionPackageImpl#getValidateJSON()
	 * @generated
	 */
	int VALIDATE_JSON = 0;

	/**
	 * The feature id for the '<em><b>Path To JSON Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_JSON__PATH_TO_JSON_REF = 0;

	/**
	 * The number of structural features of the '<em>Validate JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_JSON_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.RemoveNullImpl <em>Remove Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.RemoveNullImpl
	 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.JsonextensionPackageImpl#getRemoveNull()
	 * @generated
	 */
	int REMOVE_NULL = 1;

	/**
	 * The number of structural features of the '<em>Remove Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_NULL_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.siepoma.bw.palette.jsonextension.model.jsonextension.ValidateJSON <em>Validate JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate JSON</em>'.
	 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.ValidateJSON
	 * @generated
	 */
	EClass getValidateJSON();

	/**
	 * Returns the meta object for the attribute '{@link com.siepoma.bw.palette.jsonextension.model.jsonextension.ValidateJSON#getPathToJSONRef <em>Path To JSON Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path To JSON Ref</em>'.
	 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.ValidateJSON#getPathToJSONRef()
	 * @see #getValidateJSON()
	 * @generated
	 */
	EAttribute getValidateJSON_PathToJSONRef();

	/**
	 * Returns the meta object for class '{@link com.siepoma.bw.palette.jsonextension.model.jsonextension.RemoveNull <em>Remove Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Null</em>'.
	 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.RemoveNull
	 * @generated
	 */
	EClass getRemoveNull();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JsonextensionFactory getJsonextensionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.ValidateJSONImpl <em>Validate JSON</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.ValidateJSONImpl
		 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.JsonextensionPackageImpl#getValidateJSON()
		 * @generated
		 */
		EClass VALIDATE_JSON = eINSTANCE.getValidateJSON();

		/**
		 * The meta object literal for the '<em><b>Path To JSON Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATE_JSON__PATH_TO_JSON_REF = eINSTANCE.getValidateJSON_PathToJSONRef();

		/**
		 * The meta object literal for the '{@link com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.RemoveNullImpl <em>Remove Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.RemoveNullImpl
		 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.JsonextensionPackageImpl#getRemoveNull()
		 * @generated
		 */
		EClass REMOVE_NULL = eINSTANCE.getRemoveNull();

	}

} //JsonextensionPackage
