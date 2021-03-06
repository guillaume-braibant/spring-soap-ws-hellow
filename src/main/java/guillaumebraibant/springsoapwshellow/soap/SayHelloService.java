package guillaumebraibant.springsoapwshellow.soap;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.5
 * Generated source version: 3.3.5
 *
 */
@WebServiceClient(name = "sayHelloService",
                  wsdlLocation = "classpath:soap/hellow.wsdl",
                  targetNamespace = "http://springsoapwshellow.guillaumebraibant/soap")
public class SayHelloService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://springsoapwshellow.guillaumebraibant/soap", "sayHelloService");
    public final static QName SayHelloInterface = new QName("http://springsoapwshellow.guillaumebraibant/soap", "sayHelloInterface");
    static {
        URL url = SayHelloService.class.getClassLoader().getResource("soap/hellow.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(SayHelloService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:soap/hellow.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SayHelloService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SayHelloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SayHelloService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SayHelloService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SayHelloService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SayHelloService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SayHelloInterface
     */
    @WebEndpoint(name = "sayHelloInterface")
    public SayHelloInterface getSayHelloInterface() {
        return super.getPort(SayHelloInterface, SayHelloInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SayHelloInterface
     */
    @WebEndpoint(name = "sayHelloInterface")
    public SayHelloInterface getSayHelloInterface(WebServiceFeature... features) {
        return super.getPort(SayHelloInterface, SayHelloInterface.class, features);
    }

}
