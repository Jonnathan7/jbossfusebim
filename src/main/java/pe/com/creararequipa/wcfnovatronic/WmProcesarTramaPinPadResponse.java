
package pe.com.creararequipa.wcfnovatronic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="wmProcesarTramaPinPadResult" type="{http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios}ServicioCanalesRPTRQT" minOccurs="0"/>
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

    @XmlElementRef(name = "wmProcesarTramaPinPadResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicioCanalesRPTRQT> wmProcesarTramaPinPadResult;

    /**
     * Gets the value of the wmProcesarTramaPinPadResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicioCanalesRPTRQT }{@code >}
     *     
     */
    public JAXBElement<ServicioCanalesRPTRQT> getWmProcesarTramaPinPadResult() {
        return wmProcesarTramaPinPadResult;
    }

    /**
     * Sets the value of the wmProcesarTramaPinPadResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicioCanalesRPTRQT }{@code >}
     *     
     */
    public void setWmProcesarTramaPinPadResult(JAXBElement<ServicioCanalesRPTRQT> value) {
        this.wmProcesarTramaPinPadResult = ((JAXBElement<ServicioCanalesRPTRQT> ) value);
    }

}
