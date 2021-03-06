//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.06 at 10:42:47 PM BST 
//


package com.example.howtodoinjava.schemas.school;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatieRegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatieRegistratieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relatieRegistratie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RegistratieType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatieRegistratieType", propOrder = {
    "relatieRegistratie"
})
@XmlSeeAlso({
    PersoonRelatieRegistratieType.class,
    MaatschappelijkeActiviteitRelatieRegistratieType.class,
    OndernemingRelatieRegistratieType.class,
    VestigingenRelatieRegistratieType.class,
    CommercieleVestigingRelatieRegistratieType.class,
    NietCommercieleVestigingRelatieRegistratieType.class,
    HandelsnaamRelatieRegistratieType.class,
    AansprakelijkheidRelatieRegistratieType.class
})
public abstract class RelatieRegistratieType
    extends RelatieType
{

    protected RegistratieType relatieRegistratie;

    /**
     * Gets the value of the relatieRegistratie property.
     * 
     * @return
     *     possible object is
     *     {@link RegistratieType }
     *     
     */
    public RegistratieType getRelatieRegistratie() {
        return relatieRegistratie;
    }

    /**
     * Sets the value of the relatieRegistratie property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistratieType }
     *     
     */
    public void setRelatieRegistratie(RegistratieType value) {
        this.relatieRegistratie = value;
    }

}
