package com.example.pi22.repositories;

import com.example.pi22.entities.ReponseQuestionnaire;
import com.example.pi22.entities.ReponseQuestionnaireId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReponseQuestionnaireRepository  extends JpaRepository<ReponseQuestionnaire, ReponseQuestionnaireId> {
    List<ReponseQuestionnaire> findByUser_idUser(Long id);
    List<ReponseQuestionnaire> findByItemQuestionnaire_questionnaire_idQuestionnaireAndUser_idUser(Long idQuestionnaire, Long idUser);
}
