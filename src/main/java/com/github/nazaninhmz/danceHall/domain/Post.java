package com.github.nazaninhmz.danceHall.domain;


import com.github.nazaninhmz.danceHall.domain.enumeration.DanceType;
import com.github.nazaninhmz.danceHall.domain.Like;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    @ManyToOne
    @JoinColumn
    private User user;

    private DanceType dancetype;

    private Date date;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "post")
    private List<Like> likes;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "post")
    private List<Comment> comments;

}
