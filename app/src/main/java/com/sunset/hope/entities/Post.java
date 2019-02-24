package com.sunset.hope.entities;

import java.util.ArrayList;

public class Post {
    String postId;
    User user;
    String type;
    String postTags;
    int[] images;
    String description;
    boolean isVerified;
    String time;
    String title;
    Contact contact;
    ArrayList<Comment> commentList;

    public String getPostId() {
        return postId;
    }

    public User getUser() {
        return user;
    }

    public String getType() {
        return type;
    }

    public String getPostTags() {
        return postTags;
    }

    public int[] getImages() {
        return images;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public String getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

    public Contact getContact() {
        return contact;
    }

    public ArrayList<Comment> getCommentList() {
        return commentList;
    }

    public Post() {
    }

    public Post(String postId, User user, String type, String postTags, int[] images, String description, boolean isVerified, String time, String title, Contact contact, ArrayList<Comment> commentList) {
        this.postId = postId;
        this.user = user;
        this.type = type;
        this.postTags = postTags;
        this.images = images;
        this.description = description;
        this.isVerified = isVerified;
        this.time = time;
        this.title = title;
        this.contact = contact;
        this.commentList = commentList;
    }
}
