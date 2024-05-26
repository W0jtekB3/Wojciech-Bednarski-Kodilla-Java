package com.kodilla.spring.forum;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username;

    public ForumUser(String mrsmith, String johnSmith) {
        this.username = "John Smith";
    }

    public String getUsername() {
        return username;
    }

    public void addPost(String mrsmith, String s) {
    }

    public int getPostsQuantity() {
    }

    public void addComment(com.kodilla.testing.forum.ForumPost thePost, String mrsmith, String s) {
    }

    public int getCommentsQuantity() {
        return 0;
    }

    public ForumPost getPost(int i) {
    }

    public ForumComment getComment(int i) {
    }

    public boolean removePost(ForumPost thePost) {
    }

    public boolean removeComment(ForumComment theComment) {
        return false;
    }
}
