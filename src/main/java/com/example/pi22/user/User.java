package com.example.pi22.user;

import com.example.pi22.entities.Article;
import com.example.pi22.entities.Avis;
import com.example.pi22.entities.Commentaire;
import com.example.pi22.entities.ReponseQuestionnaire;
import com.example.pi22.reservation.entities.Reservation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String nom;
    private String prenom;
    private String email;


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

    @OneToMany(mappedBy="user")
    private Set<Reservation> reservations;

    public Long getId() {
        return idUser;
    }

    public void setId(Long id) {
        this.idUser = idUser;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

    public User() {
        super();
    }
}
