package com.github.nazaninhmz.danceHall.service;

import com.github.nazaninhmz.danceHall.domain.Like;
import com.github.nazaninhmz.danceHall.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    public Like newLike(Like like){return likeRepository.save(like);}
    public void deleteLike(Integer id){likeRepository.deleteById(id);}


}


