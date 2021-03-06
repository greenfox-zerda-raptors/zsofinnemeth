package com.greenfoxacademy.service;

import com.greenfoxacademy.domain.Post;
import com.greenfoxacademy.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import java.util.List;

@Component
public class PostService {

    @Autowired
    private PostRepository repository;

    private PostService() {
    }

    public List<Post> getPostsOrderedByScore() {
        return repository.findAll(new Sort(Sort.Direction.DESC, "score"));
    }

    public void vote(int vote, long id) {
        Post post = repository.findOne(id);
        post.setScore(post.getScore()+ vote);
        repository.save(post);
    }

    public void deletePost(long id) {
        repository.delete(id);
    }

    public void createNewPost(@Valid String message, @Valid String content) {
        repository.save(new Post(message, content));
    }

    public void updatePost(Long id, String message, String content) {
        Post post = repository.findOne(id);
        post.setMessage(message);
        post.setContent(content);
        repository.save(post);
    }

    public Post findOne(long id) {
       return repository.findOne(id);

    }
}
