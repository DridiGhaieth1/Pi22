package com.example.pi22.controllers;

import com.example.pi22.services.FavorisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("favoris")
public class FavorisController {
    @Autowired
    private FavorisService favorisService;

    @GetMapping("/GetListFav/{id}")
    public List<String> getListFavoris(@PathVariable Long id){
        return favorisService.getFavorisName(id);
    }
}
