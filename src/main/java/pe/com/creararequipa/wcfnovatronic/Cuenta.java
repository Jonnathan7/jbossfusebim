
package pe.com.creararequipa.wcfnovatronic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cuenta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cuenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescriptorCuentaLinea1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescriptorCuentaLinea2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentificadorCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermiteConsultaSaldos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermiteDeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermiteRealizarTransferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermiteRecibirTransferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermiteRetiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimeraCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cuenta", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", propOrder = {
    "codigoMoneda",
    "descriptorCuentaLinea1",
    "descriptorCuentaLinea2",
    "identificadorCuenta",
    "permiteConsultaSaldos",
    "permiteDeposito",
    "permiteRealizarTransferencia",
    "permiteRecibirTransferencia",
    "permiteRetiro",
    "primeraCuenta",
    "tipoCuenta"
})
public class Cuenta {

    @XmlElementRef(name = "CodigoMoneda", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoMoneda;
    @XmlElementRef(name = "DescriptorCuentaLinea1", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptorCuentaLinea1;
    @XmlElementRef(name = "DescriptorCuentaLinea2", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptorCuentaLinea2;
    @XmlElementRef(name = "IdentificadorCuenta", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificadorCuenta;
    @XmlElementRef(name = "PermiteConsultaSaldos", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permiteConsultaSaldos;
    @XmlElementRef(name = "PermiteDeposito", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permiteDeposito;
    @XmlElementRef(name = "PermiteRealizarTransferencia", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permiteRealizarTransferencia;
    @XmlElementRef(name = "PermiteRecibirTransferencia", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permiteRecibirTransferencia;
    @XmlElementRef(name = "PermiteRetiro", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permiteRetiro;
    @XmlElementRef(name = "PrimeraCuenta", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primeraCuenta;
    @XmlElementRef(name = "TipoCuenta", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCuenta;

    /**
     * Gets the value of the codigoMoneda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Sets the value of the codigoMoneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoMoneda(JAXBElement<String> value) {
        this.codigoMoneda = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the descriptorCuentaLinea1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescriptorCuentaLinea1() {
        return descriptorCuentaLinea1;
    }

    /**
     * Sets the value of the descriptorCuentaLinea1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescriptorCuentaLinea1(JAXBElement<String> value) {
        this.descriptorCuentaLinea1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the descriptorCuentaLinea2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescriptorCuentaLinea2() {
        return descriptorCuentaLinea2;
    }

    /**
     * Sets the value of the descriptorCuentaLinea2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescriptorCuentaLinea2(JAXBElement<String> value) {
        this.descriptorCuentaLinea2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the identificadorCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificadorCuenta() {
        return identificadorCuenta;
    }

    /**
     * Sets the value of the identificadorCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificadorCuenta(JAXBElement<String> value) {
        this.identificadorCuenta = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the permiteConsultaSaldos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermiteConsultaSaldos() {
        return permiteConsultaSaldos;
    }

    /**
     * Sets the value of the permiteConsultaSaldos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermiteConsultaSaldos(JAXBElement<String> value) {
        this.permiteConsultaSaldos = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the permiteDeposito property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermiteDeposito() {
        return permiteDeposito;
    }

    /**
     * Sets the value of the permiteDeposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermiteDeposito(JAXBElement<String> value) {
        this.permiteDeposito = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the permiteRealizarTransferencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermiteRealizarTransferencia() {
        return permiteRealizarTransferencia;
    }

    /**
     * Sets the value of the permiteRealizarTransferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermiteRealizarTransferencia(JAXBElement<String> value) {
        this.permiteRealizarTransferencia = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the permiteRecibirTransferencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermiteRecibirTransferencia() {
        return permiteRecibirTransferencia;
    }

    /**
     * Sets the value of the permiteRecibirTransferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermiteRecibirTransferencia(JAXBElement<String> value) {
        this.permiteRecibirTransferencia = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the permiteRetiro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermiteRetiro() {
        return permiteRetiro;
    }

    /**
     * Sets the value of the permiteRetiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermiteRetiro(JAXBElement<String> value) {
        this.permiteRetiro = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primeraCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimeraCuenta() {
        return primeraCuenta;
    }

    /**
     * Sets the value of the primeraCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimeraCuenta(JAXBElement<String> value) {
        this.primeraCuenta = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tipoCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Sets the value of the tipoCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCuenta(JAXBElement<String> value) {
        this.tipoCuenta = ((JAXBElement<String> ) value);
    }

}
