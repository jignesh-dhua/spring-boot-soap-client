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
 * <p>Java class for PersoonRelatieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersoonRelatieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="naamPersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NaamPersoonType"/&gt;
 *         &lt;element name="natuurlijkPersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NatuurlijkPersoonType"/&gt;
 *         &lt;element name="buitenlandseVennootschap" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BuitenlandseVennootschapType"/&gt;
 *         &lt;element name="eenmanszaakMetMeerdereEigenaren" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EenmanszaakMetMeerdereEigenarenType"/&gt;
 *         &lt;element name="rechtspersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RechtspersoonType"/&gt;
 *         &lt;element name="rechtspersoonInOprichting" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RechtspersoonInOprichtingType"/&gt;
 *         &lt;element name="samenwerkingsverband" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}SamenwerkingsverbandType"/&gt;
 *         &lt;element name="afgeslotenMoeder" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}AfgeslotenMoederType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersoonRelatieType", propOrder = {
    "naamPersoon",
    "natuurlijkPersoon",
    "buitenlandseVennootschap",
    "eenmanszaakMetMeerdereEigenaren",
    "rechtspersoon",
    "rechtspersoonInOprichting",
    "samenwerkingsverband",
    "afgeslotenMoeder"
})
public class PersoonRelatieType
    extends RelatieType
{

    protected NaamPersoonType naamPersoon;
    protected NatuurlijkPersoonType natuurlijkPersoon;
    protected BuitenlandseVennootschapType buitenlandseVennootschap;
    protected EenmanszaakMetMeerdereEigenarenType eenmanszaakMetMeerdereEigenaren;
    protected RechtspersoonType rechtspersoon;
    protected RechtspersoonInOprichtingType rechtspersoonInOprichting;
    protected SamenwerkingsverbandType samenwerkingsverband;
    protected AfgeslotenMoederType afgeslotenMoeder;

    /**
     * Gets the value of the naamPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link NaamPersoonType }
     *     
     */
    public NaamPersoonType getNaamPersoon() {
        return naamPersoon;
    }

    /**
     * Sets the value of the naamPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaamPersoonType }
     *     
     */
    public void setNaamPersoon(NaamPersoonType value) {
        this.naamPersoon = value;
    }

    /**
     * Gets the value of the natuurlijkPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link NatuurlijkPersoonType }
     *     
     */
    public NatuurlijkPersoonType getNatuurlijkPersoon() {
        return natuurlijkPersoon;
    }

    /**
     * Sets the value of the natuurlijkPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatuurlijkPersoonType }
     *     
     */
    public void setNatuurlijkPersoon(NatuurlijkPersoonType value) {
        this.natuurlijkPersoon = value;
    }

    /**
     * Gets the value of the buitenlandseVennootschap property.
     * 
     * @return
     *     possible object is
     *     {@link BuitenlandseVennootschapType }
     *     
     */
    public BuitenlandseVennootschapType getBuitenlandseVennootschap() {
        return buitenlandseVennootschap;
    }

    /**
     * Sets the value of the buitenlandseVennootschap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuitenlandseVennootschapType }
     *     
     */
    public void setBuitenlandseVennootschap(BuitenlandseVennootschapType value) {
        this.buitenlandseVennootschap = value;
    }

    /**
     * Gets the value of the eenmanszaakMetMeerdereEigenaren property.
     * 
     * @return
     *     possible object is
     *     {@link EenmanszaakMetMeerdereEigenarenType }
     *     
     */
    public EenmanszaakMetMeerdereEigenarenType getEenmanszaakMetMeerdereEigenaren() {
        return eenmanszaakMetMeerdereEigenaren;
    }

    /**
     * Sets the value of the eenmanszaakMetMeerdereEigenaren property.
     * 
     * @param value
     *     allowed object is
     *     {@link EenmanszaakMetMeerdereEigenarenType }
     *     
     */
    public void setEenmanszaakMetMeerdereEigenaren(EenmanszaakMetMeerdereEigenarenType value) {
        this.eenmanszaakMetMeerdereEigenaren = value;
    }

    /**
     * Gets the value of the rechtspersoon property.
     * 
     * @return
     *     possible object is
     *     {@link RechtspersoonType }
     *     
     */
    public RechtspersoonType getRechtspersoon() {
        return rechtspersoon;
    }

    /**
     * Sets the value of the rechtspersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechtspersoonType }
     *     
     */
    public void setRechtspersoon(RechtspersoonType value) {
        this.rechtspersoon = value;
    }

    /**
     * Gets the value of the rechtspersoonInOprichting property.
     * 
     * @return
     *     possible object is
     *     {@link RechtspersoonInOprichtingType }
     *     
     */
    public RechtspersoonInOprichtingType getRechtspersoonInOprichting() {
        return rechtspersoonInOprichting;
    }

    /**
     * Sets the value of the rechtspersoonInOprichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechtspersoonInOprichtingType }
     *     
     */
    public void setRechtspersoonInOprichting(RechtspersoonInOprichtingType value) {
        this.rechtspersoonInOprichting = value;
    }

    /**
     * Gets the value of the samenwerkingsverband property.
     * 
     * @return
     *     possible object is
     *     {@link SamenwerkingsverbandType }
     *     
     */
    public SamenwerkingsverbandType getSamenwerkingsverband() {
        return samenwerkingsverband;
    }

    /**
     * Sets the value of the samenwerkingsverband property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamenwerkingsverbandType }
     *     
     */
    public void setSamenwerkingsverband(SamenwerkingsverbandType value) {
        this.samenwerkingsverband = value;
    }

    /**
     * Gets the value of the afgeslotenMoeder property.
     * 
     * @return
     *     possible object is
     *     {@link AfgeslotenMoederType }
     *     
     */
    public AfgeslotenMoederType getAfgeslotenMoeder() {
        return afgeslotenMoeder;
    }

    /**
     * Sets the value of the afgeslotenMoeder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfgeslotenMoederType }
     *     
     */
    public void setAfgeslotenMoeder(AfgeslotenMoederType value) {
        this.afgeslotenMoeder = value;
    }

}
