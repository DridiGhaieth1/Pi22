package com.example.pi22.services;

import com.example.pi22.entities.Questionnaire;
import com.example.pi22.repositories.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService {

    @Autowired
    private QuestionnaireRepository questionnaireRepository;

    @Override
    public Questionnaire save(Questionnaire questionnaire) {
        return questionnaireRepository.save(questionnaire);
    }

    @Override
    public Questionnaire update(Questionnaire questionnaire) {
        return questionnaireRepository.save(questionnaire);
    }

    @Override
    public void delete(Long id) {
        questionnaireRepository.deleteById(id);
    }

    @Override
    public List<Questionnaire> findAll() {
        return questionnaireRepository.findAll();
    }

    @Override
    public Questionnaire findById(Long id) throws Exception {
        return questionnaireRepository.findById(id).orElseThrow(()-> new Exception("Id n'existe pas"));
    }
}
