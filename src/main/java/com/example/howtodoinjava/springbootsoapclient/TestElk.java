package com.example.howtodoinjava.springbootsoapclient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
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

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class TestElk {

	
	static String request = 
			"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns=\"http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02\" xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">\r\n" + 
			"   <soapenv:Header>\r\n" + 
			"      <wsa:To>http://es.kvk.nl/kvk-DataservicePP/2015/02</wsa:To>\r\n" + 
			"      <wsa:Action>http://es.kvk.nl/ophalenInschrijving</wsa:Action>\r\n" + 
			"      <wsa:MessageID>uuid:7ad97e7a-26d7-4c4e-997c-1f7e0e88aa97</wsa:MessageID>\r\n" + 
			"   </soapenv:Header>\r\n" + 
			"   <soapenv:Body>\r\n" + 
			"      <ns:ophalenInschrijvingRequest xmlns:ns=\"http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02\">\r\n" + 
			"         <ns:klantreferentie>SoapUI-TEST</ns:klantreferentie>\r\n" + 
			"         <!--ns:kvkNummer>?</ns:kvkNummer-->\r\n" + 
			"         <ns:rsin>992353427</ns:rsin>\r\n" + 
			"      </ns:ophalenInschrijvingRequest>\r\n" + 
			"   </soapenv:Body>\r\n" + 
			"</soapenv:Envelope>";
	
	
	
	public static void main(String[] args)
			throws ClientProtocolException, IOException, CertificateException, NoSuchAlgorithmException,
			KeyStoreException, KeyManagementException, UnrecoverableKeyException, NoSuchProviderException {

		KeyStore clientStore = KeyStore.getInstance("PKCS12");
		clientStore.load(new FileInputStream(new File("C:/Users/dhuaj/Documents/Personal/soapUiPoject/certificates/final/cert.pfx")), "damith".toCharArray());
		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		kmf.init(clientStore, "damith".toCharArray());
		KeyManager[] kms = kmf.getKeyManagers();

		// Assuming that you imported the CA Cert "Subject: CN=MBIIS CA, OU=MBIIS,
		// O=DAIMLER, C=DE"
		// to your cacerts Store.
		KeyStore trustStore = KeyStore.getInstance("JKS");
		trustStore.load(new FileInputStream("C:/Program Files/Java/jdk1.8.0_181/jre/lib/security/cacerts"), "changeit".toCharArray());

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

		URL url = new URL("https://webservices.preprod.kvk.nl/postbus2");
		// System.setProperty("http.proxyHost", "53.88.72.33");
		// System.setProperty("http.proxyPort", "3128");
		//System.setProperty("https.proxyHost", "53.54.242.1"); // 53.54.242.1 //53.88.72.33
		//System.setProperty("https.proxyPort", "3128");

		HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko");
		con.setConnectTimeout(10000);
		con.setSSLSocketFactory(sslContext.getSocketFactory());
		con.connect();

		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line + "\n");
		}
		br.close();
		System.out.println(sb.toString());
		// int s= con.getResponseCode();
		
		
//		SSLConnectionSocketFactory factory = new SSLConnectionSocketFactory(sslContext,
//		        new String[] { "TLSv1" }, null, new NoopHostnameVerifier());
		
		
//		CloseableHttpClient httpclient = HttpClients.custom().build();//setSSLSocketFactory(factory).build();
//		
//		
//		
//		
//		HttpPost httpPost = new HttpPost("https://webservices.preprod.kvk.nl/postbus2");
//		
//		StringEntity mEntity = new StringEntity(request, "UTF-8");
//		httpPost.setEntity(mEntity);
//
//		
//		ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
//
//			@Override
//			public String handleResponse(
//					final HttpResponse response) throws ClientProtocolException, IOException {
//				int status = response.getStatusLine().getStatusCode();
//				if (status >= 200 && status < 300) {
//					HttpEntity entity = response.getEntity();
//					return entity != null ? EntityUtils.toString(entity, StandardCharsets.UTF_8) : null;
//				} else {
//					throw new ClientProtocolException("Unexpected response status: " + status);
//				}
//			}
//
//		};
//		
//		
//		String responseBody = httpclient.execute(httpPost, responseHandler);
//
//		System.out.println("===================");
//		System.out.println(responseBody);
	}

}