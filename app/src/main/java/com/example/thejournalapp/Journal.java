package com.example.thejournalapp;

import com.google.firebase.Timestamp;

public class Journal {
    private String title;
    private String thoughts;
    private String imageUrl;
    private Timestamp timestamp;
    private String userId;
    private String username;

    public Journal() {
    }

    public Journal(String title, String thoughts, String imageUrl, Timestamp timestamp, String userId, String username) {
        this.title = title;
        this.thoughts = thoughts;
        this.imageUrl = imageUrl;
        this.timestamp = timestamp;
        this.userId = userId;
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThoughts() {
        return thoughts;
    }

    public void setThoughts(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
