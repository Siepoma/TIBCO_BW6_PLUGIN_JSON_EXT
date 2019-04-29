package com.siepoma.bw.palette.jsonextension.runtime;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.genxdm.Model;
import org.genxdm.ProcessingContext;
import org.genxdm.io.FragmentBuilder;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.siepoma.bw.palette.jsonextension.model.jsonextension.ValidateJSON;
import com.siepoma.bw.palette.jsonextension.runtime.pojo.validatejson.ValuesNotFound;
import com.siepoma.bw.palette.jsonextension.runtime.util.PaletteUtil;
import com.tibco.bw.runtime.ActivityFault;
import com.tibco.bw.runtime.ActivityLifecycleFault;
import com.tibco.bw.runtime.ProcessContext;
import com.tibco.bw.runtime.SyncActivity;
import com.tibco.bw.runtime.annotation.Property;
import com.tibco.bw.runtime.util.XMLUtils;
import com.tibco.neo.localized.LocalizedMessage;

// begin-custom-code
// add your own business code here
// end-custom-code

public class ValidateJSONSynchronousActivity<N> extends SyncActivity<N> implements JsonExtensionConstants 

{

	// begin-custom-code
	final String ACTIVITY_INPUT_JSON = "JsonString";
	final String ACTIVITY_PARAM_JSON_REFERENCE = "PathToJSONRef";
	@SuppressWarnings("unchecked")
	public String[] checkValues(String validatorJson, String jsonToValidate) throws FileNotFoundException{
    	activityLogger.debug(RuntimeMessageBundle.DEBUG_SEPARATOR );

		activityLogger.debug("START CHECK");
		List<String> out = new ArrayList<String>();
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new FileReader(validatorJson));
		activityLogger.debug("File Read");
		//System.out.println("File Read");


		Map<String,Object> mapValidator = new HashMap<String,Object>();
		mapValidator = (Map<String,Object>) gson.fromJson(reader, mapValidator.getClass());

		Map<String,Object> mapToValidate = new HashMap<String,Object>();
		mapToValidate = (Map<String,Object>) gson.fromJson(jsonToValidate, mapToValidate.getClass());
		activityLogger.debug("JSON LOADED");
	//	System.out.println("JSON LOADED");


		checkJsonObj(mapValidator,mapToValidate,out);

		activityLogger.debug("CHECK DONE");
		//System.out.println("CHECK DONE");
		String[] outArray = populateArray(out);
    	activityLogger.debug(RuntimeMessageBundle.DEBUG_SEPARATOR );

		return outArray;
	}

	private boolean existsValorizedValue(Map<String,Object> map, String valueToCheck) {
		boolean result = false;
		for(Map.Entry<String, Object> entry : map.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			if(key.equals(valueToCheck) && value != null) { 
				result = true;
				break;}
		}
		return result;
	}

	private void checkJsonObj(Map<String,Object> mapValidator, Map<String,Object> mapToValidate, List<String> notFound, String rootKey) {

		String keyToAdd = rootKey + "."; 
		
		for(Map.Entry<String, Object> entry : mapValidator.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			
			//System.out.println(key + " TYPE: " + value.getClass());
			if (!existsValorizedValue(mapToValidate, key)) notFound.add(keyToAdd+key);
			else {
				if (value instanceof LinkedTreeMap) {
					checkJsonObj((Map<String,Object>) mapValidator.get(key),(Map<String,Object>)  mapToValidate.get(key), notFound,keyToAdd+key);	
				}
				else if(value instanceof ArrayList<?>) {
					//System.out.println("Got a list: " + value + " key: " + key);
					if(((ArrayList) mapToValidate.get(key)).isEmpty()) notFound.add(keyToAdd+key);
					else checkJsonList(((ArrayList) value).get(0),(List<Object>) mapToValidate.get(key), notFound, keyToAdd+key);
				}
			}

		}

	}

	private void checkJsonObj(Map<String,Object> mapValidator, Map<String,Object> mapToValidate, List<String> notFound) {
		checkJsonObj(mapValidator, mapToValidate, notFound,"root");

	}
	
	private String[] populateArray(List<String> list) {
		String[] outArray = new String[list.size()];
		int i = 0;
		for(String elem : list) {
			outArray[i] = elem;
			i++;
		}
		return outArray;
	}
	
	private void checkJsonList(Object listValidator, List<Object> listToValidate, List<String> notFound, String key) {

		if(listValidator instanceof LinkedTreeMap) {
			for(Object entry : listToValidate) {
				checkJsonObj((Map<String,Object>) listValidator, (Map<String,Object>) entry, notFound, key);	
			}
		}else {
			if (listToValidate.isEmpty()) notFound.add(key);
		}
	}
	
	// end-custom-code

	
	
	@Property
	public ValidateJSON activityConfig;


	
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * 
	 * This method is called to initialize the activity. It is called by the 
	 * BusinessWorks Engine once for a particular activity lifetime.
	 * 
	 * @throws ActivityLifecycleFault
	 *             Thrown if the activity initialization is unsuccessful or encounters an error.
	 */
	@Override
	public void init() throws ActivityLifecycleFault {
		if(this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "init()", activityContext.getActivityName()
								,activityContext.getProcessName()
								,activityContext.getDeploymentUnitName()
								,activityContext.getDeploymentUnitVersion() });
		}
  
		// begin-custom-code
        // add your own business code here
        // end-custom-code
		super.init();
	}
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * 
	 * This method is called when an activity is destroyed. It is called by the BusinessWorks Engine and 
	 * the method must be implemented to release or cleanup any resources held by this activity.
	 */
    @Override
	public void destroy() {
		if(this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "destroy()", activityContext.getActivityName()
								,activityContext.getProcessName()
								,activityContext.getDeploymentUnitName()
								,activityContext.getDeploymentUnitVersion() });
		}
		// begin-custom-code
        // add your own business code here
        // end-custom-code
		super.destroy();
	}
	
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
     * The implementation of this method defines the execution behavior of the synchronous activity.  
     * This method is called by the BusinessWorks Engine on a engine thread to perform 
     * the activity essential functions.
     * 
     * @param input 
     *           This is the activity input data. It is an XML Element which adheres to the input schema of the activity or <code>null</code> if the activity does not require an input. The 
     *           activity input data should be processed using the XML processing context obtained from the method {@link ProcessContext#getXMLProcessingContext()}.
     * @param processContext
	 *           Context that is associated with a BusinessWorks Process instance. This context is unique per BusinessWorks Process instance and it 
	 *           is not visible to other BusinessWorks Process instances.  Also this context is valid only within the BusinessWorks Engine thread on 
	 *           which this method is invoked. Therefore this context must not be saved or used by a different thread that is created or managed by the activity
	 *           implementation. 
     * @return An XML Element which adheres to the output schema of the activity or may return <code>null</code> if the activity does not require an output. 
     *         This is the activity output data and it should be created using the XML processing context obtained from the method {@link ProcessContext#getXMLProcessingContext()}.
     * @throws ActivityFault
     *           Thrown if the activity execution is unsuccessful or encounters an error.
	 */
	@Override
	public N execute(N input, ProcessContext<N> processContext) throws ActivityFault {
        if(getActivityLogger().isDebugEnabled()){
        	activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "execute()"
								,activityContext.getActivityName()
								,activityContext.getProcessName()
								,activityContext.getDeploymentUnitName()
								,activityContext.getDeploymentUnitVersion() });
	        String serializedInputNode = XMLUtils.serializeNode(input, processContext.getXMLProcessingContext());
		    activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_INPUT, new Object[] {activityContext.getActivityName(), serializedInputNode});
		}
        N result = null;
        try {
            // begin-custom-code
        	activityLogger.debug(RuntimeMessageBundle.DEBUG_SEPARATOR + "START exec");
        	String inputJson = this.getInputParameterStringValueByName(input, processContext.getXMLProcessingContext(), ACTIVITY_INPUT_JSON);
        	//String reference = this.getInputAttributeStringValueByName(input, processContext.getXMLProcessingContext(), ACTIVITY_PARAM_JSON_REFERENCE);
        	String reference = activityConfig.getPathToJSONRef();

        	activityLogger.debug(" JSON: " + inputJson + " REF: " +reference);
        	String[] outList =  checkValues(reference,inputJson);
        	activityLogger.debug(" OUT: " + outList.toString());
			// end-custom-code
	        // create output data according the output structure
            result = evalOutput(input, processContext.getXMLProcessingContext(), outList);
        } catch (ActivityFault e) {
            throw e;
        } catch (Exception e) {
            throw new ActivityFault(activityContext, new LocalizedMessage(
						RuntimeMessageBundle.ERROR_OCCURED_RETRIEVE_RESULT, new Object[] {activityContext.getActivityName()}));
        }

        if(getActivityLogger().isDebugEnabled()){
	        String serializedOutputNode = XMLUtils.serializeNode(result, processContext.getXMLProcessingContext());
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_OUTPUT, new Object[] {activityContext.getActivityName(), serializedOutputNode, activityContext.getActivityName()});
		}
        return result;
	}
	/**
	 * <!-- begin-custom-doc -->
	 *
	 *
	 * <!-- end-custom-doc -->
	 * @generated
	 *  
	 * This method to build the output after finishing the business.
	 * @param inputData
	 *			This is the activity input data. 
	 * @param processingContext
	 *			XML processing context.
	 * @param data
	 *			Business object.
	 * @return An XML Element which adheres to the output schema of the activity or may return <code>null</code> if the activity does not require an output.
	 */
	protected <A> N evalOutput(N inputData, ProcessingContext<N> processingContext, Object data) throws Exception {
		ValuesNotFound valuesNotFound = new ValuesNotFound();
	
		
		// begin-custom-code
		String[] list = (String[]) data;
		for(int i = 0; i< list.length; i++ ){
			valuesNotFound.getValue().add(list[i]);
			activityLogger.debug("EVAL " + i + " List: " + list[i]);

		}
		activityLogger.debug("EVAL OUT" + valuesNotFound.toString());
		// end-custom-code
        		
	
		
		N outputNode = PaletteUtil.parseObjtoN(ValuesNotFound.class, valuesNotFound, processingContext, activityContext.getActivityOutputType().getTargetNamespace(), "ValuesNotFound");
	    return outputNode;
	}
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method to get the root element of output.
	 * @param processingContext
	 *				XML processing context.
	 * @return An XML Element.
	 */		
	protected N getOutputRootElement(ProcessingContext<N> processingContext) {
        final FragmentBuilder<N> builder = processingContext.newFragmentBuilder();

        Model<N> model = processingContext.getModel();
        builder.startDocument(null, "xml");
		try {
			builder.startElement(activityContext.getActivityOutputType().getTargetNamespace(), "ValuesNotFound", "ns0");
			builder.endElement();
		} finally {
			builder.endDocument();
		}
        N output = builder.getNode();
        N resultList = model.getFirstChild(output);
        // begin-custom-code
        // add your own business code here
        // end-custom-code
        return resultList;
    }
    
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
     * Gets the String type parameter from the input by name.
     * @param inputData
     *			This is the activity input data.
     * @param processingContext
     *			XML processing context.
     * @param parameterName
     *			The parameter name which you want to get the value.
     * @return parameter value.	
     */
 	public String getInputParameterStringValueByName(final N inputData, final ProcessingContext<N> processingContext, final String parameterName) {
         Model<N> model = processingContext.getMutableContext().getModel();
     	activityLogger.debug(RuntimeMessageBundle.DEBUG_SEPARATOR + "START getInput");
     	activityLogger.debug(" PARAM NAME " + parameterName); 
     	activityLogger.debug(" MODEL " + model.toString() + " PROC CONTEXT " + processingContext.toString()); 
         
         N parameter = model.getFirstChildElementByName(inputData, null, parameterName);

         activityLogger.debug("NAMESPACE IN : " + activityContext.getActivityInputType().getTargetNamespace() + " NAMESPACE OUT : " + activityContext.getActivityOutputType().getTargetNamespace());
         
         if (parameter == null) {
        	 activityLogger.debug(RuntimeMessageBundle.DEBUG_SEPARATOR + "END getInput");
        	 String out = model.getStringValue(inputData);
        	  if (out == null) {
        		 return "";
        	  }
        	  return out;
         }
      	activityLogger.debug(" GET PARAM: " + parameterName + " GOT: " +parameter.toString());
      	String out = model.getStringValue(parameter);
      	activityLogger.debug(" OUT : " + out );
      	activityLogger.debug(RuntimeMessageBundle.DEBUG_SEPARATOR + "END getInput");
         return out;
     }
     
  	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
     * Gets the String type attribute from the input by name.
     * @param inputData
     *			This is the activity input data.
     * @param processingContext
     *			XML processing context.
     * @param attributeName
     *			The attribute name which you want to get the value.
     * @return attribute value.	
     */
 	public String getInputAttributeStringValueByName(final N inputData, final ProcessingContext<N> processingContext, final String attributeName) {
     	activityLogger.debug(RuntimeMessageBundle.DEBUG_SEPARATOR + "START getAttribute");
     	activityLogger.debug("PROCCONTEXT getAttribute " + processingContext.toString());
 		Model<N> model = processingContext.getMutableContext().getModel();
         
         N attribute = model.getAttribute(inputData, activityContext.getActivityInputType().getTargetNamespace(), attributeName);
         if (attribute == null) {
        	 
          	activityLogger.debug("NAMES: " + model.getAttributeNames(inputData, false) + " VALUES: " + model.getAttributeStringValue(inputData, activityContext.getActivityInputType().getTargetNamespace(), attributeName));

        	 activityLogger.debug(RuntimeMessageBundle.DEBUG_SEPARATOR + "END getAttribute");
             return "";
         }
    	 activityLogger.debug(RuntimeMessageBundle.DEBUG_SEPARATOR + "END getAttribute");

         return model.getStringValue(attribute);
     }
     
 	/**
 	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
     * Gets the Boolean type parameter from the input by name.
     * @param inputData
     *			This is the activity input data.
     * @param processingContext
     *			XML processing context.
     * @param parameterName
     *			The parameter name which you want to get the value.
     * @return parameter value.	
     */
 	public boolean getInputParameterBooleanValueByName(final N inputData, final ProcessingContext<N> processingContext, final String parameterName) {
 		Model<N> model = processingContext.getMutableContext().getModel();
 		N parameter = model.getFirstChildElementByName(inputData, null, parameterName);
 		if (parameter == null) {
 			return false;
 		}
 		String valueStr = model.getStringValue(parameter);
 		return Boolean.parseBoolean(valueStr);
 	}
 	
 	
 	
}
