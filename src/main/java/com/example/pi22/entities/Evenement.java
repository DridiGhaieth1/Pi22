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

    @JsonIgnore
    @OneToMany(mappedBy = "evenement")
    private Set<Invitation> invitations;

    @JsonIgnore
    @OneToMany(mappedBy = "evenementt")
    private Set<ReservationEvent> reservationEvents;



}
