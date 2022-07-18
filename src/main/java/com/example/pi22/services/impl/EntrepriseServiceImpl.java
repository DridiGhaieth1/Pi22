package com.example.pi22.services.impl;

import com.example.pi22.entities.Entreprise;
import com.example.pi22.repositories.EntrepriseRepository;
import com.example.pi22.services.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
public class EntrepriseServiceImpl implements EntrepriseService {
    @Autowired
    private EntrepriseRepository entrepriseRepository;

    @Override
    public Entreprise save(Entreprise entreprise) throws Exception {
        entreprise = entrepriseRepository.save(entreprise);
        return entreprise;
    }

    @Override
    public Entreprise update(Entreprise entreprise) throws Exception {
        boolean exist = entrepriseRepository.existsById(entreprise.getId());
        if(!exist){
            exist = entrepriseRepository.existsById(entreprise.getId());
            if(exist){
                throw  new Exception("Entreprise existe déjà");
            }
        }
        entrepriseRepository.save(entreprise);
        return entreprise;
    }

    @Override
    public void delete(Long id) {
        entrepriseRepository.deleteById(id);
    }


    @Override
    public Entreprise findById(Long id) throws Exception{
        return entrepriseRepository.findById(id).orElseThrow(() -> new Exception("Utilisateur n'existe pas"));
    }




}
