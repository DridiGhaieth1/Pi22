package com.example.pi22.services;

import com.example.pi22.entities.Article;
import com.example.pi22.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article save(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article update(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public void delete(Long id) {
        articleRepository.deleteById(id);
    }

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public List<Article> findByUser(Long id) {
        return articleRepository.findByUser_Id(id);
    }

    @Override
    public Article findById(Long id) throws Exception {
        return articleRepository.findById(id).orElseThrow(()-> new Exception("Id n'existe pas"));
    }
}
