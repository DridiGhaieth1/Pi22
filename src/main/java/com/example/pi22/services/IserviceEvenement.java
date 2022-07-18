package com.example.pi22.services;

import com.example.pi22.entities.Evenement;

import java.util.List;

public interface IserviceEvenement {
    public Evenement saveEven(Evenement evenement);
    public Evenement updateEvn(Evenement evenement);
    public void supressionEVN(Long evenementId);
    public List<Evenement> listEvenement();
    public Evenement getById(Long evenementId);

}
