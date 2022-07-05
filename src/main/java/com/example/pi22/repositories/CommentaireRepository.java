package com.example.pi22.repositories;

import com.example.pi22.entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
    List<Commentaire> findByArticle_idArticle(Long id);
}
