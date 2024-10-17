package com.nco.blog_api_rest_spring_boot.repository;

import com.nco.blog_api_rest_spring_boot.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
