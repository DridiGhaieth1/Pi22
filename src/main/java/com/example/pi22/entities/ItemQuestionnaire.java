package com.example.pi22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class ItemQuestionnaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItem;
    private String question;
    @ManyToOne
    private Questionnaire questionnaire;
    @JsonIgnore
    @OneToMany(mappedBy = "itemQuestionnaire")
    private List<ReponseQuestionnaire> reponseQuestionnaires;

}
