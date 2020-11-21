
package pe.com.creararequipa.wcfnovatronicqa;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Bin" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CapacidadTerminal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="CodigoCliente" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CodigoComercial" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CodigoComercio" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CodigoCondicionVenta" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CodigoIdAdquirente" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CodigoIdEmisor" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CodigoMonedaTitular" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CodigoMonedaTran" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CodigoPaisAdquirente" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CodigoPaisEmisor" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CodigoPaisTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CodigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CodigoServicio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="CodigoTran" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CuentaDestinoTran" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CuentaOrigenAsociada" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="EsTarjetaEmpleado" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="EstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="FechaActivacionTarjeta" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" form="qualified"/>
 *         &lt;element name="FechaConversion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" form="qualified"/>
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" form="qualified"/>
 *         &lt;element name="FechaTran" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="FechaTransmicion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="FechaVencTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="IdTerminal" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="IndicadorReverso" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="LimiteCreditoDiario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LineaCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LocalidadComercio" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Marca" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="ModoEntradaServicio" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="MontoDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MontoTran" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MontoUnico" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="NombreClienteBd" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="NombreClienteTc" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="NombreComercio" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="NumAutorizacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="NumDocCliente" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="NumTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="NumTran" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="PaisOrigen" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="PosicionGps" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="PrimerApeClienteBd" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="PrimerNomClienteBd" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="RazonRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="SaldoDisponible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SectorComercio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="SegundoApeClienteBd" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="SegundoNomClienteBd" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="SituacionTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TelCorrespondencia" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TelOficina" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TelResidencia" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TipoCambio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TipoMensaje" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TipoProductoTarjeta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="TitularAdicional" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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

    @XmlElement(name = "Bin", required = true)
    protected String bin;
    @XmlElement(name = "CapacidadTerminal")
    protected Integer capacidadTerminal;
    @XmlElement(name = "CodigoCliente", required = true)
    protected String codigoCliente;
    @XmlElement(name = "CodigoComercial", required = true)
    protected String codigoComercial;
    @XmlElement(name = "CodigoComercio", required = true)
    protected String codigoComercio;
    @XmlElement(name = "CodigoCondicionVenta", required = true)
    protected String codigoCondicionVenta;
    @XmlElement(name = "CodigoIdAdquirente", required = true)
    protected String codigoIdAdquirente;
    @XmlElement(name = "CodigoIdEmisor", required = true)
    protected String codigoIdEmisor;
    @XmlElement(name = "CodigoMonedaTitular", required = true)
    protected String codigoMonedaTitular;
    @XmlElement(name = "CodigoMonedaTran", required = true)
    protected String codigoMonedaTran;
    @XmlElement(name = "CodigoPaisAdquirente", required = true)
    protected String codigoPaisAdquirente;
    @XmlElement(name = "CodigoPaisEmisor", required = true)
    protected String codigoPaisEmisor;
    @XmlElement(name = "CodigoPaisTarjeta", required = true)
    protected String codigoPaisTarjeta;
    @XmlElement(name = "CodigoRespuesta", required = true)
    protected String codigoRespuesta;
    @XmlElement(name = "CodigoServicio")
    protected Integer codigoServicio;
    @XmlElement(name = "CodigoTran", required = true)
    protected String codigoTran;
    @XmlElement(name = "CuentaDestinoTran", required = true)
    protected String cuentaDestinoTran;
    @XmlElement(name = "CuentaOrigenAsociada", required = true)
    protected String cuentaOrigenAsociada;
    @XmlElement(name = "Direccion", required = true)
    protected String direccion;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "EsTarjetaEmpleado", required = true)
    protected String esTarjetaEmpleado;
    @XmlElement(name = "EstadoCivil", required = true)
    protected String estadoCivil;
    @XmlElement(name = "FechaActivacionTarjeta", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object fechaActivacionTarjeta;
    @XmlElement(name = "FechaConversion", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object fechaConversion;
    @XmlElement(name = "FechaNacimiento", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object fechaNacimiento;
    @XmlElement(name = "FechaTran")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTran;
    @XmlElement(name = "FechaTransmicion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTransmicion;
    @XmlElement(name = "FechaVencTarjeta", required = true)
    protected String fechaVencTarjeta;
    @XmlElement(name = "IdTerminal", required = true)
    protected String idTerminal;
    @XmlElement(name = "IndicadorReverso", required = true)
    protected String indicadorReverso;
    @XmlElement(name = "LimiteCreditoDiario")
    protected BigDecimal limiteCreditoDiario;
    @XmlElement(name = "LineaCredito")
    protected BigDecimal lineaCredito;
    @XmlElement(name = "LocalidadComercio", required = true)
    protected String localidadComercio;
    @XmlElement(name = "Marca", required = true)
    protected String marca;
    @XmlElement(name = "ModoEntradaServicio", required = true)
    protected String modoEntradaServicio;
    @XmlElement(name = "MontoDolares")
    protected BigDecimal montoDolares;
    @XmlElement(name = "MontoTran")
    protected BigDecimal montoTran;
    @XmlElement(name = "MontoUnico")
    protected BigDecimal montoUnico;
    @XmlElement(name = "NombreClienteBd", required = true)
    protected String nombreClienteBd;
    @XmlElement(name = "NombreClienteTc", required = true)
    protected String nombreClienteTc;
    @XmlElement(name = "NombreComercio", required = true)
    protected String nombreComercio;
    @XmlElement(name = "NumAutorizacion")
    protected Integer numAutorizacion;
    @XmlElement(name = "NumDocCliente", required = true)
    protected String numDocCliente;
    @XmlElement(name = "NumTarjeta", required = true)
    protected String numTarjeta;
    @XmlElement(name = "NumTran")
    protected Integer numTran;
    @XmlElement(name = "PaisOrigen", required = true)
    protected String paisOrigen;
    @XmlElement(name = "PosicionGps", required = true)
    protected String posicionGps;
    @XmlElement(name = "PrimerApeClienteBd", required = true)
    protected String primerApeClienteBd;
    @XmlElement(name = "PrimerNomClienteBd", required = true)
    protected String primerNomClienteBd;
    @XmlElement(name = "RazonRespuesta", required = true)
    protected String razonRespuesta;
    @XmlElement(name = "SaldoDisponible")
    protected BigDecimal saldoDisponible;
    @XmlElement(name = "SectorComercio")
    protected Integer sectorComercio;
    @XmlElement(name = "SegundoApeClienteBd", required = true)
    protected String segundoApeClienteBd;
    @XmlElement(name = "SegundoNomClienteBd", required = true)
    protected String segundoNomClienteBd;
    @XmlElement(name = "SituacionTarjeta", required = true)
    protected String situacionTarjeta;
    @XmlElement(name = "TelCorrespondencia", required = true)
    protected String telCorrespondencia;
    @XmlElement(name = "TelOficina", required = true)
    protected String telOficina;
    @XmlElement(name = "TelResidencia", required = true)
    protected String telResidencia;
    @XmlElement(name = "TipoCambio")
    protected BigDecimal tipoCambio;
    @XmlElement(name = "TipoCuenta", required = true)
    protected String tipoCuenta;
    @XmlElement(name = "TipoMensaje", required = true)
    protected String tipoMensaje;
    @XmlElement(name = "TipoProductoTarjeta")
    protected Integer tipoProductoTarjeta;
    @XmlElement(name = "TitularAdicional", required = true)
    protected String titularAdicional;

    /**
     * Gets the value of the bin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBin() {
        return bin;
    }

    /**
     * Sets the value of the bin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBin(String value) {
        this.bin = value;
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
     *     {@link String }
     *     
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Sets the value of the codigoCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCliente(String value) {
        this.codigoCliente = value;
    }

    /**
     * Gets the value of the codigoComercial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoComercial() {
        return codigoComercial;
    }

    /**
     * Sets the value of the codigoComercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoComercial(String value) {
        this.codigoComercial = value;
    }

    /**
     * Gets the value of the codigoComercio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoComercio() {
        return codigoComercio;
    }

    /**
     * Sets the value of the codigoComercio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoComercio(String value) {
        this.codigoComercio = value;
    }

    /**
     * Gets the value of the codigoCondicionVenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCondicionVenta() {
        return codigoCondicionVenta;
    }

    /**
     * Sets the value of the codigoCondicionVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCondicionVenta(String value) {
        this.codigoCondicionVenta = value;
    }

    /**
     * Gets the value of the codigoIdAdquirente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIdAdquirente() {
        return codigoIdAdquirente;
    }

    /**
     * Sets the value of the codigoIdAdquirente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIdAdquirente(String value) {
        this.codigoIdAdquirente = value;
    }

    /**
     * Gets the value of the codigoIdEmisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIdEmisor() {
        return codigoIdEmisor;
    }

    /**
     * Sets the value of the codigoIdEmisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIdEmisor(String value) {
        this.codigoIdEmisor = value;
    }

    /**
     * Gets the value of the codigoMonedaTitular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMonedaTitular() {
        return codigoMonedaTitular;
    }

    /**
     * Sets the value of the codigoMonedaTitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMonedaTitular(String value) {
        this.codigoMonedaTitular = value;
    }

    /**
     * Gets the value of the codigoMonedaTran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMonedaTran() {
        return codigoMonedaTran;
    }

    /**
     * Sets the value of the codigoMonedaTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMonedaTran(String value) {
        this.codigoMonedaTran = value;
    }

    /**
     * Gets the value of the codigoPaisAdquirente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPaisAdquirente() {
        return codigoPaisAdquirente;
    }

    /**
     * Sets the value of the codigoPaisAdquirente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPaisAdquirente(String value) {
        this.codigoPaisAdquirente = value;
    }

    /**
     * Gets the value of the codigoPaisEmisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPaisEmisor() {
        return codigoPaisEmisor;
    }

    /**
     * Sets the value of the codigoPaisEmisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPaisEmisor(String value) {
        this.codigoPaisEmisor = value;
    }

    /**
     * Gets the value of the codigoPaisTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPaisTarjeta() {
        return codigoPaisTarjeta;
    }

    /**
     * Sets the value of the codigoPaisTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPaisTarjeta(String value) {
        this.codigoPaisTarjeta = value;
    }

    /**
     * Gets the value of the codigoRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Sets the value of the codigoRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRespuesta(String value) {
        this.codigoRespuesta = value;
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
     *     {@link String }
     *     
     */
    public String getCodigoTran() {
        return codigoTran;
    }

    /**
     * Sets the value of the codigoTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTran(String value) {
        this.codigoTran = value;
    }

    /**
     * Gets the value of the cuentaDestinoTran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaDestinoTran() {
        return cuentaDestinoTran;
    }

    /**
     * Sets the value of the cuentaDestinoTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaDestinoTran(String value) {
        this.cuentaDestinoTran = value;
    }

    /**
     * Gets the value of the cuentaOrigenAsociada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaOrigenAsociada() {
        return cuentaOrigenAsociada;
    }

    /**
     * Sets the value of the cuentaOrigenAsociada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaOrigenAsociada(String value) {
        this.cuentaOrigenAsociada = value;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the esTarjetaEmpleado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsTarjetaEmpleado() {
        return esTarjetaEmpleado;
    }

    /**
     * Sets the value of the esTarjetaEmpleado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsTarjetaEmpleado(String value) {
        this.esTarjetaEmpleado = value;
    }

    /**
     * Gets the value of the estadoCivil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Sets the value of the estadoCivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
    }

    /**
     * Gets the value of the fechaActivacionTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFechaActivacionTarjeta() {
        return fechaActivacionTarjeta;
    }

    /**
     * Sets the value of the fechaActivacionTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFechaActivacionTarjeta(Object value) {
        this.fechaActivacionTarjeta = value;
    }

    /**
     * Gets the value of the fechaConversion property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFechaConversion() {
        return fechaConversion;
    }

    /**
     * Sets the value of the fechaConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFechaConversion(Object value) {
        this.fechaConversion = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFechaNacimiento(Object value) {
        this.fechaNacimiento = value;
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
     *     {@link String }
     *     
     */
    public String getFechaVencTarjeta() {
        return fechaVencTarjeta;
    }

    /**
     * Sets the value of the fechaVencTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencTarjeta(String value) {
        this.fechaVencTarjeta = value;
    }

    /**
     * Gets the value of the idTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTerminal() {
        return idTerminal;
    }

    /**
     * Sets the value of the idTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTerminal(String value) {
        this.idTerminal = value;
    }

    /**
     * Gets the value of the indicadorReverso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorReverso() {
        return indicadorReverso;
    }

    /**
     * Sets the value of the indicadorReverso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorReverso(String value) {
        this.indicadorReverso = value;
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
     *     {@link String }
     *     
     */
    public String getLocalidadComercio() {
        return localidadComercio;
    }

    /**
     * Sets the value of the localidadComercio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidadComercio(String value) {
        this.localidadComercio = value;
    }

    /**
     * Gets the value of the marca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Sets the value of the marca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Gets the value of the modoEntradaServicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModoEntradaServicio() {
        return modoEntradaServicio;
    }

    /**
     * Sets the value of the modoEntradaServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModoEntradaServicio(String value) {
        this.modoEntradaServicio = value;
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
     *     {@link String }
     *     
     */
    public String getNombreClienteBd() {
        return nombreClienteBd;
    }

    /**
     * Sets the value of the nombreClienteBd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreClienteBd(String value) {
        this.nombreClienteBd = value;
    }

    /**
     * Gets the value of the nombreClienteTc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreClienteTc() {
        return nombreClienteTc;
    }

    /**
     * Sets the value of the nombreClienteTc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreClienteTc(String value) {
        this.nombreClienteTc = value;
    }

    /**
     * Gets the value of the nombreComercio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComercio() {
        return nombreComercio;
    }

    /**
     * Sets the value of the nombreComercio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComercio(String value) {
        this.nombreComercio = value;
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
     *     {@link String }
     *     
     */
    public String getNumDocCliente() {
        return numDocCliente;
    }

    /**
     * Sets the value of the numDocCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDocCliente(String value) {
        this.numDocCliente = value;
    }

    /**
     * Gets the value of the numTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * Sets the value of the numTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTarjeta(String value) {
        this.numTarjeta = value;
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
     *     {@link String }
     *     
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * Sets the value of the paisOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigen(String value) {
        this.paisOrigen = value;
    }

    /**
     * Gets the value of the posicionGps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosicionGps() {
        return posicionGps;
    }

    /**
     * Sets the value of the posicionGps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosicionGps(String value) {
        this.posicionGps = value;
    }

    /**
     * Gets the value of the primerApeClienteBd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApeClienteBd() {
        return primerApeClienteBd;
    }

    /**
     * Sets the value of the primerApeClienteBd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApeClienteBd(String value) {
        this.primerApeClienteBd = value;
    }

    /**
     * Gets the value of the primerNomClienteBd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNomClienteBd() {
        return primerNomClienteBd;
    }

    /**
     * Sets the value of the primerNomClienteBd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNomClienteBd(String value) {
        this.primerNomClienteBd = value;
    }

    /**
     * Gets the value of the razonRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonRespuesta() {
        return razonRespuesta;
    }

    /**
     * Sets the value of the razonRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonRespuesta(String value) {
        this.razonRespuesta = value;
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
     *     {@link String }
     *     
     */
    public String getSegundoApeClienteBd() {
        return segundoApeClienteBd;
    }

    /**
     * Sets the value of the segundoApeClienteBd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApeClienteBd(String value) {
        this.segundoApeClienteBd = value;
    }

    /**
     * Gets the value of the segundoNomClienteBd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNomClienteBd() {
        return segundoNomClienteBd;
    }

    /**
     * Sets the value of the segundoNomClienteBd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNomClienteBd(String value) {
        this.segundoNomClienteBd = value;
    }

    /**
     * Gets the value of the situacionTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacionTarjeta() {
        return situacionTarjeta;
    }

    /**
     * Sets the value of the situacionTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacionTarjeta(String value) {
        this.situacionTarjeta = value;
    }

    /**
     * Gets the value of the telCorrespondencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelCorrespondencia() {
        return telCorrespondencia;
    }

    /**
     * Sets the value of the telCorrespondencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelCorrespondencia(String value) {
        this.telCorrespondencia = value;
    }

    /**
     * Gets the value of the telOficina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelOficina() {
        return telOficina;
    }

    /**
     * Sets the value of the telOficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelOficina(String value) {
        this.telOficina = value;
    }

    /**
     * Gets the value of the telResidencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelResidencia() {
        return telResidencia;
    }

    /**
     * Sets the value of the telResidencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelResidencia(String value) {
        this.telResidencia = value;
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

    /**
     * Gets the value of the tipoMensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMensaje() {
        return tipoMensaje;
    }

    /**
     * Sets the value of the tipoMensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMensaje(String value) {
        this.tipoMensaje = value;
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
     *     {@link String }
     *     
     */
    public String getTitularAdicional() {
        return titularAdicional;
    }

    /**
     * Sets the value of the titularAdicional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitularAdicional(String value) {
        this.titularAdicional = value;
    }

}
