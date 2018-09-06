
package nl.kvk.schemas.schemas.hrip.dataservice._2015._02;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Dataservice", targetNamespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    nl.kvk.schemas.schemas.hrip.catalogus._2015._02.ObjectFactory.class,
    nl.kvk.schemas.schemas.hrip.dataservice._2015._02.ObjectFactory.class
})
public interface Dataservice {


    /**
     * 
     * @param request
     * @return
     *     returns nl.kvk.schemas.schemas.hrip.dataservice._2015._02.InschrijvingResponseType
     */
    @WebMethod(action = "http://es.kvk.nl/ophalenInschrijving")
    @WebResult(name = "ophalenInschrijvingResponse", targetNamespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", partName = "response")
    @Action(input = "http://es.kvk.nl/ophalenInschrijving", output = "http://es.kvk.nl/ophalenInschrijvingResponse")
    public InschrijvingResponseType ophalenInschrijving(
        @WebParam(name = "ophalenInschrijvingRequest", targetNamespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", partName = "request")
        InschrijvingRequestType request);

    /**
     * 
     * @param request
     * @return
     *     returns nl.kvk.schemas.schemas.hrip.dataservice._2015._02.VestigingResponseType
     */
    @WebMethod(action = "http://es.kvk.nl/ophalenVestiging")
    @WebResult(name = "ophalenVestigingResponse", targetNamespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", partName = "response")
    @Action(input = "http://es.kvk.nl/ophalenVestiging", output = "http://es.kvk.nl/ophalenVestigingResponse")
    public VestigingResponseType ophalenVestiging(
        @WebParam(name = "ophalenVestigingRequest", targetNamespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", partName = "request")
        VestigingRequestType request);

}