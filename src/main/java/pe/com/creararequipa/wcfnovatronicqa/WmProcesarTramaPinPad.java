
package pe.com.creararequipa.wcfnovatronicqa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="toServicioCanales" type="{http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios}ServicioCanalesRPTRQT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "toServicioCanales"
})
@XmlRootElement(name = "wmProcesarTramaPinPad")
public class WmProcesarTramaPinPad {

    @XmlElement(required = true)
    protected ServicioCanalesRPTRQT toServicioCanales;

    /**
     * Gets the value of the toServicioCanales property.
     * 
     * @return
     *     possible object is
     *     {@link ServicioCanalesRPTRQT }
     *     
     */
    public ServicioCanalesRPTRQT getToServicioCanales() {
        return toServicioCanales;
    }

    /**
     * Sets the value of the toServicioCanales property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicioCanalesRPTRQT }
     *     
     */
    public void setToServicioCanales(ServicioCanalesRPTRQT value) {
        this.toServicioCanales = value;
    }

}
