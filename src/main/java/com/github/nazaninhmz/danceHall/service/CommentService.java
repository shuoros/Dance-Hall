package com.github.nazaninhmz.danceHall.service;


import com.github.nazaninhmz.danceHall.domain.Comment;
import com.github.nazaninhmz.danceHall.domain.User;
import com.github.nazaninhmz.danceHall.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment newComment(Comment newComment) {return commentRepository.save(newComment);}

    public void deleteComment(Integer id) {commentRepository.deleteById(id);}
}
