package com.example.demo.repository;

import com.example.demo.model.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by IntelliJ IDEA.
 * User: Jakub Radzik
 * Date: 16.07.2021
 * Time: 14:45
 * To change this template use File | Settings | File and Code Templates.
 */
@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Registration save(Registration registration){
        entityManager.persist(registration);
        return registration;
    }
}
