package com.example.pi22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

import java.util.Set;

@Entity
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "userInv")
    private Set<Invitation> invitations;

    @JsonIgnore
    @OneToMany(mappedBy = "userAbn")
    private Set<Abonnement> abonnement;

    @JsonIgnore
@OneToMany(mappedBy = "userRes")
    private Set<Reservation> reservations;

    @JsonIgnore
@OneToMany(mappedBy = "user_Cmnt" )
    private Set<Commentaire> commentaires;




}
