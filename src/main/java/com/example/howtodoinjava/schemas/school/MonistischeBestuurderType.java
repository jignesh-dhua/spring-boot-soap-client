//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.06 at 10:42:47 PM BST 
//


package com.example.howtodoinjava.schemas.school;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonistischeBestuurderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonistischeBestuurderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registratie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RegistratieType" minOccurs="0"/&gt;
 *         &lt;element name="rol" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonistischeBestuurderType", propOrder = {
    "registratie",
    "rol"
})
public class MonistischeBestuurderType
    extends MetExtraElementenMogenlijkheidType
{

    protected RegistratieType registratie;
    protected EnumeratieType rol;

    /**
     * Gets the value of the registratie property.
     * 
     * @return
     *     possible object is
     *     {@link RegistratieType }
     *     
     */
    public RegistratieType getRegistratie() {
        return registratie;
    }

    /**
     * Sets the value of the registratie property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistratieType }
     *     
     */
    public void setRegistratie(RegistratieType value) {
        this.registratie = value;
    }

    /**
     * Gets the value of the rol property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getRol() {
        return rol;
    }

    /**
     * Sets the value of the rol property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setRol(EnumeratieType value) {
        this.rol = value;
    }

}
