package com.sunset.hope;

public class Post {
    public String postId = null;
    public User user = null;
    public String type = null;
    public String postTags = null;
    public int[] images = null;
    public String description = null;
    public boolean isVerified;
    public int time;
    public String title = null;
    public Contact contact = null;
    public String[] comment = null;

    public  Post() {
        this.postId = "";
        this.user = new User();
        this.type = "";
        this.postTags = "";
        this.images = new int[0];
        this.description = "";
        this.isVerified = true;
        this.time = 0;
        this.title = "";
        this.contact = new Contact();
        this.comment = new String[20];
    }

    public Post(String postId, User user, String type, String postTags, int[] images, String description, boolean isVerified, int time, String title, Contact contact, String[] comment) {
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
        this.comment = comment;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public User getUser() {
        return this.user;
    }

    public void setOwnerId(User user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPostTags() {
        return postTags;
    }

    public void setPostTags(String postTags) {
        this.postTags = postTags;
    }

    public int[] getImages() {
        return images;
    }

    public void setImages(int[] images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isClosed() {
        return isVerified;
    }

    public void setClosed(boolean closed) {
        isVerified = closed;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
