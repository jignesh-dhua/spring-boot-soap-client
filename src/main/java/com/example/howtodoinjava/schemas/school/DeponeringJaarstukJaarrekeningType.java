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
 * <p>Java class for DeponeringJaarstukJaarrekeningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeponeringJaarstukJaarrekeningType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringJaarstukType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datumVaststelling" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/&gt;
 *         &lt;element name="vaststelling" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *         &lt;element name="grootte" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *         &lt;element name="maandEindeBoekjaar" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *         &lt;element name="plaatsDeponeringJaarverslag" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *         &lt;element name="buitenlandseJaarrekening" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *         &lt;element name="aanvullendeMededeling" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringAanvullendeMededelingType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeponeringJaarstukJaarrekeningType", propOrder = {
    "datumVaststelling",
    "vaststelling",
    "grootte",
    "maandEindeBoekjaar",
    "plaatsDeponeringJaarverslag",
    "buitenlandseJaarrekening",
    "aanvullendeMededeling"
})
public class DeponeringJaarstukJaarrekeningType
    extends DeponeringJaarstukType
{

    protected String datumVaststelling;
    protected EnumeratieType vaststelling;
    protected EnumeratieType grootte;
    protected EnumeratieType maandEindeBoekjaar;
    protected EnumeratieType plaatsDeponeringJaarverslag;
    protected EnumeratieType buitenlandseJaarrekening;
    protected DeponeringAanvullendeMededelingType aanvullendeMededeling;

    /**
     * Gets the value of the datumVaststelling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumVaststelling() {
        return datumVaststelling;
    }

    /**
     * Sets the value of the datumVaststelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumVaststelling(String value) {
        this.datumVaststelling = value;
    }

    /**
     * Gets the value of the vaststelling property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getVaststelling() {
        return vaststelling;
    }

    /**
     * Sets the value of the vaststelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setVaststelling(EnumeratieType value) {
        this.vaststelling = value;
    }

    /**
     * Gets the value of the grootte property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getGrootte() {
        return grootte;
    }

    /**
     * Sets the value of the grootte property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setGrootte(EnumeratieType value) {
        this.grootte = value;
    }

    /**
     * Gets the value of the maandEindeBoekjaar property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getMaandEindeBoekjaar() {
        return maandEindeBoekjaar;
    }

    /**
     * Sets the value of the maandEindeBoekjaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setMaandEindeBoekjaar(EnumeratieType value) {
        this.maandEindeBoekjaar = value;
    }

    /**
     * Gets the value of the plaatsDeponeringJaarverslag property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getPlaatsDeponeringJaarverslag() {
        return plaatsDeponeringJaarverslag;
    }

    /**
     * Sets the value of the plaatsDeponeringJaarverslag property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setPlaatsDeponeringJaarverslag(EnumeratieType value) {
        this.plaatsDeponeringJaarverslag = value;
    }

    /**
     * Gets the value of the buitenlandseJaarrekening property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getBuitenlandseJaarrekening() {
        return buitenlandseJaarrekening;
    }

    /**
     * Sets the value of the buitenlandseJaarrekening property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setBuitenlandseJaarrekening(EnumeratieType value) {
        this.buitenlandseJaarrekening = value;
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

}