package com.example.pi22.services;

import com.example.pi22.entities.Activite;
import com.example.pi22.repositories.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActiviterService implements IactiviteService{
    @Autowired
    private ActiviteRepository activiteRepository;
    @Override
    public Activite ajouterActiv(Activite activite) {
        return activiteRepository.save(activite);
    }

    @Override
    public Activite updateActiv(Activite activite) {
        return activiteRepository.save(activite);
    }

    @Override
    public String delete(Long id) {
        activiteRepository.deleteById(id);
        return "Suppression effectuée d'activter";
    }

    @Override
    public List<Activite> listActivite() {
        return activiteRepository.findAll();
    }



    @Override
    public Activite getByIdActiv(Long id) {

        return activiteRepository.findById(id).orElse(null);
    }
}
