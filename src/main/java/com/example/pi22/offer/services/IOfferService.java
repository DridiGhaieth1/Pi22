package com.example.pi22.offer.services;

import com.example.pi22.offer.entities.Offer;

import java.util.List;
import java.util.Set;

public interface IOfferService {
    void addOffer(Offer offer);
    void updateOffer(Offer offer);
    Offer getOffer(Long id);
    void deleteOffer(Offer f);
    void deleteOfferById(Long id);
    List<Offer> getAllOffers();


}
