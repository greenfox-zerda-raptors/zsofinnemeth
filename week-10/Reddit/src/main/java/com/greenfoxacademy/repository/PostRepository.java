package com.greenfoxacademy.repository;


import com.greenfoxacademy.domain.Post;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PostRepository extends CrudRepository <Post, Long> {

    List<Post> findAll(Sort sort);
}