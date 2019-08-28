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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BankTransactionCodeStructure5 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BankTransactionCodeStructure5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ExternalBankTransactionDomain1Code"/&gt;
 *         &lt;element name="Fmly" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}BankTransactionCodeStructure6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankTransactionCodeStructure5", propOrder = {
    "cd",
    "fmly"
})
public class BankTransactionCodeStructure5 {

    @XmlElement(name = "Cd", required = true)
    protected String cd;
    @XmlElement(name = "Fmly", required = true)
    protected BankTransactionCodeStructure6 fmly;

    /**
     * Obtiene el valor de la propiedad cd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Define el valor de la propiedad cd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCd(String value) {
        this.cd = value;
    }

    /**
     * Obtiene el valor de la propiedad fmly.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure6 }
     *     
     */
    public BankTransactionCodeStructure6 getFmly() {
        return fmly;
    }

    /**
     * Define el valor de la propiedad fmly.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure6 }
     *     
     */
    public void setFmly(BankTransactionCodeStructure6 value) {
        this.fmly = value;
    }

}
