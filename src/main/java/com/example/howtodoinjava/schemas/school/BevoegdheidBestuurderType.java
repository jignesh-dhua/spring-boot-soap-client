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
 * <p>Java class for BevoegdheidBestuurderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BevoegdheidBestuurderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="soort" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *         &lt;element name="isBevoegdMetAnderePersonen" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BevoegdheidBestuurderType", propOrder = {
    "soort",
    "isBevoegdMetAnderePersonen"
})
public class BevoegdheidBestuurderType
    extends BasisType
{

    protected EnumeratieType soort;
    protected EnumeratieType isBevoegdMetAnderePersonen;

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

    /**
     * Gets the value of the isBevoegdMetAnderePersonen property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getIsBevoegdMetAnderePersonen() {
        return isBevoegdMetAnderePersonen;
    }

    /**
     * Sets the value of the isBevoegdMetAnderePersonen property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setIsBevoegdMetAnderePersonen(EnumeratieType value) {
        this.isBevoegdMetAnderePersonen = value;
    }

}
