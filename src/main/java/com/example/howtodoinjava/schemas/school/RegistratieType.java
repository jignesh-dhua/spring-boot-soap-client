//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.06 at 11:14:48 AM BST 
//


package com.example.howtodoinjava.schemas.school;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Generiek registratie type met voor elke type geledende registratie gegevens
 *             
 * 
 * <p>Java class for RegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistratieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datumAanvang" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/&gt;
 *         &lt;element name="datumEinde" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="soortMutatie" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="registratieTijdstip" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}TijdstipType" /&gt;
 *       &lt;attribute name="registratieTijdstipNoValue" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NoValue" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistratieType", propOrder = {
    "datumAanvang",
    "datumEinde"
})
public class RegistratieType {

    protected String datumAanvang;
    protected String datumEinde;
    @XmlAttribute(name = "soortMutatie")
    protected String soortMutatie;
    @XmlAttribute(name = "registratieTijdstip")
    protected String registratieTijdstip;
    @XmlAttribute(name = "registratieTijdstipNoValue")
    protected NoValue registratieTijdstipNoValue;

    /**
     * Gets the value of the datumAanvang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumAanvang() {
        return datumAanvang;
    }

    /**
     * Sets the value of the datumAanvang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumAanvang(String value) {
        this.datumAanvang = value;
    }

    /**
     * Gets the value of the datumEinde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumEinde() {
        return datumEinde;
    }

    /**
     * Sets the value of the datumEinde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumEinde(String value) {
        this.datumEinde = value;
    }

    /**
     * Gets the value of the soortMutatie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoortMutatie() {
        return soortMutatie;
    }

    /**
     * Sets the value of the soortMutatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoortMutatie(String value) {
        this.soortMutatie = value;
    }

    /**
     * Gets the value of the registratieTijdstip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistratieTijdstip() {
        return registratieTijdstip;
    }

    /**
     * Sets the value of the registratieTijdstip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistratieTijdstip(String value) {
        this.registratieTijdstip = value;
    }

    /**
     * Gets the value of the registratieTijdstipNoValue property.
     * 
     * @return
     *     possible object is
     *     {@link NoValue }
     *     
     */
    public NoValue getRegistratieTijdstipNoValue() {
        return registratieTijdstipNoValue;
    }

    /**
     * Sets the value of the registratieTijdstipNoValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoValue }
     *     
     */
    public void setRegistratieTijdstipNoValue(NoValue value) {
        this.registratieTijdstipNoValue = value;
    }

}