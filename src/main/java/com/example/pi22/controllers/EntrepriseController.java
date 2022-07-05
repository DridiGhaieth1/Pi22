package com.example.pi22.controllers;

import com.example.pi22.entities.Entreprise;
import com.example.pi22.services.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Entreprise")
public class EntrepriseController {
    @Autowired
    private EntrepriseService entrepriseService;

    @PostMapping("/AddEntreprie")
    public Entreprise AddEntreprise(@RequestBody Entreprise entreprise) throws Exception{
        return entrepriseService.save(entreprise);

    }
    @DeleteMapping("/{id}")
    public void supprimerEntreprise(@PathVariable Long id) {
        entrepriseService.delete(id);

    }

}
