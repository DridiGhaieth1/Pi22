package com.example.pi22.repositories;

import com.example.pi22.entities.Abonnement;
import com.example.pi22.entities.AbonnementId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement, AbonnementId>  {

    public List<Abonnement> findByActivite_Id(Long id);
    public List<Abonnement> findByUserAbn_Id(Long id);



}
