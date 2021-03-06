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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="meldingen"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="fout" type="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}MeldingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="waarschuwing" type="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}MeldingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="informatie" type="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}MeldingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="peilmoment" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}TijdstipType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", namespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", propOrder = {
    "meldingen"
})
@XmlSeeAlso({
    VestigingResponseType.class,
    MaatschappelijkeActiviteitResponseType.class
})
public class ResponseType {

    @XmlElement(required = true)
    protected ResponseType.Meldingen meldingen;
    @XmlAttribute(name = "peilmoment")
    protected String peilmoment;

    /**
     * Gets the value of the meldingen property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType.Meldingen }
     *     
     */
    public ResponseType.Meldingen getMeldingen() {
        return meldingen;
    }

    /**
     * Sets the value of the meldingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType.Meldingen }
     *     
     */
    public void setMeldingen(ResponseType.Meldingen value) {
        this.meldingen = value;
    }

    /**
     * Gets the value of the peilmoment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeilmoment() {
        return peilmoment;
    }

    /**
     * Sets the value of the peilmoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeilmoment(String value) {
        this.peilmoment = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="fout" type="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}MeldingType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="waarschuwing" type="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}MeldingType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="informatie" type="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}MeldingType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fout",
        "waarschuwing",
        "informatie"
    })
    public static class Meldingen {

        @XmlElement(namespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02")
        protected List<MeldingType> fout;
        @XmlElement(namespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02")
        protected List<MeldingType> waarschuwing;
        @XmlElement(namespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02")
        protected List<MeldingType> informatie;

        /**
         * Gets the value of the fout property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fout property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFout().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MeldingType }
         * 
         * 
         */
        public List<MeldingType> getFout() {
            if (fout == null) {
                fout = new ArrayList<MeldingType>();
            }
            return this.fout;
        }

        /**
         * Gets the value of the waarschuwing property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the waarschuwing property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWaarschuwing().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MeldingType }
         * 
         * 
         */
        public List<MeldingType> getWaarschuwing() {
            if (waarschuwing == null) {
                waarschuwing = new ArrayList<MeldingType>();
            }
            return this.waarschuwing;
        }

        /**
         * Gets the value of the informatie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the informatie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInformatie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MeldingType }
         * 
         * 
         */
        public List<MeldingType> getInformatie() {
            if (informatie == null) {
                informatie = new ArrayList<MeldingType>();
            }
            return this.informatie;
        }

    }

}
