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
 * <p>Java class for CommunicatienummerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicatienummerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="toegangscode" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}Alfanumeriek5"/&gt;
 *         &lt;element name="nummer" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}Alfanumeriek15"/&gt;
 *         &lt;element name="soort" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicatienummerType", propOrder = {
    "toegangscode",
    "nummer",
    "soort"
})
public class CommunicatienummerType
    extends MetExtraElementenMogenlijkheidType
{

    @XmlElement(required = true)
    protected String toegangscode;
    @XmlElement(required = true)
    protected String nummer;
    @XmlElement(required = true)
    protected EnumeratieType soort;

    /**
     * Gets the value of the toegangscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToegangscode() {
        return toegangscode;
    }

    /**
     * Sets the value of the toegangscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToegangscode(String value) {
        this.toegangscode = value;
    }

    /**
     * Gets the value of the nummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Gets the value of the soort property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getSoort() {
        return soort;
    }

    /**
     * Sets the value of the soort property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setSoort(EnumeratieType value) {
        this.soort = value;
    }

}
