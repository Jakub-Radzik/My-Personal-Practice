package com.example.demo.Service;

import com.example.demo.Model.Course;
import com.example.demo.Model.Registration;
import com.example.demo.Repository.CourseRepository;
import com.example.demo.Repository.RegistrationRepository;
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
    private RegistrationRepository registrationRepository;
    @Autowired
    private CourseRepository courseRepository;

    @Override
    @Transactional
    public Registration addRegistration(Registration registration) {
        registration = registrationRepository.save(registration);

        Course course = new Course();
        course.setName("Intro");
        course.setDescription("Every attendee must");
        course.setRegistration(registration);

        courseRepository.save(course);

        return registration;
    }
}
