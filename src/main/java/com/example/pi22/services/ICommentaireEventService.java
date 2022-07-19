package com.example.pi22.services;

import com.example.pi22.entities.CommentaireEvent;

public interface ICommentaireEventService {
    public CommentaireEvent ajouterCmntr(CommentaireEvent commentaireEvent);
    public CommentaireEvent modifierCmntr(CommentaireEvent commentaireEvent);
    public String supprimerCmntr(Long id);
git add
}
