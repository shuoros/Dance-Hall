package com.github.nazaninhmz.danceHall.controller;

import com.github.nazaninhmz.danceHall.domain.Post;
import com.github.nazaninhmz.danceHall.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/newPost")
    Post newPost(Post post){return postService.newPost(post);}

    @PutMapping("/updatePost/{id}")
    Post updatePost(Post post , Integer id){return postService.updatePost(post, id);}

    @DeleteMapping("/deletePost/{id}")
    void deletePost(Integer id){postService.deletePost(id);}

}
