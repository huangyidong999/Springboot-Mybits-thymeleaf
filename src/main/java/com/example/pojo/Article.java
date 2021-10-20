package com.example.pojo;

public class Article {
    private int article_id;
    private String article_title;
    private String article_content;
    private int article_category_id;

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public String getArticle_content() {
        return article_content;
    }

    public void setArticle_content(String article_content) {
        this.article_content = article_content;
    }

    public int getArticle_category_id() {
        return article_category_id;
    }

    public void setArticle_category_id(int article_category_id) {
        this.article_category_id = article_category_id;
    }
}
