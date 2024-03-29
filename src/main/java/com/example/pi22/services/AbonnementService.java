package com.example.pi22.services;

import com.example.pi22.entities.Abonnement;
import com.example.pi22.entities.AbonnementId;
import com.example.pi22.repositories.AbonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Service
public class AbonnementService implements IabonnementService {

    @Autowired
    private AbonnementRepository abonnementRepository;

    @Override
    public Abonnement AjouterAbn(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement ModifierAbn(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public String SuprimerAbn(Long idUser, Long idActivite) {
        AbonnementId id =new AbonnementId();
        id.setUserId(idUser);
        id.setActiviteId(idActivite);
        abonnementRepository.deleteById(id);

        return "Supression effectuée";
    }


    @Override
    public List<Abonnement> findAbnByActiv(Long idActivite) {
        return abonnementRepository.findByActivite_Id(idActivite);
    }


    @Override
    public List<Abonnement> findAbnByUser(Long idUser) {

        List<Abonnement> la=abonnementRepository.findByUserAbn_Id(idUser);
        la.forEach(x->{
            x.setDateFin(CalculerDtaeFin(x.getDateDebut(),x.getDureeParMois()));
        });
            return la ;
    }


public  Date CalculerDtaeFin(Date date, int nbrDeMois  ){

        Calendar fin = Calendar.getInstance();

          fin.setTime(date);

            fin.add(Calendar.MONTH,nbrDeMois);


return fin.getTime();




}



}
