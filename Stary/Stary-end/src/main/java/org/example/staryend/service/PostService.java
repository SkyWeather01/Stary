package org.example.staryend.service;

import org.example.staryend.entity.Post;

import java.util.List;

public interface PostService {
    Post createPost(Post post);
    List<Post> getPostsByUserId(Long userId);
}
