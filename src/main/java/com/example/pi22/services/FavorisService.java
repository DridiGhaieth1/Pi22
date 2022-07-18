package com.example.pi22.services;

import com.example.pi22.entities.Favoris;
import com.example.pi22.repositories.FavorisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavorisService implements  IFavorisService{
     private FavorisRepository favorisRepository;
    @Override
    public Favoris ajouterFavoris(Favoris favoris) {
        return null;
    }

    @Override
    public List<String> getFavorisName(Long id) {

        return null;
    }
}
