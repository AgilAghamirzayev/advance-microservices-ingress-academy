package com.mastercode.breakthemagicanofspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Configuration
public class BreakTheMagicianOfSpringBootApplication {

  @Bean
  public TomcatServletWebServerFactory containerFactory() {
    return new TomcatServletWebServerFactory();
  }

  public static void main(String[] args) {

    SpringApplication.run(BreakTheMagicianOfSpringBootApplication.class, args);
  }

  @RestController
  @RequestMapping
  static class HelloController {

    @GetMapping
    public String hello() {
      return "hello world";
    }

  }


}
