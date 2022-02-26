package com.example.Controller;

import com.example.pojo.Category;
import com.example.restservice.Mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class welcomeMainPage {
    @Autowired
    public CategoryMapper categoryMapper;

    @RequestMapping("/")
    public String listCategory(Model model){
        List<Category> cs = categoryMapper.findAll();
        model.addAttribute("cs",cs);
        return "welcome";
    }

    @RequestMapping("/admin")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/ajaxTest")
    public String ajaxTest(){
        return "Hello";
    }
}
