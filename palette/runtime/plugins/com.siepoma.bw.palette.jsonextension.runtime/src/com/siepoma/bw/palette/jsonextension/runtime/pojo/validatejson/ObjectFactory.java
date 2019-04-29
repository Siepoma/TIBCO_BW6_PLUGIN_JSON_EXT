
package com.siepoma.bw.palette.jsonextension.runtime.pojo.validatejson;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siepoma.bw.palette.jsonextension.runtime.pojo.validatejson package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _JsonString_QNAME = new QName("http://www.atos.net/sipoma/nterface", "JsonString");
    private final static QName _CheckJson_QNAME = new QName("http://www.atos.net/sipoma/nterface", "CheckJson");
    private final static QName _PathToJsonValidator_QNAME = new QName("http://www.atos.net/sipoma/nterface", "PathToJsonValidator");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siepoma.bw.palette.jsonextension.runtime.pojo.validatejson
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValuesNotFound }
     * 
     */
    public ValuesNotFound createValuesNotFound() {
        return new ValuesNotFound();
    }

    /**
     * Create an instance of {@link CheckJsonType }
     * 
     */
    public CheckJsonType createCheckJsonType() {
        return new CheckJsonType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.atos.net/sipoma/nterface", name = "JsonString")
    public JAXBElement<String> createJsonString(String value) {
        return new JAXBElement<String>(_JsonString_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckJsonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.atos.net/sipoma/nterface", name = "CheckJson")
    public JAXBElement<CheckJsonType> createCheckJson(CheckJsonType value) {
        return new JAXBElement<CheckJsonType>(_CheckJson_QNAME, CheckJsonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.atos.net/sipoma/nterface", name = "PathToJsonValidator")
    public JAXBElement<String> createPathToJsonValidator(String value) {
        return new JAXBElement<String>(_PathToJsonValidator_QNAME, String.class, null, value);
    }

}
