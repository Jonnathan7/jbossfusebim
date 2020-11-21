
package pe.com.creararequipa.wcfnovatronicqa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CodigoMoneda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescriptorCuentaLinea1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescriptorCuentaLinea2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdentificadorCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PermiteConsultaSaldos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PermiteDeposito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PermiteRealizarTransferencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PermiteRecibirTransferencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PermiteRetiro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrimeraCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
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

    @XmlElement(name = "CodigoMoneda", required = true)
    protected String codigoMoneda;
    @XmlElement(name = "DescriptorCuentaLinea1", required = true)
    protected String descriptorCuentaLinea1;
    @XmlElement(name = "DescriptorCuentaLinea2", required = true)
    protected String descriptorCuentaLinea2;
    @XmlElement(name = "IdentificadorCuenta", required = true)
    protected String identificadorCuenta;
    @XmlElement(name = "PermiteConsultaSaldos", required = true)
    protected String permiteConsultaSaldos;
    @XmlElement(name = "PermiteDeposito", required = true)
    protected String permiteDeposito;
    @XmlElement(name = "PermiteRealizarTransferencia", required = true)
    protected String permiteRealizarTransferencia;
    @XmlElement(name = "PermiteRecibirTransferencia", required = true)
    protected String permiteRecibirTransferencia;
    @XmlElement(name = "PermiteRetiro", required = true)
    protected String permiteRetiro;
    @XmlElement(name = "PrimeraCuenta", required = true)
    protected String primeraCuenta;
    @XmlElement(name = "TipoCuenta", required = true)
    protected String tipoCuenta;

    /**
     * Gets the value of the codigoMoneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Sets the value of the codigoMoneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMoneda(String value) {
        this.codigoMoneda = value;
    }

    /**
     * Gets the value of the descriptorCuentaLinea1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptorCuentaLinea1() {
        return descriptorCuentaLinea1;
    }

    /**
     * Sets the value of the descriptorCuentaLinea1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptorCuentaLinea1(String value) {
        this.descriptorCuentaLinea1 = value;
    }

    /**
     * Gets the value of the descriptorCuentaLinea2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptorCuentaLinea2() {
        return descriptorCuentaLinea2;
    }

    /**
     * Sets the value of the descriptorCuentaLinea2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptorCuentaLinea2(String value) {
        this.descriptorCuentaLinea2 = value;
    }

    /**
     * Gets the value of the identificadorCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorCuenta() {
        return identificadorCuenta;
    }

    /**
     * Sets the value of the identificadorCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorCuenta(String value) {
        this.identificadorCuenta = value;
    }

    /**
     * Gets the value of the permiteConsultaSaldos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermiteConsultaSaldos() {
        return permiteConsultaSaldos;
    }

    /**
     * Sets the value of the permiteConsultaSaldos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermiteConsultaSaldos(String value) {
        this.permiteConsultaSaldos = value;
    }

    /**
     * Gets the value of the permiteDeposito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermiteDeposito() {
        return permiteDeposito;
    }

    /**
     * Sets the value of the permiteDeposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermiteDeposito(String value) {
        this.permiteDeposito = value;
    }

    /**
     * Gets the value of the permiteRealizarTransferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermiteRealizarTransferencia() {
        return permiteRealizarTransferencia;
    }

    /**
     * Sets the value of the permiteRealizarTransferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermiteRealizarTransferencia(String value) {
        this.permiteRealizarTransferencia = value;
    }

    /**
     * Gets the value of the permiteRecibirTransferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermiteRecibirTransferencia() {
        return permiteRecibirTransferencia;
    }

    /**
     * Sets the value of the permiteRecibirTransferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermiteRecibirTransferencia(String value) {
        this.permiteRecibirTransferencia = value;
    }

    /**
     * Gets the value of the permiteRetiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermiteRetiro() {
        return permiteRetiro;
    }

    /**
     * Sets the value of the permiteRetiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermiteRetiro(String value) {
        this.permiteRetiro = value;
    }

    /**
     * Gets the value of the primeraCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimeraCuenta() {
        return primeraCuenta;
    }

    /**
     * Sets the value of the primeraCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimeraCuenta(String value) {
        this.primeraCuenta = value;
    }

    /**
     * Gets the value of the tipoCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Sets the value of the tipoCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCuenta(String value) {
        this.tipoCuenta = value;
    }

}
