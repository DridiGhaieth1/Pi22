package com.example.pi22.partner.services;

import com.example.pi22.offer.entities.Offer;
import com.example.pi22.partner.entities.Partner;

import java.util.List;

public interface IPartnerService {
    void addPartner(Partner p);
    void updatePartner(Partner p);
    Partner getPartner(Long id);
    void deletePartner(Partner p);
    void deletePartnerById(Long id);
    List<Partner> getAllPartners();
}
