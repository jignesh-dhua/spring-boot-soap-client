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
 * <p>Java class for FunctievervullingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctievervullingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="functietitel" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}FunctietitelType" minOccurs="0"/&gt;
 *         &lt;element name="schorsing" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}SchorsingType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="door" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}PersoonRelatieType"/&gt;
 *           &lt;element name="voor" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}PersoonRelatieType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctievervullingType", propOrder = {
    "functietitel",
    "schorsing",
    "door",
    "voor"
})
@XmlSeeAlso({
    AansprakelijkeType.class,
    BestuursfunctieType.class,
    FunctionarisBijzondereRechtstoestandType.class,
    GemachtigdeType.class,
    OverigeFunctionarisType.class,
    PubliekrechtelijkeFunctionarisType.class
})
public abstract class FunctievervullingType
    extends BasisType
{

    protected FunctietitelType functietitel;
    protected SchorsingType schorsing;
    protected PersoonRelatieType door;
    protected PersoonRelatieType voor;

    /**
     * Gets the value of the functietitel property.
     * 
     * @return
     *     possible object is
     *     {@link FunctietitelType }
     *     
     */
    public FunctietitelType getFunctietitel() {
        return functietitel;
    }

    /**
     * Sets the value of the functietitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctietitelType }
     *     
     */
    public void setFunctietitel(FunctietitelType value) {
        this.functietitel = value;
    }

    /**
     * Gets the value of the schorsing property.
     * 
     * @return
     *     possible object is
     *     {@link SchorsingType }
     *     
     */
    public SchorsingType getSchorsing() {
        return schorsing;
    }

    /**
     * Sets the value of the schorsing property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchorsingType }
     *     
     */
    public void setSchorsing(SchorsingType value) {
        this.schorsing = value;
    }

    /**
     * Gets the value of the door property.
     * 
     * @return
     *     possible object is
     *     {@link PersoonRelatieType }
     *     
     */
    public PersoonRelatieType getDoor() {
        return door;
    }

    /**
     * Sets the value of the door property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersoonRelatieType }
     *     
     */
    public void setDoor(PersoonRelatieType value) {
        this.door = value;
    }

    /**
     * Gets the value of the voor property.
     * 
     * @return
     *     possible object is
     *     {@link PersoonRelatieType }
     *     
     */
    public PersoonRelatieType getVoor() {
        return voor;
    }

    /**
     * Sets the value of the voor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersoonRelatieType }
     *     
     */
    public void setVoor(PersoonRelatieType value) {
        this.voor = value;
    }

}
