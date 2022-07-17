package com.example.pi22.services;

import com.example.pi22.entities.Article;
import com.example.pi22.entities.Sujet;

import java.util.List;

public interface ISujetService {

    public Sujet save(Sujet sujet);
    public Sujet update(Sujet sujet);
    public void delete(Long id);
    public List<Sujet> findAll();
    public Sujet findById(Long id) throws Exception;
}
