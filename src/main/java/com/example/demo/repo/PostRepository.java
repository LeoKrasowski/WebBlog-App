package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Post;


public interface PostRepository extends CrudRepository<Post, Long> {

}
