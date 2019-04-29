
package com.siepoma.bw.palette.jsonextension.runtime.pojo.validatejson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CheckJson_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CheckJson_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.atos.net/sipoma/nterface}JsonString"/>
 *         &lt;element ref="{http://www.atos.net/sipoma/nterface}PathToJsonValidator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckJson_Type", namespace = "http://www.atos.net/sipoma/nterface", propOrder = {
    "jsonString",
    "pathToJsonValidator"
})
public class CheckJsonType {

    @XmlElement(name = "JsonString", namespace = "http://www.atos.net/sipoma/nterface", required = true)
    protected String jsonString;
    @XmlElement(name = "PathToJsonValidator", namespace = "http://www.atos.net/sipoma/nterface", required = true)
    protected String pathToJsonValidator;

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

    /**
     * Recupera il valore della proprietà pathToJsonValidator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathToJsonValidator() {
        return pathToJsonValidator;
    }

    /**
     * Imposta il valore della proprietà pathToJsonValidator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathToJsonValidator(String value) {
        this.pathToJsonValidator = value;
    }

}
