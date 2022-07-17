package com.example.pi22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Questionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuestionnaire;
    private String titreQuestionnaire;
    private String texteQuestionnaire;
    @JsonIgnore
    @OneToMany(mappedBy = "questionnaire")
    private List<ItemQuestionnaire> itemQuestionnaires;

}
