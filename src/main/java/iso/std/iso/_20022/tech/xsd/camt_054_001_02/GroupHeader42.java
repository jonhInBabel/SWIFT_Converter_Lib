//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.08.27 a las 02:07:08 PM CEST 
//


package iso.std.iso._20022.tech.xsd.camt_054_001_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para GroupHeader42 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GroupHeader42"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max35Text"/&gt;
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ISODateTime"/&gt;
 *         &lt;element name="MsgRcpt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}PartyIdentification32" minOccurs="0"/&gt;
 *         &lt;element name="MsgPgntn" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Pagination" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max500Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader42", propOrder = {
    "msgId",
    "creDtTm",
    "msgRcpt",
    "msgPgntn",
    "addtlInf"
})
public class GroupHeader42 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "MsgRcpt")
    protected PartyIdentification32 msgRcpt;
    @XmlElement(name = "MsgPgntn")
    protected Pagination msgPgntn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Obtiene el valor de la propiedad msgId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Define el valor de la propiedad msgId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Obtiene el valor de la propiedad creDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Define el valor de la propiedad creDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad msgRcpt.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    public PartyIdentification32 getMsgRcpt() {
        return msgRcpt;
    }

    /**
     * Define el valor de la propiedad msgRcpt.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public void setMsgRcpt(PartyIdentification32 value) {
        this.msgRcpt = value;
    }

    /**
     * Obtiene el valor de la propiedad msgPgntn.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Define el valor de la propiedad msgPgntn.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public void setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Define el valor de la propiedad addtlInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
