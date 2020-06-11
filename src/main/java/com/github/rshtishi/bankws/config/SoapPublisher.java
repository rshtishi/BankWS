package com.github.rshtishi.bankws.config;

import javax.xml.ws.Endpoint;

import com.github.rshtishi.bankws.service.BankAccountServiceImpl;

public class SoapPublisher {

	public SoapPublisher() {
		final String url = "http://localhost:8888/baws";
		Endpoint.publish(url, new BankAccountServiceImpl());
	}

}
