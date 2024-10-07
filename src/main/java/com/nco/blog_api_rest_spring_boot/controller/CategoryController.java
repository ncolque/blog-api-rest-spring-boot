package com.nco.blog_api_rest_spring_boot.controller;

import com.nco.blog_api_rest_spring_boot.model.Category;
import com.nco.blog_api_rest_spring_boot.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategories(){
        return this.categoryService.getAllCategoriesSvc();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable("id") Long id){
        return categoryService.getCategoryByIdSvc(id);
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category){
        return this.categoryService.createCategorySvc(category);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@RequestBody Category categoryRequest, @PathVariable("id") Long id){
        return this.categoryService.updateCategorySvc(categoryRequest, id);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") Long id){
        this.categoryService.deleteCategorySvc(id);
    }
}
