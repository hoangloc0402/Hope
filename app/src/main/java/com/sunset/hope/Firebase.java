package com.sunset.hope;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Firebase {
    public static DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
    public static DatabaseReference userDatabase = rootRef.child("Users");
    public static DatabaseReference postDatabase = rootRef.child("Posts");

    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<String> userID = new ArrayList<>();

    public static ArrayList<Post> postList = new ArrayList<>();
    public static ArrayList<String> postID = new ArrayList<>();

    public static void addNewUser(User user){
//        rootRef.child("Users").child(user.getId()).setValue(user);
    }

    public static void addNewPost(Post post){
//        rootRef.child("Posts").child(post.getId()).setValue(post);
    }

    public static void getAllPost() {

    }





}
