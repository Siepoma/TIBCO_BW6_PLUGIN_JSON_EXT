package com.siepoma.bw.palette.jsonextension.model.jsonextension;

import com.siepoma.bw.palette.jsonextension.model.jsonextension.RemoveNull;
import com.tibco.bw.validation.process.ActivityConfigurationValidator;
import com.tibco.bw.validation.process.ActivityValidationContext;

// begin-custom-code
// add your own business code here
// end-custom-code

public class RemoveNullValidator implements ActivityConfigurationValidator {	

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
	    @SuppressWarnings("unused")
	    RemoveNull model = (RemoveNull) context.getActivityConfigurationModel();    	
			
		// begin-custom-code
		// add your own business code here
		// end-custom-code
  	}
}
