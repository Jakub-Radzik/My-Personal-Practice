package com.example.demo.Service;

import com.example.demo.model.Registration;
import com.example.demo.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by IntelliJ IDEA.
 * User: Jakub Radzik
 * Date: 16.07.2021
 * Time: 14:39
 * To change this template use File | Settings | File and Code Templates.
 */
@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    RegistrationRepository registrationRepository;

    @Override
    @Transactional
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }
}
