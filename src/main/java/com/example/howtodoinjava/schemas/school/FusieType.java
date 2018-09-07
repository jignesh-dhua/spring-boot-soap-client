//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.06 at 10:42:47 PM BST 
//


package com.example.howtodoinjava.schemas.school;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FusieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FusieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}FusieSplitsingType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="opTeRichtenVerdwijnendeRechtspersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}OpTeRichtenRechtspersoonType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="verkrijgendeRechtspersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NietNatuurlijkPersoonRelatieType" minOccurs="0"/&gt;
 *         &lt;element name="verdwijnendeRechtspersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NietNatuurlijkPersoonRelatieType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FusieType", propOrder = {
    "opTeRichtenVerdwijnendeRechtspersoon",
    "verkrijgendeRechtspersoon",
    "verdwijnendeRechtspersoon"
})
public class FusieType
    extends FusieSplitsingType
{

    protected List<OpTeRichtenRechtspersoonType> opTeRichtenVerdwijnendeRechtspersoon;
    protected NietNatuurlijkPersoonRelatieType verkrijgendeRechtspersoon;
    protected List<NietNatuurlijkPersoonRelatieType> verdwijnendeRechtspersoon;

    /**
     * Gets the value of the opTeRichtenVerdwijnendeRechtspersoon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opTeRichtenVerdwijnendeRechtspersoon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpTeRichtenVerdwijnendeRechtspersoon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpTeRichtenRechtspersoonType }
     * 
     * 
     */
    public List<OpTeRichtenRechtspersoonType> getOpTeRichtenVerdwijnendeRechtspersoon() {
        if (opTeRichtenVerdwijnendeRechtspersoon == null) {
            opTeRichtenVerdwijnendeRechtspersoon = new ArrayList<OpTeRichtenRechtspersoonType>();
        }
        return this.opTeRichtenVerdwijnendeRechtspersoon;
    }

    /**
     * Gets the value of the verkrijgendeRechtspersoon property.
     * 
     * @return
     *     possible object is
     *     {@link NietNatuurlijkPersoonRelatieType }
     *     
     */
    public NietNatuurlijkPersoonRelatieType getVerkrijgendeRechtspersoon() {
        return verkrijgendeRechtspersoon;
    }

    /**
     * Sets the value of the verkrijgendeRechtspersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link NietNatuurlijkPersoonRelatieType }
     *     
     */
    public void setVerkrijgendeRechtspersoon(NietNatuurlijkPersoonRelatieType value) {
        this.verkrijgendeRechtspersoon = value;
    }

    /**
     * Gets the value of the verdwijnendeRechtspersoon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verdwijnendeRechtspersoon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerdwijnendeRechtspersoon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NietNatuurlijkPersoonRelatieType }
     * 
     * 
     */
    public List<NietNatuurlijkPersoonRelatieType> getVerdwijnendeRechtspersoon() {
        if (verdwijnendeRechtspersoon == null) {
            verdwijnendeRechtspersoon = new ArrayList<NietNatuurlijkPersoonRelatieType>();
        }
        return this.verdwijnendeRechtspersoon;
    }

}
