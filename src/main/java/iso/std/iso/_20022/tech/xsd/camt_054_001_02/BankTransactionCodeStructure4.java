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
 * <p>Clase Java para BankTransactionCodeStructure4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BankTransactionCodeStructure4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Domn" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}BankTransactionCodeStructure5" minOccurs="0"/&gt;
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ProprietaryBankTransactionCodeStructure1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankTransactionCodeStructure4", propOrder = {
    "domn",
    "prtry"
})
public class BankTransactionCodeStructure4 {

    @XmlElement(name = "Domn")
    protected BankTransactionCodeStructure5 domn;
    @XmlElement(name = "Prtry")
    protected ProprietaryBankTransactionCodeStructure1 prtry;

    /**
     * Obtiene el valor de la propiedad domn.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure5 }
     *     
     */
    public BankTransactionCodeStructure5 getDomn() {
        return domn;
    }

    /**
     * Define el valor de la propiedad domn.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure5 }
     *     
     */
    public void setDomn(BankTransactionCodeStructure5 value) {
        this.domn = value;
    }

    /**
     * Obtiene el valor de la propiedad prtry.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryBankTransactionCodeStructure1 }
     *     
     */
    public ProprietaryBankTransactionCodeStructure1 getPrtry() {
        return prtry;
    }

    /**
     * Define el valor de la propiedad prtry.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryBankTransactionCodeStructure1 }
     *     
     */
    public void setPrtry(ProprietaryBankTransactionCodeStructure1 value) {
        this.prtry = value;
    }

}
