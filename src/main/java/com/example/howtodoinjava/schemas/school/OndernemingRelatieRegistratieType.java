//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.06 at 10:42:47 PM BST 
//


package com.example.howtodoinjava.schemas.school;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OndernemingRelatieRegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OndernemingRelatieRegistratieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieRegistratieType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="onderneming" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}OndernemingType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OndernemingRelatieRegistratieType", propOrder = {
    "onderneming"
})
public class OndernemingRelatieRegistratieType
    extends RelatieRegistratieType
{

    @XmlElement(required = true)
    protected OndernemingType onderneming;

    /**
     * Gets the value of the onderneming property.
     * 
     * @return
     *     possible object is
     *     {@link OndernemingType }
     *     
     */
    public OndernemingType getOnderneming() {
        return onderneming;
    }

    /**
     * Sets the value of the onderneming property.
     * 
     * @param value
     *     allowed object is
     *     {@link OndernemingType }
     *     
     */
    public void setOnderneming(OndernemingType value) {
        this.onderneming = value;
    }

}
