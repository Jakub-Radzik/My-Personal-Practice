package com.example.demo.Controller;

import com.example.demo.Service.RegistrationService;
import com.example.demo.Model.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by IntelliJ IDEA.
 * User: Jakub Radzik
 * Date: 16.07.2021
 * Time: 14:41
 * To change this template use File | Settings | File and Code Templates.
 */
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration")Registration registration) {
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(/*@Valid*/ @ModelAttribute("registration") Registration registration, BindingResult result){
        if(result.hasErrors()){
            System.out.println("ERROS");
            return "registration";
        }else{
            registrationService.addRegistration(registration);
        }

        System.out.println(registration.getName());
        return "redirect:registration";
    }
}
