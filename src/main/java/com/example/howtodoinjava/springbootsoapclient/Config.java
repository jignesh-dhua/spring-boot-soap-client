package com.example.howtodoinjava.springbootsoapclient;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;
import org.springframework.ws.soap.security.wss4j2.support.CryptoFactoryBean;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;
import org.springframework.ws.transport.http.HttpsUrlConnectionMessageSender;

@Configuration
public class Config {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this is the package name specified in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("com.example.howtodoinjava.schemas.school");
		return marshaller;
	}

	@Bean
	public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) throws Exception {
		SOAPConnector client = new SOAPConnector();
		
		
		client.setDefaultUri("https://webservices.preprod.kvk.nl/postbus2");
		
		
		client.setInterceptors(new ClientInterceptor[] {wss4jSecurityInterceptor()});
		
		
		KeyStore clientStore = KeyStore.getInstance("PKCS12");
		clientStore.load(new FileInputStream(new File("/home/ubuntu/cert.pfx")), "damith".toCharArray());
		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		kmf.init(clientStore, "damith".toCharArray());
		
		KeyManager[] kms = kmf.getKeyManagers();
		
		
		KeyStore trustStore = KeyStore.getInstance("JKS");
		trustStore.load(new FileInputStream("/home/ubuntu//cert.pfx"), "damith".toCharArray());

		TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		tmf.init(trustStore);
		TrustManager[] tms = tmf.getTrustManagers();
		
		 HttpsUrlConnectionMessageSender sender = new HttpsUrlConnectionMessageSender();
		 //   sender.setTrustManagers(new TrustManager[] {new HttpsTrustManager()});
		 sender.setTrustManagers(tms);
		 sender.setKeyManagers(kms);
		 //sender.setHostnameVerifier(NoopHostnameVerifier.INSTANCE);

		    
		    
//		    RequestConfig config = RequestConfig
//		            .custom()
//		            .setProxy(new HttpHost("ouparray.oup.com", 8080, "http"))
//		            .build();
//
//		    CloseableHttpClient client1 = HttpClients
//		            .custom()
//		            .setDefaultRequestConfig(config)
//		            .build();
//
//		    HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender(client1);
		    
		    
		    client.setMessageSender(sender);
		    


	        
		    
		    client.setMessageSender(sender);
//		client.setMarshaller(marshaller);
//		client.setUnmarshaller(marshaller);
		return client;
	}

	
	
	public Wss4jSecurityInterceptor wss4jSecurityInterceptor() throws Exception {
		Wss4jSecurityInterceptor wss4jSecurityInterceptor =new Wss4jSecurityInterceptor();
		
		
		wss4jSecurityInterceptor.setSecurementActions("Signature");
		wss4jSecurityInterceptor.setSecurementUsername("cert");
		wss4jSecurityInterceptor.setSecurementPassword("damith");
		
		
		
		CryptoFactoryBean cryptoFactoryBean = new CryptoFactoryBean();
		
		cryptoFactoryBean.setKeyStorePassword("damith");
		cryptoFactoryBean.setKeyStoreLocation(new FileSystemResource("/home/ubuntu/cert.pfx"));
		cryptoFactoryBean.setKeyStoreType("PKCS12");
		
		cryptoFactoryBean.afterPropertiesSet();
		
		wss4jSecurityInterceptor.setSecurementActions("Encrypt Signature");
		
		wss4jSecurityInterceptor.setSecurementSignatureCrypto(cryptoFactoryBean.getObject());
		wss4jSecurityInterceptor.setSecurementEncryptionCrypto(cryptoFactoryBean.getObject());
		
		
//		wss4jSecurityInterceptor.setValidationActions("Encrypt Signature");
//		
//		wss4jSecurityInterceptor.setValidationDecryptionCrypto(cryptoFactoryBean.getObject());
//		wss4jSecurityInterceptor.setValidationSignatureCrypto((cryptoFactoryBean.getObject()));
		
		
		wss4jSecurityInterceptor.setSecurementSignatureKeyIdentifier("DirectReference");
		
		return wss4jSecurityInterceptor;
	}
}
