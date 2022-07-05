package com.example.pi22.repositories;

import com.example.pi22.entities.Avis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvisRepository extends JpaRepository<Avis, Long> {
    List<Avis> findByUser_idUser(Long id);
}
