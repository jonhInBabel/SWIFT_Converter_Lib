//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.08.27 a las 02:07:08 PM CEST 
//


package iso.std.iso._20022.tech.xsd.camt_054_001_02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CopyDuplicate1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CopyDuplicate1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CODU"/&gt;
 *     &lt;enumeration value="COPY"/&gt;
 *     &lt;enumeration value="DUPL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CopyDuplicate1Code")
@XmlEnum
public enum CopyDuplicate1Code {

    CODU,
    COPY,
    DUPL;

    public String value() {
        return name();
    }

    public static CopyDuplicate1Code fromValue(String v) {
        return valueOf(v);
    }

}
