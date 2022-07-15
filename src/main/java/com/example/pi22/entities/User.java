package com.example.pi22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String prenom;
    private String email;
    private String password;

    @ManyToOne
    private Departement departement;
    @ManyToMany(fetch = FetchType.EAGER) // Eager: Dés que je charge un user, j'ai les roles de cet utilisateur
    private Collection<Role> roles = new ArrayList<>();;

}
