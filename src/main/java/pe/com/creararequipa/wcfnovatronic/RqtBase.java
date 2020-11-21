
package pe.com.creararequipa.wcfnovatronic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="CodApl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodOfi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodUsu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdeSes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modifi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

    @XmlElementRef(name = "CodApl", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codApl;
    @XmlElementRef(name = "CodOfi", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codOfi;
    @XmlElementRef(name = "CodUsu", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codUsu;
    @XmlElementRef(name = "IdeSes", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ideSes;
    @XmlElement(name = "Modifi")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifi;
    @XmlElementRef(name = "TermId", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", type = JAXBElement.class, required = false)
    protected JAXBElement<String> termId;

    /**
     * Gets the value of the codApl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodApl() {
        return codApl;
    }

    /**
     * Sets the value of the codApl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodApl(JAXBElement<String> value) {
        this.codApl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codOfi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodOfi() {
        return codOfi;
    }

    /**
     * Sets the value of the codOfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodOfi(JAXBElement<String> value) {
        this.codOfi = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codUsu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodUsu() {
        return codUsu;
    }

    /**
     * Sets the value of the codUsu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodUsu(JAXBElement<String> value) {
        this.codUsu = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ideSes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdeSes() {
        return ideSes;
    }

    /**
     * Sets the value of the ideSes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdeSes(JAXBElement<String> value) {
        this.ideSes = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTermId() {
        return termId;
    }

    /**
     * Sets the value of the termId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTermId(JAXBElement<String> value) {
        this.termId = ((JAXBElement<String> ) value);
    }

}
