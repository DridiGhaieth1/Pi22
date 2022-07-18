package com.example.pi22.services;

import com.example.pi22.entities.Avis;
import com.example.pi22.repositories.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvisServiceImpl implements IAvisService {

    @Autowired
    private AvisRepository avisRepository;

    @Override
    public Avis save(Avis avis) {
        return avisRepository.save(avis);
    }

    @Override
    public Avis update(Avis avis) {
        return avisRepository.save(avis);
    }

    @Override
    public void delete(Long id) {
        avisRepository.deleteById(id);
    }

    @Override
    public List<Avis> findAll() {
        return avisRepository.findAll();
    }

    @Override
    public Avis findById(Long id) throws Exception {
        return avisRepository.findById(id).orElseThrow(()-> new Exception("Id n'existe pas"));
    }

    @Override
    public List<Avis> findByUser(Long id) {
        return avisRepository.findByUser_id(id);
    }
}
