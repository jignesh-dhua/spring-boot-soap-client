package com.example.howtodoinjava.springbootsoapclient;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.xml.transform.StringSource;

public class SOAPConnector extends WebServiceGatewaySupport {

		
	
	
	public String callWebService(String url, String request){
		
		try {
		    StreamSource source = new StreamSource(new StringReader(request));
		    StringWriter writer = new StringWriter();
		    StreamResult result = new StreamResult(writer);
//		    TransformerFactory tFactory = TransformerFactory.newInstance();
//		    Transformer transformer = tFactory.newTransformer();
//		    transformer.transform(source,result);
		    
		    
		    
		    getWebServiceTemplate().sendSourceAndReceiveToResult(source, new WebServiceMessageCallback() {

		        public void doWithMessage(WebServiceMessage message) {
		            try {
		                SoapMessage soapMessage = (SoapMessage)message;
		                SoapHeader header = soapMessage.getSoapHeader();
//		                StringSource headerSource = new StringSource("<credentials xmlns=\"http://example.com/auth\">\n +
//		                        <username>"+username+"</username>\n +
//		                        <password>"+password"+</password>\n +
//		                        </credentials>");
		                
		                String headers = "<wsa:To xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">http://es.kvk.nl/kvk-DataservicePP/2015/02</wsa:To>"+
		                "<wsa:Action xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">http://es.kvk.nl/ophalenInschrijving</wsa:Action>"+
		                "<wsa:MessageID xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">uuid:7ad97e7a-26d7-4c4e-997c-1f7e0e88aa97</wsa:MessageID>";
		                
		                StringSource headerSource = new StringSource(headers);
		                Transformer transformer = TransformerFactory.newInstance().newTransformer();
		                transformer.transform(headerSource, header.getResult());
		            } catch (Exception e) {
		                // exception handling
		            }
		        }
		    },result);
		                
		    
	       // getWebServiceTemplate().sendSourceAndReceiveToResult(source, result);

	        String strResult = writer.toString();
	        
		    return strResult;
		} catch (Exception e) {
		    e.printStackTrace();
		}

		
		return null;//getWebServiceTemplate().marshalSendAndReceive(url, request);
	}
}