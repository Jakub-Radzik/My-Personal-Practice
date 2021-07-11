package com.example.springtransactions.JPArelations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class CreatorService implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public EntityManager entityManager;

    @Autowired
    public CreatorService(EntityManager em) {
        entityManager = em;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Inserting new HUMANS !!!!");

        generateEntity("Jakub", "Spacerowa", 20, "Java", "JPA", "PHP", "TypeScript");
        generateEntity("Andrzej", "Główna", 22, "Java", "Spring", "PHP", "Python");
        generateEntity("Piotr", "Obornicka", 23, "Java", "JPA", "PHP", "Angular");
        generateEntity("Jakub", "Główna", 24, "JavaScript", "JPA", "PHP", "Python");

    }

    private void generateEntity(String name, String street, int number, String... technologies){

        Set<Technology> technologySet = Arrays.stream(technologies)
                                        .map(Technology::new)
                                        .collect(Collectors.toSet());

        Address address = new Address(street, number);

        entityManager.persist(new Human(name, address, technologySet));
    }
}

