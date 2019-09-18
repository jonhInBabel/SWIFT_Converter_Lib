//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.09.18 a las 08:30:14 AM CEST 
//


package iso.std.iso._20022.tech.xsd.pacs_008_001_02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentType5Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MSIN"/&gt;
 *     &lt;enumeration value="CNFA"/&gt;
 *     &lt;enumeration value="DNFA"/&gt;
 *     &lt;enumeration value="CINV"/&gt;
 *     &lt;enumeration value="CREN"/&gt;
 *     &lt;enumeration value="DEBN"/&gt;
 *     &lt;enumeration value="HIRI"/&gt;
 *     &lt;enumeration value="SBIN"/&gt;
 *     &lt;enumeration value="CMCN"/&gt;
 *     &lt;enumeration value="SOAC"/&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="BOLD"/&gt;
 *     &lt;enumeration value="VCHR"/&gt;
 *     &lt;enumeration value="AROI"/&gt;
 *     &lt;enumeration value="TSUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentType5Code")
@XmlEnum
public enum DocumentType5Code {

    MSIN,
    CNFA,
    DNFA,
    CINV,
    CREN,
    DEBN,
    HIRI,
    SBIN,
    CMCN,
    SOAC,
    DISP,
    BOLD,
    VCHR,
    AROI,
    TSUT;

    public String value() {
        return name();
    }

    public static DocumentType5Code fromValue(String v) {
        return valueOf(v);
    }

}
