package com.example.pi22.services;

import com.example.pi22.entities.ReponseQuestionnaire;
import com.example.pi22.repositories.ReponseQuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReponseQuestionnaireServiceImpl  implements IReponseQuestionnaireService{

    @Autowired
    private ReponseQuestionnaireRepository reponseQuestionnaireRepository;

    @Override
    public ReponseQuestionnaire save(ReponseQuestionnaire reponseQuestionnaire) {

        return reponseQuestionnaireRepository.save(reponseQuestionnaire);
    }

    @Override
    public List<ReponseQuestionnaire> findByQuestionnaireAndUser(Long idQuestionnaire, Long idUser) {
        return reponseQuestionnaireRepository.findByItemQuestionnaire_questionnaire_idQuestionnaireAndUser_id(idQuestionnaire, idUser);
    }


}
