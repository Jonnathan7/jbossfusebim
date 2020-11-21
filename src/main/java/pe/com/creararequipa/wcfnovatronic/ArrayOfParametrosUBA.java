
package pe.com.creararequipa.wcfnovatronic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfParametrosUBA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfParametrosUBA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParametrosUBA" type="{http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios}ParametrosUBA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfParametrosUBA", namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", propOrder = {
    "parametrosUBA"
})
public class ArrayOfParametrosUBA {

    @XmlElement(name = "ParametrosUBA", nillable = true)
    protected List<ParametrosUBA> parametrosUBA;

    /**
     * Gets the value of the parametrosUBA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametrosUBA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametrosUBA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametrosUBA }
     * 
     * 
     */
    public List<ParametrosUBA> getParametrosUBA() {
        if (parametrosUBA == null) {
            parametrosUBA = new ArrayList<ParametrosUBA>();
        }
        return this.parametrosUBA;
    }

}
