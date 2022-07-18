package com.example.pi22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomDepart;
    @JsonIgnore
    @OneToMany(mappedBy = "departement")
    private List<User> users;
    @ManyToOne
    private Entreprise entreprise;

}
