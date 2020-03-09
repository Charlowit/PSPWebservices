
package localizacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calculator complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calculator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametro1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parametro2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculator", propOrder = {
    "parametro1",
    "parametro2",
    "operador"
})
public class Calculator {

    protected String parametro1;
    protected String parametro2;
    protected String operador;

    /**
     * Obtiene el valor de la propiedad parametro1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametro1() {
        return parametro1;
    }

    /**
     * Define el valor de la propiedad parametro1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametro1(String value) {
        this.parametro1 = value;
    }

    /**
     * Obtiene el valor de la propiedad parametro2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametro2() {
        return parametro2;
    }

    /**
     * Define el valor de la propiedad parametro2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametro2(String value) {
        this.parametro2 = value;
    }

    /**
     * Obtiene el valor de la propiedad operador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperador() {
        return operador;
    }

    /**
     * Define el valor de la propiedad operador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperador(String value) {
        this.operador = value;
    }

}
