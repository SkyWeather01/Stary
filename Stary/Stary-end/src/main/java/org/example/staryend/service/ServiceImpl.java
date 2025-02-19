package org.example.staryend.service;

import org.example.staryend.entity.*;
import org.example.staryend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public  class ServiceImpl {
    //实现UserService接口
    @Service
    public class UserServiceImpl implements UserService {

        @Autowired
        private UserRepository userRepository;

        @Override
        public User createUser(User user) {
            return userRepository.save(user);
        }

        @Override
        public User getUserById(Long id) {
            return userRepository.findById(id).orElse(null);
        }

        @Override
        public User getUserByUsername(String username) {
            return userRepository.findByUsername(username);
        }

        @Override
        public boolean existsByUsername(String username) {
            return userRepository.existsByUsername(username);
        }

        @Override
        public boolean existsByEmail(String email) {
            return userRepository.existsByEmail(email);
        }
    }
    //实现PostService接口
    @Service
    public class PostServiceImpl implements PostService {

        @Autowired
        private PostRepository postRepository;

        @Override
        public Post createPost(Post post) {
            return postRepository.save(post);
        }

        @Override
        public List<Post> getPostsByUserId(Long userId) {
            return postRepository.findByUser_IdOrderByPostTimeDesc(userId);
        }
    }
    //实现CommentService接口
    @Service
    public class CommentServiceImpl implements CommentService {

        @Autowired
        private CommentRepository commentRepository;

        @Override
        public Comment createComment(Comment comment) {
            return commentRepository.save(comment);
        }

        @Override
        public List<Comment> getCommentsByPostId(Long postId) {
            return commentRepository.findByPost_IdOrderByCommentTimeDesc(postId);
        }
    }

}


