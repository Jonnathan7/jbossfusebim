
package pe.com.creararequipa.wcfnovatronicqa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="TransaccionAdministrativa" type="{http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA}TransaccionAdministrativa"/>
 *         &lt;element name="paLstParametrosUBA" type="{http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios}ArrayOfParametrosUBA"/>
 *         &lt;element name="pcCodErr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCodUsu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcMsjErr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcTracki" type="{http://www.w3.org/2001/XMLSchema}string"/>
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

    @XmlElement(name = "TransaccionAdministrativa", required = true)
    protected TransaccionAdministrativa transaccionAdministrativa;
    @XmlElement(required = true)
    protected ArrayOfParametrosUBA paLstParametrosUBA;
    @XmlElement(required = true)
    protected String pcCodErr;
    @XmlElement(required = true)
    protected String pcCodUsu;
    @XmlElement(required = true)
    protected String pcMsjErr;
    @XmlElement(required = true)
    protected String pcTracki;
    protected Integer pnIdentificadorTipo;

    /**
     * Gets the value of the transaccionAdministrativa property.
     * 
     * @return
     *     possible object is
     *     {@link TransaccionAdministrativa }
     *     
     */
    public TransaccionAdministrativa getTransaccionAdministrativa() {
        return transaccionAdministrativa;
    }

    /**
     * Sets the value of the transaccionAdministrativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransaccionAdministrativa }
     *     
     */
    public void setTransaccionAdministrativa(TransaccionAdministrativa value) {
        this.transaccionAdministrativa = value;
    }

    /**
     * Gets the value of the paLstParametrosUBA property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParametrosUBA }
     *     
     */
    public ArrayOfParametrosUBA getPaLstParametrosUBA() {
        return paLstParametrosUBA;
    }

    /**
     * Sets the value of the paLstParametrosUBA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParametrosUBA }
     *     
     */
    public void setPaLstParametrosUBA(ArrayOfParametrosUBA value) {
        this.paLstParametrosUBA = value;
    }

    /**
     * Gets the value of the pcCodErr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCodErr() {
        return pcCodErr;
    }

    /**
     * Sets the value of the pcCodErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCodErr(String value) {
        this.pcCodErr = value;
    }

    /**
     * Gets the value of the pcCodUsu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCodUsu() {
        return pcCodUsu;
    }

    /**
     * Sets the value of the pcCodUsu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCodUsu(String value) {
        this.pcCodUsu = value;
    }

    /**
     * Gets the value of the pcMsjErr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcMsjErr() {
        return pcMsjErr;
    }

    /**
     * Sets the value of the pcMsjErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcMsjErr(String value) {
        this.pcMsjErr = value;
    }

    /**
     * Gets the value of the pcTracki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcTracki() {
        return pcTracki;
    }

    /**
     * Sets the value of the pcTracki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcTracki(String value) {
        this.pcTracki = value;
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
