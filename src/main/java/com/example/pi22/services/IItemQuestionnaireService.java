package com.example.pi22.services;

import com.example.pi22.entities.ItemQuestionnaire;

import java.util.List;

public interface IItemQuestionnaireService {

    public ItemQuestionnaire save(ItemQuestionnaire itemQuestionnaire);
    public ItemQuestionnaire update(ItemQuestionnaire itemQuestionnaire);
    public void delete(Long id);
    public List<ItemQuestionnaire> findByQuestionnaire(Long id);

}
