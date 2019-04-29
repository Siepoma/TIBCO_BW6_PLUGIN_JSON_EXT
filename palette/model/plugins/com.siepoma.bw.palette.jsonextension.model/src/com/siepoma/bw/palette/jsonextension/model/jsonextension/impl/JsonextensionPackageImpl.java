/**
 */
package com.siepoma.bw.palette.jsonextension.model.jsonextension.impl;

import com.siepoma.bw.palette.jsonextension.model.jsonextension.JsonextensionFactory;
import com.siepoma.bw.palette.jsonextension.model.jsonextension.JsonextensionPackage;
import com.siepoma.bw.palette.jsonextension.model.jsonextension.RemoveNull;
import com.siepoma.bw.palette.jsonextension.model.jsonextension.ValidateJSON;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonextensionPackageImpl extends EPackageImpl implements JsonextensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validateJSONEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeNullEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.siepoma.bw.palette.jsonextension.model.jsonextension.JsonextensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JsonextensionPackageImpl() {
		super(eNS_URI, JsonextensionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JsonextensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JsonextensionPackage init() {
		if (isInited) return (JsonextensionPackage)EPackage.Registry.INSTANCE.getEPackage(JsonextensionPackage.eNS_URI);

		// Obtain or create and register package
		JsonextensionPackageImpl theJsonextensionPackage = (JsonextensionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JsonextensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JsonextensionPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJsonextensionPackage.createPackageContents();

		// Initialize created meta-data
		theJsonextensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJsonextensionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JsonextensionPackage.eNS_URI, theJsonextensionPackage);
		return theJsonextensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidateJSON() {
		return validateJSONEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidateJSON_PathToJSONRef() {
		return (EAttribute)validateJSONEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveNull() {
		return removeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonextensionFactory getJsonextensionFactory() {
		return (JsonextensionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		validateJSONEClass = createEClass(VALIDATE_JSON);
		createEAttribute(validateJSONEClass, VALIDATE_JSON__PATH_TO_JSON_REF);

		removeNullEClass = createEClass(REMOVE_NULL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(validateJSONEClass, ValidateJSON.class, "ValidateJSON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidateJSON_PathToJSONRef(), ecorePackage.getEString(), "PathToJSONRef", null, 0, 1, ValidateJSON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeNullEClass, RemoveNull.class, "RemoveNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// dkactivityconfig
		createDkactivityconfigAnnotations();
		// dkcontrolconfig
		createDkcontrolconfigAnnotations();
	}

	/**
	 * Initializes the annotations for <b>dkactivityconfig</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDkactivityconfigAnnotations() {
		String source = "dkactivityconfig";	
		addAnnotation
		  (validateJSONEClass, 
		   source, 
		   new String[] {
			 "activitytype", "Synchronous",
			 "schemaType", "XSD/WSDL",
			 "schemaFile", "Interface.xsd",
			 "inputelementname", "JsonString",
			 "outputelementname", "ValuesNotFound",
			 "faultelementname", "",
			 "helpdocuuid", "6326c979-f66d-4d9e-aba8-e16f59f138d0"
		   });	
		addAnnotation
		  (removeNullEClass, 
		   source, 
		   new String[] {
			 "activitytype", "Synchronous",
			 "schemaType", "XSD Editor",
			 "schemaFile", "RemoveNullSchema.xsd",
			 "inputelementname", "Input",
			 "outputelementname", "Output",
			 "faultelementname", "",
			 "helpdocuuid", "a0c38f87-578a-4b88-a4e3-427d555cdad9"
		   });
	}

	/**
	 * Initializes the annotations for <b>dkcontrolconfig</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDkcontrolconfigAnnotations() {
		String source = "dkcontrolconfig";	
		addAnnotation
		  (getValidateJSON_PathToJSONRef(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "PathToJSONRef",
			 "isModelProperty", "true",
			 "control", "TextBox",
			 "value", "null",
			 "tooltip", "Tooltip"
		   });
	}

} //JsonextensionPackageImpl
