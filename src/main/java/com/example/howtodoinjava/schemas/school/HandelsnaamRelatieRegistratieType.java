//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.06 at 11:14:48 AM BST 
//


package com.example.howtodoinjava.schemas.school;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandelsnaamRelatieRegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandelsnaamRelatieRegistratieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieRegistratieType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="handelsnaam" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}HandelsnaamType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandelsnaamRelatieRegistratieType", propOrder = {
    "handelsnaam"
})
public class HandelsnaamRelatieRegistratieType
    extends RelatieRegistratieType
{

    @XmlElement(required = true)
    protected HandelsnaamType handelsnaam;

    /**
     * Gets the value of the handelsnaam property.
     * 
     * @return
     *     possible object is
     *     {@link HandelsnaamType }
     *     
     */
    public HandelsnaamType getHandelsnaam() {
        return handelsnaam;
    }

    /**
     * Sets the value of the handelsnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandelsnaamType }
     *     
     */
    public void setHandelsnaam(HandelsnaamType value) {
        this.handelsnaam = value;
    }

}
