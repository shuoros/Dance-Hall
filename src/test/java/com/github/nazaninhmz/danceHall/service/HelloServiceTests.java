package com.github.nazaninhmz.danceHall.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloServiceTests {

    @Autowired
    private HelloService helloService;

//    @Test
//    void testSayHelloFunction() {
//        // Arrange
//        final String name = "Nazanin";
//
//        // Act
//        final String result = helloService.sayHello(name);
//
//        // Assert
//        assertEquals("Salam " + name + ", Khosh oomadi!", result);
//    }

}
