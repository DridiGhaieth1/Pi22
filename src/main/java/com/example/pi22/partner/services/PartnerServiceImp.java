package com.example.pi22.partner.services;

import com.example.pi22.offer.entities.Offer;
import com.example.pi22.partner.entities.Partner;
import com.example.pi22.partner.repo.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerServiceImp implements IPartnerService{
    @Autowired
    PartnerRepository partnerRepository;

    @Override
    public void addPartner(Partner p) {
        partnerRepository.save(p);
    }

    @Override
    public void updatePartner(Partner p) {
        partnerRepository.save(p);
    }

    @Override
    public Partner getPartner(Integer id) {
        return         partnerRepository.findById(id).get();
    }

    @Override
    public void deletePartner(Partner p) {
        partnerRepository.delete(p);
    }

    @Override
    public void deletePartnerById(Long id) {
        partnerRepository.deleteById(Math.toIntExact(id));

    }

    @Override
    public List<Partner> getAllPartners() {
        return (List<Partner>) partnerRepository.findAll();
    }
}
