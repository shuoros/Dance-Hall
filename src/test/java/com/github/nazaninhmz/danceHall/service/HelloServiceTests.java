//package com.github.nazaninhmz.danceHall.service;
//
//import com.github.nazaninhmz.danceHall.domain.User;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//public class HelloServiceTests {
//
//    @Autowired
//    private HelloService helloService;
//
//    @Autowired
//    private UserService userService;
//
//    private String name = "nazanin";
//    private User user;
//
//    @BeforeEach
//    void prepare(){
//        user = userService.registerUser(name);
//    }
//
//    @Test
//    void testSayHelloFunction() {
//        // Arrange
//        final int id = user.getId();
//
//        // Act
//        final String result = helloService.sayHello(id);
//
//        // Assert
//        assertEquals("Salam " + name + ", Khosh oomadi!", result);
//    }
//
//}
