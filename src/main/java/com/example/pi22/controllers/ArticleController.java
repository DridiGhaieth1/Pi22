package com.example.pi22.controllers;

import com.example.pi22.entities.Article;
import com.example.pi22.services.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService articleService;


    @PostMapping
    public Article save(@RequestBody Article article) {
        return articleService.save(article);
    }

    @PutMapping
    public Article update(@RequestBody Article article) {
        return articleService.update(article);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        articleService.delete(id);
    }

    @GetMapping("/{id}")
    public Article findById(@PathVariable Long id) throws Exception {
        return articleService.findById(id);
    }

    @GetMapping
    public List<Article> findAll() {
        return articleService.findAll();
    }

    @GetMapping("/user/{id}")
    public List<Article> findByUser(@PathVariable Long id) {
        return articleService.findByUser(id);
    }

}
