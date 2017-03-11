package com.quartzactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties
@EnableWebSecurity
public class QuartztestApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuartztestApplication.class, args);
    }
}
