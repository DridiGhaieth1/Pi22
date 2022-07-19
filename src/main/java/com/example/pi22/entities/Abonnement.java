package com.example.pi22.entities;

import lombok.Data;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Abonnement implements Serializable {

    @EmbeddedId
    private AbonnementId id ;
    private String name ;
    private int dureeParMois;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    private Date dateFin ;
    private float prix;

    @ManyToOne
    @JoinColumn(name = "user_id",insertable = false,updatable = false)
    private User userAbn;
    @ManyToOne
    @JoinColumn(name = "activite_idd",insertable = false,updatable = false)
    private Activite activite ;


}
