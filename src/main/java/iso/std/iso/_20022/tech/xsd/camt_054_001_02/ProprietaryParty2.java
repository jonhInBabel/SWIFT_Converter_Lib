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
 * <p>Clase Java para ProprietaryParty2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProprietaryParty2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max35Text"/&gt;
 *         &lt;element name="Pty" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}PartyIdentification32"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietaryParty2", propOrder = {
    "tp",
    "pty"
})
public class ProprietaryParty2 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Pty", required = true)
    protected PartyIdentification32 pty;

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad pty.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    public PartyIdentification32 getPty() {
        return pty;
    }

    /**
     * Define el valor de la propiedad pty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public void setPty(PartyIdentification32 value) {
        this.pty = value;
    }

}
