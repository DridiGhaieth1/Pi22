package com.example.pi22.controllers;

import com.example.pi22.entities.Article;
import com.example.pi22.entities.Sujet;
import com.example.pi22.repositories.SujetRepository;
import com.example.pi22.services.ISujetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/sujet")
public class SujetController {

    @Autowired
    private ISujetService sujetService;

    @GetMapping
    public List<Sujet> findAll(){
        return sujetService.findAll();
    }
    @PostMapping
    public Sujet save(@RequestBody Sujet sujet) {
        return  sujetService.save(sujet);
    }

    @PutMapping
    public Sujet update(@RequestBody Sujet sujet) {
        return  sujetService.update(sujet);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
          sujetService.delete(id);
    }


    @GetMapping ("/{id}")
    public Sujet findById(@PathVariable Long id) throws Exception {
        return  sujetService.findById(id);
    }
}
