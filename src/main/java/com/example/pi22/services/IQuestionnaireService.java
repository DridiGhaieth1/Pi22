package com.example.pi22.services;

import com.example.pi22.entities.Questionnaire;

import java.util.List;

public interface IQuestionnaireService {

    public Questionnaire save(Questionnaire questionnaire);
    public Questionnaire update(Questionnaire questionnaire);
    public void delete(Long id);
    public List<Questionnaire> findAll();
    public Questionnaire findById(Long id) throws Exception;
}
