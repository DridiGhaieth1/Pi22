package com.example.pi22.services;

import com.example.pi22.entities.Activite;
import com.example.pi22.entities.Evenement;
import com.example.pi22.entities.Invitation;

import java.util.List;

public interface IactiviteService {

    public Activite ajouterActiv(Activite activite);
    public Activite updateActiv(Activite activite);
    public String delete(Long id);
    public List<Activite> listActivite();
    public Activite getByIdActiv(Long id);

}
