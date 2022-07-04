package com.example.pi22.plan.repo;

import com.example.pi22.partner.entities.Partner;
import com.example.pi22.plan.entite.Plan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends CrudRepository <Plan, Integer> {
}
