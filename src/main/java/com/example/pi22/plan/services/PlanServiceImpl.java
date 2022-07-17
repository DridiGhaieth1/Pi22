package com.example.pi22.plan.services;

import com.example.pi22.plan.entite.Plan;
import com.example.pi22.plan.repo.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlanServiceImpl implements IPlanService{

    @Autowired
    PlanRepository planRepository;
    @Override
    public void addPlan(Plan p) {
        planRepository.save(p);
    }

    @Override
    public void updatePlan(Plan p) {
        planRepository.save(p);
    }

    @Override
    public Plan getPlan(Long id) {
        return         planRepository.findById(Math.toIntExact(id)).get();    }

    @Override
    public void deletePlan(Plan p) {
        planRepository.delete(p);
    }

    @Override
    public void deletePlanById(Long id) {
        planRepository.deleteById(Math.toIntExact(id));
    }

    @Override
    public List<Plan> getAllPlans() {
        return (List<Plan>) planRepository.findAll();
    }
}
