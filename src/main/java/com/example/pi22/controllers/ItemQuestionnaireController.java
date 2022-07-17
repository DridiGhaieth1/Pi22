package com.example.pi22.controllers;

import com.example.pi22.entities.ItemQuestionnaire;
import com.example.pi22.services.IItemQuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/itemQuestionnaire")
public class ItemQuestionnaireController {

    @Autowired
    private IItemQuestionnaireService itemQuestionnaireService;


    @PostMapping
    public ItemQuestionnaire save(@RequestBody ItemQuestionnaire itemQuestionnaire) {
        return itemQuestionnaireService.save(itemQuestionnaire);
    }

    @PutMapping
    public ItemQuestionnaire update(@RequestBody ItemQuestionnaire itemQuestionnaire) {
        return itemQuestionnaireService.update(itemQuestionnaire);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        itemQuestionnaireService.delete(id);
    }



    @GetMapping("/questionnaire/{id}")
    public List<ItemQuestionnaire> findByQuestionnaire(@PathVariable Long id) {
        return itemQuestionnaireService.findByQuestionnaire(id);
    }



}
