package com.example.pi22.services;

import com.example.pi22.entities.Article;

import java.util.List;

public interface IArticleService {

    public Article save(Article article);
    public Article update(Article article);
    public void delete(Long id);
    public List<Article> findAll();
    public List<Article> findByUser(Long id);
    public Article findById(Long id) throws Exception;
}
