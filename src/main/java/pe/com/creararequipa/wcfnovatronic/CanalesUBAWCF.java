
/*
 * 
 */

package pe.com.creararequipa.wcfnovatronic;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Nov 04 15:43:39 COT 2020
 * Generated source version: 2.3.1
 * 
 */


@WebServiceClient(name = "CanalesUBAWCF", 
                  wsdlLocation = "http://localhost/WCFCanalesUBA/CanalesUBAWCF.svc?wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class CanalesUBAWCF extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://tempuri.org/", "CanalesUBAWCF");
    public final static QName BasicHttpBindingICanalesUBAWCF = new QName("http://tempuri.org/", "BasicHttpBinding_ICanalesUBAWCF");
    public final static QName NetTcpBindingICanalesUBAWCF = new QName("http://tempuri.org/", "NetTcpBinding_ICanalesUBAWCF");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost/WCFCanalesUBA/CanalesUBAWCF.svc?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost/WCFCanalesUBA/CanalesUBAWCF.svc?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public CanalesUBAWCF(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CanalesUBAWCF(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CanalesUBAWCF() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CanalesUBAWCF(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }
    public CanalesUBAWCF(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CanalesUBAWCF(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ICanalesUBAWCF
     */
    @WebEndpoint(name = "BasicHttpBinding_ICanalesUBAWCF")
    public ICanalesUBAWCF getBasicHttpBindingICanalesUBAWCF() {
        return super.getPort(BasicHttpBindingICanalesUBAWCF, ICanalesUBAWCF.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICanalesUBAWCF
     */
    @WebEndpoint(name = "BasicHttpBinding_ICanalesUBAWCF")
    public ICanalesUBAWCF getBasicHttpBindingICanalesUBAWCF(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingICanalesUBAWCF, ICanalesUBAWCF.class, features);
    }
    /**
     * 
     * @return
     *     returns ICanalesUBAWCF
     */
    @WebEndpoint(name = "NetTcpBinding_ICanalesUBAWCF")
    public ICanalesUBAWCF getNetTcpBindingICanalesUBAWCF() {
        return super.getPort(NetTcpBindingICanalesUBAWCF, ICanalesUBAWCF.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICanalesUBAWCF
     */
    @WebEndpoint(name = "NetTcpBinding_ICanalesUBAWCF")
    public ICanalesUBAWCF getNetTcpBindingICanalesUBAWCF(WebServiceFeature... features) {
        return super.getPort(NetTcpBindingICanalesUBAWCF, ICanalesUBAWCF.class, features);
    }

}
