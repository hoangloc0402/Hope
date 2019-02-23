package com.sunset.hope;

public class Post {
    private String postId = null;
    private User user = null;
    private String type = null;
    private String postTags = null;
    private int[] images = null;
    private String description = null;
    private boolean isClosed;
    private int time;
    private String title = null;
    private Contact contact = null;
    private String[] comment = null;

    public  Post() {
        this.postId = "";
        this.user = new User();
        this.type = "";
        this.postTags = "";
        this.images = new int[0];
        this.description = "";
        this.isClosed = true;
        this.time = 0;
        this.title = "";
        this.contact = new Contact();
        this.comment = new String[10];
    }

    public Post(String postId, String ownerId, String type, String postTags, int[] images, String description, boolean isClosed, int time, String title, Contact contact, String[] comment) {
        this.postId = postId;
        this.user = new User();
        this.type = type;
        this.postTags = postTags;
        this.images = images;
        this.description = description;
        this.isClosed = isClosed;
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
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
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
