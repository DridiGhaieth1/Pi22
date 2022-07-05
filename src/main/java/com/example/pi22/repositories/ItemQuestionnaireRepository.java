package com.example.pi22.repositories;

import com.example.pi22.entities.ItemQuestionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemQuestionnaireRepository extends JpaRepository<ItemQuestionnaire, Long> {
    List<ItemQuestionnaire> findByQuestionnaire_idQuestionnaire(Long id);
}
