package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (usersCount > 0) {
            averagePostsPerUser = (double) postsCount / usersCount;
            averageCommentsPerUser = (double) commentsCount / usersCount;
        } else {
            averagePostsPerUser = 0.0;
            averageCommentsPerUser = 0.0;
        }

        if (postsCount > 0) {
            averageCommentsPerPost = (double) commentsCount / postsCount;
        } else {
            averageCommentsPerPost = 0.0;
        }
    }

    public void showStatistics() {
        System.out.println("Users count: " + usersCount);
        System.out.println("Posts count: " + postsCount);
        System.out.println("Comments count: " + commentsCount);
        System.out.println("Average posts per user: " + averagePostsPerUser);
        System.out.println("Average comments per user: " + averageCommentsPerUser);
        System.out.println("Average comments per post: " + averageCommentsPerPost);
    }

    // Getters for testing
    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
