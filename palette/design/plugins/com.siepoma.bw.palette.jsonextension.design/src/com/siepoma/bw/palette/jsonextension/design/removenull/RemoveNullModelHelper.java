package com.siepoma.bw.palette.jsonextension.design.removenull;

import org.eclipse.emf.ecore.EObject;
import com.tibco.bw.design.api.BWAbstractModelHelper;
import com.siepoma.bw.palette.jsonextension.model.jsonextension.JsonextensionFactory;
import com.siepoma.bw.palette.jsonextension.model.jsonextension.RemoveNull;

// begin-custom-code
// add your own business code here
// end-custom-code

public class RemoveNullModelHelper extends BWAbstractModelHelper {

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Create an instance of the activity configuration model and provide "good" default values.
	 *
	 * @return new instance
	 */
    @Override
    public EObject createInstance() {
        RemoveNull activity = JsonextensionFactory.eINSTANCE.createRemoveNull();
    		// begin-custom-code
    		// add your own business code here
    		// end-custom-code
        return activity;
    }
}
