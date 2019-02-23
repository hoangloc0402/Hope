package com.sunset.hope;

public class Comment {
    String postID;
    String commentID;
    String content;
    String ownerId;
    long time;

    public Comment(String postID, String commentID, String content, String ownerId, long time) {
        this.postID = postID;
        this.commentID = commentID;
        this.content = content;
        this.ownerId = ownerId;
        this.time = time;
    }

    public String getPostID() {
        return postID;
    }

    public String getCommentID() {
        return commentID;
    }

    public String getContent() {
        return content;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public long getTime() {
        return time;
    }
}
