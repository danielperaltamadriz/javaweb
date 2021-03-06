
package IMBService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IMBService", targetNamespace = "http://Service/", wsdlLocation = "http://localhost:8080/IMBService/IMBService?wsdl")
public class IMBService_Service
    extends Service
{

    private final static URL IMBSERVICE_WSDL_LOCATION;
    private final static WebServiceException IMBSERVICE_EXCEPTION;
    private final static QName IMBSERVICE_QNAME = new QName("http://Service/", "IMBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/IMBService/IMBService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IMBSERVICE_WSDL_LOCATION = url;
        IMBSERVICE_EXCEPTION = e;
    }

    public IMBService_Service() {
        super(__getWsdlLocation(), IMBSERVICE_QNAME);
    }

    public IMBService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), IMBSERVICE_QNAME, features);
    }

    public IMBService_Service(URL wsdlLocation) {
        super(wsdlLocation, IMBSERVICE_QNAME);
    }

    public IMBService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IMBSERVICE_QNAME, features);
    }

    public IMBService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IMBService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IMBService
     */
    @WebEndpoint(name = "IMBServicePort")
    public IMBService getIMBServicePort() {
        return super.getPort(new QName("http://Service/", "IMBServicePort"), IMBService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IMBService
     */
    @WebEndpoint(name = "IMBServicePort")
    public IMBService getIMBServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Service/", "IMBServicePort"), IMBService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IMBSERVICE_EXCEPTION!= null) {
            throw IMBSERVICE_EXCEPTION;
        }
        return IMBSERVICE_WSDL_LOCATION;
    }

}
