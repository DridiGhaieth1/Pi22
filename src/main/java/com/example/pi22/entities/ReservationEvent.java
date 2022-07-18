package com.example.pi22.entities;

import com.example.pi22.user.User;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
public class ReservationEvent implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private int nbrDePlace;
    private Long prixTotale;

    @ManyToOne
    private User userRes;


    @ManyToOne
    private Evenement evenementt;


}
