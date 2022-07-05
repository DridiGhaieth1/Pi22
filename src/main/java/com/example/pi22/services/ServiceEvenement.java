package com.example.pi22.services;

import com.example.pi22.entities.Evenement;
import com.example.pi22.repositories.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEvenement implements IserviceEvenement{


    @Autowired
    private EvenementRepository evenementRepository ;

    @Override
    public Evenement saveEven(Evenement evenement) {
        evenement = evenementRepository.save(evenement);
        return evenement;
    }

    @Override
    public Evenement updateEvn(Evenement evenement) {
        Evenement evenement1=evenementRepository.save(evenement);
        return evenement1;
    }

    @Override
    public void supressionEVN(Long evenementId) {
        evenementRepository.deleteById(evenementId);

    }

    @Override
    public List<Evenement> listEvenement() {

        return evenementRepository.findAll();
    }

    @Override
    public Evenement getById(Long evenementId) {

        return evenementRepository.findById(evenementId).orElse(null);
    }
}
