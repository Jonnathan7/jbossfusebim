
package pe.com.creararequipa.wcfnovatronicqa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RqtBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RqtBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodApl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodOfi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodUsu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdeSes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Modifi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TermId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RqtBase", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", propOrder = {
    "codApl",
    "codOfi",
    "codUsu",
    "ideSes",
    "modifi",
    "termId"
})
@XmlSeeAlso({
    MonitoreoFraude.class
})
public class RqtBase {

    @XmlElement(name = "CodApl", required = true)
    protected String codApl;
    @XmlElement(name = "CodOfi", required = true)
    protected String codOfi;
    @XmlElement(name = "CodUsu", required = true)
    protected String codUsu;
    @XmlElement(name = "IdeSes", required = true)
    protected String ideSes;
    @XmlElement(name = "Modifi")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifi;
    @XmlElement(name = "TermId", required = true)
    protected String termId;

    /**
     * Gets the value of the codApl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodApl() {
        return codApl;
    }

    /**
     * Sets the value of the codApl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodApl(String value) {
        this.codApl = value;
    }

    /**
     * Gets the value of the codOfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOfi() {
        return codOfi;
    }

    /**
     * Sets the value of the codOfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOfi(String value) {
        this.codOfi = value;
    }

    /**
     * Gets the value of the codUsu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUsu() {
        return codUsu;
    }

    /**
     * Sets the value of the codUsu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUsu(String value) {
        this.codUsu = value;
    }

    /**
     * Gets the value of the ideSes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdeSes() {
        return ideSes;
    }

    /**
     * Sets the value of the ideSes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdeSes(String value) {
        this.ideSes = value;
    }

    /**
     * Gets the value of the modifi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifi() {
        return modifi;
    }

    /**
     * Sets the value of the modifi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifi(XMLGregorianCalendar value) {
        this.modifi = value;
    }

    /**
     * Gets the value of the termId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermId() {
        return termId;
    }

    /**
     * Sets the value of the termId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermId(String value) {
        this.termId = value;
    }

}
