package com.example.pi22.repositories;

import com.example.pi22.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DepartementRepository extends JpaRepository<Departement, Long> {
    boolean existsById(Long id);
}
