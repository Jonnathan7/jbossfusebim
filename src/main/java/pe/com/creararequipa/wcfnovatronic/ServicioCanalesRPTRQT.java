
package pe.com.creararequipa.wcfnovatronic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServicioCanalesRPTRQT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicioCanalesRPTRQT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransaccionAdministrativa" type="{http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA}TransaccionAdministrativa" minOccurs="0"/>
 *         &lt;element name="paLstParametrosUBA" type="{http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios}ArrayOfParametrosUBA" minOccurs="0"/>
 *         &lt;element name="pcCodErr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCodUsu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcMsjErr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcTracki" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pnIdentificadorTipo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicioCanalesRPTRQT", namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", propOrder = {
    "transaccionAdministrativa",
    "paLstParametrosUBA",
    "pcCodErr",
    "pcCodUsu",
    "pcMsjErr",
    "pcTracki",
    "pnIdentificadorTipo"
})
public class ServicioCanalesRPTRQT {

    @XmlElementRef(name = "TransaccionAdministrativa", namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<TransaccionAdministrativa> transaccionAdministrativa;
    @XmlElementRef(name = "paLstParametrosUBA", namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfParametrosUBA> paLstParametrosUBA;
    @XmlElementRef(name = "pcCodErr", namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCodErr;
    @XmlElementRef(name = "pcCodUsu", namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCodUsu;
    @XmlElementRef(name = "pcMsjErr", namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcMsjErr;
    @XmlElementRef(name = "pcTracki", namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcTracki;
    protected Integer pnIdentificadorTipo;

    /**
     * Gets the value of the transaccionAdministrativa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransaccionAdministrativa }{@code >}
     *     
     */
    public JAXBElement<TransaccionAdministrativa> getTransaccionAdministrativa() {
        return transaccionAdministrativa;
    }

    /**
     * Sets the value of the transaccionAdministrativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransaccionAdministrativa }{@code >}
     *     
     */
    public void setTransaccionAdministrativa(JAXBElement<TransaccionAdministrativa> value) {
        this.transaccionAdministrativa = ((JAXBElement<TransaccionAdministrativa> ) value);
    }

    /**
     * Gets the value of the paLstParametrosUBA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParametrosUBA }{@code >}
     *     
     */
    public JAXBElement<ArrayOfParametrosUBA> getPaLstParametrosUBA() {
        return paLstParametrosUBA;
    }

    /**
     * Sets the value of the paLstParametrosUBA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParametrosUBA }{@code >}
     *     
     */
    public void setPaLstParametrosUBA(JAXBElement<ArrayOfParametrosUBA> value) {
        this.paLstParametrosUBA = ((JAXBElement<ArrayOfParametrosUBA> ) value);
    }

    /**
     * Gets the value of the pcCodErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCodErr() {
        return pcCodErr;
    }

    /**
     * Sets the value of the pcCodErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCodErr(JAXBElement<String> value) {
        this.pcCodErr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCodUsu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCodUsu() {
        return pcCodUsu;
    }

    /**
     * Sets the value of the pcCodUsu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCodUsu(JAXBElement<String> value) {
        this.pcCodUsu = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcMsjErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcMsjErr() {
        return pcMsjErr;
    }

    /**
     * Sets the value of the pcMsjErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcMsjErr(JAXBElement<String> value) {
        this.pcMsjErr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcTracki property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcTracki() {
        return pcTracki;
    }

    /**
     * Sets the value of the pcTracki property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcTracki(JAXBElement<String> value) {
        this.pcTracki = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pnIdentificadorTipo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPnIdentificadorTipo() {
        return pnIdentificadorTipo;
    }

    /**
     * Sets the value of the pnIdentificadorTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPnIdentificadorTipo(Integer value) {
        this.pnIdentificadorTipo = value;
    }

}
