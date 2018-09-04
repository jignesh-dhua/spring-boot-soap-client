package com.example.howtodoinjava.springbootsoapclient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

public class HttpsTrustManager implements X509TrustManager

{

	@Override
	public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
		// TODO Auto-generated method stub

	}

	@Override
	public X509Certificate[] getAcceptedIssuers() {

		CertificateFactory fact;
//		try {
//			fact = CertificateFactory.getInstance("X.509");
//
//			X509Certificate cer1 = (X509Certificate) fact.generateCertificate(new FileInputStream(
//					"C:/Users/dhuaj/Documents/Personal/soapUiPoject/certificates/final/development_companyinfo_bridgefund_nl.crt"));
//
//			X509Certificate cer2 = (X509Certificate) fact.generateCertificate(new FileInputStream(
//					"C:/Users/dhuaj/Documents/Personal/soapUiPoject/certificates/final/COMODORSAAddTrustCA.crt"));
//
//			X509Certificate cer3 = (X509Certificate) fact.generateCertificate(new FileInputStream(
//					"C:/Users/dhuaj/Documents/Personal/soapUiPoject/certificates/final/COMODORSADomainValidationSecureServerCA.crt"));
//
//			X509Certificate cer4 = (X509Certificate) fact.generateCertificate(new FileInputStream(
//					"C:/Users/dhuaj/Documents/Personal/soapUiPoject/certificates/final/AddTrustExternalCARoot.crt"));
//
//			X509Certificate cer5 = (X509Certificate) fact.generateCertificate(new FileInputStream(
//					"C:/Users/dhuaj/Documents/Personal/soapUiPoject/certificates/final/tempcertfile.crt"));
//
//			X509Certificate cer6 = (X509Certificate) fact.generateCertificate(new FileInputStream(
//					"C:/Users/dhuaj/Documents/Personal/soapUiPoject/certificates/final/tempcertfile.crt"));

		//	return new X509Certificate[] { cer6 };
//		} catch (CertificateException e) {
//			e.printStackTrace();
//			return new X509Certificate[] {};
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			return new X509Certificate[] {};
//		}

		return new X509Certificate[] {};
	}

}