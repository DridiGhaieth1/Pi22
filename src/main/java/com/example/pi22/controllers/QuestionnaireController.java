package com.example.pi22.controllers;

import com.example.pi22.entities.Questionnaire;
import com.example.pi22.services.IQuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questionnaire")
public class QuestionnaireController {

    @Autowired
    private IQuestionnaireService questionnaireService;

    @GetMapping
    public List<Questionnaire> findAll(){
        return questionnaireService.findAll();
    }
    @PostMapping
    public Questionnaire save(@RequestBody Questionnaire questionnaire) {
        return  questionnaireService.save(questionnaire);
    }

    @PutMapping
    public Questionnaire update(@RequestBody Questionnaire questionnaire) {
        return  questionnaireService.update(questionnaire);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
          questionnaireService.delete(id);
    }


    @GetMapping ("/{id}")
    public Questionnaire findById(@PathVariable Long id) throws Exception {
        return  questionnaireService.findById(id);
    }
}
