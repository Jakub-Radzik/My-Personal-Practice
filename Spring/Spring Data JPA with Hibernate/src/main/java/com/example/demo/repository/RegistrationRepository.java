package com.example.demo.repository;

import com.example.demo.model.Registration;

/**
 * Created by IntelliJ IDEA.
 * User: Jakub Radzik
 * Date: 16.07.2021
 * Time: 14:46
 * To change this template use File | Settings | File and Code Templates.
 */
public interface RegistrationRepository {
    Registration save(Registration registration);
}
