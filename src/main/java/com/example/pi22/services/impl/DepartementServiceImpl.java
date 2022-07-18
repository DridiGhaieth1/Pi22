package com.example.pi22.services.impl;

import com.example.pi22.entities.Departement;
import com.example.pi22.repositories.DepartementRepository;
import com.example.pi22.services.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartementServiceImpl implements DepartementService {
    @Autowired
    private DepartementRepository departementRepository;




    @Override
    public Departement save(Departement departement) throws Exception {
        boolean exist = departementRepository.existsById(departement.getId());
        if(exist){
            throw  new Exception(("Departement existe déjà"));
        }
        departement = departementRepository.save(departement);
        return departement;
    }

@Override
    public Departement update(Departement departement) throws Exception{
    boolean existDepartement = departementRepository.existsById(departement.getId());
    if(!existDepartement){
        existDepartement = departementRepository.existsById(departement.getId());
        if(existDepartement){
            throw  new Exception("Département existe déjà");
        }
    }
    departementRepository.save(departement);
    return departement;
    }


    @Override
    public List<Departement> findAll() {
        return departementRepository.findAll();
    }

    @Override
    public Departement findById(Long id) throws Exception {
        return departementRepository.findById(id).orElseThrow(() -> new Exception("Département n'existe pas"));
    }

    @Override
    public void Delete(Long id) {
        departementRepository.deleteById(id);
    }
}




