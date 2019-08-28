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
 * <p>Clase Java para ReturnReasonInformation10 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReturnReasonInformation10"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlBkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}BankTransactionCodeStructure4" minOccurs="0"/&gt;
 *         &lt;element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}PartyIdentification32" minOccurs="0"/&gt;
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ReturnReason5Choice" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max105Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnReasonInformation10", propOrder = {
    "orgnlBkTxCd",
    "orgtr",
    "rsn",
    "addtlInf"
})
public class ReturnReasonInformation10 {

    @XmlElement(name = "OrgnlBkTxCd")
    protected BankTransactionCodeStructure4 orgnlBkTxCd;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification32 orgtr;
    @XmlElement(name = "Rsn")
    protected ReturnReason5Choice rsn;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Obtiene el valor de la propiedad orgnlBkTxCd.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public BankTransactionCodeStructure4 getOrgnlBkTxCd() {
        return orgnlBkTxCd;
    }

    /**
     * Define el valor de la propiedad orgnlBkTxCd.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public void setOrgnlBkTxCd(BankTransactionCodeStructure4 value) {
        this.orgnlBkTxCd = value;
    }

    /**
     * Obtiene el valor de la propiedad orgtr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    public PartyIdentification32 getOrgtr() {
        return orgtr;
    }

    /**
     * Define el valor de la propiedad orgtr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public void setOrgtr(PartyIdentification32 value) {
        this.orgtr = value;
    }

    /**
     * Obtiene el valor de la propiedad rsn.
     * 
     * @return
     *     possible object is
     *     {@link ReturnReason5Choice }
     *     
     */
    public ReturnReason5Choice getRsn() {
        return rsn;
    }

    /**
     * Define el valor de la propiedad rsn.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnReason5Choice }
     *     
     */
    public void setRsn(ReturnReason5Choice value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<String>();
        }
        return this.addtlInf;
    }

}
