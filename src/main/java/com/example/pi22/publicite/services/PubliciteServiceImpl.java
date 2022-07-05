package com.example.pi22.publicite.services;

import com.example.pi22.publicite.entities.Publicite;
import com.example.pi22.publicite.repo.PubliciteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PubliciteServiceImpl implements IPubliciteService{
    @Autowired
    PubliciteRepository publiciteRepository;

    @Override
    public void addPublicite(Publicite p) {
        publiciteRepository.save(p);
    }

    @Override
    public void updatePublicite(Publicite p) {
        publiciteRepository.save(p);

    }

    @Override
    public Publicite getPublicite(Long id) {
        return publiciteRepository.findById(Math.toIntExact(id)).get();
    }

    @Override
    public void deletePublicite(Publicite p) {
        publiciteRepository.delete(p);
    }

    @Override
    public void deletePubliciteById(Long id) {
        publiciteRepository.deleteById(Math.toIntExact(id));
    }

    @Override
    public List<Publicite> getAllPublicites() {
        return (List<Publicite>) publiciteRepository.findAll();
    }
}
