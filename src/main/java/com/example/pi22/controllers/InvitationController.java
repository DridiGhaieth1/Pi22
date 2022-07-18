package com.example.pi22.controllers;

import com.example.pi22.entities.Invitation;
import com.example.pi22.entities.InvitationId;
import com.example.pi22.services.IInvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invitation")
public class InvitationController {
    @Autowired
    private IInvitationService invitationService;


    @PostMapping
    public Invitation ajouterInvit(@RequestBody Invitation invitation) {
        return  invitationService.ajouterInv(invitation);
    }


    @PutMapping
    public Invitation modifierInvit(@RequestBody Invitation invitation) {
        return  invitationService.updateInv(invitation);
    }

    @DeleteMapping("/{idUser}/{idEvent}")
    public String delete(@PathVariable Long idUser, @PathVariable Long idEvent) {
     return     invitationService.delete(idUser, idEvent);
    }



    @GetMapping("/event/{id}")
    public List<Invitation> findByEvent(@PathVariable Long id) {

        return invitationService.findByEvent(id);
    }


    @GetMapping("/user/{id}")
    public List<Invitation> findByUser(@PathVariable Long id) {

        return invitationService.findByUser(id);
    }
}
