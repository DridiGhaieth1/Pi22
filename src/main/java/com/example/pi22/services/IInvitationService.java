package com.example.pi22.services;

import com.example.pi22.entities.Invitation;

import java.util.List;

public interface IInvitationService {
    public Invitation ajouterInv(Invitation invitation);
    public Invitation updateInv(Invitation invitation);
    public String delete(Long idUser, Long idEvent);
    public List<Invitation> findByEvent(Long idEvent);
    public List<Invitation> findByUser(Long idUser);
}
