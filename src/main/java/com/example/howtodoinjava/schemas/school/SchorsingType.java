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
 * <p>Java class for SchorsingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchorsingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="uitspraakAanvang" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RechterlijkeUitspraakType"/&gt;
 *           &lt;element name="uitspraakEinde" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RechterlijkeUitspraakType"/&gt;
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
@XmlType(name = "SchorsingType", propOrder = {
    "uitspraakAanvang",
    "uitspraakEinde"
})
public class SchorsingType
    extends BasisType
{

    protected RechterlijkeUitspraakType uitspraakAanvang;
    protected RechterlijkeUitspraakType uitspraakEinde;

    /**
     * Gets the value of the uitspraakAanvang property.
     * 
     * @return
     *     possible object is
     *     {@link RechterlijkeUitspraakType }
     *     
     */
    public RechterlijkeUitspraakType getUitspraakAanvang() {
        return uitspraakAanvang;
    }

    /**
     * Sets the value of the uitspraakAanvang property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechterlijkeUitspraakType }
     *     
     */
    public void setUitspraakAanvang(RechterlijkeUitspraakType value) {
        this.uitspraakAanvang = value;
    }

    /**
     * Gets the value of the uitspraakEinde property.
     * 
     * @return
     *     possible object is
     *     {@link RechterlijkeUitspraakType }
     *     
     */
    public RechterlijkeUitspraakType getUitspraakEinde() {
        return uitspraakEinde;
    }

    /**
     * Sets the value of the uitspraakEinde property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechterlijkeUitspraakType }
     *     
     */
    public void setUitspraakEinde(RechterlijkeUitspraakType value) {
        this.uitspraakEinde = value;
    }

}