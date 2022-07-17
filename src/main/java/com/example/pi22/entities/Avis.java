package com.example.pi22.entities;

import com.example.pi22.user.User;
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
