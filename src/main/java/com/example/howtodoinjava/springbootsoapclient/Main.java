package com.example.howtodoinjava.springbootsoapclient;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

public class Main {

	public static void main(String[] args) throws Exception {
	
		getHttpResponseWithSSL("https://webservices.preprod.kvk.nl/postbus2");
		
	}
	static String getHttpResponseWithSSL(String url) throws Exception {
	    //default truststore parameters
	    System.setProperty("javax.net.ssl.trustStore", "C:/Users/dhuaj/Documents/Personal/soapUiPoject/certificates/final/new_trust_keystore.jks");
	    System.setProperty("javax.net.ssl.trustStorePassword", "damith");
	    System.setProperty("javax.net.ssl.trustStoreType", "jks");

	    //my certificate and password
	    System.setProperty("javax.net.ssl.keyStore", "C:/Users/dhuaj/Documents/Personal/soapUiPoject/certificates/final/cert.pfx");
	    System.setProperty("javax.net.ssl.keyStorePassword", "damith");
	    System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");


	    HttpClient httpclient = new HttpClient();

	    GetMethod method = new GetMethod();
	    method.setPath(url);

	    int statusCode = httpclient.executeMethod(method);
	    System.out.println("Status: " + statusCode);

	    method.releaseConnection();

	    return method.getResponseBodyAsString();
	}
}
