package com.github.nazaninhmz.danceHall.controller;

import com.github.nazaninhmz.danceHall.domain.Like;
import com.github.nazaninhmz.danceHall.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LikeController {

    @Autowired
    private LikeService likeService;


    @PostMapping("/newLike")
    Like newLike(@RequestBody Like like){return likeService.newLike(like);}

    @DeleteMapping("/deleteLike/{id}")
    void deleteLike(@PathVariable Integer id){likeService.deleteLike(id);}
}
