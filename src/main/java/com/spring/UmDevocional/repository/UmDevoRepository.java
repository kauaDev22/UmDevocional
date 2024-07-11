package com.spring.UmDevocional.repository;

import com.spring.UmDevocional.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UmDevoRepository extends JpaRepository<Post, Long> {
}
