package com.example.pi22.repositories;

import com.example.pi22.entities.Invitation;
import com.example.pi22.entities.InvitationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvitaionRepository extends JpaRepository<Invitation, InvitationId>  {

    public List<Invitation> findByEvenement_id(Long id);
   public List<Invitation> findByUserInv_id(Long id);


}
