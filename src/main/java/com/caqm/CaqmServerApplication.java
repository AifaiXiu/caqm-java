package com.caqm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.caqm.repository")  // repository 所在的包
@EntityScan(basePackages = "com.caqm.entity")
public class CaqmServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaqmServerApplication.class, args);
    }

}
