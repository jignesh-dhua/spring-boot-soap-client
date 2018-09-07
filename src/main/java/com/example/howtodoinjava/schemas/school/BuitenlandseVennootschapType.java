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
 * <p>Java class for BuitenlandseVennootschapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuitenlandseVennootschapType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NietNatuurlijkPersoonType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buitenlandseRegistratieGegevens" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BuitenlandseRegistratieGegevensType" minOccurs="0"/&gt;
 *         &lt;element name="landVanOprichting" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *         &lt;element name="landVanVestiging" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/&gt;
 *         &lt;element name="geplaatstKapitaal" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}KapitaalType" minOccurs="0"/&gt;
 *         &lt;element name="buitenlandseVennootschapGegevens" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BuitenlandseVennootschapGegevensType" minOccurs="0"/&gt;
 *         &lt;element name="bezoekLocatie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}LocatieType" minOccurs="0"/&gt;
 *         &lt;element name="postLocatie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}LocatieType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuitenlandseVennootschapType", propOrder = {
    "buitenlandseRegistratieGegevens",
    "landVanOprichting",
    "landVanVestiging",
    "geplaatstKapitaal",
    "buitenlandseVennootschapGegevens",
    "bezoekLocatie",
    "postLocatie"
})
public class BuitenlandseVennootschapType
    extends NietNatuurlijkPersoonType
{

    protected BuitenlandseRegistratieGegevensType buitenlandseRegistratieGegevens;
    protected EnumeratieType landVanOprichting;
    protected EnumeratieType landVanVestiging;
    protected KapitaalType geplaatstKapitaal;
    protected BuitenlandseVennootschapGegevensType buitenlandseVennootschapGegevens;
    protected LocatieType bezoekLocatie;
    protected LocatieType postLocatie;

    /**
     * Gets the value of the buitenlandseRegistratieGegevens property.
     * 
     * @return
     *     possible object is
     *     {@link BuitenlandseRegistratieGegevensType }
     *     
     */
    public BuitenlandseRegistratieGegevensType getBuitenlandseRegistratieGegevens() {
        return buitenlandseRegistratieGegevens;
    }

    /**
     * Sets the value of the buitenlandseRegistratieGegevens property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuitenlandseRegistratieGegevensType }
     *     
     */
    public void setBuitenlandseRegistratieGegevens(BuitenlandseRegistratieGegevensType value) {
        this.buitenlandseRegistratieGegevens = value;
    }

    /**
     * Gets the value of the landVanOprichting property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getLandVanOprichting() {
        return landVanOprichting;
    }

    /**
     * Sets the value of the landVanOprichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setLandVanOprichting(EnumeratieType value) {
        this.landVanOprichting = value;
    }

    /**
     * Gets the value of the landVanVestiging property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getLandVanVestiging() {
        return landVanVestiging;
    }

    /**
     * Sets the value of the landVanVestiging property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setLandVanVestiging(EnumeratieType value) {
        this.landVanVestiging = value;
    }

    /**
     * Gets the value of the geplaatstKapitaal property.
     * 
     * @return
     *     possible object is
     *     {@link KapitaalType }
     *     
     */
    public KapitaalType getGeplaatstKapitaal() {
        return geplaatstKapitaal;
    }

    /**
     * Sets the value of the geplaatstKapitaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link KapitaalType }
     *     
     */
    public void setGeplaatstKapitaal(KapitaalType value) {
        this.geplaatstKapitaal = value;
    }

    /**
     * Gets the value of the buitenlandseVennootschapGegevens property.
     * 
     * @return
     *     possible object is
     *     {@link BuitenlandseVennootschapGegevensType }
     *     
     */
    public BuitenlandseVennootschapGegevensType getBuitenlandseVennootschapGegevens() {
        return buitenlandseVennootschapGegevens;
    }

    /**
     * Sets the value of the buitenlandseVennootschapGegevens property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuitenlandseVennootschapGegevensType }
     *     
     */
    public void setBuitenlandseVennootschapGegevens(BuitenlandseVennootschapGegevensType value) {
        this.buitenlandseVennootschapGegevens = value;
    }

    /**
     * Gets the value of the bezoekLocatie property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieType }
     *     
     */
    public LocatieType getBezoekLocatie() {
        return bezoekLocatie;
    }

    /**
     * Sets the value of the bezoekLocatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieType }
     *     
     */
    public void setBezoekLocatie(LocatieType value) {
        this.bezoekLocatie = value;
    }

    /**
     * Gets the value of the postLocatie property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieType }
     *     
     */
    public LocatieType getPostLocatie() {
        return postLocatie;
    }

    /**
     * Sets the value of the postLocatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieType }
     *     
     */
    public void setPostLocatie(LocatieType value) {
        this.postLocatie = value;
    }

}
