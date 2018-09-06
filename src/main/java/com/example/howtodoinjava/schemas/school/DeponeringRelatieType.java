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
 * <p>Java class for DeponeringRelatieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeponeringRelatieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="aansprakelijkheidVerklaring" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringAansprakelijkheidVerklaringType"/&gt;
 *         &lt;element name="aanvullendeMededeling" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringAanvullendeMededelingType"/&gt;
 *         &lt;element name="bijzondereDeponering" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringBijzondereDeponeringType"/&gt;
 *         &lt;element name="aansprakelijkheidIntrekking" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringAansprakelijkheidIntrekkingType"/&gt;
 *         &lt;element name="jaarstukHalfjaarKwartaalcijfers" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringJaarstukHalfjaarKwartaalcijfersType"/&gt;
 *         &lt;element name="jaarstukInstemming" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringJaarstukInstemmingType"/&gt;
 *         &lt;element name="jaarstukJaarrekening" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringJaarstukJaarrekeningType"/&gt;
 *         &lt;element name="jaarstukJaarrekeningOngewijzigdVastgesteld" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringJaarstukJaarrekeningOngewijzigdVastgesteldType"/&gt;
 *         &lt;element name="jaarstukOntheffing" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringJaarstukOntheffingType"/&gt;
 *         &lt;element name="aanprakelijkheidOverblijvend" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringAansprakelijkheidOverblijvendType"/&gt;
 *         &lt;element name="overigJaarstuk" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringOverigJaarstukType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeponeringRelatieType", propOrder = {
    "aansprakelijkheidVerklaring",
    "aanvullendeMededeling",
    "bijzondereDeponering",
    "aansprakelijkheidIntrekking",
    "jaarstukHalfjaarKwartaalcijfers",
    "jaarstukInstemming",
    "jaarstukJaarrekening",
    "jaarstukJaarrekeningOngewijzigdVastgesteld",
    "jaarstukOntheffing",
    "aanprakelijkheidOverblijvend",
    "overigJaarstuk"
})
public class DeponeringRelatieType
    extends RelatieType
{

    protected DeponeringAansprakelijkheidVerklaringType aansprakelijkheidVerklaring;
    protected DeponeringAanvullendeMededelingType aanvullendeMededeling;
    protected DeponeringBijzondereDeponeringType bijzondereDeponering;
    protected DeponeringAansprakelijkheidIntrekkingType aansprakelijkheidIntrekking;
    protected DeponeringJaarstukHalfjaarKwartaalcijfersType jaarstukHalfjaarKwartaalcijfers;
    protected DeponeringJaarstukInstemmingType jaarstukInstemming;
    protected DeponeringJaarstukJaarrekeningType jaarstukJaarrekening;
    protected DeponeringJaarstukJaarrekeningOngewijzigdVastgesteldType jaarstukJaarrekeningOngewijzigdVastgesteld;
    protected DeponeringJaarstukOntheffingType jaarstukOntheffing;
    protected DeponeringAansprakelijkheidOverblijvendType aanprakelijkheidOverblijvend;
    protected DeponeringOverigJaarstukType overigJaarstuk;

    /**
     * Gets the value of the aansprakelijkheidVerklaring property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringAansprakelijkheidVerklaringType }
     *     
     */
    public DeponeringAansprakelijkheidVerklaringType getAansprakelijkheidVerklaring() {
        return aansprakelijkheidVerklaring;
    }

    /**
     * Sets the value of the aansprakelijkheidVerklaring property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringAansprakelijkheidVerklaringType }
     *     
     */
    public void setAansprakelijkheidVerklaring(DeponeringAansprakelijkheidVerklaringType value) {
        this.aansprakelijkheidVerklaring = value;
    }

    /**
     * Gets the value of the aanvullendeMededeling property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringAanvullendeMededelingType }
     *     
     */
    public DeponeringAanvullendeMededelingType getAanvullendeMededeling() {
        return aanvullendeMededeling;
    }

    /**
     * Sets the value of the aanvullendeMededeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringAanvullendeMededelingType }
     *     
     */
    public void setAanvullendeMededeling(DeponeringAanvullendeMededelingType value) {
        this.aanvullendeMededeling = value;
    }

    /**
     * Gets the value of the bijzondereDeponering property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringBijzondereDeponeringType }
     *     
     */
    public DeponeringBijzondereDeponeringType getBijzondereDeponering() {
        return bijzondereDeponering;
    }

    /**
     * Sets the value of the bijzondereDeponering property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringBijzondereDeponeringType }
     *     
     */
    public void setBijzondereDeponering(DeponeringBijzondereDeponeringType value) {
        this.bijzondereDeponering = value;
    }

    /**
     * Gets the value of the aansprakelijkheidIntrekking property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringAansprakelijkheidIntrekkingType }
     *     
     */
    public DeponeringAansprakelijkheidIntrekkingType getAansprakelijkheidIntrekking() {
        return aansprakelijkheidIntrekking;
    }

    /**
     * Sets the value of the aansprakelijkheidIntrekking property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringAansprakelijkheidIntrekkingType }
     *     
     */
    public void setAansprakelijkheidIntrekking(DeponeringAansprakelijkheidIntrekkingType value) {
        this.aansprakelijkheidIntrekking = value;
    }

    /**
     * Gets the value of the jaarstukHalfjaarKwartaalcijfers property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringJaarstukHalfjaarKwartaalcijfersType }
     *     
     */
    public DeponeringJaarstukHalfjaarKwartaalcijfersType getJaarstukHalfjaarKwartaalcijfers() {
        return jaarstukHalfjaarKwartaalcijfers;
    }

    /**
     * Sets the value of the jaarstukHalfjaarKwartaalcijfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringJaarstukHalfjaarKwartaalcijfersType }
     *     
     */
    public void setJaarstukHalfjaarKwartaalcijfers(DeponeringJaarstukHalfjaarKwartaalcijfersType value) {
        this.jaarstukHalfjaarKwartaalcijfers = value;
    }

    /**
     * Gets the value of the jaarstukInstemming property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringJaarstukInstemmingType }
     *     
     */
    public DeponeringJaarstukInstemmingType getJaarstukInstemming() {
        return jaarstukInstemming;
    }

    /**
     * Sets the value of the jaarstukInstemming property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringJaarstukInstemmingType }
     *     
     */
    public void setJaarstukInstemming(DeponeringJaarstukInstemmingType value) {
        this.jaarstukInstemming = value;
    }

    /**
     * Gets the value of the jaarstukJaarrekening property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringJaarstukJaarrekeningType }
     *     
     */
    public DeponeringJaarstukJaarrekeningType getJaarstukJaarrekening() {
        return jaarstukJaarrekening;
    }

    /**
     * Sets the value of the jaarstukJaarrekening property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringJaarstukJaarrekeningType }
     *     
     */
    public void setJaarstukJaarrekening(DeponeringJaarstukJaarrekeningType value) {
        this.jaarstukJaarrekening = value;
    }

    /**
     * Gets the value of the jaarstukJaarrekeningOngewijzigdVastgesteld property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringJaarstukJaarrekeningOngewijzigdVastgesteldType }
     *     
     */
    public DeponeringJaarstukJaarrekeningOngewijzigdVastgesteldType getJaarstukJaarrekeningOngewijzigdVastgesteld() {
        return jaarstukJaarrekeningOngewijzigdVastgesteld;
    }

    /**
     * Sets the value of the jaarstukJaarrekeningOngewijzigdVastgesteld property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringJaarstukJaarrekeningOngewijzigdVastgesteldType }
     *     
     */
    public void setJaarstukJaarrekeningOngewijzigdVastgesteld(DeponeringJaarstukJaarrekeningOngewijzigdVastgesteldType value) {
        this.jaarstukJaarrekeningOngewijzigdVastgesteld = value;
    }

    /**
     * Gets the value of the jaarstukOntheffing property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringJaarstukOntheffingType }
     *     
     */
    public DeponeringJaarstukOntheffingType getJaarstukOntheffing() {
        return jaarstukOntheffing;
    }

    /**
     * Sets the value of the jaarstukOntheffing property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringJaarstukOntheffingType }
     *     
     */
    public void setJaarstukOntheffing(DeponeringJaarstukOntheffingType value) {
        this.jaarstukOntheffing = value;
    }

    /**
     * Gets the value of the aanprakelijkheidOverblijvend property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringAansprakelijkheidOverblijvendType }
     *     
     */
    public DeponeringAansprakelijkheidOverblijvendType getAanprakelijkheidOverblijvend() {
        return aanprakelijkheidOverblijvend;
    }

    /**
     * Sets the value of the aanprakelijkheidOverblijvend property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringAansprakelijkheidOverblijvendType }
     *     
     */
    public void setAanprakelijkheidOverblijvend(DeponeringAansprakelijkheidOverblijvendType value) {
        this.aanprakelijkheidOverblijvend = value;
    }

    /**
     * Gets the value of the overigJaarstuk property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringOverigJaarstukType }
     *     
     */
    public DeponeringOverigJaarstukType getOverigJaarstuk() {
        return overigJaarstuk;
    }

    /**
     * Sets the value of the overigJaarstuk property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringOverigJaarstukType }
     *     
     */
    public void setOverigJaarstuk(DeponeringOverigJaarstukType value) {
        this.overigJaarstuk = value;
    }

}
