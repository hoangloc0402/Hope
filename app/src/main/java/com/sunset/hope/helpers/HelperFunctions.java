package com.sunset.hope.helpers;

import com.sunset.hope.activities.MainActivity;
import com.sunset.hope.entities.User;

public class HelperFunctions {
    public static User findUserById(String id){
        int index = MainActivity.userKey.indexOf(id);
        return  MainActivity.userList.get(index);
    }
}
