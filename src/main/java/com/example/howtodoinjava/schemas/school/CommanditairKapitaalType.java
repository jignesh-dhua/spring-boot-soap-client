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
 * <p>Java class for CommanditairKapitaalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommanditairKapitaalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bedrag" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}GeldType" minOccurs="0"/&gt;
 *         &lt;element name="soort" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommanditairKapitaalType", propOrder = {
    "bedrag",
    "soort"
})
public class CommanditairKapitaalType
    extends BasisType
{

    protected GeldType bedrag;
    protected EnumeratieType soort;

    /**
     * Gets the value of the bedrag property.
     * 
     * @return
     *     possible object is
     *     {@link GeldType }
     *     
     */
    public GeldType getBedrag() {
        return bedrag;
    }

    /**
     * Sets the value of the bedrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeldType }
     *     
     */
    public void setBedrag(GeldType value) {
        this.bedrag = value;
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
