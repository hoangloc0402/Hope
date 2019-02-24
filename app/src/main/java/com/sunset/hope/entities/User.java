package com.sunset.hope.entities;

import com.sunset.hope.activities.MainActivity;
import com.sunset.hope.entities.Contact;
import com.sunset.hope.helpers.PostDataRandomizer;

import java.util.Random;

public class User {
    private String userName = null;
    private String fullName =  null;
    private Contact contact = null;
    private Boolean isVerified = null;
    private String description = null;
    int avatarResource;

    public int getAvatarResource() {
        return avatarResource;
    }

    public User(String userName, String fullName, Contact contact, Boolean isVerified, String description, int avatarResource) {
        this.userName = userName;
        this.fullName = fullName;
        this.contact = contact;
        this.isVerified = isVerified;
        this.description = description;
        this.avatarResource = avatarResource;
    }

    public User() {
    }

    public User(String userName, String fullName, Contact contact, Boolean isVerified, String description) {
        this.userName = userName;
        this.fullName = fullName;
        this.contact = contact;
        this.isVerified = isVerified;
        this.description = description;
        avatarResource = MainActivity.avatarList[PostDataRandomizer.getNum(MainActivity.avatarList.length)];
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

    public Contact getContact() {
        return contact;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
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
