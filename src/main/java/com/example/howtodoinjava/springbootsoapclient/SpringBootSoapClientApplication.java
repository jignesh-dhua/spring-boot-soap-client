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

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootSoapClientApplication {

	
	static{
		javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
		new javax.net.ssl.HostnameVerifier(){

		    public boolean verify(String dns,
		            javax.net.ssl.SSLSession sslSession) {
		        return true;
		    }
		});
		}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, FileNotFoundException, IOException, UnrecoverableKeyException, KeyManagementException {
	
//		System.setProperty("javax.net.ssl.trustStore", "/home/ubuntu/development_companyinfo_bridgefund_nl_p7b.jks");
//	    System.setProperty("javax.net.ssl.trustStorePassword", "damith");
//	    System.setProperty("javax.net.ssl.trustStoreType", "JKS");
//
//	    //my certificate and password
//	    System.setProperty("javax.net.ssl.keyStore", "C:/Users/dhuaj/Documents/Personal/soapUiPoject/certificates/cert.pfx");
//	    System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
//	    
//	    System.setProperty("javax.net.ssl.keyStore", "/home/ubuntu/development_companyinfo_bridgefund_nl_p7b.jks");
//	    System.setProperty("javax.net.ssl.keyStoreType", "JKS");
//	    System.setProperty("javax.net.ssl.keyStorePassword", "damith");
	    
		
		
		KeyStore clientStore = KeyStore.getInstance("JKS");
		clientStore.load(new FileInputStream(new File("/home/ubuntu/development_companyinfo_bridgefund_nl_p7b.pfx")), "damith".toCharArray());
		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		kmf.init(clientStore, "damith".toCharArray());
		KeyManager[] kms = kmf.getKeyManagers();

		// Assuming that you imported the CA Cert "Subject: CN=MBIIS CA, OU=MBIIS,
		// O=DAIMLER, C=DE"
		// to your cacerts Store.
		KeyStore trustStore = KeyStore.getInstance("JKS");
		trustStore.load(new FileInputStream("/home/ubuntu/development_companyinfo_bridgefund_nl_p7b.pfx"), "damith".toCharArray());

		TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		tmf.init(trustStore);
		TrustManager[] tms = tmf.getTrustManagers();

		final SSLContext sslContext = SSLContext.getInstance("TLS");
		//sslContext.init(kms, tms, new SecureRandom());
		
		sslContext.init(kms, new X509TrustManager[]{new HttpsTrustManager()}, new SecureRandom());
		
		SSLContext.setDefault(sslContext);

		HostnameVerifier hostnameVerifier = NoopHostnameVerifier.INSTANCE;

		HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
		HttpsURLConnection.setDefaultHostnameVerifier(hostnameVerifier);
		
		SpringApplication.run(SpringBootSoapClientApplication.class, args);
	}
	
	
	String request ="<ndf:LatLonListZipCode xmlns:ndf=\"https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" + 
			"         <zipCodeList xsi:type=\"xsd:string\">10001</zipCodeList>\n" + 
			"      </ndf:LatLonListZipCode>";

	String request1= " <ns:ophalenInschrijvingRequest xmlns:ns=\"http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02\">\n" + 
			"         <ns:klantreferentie>SoapUI-TEST</ns:klantreferentie>\n" + 
			"         <!--ns:kvkNummer>?</ns:kvkNummer-->\n" + 
			"         <ns:rsin>992353427</ns:rsin>\n" + 
			"      </ns:ophalenInschrijvingRequest>";
	
	@Bean
	CommandLineRunner lookup(SOAPConnector soapConnector) {
		return args -> {
//			String name = "Sajal";//Default Name
//			if(args.length>0){
//				name = args[0];
//			}
//			StudentDetailsRequest request = new StudentDetailsRequest();
//			request.setName(name);
			String response = soapConnector.callWebService("https://webservices.preprod.kvk.nl/postbus2", request1);
			System.out.println("Got Response As below ========= : ");
			System.out.println("Response : "+response);
		};
	}
}
