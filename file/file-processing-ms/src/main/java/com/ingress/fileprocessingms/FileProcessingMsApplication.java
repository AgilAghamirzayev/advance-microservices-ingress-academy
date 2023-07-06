package com.ingress.fileprocessingms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FileProcessingMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileProcessingMsApplication.class, args);
    }

}
