package com.example.pi22.publicite.services;

import com.example.pi22.publicite.entities.Publicite;

import java.util.List;

public interface IPubliciteService {

    void addPublicite(Publicite p);
    void updatePublicite(Publicite p);
    Publicite getPublicite(Long id);
    void deletePublicite(Publicite p);
    void deletePubliciteById(Long id);
    List<Publicite> getAllPublicites();
}
