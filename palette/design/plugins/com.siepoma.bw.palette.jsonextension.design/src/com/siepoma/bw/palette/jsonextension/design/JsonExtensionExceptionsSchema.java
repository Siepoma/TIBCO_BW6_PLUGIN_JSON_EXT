package com.siepoma.bw.palette.jsonextension.design;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDSchema;
import com.tibco.bw.design.api.BWExtensionActivitySchema;

// begin-custom-code
// add your own business code here
// end-custom-code

public class JsonExtensionExceptionsSchema extends BWExtensionActivitySchema 

{
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * File location
	 */
    private static String SCHEMA_FILE_PATH = "/schema/JsonExtensionExceptions.xsd"; //$NON-NLS-1$
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * The name of the fault elements
	 */
    private static final String[] JSONEXTENSION_PLUGIN_FAULT_TYPE_ELEMENT_NAMES = new String[] { "JsonExtensionPluginException" }; //$NON-NLS-1$
    private static JsonExtensionExceptionsSchema INSTANCE = new JsonExtensionExceptionsSchema();
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
			// begin-custom-code
			// add your own business code here
			// end-custom-code
       return getClass().getResourceAsStream(JsonExtensionExceptionsSchema.SCHEMA_FILE_PATH);
    }
   
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * Get the fault elements
	 * @return list of elements
	 */
    public static List<XSDElementDeclaration> getJsonExtensionPluginFaultTypes() {
			// begin-custom-code
			// add your own business code here
			// end-custom-code
       return getFaultElements(JsonExtensionExceptionsSchema.JSONEXTENSION_PLUGIN_FAULT_TYPE_ELEMENT_NAMES);
    }
    
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Get the fault elements according to the fault names
	 * @param faultNames
	 * @return list of elements
	 */
    private static List<XSDElementDeclaration> getFaultElements(final String[] faultNames) {
       List<XSDElementDeclaration> faultTypeElements = new ArrayList<XSDElementDeclaration>();
       XSDSchema fileExceptionsSchema = JsonExtensionExceptionsSchema.INSTANCE.loadSchema();  
       if(fileExceptionsSchema != null) {
          for (String faultElementName : faultNames) {
             XSDElementDeclaration faultTypesElement = fileExceptionsSchema.resolveElementDeclaration(faultElementName);
             if(faultTypesElement != null) {
                faultTypeElements.add(faultTypesElement);
             }
          }
       }
			// begin-custom-code
			// add your own business code here
			// end-custom-code
       return faultTypeElements;
    }
}
