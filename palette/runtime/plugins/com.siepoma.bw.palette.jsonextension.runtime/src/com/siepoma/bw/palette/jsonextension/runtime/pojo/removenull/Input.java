
package com.siepoma.bw.palette.jsonextension.runtime.pojo.removenull;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JsonString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "jsonString"
})
@XmlRootElement(name = "Input", namespace = "http://www.tibco.com/JsonExtension/RemoveNull")
public class Input {

    @XmlElement(name = "JsonString", required = true)
    protected String jsonString;

    /**
     * Recupera il valore della proprietà jsonString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsonString() {
        return jsonString;
    }

    /**
     * Imposta il valore della proprietà jsonString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsonString(String value) {
        this.jsonString = value;
    }

}
