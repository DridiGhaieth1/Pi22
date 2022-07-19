package com.example.pi22.repositories;

import com.example.pi22.entities.CommentaireEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentaireEventtRepository extends JpaRepository<CommentaireEvent, Long> {

    public List<CommentaireEvent> findByEventCmnt_id(Long id);

}
