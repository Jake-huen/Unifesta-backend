package com.wit.unifesta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class UnifestaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnifestaApplication.class, args);
    }

}
