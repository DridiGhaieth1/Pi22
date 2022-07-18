package com.example.pi22.controllers;

import com.example.pi22.entities.Abonnement;
import com.example.pi22.entities.AbonnementId;
import com.example.pi22.repositories.AbonnementRepository;
import com.example.pi22.services.AbonnementService;
import com.example.pi22.services.IabonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Active")
public class AbonnementController {
    @Autowired
    private IabonnementService iabonnementService;
    private AbonnementService abonnementService;

    @PostMapping("/AjtAbn")
    public Abonnement ajouterAbn(@RequestBody Abonnement abonnement){

        return  iabonnementService.AjouterAbn(abonnement);

    }

    @PutMapping("/MdfAbn")
    public Abonnement modifierAbn(@RequestBody Abonnement abonnement){

        return iabonnementService.ModifierAbn(abonnement);

    }

    @DeleteMapping("/supAbn/{idUser}/{idActivite}")
    public String supprimerAbn(@PathVariable  Long idUser , @PathVariable  Long idActivite){

      return iabonnementService.SuprimerAbn(idUser,idActivite);

    }


    @GetMapping("/GetAbnByUser/{idUser}")

    public List<Abonnement> getAbnByUser(@PathVariable Long idUser){

        return iabonnementService.findAbnByUser(idUser);
    }



    @GetMapping("/GetabnByActiv/{idActv}")

    public List<Abonnement> getAbnByActv(@PathVariable Long idActv){

        return iabonnementService.findAbnByActiv(idActv);
    }

    /*@GetMapping("/GetDate/{date}/{x}")
        public Date getDate(@PathVariable Date date , @PathVariable int x){

        return  abonnementService.CalculerDtaeFin(date,x);
        }*/



}
