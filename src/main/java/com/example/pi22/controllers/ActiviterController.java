package com.example.pi22.controllers;

import com.example.pi22.entities.Activite;
import com.example.pi22.services.ActiviterService;
import com.example.pi22.services.IactiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Activ")
public class ActiviterController {
    @Autowired
    private IactiviteService iactiviteService;


    @PostMapping("/AjtActiv")
    public Activite ajouterActiv(@RequestBody Activite activite){

       return  iactiviteService.ajouterActiv(activite);

    }
    @PutMapping("/ModifActiv")
    public Activite modifierActiv(@RequestBody Activite activite){

        return  iactiviteService.updateActiv(activite);

    }

    @DeleteMapping("/SuprActiv/{id}")
    public String supprActi(@PathVariable  Long id){

        return iactiviteService.delete(id);
    }

    @GetMapping("/GetActivById/{id}")
    public Activite getActivById(@PathVariable  Long id){

        return iactiviteService.getByIdActiv(id);
    }
    @GetMapping("/GetList")
      public List<Activite> GetList(){
    return iactiviteService.listActivite();
    }
}
