package com.example.pi22.services;

import com.example.pi22.entities.Avis;

import java.util.List;

public interface IAvisService {

    public Avis save(Avis avis);
    public Avis update(Avis avis);
    public void delete(Long id);
    public List<Avis> findAll();
    public Avis findById(Long id) throws Exception;

    List<Avis> findByUser(Long id);
}
