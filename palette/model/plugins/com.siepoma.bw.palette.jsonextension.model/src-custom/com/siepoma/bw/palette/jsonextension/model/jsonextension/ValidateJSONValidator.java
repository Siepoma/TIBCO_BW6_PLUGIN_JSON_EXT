package com.siepoma.bw.palette.jsonextension.model.jsonextension;

import com.siepoma.bw.palette.jsonextension.model.jsonextension.ValidateJSON;
import com.tibco.bw.validation.process.ActivityConfigurationValidator;
import com.tibco.bw.validation.process.ActivityValidationContext;
import com.siepoma.bw.palette.jsonextension.model.jsonextension.JsonextensionPackage;
import com.siepoma.bw.palette.jsonextension.model.utils.Messages;
import com.siepoma.bw.palette.jsonextension.model.utils.MessageCode;
import org.eclipse.osgi.util.NLS;

// begin-custom-code
// add your own business code here
// end-custom-code

public class ValidateJSONValidator implements ActivityConfigurationValidator {	

	// begin-custom-code
	// add your own business code here
	// end-custom-code

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * Validates Activity model configuration.
	 * @param context
	 *			The activity validation context.Developers can retrieve following informations:
	 *          <li> Activity Configuration Model(EMF model)</li>
 	 *          <li> Name of the EventSource Activity</li>
     *          <li> Value of process property used in Activity Configuration</li>
     *          <li> Name of property configured in the Attribute Binding Field</li>
     *          <li> Name of the process</li><br>
	 */	
	@Override
	public void validateBWActivityConfiguration(ActivityValidationContext context) {
	    ValidateJSON model = (ValidateJSON) context.getActivityConfigurationModel();    	
		
	    String PathToJSONRefModul = context.getAttributeBindingPropertyName("PathToJSONRef");
		if(PathToJSONRefModul == null || "".equals(PathToJSONRefModul)){
		    String PathToJSONRef = model.getPathToJSONRef(); 
		    if(PathToJSONRef == null || "".equals(PathToJSONRef)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"PathToJSONRef"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, JsonextensionPackage.Literals.VALIDATE_JSON__PATH_TO_JSON_REF);
		    }
		}	
		// begin-custom-code
		// add your own business code here
		// end-custom-code
  	}
}
