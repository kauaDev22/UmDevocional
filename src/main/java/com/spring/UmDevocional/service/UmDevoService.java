package com.spring.UmDevocional.service;

import com.spring.UmDevocional.model.Post;

import java.util.List;

public interface UmDevoService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);
}
