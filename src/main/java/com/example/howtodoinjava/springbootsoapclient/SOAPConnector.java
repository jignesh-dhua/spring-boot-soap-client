package com.example.howtodoinjava.springbootsoapclient;

import java.io.StringReader;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.util.UUID;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.addressing.client.ActionCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.xml.transform.StringSource;

import com.example.howtodoinjava.schemas.school.InschrijvingResponseType;


public class SOAPConnector extends WebServiceGatewaySupport {

		
	
	
	public String callWebService(String url, String request){
		
		try {
		    StreamSource source = new StreamSource(new StringReader(request));
		    StringWriter writer = new StringWriter();
		    StreamResult result = new StreamResult(writer);
//		    TransformerFactory tFactory = TransformerFactory.newInstance();
//		    Transformer transformer = tFactory.newTransformer();
//		    transformer.transform(source,result);
		    
		    
		    ActionCallback actionCallback = new ActionCallback("http://es.kvk.nl/ophalenInschrijving");
		    
		    
		    getWebServiceTemplate().sendSourceAndReceiveToResult(source, 
		    		actionCallback,
//		    new WebServiceMessageCallback() {
//
//		        public void doWithMessage(WebServiceMessage message) {
//		            try {
//		                SoapMessage soapMessage = (SoapMessage)message;
//		                SoapHeader header = soapMessage.getSoapHeader();
//		                
//		                String headers = "<wsa:To xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">http://es.kvk.nl/kvk-DataservicePP/2015/02</wsa:To><wsa:Action xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">http://es.kvk.nl/ophalenInschrijving</wsa:Action><wsa:MessageID xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">uuid:7ad97e7a-26d7-4c4e-997c-1f7e0e88aa97</wsa:MessageID>";
//		                
//		                
//		                StringSource headerSource = new StringSource(headers);
//		                Transformer transformer = TransformerFactory.newInstance().newTransformer();
//		                transformer.transform(headerSource, header.getResult());
//		            } catch (Exception e) {
//		            }
		        	
		        	
		        	
		        	
//		        	SaajSoapMessage soapMessage = (SaajSoapMessage) message;
//		            SoapHeaderElement messageId =  soapMessage.getSoapHeader().addHeaderElement(new QName("http://www.w3.org/2005/08/addressing", "MessageID", "wsa"));
//		            messageId.setText("uuid:" + UUID.randomUUID().toString());
//		            
//		            
//		            SoapHeaderElement to =  soapMessage.getSoapHeader().addHeaderElement(new QName("http://www.w3.org/2005/08/addressing", "To", "wsa"));
//		            to.setText("http://es.kvk.nl/kvk-DataservicePP/2015/02");
//		            
//		            SoapHeaderElement action =  soapMessage.getSoapHeader().addHeaderElement(new QName("http://www.w3.org/2005/08/addressing", "Action", "wsa"));
//		            action.setText("http://es.kvk.nl/ophalenInschrijving");
		        	
		        	
//		        }
//		    },
		    result);
		                
		    
	       // getWebServiceTemplate().sendSourceAndReceiveToResult(source, result);

	        String strResult = writer.toString();
	        
		    return strResult;
		} catch (Exception e) {
		    e.printStackTrace();
		}

		
		return null;//getWebServiceTemplate().marshalSendAndReceive(url, request);
	}
	
	 public JAXBElement<InschrijvingResponseType> queryByDocketId(JAXBElement<InschrijvingResponseType> request) throws URISyntaxException{
		 
		 ActionCallback actionCallback = new ActionCallback("http://es.kvk.nl/ophalenInschrijving");
	        return (JAXBElement<InschrijvingResponseType>) getWebServiceTemplate()
	                .marshalSendAndReceive(request,actionCallback);

	    }
}