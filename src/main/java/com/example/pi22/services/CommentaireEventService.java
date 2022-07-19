package com.example.pi22.services;

import com.example.pi22.entities.CommentaireEvent;
import com.example.pi22.repositories.CommentaireEventtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaireEventService implements ICommentaireEventService {

    @Autowired
    private CommentaireEventtRepository commentaireRepository;
    @Override
    public CommentaireEvent ajouterCmntr(CommentaireEvent commentaireEvent) {
        return commentaireRepository.save(commentaireEvent);
    }

    @Override
    public CommentaireEvent modifierCmntr(CommentaireEvent commentaireEvent) {
        return commentaireRepository.save(commentaireEvent);
    }

    @Override
    public String supprimerCmntr(Long id) {
        commentaireRepository.deleteById(id);
        return "SupprimerEffectuer";
    }


    public List<CommentaireEvent> getCmntrByIdEvnt(Long id_Event) {
        return commentaireRepository.findByEventCmnt_id(id_Event);
    }
}
