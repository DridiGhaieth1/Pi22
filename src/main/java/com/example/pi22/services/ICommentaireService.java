package com.example.pi22.services;

import com.example.pi22.entities.Commentaire;

import java.util.List;

public interface ICommentaireService {

    public Commentaire save(Commentaire commentaire);
    public Commentaire update(Commentaire commentaire);
    public void delete(Long id);
    public List<Commentaire> findByArticle(Long id);


}
