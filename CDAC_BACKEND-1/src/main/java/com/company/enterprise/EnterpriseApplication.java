package com.company.enterprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EnterpriseApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterpriseApplication.class, args);
    }
    
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(EnterpriseApplication.class);
    }
}
