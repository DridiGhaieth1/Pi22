package com.example.pi22.controllers;

import com.example.pi22.entities.Departement;
import com.example.pi22.entities.User;
import com.example.pi22.services.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Department")
public class DepartementController {

    @Autowired
    private DepartementService departementService;

    @PostMapping("/register")
    public Departement register(@RequestBody Departement departement) throws Exception {
        return departementService.save(departement);
    }

    @GetMapping
    public List<Departement> findAll() {
        return  departementService.findAll();
    }

    @GetMapping("/{id}")
    public Departement findById(@PathVariable Long id) throws Exception {
        return  departementService.findById(id);
    }

    @PutMapping("/update")
    public Departement updateDepartement(@RequestBody Departement departement) throws Exception{
        return departementService.update(departement);
    }

    @DeleteMapping("/delete")
    public void deleteDepartement(@PathVariable Long id){
         departementService.Delete(id);
    }

}
