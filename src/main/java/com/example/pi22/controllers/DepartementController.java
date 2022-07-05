package com.example.pi22.controllers;

import com.example.pi22.entities.Departement;
import com.example.pi22.services.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Department")
public class DepartementController {

    @Autowired
    private DepartementService departementService;

    @PostMapping("/register")
    public Departement register(@RequestBody Departement departement) throws Exception {
        return departementService.save(departement);
    }


}
