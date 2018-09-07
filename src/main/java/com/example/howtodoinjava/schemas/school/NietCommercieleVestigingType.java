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
 * <p>Java class for NietCommercieleVestigingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NietCommercieleVestigingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}VestigingType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="naamgeving" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NaamgevingType" minOccurs="0"/&gt;
 *         &lt;element name="activiteiten" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}ActiviteitenType" minOccurs="0"/&gt;
 *         &lt;element name="isEenUitoefeningVan" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MaatschappelijkeActiviteitRelatieType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NietCommercieleVestigingType", propOrder = {
    "naamgeving",
    "activiteiten",
    "isEenUitoefeningVan"
})
public class NietCommercieleVestigingType
    extends VestigingType
{

    protected NaamgevingType naamgeving;
    protected ActiviteitenType activiteiten;
    protected MaatschappelijkeActiviteitRelatieType isEenUitoefeningVan;

    /**
     * Gets the value of the naamgeving property.
     * 
     * @return
     *     possible object is
     *     {@link NaamgevingType }
     *     
     */
    public NaamgevingType getNaamgeving() {
        return naamgeving;
    }

    /**
     * Sets the value of the naamgeving property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaamgevingType }
     *     
     */
    public void setNaamgeving(NaamgevingType value) {
        this.naamgeving = value;
    }

    /**
     * Gets the value of the activiteiten property.
     * 
     * @return
     *     possible object is
     *     {@link ActiviteitenType }
     *     
     */
    public ActiviteitenType getActiviteiten() {
        return activiteiten;
    }

    /**
     * Sets the value of the activiteiten property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiviteitenType }
     *     
     */
    public void setActiviteiten(ActiviteitenType value) {
        this.activiteiten = value;
    }

    /**
     * Gets the value of the isEenUitoefeningVan property.
     * 
     * @return
     *     possible object is
     *     {@link MaatschappelijkeActiviteitRelatieType }
     *     
     */
    public MaatschappelijkeActiviteitRelatieType getIsEenUitoefeningVan() {
        return isEenUitoefeningVan;
    }

    /**
     * Sets the value of the isEenUitoefeningVan property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaatschappelijkeActiviteitRelatieType }
     *     
     */
    public void setIsEenUitoefeningVan(MaatschappelijkeActiviteitRelatieType value) {
        this.isEenUitoefeningVan = value;
    }

}
