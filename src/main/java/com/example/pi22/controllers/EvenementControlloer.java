package com.example.pi22.controllers;


import com.example.pi22.entities.Evenement;
import com.example.pi22.services.ServiceEvenement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EvenementControlloer {
    @Autowired
    private ServiceEvenement serviceEvenement;


    @PostMapping("/AjouterEvent")
    public Evenement ajouterEvent(@RequestBody Evenement evenement){

        return serviceEvenement.saveEven(evenement);
    }

    @PutMapping("/UpdateEvent")
    public Evenement modifierEvent(@RequestBody Evenement evenement){
        return serviceEvenement.updateEvn(evenement);
    }

    @DeleteMapping("/DeleteEvent/{id}")
    public void supprimerEvent(@PathVariable Long id){
        serviceEvenement.supressionEVN(id);
    }

    @GetMapping("/GetEventById/{id}")
    public Evenement getEventById(@PathVariable Long id){
        return serviceEvenement.getById(id);
}

    @GetMapping ("/GetListEvent")
        public List<Evenement> getListEvent(){
        return serviceEvenement.listEvenement();
        }

}
