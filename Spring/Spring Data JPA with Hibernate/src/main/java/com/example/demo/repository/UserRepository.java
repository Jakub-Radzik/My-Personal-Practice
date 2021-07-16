package com.example.demo.repository;

import com.example.demo.model.User;

/**
 * Created by IntelliJ IDEA.
 * User: Jakub Radzik
 * Date: 16.07.2021
 * Time: 14:29
 * To change this template use File | Settings | File and Code Templates.
 */
public interface UserRepository {
    User save(User user);
}
