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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaatschappelijkeActiviteitRelatieRegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaatschappelijkeActiviteitRelatieRegistratieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieRegistratieType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maatschappelijkeActiviteit" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MaatschappelijkeActiviteitType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaatschappelijkeActiviteitRelatieRegistratieType", propOrder = {
    "maatschappelijkeActiviteit"
})
@XmlSeeAlso({
    VoortzettingRelatieRegistratieType.class
})
public class MaatschappelijkeActiviteitRelatieRegistratieType
    extends RelatieRegistratieType
{

    @XmlElement(required = true)
    protected MaatschappelijkeActiviteitType maatschappelijkeActiviteit;

    /**
     * Gets the value of the maatschappelijkeActiviteit property.
     * 
     * @return
     *     possible object is
     *     {@link MaatschappelijkeActiviteitType }
     *     
     */
    public MaatschappelijkeActiviteitType getMaatschappelijkeActiviteit() {
        return maatschappelijkeActiviteit;
    }

    /**
     * Sets the value of the maatschappelijkeActiviteit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaatschappelijkeActiviteitType }
     *     
     */
    public void setMaatschappelijkeActiviteit(MaatschappelijkeActiviteitType value) {
        this.maatschappelijkeActiviteit = value;
    }

}
