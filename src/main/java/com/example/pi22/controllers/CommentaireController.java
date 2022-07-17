package com.example.pi22.controllers;

import com.example.pi22.entities.Commentaire;
import com.example.pi22.services.ICommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/commentaire")
public class CommentaireController {

    @Autowired
    private ICommentaireService commentaireService;


    @PostMapping
    public Commentaire save(@RequestBody Commentaire commentaire) {
        return commentaireService.save(commentaire);
    }

    @PutMapping
    public Commentaire update(@RequestBody Commentaire commentaire) {
        return commentaireService.update(commentaire);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        commentaireService.delete(id);
    }


    @GetMapping("/article/{id}")
    public List<Commentaire> findByUser(@PathVariable Long id) {
        return commentaireService.findByArticle(id);
    }
    
}
