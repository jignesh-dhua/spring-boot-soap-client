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
 * <p>Java class for DuurType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DuurType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="eindeDuur" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/&gt;
 *         &lt;element name="heeftOnbepaaldeDuur" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuurType", propOrder = {
    "eindeDuur",
    "heeftOnbepaaldeDuur"
})
public class DuurType
    extends BasisType
{

    protected String eindeDuur;
    protected EnumeratieType heeftOnbepaaldeDuur;

    /**
     * Gets the value of the eindeDuur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEindeDuur() {
        return eindeDuur;
    }

    /**
     * Sets the value of the eindeDuur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEindeDuur(String value) {
        this.eindeDuur = value;
    }

    /**
     * Gets the value of the heeftOnbepaaldeDuur property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getHeeftOnbepaaldeDuur() {
        return heeftOnbepaaldeDuur;
    }

    /**
     * Sets the value of the heeftOnbepaaldeDuur property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setHeeftOnbepaaldeDuur(EnumeratieType value) {
        this.heeftOnbepaaldeDuur = value;
    }

}
