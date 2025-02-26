package org.example.staryend.repository;


import org.example.staryend.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByUser_IdOrderByPostTimeDesc(Long userId);
}
