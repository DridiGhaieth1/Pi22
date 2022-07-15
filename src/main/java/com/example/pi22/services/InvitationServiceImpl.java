package com.example.pi22.services;

import com.example.pi22.entities.Invitation;
import com.example.pi22.entities.InvitationId;
import com.example.pi22.repositories.InvitaionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvitationServiceImpl  implements IInvitationService{

    @Autowired
    private InvitaionRepository invitaionRepository;
    @Override
    public Invitation ajouterInv(Invitation invitation) {

        return invitaionRepository.save(invitation);
    }


    @Override
    public Invitation updateInv(Invitation invitation) {
        return invitaionRepository.save(invitation);
    }


    @Override
    public String delete(Long idUser, Long idEvent) {

        InvitationId id = new InvitationId();
        id.setUserId(idUser);
        id.setEventId(idEvent);

        invitaionRepository.deleteById(id);
        return  "Suppression effectuée";


    }

    @Override
    public List<Invitation> findByEvent(Long idEvent) {

        return invitaionRepository.findByEvenement_id(idEvent);
    }

    @Override
    public List<Invitation> findByUser(Long idUser) {
return invitaionRepository.findByUserInv_id(idUser);
       // return invitaionRepository.findByUserInv_id(idUser);
    }
}
