package com.mastercode.breakthemagicanofspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BreakTheMagicianOfSpringBootApplication {

  @Bean
  public TomcatServletWebServerFactory containerFactory() {
    return new TomcatServletWebServerFactory();
  }

  public static void main(String[] args) {

    SpringApplication.run(BreakTheMagicianOfSpringBootApplication.class, args);
  }

}
