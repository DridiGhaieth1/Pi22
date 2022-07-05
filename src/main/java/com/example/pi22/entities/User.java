package com.example.pi22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    private String nom;
    private String prenom;
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Article> articles;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Commentaire> commentaires;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Avis> avises;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<ReponseQuestionnaire> reponseQuestionnaires;
}
