package com.siepoma.bw.palette.jsonextension.design.validatejson;

import com.tibco.bw.design.field.AttributeBindingField;
import com.tibco.bw.design.util.PropertyTypeQnameConstants;
import com.siepoma.bw.palette.jsonextension.model.jsonextension.JsonextensionPackage;
import org.eclipse.swt.widgets.Text;

import org.eclipse.swt.widgets.Composite;
import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.siepoma.bw.palette.jsonextension.model.jsonextension.ValidateJSON;
import com.siepoma.bw.palette.jsonextension.model.utils.Messages;

// begin-custom-code
// add your own business code here
// end-custom-code

/**
 * General tab properties for the activity.
 */
public class ValidateJSONGeneralSection extends AbstractBWTransactionalSection 
{

	// begin-custom-code
	// add your own business code here
	// end-custom-code

    /**
     * <!-- begin-custom-doc -->
     * 
     * <!-- end-custom-doc -->
     * @generated
     */
    private AttributeBindingField pathToJSONRefABF;
	/**
     * <!-- begin-custom-doc -->
     * 
     * <!-- end-custom-doc -->
     * @generated
     */
    private Text pathToJSONRef;
    


    @Override
    protected Class<?> getModelClass() {
       return ValidateJSON.class;
    }

    /**
	 * <!-- begin-custom-doc -->
     * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Initialize bindings of controls to the input. 
	 */
    @Override
    protected void initBindings() {
        getBindingManager().bind(pathToJSONRefABF, getInput(), JsonextensionPackage.Literals.VALIDATE_JSON__PATH_TO_JSON_REF); 
    
        // begin-custom-code
        // add your own business code here
        // end-custom-code
    }

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method creates section-specific UI.
	 * @param root
	 * @return
	 */
    @Override
    protected Composite doCreateControl(final Composite root) {
        Composite parent = BWFieldFactory.getInstance().createComposite(root, 2);
   	    BWFieldFactory.getInstance().createLabel(parent, Messages.VALIDATEJSON_PATHTOJSONREF, true);
   	    pathToJSONRef = BWFieldFactory.getInstance().createTextBox(parent);
   	    pathToJSONRef.setToolTipText(Messages.VALIDATEJSON_PATHTOJSONREF_TOOLTIP);
   	    pathToJSONRefABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, pathToJSONRef, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

		// begin-custom-code
		// add your own business code here
		// end-custom-code
        return parent;
    }
}
