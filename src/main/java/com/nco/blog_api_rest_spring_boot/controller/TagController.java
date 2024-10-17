package com.nco.blog_api_rest_spring_boot.controller;

import com.nco.blog_api_rest_spring_boot.model.Tag;
import com.nco.blog_api_rest_spring_boot.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/tags")
public class TagController {
    private final TagService tagService;

    @GetMapping
    public List<Tag> getAllTags(){
        return this.tagService.getAllTagsSvc();
    }

    @GetMapping("/{id}")
    public Tag getTagById(@PathVariable Long id){
        return this.tagService.getTagByIdSvc(id);
    }

    @PostMapping
    public Tag createTag(@RequestBody Tag tag){
        return this.tagService.createTagSvc(tag);
    }

    @PutMapping("/{id}")
    public Tag updateTag(@RequestBody Tag tag, @PathVariable Long id){
        return this.tagService.updateTagSvc(tag, id);
    }

    @DeleteMapping("/{id}")
    public void deleteTag(@PathVariable Long id){
        this.tagService.deleteTagSvc(id);
    }
}
