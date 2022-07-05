package com.example.pi22.plan.services;

import com.example.pi22.plan.entite.Plan;

import java.util.List;

public interface IPlanService {

    void addPlan(Plan p);
    void updatePlan(Plan p);
    Plan getPlan(Long id);
    void deletePlan(Plan p);
    void deletePlanById(Long id);
    List<Plan> getAllPlans();
}
