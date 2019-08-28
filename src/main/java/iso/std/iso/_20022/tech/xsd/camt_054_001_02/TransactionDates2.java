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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para TransactionDates2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionDates2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccptncDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="TradActvtyCtrctlSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="EndDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="TxDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ProprietaryDate2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDates2", propOrder = {
    "accptncDtTm",
    "tradActvtyCtrctlSttlmDt",
    "tradDt",
    "intrBkSttlmDt",
    "startDt",
    "endDt",
    "txDtTm",
    "prtry"
})
public class TransactionDates2 {

    @XmlElement(name = "AccptncDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accptncDtTm;
    @XmlElement(name = "TradActvtyCtrctlSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradActvtyCtrctlSttlmDt;
    @XmlElement(name = "TradDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "IntrBkSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkSttlmDt;
    @XmlElement(name = "StartDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "EndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDt;
    @XmlElement(name = "TxDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txDtTm;
    @XmlElement(name = "Prtry")
    protected List<ProprietaryDate2> prtry;

    /**
     * Obtiene el valor de la propiedad accptncDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccptncDtTm() {
        return accptncDtTm;
    }

    /**
     * Define el valor de la propiedad accptncDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccptncDtTm(XMLGregorianCalendar value) {
        this.accptncDtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad tradActvtyCtrctlSttlmDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradActvtyCtrctlSttlmDt() {
        return tradActvtyCtrctlSttlmDt;
    }

    /**
     * Define el valor de la propiedad tradActvtyCtrctlSttlmDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradActvtyCtrctlSttlmDt(XMLGregorianCalendar value) {
        this.tradActvtyCtrctlSttlmDt = value;
    }

    /**
     * Obtiene el valor de la propiedad tradDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Define el valor de la propiedad tradDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
    }

    /**
     * Obtiene el valor de la propiedad intrBkSttlmDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Define el valor de la propiedad intrBkSttlmDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.intrBkSttlmDt = value;
    }

    /**
     * Obtiene el valor de la propiedad startDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Define el valor de la propiedad startDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Obtiene el valor de la propiedad endDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDt() {
        return endDt;
    }

    /**
     * Define el valor de la propiedad endDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDt(XMLGregorianCalendar value) {
        this.endDt = value;
    }

    /**
     * Obtiene el valor de la propiedad txDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxDtTm() {
        return txDtTm;
    }

    /**
     * Define el valor de la propiedad txDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxDtTm(XMLGregorianCalendar value) {
        this.txDtTm = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryDate2 }
     * 
     * 
     */
    public List<ProprietaryDate2> getPrtry() {
        if (prtry == null) {
            prtry = new ArrayList<ProprietaryDate2>();
        }
        return this.prtry;
    }

}
