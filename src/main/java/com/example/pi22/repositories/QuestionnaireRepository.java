package com.example.pi22.repositories;

import com.example.pi22.entities.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionnaireRepository  extends JpaRepository<Questionnaire, Long> {
}
