package com.example.pi22.controllers;

import com.example.pi22.entities.Commentaire;
import com.example.pi22.services.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cmntr")

public class CommentaireController {

    @Autowired
    private CommentaireService commentaireService;

    @PostMapping("/AjouterCmntr")
    public Commentaire ajouterCmntr(Commentaire commentaire){
        return commentaireService.ajouterCmntr(commentaire);
    }

    @DeleteMapping("DeleteCmnt/{id}")
    public  String SupprimerCmntr(@PathVariable Long id){
        return commentaireService.supprimerCmntr(id);
    }

     @GetMapping("/ListCmntr")
    public List<Commentaire> ListCmntrEvent(Long id){
        return commentaireService.getCmntrByIdEvnt(id);
     }
}
