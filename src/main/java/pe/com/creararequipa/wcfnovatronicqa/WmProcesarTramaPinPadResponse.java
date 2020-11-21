
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
 *         &lt;element name="wmProcesarTramaPinPadResult" type="{http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios}ServicioCanalesRPTRQT"/>
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
    "wmProcesarTramaPinPadResult"
})
@XmlRootElement(name = "wmProcesarTramaPinPadResponse")
public class WmProcesarTramaPinPadResponse {

    @XmlElement(required = true)
    protected ServicioCanalesRPTRQT wmProcesarTramaPinPadResult;

    /**
     * Gets the value of the wmProcesarTramaPinPadResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServicioCanalesRPTRQT }
     *     
     */
    public ServicioCanalesRPTRQT getWmProcesarTramaPinPadResult() {
        return wmProcesarTramaPinPadResult;
    }

    /**
     * Sets the value of the wmProcesarTramaPinPadResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicioCanalesRPTRQT }
     *     
     */
    public void setWmProcesarTramaPinPadResult(ServicioCanalesRPTRQT value) {
        this.wmProcesarTramaPinPadResult = value;
    }

}
