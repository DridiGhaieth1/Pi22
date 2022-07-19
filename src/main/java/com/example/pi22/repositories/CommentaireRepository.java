package com.example.pi22.repositories;

import com.example.pi22.entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire , Long> {

    public List<Commentaire> findByEventCmnt_id(Long id);

}
