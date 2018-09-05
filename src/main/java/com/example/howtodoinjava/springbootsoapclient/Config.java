package com.example.howtodoinjava.springbootsoapclient;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;
import org.springframework.ws.soap.security.wss4j2.support.CryptoFactoryBean;
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
		
		
//		KeyStore clientStore = KeyStore.getInstance("JKS");
//		clientStore.load(new FileInputStream(new File("/home/ubuntu/development_companyinfo_bridgefund_nl_p7b.jks")), "damith".toCharArray());
//		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
//		kmf.init(clientStore, "damith".toCharArray());
//		
//		KeyManager[] kms = kmf.getKeyManagers();
//		
//		
//		KeyStore trustStore = KeyStore.getInstance("JKS");
//		trustStore.load(new FileInputStream("/home/ubuntu/development_companyinfo_bridgefund_nl_p7b.jks"), "damith".toCharArray());
//
//		TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
//		tmf.init(trustStore);
//		TrustManager[] tms = tmf.getTrustManagers();
//		
//		 HttpsUrlConnectionMessageSender sender = new HttpsUrlConnectionMessageSender();
//		 sender.setTrustManagers(new TrustManager[] {new HttpsTrustManager()});
//		 //sender.setTrustManagers(tms);
//		 sender.setKeyManagers(kms);
		 //sender.setHostnameVerifier(NoopHostnameVerifier.INSTANCE);

		    
		    //client.setMessageSender(sender);
		    
	    //client.setMessageSender(sender);
//		client.setMarshaller(marshaller);
//		client.setUnmarshaller(marshaller);
		return client;
	}

	
	
	public Wss4jSecurityInterceptor wss4jSecurityInterceptor() throws Exception {
		Wss4jSecurityInterceptor wss4jSecurityInterceptor =new Wss4jSecurityInterceptor();
		
		
		wss4jSecurityInterceptor.setSecurementUsername("cert");
		wss4jSecurityInterceptor.setSecurementPassword("damith");
		
		
		
		CryptoFactoryBean cryptoFactoryBean = new CryptoFactoryBean();
		
		cryptoFactoryBean.setKeyStorePassword("damith");
		cryptoFactoryBean.setKeyStoreLocation(new FileSystemResource("/home/ubuntu/development_companyinfo_bridgefund_nl_p7b.jks"));
		cryptoFactoryBean.setKeyStoreType("JKS");
		cryptoFactoryBean.setTrustStorePassword("damith");
		
		
		cryptoFactoryBean.afterPropertiesSet();
		
		wss4jSecurityInterceptor.setSecurementActions("Signature Timestamp");
		
		wss4jSecurityInterceptor.setSecurementSignatureCrypto(cryptoFactoryBean.getObject());
		wss4jSecurityInterceptor.setSecurementEncryptionCrypto(cryptoFactoryBean.getObject());
		//wss4jSecurityInterceptor.setSecurementSignatureAlgorithm("http://www.w3.org/2000/09/xmldsig#rsa-sha1");
        //wss4jSecurityInterceptor.setSecurementSignatureDigestAlgorithm("http://www.w3.org/2000/09/xmldsig#sha1");
        
		
		
		wss4jSecurityInterceptor.setSecurementSignatureParts(
	                "{Element}{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd}Timestamp;" +
	                        "{Element}{http://schemas.xmlsoap.org/soap/envelope/}Body"
	        );
		
		
		wss4jSecurityInterceptor.setValidationActions("Signature Timestamp");
		
		wss4jSecurityInterceptor.setValidationDecryptionCrypto(cryptoFactoryBean.getObject());
		wss4jSecurityInterceptor.setValidationSignatureCrypto((cryptoFactoryBean.getObject()));
		
		
		wss4jSecurityInterceptor.setSecurementSignatureKeyIdentifier("DirectReference");
		
		return wss4jSecurityInterceptor;
	}
	
	 @Bean
	    public Boolean disableSSLValidation() throws Exception {
	        final SSLContext sslContext = SSLContext.getInstance("TLS");

	        sslContext.init(null, new TrustManager[]{new X509TrustManager() {
	            @Override
	            public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
	            }

	            @Override
	            public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
	            }

	            @Override
	            public X509Certificate[] getAcceptedIssuers() {
	                return new X509Certificate[0];
	            }
	        }}, null);

	        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
	        HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
	            public boolean verify(String hostname, SSLSession session) {
	                return true;
	            }
	        });

	        return true;
	    }
}
