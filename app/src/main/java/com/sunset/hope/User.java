package com.sunset.hope;

public class User {
    private String userName = null;
    private String fullName =  null;
    private UserInfo userInfo = null;
    private Boolean isVerified = null;
    private String description = null;

    public User() {
        this.userName = "";
        this.fullName = "";
        this.userInfo = new UserInfo();
        this.isVerified = false;
        this.description = "";
    }

    public User(String userName, String fullName, UserInfo userInfo, Boolean isVerified, String description) {
        this.userName = userName;
        this.fullName = fullName;
        this.userInfo = userInfo;
        this.isVerified = isVerified;
        this.description = description;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Boolean getVerified() {
        return isVerified;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
