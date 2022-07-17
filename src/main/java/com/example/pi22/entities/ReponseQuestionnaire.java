package com.example.pi22.entities;


import com.example.pi22.user.User;
import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class ReponseQuestionnaire {
    @EmbeddedId
    private ReponseQuestionnaireId id;

    private boolean rep1;
    private boolean rep2;
    private boolean rep3;
    private boolean rep4;
    private boolean rep5;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "item_questionnaire_id", insertable = false, updatable = false)
    private ItemQuestionnaire itemQuestionnaire;
}
