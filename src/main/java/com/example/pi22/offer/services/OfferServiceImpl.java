package com.example.pi22.offer.services;

import com.example.pi22.offer.entities.Offer;
import com.example.pi22.offer.repo.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class OfferServiceImpl implements IOfferService {
    @Autowired
    OfferRepository offerRepository;
    @Override
    public void addOffer(Offer offer) {
        offerRepository.save(offer);
    }

    @Override
    public void updateOffer(Offer offer) {
        offerRepository.save(offer);
    }

    @Override
    public Offer getOffer(Integer id) {
        return offerRepository.findById(id).get();
    }

    @Override
    public void deleteOffer(Offer f) {
        offerRepository.delete(f);
    }

    @Override
    public void deleteOfferById(Long id) {
        offerRepository.deleteById(Math.toIntExact(id));
    }

    @Override
    public List<Offer> getAllOffers() {
        return (List<Offer>) offerRepository.findAll();
    }

    @Override
    public ArrayList<Offer> getAllOffersPartner(Integer idPartner) {
        ArrayList<Offer> Mylist2=new ArrayList<>();
        ArrayList<Offer> Mylist = (ArrayList<Offer>) offerRepository.findAll();
        for(Offer o : Mylist){
            if (o.getPartner().getId() == idPartner){
                Mylist2.add(o);
            }

        }
        return Mylist2;
    }
}
