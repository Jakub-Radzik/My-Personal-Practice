package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaHibernateApplication.class, args);
    }

    @Bean
    public String bean(){
        String s = "SIEEEEEEMA";
        System.out.println(s);
        return s;
    }

}
