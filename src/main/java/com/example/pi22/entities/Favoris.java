package com.example.pi22.entities;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class Favoris implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Fav ;
    private String Name;


    @OneToMany(mappedBy = "favoris")
    private Set<Activite> activites;
}
