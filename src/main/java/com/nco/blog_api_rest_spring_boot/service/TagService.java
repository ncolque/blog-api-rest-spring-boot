package com.nco.blog_api_rest_spring_boot.service;

import com.nco.blog_api_rest_spring_boot.model.Tag;
import com.nco.blog_api_rest_spring_boot.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagService {
    private final TagRepository tagRepository;

    public List<Tag> getAllTagsSvc(){
        return this.tagRepository.findAll();
    }

    public Tag getTagByIdSvc(Long id){
        return this.tagRepository.findById(id).get();
    }

    public Tag createTagSvc(Tag tag){
        return this.tagRepository.save(tag);
    }

    public Tag updateTagSvc(Tag requestTag, Long id){
        Tag tag = this.tagRepository.findById(id).get();
        tag.setName(requestTag.getName());
        this.tagRepository.save(tag);
        return tag;
    }

    public void deleteTagSvc(Long id){
        this.tagRepository.deleteById(id);
    }
}
