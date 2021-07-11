package com.example.springtransactions.services;

import com.example.springtransactions.Repository.CustomerRepository;
import com.example.springtransactions.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

//@Service
public class AccessingDataJpaApp implements CommandLineRunner {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CustomerRepository repo;

    @Override
    public void run(String... args) throws Exception {
        log.info("insert {}", repo.save(new Customer(1L,"Jakub", "Radzik")));
        log.info("insert {}", repo.save(new Customer(2L,"Piotr", "Patalas")));
        log.info("insert {}", repo.save(new Customer(3L, "ANd", "jak")));
    }
}
