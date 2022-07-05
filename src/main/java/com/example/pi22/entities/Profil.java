package com.example.pi22.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String adresseMail;
    private Date dateNaissance;
    @OneToOne
    private User user;

}
