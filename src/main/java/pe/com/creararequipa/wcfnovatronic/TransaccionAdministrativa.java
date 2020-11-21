
package pe.com.creararequipa.wcfnovatronic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="Cuentas" type="{http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA}ArrayOfCuenta" minOccurs="0"/>
 *         &lt;element name="pcApeMat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcApePat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCaInGe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCatTar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCiuRem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCoAcAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCoAuMe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCoEnAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCoEnEm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCoMoAl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCoMoBa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCoMoCu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCoPlAf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCoSeAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCodErr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCodLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCodPos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcConSal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcCueDef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcDeCue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcDeCue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcDepRem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcDirDos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcDirUno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcEstCiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcExcepc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcFecNac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcFecTra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcIdTiMe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcIdeCue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcLinCre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcMulAfi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcNoCoTa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcNomArc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcNomCli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcNroAud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcNuSeDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcNumTar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcOfCiMa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcOfCiMb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcOfToMa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcOfToMb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcOfTrMa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcOfTrMb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcOnCiMa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcOnCiMb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcOnToMa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcOnToMb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcOnTrMa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcOnTrMb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcPaiRem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcPerAtm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcPerPos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcReaDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcReaRet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcReaTra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcRecTra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcSexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcTeCoDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcTelCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcTelPar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcTipCue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcTitCli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcTracki" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcUsLiTa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

    @XmlElementRef(name = "Cuentas", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCuenta> cuentas;
    @XmlElementRef(name = "pcApeMat", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcApeMat;
    @XmlElementRef(name = "pcApePat", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcApePat;
    @XmlElementRef(name = "pcCaInGe", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCaInGe;
    @XmlElementRef(name = "pcCatTar", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCatTar;
    @XmlElementRef(name = "pcCiuRem", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCiuRem;
    @XmlElementRef(name = "pcCoAcAr", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCoAcAr;
    @XmlElementRef(name = "pcCoAuMe", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCoAuMe;
    @XmlElementRef(name = "pcCoEnAd", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCoEnAd;
    @XmlElementRef(name = "pcCoEnEm", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCoEnEm;
    @XmlElementRef(name = "pcCoMoAl", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCoMoAl;
    @XmlElementRef(name = "pcCoMoBa", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCoMoBa;
    @XmlElementRef(name = "pcCoMoCu", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCoMoCu;
    @XmlElementRef(name = "pcCoPlAf", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCoPlAf;
    @XmlElementRef(name = "pcCoSeAr", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCoSeAr;
    @XmlElementRef(name = "pcCodErr", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCodErr;
    @XmlElementRef(name = "pcCodLen", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCodLen;
    @XmlElementRef(name = "pcCodPos", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCodPos;
    @XmlElementRef(name = "pcConSal", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcConSal;
    @XmlElementRef(name = "pcCueDef", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcCueDef;
    @XmlElementRef(name = "pcDeCue1", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcDeCue1;
    @XmlElementRef(name = "pcDeCue2", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcDeCue2;
    @XmlElementRef(name = "pcDepRem", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcDepRem;
    @XmlElementRef(name = "pcDirDos", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcDirDos;
    @XmlElementRef(name = "pcDirUno", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcDirUno;
    @XmlElementRef(name = "pcEstCiv", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcEstCiv;
    @XmlElementRef(name = "pcExcepc", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcExcepc;
    @XmlElementRef(name = "pcFecNac", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcFecNac;
    @XmlElementRef(name = "pcFecTra", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcFecTra;
    @XmlElementRef(name = "pcIdTiMe", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcIdTiMe;
    @XmlElementRef(name = "pcIdeCue", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcIdeCue;
    @XmlElementRef(name = "pcLinCre", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcLinCre;
    @XmlElementRef(name = "pcMulAfi", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcMulAfi;
    @XmlElementRef(name = "pcNoCoTa", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcNoCoTa;
    @XmlElementRef(name = "pcNomArc", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcNomArc;
    @XmlElementRef(name = "pcNomCli", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcNomCli;
    @XmlElementRef(name = "pcNroAud", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcNroAud;
    @XmlElementRef(name = "pcNuSeDa", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcNuSeDa;
    @XmlElementRef(name = "pcNumTar", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcNumTar;
    @XmlElementRef(name = "pcOfCiMa", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcOfCiMa;
    @XmlElementRef(name = "pcOfCiMb", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcOfCiMb;
    @XmlElementRef(name = "pcOfToMa", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcOfToMa;
    @XmlElementRef(name = "pcOfToMb", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcOfToMb;
    @XmlElementRef(name = "pcOfTrMa", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcOfTrMa;
    @XmlElementRef(name = "pcOfTrMb", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcOfTrMb;
    @XmlElementRef(name = "pcOnCiMa", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcOnCiMa;
    @XmlElementRef(name = "pcOnCiMb", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcOnCiMb;
    @XmlElementRef(name = "pcOnToMa", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcOnToMa;
    @XmlElementRef(name = "pcOnToMb", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcOnToMb;
    @XmlElementRef(name = "pcOnTrMa", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcOnTrMa;
    @XmlElementRef(name = "pcOnTrMb", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcOnTrMb;
    @XmlElementRef(name = "pcPaiRem", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcPaiRem;
    @XmlElementRef(name = "pcPerAtm", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcPerAtm;
    @XmlElementRef(name = "pcPerPos", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcPerPos;
    @XmlElementRef(name = "pcReaDep", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcReaDep;
    @XmlElementRef(name = "pcReaRet", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcReaRet;
    @XmlElementRef(name = "pcReaTra", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcReaTra;
    @XmlElementRef(name = "pcRecTra", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcRecTra;
    @XmlElementRef(name = "pcSexo", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcSexo;
    @XmlElementRef(name = "pcTeCoDa", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcTeCoDa;
    @XmlElementRef(name = "pcTelCom", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcTelCom;
    @XmlElementRef(name = "pcTelPar", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcTelPar;
    @XmlElementRef(name = "pcTipCue", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcTipCue;
    @XmlElementRef(name = "pcTitCli", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcTitCli;
    @XmlElementRef(name = "pcTracki", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcTracki;
    @XmlElementRef(name = "pcUsLiTa", namespace = "http://schemas.datacontract.org/2004/07/GestionTrama.ServiciosUBA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcUsLiTa;

    /**
     * Gets the value of the cuentas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCuenta }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCuenta> getCuentas() {
        return cuentas;
    }

    /**
     * Sets the value of the cuentas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCuenta }{@code >}
     *     
     */
    public void setCuentas(JAXBElement<ArrayOfCuenta> value) {
        this.cuentas = ((JAXBElement<ArrayOfCuenta> ) value);
    }

    /**
     * Gets the value of the pcApeMat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcApeMat() {
        return pcApeMat;
    }

    /**
     * Sets the value of the pcApeMat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcApeMat(JAXBElement<String> value) {
        this.pcApeMat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcApePat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcApePat() {
        return pcApePat;
    }

    /**
     * Sets the value of the pcApePat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcApePat(JAXBElement<String> value) {
        this.pcApePat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCaInGe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCaInGe() {
        return pcCaInGe;
    }

    /**
     * Sets the value of the pcCaInGe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCaInGe(JAXBElement<String> value) {
        this.pcCaInGe = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCatTar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCatTar() {
        return pcCatTar;
    }

    /**
     * Sets the value of the pcCatTar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCatTar(JAXBElement<String> value) {
        this.pcCatTar = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCiuRem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCiuRem() {
        return pcCiuRem;
    }

    /**
     * Sets the value of the pcCiuRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCiuRem(JAXBElement<String> value) {
        this.pcCiuRem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCoAcAr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCoAcAr() {
        return pcCoAcAr;
    }

    /**
     * Sets the value of the pcCoAcAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCoAcAr(JAXBElement<String> value) {
        this.pcCoAcAr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCoAuMe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCoAuMe() {
        return pcCoAuMe;
    }

    /**
     * Sets the value of the pcCoAuMe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCoAuMe(JAXBElement<String> value) {
        this.pcCoAuMe = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCoEnAd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCoEnAd() {
        return pcCoEnAd;
    }

    /**
     * Sets the value of the pcCoEnAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCoEnAd(JAXBElement<String> value) {
        this.pcCoEnAd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCoEnEm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCoEnEm() {
        return pcCoEnEm;
    }

    /**
     * Sets the value of the pcCoEnEm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCoEnEm(JAXBElement<String> value) {
        this.pcCoEnEm = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCoMoAl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCoMoAl() {
        return pcCoMoAl;
    }

    /**
     * Sets the value of the pcCoMoAl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCoMoAl(JAXBElement<String> value) {
        this.pcCoMoAl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCoMoBa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCoMoBa() {
        return pcCoMoBa;
    }

    /**
     * Sets the value of the pcCoMoBa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCoMoBa(JAXBElement<String> value) {
        this.pcCoMoBa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCoMoCu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCoMoCu() {
        return pcCoMoCu;
    }

    /**
     * Sets the value of the pcCoMoCu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCoMoCu(JAXBElement<String> value) {
        this.pcCoMoCu = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCoPlAf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCoPlAf() {
        return pcCoPlAf;
    }

    /**
     * Sets the value of the pcCoPlAf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCoPlAf(JAXBElement<String> value) {
        this.pcCoPlAf = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCoSeAr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCoSeAr() {
        return pcCoSeAr;
    }

    /**
     * Sets the value of the pcCoSeAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCoSeAr(JAXBElement<String> value) {
        this.pcCoSeAr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCodErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCodErr() {
        return pcCodErr;
    }

    /**
     * Sets the value of the pcCodErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCodErr(JAXBElement<String> value) {
        this.pcCodErr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCodLen property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCodLen() {
        return pcCodLen;
    }

    /**
     * Sets the value of the pcCodLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCodLen(JAXBElement<String> value) {
        this.pcCodLen = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCodPos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCodPos() {
        return pcCodPos;
    }

    /**
     * Sets the value of the pcCodPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCodPos(JAXBElement<String> value) {
        this.pcCodPos = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcConSal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcConSal() {
        return pcConSal;
    }

    /**
     * Sets the value of the pcConSal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcConSal(JAXBElement<String> value) {
        this.pcConSal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcCueDef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcCueDef() {
        return pcCueDef;
    }

    /**
     * Sets the value of the pcCueDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcCueDef(JAXBElement<String> value) {
        this.pcCueDef = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcDeCue1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcDeCue1() {
        return pcDeCue1;
    }

    /**
     * Sets the value of the pcDeCue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcDeCue1(JAXBElement<String> value) {
        this.pcDeCue1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcDeCue2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcDeCue2() {
        return pcDeCue2;
    }

    /**
     * Sets the value of the pcDeCue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcDeCue2(JAXBElement<String> value) {
        this.pcDeCue2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcDepRem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcDepRem() {
        return pcDepRem;
    }

    /**
     * Sets the value of the pcDepRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcDepRem(JAXBElement<String> value) {
        this.pcDepRem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcDirDos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcDirDos() {
        return pcDirDos;
    }

    /**
     * Sets the value of the pcDirDos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcDirDos(JAXBElement<String> value) {
        this.pcDirDos = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcDirUno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcDirUno() {
        return pcDirUno;
    }

    /**
     * Sets the value of the pcDirUno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcDirUno(JAXBElement<String> value) {
        this.pcDirUno = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcEstCiv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcEstCiv() {
        return pcEstCiv;
    }

    /**
     * Sets the value of the pcEstCiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcEstCiv(JAXBElement<String> value) {
        this.pcEstCiv = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcExcepc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcExcepc() {
        return pcExcepc;
    }

    /**
     * Sets the value of the pcExcepc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcExcepc(JAXBElement<String> value) {
        this.pcExcepc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcFecNac property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcFecNac() {
        return pcFecNac;
    }

    /**
     * Sets the value of the pcFecNac property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcFecNac(JAXBElement<String> value) {
        this.pcFecNac = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcFecTra property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcFecTra() {
        return pcFecTra;
    }

    /**
     * Sets the value of the pcFecTra property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcFecTra(JAXBElement<String> value) {
        this.pcFecTra = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcIdTiMe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcIdTiMe() {
        return pcIdTiMe;
    }

    /**
     * Sets the value of the pcIdTiMe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcIdTiMe(JAXBElement<String> value) {
        this.pcIdTiMe = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcIdeCue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcIdeCue() {
        return pcIdeCue;
    }

    /**
     * Sets the value of the pcIdeCue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcIdeCue(JAXBElement<String> value) {
        this.pcIdeCue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcLinCre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcLinCre() {
        return pcLinCre;
    }

    /**
     * Sets the value of the pcLinCre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcLinCre(JAXBElement<String> value) {
        this.pcLinCre = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcMulAfi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcMulAfi() {
        return pcMulAfi;
    }

    /**
     * Sets the value of the pcMulAfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcMulAfi(JAXBElement<String> value) {
        this.pcMulAfi = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcNoCoTa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcNoCoTa() {
        return pcNoCoTa;
    }

    /**
     * Sets the value of the pcNoCoTa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcNoCoTa(JAXBElement<String> value) {
        this.pcNoCoTa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcNomArc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcNomArc() {
        return pcNomArc;
    }

    /**
     * Sets the value of the pcNomArc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcNomArc(JAXBElement<String> value) {
        this.pcNomArc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcNomCli property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcNomCli() {
        return pcNomCli;
    }

    /**
     * Sets the value of the pcNomCli property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcNomCli(JAXBElement<String> value) {
        this.pcNomCli = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcNroAud property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcNroAud() {
        return pcNroAud;
    }

    /**
     * Sets the value of the pcNroAud property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcNroAud(JAXBElement<String> value) {
        this.pcNroAud = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcNuSeDa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcNuSeDa() {
        return pcNuSeDa;
    }

    /**
     * Sets the value of the pcNuSeDa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcNuSeDa(JAXBElement<String> value) {
        this.pcNuSeDa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcNumTar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcNumTar() {
        return pcNumTar;
    }

    /**
     * Sets the value of the pcNumTar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcNumTar(JAXBElement<String> value) {
        this.pcNumTar = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcOfCiMa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcOfCiMa() {
        return pcOfCiMa;
    }

    /**
     * Sets the value of the pcOfCiMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcOfCiMa(JAXBElement<String> value) {
        this.pcOfCiMa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcOfCiMb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcOfCiMb() {
        return pcOfCiMb;
    }

    /**
     * Sets the value of the pcOfCiMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcOfCiMb(JAXBElement<String> value) {
        this.pcOfCiMb = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcOfToMa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcOfToMa() {
        return pcOfToMa;
    }

    /**
     * Sets the value of the pcOfToMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcOfToMa(JAXBElement<String> value) {
        this.pcOfToMa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcOfToMb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcOfToMb() {
        return pcOfToMb;
    }

    /**
     * Sets the value of the pcOfToMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcOfToMb(JAXBElement<String> value) {
        this.pcOfToMb = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcOfTrMa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcOfTrMa() {
        return pcOfTrMa;
    }

    /**
     * Sets the value of the pcOfTrMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcOfTrMa(JAXBElement<String> value) {
        this.pcOfTrMa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcOfTrMb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcOfTrMb() {
        return pcOfTrMb;
    }

    /**
     * Sets the value of the pcOfTrMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcOfTrMb(JAXBElement<String> value) {
        this.pcOfTrMb = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcOnCiMa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcOnCiMa() {
        return pcOnCiMa;
    }

    /**
     * Sets the value of the pcOnCiMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcOnCiMa(JAXBElement<String> value) {
        this.pcOnCiMa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcOnCiMb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcOnCiMb() {
        return pcOnCiMb;
    }

    /**
     * Sets the value of the pcOnCiMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcOnCiMb(JAXBElement<String> value) {
        this.pcOnCiMb = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcOnToMa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcOnToMa() {
        return pcOnToMa;
    }

    /**
     * Sets the value of the pcOnToMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcOnToMa(JAXBElement<String> value) {
        this.pcOnToMa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcOnToMb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcOnToMb() {
        return pcOnToMb;
    }

    /**
     * Sets the value of the pcOnToMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcOnToMb(JAXBElement<String> value) {
        this.pcOnToMb = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcOnTrMa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcOnTrMa() {
        return pcOnTrMa;
    }

    /**
     * Sets the value of the pcOnTrMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcOnTrMa(JAXBElement<String> value) {
        this.pcOnTrMa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcOnTrMb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcOnTrMb() {
        return pcOnTrMb;
    }

    /**
     * Sets the value of the pcOnTrMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcOnTrMb(JAXBElement<String> value) {
        this.pcOnTrMb = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcPaiRem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcPaiRem() {
        return pcPaiRem;
    }

    /**
     * Sets the value of the pcPaiRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcPaiRem(JAXBElement<String> value) {
        this.pcPaiRem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcPerAtm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcPerAtm() {
        return pcPerAtm;
    }

    /**
     * Sets the value of the pcPerAtm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcPerAtm(JAXBElement<String> value) {
        this.pcPerAtm = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcPerPos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcPerPos() {
        return pcPerPos;
    }

    /**
     * Sets the value of the pcPerPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcPerPos(JAXBElement<String> value) {
        this.pcPerPos = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcReaDep property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcReaDep() {
        return pcReaDep;
    }

    /**
     * Sets the value of the pcReaDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcReaDep(JAXBElement<String> value) {
        this.pcReaDep = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcReaRet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcReaRet() {
        return pcReaRet;
    }

    /**
     * Sets the value of the pcReaRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcReaRet(JAXBElement<String> value) {
        this.pcReaRet = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcReaTra property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcReaTra() {
        return pcReaTra;
    }

    /**
     * Sets the value of the pcReaTra property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcReaTra(JAXBElement<String> value) {
        this.pcReaTra = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcRecTra property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcRecTra() {
        return pcRecTra;
    }

    /**
     * Sets the value of the pcRecTra property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcRecTra(JAXBElement<String> value) {
        this.pcRecTra = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcSexo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcSexo() {
        return pcSexo;
    }

    /**
     * Sets the value of the pcSexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcSexo(JAXBElement<String> value) {
        this.pcSexo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcTeCoDa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcTeCoDa() {
        return pcTeCoDa;
    }

    /**
     * Sets the value of the pcTeCoDa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcTeCoDa(JAXBElement<String> value) {
        this.pcTeCoDa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcTelCom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcTelCom() {
        return pcTelCom;
    }

    /**
     * Sets the value of the pcTelCom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcTelCom(JAXBElement<String> value) {
        this.pcTelCom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcTelPar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcTelPar() {
        return pcTelPar;
    }

    /**
     * Sets the value of the pcTelPar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcTelPar(JAXBElement<String> value) {
        this.pcTelPar = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcTipCue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcTipCue() {
        return pcTipCue;
    }

    /**
     * Sets the value of the pcTipCue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcTipCue(JAXBElement<String> value) {
        this.pcTipCue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcTitCli property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcTitCli() {
        return pcTitCli;
    }

    /**
     * Sets the value of the pcTitCli property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcTitCli(JAXBElement<String> value) {
        this.pcTitCli = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcTracki property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcTracki() {
        return pcTracki;
    }

    /**
     * Sets the value of the pcTracki property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcTracki(JAXBElement<String> value) {
        this.pcTracki = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pcUsLiTa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcUsLiTa() {
        return pcUsLiTa;
    }

    /**
     * Sets the value of the pcUsLiTa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcUsLiTa(JAXBElement<String> value) {
        this.pcUsLiTa = ((JAXBElement<String> ) value);
    }

}
