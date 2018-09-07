package com.example.howtodoinjava.springbootsoapclient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.howtodoinjava.schemas.school.InschrijvingRequestType;
import com.example.howtodoinjava.schemas.school.InschrijvingResponseType;


@SpringBootApplication
public class SpringBootSoapClientApplication {

	
	 private static final Logger LOG = LoggerFactory.getLogger(SpringBootSoapClientApplication.class);
	    public static final String NAMESPACE_URI = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02";

	    
//	static{
//		javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
//		new javax.net.ssl.HostnameVerifier(){
//
//		    public boolean verify(String dns,
//		            javax.net.ssl.SSLSession sslSession) {
//		        return true;
//		    }
//		});
//		}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, FileNotFoundException, IOException, UnrecoverableKeyException, KeyManagementException {
	
		System.setProperty("javax.net.ssl.trustStore", "/home/ubuntu/cert.pfx");
	    System.setProperty("javax.net.ssl.trustStorePassword", "damith");
	    System.setProperty("javax.net.ssl.trustStoreType", "PKCS12");

	    //my certificate and password
//	    System.setProperty("javax.net.ssl.keyStore", "C:/Users/dhuaj/Documents/Personal/soapUiPoject/certificates/cert.pfx");
//	    System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
	    
	    System.setProperty("javax.net.ssl.keyStore", "/home/ubuntu/cert.pfx");
	    System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
	    System.setProperty("javax.net.ssl.keyStorePassword", "damith");
	    
		
		
//		KeyStore clientStore = KeyStore.getInstance("JKS");
//		clientStore.load(new FileInputStream(new File("/home/ubuntu/development_companyinfo_bridgefund_nl_p7b.jks")), "damith".toCharArray());
//		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
//		kmf.init(clientStore, "damith".toCharArray());
//		KeyManager[] kms = kmf.getKeyManagers();
//
//		// Assuming that you imported the CA Cert "Subject: CN=MBIIS CA, OU=MBIIS,
//		// O=DAIMLER, C=DE"
//		// to your cacerts Store.
//		KeyStore trustStore = KeyStore.getInstance("JKS");
//		trustStore.load(new FileInputStream("/home/ubuntu/development_companyinfo_bridgefund_nl_p7b.jks"), "damith".toCharArray());
//
//		TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
//		tmf.init(trustStore);
//		TrustManager[] tms = tmf.getTrustManagers();
//
//		final SSLContext sslContext = SSLContext.getInstance("TLS");
//		//sslContext.init(kms, tms, new SecureRandom());
//		
//		sslContext.init(kms, new X509TrustManager[]{new HttpsTrustManager()}, new SecureRandom());
//		
//		SSLContext.setDefault(sslContext);
//
//		HostnameVerifier hostnameVerifier = NoopHostnameVerifier.INSTANCE;
//
//		HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
//		HttpsURLConnection.setDefaultHostnameVerifier(hostnameVerifier);
		
		SpringApplication.run(SpringBootSoapClientApplication.class, args);
	}
	
	
	String request1= "<ns:ophalenInschrijvingRequest xmlns:ns=\"http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02\">\n" + 
			"         <ns:klantreferentie>SoapUI-TEST</ns:klantreferentie>\n" + 
			"         <ns:rsin>992353427</ns:rsin>\n" + 
			"      </ns:ophalenInschrijvingRequest>";
	
	@Bean
	CommandLineRunner lookup(SOAPConnector soapConnector) {
		return args -> {
			String response = soapConnector.callWebService("https://webservices.preprod.kvk.nl/postbus2", request1);
			System.out.println("Got Response As below ========= : ");
			System.out.println("Response : "+response);

//			InschrijvingRequestType request = new InschrijvingRequestType();
//            // Request metadata
//            //request.setRequestMetadata(authenticatedUserId, UUID.randomUUID().toString(), replyURI);
//        	
//        	//request.setKvkNummer(value);;
//        	request.setKlantreferentie("SoapUI-TEST");
//        	request.setRsin("992353427");
//        	
//
//            LOG.info("\n\n" + request + "\n");
//
//            QName qname = new QName(NAMESPACE_URI, "RequestCourtCaseEvent");
//            JAXBElement<InschrijvingResponseType> responseJAXBElement = soapConnector.queryByDocketId(new JAXBElement(qname, InschrijvingResponseType.class, request));
//            InschrijvingResponseType response = responseJAXBElement.getValue();

            LOG.info("\n\n" + response + "\n");

		
		
		};
	}
}
