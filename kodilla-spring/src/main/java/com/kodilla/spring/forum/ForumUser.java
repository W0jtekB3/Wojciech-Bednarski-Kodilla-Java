package com.kodilla.spring.forum;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ForumUser {
    private String username;
    private List<ForumPost> posts;
    private List<ForumComment> comments;

    public ForumUser(String username) {
        this.username = username;
        this.posts = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void addPost(String username, String postBody) {
        posts.add(new ForumPost(postBody, username));
    }

    public int getPostsQuantity() {
        return posts.size();
    }

    public void addComment(ForumPost thePost, String username, String commentBody) {
        comments.add(new ForumComment(thePost, username, commentBody));
    }

    public int getCommentsQuantity() {
        return comments.size();
    }

    public ForumPost getPost(int index) {
        if (index >= 0 && index < posts.size()) {
            return posts.get(index);
        }
        return null;
    }

    public ForumComment getComment(int index) {
        if (index >= 0 && index < comments.size()) {
            return comments.get(index);
        }
        return null;
    }

    public boolean removePost(ForumPost thePost) {
        return posts.remove(thePost);
    }

    public boolean removeComment(ForumComment theComment) {
        return comments.remove(theComment);
    }
}
