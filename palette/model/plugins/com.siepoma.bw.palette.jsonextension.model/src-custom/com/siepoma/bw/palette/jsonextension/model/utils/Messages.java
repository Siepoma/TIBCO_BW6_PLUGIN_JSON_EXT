/*
 * This software is confidential and proprietary information of TIBCO Software Inc.
 * Overridable true
 */
package com.siepoma.bw.palette.jsonextension.model.utils;

import java.util.ResourceBundle;
import org.eclipse.osgi.util.NLS;

public class Messages extends NLS 

{

	private static final String BUNDLE_NAME = "com.siepoma.bw.palette.jsonextension.model.utils.messages";

	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	public static ResourceBundle getBundle() {
		return ResourceBundle.getBundle(BUNDLE_NAME);
	}
    
	
	public static String VALIDATEJSON_PATHTOJSONREF;
	public static String VALIDATEJSON_PATHTOJSONREF_TOOLTIP;
	public static String PALETTE_PARAMETER_VALUE_INVALID;	
}
