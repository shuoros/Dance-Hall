package com.github.nazaninhmz.danceHall.service;

import com.github.nazaninhmz.danceHall.domain.User;
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
    public List<User> allUsers(){ return userRepository.findAll();}
    public User newUser(User user){ return userRepository.save(user);}
    public User updateUser(User user , Integer id){
        user.setId(id);
        return userRepository.save(user);
    }
    public void deleteUser(Integer id){ userRepository.deleteById(id);}

}
