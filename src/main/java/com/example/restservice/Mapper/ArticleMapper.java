package com.example.restservice.Mapper;

import com.example.pojo.Article;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
public interface ArticleMapper {
    @Select("select * from article")
    public List<Article> getAll();

    @Select("select * from article where article_category_id = #{id}")
    public List<Article> get(int id);

    @Select("select * from article where article_id= #{id}")
    public Article getArticle(int id);

    @Delete("delect from article where article_id= #{id}")
    public void deleteArticle(int id);

    @Update("update article set article_content= #{article_content} where article_id=#{article_id}")
    public int update(Article article);

    @Insert("insert into article(article_title,article_content,article_category_id) values(#{article_title},#{article_content},#{article_category_id})")
    public int addArticle(Article article);
}
