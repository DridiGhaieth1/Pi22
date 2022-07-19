package com.example.pi22.services;

import com.example.pi22.entities.Commentaire;

import java.util.List;

public interface ICommentaireService {
    public Commentaire ajouterCmntr(Commentaire commentaire);
    public Commentaire modifierCmntr(Commentaire commentaire);
    public String supprimerCmntr(Long id);

}
