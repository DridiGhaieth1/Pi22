package com.example.pi22.repositories;

import com.example.pi22.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    public List<Article> findByUser_Id(Long id);
}
