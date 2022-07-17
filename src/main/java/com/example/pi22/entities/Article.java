package com.example.pi22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticle;
    private String textArticle;
    private String titreArticle;

    @ManyToOne
    private Sujet sujet;
    @ManyToOne
    private User user;
    @JsonIgnore
    @OneToMany(mappedBy = "article")
    private List<Commentaire> commentaires;

}
