package com.example.pi22.services;

import com.example.pi22.entities.Evenement;
import com.example.pi22.entities.Invitation;
import com.example.pi22.entities.InvitationId;
import com.example.pi22.repositories.EvenementRepository;
import com.example.pi22.repositories.InvitaionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvitationServiceImpl  implements IInvitationService{

    @Autowired
    private InvitaionRepository invitaionRepository;

    @Autowired
    private EvenementRepository evenementRepository;

    @Autowired
    private SendEmail sendEmail;
    @Override
    public Invitation ajouterInv(Invitation invitation) {

        return    invitaionRepository.save(invitation);
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

    @Override
    public void sendInvitation(Long idEvent) throws Exception {

        Evenement evenement = evenementRepository.findById(idEvent).orElseThrow(() -> new Exception("Evenement n'existe pas"));
        List<Invitation> invitations = invitaionRepository.findByEvenement_id(idEvent);

        String [] emailUsers = invitations.stream()
                .map(inv -> inv.getUserInv().getEmail()).toArray(String[]::new);

        String subject = "Invitation évenement";

        String text = "Bonjour, \n "+     evenement.getNomEvent() + " " + evenement.getDescription();



        if(emailUsers.length>0) {
            sendEmail.sendMail(subject, text, emailUsers);
        }


    }
}
