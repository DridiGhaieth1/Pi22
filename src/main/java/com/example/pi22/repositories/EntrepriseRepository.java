package com.example.pi22.repositories;

import com.example.pi22.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EntrepriseRepository extends JpaRepository <Entreprise, Long> {
    boolean existsById (Long id);
}
