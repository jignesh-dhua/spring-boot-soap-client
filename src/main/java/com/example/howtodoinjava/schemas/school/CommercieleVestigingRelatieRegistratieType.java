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
 * <p>Java class for CommercieleVestigingRelatieRegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercieleVestigingRelatieRegistratieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieRegistratieType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commercieleVestiging" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}CommercieleVestigingType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercieleVestigingRelatieRegistratieType", propOrder = {
    "commercieleVestiging"
})
public class CommercieleVestigingRelatieRegistratieType
    extends RelatieRegistratieType
{

    @XmlElement(required = true)
    protected CommercieleVestigingType commercieleVestiging;

    /**
     * Gets the value of the commercieleVestiging property.
     * 
     * @return
     *     possible object is
     *     {@link CommercieleVestigingType }
     *     
     */
    public CommercieleVestigingType getCommercieleVestiging() {
        return commercieleVestiging;
    }

    /**
     * Sets the value of the commercieleVestiging property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercieleVestigingType }
     *     
     */
    public void setCommercieleVestiging(CommercieleVestigingType value) {
        this.commercieleVestiging = value;
    }

}
