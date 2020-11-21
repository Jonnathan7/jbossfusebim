
package pe.com.creararequipa.wcfnovatronic;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MonitoreoFraude complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoreoFraude">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core}RqtBase">
 *       &lt;sequence>
 *         &lt;element name="Bin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CapacidadTerminal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CodigoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoComercio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoCondicionVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoIdAdquirente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoIdEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoMonedaTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoMonedaTran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPaisAdquirente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPaisEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPaisTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoServicio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CodigoTran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CuentaDestinoTran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CuentaOrigenAsociada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EsTarjetaEmpleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaActivacionTarjeta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaConversion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaTran" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaTransmicion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaVencTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndicadorReverso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LimiteCreditoDiario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LineaCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LocalidadComercio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModoEntradaServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MontoDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MontoTran" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MontoUnico" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NombreClienteBd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreClienteTc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreComercio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumAutorizacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumDocCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumTran" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaisOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosicionGps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimerApeClienteBd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimerNomClienteBd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RazonRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaldoDisponible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SectorComercio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegundoApeClienteBd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegundoNomClienteBd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SituacionTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelCorrespondencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelResidencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoCambio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoProductoTarjeta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TitularAdicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoreoFraude", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", propOrder = {
    "bin",
    "capacidadTerminal",
    "codigoCliente",
    "codigoComercial",
    "codigoComercio",
    "codigoCondicionVenta",
    "codigoIdAdquirente",
    "codigoIdEmisor",
    "codigoMonedaTitular",
    "codigoMonedaTran",
    "codigoPaisAdquirente",
    "codigoPaisEmisor",
    "codigoPaisTarjeta",
    "codigoRespuesta",
    "codigoServicio",
    "codigoTran",
    "cuentaDestinoTran",
    "cuentaOrigenAsociada",
    "direccion",
    "email",
    "esTarjetaEmpleado",
    "estadoCivil",
    "fechaActivacionTarjeta",
    "fechaConversion",
    "fechaNacimiento",
    "fechaTran",
    "fechaTransmicion",
    "fechaVencTarjeta",
    "idTerminal",
    "indicadorReverso",
    "limiteCreditoDiario",
    "lineaCredito",
    "localidadComercio",
    "marca",
    "modoEntradaServicio",
    "montoDolares",
    "montoTran",
    "montoUnico",
    "nombreClienteBd",
    "nombreClienteTc",
    "nombreComercio",
    "numAutorizacion",
    "numDocCliente",
    "numTarjeta",
    "numTran",
    "paisOrigen",
    "posicionGps",
    "primerApeClienteBd",
    "primerNomClienteBd",
    "razonRespuesta",
    "saldoDisponible",
    "sectorComercio",
    "segundoApeClienteBd",
    "segundoNomClienteBd",
    "situacionTarjeta",
    "telCorrespondencia",
    "telOficina",
    "telResidencia",
    "tipoCambio",
    "tipoCuenta",
    "tipoMensaje",
    "tipoProductoTarjeta",
    "titularAdicional"
})
public class MonitoreoFraude
    extends RqtBase
{

    @XmlElementRef(name = "Bin", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bin;
    @XmlElement(name = "CapacidadTerminal")
    protected Integer capacidadTerminal;
    @XmlElementRef(name = "CodigoCliente", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoCliente;
    @XmlElementRef(name = "CodigoComercial", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoComercial;
    @XmlElementRef(name = "CodigoComercio", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoComercio;
    @XmlElementRef(name = "CodigoCondicionVenta", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoCondicionVenta;
    @XmlElementRef(name = "CodigoIdAdquirente", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoIdAdquirente;
    @XmlElementRef(name = "CodigoIdEmisor", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoIdEmisor;
    @XmlElementRef(name = "CodigoMonedaTitular", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoMonedaTitular;
    @XmlElementRef(name = "CodigoMonedaTran", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoMonedaTran;
    @XmlElementRef(name = "CodigoPaisAdquirente", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPaisAdquirente;
    @XmlElementRef(name = "CodigoPaisEmisor", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPaisEmisor;
    @XmlElementRef(name = "CodigoPaisTarjeta", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPaisTarjeta;
    @XmlElementRef(name = "CodigoRespuesta", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoRespuesta;
    @XmlElement(name = "CodigoServicio")
    protected Integer codigoServicio;
    @XmlElementRef(name = "CodigoTran", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTran;
    @XmlElementRef(name = "CuentaDestinoTran", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuentaDestinoTran;
    @XmlElementRef(name = "CuentaOrigenAsociada", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuentaOrigenAsociada;
    @XmlElementRef(name = "Direccion", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccion;
    @XmlElementRef(name = "Email", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "EsTarjetaEmpleado", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> esTarjetaEmpleado;
    @XmlElementRef(name = "EstadoCivil", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoCivil;
    @XmlElementRef(name = "FechaActivacionTarjeta", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaActivacionTarjeta;
    @XmlElementRef(name = "FechaConversion", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaConversion;
    @XmlElementRef(name = "FechaNacimiento", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaNacimiento;
    @XmlElement(name = "FechaTran")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTran;
    @XmlElement(name = "FechaTransmicion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTransmicion;
    @XmlElementRef(name = "FechaVencTarjeta", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaVencTarjeta;
    @XmlElementRef(name = "IdTerminal", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idTerminal;
    @XmlElementRef(name = "IndicadorReverso", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadorReverso;
    @XmlElement(name = "LimiteCreditoDiario")
    protected BigDecimal limiteCreditoDiario;
    @XmlElement(name = "LineaCredito")
    protected BigDecimal lineaCredito;
    @XmlElementRef(name = "LocalidadComercio", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localidadComercio;
    @XmlElementRef(name = "Marca", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marca;
    @XmlElementRef(name = "ModoEntradaServicio", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modoEntradaServicio;
    @XmlElement(name = "MontoDolares")
    protected BigDecimal montoDolares;
    @XmlElement(name = "MontoTran")
    protected BigDecimal montoTran;
    @XmlElement(name = "MontoUnico")
    protected BigDecimal montoUnico;
    @XmlElementRef(name = "NombreClienteBd", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreClienteBd;
    @XmlElementRef(name = "NombreClienteTc", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreClienteTc;
    @XmlElementRef(name = "NombreComercio", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreComercio;
    @XmlElement(name = "NumAutorizacion")
    protected Integer numAutorizacion;
    @XmlElementRef(name = "NumDocCliente", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numDocCliente;
    @XmlElementRef(name = "NumTarjeta", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numTarjeta;
    @XmlElement(name = "NumTran")
    protected Integer numTran;
    @XmlElementRef(name = "PaisOrigen", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paisOrigen;
    @XmlElementRef(name = "PosicionGps", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posicionGps;
    @XmlElementRef(name = "PrimerApeClienteBd", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primerApeClienteBd;
    @XmlElementRef(name = "PrimerNomClienteBd", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primerNomClienteBd;
    @XmlElementRef(name = "RazonRespuesta", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> razonRespuesta;
    @XmlElement(name = "SaldoDisponible")
    protected BigDecimal saldoDisponible;
    @XmlElement(name = "SectorComercio")
    protected Integer sectorComercio;
    @XmlElementRef(name = "SegundoApeClienteBd", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoApeClienteBd;
    @XmlElementRef(name = "SegundoNomClienteBd", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoNomClienteBd;
    @XmlElementRef(name = "SituacionTarjeta", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> situacionTarjeta;
    @XmlElementRef(name = "TelCorrespondencia", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telCorrespondencia;
    @XmlElementRef(name = "TelOficina", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telOficina;
    @XmlElementRef(name = "TelResidencia", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telResidencia;
    @XmlElement(name = "TipoCambio")
    protected BigDecimal tipoCambio;
    @XmlElementRef(name = "TipoCuenta", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCuenta;
    @XmlElementRef(name = "TipoMensaje", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoMensaje;
    @XmlElement(name = "TipoProductoTarjeta")
    protected Integer tipoProductoTarjeta;
    @XmlElementRef(name = "TitularAdicional", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titularAdicional;

    /**
     * Gets the value of the bin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBin() {
        return bin;
    }

    /**
     * Sets the value of the bin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBin(JAXBElement<String> value) {
        this.bin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the capacidadTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapacidadTerminal() {
        return capacidadTerminal;
    }

    /**
     * Sets the value of the capacidadTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapacidadTerminal(Integer value) {
        this.capacidadTerminal = value;
    }

    /**
     * Gets the value of the codigoCliente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Sets the value of the codigoCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoCliente(JAXBElement<String> value) {
        this.codigoCliente = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codigoComercial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoComercial() {
        return codigoComercial;
    }

    /**
     * Sets the value of the codigoComercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoComercial(JAXBElement<String> value) {
        this.codigoComercial = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codigoComercio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoComercio() {
        return codigoComercio;
    }

    /**
     * Sets the value of the codigoComercio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoComercio(JAXBElement<String> value) {
        this.codigoComercio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codigoCondicionVenta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoCondicionVenta() {
        return codigoCondicionVenta;
    }

    /**
     * Sets the value of the codigoCondicionVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoCondicionVenta(JAXBElement<String> value) {
        this.codigoCondicionVenta = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codigoIdAdquirente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoIdAdquirente() {
        return codigoIdAdquirente;
    }

    /**
     * Sets the value of the codigoIdAdquirente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoIdAdquirente(JAXBElement<String> value) {
        this.codigoIdAdquirente = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codigoIdEmisor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoIdEmisor() {
        return codigoIdEmisor;
    }

    /**
     * Sets the value of the codigoIdEmisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoIdEmisor(JAXBElement<String> value) {
        this.codigoIdEmisor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codigoMonedaTitular property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoMonedaTitular() {
        return codigoMonedaTitular;
    }

    /**
     * Sets the value of the codigoMonedaTitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoMonedaTitular(JAXBElement<String> value) {
        this.codigoMonedaTitular = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codigoMonedaTran property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoMonedaTran() {
        return codigoMonedaTran;
    }

    /**
     * Sets the value of the codigoMonedaTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoMonedaTran(JAXBElement<String> value) {
        this.codigoMonedaTran = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codigoPaisAdquirente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPaisAdquirente() {
        return codigoPaisAdquirente;
    }

    /**
     * Sets the value of the codigoPaisAdquirente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPaisAdquirente(JAXBElement<String> value) {
        this.codigoPaisAdquirente = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codigoPaisEmisor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPaisEmisor() {
        return codigoPaisEmisor;
    }

    /**
     * Sets the value of the codigoPaisEmisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPaisEmisor(JAXBElement<String> value) {
        this.codigoPaisEmisor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codigoPaisTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPaisTarjeta() {
        return codigoPaisTarjeta;
    }

    /**
     * Sets the value of the codigoPaisTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPaisTarjeta(JAXBElement<String> value) {
        this.codigoPaisTarjeta = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codigoRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Sets the value of the codigoRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoRespuesta(JAXBElement<String> value) {
        this.codigoRespuesta = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codigoServicio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoServicio() {
        return codigoServicio;
    }

    /**
     * Sets the value of the codigoServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoServicio(Integer value) {
        this.codigoServicio = value;
    }

    /**
     * Gets the value of the codigoTran property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTran() {
        return codigoTran;
    }

    /**
     * Sets the value of the codigoTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTran(JAXBElement<String> value) {
        this.codigoTran = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cuentaDestinoTran property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCuentaDestinoTran() {
        return cuentaDestinoTran;
    }

    /**
     * Sets the value of the cuentaDestinoTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCuentaDestinoTran(JAXBElement<String> value) {
        this.cuentaDestinoTran = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cuentaOrigenAsociada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCuentaOrigenAsociada() {
        return cuentaOrigenAsociada;
    }

    /**
     * Sets the value of the cuentaOrigenAsociada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCuentaOrigenAsociada(JAXBElement<String> value) {
        this.cuentaOrigenAsociada = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccion(JAXBElement<String> value) {
        this.direccion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the esTarjetaEmpleado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEsTarjetaEmpleado() {
        return esTarjetaEmpleado;
    }

    /**
     * Sets the value of the esTarjetaEmpleado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEsTarjetaEmpleado(JAXBElement<String> value) {
        this.esTarjetaEmpleado = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the estadoCivil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Sets the value of the estadoCivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoCivil(JAXBElement<String> value) {
        this.estadoCivil = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fechaActivacionTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaActivacionTarjeta() {
        return fechaActivacionTarjeta;
    }

    /**
     * Sets the value of the fechaActivacionTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaActivacionTarjeta(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaActivacionTarjeta = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the fechaConversion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaConversion() {
        return fechaConversion;
    }

    /**
     * Sets the value of the fechaConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaConversion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaConversion = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaNacimiento(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaNacimiento = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the fechaTran property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTran() {
        return fechaTran;
    }

    /**
     * Sets the value of the fechaTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTran(XMLGregorianCalendar value) {
        this.fechaTran = value;
    }

    /**
     * Gets the value of the fechaTransmicion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTransmicion() {
        return fechaTransmicion;
    }

    /**
     * Sets the value of the fechaTransmicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTransmicion(XMLGregorianCalendar value) {
        this.fechaTransmicion = value;
    }

    /**
     * Gets the value of the fechaVencTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaVencTarjeta() {
        return fechaVencTarjeta;
    }

    /**
     * Sets the value of the fechaVencTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaVencTarjeta(JAXBElement<String> value) {
        this.fechaVencTarjeta = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdTerminal() {
        return idTerminal;
    }

    /**
     * Sets the value of the idTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdTerminal(JAXBElement<String> value) {
        this.idTerminal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indicadorReverso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorReverso() {
        return indicadorReverso;
    }

    /**
     * Sets the value of the indicadorReverso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorReverso(JAXBElement<String> value) {
        this.indicadorReverso = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the limiteCreditoDiario property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLimiteCreditoDiario() {
        return limiteCreditoDiario;
    }

    /**
     * Sets the value of the limiteCreditoDiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLimiteCreditoDiario(BigDecimal value) {
        this.limiteCreditoDiario = value;
    }

    /**
     * Gets the value of the lineaCredito property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineaCredito() {
        return lineaCredito;
    }

    /**
     * Sets the value of the lineaCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineaCredito(BigDecimal value) {
        this.lineaCredito = value;
    }

    /**
     * Gets the value of the localidadComercio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalidadComercio() {
        return localidadComercio;
    }

    /**
     * Sets the value of the localidadComercio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalidadComercio(JAXBElement<String> value) {
        this.localidadComercio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the marca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarca() {
        return marca;
    }

    /**
     * Sets the value of the marca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarca(JAXBElement<String> value) {
        this.marca = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the modoEntradaServicio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModoEntradaServicio() {
        return modoEntradaServicio;
    }

    /**
     * Sets the value of the modoEntradaServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModoEntradaServicio(JAXBElement<String> value) {
        this.modoEntradaServicio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the montoDolares property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoDolares() {
        return montoDolares;
    }

    /**
     * Sets the value of the montoDolares property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoDolares(BigDecimal value) {
        this.montoDolares = value;
    }

    /**
     * Gets the value of the montoTran property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTran() {
        return montoTran;
    }

    /**
     * Sets the value of the montoTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTran(BigDecimal value) {
        this.montoTran = value;
    }

    /**
     * Gets the value of the montoUnico property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoUnico() {
        return montoUnico;
    }

    /**
     * Sets the value of the montoUnico property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoUnico(BigDecimal value) {
        this.montoUnico = value;
    }

    /**
     * Gets the value of the nombreClienteBd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreClienteBd() {
        return nombreClienteBd;
    }

    /**
     * Sets the value of the nombreClienteBd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreClienteBd(JAXBElement<String> value) {
        this.nombreClienteBd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nombreClienteTc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreClienteTc() {
        return nombreClienteTc;
    }

    /**
     * Sets the value of the nombreClienteTc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreClienteTc(JAXBElement<String> value) {
        this.nombreClienteTc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nombreComercio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreComercio() {
        return nombreComercio;
    }

    /**
     * Sets the value of the nombreComercio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreComercio(JAXBElement<String> value) {
        this.nombreComercio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numAutorizacion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumAutorizacion() {
        return numAutorizacion;
    }

    /**
     * Sets the value of the numAutorizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumAutorizacion(Integer value) {
        this.numAutorizacion = value;
    }

    /**
     * Gets the value of the numDocCliente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumDocCliente() {
        return numDocCliente;
    }

    /**
     * Sets the value of the numDocCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumDocCliente(JAXBElement<String> value) {
        this.numDocCliente = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * Sets the value of the numTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumTarjeta(JAXBElement<String> value) {
        this.numTarjeta = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numTran property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumTran() {
        return numTran;
    }

    /**
     * Sets the value of the numTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumTran(Integer value) {
        this.numTran = value;
    }

    /**
     * Gets the value of the paisOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * Sets the value of the paisOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaisOrigen(JAXBElement<String> value) {
        this.paisOrigen = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the posicionGps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosicionGps() {
        return posicionGps;
    }

    /**
     * Sets the value of the posicionGps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosicionGps(JAXBElement<String> value) {
        this.posicionGps = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primerApeClienteBd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimerApeClienteBd() {
        return primerApeClienteBd;
    }

    /**
     * Sets the value of the primerApeClienteBd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimerApeClienteBd(JAXBElement<String> value) {
        this.primerApeClienteBd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primerNomClienteBd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimerNomClienteBd() {
        return primerNomClienteBd;
    }

    /**
     * Sets the value of the primerNomClienteBd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimerNomClienteBd(JAXBElement<String> value) {
        this.primerNomClienteBd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the razonRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRazonRespuesta() {
        return razonRespuesta;
    }

    /**
     * Sets the value of the razonRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRazonRespuesta(JAXBElement<String> value) {
        this.razonRespuesta = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the saldoDisponible property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoDisponible() {
        return saldoDisponible;
    }

    /**
     * Sets the value of the saldoDisponible property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoDisponible(BigDecimal value) {
        this.saldoDisponible = value;
    }

    /**
     * Gets the value of the sectorComercio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSectorComercio() {
        return sectorComercio;
    }

    /**
     * Sets the value of the sectorComercio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSectorComercio(Integer value) {
        this.sectorComercio = value;
    }

    /**
     * Gets the value of the segundoApeClienteBd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoApeClienteBd() {
        return segundoApeClienteBd;
    }

    /**
     * Sets the value of the segundoApeClienteBd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoApeClienteBd(JAXBElement<String> value) {
        this.segundoApeClienteBd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the segundoNomClienteBd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoNomClienteBd() {
        return segundoNomClienteBd;
    }

    /**
     * Sets the value of the segundoNomClienteBd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoNomClienteBd(JAXBElement<String> value) {
        this.segundoNomClienteBd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the situacionTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSituacionTarjeta() {
        return situacionTarjeta;
    }

    /**
     * Sets the value of the situacionTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSituacionTarjeta(JAXBElement<String> value) {
        this.situacionTarjeta = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the telCorrespondencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelCorrespondencia() {
        return telCorrespondencia;
    }

    /**
     * Sets the value of the telCorrespondencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelCorrespondencia(JAXBElement<String> value) {
        this.telCorrespondencia = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the telOficina property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelOficina() {
        return telOficina;
    }

    /**
     * Sets the value of the telOficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelOficina(JAXBElement<String> value) {
        this.telOficina = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the telResidencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelResidencia() {
        return telResidencia;
    }

    /**
     * Sets the value of the telResidencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelResidencia(JAXBElement<String> value) {
        this.telResidencia = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tipoCambio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Sets the value of the tipoCambio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoCambio(BigDecimal value) {
        this.tipoCambio = value;
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

    /**
     * Gets the value of the tipoMensaje property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoMensaje() {
        return tipoMensaje;
    }

    /**
     * Sets the value of the tipoMensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoMensaje(JAXBElement<String> value) {
        this.tipoMensaje = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tipoProductoTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoProductoTarjeta() {
        return tipoProductoTarjeta;
    }

    /**
     * Sets the value of the tipoProductoTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoProductoTarjeta(Integer value) {
        this.tipoProductoTarjeta = value;
    }

    /**
     * Gets the value of the titularAdicional property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitularAdicional() {
        return titularAdicional;
    }

    /**
     * Sets the value of the titularAdicional property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitularAdicional(JAXBElement<String> value) {
        this.titularAdicional = ((JAXBElement<String> ) value);
    }

}
