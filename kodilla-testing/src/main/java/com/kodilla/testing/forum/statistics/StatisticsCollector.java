package com.kodilla.testing.forum.statistics;

public class StatisticsCollector {
    private int userCounter;
    private int postCounter;
    private int commentCounter;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getUserCounter() {
        return userCounter;
    }

    public int getPostCounter() {
        return postCounter;
    }

    public int getCommentCounter() {
        return commentCounter;
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

    public void calculateAdvStatistics(Statistics statistics) {
        this.userCounter = statistics.usersNames().size();
        this.commentCounter = statistics.commentsCount();
        this.postCounter = statistics.postsCount();

        if (userCounter != 0) {
            this.averagePostsPerUser = postCounter / userCounter;
        } else {
            averagePostsPerUser = 0;
        }

        if (userCounter != 0) {
            this.averageCommentsPerUser = commentCounter / userCounter;
        } else {
            averageCommentsPerUser = 0;
        }

        if (postCounter != 0) {
            this.averageCommentsPerPost = commentCounter / postCounter;
        } else {
            averageCommentsPerPost = 0;
        }
    }


    public void showStatistics() {
        System.out.println("Number of users is: " + getUserCounter());
        System.out.println("Number of posts is: " + getPostCounter());
        System.out.println("Number of comments is: " + getCommentCounter());
        System.out.println("Average posts per user is: " + getAveragePostsPerUser());
        System.out.println("Average comments per user is: " + getAverageCommentsPerUser());
        System.out.println("Average comments per post is: " + getAverageCommentsPerPost());

    }

}
