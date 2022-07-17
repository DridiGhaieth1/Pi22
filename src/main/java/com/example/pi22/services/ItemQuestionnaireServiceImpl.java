package com.example.pi22.services;

import com.example.pi22.entities.ItemQuestionnaire;

import com.example.pi22.repositories.ItemQuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemQuestionnaireServiceImpl implements IItemQuestionnaireService {

    @Autowired
    private ItemQuestionnaireRepository itemQuestionnaireRepository;

    @Override
    public ItemQuestionnaire save(ItemQuestionnaire itemItemQuestionnaire) {
        return itemQuestionnaireRepository.save(itemItemQuestionnaire);
    }

    @Override
    public ItemQuestionnaire update(ItemQuestionnaire itemItemQuestionnaire) {
        return itemQuestionnaireRepository.save(itemItemQuestionnaire);
    }

    @Override
    public void delete(Long id) {
        itemQuestionnaireRepository.deleteById(id);
    }

    @Override
    public List<ItemQuestionnaire> findByQuestionnaire(Long id) {
        return itemQuestionnaireRepository.findByQuestionnaire_idQuestionnaire(id);
    }


}
