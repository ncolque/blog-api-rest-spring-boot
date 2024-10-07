package com.nco.blog_api_rest_spring_boot.service;

import com.nco.blog_api_rest_spring_boot.model.Category;
import com.nco.blog_api_rest_spring_boot.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> getAllCategoriesSvc(){
        return this.categoryRepository.findAll();
    }

    public Category getCategoryByIdSvc(Long id){
        return this.categoryRepository.findById(id).get();
    }

    public Category createCategorySvc(Category category){
        return this.categoryRepository.save(category);
    }

    public Category updateCategorySvc(Category categoryRequest, Long id){
        Category category = this.categoryRepository.findById(id).get();
        category.setName(categoryRequest.getName());
        this.categoryRepository.save(category);
        return category;
    }

    public void deleteCategorySvc(Long id){
        this.categoryRepository.deleteById(id);
    }
}
