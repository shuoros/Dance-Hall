package com.github.nazaninhmz.danceHall.domain;

import com.github.nazaninhmz.danceHall.domain.enumeration.DanceType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private int id;
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String bio;
    private DanceType danceType;
    private User teacher;
    //private List<Post> posts;

}
