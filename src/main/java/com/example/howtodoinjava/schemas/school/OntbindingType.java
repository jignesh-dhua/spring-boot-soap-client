//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.06 at 11:14:48 AM BST 
//


package com.example.howtodoinjava.schemas.school;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OntbindingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OntbindingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aanleiding" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *         &lt;element name="liquidatie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}LiquidatieType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OntbindingType", propOrder = {
    "aanleiding",
    "liquidatie"
})
public class OntbindingType
    extends BasisType
{

    protected EnumeratieType aanleiding;
    protected LiquidatieType liquidatie;

    /**
     * Gets the value of the aanleiding property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getAanleiding() {
        return aanleiding;
    }

    /**
     * Sets the value of the aanleiding property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setAanleiding(EnumeratieType value) {
        this.aanleiding = value;
    }

    /**
     * Gets the value of the liquidatie property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidatieType }
     *     
     */
    public LiquidatieType getLiquidatie() {
        return liquidatie;
    }

    /**
     * Sets the value of the liquidatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidatieType }
     *     
     */
    public void setLiquidatie(LiquidatieType value) {
        this.liquidatie = value;
    }

}