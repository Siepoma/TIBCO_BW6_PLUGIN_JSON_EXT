package com.siepoma.bw.palette.jsonextension.design.validatejson;
import org.eclipse.xsd.XSDElementDeclaration;
import com.tibco.bw.design.api.BWExtensionActivitySchema;
import java.io.InputStream;
import org.eclipse.xsd.XSDSchema;

// begin-custom-code
// add your own business code here
// end-custom-code

public class ValidateJSONSchema extends BWExtensionActivitySchema 

{

	// begin-custom-code
	// add your own business code here
	// end-custom-code

	private static ValidateJSONSchema INSTANCE = new ValidateJSONSchema();
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * File location.
	 */
	private static final String SCHEMA_FILE_PATH = "/schema/Interface.xsd";
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * The name of the input element.
	 */
	private static final String INPUT_TYPE_ELEMENT_NAME = "JsonString";
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * The name of the output element.
	 */
	private static final String OUTPUT_TYPE_ELEMENT_NAME = "ValuesNotFound";
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Get the input element according to the input name.
	 *
	 * @return input element
	 */
	public static XSDElementDeclaration getInputType() {
     	XSDSchema activitySignatureSchema = INSTANCE.loadSchema();
		XSDElementDeclaration activityInputType = null;
		if (activitySignatureSchema != null) {
			activityInputType = activitySignatureSchema.resolveElementDeclaration(INPUT_TYPE_ELEMENT_NAME);
		}
		// begin-custom-code
		// add your own business code here
		// end-custom-code
		return activityInputType;
	}

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Get the output element according to the output name.
	 *
	 * @return output element
	 */
	public static XSDElementDeclaration getOutputType() {
     	XSDSchema activitySignatureSchema = INSTANCE.loadSchema(); 
		XSDElementDeclaration activityOutputType = null;
		if (activitySignatureSchema != null) {
			activityOutputType = activitySignatureSchema.resolveElementDeclaration(OUTPUT_TYPE_ELEMENT_NAME);
		}
		// begin-custom-code
		// add your own business code here
		// end-custom-code
		return activityOutputType;
	}	
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Use the Java class loader to find and create a stream to the resource based on schema location in the workspace.
	 * @return stream to read the schema resource.	
	 */
	@Override
	protected InputStream getSchemaAsInputStream() {
		return this.getClass().getResourceAsStream(SCHEMA_FILE_PATH);
	}
	
}
