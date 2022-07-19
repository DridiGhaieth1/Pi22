package com.example.pi22.controllers;

import com.example.pi22.response.MatchingResponse;
import com.example.pi22.services.TypeActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/typeActivite")
public class TypeActiviteController {
    @Autowired
    private TypeActiviteService typeActiviteService;

   /* @GetMapping("/GetListFav/{id}")
    public List<String> getListFavoris(@PathVariable Long id){
        return favorisService.get;
    }*/

    @GetMapping("/match/{id}")
    public List<MatchingResponse>  findMatchedUser(@PathVariable Long id) {
        return typeActiviteService.findMatchedUser(id);
    }
}
