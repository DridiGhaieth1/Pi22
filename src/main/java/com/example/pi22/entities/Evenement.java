package com.example.pi22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Evenement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nomEvent;
    private String duree ;
    private String description;
    private int nbrParticipant;
    @Temporal(TemporalType.DATE)
    private Date dateDebutEvent ;
    @Temporal(TemporalType.DATE)
    private Date dateFinEvent ;
    private String image;

    @JsonIgnore
    @OneToMany(mappedBy = "evenement")
    private Set<Invitation> invitations;

    @JsonIgnore
    @OneToMany(mappedBy = "evntResvt")
    private Set<Reservation> reservations;

    @JsonIgnore
    @OneToMany(mappedBy = "eventCmnt" )
    private Set<Commentaire> commentaires;



}
