package com.example.pi22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
public class Reservation implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private int nbrDePlace;
    private Long prixTotale;

    @ManyToOne
    private User userRes;


    @ManyToOne
    private Evenement evntResvt;


}
