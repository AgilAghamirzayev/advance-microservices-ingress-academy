package com.mastercode.breakthemagicanofspringboot.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatConfiguration {

	@Bean
	public TomcatServletWebServerFactory containerFactory() {
		return new TomcatServletWebServerFactory();
	}

}