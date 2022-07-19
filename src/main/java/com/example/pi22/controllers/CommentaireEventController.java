package com.example.pi22.controllers;

import com.example.pi22.entities.CommentaireEvent;
import com.example.pi22.services.CommentaireEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cmntr")

public class CommentaireEventController {

    @Autowired
    private CommentaireEventService commentaireService;

    @PostMapping("/AjouterCmntr")
    public CommentaireEvent ajouterCmntr(CommentaireEvent commentaireEvent){
        return commentaireService.ajouterCmntr(commentaireEvent);
    }

    @DeleteMapping("DeleteCmnt/{id}")
    public  String SupprimerCmntr(@PathVariable Long id){
        return commentaireService.supprimerCmntr(id);
    }

     @GetMapping("/ListCmntr")
    public List<CommentaireEvent> ListCmntrEvent(Long id){
        return commentaireService.getCmntrByIdEvnt(id);
     }
}
