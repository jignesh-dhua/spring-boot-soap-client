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
 * <p>Java class for ActiviteitenCommercieleVestigingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActiviteitenCommercieleVestigingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}ActiviteitenType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exporteert" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *         &lt;element name="importeert" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiviteitenCommercieleVestigingType", propOrder = {
    "exporteert",
    "importeert"
})
public class ActiviteitenCommercieleVestigingType
    extends ActiviteitenType
{

    protected EnumeratieType exporteert;
    protected EnumeratieType importeert;

    /**
     * Gets the value of the exporteert property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getExporteert() {
        return exporteert;
    }

    /**
     * Sets the value of the exporteert property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setExporteert(EnumeratieType value) {
        this.exporteert = value;
    }

    /**
     * Gets the value of the importeert property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getImporteert() {
        return importeert;
    }

    /**
     * Sets the value of the importeert property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setImporteert(EnumeratieType value) {
        this.importeert = value;
    }

}
