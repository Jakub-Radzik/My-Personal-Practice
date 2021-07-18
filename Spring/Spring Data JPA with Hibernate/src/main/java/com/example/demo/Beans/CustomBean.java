package com.example.demo.Beans;

import org.springframework.context.annotation.Bean;

public class CustomBean {

    @Bean
    public String bean(){
        String s = "SIEEEEEEMA";
        System.out.println(s);
        return s;
    }


}
