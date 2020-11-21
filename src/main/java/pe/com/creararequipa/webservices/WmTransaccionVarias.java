
package pe.com.creararequipa.webservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tcCodTrx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tcLlave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tcIdenti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tnMonto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="tcMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tcIdSess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tcCodCli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tcOfiLla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tcError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tcCodTrx",
    "tcLlave",
    "tcIdenti",
    "tnMonto",
    "tcMoneda",
    "tcIdSess",
    "tcCodCli",
    "tcOfiLla",
    "tcError"
})
@XmlRootElement(name = "wmTransaccionVarias")
public class WmTransaccionVarias {

    protected String tcCodTrx;
    protected String tcLlave;
    protected String tcIdenti;
    @XmlElement(required = true)
    protected BigDecimal tnMonto;
    protected String tcMoneda;
    protected String tcIdSess;
    protected String tcCodCli;
    protected String tcOfiLla;
    protected String tcError;

    /**
     * Obtiene el valor de la propiedad tcCodTrx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcCodTrx() {
        return tcCodTrx;
    }

    /**
     * Define el valor de la propiedad tcCodTrx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcCodTrx(String value) {
        this.tcCodTrx = value;
    }

    /**
     * Obtiene el valor de la propiedad tcLlave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcLlave() {
        return tcLlave;
    }

    /**
     * Define el valor de la propiedad tcLlave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcLlave(String value) {
        this.tcLlave = value;
    }

    /**
     * Obtiene el valor de la propiedad tcIdenti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcIdenti() {
        return tcIdenti;
    }

    /**
     * Define el valor de la propiedad tcIdenti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcIdenti(String value) {
        this.tcIdenti = value;
    }

    /**
     * Obtiene el valor de la propiedad tnMonto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTnMonto() {
        return tnMonto;
    }

    /**
     * Define el valor de la propiedad tnMonto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTnMonto(BigDecimal value) {
        this.tnMonto = value;
    }

    /**
     * Obtiene el valor de la propiedad tcMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcMoneda() {
        return tcMoneda;
    }

    /**
     * Define el valor de la propiedad tcMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcMoneda(String value) {
        this.tcMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad tcIdSess.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcIdSess() {
        return tcIdSess;
    }

    /**
     * Define el valor de la propiedad tcIdSess.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcIdSess(String value) {
        this.tcIdSess = value;
    }

    /**
     * Obtiene el valor de la propiedad tcCodCli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcCodCli() {
        return tcCodCli;
    }

    /**
     * Define el valor de la propiedad tcCodCli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcCodCli(String value) {
        this.tcCodCli = value;
    }

    /**
     * Obtiene el valor de la propiedad tcOfiLla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcOfiLla() {
        return tcOfiLla;
    }

    /**
     * Define el valor de la propiedad tcOfiLla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcOfiLla(String value) {
        this.tcOfiLla = value;
    }

    /**
     * Obtiene el valor de la propiedad tcError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcError() {
        return tcError;
    }

    /**
     * Define el valor de la propiedad tcError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcError(String value) {
        this.tcError = value;
    }

}
