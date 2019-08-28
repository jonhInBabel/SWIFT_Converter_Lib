//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.08.27 a las 02:07:08 PM CEST 
//


package iso.std.iso._20022.tech.xsd.camt_054_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AmountAndCurrencyExchange3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AmountAndCurrencyExchange3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}AmountAndCurrencyExchangeDetails3" minOccurs="0"/&gt;
 *         &lt;element name="TxAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}AmountAndCurrencyExchangeDetails3" minOccurs="0"/&gt;
 *         &lt;element name="CntrValAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}AmountAndCurrencyExchangeDetails3" minOccurs="0"/&gt;
 *         &lt;element name="AnncdPstngAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}AmountAndCurrencyExchangeDetails3" minOccurs="0"/&gt;
 *         &lt;element name="PrtryAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}AmountAndCurrencyExchangeDetails4" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndCurrencyExchange3", propOrder = {
    "instdAmt",
    "txAmt",
    "cntrValAmt",
    "anncdPstngAmt",
    "prtryAmt"
})
public class AmountAndCurrencyExchange3 {

    @XmlElement(name = "InstdAmt")
    protected AmountAndCurrencyExchangeDetails3 instdAmt;
    @XmlElement(name = "TxAmt")
    protected AmountAndCurrencyExchangeDetails3 txAmt;
    @XmlElement(name = "CntrValAmt")
    protected AmountAndCurrencyExchangeDetails3 cntrValAmt;
    @XmlElement(name = "AnncdPstngAmt")
    protected AmountAndCurrencyExchangeDetails3 anncdPstngAmt;
    @XmlElement(name = "PrtryAmt")
    protected List<AmountAndCurrencyExchangeDetails4> prtryAmt;

    /**
     * Obtiene el valor de la propiedad instdAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchangeDetails3 getInstdAmt() {
        return instdAmt;
    }

    /**
     * Define el valor de la propiedad instdAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public void setInstdAmt(AmountAndCurrencyExchangeDetails3 value) {
        this.instdAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad txAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchangeDetails3 getTxAmt() {
        return txAmt;
    }

    /**
     * Define el valor de la propiedad txAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public void setTxAmt(AmountAndCurrencyExchangeDetails3 value) {
        this.txAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad cntrValAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchangeDetails3 getCntrValAmt() {
        return cntrValAmt;
    }

    /**
     * Define el valor de la propiedad cntrValAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public void setCntrValAmt(AmountAndCurrencyExchangeDetails3 value) {
        this.cntrValAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad anncdPstngAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchangeDetails3 getAnncdPstngAmt() {
        return anncdPstngAmt;
    }

    /**
     * Define el valor de la propiedad anncdPstngAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public void setAnncdPstngAmt(AmountAndCurrencyExchangeDetails3 value) {
        this.anncdPstngAmt = value;
    }

    /**
     * Gets the value of the prtryAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtryAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtryAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountAndCurrencyExchangeDetails4 }
     * 
     * 
     */
    public List<AmountAndCurrencyExchangeDetails4> getPrtryAmt() {
        if (prtryAmt == null) {
            prtryAmt = new ArrayList<AmountAndCurrencyExchangeDetails4>();
        }
        return this.prtryAmt;
    }

}
