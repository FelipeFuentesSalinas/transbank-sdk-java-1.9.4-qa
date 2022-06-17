package com.transbank.webpayserver.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-02-23T16:00:36.773-03:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "OneClickPaymentServiceImplService", 
                  wsdlLocation = "file:oneclick.wsdl",
                  targetNamespace = "http://webservices.webpayserver.transbank.com/") 
public class OneClickPaymentServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservices.webpayserver.transbank.com/", "OneClickPaymentServiceImplService");
    public final static QName OneClickPaymentServiceImplPort = new QName("http://webservices.webpayserver.transbank.com/", "OneClickPaymentServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:oneclick.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OneClickPaymentServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:oneclick.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OneClickPaymentServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OneClickPaymentServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OneClickPaymentServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public OneClickPaymentServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OneClickPaymentServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OneClickPaymentServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns OneClickPaymentService
     */
    @WebEndpoint(name = "OneClickPaymentServiceImplPort")
    public OneClickPaymentService getOneClickPaymentServiceImplPort() {
        return super.getPort(OneClickPaymentServiceImplPort, OneClickPaymentService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OneClickPaymentService
     */
    @WebEndpoint(name = "OneClickPaymentServiceImplPort")
    public OneClickPaymentService getOneClickPaymentServiceImplPort(WebServiceFeature... features) {
        return super.getPort(OneClickPaymentServiceImplPort, OneClickPaymentService.class, features);
    }

}
