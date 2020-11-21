
package pe.com.creararequipa.wcfnovatronicqa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransaccionAdministrativa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransaccionAdministrativa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cuentas" type="{http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA}ArrayOfCuenta"/>
 *         &lt;element name="pcApeMat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcApePat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCaInGe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCatTar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCiuRem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCoAcAr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCoAuMe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCoEnAd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCoEnEm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCoMoAl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCoMoBa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCoMoCu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCoPlAf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCoSeAr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCodErr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCodLen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCodPos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcConSal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcCueDef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcDeCue1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcDeCue2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcDepRem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcDirDos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcDirUno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcEstCiv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcExcepc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcFecNac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcFecTra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcIdTiMe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcIdeCue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcLinCre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcMulAfi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcNoCoTa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcNomArc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcNomCli" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcNroAud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcNuSeDa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcNumTar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcOfCiMa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcOfCiMb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcOfToMa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcOfToMb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcOfTrMa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcOfTrMb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcOnCiMa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcOnCiMb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcOnToMa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcOnToMb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcOnTrMa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcOnTrMb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcPaiRem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcPerAtm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcPerPos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcReaDep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcReaRet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcReaTra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcRecTra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcSexo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcTeCoDa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcTelCom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcTelPar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcTipCue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcTitCli" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcTracki" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcUsLiTa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransaccionAdministrativa", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", propOrder = {
    "cuentas",
    "pcApeMat",
    "pcApePat",
    "pcCaInGe",
    "pcCatTar",
    "pcCiuRem",
    "pcCoAcAr",
    "pcCoAuMe",
    "pcCoEnAd",
    "pcCoEnEm",
    "pcCoMoAl",
    "pcCoMoBa",
    "pcCoMoCu",
    "pcCoPlAf",
    "pcCoSeAr",
    "pcCodErr",
    "pcCodLen",
    "pcCodPos",
    "pcConSal",
    "pcCueDef",
    "pcDeCue1",
    "pcDeCue2",
    "pcDepRem",
    "pcDirDos",
    "pcDirUno",
    "pcEstCiv",
    "pcExcepc",
    "pcFecNac",
    "pcFecTra",
    "pcIdTiMe",
    "pcIdeCue",
    "pcLinCre",
    "pcMulAfi",
    "pcNoCoTa",
    "pcNomArc",
    "pcNomCli",
    "pcNroAud",
    "pcNuSeDa",
    "pcNumTar",
    "pcOfCiMa",
    "pcOfCiMb",
    "pcOfToMa",
    "pcOfToMb",
    "pcOfTrMa",
    "pcOfTrMb",
    "pcOnCiMa",
    "pcOnCiMb",
    "pcOnToMa",
    "pcOnToMb",
    "pcOnTrMa",
    "pcOnTrMb",
    "pcPaiRem",
    "pcPerAtm",
    "pcPerPos",
    "pcReaDep",
    "pcReaRet",
    "pcReaTra",
    "pcRecTra",
    "pcSexo",
    "pcTeCoDa",
    "pcTelCom",
    "pcTelPar",
    "pcTipCue",
    "pcTitCli",
    "pcTracki",
    "pcUsLiTa"
})
public class TransaccionAdministrativa {

    @XmlElement(name = "Cuentas", required = true)
    protected ArrayOfCuenta cuentas;
    @XmlElement(required = true)
    protected String pcApeMat;
    @XmlElement(required = true)
    protected String pcApePat;
    @XmlElement(required = true)
    protected String pcCaInGe;
    @XmlElement(required = true)
    protected String pcCatTar;
    @XmlElement(required = true)
    protected String pcCiuRem;
    @XmlElement(required = true)
    protected String pcCoAcAr;
    @XmlElement(required = true)
    protected String pcCoAuMe;
    @XmlElement(required = true)
    protected String pcCoEnAd;
    @XmlElement(required = true)
    protected String pcCoEnEm;
    @XmlElement(required = true)
    protected String pcCoMoAl;
    @XmlElement(required = true)
    protected String pcCoMoBa;
    @XmlElement(required = true)
    protected String pcCoMoCu;
    @XmlElement(required = true)
    protected String pcCoPlAf;
    @XmlElement(required = true)
    protected String pcCoSeAr;
    @XmlElement(required = true)
    protected String pcCodErr;
    @XmlElement(required = true)
    protected String pcCodLen;
    @XmlElement(required = true)
    protected String pcCodPos;
    @XmlElement(required = true)
    protected String pcConSal;
    @XmlElement(required = true)
    protected String pcCueDef;
    @XmlElement(required = true)
    protected String pcDeCue1;
    @XmlElement(required = true)
    protected String pcDeCue2;
    @XmlElement(required = true)
    protected String pcDepRem;
    @XmlElement(required = true)
    protected String pcDirDos;
    @XmlElement(required = true)
    protected String pcDirUno;
    @XmlElement(required = true)
    protected String pcEstCiv;
    @XmlElement(required = true)
    protected String pcExcepc;
    @XmlElement(required = true)
    protected String pcFecNac;
    @XmlElement(required = true)
    protected String pcFecTra;
    @XmlElement(required = true)
    protected String pcIdTiMe;
    @XmlElement(required = true)
    protected String pcIdeCue;
    @XmlElement(required = true)
    protected String pcLinCre;
    @XmlElement(required = true)
    protected String pcMulAfi;
    @XmlElement(required = true)
    protected String pcNoCoTa;
    @XmlElement(required = true)
    protected String pcNomArc;
    @XmlElement(required = true)
    protected String pcNomCli;
    @XmlElement(required = true)
    protected String pcNroAud;
    @XmlElement(required = true)
    protected String pcNuSeDa;
    @XmlElement(required = true)
    protected String pcNumTar;
    @XmlElement(required = true)
    protected String pcOfCiMa;
    @XmlElement(required = true)
    protected String pcOfCiMb;
    @XmlElement(required = true)
    protected String pcOfToMa;
    @XmlElement(required = true)
    protected String pcOfToMb;
    @XmlElement(required = true)
    protected String pcOfTrMa;
    @XmlElement(required = true)
    protected String pcOfTrMb;
    @XmlElement(required = true)
    protected String pcOnCiMa;
    @XmlElement(required = true)
    protected String pcOnCiMb;
    @XmlElement(required = true)
    protected String pcOnToMa;
    @XmlElement(required = true)
    protected String pcOnToMb;
    @XmlElement(required = true)
    protected String pcOnTrMa;
    @XmlElement(required = true)
    protected String pcOnTrMb;
    @XmlElement(required = true)
    protected String pcPaiRem;
    @XmlElement(required = true)
    protected String pcPerAtm;
    @XmlElement(required = true)
    protected String pcPerPos;
    @XmlElement(required = true)
    protected String pcReaDep;
    @XmlElement(required = true)
    protected String pcReaRet;
    @XmlElement(required = true)
    protected String pcReaTra;
    @XmlElement(required = true)
    protected String pcRecTra;
    @XmlElement(required = true)
    protected String pcSexo;
    @XmlElement(required = true)
    protected String pcTeCoDa;
    @XmlElement(required = true)
    protected String pcTelCom;
    @XmlElement(required = true)
    protected String pcTelPar;
    @XmlElement(required = true)
    protected String pcTipCue;
    @XmlElement(required = true)
    protected String pcTitCli;
    @XmlElement(required = true)
    protected String pcTracki;
    @XmlElement(required = true)
    protected String pcUsLiTa;

    /**
     * Gets the value of the cuentas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCuenta }
     *     
     */
    public ArrayOfCuenta getCuentas() {
        return cuentas;
    }

    /**
     * Sets the value of the cuentas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCuenta }
     *     
     */
    public void setCuentas(ArrayOfCuenta value) {
        this.cuentas = value;
    }

    /**
     * Gets the value of the pcApeMat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcApeMat() {
        return pcApeMat;
    }

    /**
     * Sets the value of the pcApeMat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcApeMat(String value) {
        this.pcApeMat = value;
    }

    /**
     * Gets the value of the pcApePat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcApePat() {
        return pcApePat;
    }

    /**
     * Sets the value of the pcApePat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcApePat(String value) {
        this.pcApePat = value;
    }

    /**
     * Gets the value of the pcCaInGe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCaInGe() {
        return pcCaInGe;
    }

    /**
     * Sets the value of the pcCaInGe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCaInGe(String value) {
        this.pcCaInGe = value;
    }

    /**
     * Gets the value of the pcCatTar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCatTar() {
        return pcCatTar;
    }

    /**
     * Sets the value of the pcCatTar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCatTar(String value) {
        this.pcCatTar = value;
    }

    /**
     * Gets the value of the pcCiuRem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCiuRem() {
        return pcCiuRem;
    }

    /**
     * Sets the value of the pcCiuRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCiuRem(String value) {
        this.pcCiuRem = value;
    }

    /**
     * Gets the value of the pcCoAcAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCoAcAr() {
        return pcCoAcAr;
    }

    /**
     * Sets the value of the pcCoAcAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCoAcAr(String value) {
        this.pcCoAcAr = value;
    }

    /**
     * Gets the value of the pcCoAuMe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCoAuMe() {
        return pcCoAuMe;
    }

    /**
     * Sets the value of the pcCoAuMe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCoAuMe(String value) {
        this.pcCoAuMe = value;
    }

    /**
     * Gets the value of the pcCoEnAd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCoEnAd() {
        return pcCoEnAd;
    }

    /**
     * Sets the value of the pcCoEnAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCoEnAd(String value) {
        this.pcCoEnAd = value;
    }

    /**
     * Gets the value of the pcCoEnEm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCoEnEm() {
        return pcCoEnEm;
    }

    /**
     * Sets the value of the pcCoEnEm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCoEnEm(String value) {
        this.pcCoEnEm = value;
    }

    /**
     * Gets the value of the pcCoMoAl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCoMoAl() {
        return pcCoMoAl;
    }

    /**
     * Sets the value of the pcCoMoAl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCoMoAl(String value) {
        this.pcCoMoAl = value;
    }

    /**
     * Gets the value of the pcCoMoBa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCoMoBa() {
        return pcCoMoBa;
    }

    /**
     * Sets the value of the pcCoMoBa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCoMoBa(String value) {
        this.pcCoMoBa = value;
    }

    /**
     * Gets the value of the pcCoMoCu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCoMoCu() {
        return pcCoMoCu;
    }

    /**
     * Sets the value of the pcCoMoCu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCoMoCu(String value) {
        this.pcCoMoCu = value;
    }

    /**
     * Gets the value of the pcCoPlAf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCoPlAf() {
        return pcCoPlAf;
    }

    /**
     * Sets the value of the pcCoPlAf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCoPlAf(String value) {
        this.pcCoPlAf = value;
    }

    /**
     * Gets the value of the pcCoSeAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCoSeAr() {
        return pcCoSeAr;
    }

    /**
     * Sets the value of the pcCoSeAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCoSeAr(String value) {
        this.pcCoSeAr = value;
    }

    /**
     * Gets the value of the pcCodErr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCodErr() {
        return pcCodErr;
    }

    /**
     * Sets the value of the pcCodErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCodErr(String value) {
        this.pcCodErr = value;
    }

    /**
     * Gets the value of the pcCodLen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCodLen() {
        return pcCodLen;
    }

    /**
     * Sets the value of the pcCodLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCodLen(String value) {
        this.pcCodLen = value;
    }

    /**
     * Gets the value of the pcCodPos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCodPos() {
        return pcCodPos;
    }

    /**
     * Sets the value of the pcCodPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCodPos(String value) {
        this.pcCodPos = value;
    }

    /**
     * Gets the value of the pcConSal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcConSal() {
        return pcConSal;
    }

    /**
     * Sets the value of the pcConSal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcConSal(String value) {
        this.pcConSal = value;
    }

    /**
     * Gets the value of the pcCueDef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCueDef() {
        return pcCueDef;
    }

    /**
     * Sets the value of the pcCueDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCueDef(String value) {
        this.pcCueDef = value;
    }

    /**
     * Gets the value of the pcDeCue1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcDeCue1() {
        return pcDeCue1;
    }

    /**
     * Sets the value of the pcDeCue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcDeCue1(String value) {
        this.pcDeCue1 = value;
    }

    /**
     * Gets the value of the pcDeCue2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcDeCue2() {
        return pcDeCue2;
    }

    /**
     * Sets the value of the pcDeCue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcDeCue2(String value) {
        this.pcDeCue2 = value;
    }

    /**
     * Gets the value of the pcDepRem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcDepRem() {
        return pcDepRem;
    }

    /**
     * Sets the value of the pcDepRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcDepRem(String value) {
        this.pcDepRem = value;
    }

    /**
     * Gets the value of the pcDirDos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcDirDos() {
        return pcDirDos;
    }

    /**
     * Sets the value of the pcDirDos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcDirDos(String value) {
        this.pcDirDos = value;
    }

    /**
     * Gets the value of the pcDirUno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcDirUno() {
        return pcDirUno;
    }

    /**
     * Sets the value of the pcDirUno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcDirUno(String value) {
        this.pcDirUno = value;
    }

    /**
     * Gets the value of the pcEstCiv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcEstCiv() {
        return pcEstCiv;
    }

    /**
     * Sets the value of the pcEstCiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcEstCiv(String value) {
        this.pcEstCiv = value;
    }

    /**
     * Gets the value of the pcExcepc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcExcepc() {
        return pcExcepc;
    }

    /**
     * Sets the value of the pcExcepc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcExcepc(String value) {
        this.pcExcepc = value;
    }

    /**
     * Gets the value of the pcFecNac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcFecNac() {
        return pcFecNac;
    }

    /**
     * Sets the value of the pcFecNac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcFecNac(String value) {
        this.pcFecNac = value;
    }

    /**
     * Gets the value of the pcFecTra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcFecTra() {
        return pcFecTra;
    }

    /**
     * Sets the value of the pcFecTra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcFecTra(String value) {
        this.pcFecTra = value;
    }

    /**
     * Gets the value of the pcIdTiMe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcIdTiMe() {
        return pcIdTiMe;
    }

    /**
     * Sets the value of the pcIdTiMe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcIdTiMe(String value) {
        this.pcIdTiMe = value;
    }

    /**
     * Gets the value of the pcIdeCue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcIdeCue() {
        return pcIdeCue;
    }

    /**
     * Sets the value of the pcIdeCue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcIdeCue(String value) {
        this.pcIdeCue = value;
    }

    /**
     * Gets the value of the pcLinCre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcLinCre() {
        return pcLinCre;
    }

    /**
     * Sets the value of the pcLinCre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcLinCre(String value) {
        this.pcLinCre = value;
    }

    /**
     * Gets the value of the pcMulAfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcMulAfi() {
        return pcMulAfi;
    }

    /**
     * Sets the value of the pcMulAfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcMulAfi(String value) {
        this.pcMulAfi = value;
    }

    /**
     * Gets the value of the pcNoCoTa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcNoCoTa() {
        return pcNoCoTa;
    }

    /**
     * Sets the value of the pcNoCoTa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcNoCoTa(String value) {
        this.pcNoCoTa = value;
    }

    /**
     * Gets the value of the pcNomArc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcNomArc() {
        return pcNomArc;
    }

    /**
     * Sets the value of the pcNomArc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcNomArc(String value) {
        this.pcNomArc = value;
    }

    /**
     * Gets the value of the pcNomCli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcNomCli() {
        return pcNomCli;
    }

    /**
     * Sets the value of the pcNomCli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcNomCli(String value) {
        this.pcNomCli = value;
    }

    /**
     * Gets the value of the pcNroAud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcNroAud() {
        return pcNroAud;
    }

    /**
     * Sets the value of the pcNroAud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcNroAud(String value) {
        this.pcNroAud = value;
    }

    /**
     * Gets the value of the pcNuSeDa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcNuSeDa() {
        return pcNuSeDa;
    }

    /**
     * Sets the value of the pcNuSeDa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcNuSeDa(String value) {
        this.pcNuSeDa = value;
    }

    /**
     * Gets the value of the pcNumTar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcNumTar() {
        return pcNumTar;
    }

    /**
     * Sets the value of the pcNumTar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcNumTar(String value) {
        this.pcNumTar = value;
    }

    /**
     * Gets the value of the pcOfCiMa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcOfCiMa() {
        return pcOfCiMa;
    }

    /**
     * Sets the value of the pcOfCiMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcOfCiMa(String value) {
        this.pcOfCiMa = value;
    }

    /**
     * Gets the value of the pcOfCiMb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcOfCiMb() {
        return pcOfCiMb;
    }

    /**
     * Sets the value of the pcOfCiMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcOfCiMb(String value) {
        this.pcOfCiMb = value;
    }

    /**
     * Gets the value of the pcOfToMa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcOfToMa() {
        return pcOfToMa;
    }

    /**
     * Sets the value of the pcOfToMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcOfToMa(String value) {
        this.pcOfToMa = value;
    }

    /**
     * Gets the value of the pcOfToMb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcOfToMb() {
        return pcOfToMb;
    }

    /**
     * Sets the value of the pcOfToMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcOfToMb(String value) {
        this.pcOfToMb = value;
    }

    /**
     * Gets the value of the pcOfTrMa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcOfTrMa() {
        return pcOfTrMa;
    }

    /**
     * Sets the value of the pcOfTrMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcOfTrMa(String value) {
        this.pcOfTrMa = value;
    }

    /**
     * Gets the value of the pcOfTrMb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcOfTrMb() {
        return pcOfTrMb;
    }

    /**
     * Sets the value of the pcOfTrMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcOfTrMb(String value) {
        this.pcOfTrMb = value;
    }

    /**
     * Gets the value of the pcOnCiMa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcOnCiMa() {
        return pcOnCiMa;
    }

    /**
     * Sets the value of the pcOnCiMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcOnCiMa(String value) {
        this.pcOnCiMa = value;
    }

    /**
     * Gets the value of the pcOnCiMb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcOnCiMb() {
        return pcOnCiMb;
    }

    /**
     * Sets the value of the pcOnCiMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcOnCiMb(String value) {
        this.pcOnCiMb = value;
    }

    /**
     * Gets the value of the pcOnToMa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcOnToMa() {
        return pcOnToMa;
    }

    /**
     * Sets the value of the pcOnToMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcOnToMa(String value) {
        this.pcOnToMa = value;
    }

    /**
     * Gets the value of the pcOnToMb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcOnToMb() {
        return pcOnToMb;
    }

    /**
     * Sets the value of the pcOnToMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcOnToMb(String value) {
        this.pcOnToMb = value;
    }

    /**
     * Gets the value of the pcOnTrMa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcOnTrMa() {
        return pcOnTrMa;
    }

    /**
     * Sets the value of the pcOnTrMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcOnTrMa(String value) {
        this.pcOnTrMa = value;
    }

    /**
     * Gets the value of the pcOnTrMb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcOnTrMb() {
        return pcOnTrMb;
    }

    /**
     * Sets the value of the pcOnTrMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcOnTrMb(String value) {
        this.pcOnTrMb = value;
    }

    /**
     * Gets the value of the pcPaiRem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcPaiRem() {
        return pcPaiRem;
    }

    /**
     * Sets the value of the pcPaiRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcPaiRem(String value) {
        this.pcPaiRem = value;
    }

    /**
     * Gets the value of the pcPerAtm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcPerAtm() {
        return pcPerAtm;
    }

    /**
     * Sets the value of the pcPerAtm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcPerAtm(String value) {
        this.pcPerAtm = value;
    }

    /**
     * Gets the value of the pcPerPos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcPerPos() {
        return pcPerPos;
    }

    /**
     * Sets the value of the pcPerPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcPerPos(String value) {
        this.pcPerPos = value;
    }

    /**
     * Gets the value of the pcReaDep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcReaDep() {
        return pcReaDep;
    }

    /**
     * Sets the value of the pcReaDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcReaDep(String value) {
        this.pcReaDep = value;
    }

    /**
     * Gets the value of the pcReaRet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcReaRet() {
        return pcReaRet;
    }

    /**
     * Sets the value of the pcReaRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcReaRet(String value) {
        this.pcReaRet = value;
    }

    /**
     * Gets the value of the pcReaTra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcReaTra() {
        return pcReaTra;
    }

    /**
     * Sets the value of the pcReaTra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcReaTra(String value) {
        this.pcReaTra = value;
    }

    /**
     * Gets the value of the pcRecTra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcRecTra() {
        return pcRecTra;
    }

    /**
     * Sets the value of the pcRecTra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcRecTra(String value) {
        this.pcRecTra = value;
    }

    /**
     * Gets the value of the pcSexo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcSexo() {
        return pcSexo;
    }

    /**
     * Sets the value of the pcSexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcSexo(String value) {
        this.pcSexo = value;
    }

    /**
     * Gets the value of the pcTeCoDa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcTeCoDa() {
        return pcTeCoDa;
    }

    /**
     * Sets the value of the pcTeCoDa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcTeCoDa(String value) {
        this.pcTeCoDa = value;
    }

    /**
     * Gets the value of the pcTelCom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcTelCom() {
        return pcTelCom;
    }

    /**
     * Sets the value of the pcTelCom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcTelCom(String value) {
        this.pcTelCom = value;
    }

    /**
     * Gets the value of the pcTelPar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcTelPar() {
        return pcTelPar;
    }

    /**
     * Sets the value of the pcTelPar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcTelPar(String value) {
        this.pcTelPar = value;
    }

    /**
     * Gets the value of the pcTipCue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcTipCue() {
        return pcTipCue;
    }

    /**
     * Sets the value of the pcTipCue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcTipCue(String value) {
        this.pcTipCue = value;
    }

    /**
     * Gets the value of the pcTitCli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcTitCli() {
        return pcTitCli;
    }

    /**
     * Sets the value of the pcTitCli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcTitCli(String value) {
        this.pcTitCli = value;
    }

    /**
     * Gets the value of the pcTracki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcTracki() {
        return pcTracki;
    }

    /**
     * Sets the value of the pcTracki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcTracki(String value) {
        this.pcTracki = value;
    }

    /**
     * Gets the value of the pcUsLiTa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcUsLiTa() {
        return pcUsLiTa;
    }

    /**
     * Sets the value of the pcUsLiTa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcUsLiTa(String value) {
        this.pcUsLiTa = value;
    }

}
