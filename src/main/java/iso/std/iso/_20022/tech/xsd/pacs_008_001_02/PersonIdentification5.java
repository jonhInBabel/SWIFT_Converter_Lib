//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.09.18 a las 08:30:14 AM CEST 
//


package iso.std.iso._20022.tech.xsd.pacs_008_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonIdentification5 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonIdentification5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DtAndPlcOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02}DateAndPlaceOfBirth" minOccurs="0"/&gt;
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02}GenericPersonIdentification1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentification5", propOrder = {
    "dtAndPlcOfBirth",
    "othr"
})
public class PersonIdentification5 {

    @XmlElement(name = "DtAndPlcOfBirth")
    protected DateAndPlaceOfBirth dtAndPlcOfBirth;
    @XmlElement(name = "Othr")
    protected List<GenericPersonIdentification1> othr;

    /**
     * Obtiene el valor de la propiedad dtAndPlcOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPlaceOfBirth }
     *     
     */
    public DateAndPlaceOfBirth getDtAndPlcOfBirth() {
        return dtAndPlcOfBirth;
    }

    /**
     * Define el valor de la propiedad dtAndPlcOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPlaceOfBirth }
     *     
     */
    public void setDtAndPlcOfBirth(DateAndPlaceOfBirth value) {
        this.dtAndPlcOfBirth = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericPersonIdentification1 }
     * 
     * 
     */
    public List<GenericPersonIdentification1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<GenericPersonIdentification1>();
        }
        return this.othr;
    }

}
