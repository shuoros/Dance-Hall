package com.github.nazaninhmz.danceHall.controller;

import com.github.nazaninhmz.danceHall.domain.Comment;
import com.github.nazaninhmz.danceHall.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/newComment")
    Comment newComment(@RequestBody Comment newComment){return commentService.newComment(newComment);}

    @DeleteMapping("/deleteComment/{id}")
    void deleteComment(@PathVariable Integer id){commentService.deleteComment(id);}
}
