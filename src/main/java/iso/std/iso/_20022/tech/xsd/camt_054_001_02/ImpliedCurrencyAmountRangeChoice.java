//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.08.27 a las 02:07:08 PM CEST 
//


package iso.std.iso._20022.tech.xsd.camt_054_001_02;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ImpliedCurrencyAmountRangeChoice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ImpliedCurrencyAmountRangeChoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="FrAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}AmountRangeBoundary1"/&gt;
 *           &lt;element name="ToAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}AmountRangeBoundary1"/&gt;
 *           &lt;element name="FrToAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}FromToAmountRange"/&gt;
 *           &lt;element name="EQAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ImpliedCurrencyAndAmount"/&gt;
 *           &lt;element name="NEQAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ImpliedCurrencyAndAmount"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpliedCurrencyAmountRangeChoice", propOrder = {
    "frAmt",
    "toAmt",
    "frToAmt",
    "eqAmt",
    "neqAmt"
})
public class ImpliedCurrencyAmountRangeChoice {

    @XmlElement(name = "FrAmt")
    protected AmountRangeBoundary1 frAmt;
    @XmlElement(name = "ToAmt")
    protected AmountRangeBoundary1 toAmt;
    @XmlElement(name = "FrToAmt")
    protected FromToAmountRange frToAmt;
    @XmlElement(name = "EQAmt")
    protected BigDecimal eqAmt;
    @XmlElement(name = "NEQAmt")
    protected BigDecimal neqAmt;

    /**
     * Obtiene el valor de la propiedad frAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public AmountRangeBoundary1 getFrAmt() {
        return frAmt;
    }

    /**
     * Define el valor de la propiedad frAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public void setFrAmt(AmountRangeBoundary1 value) {
        this.frAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad toAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public AmountRangeBoundary1 getToAmt() {
        return toAmt;
    }

    /**
     * Define el valor de la propiedad toAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public void setToAmt(AmountRangeBoundary1 value) {
        this.toAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad frToAmt.
     * 
     * @return
     *     possible object is
     *     {@link FromToAmountRange }
     *     
     */
    public FromToAmountRange getFrToAmt() {
        return frToAmt;
    }

    /**
     * Define el valor de la propiedad frToAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link FromToAmountRange }
     *     
     */
    public void setFrToAmt(FromToAmountRange value) {
        this.frToAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad eqAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEQAmt() {
        return eqAmt;
    }

    /**
     * Define el valor de la propiedad eqAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEQAmt(BigDecimal value) {
        this.eqAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad neqAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNEQAmt() {
        return neqAmt;
    }

    /**
     * Define el valor de la propiedad neqAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNEQAmt(BigDecimal value) {
        this.neqAmt = value;
    }

}
