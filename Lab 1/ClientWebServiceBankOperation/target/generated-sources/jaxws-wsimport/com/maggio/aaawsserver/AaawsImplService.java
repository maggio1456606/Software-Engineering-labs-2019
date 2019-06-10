
package com.maggio.aaawsserver;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AaawsImplService", targetNamespace = "http://aaawsserver.maggio.com/", wsdlLocation = "http://localhost:8080/aaaws?wsdl")
public class AaawsImplService
    extends Service
{

    private final static URL AAAWSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException AAAWSIMPLSERVICE_EXCEPTION;
    private final static QName AAAWSIMPLSERVICE_QNAME = new QName("http://aaawsserver.maggio.com/", "AaawsImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/aaaws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AAAWSIMPLSERVICE_WSDL_LOCATION = url;
        AAAWSIMPLSERVICE_EXCEPTION = e;
    }

    public AaawsImplService() {
        super(__getWsdlLocation(), AAAWSIMPLSERVICE_QNAME);
    }

    public AaawsImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AAAWSIMPLSERVICE_QNAME, features);
    }

    public AaawsImplService(URL wsdlLocation) {
        super(wsdlLocation, AAAWSIMPLSERVICE_QNAME);
    }

    public AaawsImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AAAWSIMPLSERVICE_QNAME, features);
    }

    public AaawsImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AaawsImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AaawsInterface
     */
    @WebEndpoint(name = "AaawsImplPort")
    public AaawsInterface getAaawsImplPort() {
        return super.getPort(new QName("http://aaawsserver.maggio.com/", "AaawsImplPort"), AaawsInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AaawsInterface
     */
    @WebEndpoint(name = "AaawsImplPort")
    public AaawsInterface getAaawsImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://aaawsserver.maggio.com/", "AaawsImplPort"), AaawsInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AAAWSIMPLSERVICE_EXCEPTION!= null) {
            throw AAAWSIMPLSERVICE_EXCEPTION;
        }
        return AAAWSIMPLSERVICE_WSDL_LOCATION;
    }

}