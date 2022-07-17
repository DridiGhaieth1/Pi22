package com.example.pi22.services;

import com.example.pi22.entities.ReponseQuestionnaire;

import java.util.List;

public interface IReponseQuestionnaireService {

    public ReponseQuestionnaire save(ReponseQuestionnaire reponseQuestionnaire);


    public List<ReponseQuestionnaire> findByQuestionnaireAndUser(Long idQuestionnaire ,Long idUser);

}
