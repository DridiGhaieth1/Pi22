package com.example.pi22.controllers;


import com.example.pi22.entities.Evenement;
import com.example.pi22.services.ServiceEvenement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
public class EvenementControlloer {
    @Autowired
    private ServiceEvenement serviceEvenement;


    @PostMapping("/Ajouter")
    public Evenement ajouterEvent(@RequestBody Evenement evenement){
        return serviceEvenement.saveEven(evenement);
    }

    @PutMapping("/Update")
    public Evenement modifierEvent(@RequestBody Evenement evenement){
        return serviceEvenement.updateEvn(evenement);
    }

    @DeleteMapping("/Delete/{id}")
    public void supprimerEvent(@PathVariable Long id){
        serviceEvenement.supressionEVN(id);
    }

@GetMapping("/GetById/{id}")
    public Evenement getEventById(@PathVariable Long id){
        return serviceEvenement.getById(id);
}



}
