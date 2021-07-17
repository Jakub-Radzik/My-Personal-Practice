package com.example.demo.Service;

import com.example.demo.Model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: Jakub Radzik
 * Date: 16.07.2021
 * Time: 14:16
 * To change this template use File | Settings | File and Code Templates.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user) {
        userRepository.save(user);
        return user;
    }

}
