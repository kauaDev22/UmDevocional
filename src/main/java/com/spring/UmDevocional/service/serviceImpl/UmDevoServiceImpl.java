package com.spring.UmDevocional.service.serviceImpl;

import com.spring.UmDevocional.model.Post;
import com.spring.UmDevocional.repository.UmDevoRepository;
import com.spring.UmDevocional.service.UmDevoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmDevoServiceImpl implements UmDevoService {

    @Autowired
    UmDevoRepository umDevoRepository;

    @Override
    public List<Post> findAll() {
        return umDevoRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return umDevoRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return umDevoRepository.save(post);
    }
}
