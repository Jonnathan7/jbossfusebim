package pe.com.creararequipa.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.5.redhat-630343
 * 2020-11-18T13:58:50.700-05:00
 * Generated source version: 3.1.5.redhat-630343
 * 
 */
@WebService(targetNamespace = "http://www.creararequipa.com.pe/webservices", name = "WSMiddleWareSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface WSMiddleWareSoap {

    @WebMethod(action = "http://www.creararequipa.com.pe/webservices/wmTransaccionVarias")
    @RequestWrapper(localName = "wmTransaccionVarias", targetNamespace = "http://www.creararequipa.com.pe/webservices", className = "pe.com.creararequipa.webservices.WmTransaccionVarias")
    @ResponseWrapper(localName = "wmTransaccionVariasResponse", targetNamespace = "http://www.creararequipa.com.pe/webservices", className = "pe.com.creararequipa.webservices.WmTransaccionVariasResponse")
    public void wmTransaccionVarias(
        @WebParam(name = "tcCodTrx", targetNamespace = "http://www.creararequipa.com.pe/webservices")
        java.lang.String tcCodTrx,
        @WebParam(name = "tcLlave", targetNamespace = "http://www.creararequipa.com.pe/webservices")
        java.lang.String tcLlave,
        @WebParam(name = "tcIdenti", targetNamespace = "http://www.creararequipa.com.pe/webservices")
        java.lang.String tcIdenti,
        @WebParam(name = "tnMonto", targetNamespace = "http://www.creararequipa.com.pe/webservices")
        java.math.BigDecimal tnMonto,
        @WebParam(name = "tcMoneda", targetNamespace = "http://www.creararequipa.com.pe/webservices")
        java.lang.String tcMoneda,
        @WebParam(name = "tcIdSess", targetNamespace = "http://www.creararequipa.com.pe/webservices")
        java.lang.String tcIdSess,
        @WebParam(name = "tcCodCli", targetNamespace = "http://www.creararequipa.com.pe/webservices")
        java.lang.String tcCodCli,
        @WebParam(name = "tcOfiLla", targetNamespace = "http://www.creararequipa.com.pe/webservices")
        java.lang.String tcOfiLla,
        @WebParam(mode = WebParam.Mode.INOUT, name = "tcError", targetNamespace = "http://www.creararequipa.com.pe/webservices")
        javax.xml.ws.Holder<java.lang.String> tcError,
        @WebParam(mode = WebParam.Mode.OUT, name = "wmTransaccionVariasResult", targetNamespace = "http://www.creararequipa.com.pe/webservices")
        javax.xml.ws.Holder<ClEntidadDeNegocioTransaccionResponseType> wmTransaccionVariasResult
    );
}
