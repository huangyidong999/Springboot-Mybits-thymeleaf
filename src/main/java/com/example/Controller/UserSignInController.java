package com.example.Controller;

import com.example.pojo.User;
import com.example.restservice.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserSignInController {
    @Autowired
    public UserMapper userMapper;

    @RequestMapping("/login")
    public String Sigin(@RequestParam(value = "userName")String username, @RequestParam(value = "passWord") String password){
        List<User> userList = userMapper.findAll();
        User u = userList.get(0);
        System.out.println(u.getName());
        if(username.compareTo(u.getName() ) == 0 && password.compareTo(u.getPassword()) == 0)
            return "redirect:listCategory";

        return "Hello";
    }
}
