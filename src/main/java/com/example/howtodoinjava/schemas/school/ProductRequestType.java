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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="klantreferentie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}Tekst50"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductRequestType", namespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", propOrder = {
    "klantreferentie"
})
@XmlSeeAlso({
    KvKNummerRequestType.class,
    KvKNummerOfRSINummerRequestType.class,
    VestigingsnummerRequestType.class,
    VestigingOfRsinOfKvKNummerRequestType.class
})
public class ProductRequestType {

    @XmlElement(required = true)
    protected String klantreferentie;

    /**
     * Gets the value of the klantreferentie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlantreferentie() {
        return klantreferentie;
    }

    /**
     * Sets the value of the klantreferentie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlantreferentie(String value) {
        this.klantreferentie = value;
    }

}
