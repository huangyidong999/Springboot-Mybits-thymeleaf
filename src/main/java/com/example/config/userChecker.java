package com.example.config;
import com.example.pojo.User;

import java.util.List;

public class userChecker {
    public boolean check(List<User> userList, String userName, String passWord) {
        int size = userList.size();
        for (int i = 0; i < size; i++) {
            String name = userList.get(i).getName();
            System.out.println(name);
            String pass = userList.get(i).getPassword();
            System.out.println(passWord);
            if (name.compareTo(userName) == 0 && passWord.compareTo(pass) == 0)
                return true;
        }
        return false;
    }
}
