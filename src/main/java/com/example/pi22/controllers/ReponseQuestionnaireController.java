package com.example.pi22.controllers;

import com.example.pi22.entities.ReponseQuestionnaire;
import com.example.pi22.services.IReponseQuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reponseQuestionnaire")
public class ReponseQuestionnaireController {

    @Autowired
    private IReponseQuestionnaireService reponseQuestionnaireService;


    @PostMapping
    public ReponseQuestionnaire save(@RequestBody ReponseQuestionnaire reponseQuestionnaire) {
        return reponseQuestionnaireService.save(reponseQuestionnaire);
    }


    @GetMapping("/questionnair-user/{idQuestionnaire}/{idUser}")
    public List<ReponseQuestionnaire> findByQuestionnaireAndUser(@PathVariable Long idQuestionnaire, @PathVariable Long idUser) {
        return reponseQuestionnaireService.findByQuestionnaireAndUser(idQuestionnaire, idUser);
    }

}
