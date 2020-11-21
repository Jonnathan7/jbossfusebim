
package pe.com.creararequipa.wcfnovatronicqa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCuenta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCuenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cuenta" type="{http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA}Cuenta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCuenta", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", propOrder = {
    "cuenta"
})
public class ArrayOfCuenta {

    @XmlElement(name = "Cuenta", nillable = true)
    protected List<Cuenta> cuenta;

    /**
     * Gets the value of the cuenta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuenta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuenta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cuenta }
     * 
     * 
     */
    public List<Cuenta> getCuenta() {
        if (cuenta == null) {
            cuenta = new ArrayList<Cuenta>();
        }
        return this.cuenta;
    }

}
