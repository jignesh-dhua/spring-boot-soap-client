//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.06 at 11:14:48 AM BST 
//


package com.example.howtodoinjava.schemas.school;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetExtraElementenMogenlijkheidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetExtraElementenMogenlijkheidType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extraElementen" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}ExtraElementenType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetExtraElementenMogenlijkheidType", propOrder = {
    "extraElementen"
})
@XmlSeeAlso({
    BinnenlandsAdresType.class,
    DeponeringenType.class,
    ActiviteitenType.class,
    TelefoonnummerType.class,
    BuitenlandsAdresType.class,
    BeperkingInHandelingType.class,
    BeperkteVolmachtType.class,
    CommunicatienummerType.class,
    FusieSplitsingVoorstelType.class,
    RechterlijkeUitspraakType.class,
    MonistischeBestuurderType.class,
    RelatieType.class,
    DeponeringType.class,
    BerichtenboxType.class,
    BasisType.class
})
public abstract class MetExtraElementenMogenlijkheidType {

    protected ExtraElementenType extraElementen;

    /**
     * Gets the value of the extraElementen property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraElementenType }
     *     
     */
    public ExtraElementenType getExtraElementen() {
        return extraElementen;
    }

    /**
     * Sets the value of the extraElementen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraElementenType }
     *     
     */
    public void setExtraElementen(ExtraElementenType value) {
        this.extraElementen = value;
    }

}
