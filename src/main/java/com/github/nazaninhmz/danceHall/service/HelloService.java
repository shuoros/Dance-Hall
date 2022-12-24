package com.github.nazaninhmz.danceHall.service;

import com.github.nazaninhmz.danceHall.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    private UserService userService;

    public String sayHello(int id) {
        final User user = userService.getUser(id);
        return "Salam " + user.getFirstName() + ", Khosh oomadi!";
    }

}
