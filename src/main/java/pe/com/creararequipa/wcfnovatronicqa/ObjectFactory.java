
package pe.com.creararequipa.wcfnovatronicqa;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.com.creararequipa.wcfnovatronicqa package. 
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
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Cuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "Cuenta");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ServicioCanalesRPTRQT_QNAME = new QName("http://schemas.datacontract.org/2004/07/CardManager.Entidades.Servicios", "ServicioCanalesRPTRQT");
    private final static QName _ArrayOfCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "ArrayOfCuenta");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _TransaccionAdministrativa_QNAME = new QName("http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", "TransaccionAdministrativa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.com.creararequipa.wcfnovatronicqa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfCuenta }
     * 
     */
    public ArrayOfCuenta createArrayOfCuenta() {
        return new ArrayOfCuenta();
    }

    /**
     * Create an instance of {@link ParametrosUBA }
     * 
     */
    public ParametrosUBA createParametrosUBA() {
        return new ParametrosUBA();
    }

    /**
     * Create an instance of {@link RqtBase }
     * 
     */
    public RqtBase createRqtBase() {
        return new RqtBase();
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
     * Create an instance of {@link TransaccionAdministrativa }
     * 
     */
    public TransaccionAdministrativa createTransaccionAdministrativa() {
        return new TransaccionAdministrativa();
    }

    /**
     * Create an instance of {@link Cuenta }
     * 
     */
    public Cuenta createCuenta() {
        return new Cuenta();
    }

    /**
     * Create an instance of {@link ProcesarTramaMonitoreoFraude }
     * 
     */
    public ProcesarTramaMonitoreoFraude createProcesarTramaMonitoreoFraude() {
        return new ProcesarTramaMonitoreoFraude();
    }

    /**
     * Create an instance of {@link ServicioCanalesRPTRQT }
     * 
     */
    public ServicioCanalesRPTRQT createServicioCanalesRPTRQT() {
        return new ServicioCanalesRPTRQT();
    }

    /**
     * Create an instance of {@link WmProcesarTramaUBAResponse }
     * 
     */
    public WmProcesarTramaUBAResponse createWmProcesarTramaUBAResponse() {
        return new WmProcesarTramaUBAResponse();
    }

    /**
     * Create an instance of {@link ProcesarTramaMonitoreoFraudeResponse }
     * 
     */
    public ProcesarTramaMonitoreoFraudeResponse createProcesarTramaMonitoreoFraudeResponse() {
        return new ProcesarTramaMonitoreoFraudeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfParametrosUBA }
     * 
     */
    public ArrayOfParametrosUBA createArrayOfParametrosUBA() {
        return new ArrayOfParametrosUBA();
    }

    /**
     * Create an instance of {@link WmProcesarTramaPinPad }
     * 
     */
    public WmProcesarTramaPinPad createWmProcesarTramaPinPad() {
        return new WmProcesarTramaPinPad();
    }

    /**
     * Create an instance of {@link MonitoreoFraude }
     * 
     */
    public MonitoreoFraude createMonitoreoFraude() {
        return new MonitoreoFraude();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<Object> createDateTime(Object value) {
        return new JAXBElement<Object>(_DateTime_QNAME, Object.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionAdministrativa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", name = "TransaccionAdministrativa")
    public JAXBElement<TransaccionAdministrativa> createTransaccionAdministrativa(TransaccionAdministrativa value) {
        return new JAXBElement<TransaccionAdministrativa>(_TransaccionAdministrativa_QNAME, TransaccionAdministrativa.class, null, value);
    }

}
