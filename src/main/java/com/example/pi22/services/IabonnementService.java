package com.example.pi22.services;

import com.example.pi22.entities.Abonnement;
import com.example.pi22.entities.AbonnementId;
import com.example.pi22.entities.Invitation;

import java.util.List;

public interface IabonnementService  {
    public Abonnement AjouterAbn(Abonnement abonnement) throws Exception;
    public Abonnement ModifierAbn(Abonnement abonnement);
    public String SuprimerAbn(Long userId , Long idActivite);

    public List<Abonnement> findAbnByActiv(Long idActivite);
    public List<Abonnement> findAbnByUser(Long idUser);



}
