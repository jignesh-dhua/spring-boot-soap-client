//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.06 at 10:42:47 PM BST 
//


package com.example.howtodoinjava.schemas.school;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeponeringJaarstukType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeponeringJaarstukType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boekjaar" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}JaarType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeponeringJaarstukType", propOrder = {
    "boekjaar"
})
@XmlSeeAlso({
    DeponeringJaarstukHalfjaarKwartaalcijfersType.class,
    DeponeringJaarstukInstemmingType.class,
    DeponeringJaarstukJaarrekeningOngewijzigdVastgesteldType.class,
    DeponeringJaarstukJaarrekeningType.class,
    DeponeringJaarstukOntheffingType.class,
    DeponeringOverigJaarstukType.class
})
public abstract class DeponeringJaarstukType
    extends DeponeringType
{

    protected String boekjaar;

    /**
     * Gets the value of the boekjaar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoekjaar() {
        return boekjaar;
    }

    /**
     * Sets the value of the boekjaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoekjaar(String value) {
        this.boekjaar = value;
    }

}
