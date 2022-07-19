package com.example.pi22.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class TypeActivite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFav ;
    private String name;


    @OneToMany(mappedBy = "typeActivite")
    private Set<Activite> activites;
}
