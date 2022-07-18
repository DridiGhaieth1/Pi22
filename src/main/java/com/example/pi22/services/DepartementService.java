package com.example.pi22.services;

import com.example.pi22.entities.Departement;

import java.util.List;


public interface DepartementService {
public Departement save(Departement departement) throws Exception;

    public Departement update(Departement departement) throws Exception;
    public List<Departement> findAll();
    public Departement findById(Long id) throws Exception;
    public void Delete(Long id);

}

