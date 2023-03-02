package com.blogapp.blogapp.repository;

import com.blogapp.blogapp.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}