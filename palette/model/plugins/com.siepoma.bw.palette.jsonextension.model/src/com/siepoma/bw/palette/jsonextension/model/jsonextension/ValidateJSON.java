/**
 */
package com.siepoma.bw.palette.jsonextension.model.jsonextension;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validate JSON</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.siepoma.bw.palette.jsonextension.model.jsonextension.ValidateJSON#getPathToJSONRef <em>Path To JSON Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.JsonextensionPackage#getValidateJSON()
 * @model annotation="dkactivityconfig activitytype='Synchronous' schemaType='XSD/WSDL' schemaFile='Interface.xsd' inputelementname='JsonString' outputelementname='ValuesNotFound' faultelementname='' helpdocuuid='6326c979-f66d-4d9e-aba8-e16f59f138d0'"
 * @generated
 */
public interface ValidateJSON extends EObject {
	/**
	 * Returns the value of the '<em><b>Path To JSON Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path To JSON Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path To JSON Ref</em>' attribute.
	 * @see #setPathToJSONRef(String)
	 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.JsonextensionPackage#getValidateJSON_PathToJSONRef()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='PathToJSONRef' isModelProperty='true' control='TextBox' value='null' tooltip='Tooltip'"
	 * @generated
	 */
	String getPathToJSONRef();

	/**
	 * Sets the value of the '{@link com.siepoma.bw.palette.jsonextension.model.jsonextension.ValidateJSON#getPathToJSONRef <em>Path To JSON Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path To JSON Ref</em>' attribute.
	 * @see #getPathToJSONRef()
	 * @generated
	 */
	void setPathToJSONRef(String value);

} // ValidateJSON
