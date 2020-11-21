
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
 *         &lt;element name="datosRqt" type="{http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios}MonitoreoFraude" minOccurs="0"/>
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
    "datosRqt"
})
@XmlRootElement(name = "ProcesarTramaMonitoreoFraude")
public class ProcesarTramaMonitoreoFraude {

    @XmlElementRef(name = "datosRqt", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<MonitoreoFraude> datosRqt;

    /**
     * Gets the value of the datosRqt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonitoreoFraude }{@code >}
     *     
     */
    public JAXBElement<MonitoreoFraude> getDatosRqt() {
        return datosRqt;
    }

    /**
     * Sets the value of the datosRqt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonitoreoFraude }{@code >}
     *     
     */
    public void setDatosRqt(JAXBElement<MonitoreoFraude> value) {
        this.datosRqt = ((JAXBElement<MonitoreoFraude> ) value);
    }

}
