//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.08.27 a las 02:07:08 PM CEST 
//


package iso.std.iso._20022.tech.xsd.camt_054_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TaxAmount1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaxAmount1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}PercentageRate" minOccurs="0"/&gt;
 *         &lt;element name="TaxblBaseAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="Dtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}TaxRecordDetails1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAmount1", propOrder = {
    "rate",
    "taxblBaseAmt",
    "ttlAmt",
    "dtls"
})
public class TaxAmount1 {

    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "TaxblBaseAmt")
    protected ActiveOrHistoricCurrencyAndAmount taxblBaseAmt;
    @XmlElement(name = "TtlAmt")
    protected ActiveOrHistoricCurrencyAndAmount ttlAmt;
    @XmlElement(name = "Dtls")
    protected List<TaxRecordDetails1> dtls;

    /**
     * Obtiene el valor de la propiedad rate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Define el valor de la propiedad rate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Obtiene el valor de la propiedad taxblBaseAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTaxblBaseAmt() {
        return taxblBaseAmt;
    }

    /**
     * Define el valor de la propiedad taxblBaseAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.taxblBaseAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad ttlAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Define el valor de la propiedad ttlAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlAmt = value;
    }

    /**
     * Gets the value of the dtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxRecordDetails1 }
     * 
     * 
     */
    public List<TaxRecordDetails1> getDtls() {
        if (dtls == null) {
            dtls = new ArrayList<TaxRecordDetails1>();
        }
        return this.dtls;
    }

}
