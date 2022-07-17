package com.example.pi22.partner.repo;

import com.example.pi22.partner.entities.Partner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends CrudRepository<Partner, Integer> {
}
