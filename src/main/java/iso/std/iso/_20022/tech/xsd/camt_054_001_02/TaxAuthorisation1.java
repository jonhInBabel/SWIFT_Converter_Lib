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
 * <p>Clase Java para TaxAuthorisation1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaxAuthorisation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Titl" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max140Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAuthorisation1", propOrder = {
    "titl",
    "nm"
})
public class TaxAuthorisation1 {

    @XmlElement(name = "Titl")
    protected String titl;
    @XmlElement(name = "Nm")
    protected String nm;

    /**
     * Obtiene el valor de la propiedad titl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitl() {
        return titl;
    }

    /**
     * Define el valor de la propiedad titl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitl(String value) {
        this.titl = value;
    }

    /**
     * Obtiene el valor de la propiedad nm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Define el valor de la propiedad nm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

}
