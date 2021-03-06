
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
 *         &lt;element name="wmProcesarTramaUBAResult" type="{http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios}ServicioCanalesRPTRQT" minOccurs="0"/>
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
    "wmProcesarTramaUBAResult"
})
@XmlRootElement(name = "wmProcesarTramaUBAResponse")
public class WmProcesarTramaUBAResponse {

    @XmlElementRef(name = "wmProcesarTramaUBAResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicioCanalesRPTRQT> wmProcesarTramaUBAResult;

    /**
     * Gets the value of the wmProcesarTramaUBAResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicioCanalesRPTRQT }{@code >}
     *     
     */
    public JAXBElement<ServicioCanalesRPTRQT> getWmProcesarTramaUBAResult() {
        return wmProcesarTramaUBAResult;
    }

    /**
     * Sets the value of the wmProcesarTramaUBAResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicioCanalesRPTRQT }{@code >}
     *     
     */
    public void setWmProcesarTramaUBAResult(JAXBElement<ServicioCanalesRPTRQT> value) {
        this.wmProcesarTramaUBAResult = ((JAXBElement<ServicioCanalesRPTRQT> ) value);
    }

}
