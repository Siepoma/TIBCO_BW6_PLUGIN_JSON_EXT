
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
 *         &lt;element name="JsonCleaned" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "jsonCleaned"
})
@XmlRootElement(name = "Output", namespace = "http://www.tibco.com/JsonExtension/RemoveNull")
public class Output {

    @XmlElement(name = "JsonCleaned", required = true)
    protected String jsonCleaned;

    /**
     * Recupera il valore della proprietà jsonCleaned.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsonCleaned() {
        return jsonCleaned;
    }

    /**
     * Imposta il valore della proprietà jsonCleaned.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsonCleaned(String value) {
        this.jsonCleaned = value;
    }

}
