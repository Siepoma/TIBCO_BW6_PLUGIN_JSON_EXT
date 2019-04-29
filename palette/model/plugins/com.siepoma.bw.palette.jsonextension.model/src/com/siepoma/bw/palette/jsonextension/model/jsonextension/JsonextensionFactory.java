/**
 */
package com.siepoma.bw.palette.jsonextension.model.jsonextension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.JsonextensionPackage
 * @generated
 */
public interface JsonextensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JsonextensionFactory eINSTANCE = com.siepoma.bw.palette.jsonextension.model.jsonextension.impl.JsonextensionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Validate JSON</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validate JSON</em>'.
	 * @generated
	 */
	ValidateJSON createValidateJSON();

	/**
	 * Returns a new object of class '<em>Remove Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Null</em>'.
	 * @generated
	 */
	RemoveNull createRemoveNull();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JsonextensionPackage getJsonextensionPackage();

} //JsonextensionFactory
