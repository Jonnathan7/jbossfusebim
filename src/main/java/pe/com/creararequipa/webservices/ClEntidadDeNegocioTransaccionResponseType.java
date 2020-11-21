
package pe.com.creararequipa.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clEntidadDeNegocioTransaccionResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clEntidadDeNegocioTransaccionResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pcNroDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pcFecMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clEntidadDeNegocioTransaccionResponseType", propOrder = {
    "pcNroDoc",
    "pcFecMod"
})
public class ClEntidadDeNegocioTransaccionResponseType {

    protected String pcNroDoc;
    protected String pcFecMod;

    /**
     * Obtiene el valor de la propiedad pcNroDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcNroDoc() {
        return pcNroDoc;
    }

    /**
     * Define el valor de la propiedad pcNroDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcNroDoc(String value) {
        this.pcNroDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad pcFecMod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcFecMod() {
        return pcFecMod;
    }

    /**
     * Define el valor de la propiedad pcFecMod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcFecMod(String value) {
        this.pcFecMod = value;
    }

}
