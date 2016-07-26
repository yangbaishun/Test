
package com.meihuichina.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.meihuichina.webservice package. 
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

    private final static QName _GetRoadConditionDatas_QNAME = new QName("http://webservice.meihuichina.com/", "getRoadConditionDatas");
    private final static QName _GetRoadConditionDatasResponse_QNAME = new QName("http://webservice.meihuichina.com/", "getRoadConditionDatasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.meihuichina.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRoadConditionDatas }
     * 
     */
    public GetRoadConditionDatas createGetRoadConditionDatas() {
        return new GetRoadConditionDatas();
    }

    /**
     * Create an instance of {@link GetRoadConditionDatasResponse }
     * 
     */
    public GetRoadConditionDatasResponse createGetRoadConditionDatasResponse() {
        return new GetRoadConditionDatasResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoadConditionDatas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.meihuichina.com/", name = "getRoadConditionDatas")
    public JAXBElement<GetRoadConditionDatas> createGetRoadConditionDatas(GetRoadConditionDatas value) {
        return new JAXBElement<GetRoadConditionDatas>(_GetRoadConditionDatas_QNAME, GetRoadConditionDatas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoadConditionDatasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.meihuichina.com/", name = "getRoadConditionDatasResponse")
    public JAXBElement<GetRoadConditionDatasResponse> createGetRoadConditionDatasResponse(GetRoadConditionDatasResponse value) {
        return new JAXBElement<GetRoadConditionDatasResponse>(_GetRoadConditionDatasResponse_QNAME, GetRoadConditionDatasResponse.class, null, value);
    }

}
