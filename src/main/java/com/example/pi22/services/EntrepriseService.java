package com.example.pi22.services;

import com.example.pi22.entities.Entreprise;

public interface EntrepriseService {
    public Entreprise save(Entreprise entreprise) throws Exception;
    public  Entreprise update(Entreprise entreprise) throws Exception;
    public void delete (Long id);
    public  Entreprise findById(Long id) throws Exception;



}
