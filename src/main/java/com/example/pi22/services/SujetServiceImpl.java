package com.example.pi22.services;

import com.example.pi22.entities.Article;
import com.example.pi22.entities.Sujet;
import com.example.pi22.repositories.SujetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SujetServiceImpl implements ISujetService {

    @Autowired
    private SujetRepository sujetRepository;

    @Override
    public Sujet save(Sujet sujet) {
        return sujetRepository.save(sujet);
    }

    @Override
    public Sujet update(Sujet sujet) {
        return sujetRepository.save(sujet);
    }

    @Override
    public void delete(Long id) {
        sujetRepository.deleteById(id);
    }

    @Override
    public List<Sujet> findAll() {
        return sujetRepository.findAll();
    }

    @Override
    public Sujet findById(Long id) throws Exception {
        return sujetRepository.findById(id).orElseThrow(()-> new Exception("Id n'existe pas"));
    }
}
