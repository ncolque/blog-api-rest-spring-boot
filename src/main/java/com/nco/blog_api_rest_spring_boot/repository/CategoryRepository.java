package com.nco.blog_api_rest_spring_boot.repository;

import com.nco.blog_api_rest_spring_boot.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
