package com.example.pi22.services;

import com.example.pi22.entities.Commentaire;
import com.example.pi22.repositories.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaireServiceImpl implements ICommentaireService {

    @Autowired
    private CommentaireRepository commentaireRepository;

    @Override
    public Commentaire save(Commentaire commentaire) {
        return commentaireRepository.save(commentaire);
    }

    @Override
    public Commentaire update(Commentaire commentaire) {
        return commentaireRepository.save(commentaire);
    }

    @Override
    public void delete(Long id) {
        commentaireRepository.deleteById(id);
    }

    @Override
    public List<Commentaire> findByArticle(Long id) {
        return commentaireRepository.findByArticle_idArticle(id);
    }




}
