package com.example.pi22.controllers;

import com.example.pi22.entities.Article;
import com.example.pi22.entities.Avis;
import com.example.pi22.services.IAvisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/avis")
public class AvisController {

    @Autowired
    private IAvisService avisService;


    @PostMapping
    public Avis save(@RequestBody Avis avis) {
        return  avisService.save(avis);
    }

    @PutMapping
    public Avis update(@RequestBody Avis avis) {
        return  avisService.update(avis);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
          avisService.delete(id);
    }


    @GetMapping ("/{id}")
    public Avis findById(@PathVariable Long id) throws Exception {
        return  avisService.findById(id);
    }

    @GetMapping
    public List<Avis> findAll(){
        return avisService.findAll();
    }

    @GetMapping("/user/{id}")
    public List<Avis> findByUser(@PathVariable Long id) {
        return avisService.findByUser(id);
    }
}
