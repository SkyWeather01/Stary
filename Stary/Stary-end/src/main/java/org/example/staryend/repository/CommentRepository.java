package org.example.staryend.repository;

import org.example.staryend.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost_IdOrderByCommentTimeDesc(Long postId);
}
