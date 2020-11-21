
package pe.com.creararequipa.wcfnovatronic;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.com.creararequipa.wcfnovatronic package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _RqtBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", "RqtBase");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _MonitoreoFraude_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "MonitoreoFraude");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ArrayOfParametrosUBA_QNAME = new QName("http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", "ArrayOfParametrosUBA");
    private final static QName _ParametrosUBA_QNAME = new QName("http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", "ParametrosUBA");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Cuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "Cuenta");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ServicioCanalesRPTRQT_QNAME = new QName("http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", "ServicioCanalesRPTRQT");
    private final static QName _ArrayOfCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "ArrayOfCuenta");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _TransaccionAdministrativa_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "TransaccionAdministrativa");
    private final static QName _MonitoreoFraudePrimerNomClienteBd_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "PrimerNomClienteBd");
    private final static QName _MonitoreoFraudeCodigoCondicionVenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CodigoCondicionVenta");
    private final static QName _MonitoreoFraudeDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "Direccion");
    private final static QName _MonitoreoFraudeModoEntradaServicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "ModoEntradaServicio");
    private final static QName _MonitoreoFraudeCodigoComercial_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CodigoComercial");
    private final static QName _MonitoreoFraudeCuentaDestinoTran_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CuentaDestinoTran");
    private final static QName _MonitoreoFraudeCuentaOrigenAsociada_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CuentaOrigenAsociada");
    private final static QName _MonitoreoFraudeNumTarjeta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "NumTarjeta");
    private final static QName _MonitoreoFraudePrimerApeClienteBd_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "PrimerApeClienteBd");
    private final static QName _MonitoreoFraudeCodigoPaisTarjeta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CodigoPaisTarjeta");
    private final static QName _MonitoreoFraudeCodigoIdEmisor_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CodigoIdEmisor");
    private final static QName _MonitoreoFraudeFechaNacimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "FechaNacimiento");
    private final static QName _MonitoreoFraudeTelCorrespondencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "TelCorrespondencia");
    private final static QName _MonitoreoFraudeCodigoTran_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CodigoTran");
    private final static QName _MonitoreoFraudeFechaConversion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "FechaConversion");
    private final static QName _MonitoreoFraudeTipoCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "TipoCuenta");
    private final static QName _MonitoreoFraudeIdTerminal_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "IdTerminal");
    private final static QName _MonitoreoFraudeIndicadorReverso_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "IndicadorReverso");
    private final static QName _MonitoreoFraudeRazonRespuesta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "RazonRespuesta");
    private final static QName _MonitoreoFraudeEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "Email");
    private final static QName _MonitoreoFraudeFechaActivacionTarjeta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "FechaActivacionTarjeta");
    private final static QName _MonitoreoFraudeSegundoApeClienteBd_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "SegundoApeClienteBd");
    private final static QName _MonitoreoFraudeCodigoMonedaTitular_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CodigoMonedaTitular");
    private final static QName _MonitoreoFraudePosicionGps_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "PosicionGps");
    private final static QName _MonitoreoFraudeEstadoCivil_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "EstadoCivil");
    private final static QName _MonitoreoFraudeSituacionTarjeta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "SituacionTarjeta");
    private final static QName _MonitoreoFraudeFechaVencTarjeta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "FechaVencTarjeta");
    private final static QName _MonitoreoFraudeCodigoComercio_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CodigoComercio");
    private final static QName _MonitoreoFraudeCodigoPaisAdquirente_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CodigoPaisAdquirente");
    private final static QName _MonitoreoFraudeTelOficina_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "TelOficina");
    private final static QName _MonitoreoFraudeMarca_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "Marca");
    private final static QName _MonitoreoFraudeNombreClienteTc_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "NombreClienteTc");
    private final static QName _MonitoreoFraudePaisOrigen_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "PaisOrigen");
    private final static QName _MonitoreoFraudeTitularAdicional_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "TitularAdicional");
    private final static QName _MonitoreoFraudeCodigoCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CodigoCliente");
    private final static QName _MonitoreoFraudeTipoMensaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "TipoMensaje");
    private final static QName _MonitoreoFraudeEsTarjetaEmpleado_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "EsTarjetaEmpleado");
    private final static QName _MonitoreoFraudeCodigoRespuesta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CodigoRespuesta");
    private final static QName _MonitoreoFraudeNumDocCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "NumDocCliente");
    private final static QName _MonitoreoFraudeCodigoMonedaTran_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CodigoMonedaTran");
    private final static QName _MonitoreoFraudeNombreComercio_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "NombreComercio");
    private final static QName _MonitoreoFraudeBin_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "Bin");
    private final static QName _MonitoreoFraudeNombreClienteBd_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "NombreClienteBd");
    private final static QName _MonitoreoFraudeCodigoPaisEmisor_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CodigoPaisEmisor");
    private final static QName _MonitoreoFraudeSegundoNomClienteBd_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "SegundoNomClienteBd");
    private final static QName _MonitoreoFraudeCodigoIdAdquirente_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "CodigoIdAdquirente");
    private final static QName _MonitoreoFraudeLocalidadComercio_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "LocalidadComercio");
    private final static QName _MonitoreoFraudeTelResidencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", "TelResidencia");
    private final static QName _ProcesarTramaMonitoreoFraudeDatosRqt_QNAME = new QName("http://tempuri.org/", "datosRqt");
    private final static QName _WmProcesarTramaUBAToServicioCanales_QNAME = new QName("http://tempuri.org/", "toServicioCanales");
    private final static QName _ServicioCanalesRPTRQTPcCodErr_QNAME = new QName("http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", "pcCodErr");
    private final static QName _ServicioCanalesRPTRQTPcCodUsu_QNAME = new QName("http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", "pcCodUsu");
    private final static QName _ServicioCanalesRPTRQTTransaccionAdministrativa_QNAME = new QName("http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", "TransaccionAdministrativa");
    private final static QName _ServicioCanalesRPTRQTPaLstParametrosUBA_QNAME = new QName("http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", "paLstParametrosUBA");
    private final static QName _ServicioCanalesRPTRQTPcMsjErr_QNAME = new QName("http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", "pcMsjErr");
    private final static QName _ServicioCanalesRPTRQTPcTracki_QNAME = new QName("http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", "pcTracki");
    private final static QName _WmProcesarTramaPinPadResponseWmProcesarTramaPinPadResult_QNAME = new QName("http://tempuri.org/", "wmProcesarTramaPinPadResult");
    private final static QName _RqtBaseCodApl_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", "CodApl");
    private final static QName _RqtBaseTermId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", "TermId");
    private final static QName _RqtBaseCodUsu_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", "CodUsu");
    private final static QName _RqtBaseCodOfi_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", "CodOfi");
    private final static QName _RqtBaseIdeSes_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", "IdeSes");
    private final static QName _ParametrosUBAPcPropiedad_QNAME = new QName("http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", "pcPropiedad");
    private final static QName _ParametrosUBAPcValor_QNAME = new QName("http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", "pcValor");
    private final static QName _TransaccionAdministrativaPcNomCli_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcNomCli");
    private final static QName _TransaccionAdministrativaPcRecTra_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcRecTra");
    private final static QName _TransaccionAdministrativaPcNroAud_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcNroAud");
    private final static QName _TransaccionAdministrativaPcConSal_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcConSal");
    private final static QName _TransaccionAdministrativaPcTeCoDa_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcTeCoDa");
    private final static QName _TransaccionAdministrativaPcOfCiMb_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcOfCiMb");
    private final static QName _TransaccionAdministrativaPcCodLen_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCodLen");
    private final static QName _TransaccionAdministrativaPcOfCiMa_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcOfCiMa");
    private final static QName _TransaccionAdministrativaPcTelPar_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcTelPar");
    private final static QName _TransaccionAdministrativaPcOnCiMa_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcOnCiMa");
    private final static QName _TransaccionAdministrativaPcSexo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcSexo");
    private final static QName _TransaccionAdministrativaPcOnCiMb_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcOnCiMb");
    private final static QName _TransaccionAdministrativaPcEstCiv_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcEstCiv");
    private final static QName _TransaccionAdministrativaPcFecTra_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcFecTra");
    private final static QName _TransaccionAdministrativaPcLinCre_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcLinCre");
    private final static QName _TransaccionAdministrativaPcCaInGe_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCaInGe");
    private final static QName _TransaccionAdministrativaPcCoMoAl_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCoMoAl");
    private final static QName _TransaccionAdministrativaPcDirUno_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcDirUno");
    private final static QName _TransaccionAdministrativaPcApeMat_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcApeMat");
    private final static QName _TransaccionAdministrativaPcOnToMb_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcOnToMb");
    private final static QName _TransaccionAdministrativaPcApePat_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcApePat");
    private final static QName _TransaccionAdministrativaPcOnToMa_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcOnToMa");
    private final static QName _TransaccionAdministrativaPcCoAuMe_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCoAuMe");
    private final static QName _TransaccionAdministrativaPcNumTar_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcNumTar");
    private final static QName _TransaccionAdministrativaPcOfTrMb_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcOfTrMb");
    private final static QName _TransaccionAdministrativaPcDirDos_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcDirDos");
    private final static QName _TransaccionAdministrativaPcOfTrMa_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcOfTrMa");
    private final static QName _TransaccionAdministrativaPcCoMoBa_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCoMoBa");
    private final static QName _TransaccionAdministrativaPcReaDep_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcReaDep");
    private final static QName _TransaccionAdministrativaPcCiuRem_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCiuRem");
    private final static QName _TransaccionAdministrativaPcMulAfi_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcMulAfi");
    private final static QName _TransaccionAdministrativaPcPerAtm_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcPerAtm");
    private final static QName _TransaccionAdministrativaPcUsLiTa_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcUsLiTa");
    private final static QName _TransaccionAdministrativaPcExcepc_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcExcepc");
    private final static QName _TransaccionAdministrativaPcNoCoTa_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcNoCoTa");
    private final static QName _TransaccionAdministrativaPcCoAcAr_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCoAcAr");
    private final static QName _TransaccionAdministrativaPcNomArc_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcNomArc");
    private final static QName _TransaccionAdministrativaPcIdeCue_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcIdeCue");
    private final static QName _TransaccionAdministrativaPcCoMoCu_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCoMoCu");
    private final static QName _TransaccionAdministrativaPcReaRet_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcReaRet");
    private final static QName _TransaccionAdministrativaPcTitCli_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcTitCli");
    private final static QName _TransaccionAdministrativaPcTipCue_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcTipCue");
    private final static QName _TransaccionAdministrativaPcReaTra_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcReaTra");
    private final static QName _TransaccionAdministrativaPcIdTiMe_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcIdTiMe");
    private final static QName _TransaccionAdministrativaPcCodPos_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCodPos");
    private final static QName _TransaccionAdministrativaCuentas_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "Cuentas");
    private final static QName _TransaccionAdministrativaPcCoSeAr_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCoSeAr");
    private final static QName _TransaccionAdministrativaPcCueDef_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCueDef");
    private final static QName _TransaccionAdministrativaPcPaiRem_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcPaiRem");
    private final static QName _TransaccionAdministrativaPcCatTar_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCatTar");
    private final static QName _TransaccionAdministrativaPcDeCue1_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcDeCue1");
    private final static QName _TransaccionAdministrativaPcNuSeDa_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcNuSeDa");
    private final static QName _TransaccionAdministrativaPcDeCue2_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcDeCue2");
    private final static QName _TransaccionAdministrativaPcCoEnAd_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCoEnAd");
    private final static QName _TransaccionAdministrativaPcOnTrMa_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcOnTrMa");
    private final static QName _TransaccionAdministrativaPcOnTrMb_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcOnTrMb");
    private final static QName _TransaccionAdministrativaPcOfToMb_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcOfToMb");
    private final static QName _TransaccionAdministrativaPcOfToMa_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcOfToMa");
    private final static QName _TransaccionAdministrativaPcPerPos_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcPerPos");
    private final static QName _TransaccionAdministrativaPcTelCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcTelCom");
    private final static QName _TransaccionAdministrativaPcCoPlAf_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCoPlAf");
    private final static QName _TransaccionAdministrativaPcFecNac_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcFecNac");
    private final static QName _TransaccionAdministrativaPcDepRem_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcDepRem");
    private final static QName _TransaccionAdministrativaPcTracki_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcTracki");
    private final static QName _TransaccionAdministrativaPcCodErr_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCodErr");
    private final static QName _TransaccionAdministrativaPcCoEnEm_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "pcCoEnEm");
    private final static QName _WmProcesarTramaUBAResponseWmProcesarTramaUBAResult_QNAME = new QName("http://tempuri.org/", "wmProcesarTramaUBAResult");
    private final static QName _CuentaPermiteDeposito_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "PermiteDeposito");
    private final static QName _CuentaDescriptorCuentaLinea2_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "DescriptorCuentaLinea2");
    private final static QName _CuentaIdentificadorCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "IdentificadorCuenta");
    private final static QName _CuentaPermiteRecibirTransferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "PermiteRecibirTransferencia");
    private final static QName _CuentaPrimeraCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "PrimeraCuenta");
    private final static QName _CuentaDescriptorCuentaLinea1_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "DescriptorCuentaLinea1");
    private final static QName _CuentaCodigoMoneda_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "CodigoMoneda");
    private final static QName _CuentaTipoCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "TipoCuenta");
    private final static QName _CuentaPermiteRealizarTransferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "PermiteRealizarTransferencia");
    private final static QName _CuentaPermiteRetiro_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "PermiteRetiro");
    private final static QName _CuentaPermiteConsultaSaldos_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "PermiteConsultaSaldos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.com.creararequipa.wcfnovatronic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MonitoreoFraude }
     * 
     */
    public MonitoreoFraude createMonitoreoFraude() {
        return new MonitoreoFraude();
    }

    /**
     * Create an instance of {@link ProcesarTramaMonitoreoFraude }
     * 
     */
    public ProcesarTramaMonitoreoFraude createProcesarTramaMonitoreoFraude() {
        return new ProcesarTramaMonitoreoFraude();
    }

    /**
     * Create an instance of {@link ArrayOfCuenta }
     * 
     */
    public ArrayOfCuenta createArrayOfCuenta() {
        return new ArrayOfCuenta();
    }

    /**
     * Create an instance of {@link WmProcesarTramaPinPad }
     * 
     */
    public WmProcesarTramaPinPad createWmProcesarTramaPinPad() {
        return new WmProcesarTramaPinPad();
    }

    /**
     * Create an instance of {@link ServicioCanalesRPTRQT }
     * 
     */
    public ServicioCanalesRPTRQT createServicioCanalesRPTRQT() {
        return new ServicioCanalesRPTRQT();
    }

    /**
     * Create an instance of {@link WmProcesarTramaPinPadResponse }
     * 
     */
    public WmProcesarTramaPinPadResponse createWmProcesarTramaPinPadResponse() {
        return new WmProcesarTramaPinPadResponse();
    }

    /**
     * Create an instance of {@link WmProcesarTramaUBA }
     * 
     */
    public WmProcesarTramaUBA createWmProcesarTramaUBA() {
        return new WmProcesarTramaUBA();
    }

    /**
     * Create an instance of {@link ArrayOfParametrosUBA }
     * 
     */
    public ArrayOfParametrosUBA createArrayOfParametrosUBA() {
        return new ArrayOfParametrosUBA();
    }

    /**
     * Create an instance of {@link RqtBase }
     * 
     */
    public RqtBase createRqtBase() {
        return new RqtBase();
    }

    /**
     * Create an instance of {@link ProcesarTramaMonitoreoFraudeResponse }
     * 
     */
    public ProcesarTramaMonitoreoFraudeResponse createProcesarTramaMonitoreoFraudeResponse() {
        return new ProcesarTramaMonitoreoFraudeResponse();
    }

    /**
     * Create an instance of {@link ParametrosUBA }
     * 
     */
    public ParametrosUBA createParametrosUBA() {
        return new ParametrosUBA();
    }

    /**
     * Create an instance of {@link TransaccionAdministrativa }
     * 
     */
    public TransaccionAdministrativa createTransaccionAdministrativa() {
        return new TransaccionAdministrativa();
    }

    /**
     * Create an instance of {@link WmProcesarTramaUBAResponse }
     * 
     */
    public WmProcesarTramaUBAResponse createWmProcesarTramaUBAResponse() {
        return new WmProcesarTramaUBAResponse();
    }

    /**
     * Create an instance of {@link Cuenta }
     * 
     */
    public Cuenta createCuenta() {
        return new Cuenta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RqtBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", name = "RqtBase")
    public JAXBElement<RqtBase> createRqtBase(RqtBase value) {
        return new JAXBElement<RqtBase>(_RqtBase_QNAME, RqtBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitoreoFraude }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "MonitoreoFraude")
    public JAXBElement<MonitoreoFraude> createMonitoreoFraude(MonitoreoFraude value) {
        return new JAXBElement<MonitoreoFraude>(_MonitoreoFraude_QNAME, MonitoreoFraude.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfParametrosUBA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", name = "ArrayOfParametrosUBA")
    public JAXBElement<ArrayOfParametrosUBA> createArrayOfParametrosUBA(ArrayOfParametrosUBA value) {
        return new JAXBElement<ArrayOfParametrosUBA>(_ArrayOfParametrosUBA_QNAME, ArrayOfParametrosUBA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametrosUBA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", name = "ParametrosUBA")
    public JAXBElement<ParametrosUBA> createParametrosUBA(ParametrosUBA value) {
        return new JAXBElement<ParametrosUBA>(_ParametrosUBA_QNAME, ParametrosUBA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "Cuenta")
    public JAXBElement<Cuenta> createCuenta(Cuenta value) {
        return new JAXBElement<Cuenta>(_Cuenta_QNAME, Cuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioCanalesRPTRQT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", name = "ServicioCanalesRPTRQT")
    public JAXBElement<ServicioCanalesRPTRQT> createServicioCanalesRPTRQT(ServicioCanalesRPTRQT value) {
        return new JAXBElement<ServicioCanalesRPTRQT>(_ServicioCanalesRPTRQT_QNAME, ServicioCanalesRPTRQT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "ArrayOfCuenta")
    public JAXBElement<ArrayOfCuenta> createArrayOfCuenta(ArrayOfCuenta value) {
        return new JAXBElement<ArrayOfCuenta>(_ArrayOfCuenta_QNAME, ArrayOfCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionAdministrativa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "TransaccionAdministrativa")
    public JAXBElement<TransaccionAdministrativa> createTransaccionAdministrativa(TransaccionAdministrativa value) {
        return new JAXBElement<TransaccionAdministrativa>(_TransaccionAdministrativa_QNAME, TransaccionAdministrativa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "PrimerNomClienteBd", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudePrimerNomClienteBd(String value) {
        return new JAXBElement<String>(_MonitoreoFraudePrimerNomClienteBd_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CodigoCondicionVenta", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCodigoCondicionVenta(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCodigoCondicionVenta_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "Direccion", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeDireccion(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeDireccion_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "ModoEntradaServicio", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeModoEntradaServicio(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeModoEntradaServicio_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CodigoComercial", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCodigoComercial(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCodigoComercial_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CuentaDestinoTran", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCuentaDestinoTran(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCuentaDestinoTran_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CuentaOrigenAsociada", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCuentaOrigenAsociada(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCuentaOrigenAsociada_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "NumTarjeta", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeNumTarjeta(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeNumTarjeta_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "PrimerApeClienteBd", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudePrimerApeClienteBd(String value) {
        return new JAXBElement<String>(_MonitoreoFraudePrimerApeClienteBd_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CodigoPaisTarjeta", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCodigoPaisTarjeta(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCodigoPaisTarjeta_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CodigoIdEmisor", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCodigoIdEmisor(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCodigoIdEmisor_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "FechaNacimiento", scope = MonitoreoFraude.class)
    public JAXBElement<XMLGregorianCalendar> createMonitoreoFraudeFechaNacimiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MonitoreoFraudeFechaNacimiento_QNAME, XMLGregorianCalendar.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "TelCorrespondencia", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeTelCorrespondencia(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeTelCorrespondencia_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CodigoTran", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCodigoTran(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCodigoTran_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "FechaConversion", scope = MonitoreoFraude.class)
    public JAXBElement<XMLGregorianCalendar> createMonitoreoFraudeFechaConversion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MonitoreoFraudeFechaConversion_QNAME, XMLGregorianCalendar.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "TipoCuenta", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeTipoCuenta(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeTipoCuenta_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "IdTerminal", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeIdTerminal(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeIdTerminal_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "IndicadorReverso", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeIndicadorReverso(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeIndicadorReverso_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "RazonRespuesta", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeRazonRespuesta(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeRazonRespuesta_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "Email", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeEmail(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeEmail_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "FechaActivacionTarjeta", scope = MonitoreoFraude.class)
    public JAXBElement<XMLGregorianCalendar> createMonitoreoFraudeFechaActivacionTarjeta(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MonitoreoFraudeFechaActivacionTarjeta_QNAME, XMLGregorianCalendar.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "SegundoApeClienteBd", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeSegundoApeClienteBd(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeSegundoApeClienteBd_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CodigoMonedaTitular", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCodigoMonedaTitular(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCodigoMonedaTitular_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "PosicionGps", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudePosicionGps(String value) {
        return new JAXBElement<String>(_MonitoreoFraudePosicionGps_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "EstadoCivil", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeEstadoCivil(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeEstadoCivil_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "SituacionTarjeta", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeSituacionTarjeta(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeSituacionTarjeta_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "FechaVencTarjeta", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeFechaVencTarjeta(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeFechaVencTarjeta_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CodigoComercio", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCodigoComercio(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCodigoComercio_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CodigoPaisAdquirente", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCodigoPaisAdquirente(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCodigoPaisAdquirente_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "TelOficina", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeTelOficina(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeTelOficina_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "Marca", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeMarca(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeMarca_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "NombreClienteTc", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeNombreClienteTc(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeNombreClienteTc_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "PaisOrigen", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudePaisOrigen(String value) {
        return new JAXBElement<String>(_MonitoreoFraudePaisOrigen_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "TitularAdicional", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeTitularAdicional(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeTitularAdicional_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CodigoCliente", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCodigoCliente(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCodigoCliente_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "TipoMensaje", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeTipoMensaje(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeTipoMensaje_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "EsTarjetaEmpleado", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeEsTarjetaEmpleado(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeEsTarjetaEmpleado_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CodigoRespuesta", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCodigoRespuesta(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCodigoRespuesta_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "NumDocCliente", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeNumDocCliente(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeNumDocCliente_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CodigoMonedaTran", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCodigoMonedaTran(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCodigoMonedaTran_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "NombreComercio", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeNombreComercio(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeNombreComercio_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "Bin", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeBin(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeBin_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "NombreClienteBd", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeNombreClienteBd(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeNombreClienteBd_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CodigoPaisEmisor", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCodigoPaisEmisor(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCodigoPaisEmisor_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "SegundoNomClienteBd", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeSegundoNomClienteBd(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeSegundoNomClienteBd_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "CodigoIdAdquirente", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeCodigoIdAdquirente(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeCodigoIdAdquirente_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "LocalidadComercio", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeLocalidadComercio(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeLocalidadComercio_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Servicios", name = "TelResidencia", scope = MonitoreoFraude.class)
    public JAXBElement<String> createMonitoreoFraudeTelResidencia(String value) {
        return new JAXBElement<String>(_MonitoreoFraudeTelResidencia_QNAME, String.class, MonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitoreoFraude }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datosRqt", scope = ProcesarTramaMonitoreoFraude.class)
    public JAXBElement<MonitoreoFraude> createProcesarTramaMonitoreoFraudeDatosRqt(MonitoreoFraude value) {
        return new JAXBElement<MonitoreoFraude>(_ProcesarTramaMonitoreoFraudeDatosRqt_QNAME, MonitoreoFraude.class, ProcesarTramaMonitoreoFraude.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioCanalesRPTRQT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "toServicioCanales", scope = WmProcesarTramaUBA.class)
    public JAXBElement<ServicioCanalesRPTRQT> createWmProcesarTramaUBAToServicioCanales(ServicioCanalesRPTRQT value) {
        return new JAXBElement<ServicioCanalesRPTRQT>(_WmProcesarTramaUBAToServicioCanales_QNAME, ServicioCanalesRPTRQT.class, WmProcesarTramaUBA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioCanalesRPTRQT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "toServicioCanales", scope = WmProcesarTramaPinPad.class)
    public JAXBElement<ServicioCanalesRPTRQT> createWmProcesarTramaPinPadToServicioCanales(ServicioCanalesRPTRQT value) {
        return new JAXBElement<ServicioCanalesRPTRQT>(_WmProcesarTramaUBAToServicioCanales_QNAME, ServicioCanalesRPTRQT.class, WmProcesarTramaPinPad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", name = "pcCodErr", scope = ServicioCanalesRPTRQT.class)
    public JAXBElement<String> createServicioCanalesRPTRQTPcCodErr(String value) {
        return new JAXBElement<String>(_ServicioCanalesRPTRQTPcCodErr_QNAME, String.class, ServicioCanalesRPTRQT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", name = "pcCodUsu", scope = ServicioCanalesRPTRQT.class)
    public JAXBElement<String> createServicioCanalesRPTRQTPcCodUsu(String value) {
        return new JAXBElement<String>(_ServicioCanalesRPTRQTPcCodUsu_QNAME, String.class, ServicioCanalesRPTRQT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionAdministrativa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", name = "TransaccionAdministrativa", scope = ServicioCanalesRPTRQT.class)
    public JAXBElement<TransaccionAdministrativa> createServicioCanalesRPTRQTTransaccionAdministrativa(TransaccionAdministrativa value) {
        return new JAXBElement<TransaccionAdministrativa>(_ServicioCanalesRPTRQTTransaccionAdministrativa_QNAME, TransaccionAdministrativa.class, ServicioCanalesRPTRQT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfParametrosUBA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", name = "paLstParametrosUBA", scope = ServicioCanalesRPTRQT.class)
    public JAXBElement<ArrayOfParametrosUBA> createServicioCanalesRPTRQTPaLstParametrosUBA(ArrayOfParametrosUBA value) {
        return new JAXBElement<ArrayOfParametrosUBA>(_ServicioCanalesRPTRQTPaLstParametrosUBA_QNAME, ArrayOfParametrosUBA.class, ServicioCanalesRPTRQT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", name = "pcMsjErr", scope = ServicioCanalesRPTRQT.class)
    public JAXBElement<String> createServicioCanalesRPTRQTPcMsjErr(String value) {
        return new JAXBElement<String>(_ServicioCanalesRPTRQTPcMsjErr_QNAME, String.class, ServicioCanalesRPTRQT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", name = "pcTracki", scope = ServicioCanalesRPTRQT.class)
    public JAXBElement<String> createServicioCanalesRPTRQTPcTracki(String value) {
        return new JAXBElement<String>(_ServicioCanalesRPTRQTPcTracki_QNAME, String.class, ServicioCanalesRPTRQT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioCanalesRPTRQT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "wmProcesarTramaPinPadResult", scope = WmProcesarTramaPinPadResponse.class)
    public JAXBElement<ServicioCanalesRPTRQT> createWmProcesarTramaPinPadResponseWmProcesarTramaPinPadResult(ServicioCanalesRPTRQT value) {
        return new JAXBElement<ServicioCanalesRPTRQT>(_WmProcesarTramaPinPadResponseWmProcesarTramaPinPadResult_QNAME, ServicioCanalesRPTRQT.class, WmProcesarTramaPinPadResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", name = "CodApl", scope = RqtBase.class)
    public JAXBElement<String> createRqtBaseCodApl(String value) {
        return new JAXBElement<String>(_RqtBaseCodApl_QNAME, String.class, RqtBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", name = "TermId", scope = RqtBase.class)
    public JAXBElement<String> createRqtBaseTermId(String value) {
        return new JAXBElement<String>(_RqtBaseTermId_QNAME, String.class, RqtBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", name = "CodUsu", scope = RqtBase.class)
    public JAXBElement<String> createRqtBaseCodUsu(String value) {
        return new JAXBElement<String>(_RqtBaseCodUsu_QNAME, String.class, RqtBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", name = "CodOfi", scope = RqtBase.class)
    public JAXBElement<String> createRqtBaseCodOfi(String value) {
        return new JAXBElement<String>(_RqtBaseCodOfi_QNAME, String.class, RqtBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.Entidades.Core", name = "IdeSes", scope = RqtBase.class)
    public JAXBElement<String> createRqtBaseIdeSes(String value) {
        return new JAXBElement<String>(_RqtBaseIdeSes_QNAME, String.class, RqtBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", name = "pcPropiedad", scope = ParametrosUBA.class)
    public JAXBElement<String> createParametrosUBAPcPropiedad(String value) {
        return new JAXBElement<String>(_ParametrosUBAPcPropiedad_QNAME, String.class, ParametrosUBA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", name = "pcValor", scope = ParametrosUBA.class)
    public JAXBElement<String> createParametrosUBAPcValor(String value) {
        return new JAXBElement<String>(_ParametrosUBAPcValor_QNAME, String.class, ParametrosUBA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcNomCli", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcNomCli(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcNomCli_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcRecTra", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcRecTra(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcRecTra_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcNroAud", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcNroAud(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcNroAud_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcConSal", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcConSal(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcConSal_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcTeCoDa", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcTeCoDa(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcTeCoDa_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcOfCiMb", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcOfCiMb(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcOfCiMb_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCodLen", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCodLen(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCodLen_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcOfCiMa", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcOfCiMa(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcOfCiMa_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcTelPar", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcTelPar(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcTelPar_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcOnCiMa", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcOnCiMa(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcOnCiMa_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcSexo", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcSexo(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcSexo_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcOnCiMb", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcOnCiMb(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcOnCiMb_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcEstCiv", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcEstCiv(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcEstCiv_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcFecTra", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcFecTra(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcFecTra_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcLinCre", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcLinCre(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcLinCre_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCaInGe", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCaInGe(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCaInGe_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCoMoAl", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCoMoAl(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCoMoAl_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcDirUno", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcDirUno(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcDirUno_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcApeMat", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcApeMat(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcApeMat_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcOnToMb", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcOnToMb(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcOnToMb_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcApePat", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcApePat(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcApePat_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcOnToMa", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcOnToMa(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcOnToMa_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCoAuMe", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCoAuMe(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCoAuMe_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcNumTar", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcNumTar(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcNumTar_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcOfTrMb", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcOfTrMb(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcOfTrMb_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcDirDos", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcDirDos(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcDirDos_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcOfTrMa", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcOfTrMa(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcOfTrMa_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCoMoBa", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCoMoBa(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCoMoBa_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcReaDep", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcReaDep(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcReaDep_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCiuRem", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCiuRem(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCiuRem_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcMulAfi", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcMulAfi(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcMulAfi_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcPerAtm", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcPerAtm(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcPerAtm_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcUsLiTa", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcUsLiTa(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcUsLiTa_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcExcepc", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcExcepc(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcExcepc_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcNoCoTa", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcNoCoTa(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcNoCoTa_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCoAcAr", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCoAcAr(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCoAcAr_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcNomArc", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcNomArc(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcNomArc_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcIdeCue", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcIdeCue(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcIdeCue_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCoMoCu", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCoMoCu(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCoMoCu_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcReaRet", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcReaRet(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcReaRet_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcTitCli", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcTitCli(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcTitCli_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcTipCue", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcTipCue(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcTipCue_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcReaTra", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcReaTra(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcReaTra_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcIdTiMe", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcIdTiMe(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcIdTiMe_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCodPos", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCodPos(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCodPos_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "Cuentas", scope = TransaccionAdministrativa.class)
    public JAXBElement<ArrayOfCuenta> createTransaccionAdministrativaCuentas(ArrayOfCuenta value) {
        return new JAXBElement<ArrayOfCuenta>(_TransaccionAdministrativaCuentas_QNAME, ArrayOfCuenta.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCoSeAr", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCoSeAr(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCoSeAr_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCueDef", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCueDef(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCueDef_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcPaiRem", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcPaiRem(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcPaiRem_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCatTar", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCatTar(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCatTar_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcDeCue1", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcDeCue1(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcDeCue1_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcNuSeDa", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcNuSeDa(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcNuSeDa_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcDeCue2", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcDeCue2(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcDeCue2_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCoEnAd", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCoEnAd(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCoEnAd_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcOnTrMa", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcOnTrMa(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcOnTrMa_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcOnTrMb", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcOnTrMb(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcOnTrMb_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcOfToMb", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcOfToMb(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcOfToMb_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcOfToMa", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcOfToMa(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcOfToMa_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcPerPos", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcPerPos(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcPerPos_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcTelCom", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcTelCom(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcTelCom_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCoPlAf", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCoPlAf(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCoPlAf_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcFecNac", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcFecNac(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcFecNac_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcDepRem", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcDepRem(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcDepRem_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcTracki", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcTracki(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcTracki_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCodErr", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCodErr(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCodErr_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "pcCoEnEm", scope = TransaccionAdministrativa.class)
    public JAXBElement<String> createTransaccionAdministrativaPcCoEnEm(String value) {
        return new JAXBElement<String>(_TransaccionAdministrativaPcCoEnEm_QNAME, String.class, TransaccionAdministrativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioCanalesRPTRQT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "wmProcesarTramaUBAResult", scope = WmProcesarTramaUBAResponse.class)
    public JAXBElement<ServicioCanalesRPTRQT> createWmProcesarTramaUBAResponseWmProcesarTramaUBAResult(ServicioCanalesRPTRQT value) {
        return new JAXBElement<ServicioCanalesRPTRQT>(_WmProcesarTramaUBAResponseWmProcesarTramaUBAResult_QNAME, ServicioCanalesRPTRQT.class, WmProcesarTramaUBAResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "PermiteDeposito", scope = Cuenta.class)
    public JAXBElement<String> createCuentaPermiteDeposito(String value) {
        return new JAXBElement<String>(_CuentaPermiteDeposito_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "DescriptorCuentaLinea2", scope = Cuenta.class)
    public JAXBElement<String> createCuentaDescriptorCuentaLinea2(String value) {
        return new JAXBElement<String>(_CuentaDescriptorCuentaLinea2_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "IdentificadorCuenta", scope = Cuenta.class)
    public JAXBElement<String> createCuentaIdentificadorCuenta(String value) {
        return new JAXBElement<String>(_CuentaIdentificadorCuenta_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "PermiteRecibirTransferencia", scope = Cuenta.class)
    public JAXBElement<String> createCuentaPermiteRecibirTransferencia(String value) {
        return new JAXBElement<String>(_CuentaPermiteRecibirTransferencia_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "PrimeraCuenta", scope = Cuenta.class)
    public JAXBElement<String> createCuentaPrimeraCuenta(String value) {
        return new JAXBElement<String>(_CuentaPrimeraCuenta_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "DescriptorCuentaLinea1", scope = Cuenta.class)
    public JAXBElement<String> createCuentaDescriptorCuentaLinea1(String value) {
        return new JAXBElement<String>(_CuentaDescriptorCuentaLinea1_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "CodigoMoneda", scope = Cuenta.class)
    public JAXBElement<String> createCuentaCodigoMoneda(String value) {
        return new JAXBElement<String>(_CuentaCodigoMoneda_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "TipoCuenta", scope = Cuenta.class)
    public JAXBElement<String> createCuentaTipoCuenta(String value) {
        return new JAXBElement<String>(_CuentaTipoCuenta_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "PermiteRealizarTransferencia", scope = Cuenta.class)
    public JAXBElement<String> createCuentaPermiteRealizarTransferencia(String value) {
        return new JAXBElement<String>(_CuentaPermiteRealizarTransferencia_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "PermiteRetiro", scope = Cuenta.class)
    public JAXBElement<String> createCuentaPermiteRetiro(String value) {
        return new JAXBElement<String>(_CuentaPermiteRetiro_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "PermiteConsultaSaldos", scope = Cuenta.class)
    public JAXBElement<String> createCuentaPermiteConsultaSaldos(String value) {
        return new JAXBElement<String>(_CuentaPermiteConsultaSaldos_QNAME, String.class, Cuenta.class, value);
    }

}
