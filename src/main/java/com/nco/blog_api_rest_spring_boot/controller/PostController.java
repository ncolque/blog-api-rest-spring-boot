package com.nco.blog_api_rest_spring_boot.controller;

import com.nco.blog_api_rest_spring_boot.model.Post;
import com.nco.blog_api_rest_spring_boot.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    @GetMapping()
    public List<Post> getAllPosts(){
        return this.postService.getAllPostsSvc();
    }

    @PostMapping
    public Post createPost(@RequestBody Post post){
        return this.postService.createPostSvc(post);
    }

    @PutMapping("/{id}")
    public Post updatePost(@RequestBody Post postRequest, @PathVariable("id") Long id){
        return this.postService.updatePostSvc(postRequest, id);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable("id") Long id){
        this.postService.deletePostSvc(id);
    }
}
