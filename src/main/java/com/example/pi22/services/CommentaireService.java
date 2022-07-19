package com.example.pi22.services;

import com.example.pi22.entities.Commentaire;
import com.example.pi22.repositories.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaireService implements ICommentaireService{

    @Autowired
    private CommentaireRepository commentaireRepository;
    @Override
    public Commentaire ajouterCmntr(Commentaire commentaire) {
        return commentaireRepository.save(commentaire);
    }

    @Override
    public Commentaire modifierCmntr(Commentaire commentaire) {
        return commentaireRepository.save(commentaire);
    }

    @Override
    public String supprimerCmntr(Long id) {
        commentaireRepository.deleteById(id);
        return "SupprimerEffectuer";
    }


    public List<Commentaire> getCmntrByIdEvnt(Long id_Event) {
        return commentaireRepository.findByEventCmnt_id(id_Event);
    }
}
