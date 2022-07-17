package com.example.pi22.plan;

import com.example.pi22.partner.entities.Partner;
import com.example.pi22.plan.entite.Plan;
import com.example.pi22.plan.services.IPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlanRestController {
    @Autowired
    IPlanService planService;

    @PostMapping("/plan/add")
    @ResponseBody
    public void ajouterPlan(@RequestBody Plan p) {
        planService.addPlan(p);
    }
    @GetMapping("/plan/list")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public List<Plan> listePlans() {
        return planService.getAllPlans();
    }
    @DeleteMapping(value = "/plan/{id}")
    public void deletePlan(@PathVariable Long id) {
        planService.deletePlanById(id);
    }

    @PutMapping("/plan/update")
    @ResponseBody
    public void updatePlan(@RequestBody Plan p) {
        planService.updatePlan(p);
    }
}
