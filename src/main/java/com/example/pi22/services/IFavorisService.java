package com.example.pi22.services;

import com.example.pi22.entities.Favoris;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IFavorisService {
    public Favoris ajouterFavoris (Favoris favoris);
    public List<String> getFavorisName (Long id);


}
