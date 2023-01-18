package com.github.nazaninhmz.danceHall.service;


import com.github.nazaninhmz.danceHall.domain.Post;
import com.github.nazaninhmz.danceHall.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post newPost(Post post) {return postRepository.save(post);}

    public Post updatePost(Post post, Integer id) {
        post.setId(id);
        return postRepository.save(post);
    }

    public void deletePost(Integer id) {postRepository.deleteById(id);}

}
