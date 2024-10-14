package com.nco.blog_api_rest_spring_boot.service;

import com.nco.blog_api_rest_spring_boot.model.Post;
import com.nco.blog_api_rest_spring_boot.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> getAllPostsSvc (){
        return this.postRepository.findAll();
    }

    public Post getPostByIdSvc(Long id){
        return this.postRepository.findById(id).get();
    }

    public Post createPostSvc(Post post){
        return this.postRepository.save(post);
    }

    public Post updatePostSvc(Post requestPost, Long id){
        Post post = this.postRepository.findById(id).get();
        post.setName(requestPost.getName());
        this.postRepository.save(post);
        return post;
    }

    public void deletePostSvc(Long id){
        this.postRepository.deleteById(id);
    }
}
