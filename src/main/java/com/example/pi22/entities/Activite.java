package com.example.pi22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Activite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomActiv;
    private String desciptionActiv;
    private TypeActivitee type;
    private Long prixActiv;
    @Temporal(TemporalType.DATE)
    private Date dateDebutActiv;
    @Temporal(TemporalType.DATE)
    private Date dateFinActiv;

    @JsonIgnore
    @OneToMany(mappedBy = "activite")
    private Set<Abonnement> abonnement;

    @ManyToOne
    private TypeActivite typeActivite;

}
