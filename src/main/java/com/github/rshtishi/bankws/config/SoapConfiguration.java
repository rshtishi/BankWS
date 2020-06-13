package com.github.rshtishi.bankws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapConfiguration {
	
	@Bean
	public SoapProperties soapProperties() {
		return new SoapProperties();
	}

}
