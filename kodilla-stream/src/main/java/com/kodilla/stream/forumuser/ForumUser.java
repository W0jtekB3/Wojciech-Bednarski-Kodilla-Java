package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private int userId;
    private String username;
    private char gender;
    private LocalDate dateOfBirth;
    private int numberOfPosts;

    public ForumUser(int userId, String username, char gender, LocalDate dateOfBirth, int numberOfPosts) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }
}
