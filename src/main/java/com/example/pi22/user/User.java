package com.example.pi22.user;

import com.example.pi22.entities.*;
import com.example.pi22.reservation.entities.Reservation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String prenom;
    private String email;
    private String password;
    private boolean enabled;

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
        return id;
    }

    public void setId(Long idUser) {
        this.id = id;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

    @ManyToOne
    private Departement departement;
    @ManyToMany(fetch = FetchType.EAGER) // Eager: Dés que je charge un user, j'ai les roles de cet utilisateur
    private Collection<Role> roles = new ArrayList<>();;

    public User() {
        super();
    }
}
