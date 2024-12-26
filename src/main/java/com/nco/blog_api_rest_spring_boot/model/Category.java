package com.nco.blog_api_rest_spring_boot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String slug;

    @JsonIgnore
    @OneToMany(targetEntity = Post.class, fetch = FetchType.LAZY, mappedBy = "category") //mapperBy me sirve para enviarle el id y se relacione con un Post
    List<Post> posts;
}
