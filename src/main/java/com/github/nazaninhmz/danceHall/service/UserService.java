package com.github.nazaninhmz.danceHall.service;

import com.github.nazaninhmz.danceHall.domain.User;
import com.github.nazaninhmz.danceHall.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(String name) {
        final Random rand = new Random();
        final User user = new User(rand.nextInt(50), name);
        userRepository.saveUser(user);
        return user;
    }

    public User getUser(int id) {
        return userRepository.getUserById(id);
    }

}
