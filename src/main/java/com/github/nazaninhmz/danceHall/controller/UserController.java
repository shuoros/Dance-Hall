package com.github.nazaninhmz.danceHall.controller;

import com.github.nazaninhmz.danceHall.domain.User;
import com.github.nazaninhmz.danceHall.repository.UserRepository;
import com.github.nazaninhmz.danceHall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")
    public List<User> allUsers() {
        return userService.allUsers();
    }

    @PostMapping("/newUser")
    User newUser(@RequestBody User newUser){return userService.newUser(newUser);}

    @PutMapping("/updateUser/{id}")
    User updateUser(@RequestBody User user , @PathVariable Integer id){return userService.updateUser(user,id);}

    @DeleteMapping("/deleteUser/{id}")
    void deleteUser(@PathVariable Integer id){userService.deleteUser(id);}



    // /newUser?name=nazanin
//    @PostMapping(
//            value = "/newUser",
//            consumes = {MediaType.APPLICATION_JSON_VALUE},
//            produces = {MediaType.APPLICATION_JSON_VALUE}
//    )
//    public User newUser(@RequestBody User user) {
//        return userService.registerUser(user);
//    }
//
//    @PostMapping(
//            value = "/setTeacher",
//            consumes = {MediaType.APPLICATION_JSON_VALUE},
//            produces = {MediaType.APPLICATION_JSON_VALUE}
//    )
//    @ResponseStatus(HttpStatus.OK)
//    public void setTeacher(@RequestBody User user){
//        System.out.println(user);
//        userService.setTeacher(user);
//    }

}
