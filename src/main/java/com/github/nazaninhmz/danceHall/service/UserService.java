package com.github.nazaninhmz.danceHall.service;

import com.github.nazaninhmz.danceHall.domain.User;
import com.github.nazaninhmz.danceHall.exception.UserByThisUsernameDoesntExistException;
import com.github.nazaninhmz.danceHall.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public User updateUser(User user){
        return userRepository.updateUser(user);
    }

    public User registerUser(User input) {
        // TODO: Check email and username before register
        final Random rand = new Random();
        input.setId(rand.nextInt(500));
        userRepository.saveUser(input);
        return input;
    }

    public User getUser(int id) {
        return userRepository.getUserById(id);
    }

    public void setTeacher(User user) {
        final Optional<User> userOptional = userRepository.getUserByUserName(user.getTeacher().getUsername());
        user =  userRepository.getUserById(user.getId());
        if(userOptional.isPresent()){
            final User teacher = userOptional.get();
            user.setTeacher(teacher);
            userRepository.updateUser(user);
        } else {
            throw new UserByThisUsernameDoesntExistException();
        }
    }

}
