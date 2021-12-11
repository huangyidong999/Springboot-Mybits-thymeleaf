package com.example.Controller;
import com.example.pojo.Article;
import com.example.restservice.Mapper.ArticleMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class ArticleController {
    @Autowired
    public ArticleMapper articleMapper;
    //

    @RequestMapping("articleList")
    public String articleList(int id,Model m, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5")int size)throws Exception{
        PageHelper.startPage(start,size);
        List<Article> page = articleMapper.get(id);
        m.addAttribute("page",page);
        return "articleList";
    }



    @RequestMapping("articleListW")
    public String articleListW(int id,Model model){
        List<Article> cs = articleMapper.get(id);
        model.addAttribute("cs",cs);
        return "articleW";
    }

    @RequestMapping("getArticle")
    public String  getArticle(int id,Model m){
        Article article = articleMapper.getArticle(id);
        m.addAttribute("Ac",article);
        return "article";
    }

    @RequestMapping("deleteArticle")
    public String deleteArticle(int id){
        articleMapper.deleteArticle(id);
        return "redirect:listCategory";
    }

    @RequestMapping("editArticle")
    public String editArticle(int id,Model m){
        Article a = articleMapper.getArticle(id);
        m.addAttribute("Ae",a);
        return "editArticle";
    }

    @RequestMapping("updateArticle")
    public String updateArticle(Article article){
        articleMapper.update(article);
        return "redirect:listCategory";
    }
    @RequestMapping("addArticle")
    public String addArticle(Article article){
        articleMapper.addArticle(article);
        return "redirect:listCategory";
    }
}
