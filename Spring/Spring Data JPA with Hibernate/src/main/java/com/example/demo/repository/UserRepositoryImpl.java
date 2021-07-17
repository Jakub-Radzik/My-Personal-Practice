package com.example.demo.repository;

import com.example.demo.Model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by IntelliJ IDEA.
 * User: Jakub Radzik
 * Date: 16.07.2021
 * Time: 14:28
 * To change this template use File | Settings | File and Code Templates.
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public User save(User user) {
        entityManager.persist(user);
        return user;
    }
}
