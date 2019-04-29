package com.siepoma.bw.palette.jsonextension.runtime.fault;

import javax.xml.namespace.QName;
import org.genxdm.ProcessingContext;
import com.tibco.bw.runtime.ActivityContext;
import com.tibco.neo.localized.BundleMessage;

// begin-custom-code
// add your own business code here
// end-custom-code

public class JsonExtensionPluginException extends JsonExtensionActivityBaseException 

{
	// begin-custom-code
	// add your own business code here
	// end-custom-code

	private static final long serialVersionUID = 1L;
	
	public <N> JsonExtensionPluginException(ActivityContext<N> activityContext, Integer code,
			BundleMessage bundleMessage) {
		super(activityContext, code, bundleMessage);
	}
	
	/**
 	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 */
	public QName getFaultElementQName() {
		// begin-custom-code
        // add your own business code here
        // end-custom-code
		return new QName("http://www.tibco.com/JsonExtension/JsonExtensionExceptions","JsonExtensionPluginException");
	}
	/**
 	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method to set fault data according to design time
	 * @param processingContext
	 *			XML processing context.  
	 */
	public <N> void buildFault(ProcessingContext<N> pcx) {
		N JsonExtensionPluginException = this.createFaultMessageElement(pcx);
		
		this.setData(JsonExtensionPluginException);
		// begin-custom-code
        // add your own business code here
        // end-custom-code
	}
	

}
