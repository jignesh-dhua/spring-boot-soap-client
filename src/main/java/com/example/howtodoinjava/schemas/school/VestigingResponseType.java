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
 * <p>Java class for VestigingResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VestigingResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}ResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="product" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element ref="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}commercieleVestiging"/&gt;
 *                     &lt;element ref="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}nietCommercieleVestiging"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VestigingResponseType", namespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", propOrder = {
    "product"
})
public class VestigingResponseType
    extends ResponseType
{

    protected VestigingResponseType.Product product;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link VestigingResponseType.Product }
     *     
     */
    public VestigingResponseType.Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link VestigingResponseType.Product }
     *     
     */
    public void setProduct(VestigingResponseType.Product value) {
        this.product = value;
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
     *         &lt;choice&gt;
     *           &lt;element ref="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}commercieleVestiging"/&gt;
     *           &lt;element ref="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}nietCommercieleVestiging"/&gt;
     *         &lt;/choice&gt;
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
        "commercieleVestiging",
        "nietCommercieleVestiging"
    })
    public static class Product {

        protected CommercieleVestigingType commercieleVestiging;
        protected NietCommercieleVestigingType nietCommercieleVestiging;

        /**
         * Gets the value of the commercieleVestiging property.
         * 
         * @return
         *     possible object is
         *     {@link CommercieleVestigingType }
         *     
         */
        public CommercieleVestigingType getCommercieleVestiging() {
            return commercieleVestiging;
        }

        /**
         * Sets the value of the commercieleVestiging property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommercieleVestigingType }
         *     
         */
        public void setCommercieleVestiging(CommercieleVestigingType value) {
            this.commercieleVestiging = value;
        }

        /**
         * Gets the value of the nietCommercieleVestiging property.
         * 
         * @return
         *     possible object is
         *     {@link NietCommercieleVestigingType }
         *     
         */
        public NietCommercieleVestigingType getNietCommercieleVestiging() {
            return nietCommercieleVestiging;
        }

        /**
         * Sets the value of the nietCommercieleVestiging property.
         * 
         * @param value
         *     allowed object is
         *     {@link NietCommercieleVestigingType }
         *     
         */
        public void setNietCommercieleVestiging(NietCommercieleVestigingType value) {
            this.nietCommercieleVestiging = value;
        }

    }

}
