
package com.meihuichina.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PublishRoadConditionDataService", targetNamespace = "http://webservice.meihuichina.com/", wsdlLocation = "http://127.0.0.1:1122/service?wsdl")
public class PublishRoadConditionDataService
    extends Service
{

    private final static URL PUBLISHROADCONDITIONDATASERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:1122/service?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        PUBLISHROADCONDITIONDATASERVICE_WSDL_LOCATION = url;
    }

    public PublishRoadConditionDataService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PublishRoadConditionDataService() {
        super(PUBLISHROADCONDITIONDATASERVICE_WSDL_LOCATION, new QName("http://webservice.meihuichina.com/", "PublishRoadConditionDataService"));
    }

    /**
     * 
     * @return
     *     returns PublishRoadConditionData
     */
    @WebEndpoint(name = "PublishRoadConditionDataPort")
    public PublishRoadConditionData getPublishRoadConditionDataPort() {
        return (PublishRoadConditionData)super.getPort(new QName("http://webservice.meihuichina.com/", "PublishRoadConditionDataPort"), PublishRoadConditionData.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PublishRoadConditionData
     */
    @WebEndpoint(name = "PublishRoadConditionDataPort")
    public PublishRoadConditionData getPublishRoadConditionDataPort(WebServiceFeature... features) {
        return (PublishRoadConditionData)super.getPort(new QName("http://webservice.meihuichina.com/", "PublishRoadConditionDataPort"), PublishRoadConditionData.class, features);
    }

}