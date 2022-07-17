package com.example.pi22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Sujet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSujet;
    private String titreSujet;

    @JsonIgnore
    @OneToMany(mappedBy = "sujet")
    private List<Article> articles;
}
