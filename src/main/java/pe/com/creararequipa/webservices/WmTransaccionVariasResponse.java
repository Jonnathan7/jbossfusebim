
package pe.com.creararequipa.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="wmTransaccionVariasResult" type="{http://www.creararequipa.com.pe/webservices}clEntidadDeNegocioTransaccionResponseType" minOccurs="0"/&gt;
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
    "wmTransaccionVariasResult",
    "tcError"
})
@XmlRootElement(name = "wmTransaccionVariasResponse")
public class WmTransaccionVariasResponse {

    protected ClEntidadDeNegocioTransaccionResponseType wmTransaccionVariasResult;
    protected String tcError;

    /**
     * Obtiene el valor de la propiedad wmTransaccionVariasResult.
     * 
     * @return
     *     possible object is
     *     {@link ClEntidadDeNegocioTransaccionResponseType }
     *     
     */
    public ClEntidadDeNegocioTransaccionResponseType getWmTransaccionVariasResult() {
        return wmTransaccionVariasResult;
    }

    /**
     * Define el valor de la propiedad wmTransaccionVariasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ClEntidadDeNegocioTransaccionResponseType }
     *     
     */
    public void setWmTransaccionVariasResult(ClEntidadDeNegocioTransaccionResponseType value) {
        this.wmTransaccionVariasResult = value;
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
