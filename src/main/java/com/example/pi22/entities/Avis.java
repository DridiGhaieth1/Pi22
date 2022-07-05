package com.example.pi22.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Avis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvis;
    private String texteAvis;
    private boolean anonymous;

    @ManyToOne
    private User user;

}
