package com.example.demo.Service;

import com.example.demo.Model.Registration;

import javax.transaction.Transactional;

/**
 * Created by IntelliJ IDEA.
 * User: Jakub Radzik
 * Date: 16.07.2021
 * Time: 14:40
 * To change this template use File | Settings | File and Code Templates.
 */
public interface RegistrationService {
    @Transactional
    Registration addRegistration(Registration registration);
}
