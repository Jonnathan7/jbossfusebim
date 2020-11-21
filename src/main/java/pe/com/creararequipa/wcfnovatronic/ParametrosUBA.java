
package pe.com.creararequipa.wcfnovatronic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="pcPropiedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

    @XmlElementRef(name = "pcPropiedad", namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcPropiedad;
    @XmlElementRef(name = "pcValor", namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcValor;

    /**
     * Gets the value of the pcPropiedad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcPropiedad() {
        return pcPropiedad;
    }

    /**
     * Sets the value of the pcPropiedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcPropiedad(JAXBElement<String> value) {
        this.pcPropiedad = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcValor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcValor() {
        return pcValor;
    }

    /**
     * Sets the value of the pcValor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcValor(JAXBElement<String> value) {
        this.pcValor = ((JAXBElement<String> ) value);
    }

}
