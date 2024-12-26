package com.nco.blog_api_rest_spring_boot.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String slug;
    String extract;
    String body;
    String status;

    @ManyToOne(targetEntity = Category.class)
    //@JoinColumn(name = "category_id_modificar_nombre")
    Category category;
}
