
package pe.com.creararequipa.wcfnovatronicqa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParametrosUBA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParametrosUBA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pcPropiedad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcValor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametrosUBA", namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", propOrder = {
    "pcPropiedad",
    "pcValor"
})
public class ParametrosUBA {

    @XmlElement(required = true)
    protected String pcPropiedad;
    @XmlElement(required = true)
    protected String pcValor;

    /**
     * Gets the value of the pcPropiedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcPropiedad() {
        return pcPropiedad;
    }

    /**
     * Sets the value of the pcPropiedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcPropiedad(String value) {
        this.pcPropiedad = value;
    }

    /**
     * Gets the value of the pcValor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcValor() {
        return pcValor;
    }

    /**
     * Sets the value of the pcValor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcValor(String value) {
        this.pcValor = value;
    }

}
