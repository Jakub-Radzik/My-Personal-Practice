package com.example.demo.ExampleFromBykowski.Services;

import com.example.demo.ExampleFromBykowski.Entity.User;
import com.example.demo.ExampleFromBykowski.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserManager {

    private final UserRepo userRepo;

    @Autowired
    public UserManager(UserRepo userRepo) {
        this.userRepo = userRepo;

        User user = new User();
        user.setUsername("Jakub");
        user.setSurname("Radzik");
        userRepo.save(user);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        User user = new User();
        user.setUsername("Piotr");
        user.setSurname("Patalas");
        userRepo.save(user);
    }
}
