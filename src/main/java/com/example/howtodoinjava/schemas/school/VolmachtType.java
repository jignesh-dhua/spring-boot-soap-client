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
 * <p>Java class for VolmachtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolmachtType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeVolmacht" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType"/&gt;
 *         &lt;element name="isStatutair" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *         &lt;element name="beperkteVolmacht" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BeperkteVolmachtType" minOccurs="0"/&gt;
 *         &lt;element name="heeftBetrekkingOp" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}VestigingenRelatieType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolmachtType", propOrder = {
    "typeVolmacht",
    "isStatutair",
    "beperkteVolmacht",
    "heeftBetrekkingOp"
})
public class VolmachtType
    extends BasisType
{

    @XmlElement(required = true)
    protected EnumeratieType typeVolmacht;
    protected EnumeratieType isStatutair;
    protected BeperkteVolmachtType beperkteVolmacht;
    protected VestigingenRelatieType heeftBetrekkingOp;

    /**
     * Gets the value of the typeVolmacht property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getTypeVolmacht() {
        return typeVolmacht;
    }

    /**
     * Sets the value of the typeVolmacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setTypeVolmacht(EnumeratieType value) {
        this.typeVolmacht = value;
    }

    /**
     * Gets the value of the isStatutair property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getIsStatutair() {
        return isStatutair;
    }

    /**
     * Sets the value of the isStatutair property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setIsStatutair(EnumeratieType value) {
        this.isStatutair = value;
    }

    /**
     * Gets the value of the beperkteVolmacht property.
     * 
     * @return
     *     possible object is
     *     {@link BeperkteVolmachtType }
     *     
     */
    public BeperkteVolmachtType getBeperkteVolmacht() {
        return beperkteVolmacht;
    }

    /**
     * Sets the value of the beperkteVolmacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeperkteVolmachtType }
     *     
     */
    public void setBeperkteVolmacht(BeperkteVolmachtType value) {
        this.beperkteVolmacht = value;
    }

    /**
     * Gets the value of the heeftBetrekkingOp property.
     * 
     * @return
     *     possible object is
     *     {@link VestigingenRelatieType }
     *     
     */
    public VestigingenRelatieType getHeeftBetrekkingOp() {
        return heeftBetrekkingOp;
    }

    /**
     * Sets the value of the heeftBetrekkingOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VestigingenRelatieType }
     *     
     */
    public void setHeeftBetrekkingOp(VestigingenRelatieType value) {
        this.heeftBetrekkingOp = value;
    }

}
