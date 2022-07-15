package com.example.pi22.repositories;

import com.example.pi22.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByEmail(String email);

    boolean existsByEmailAndId(String email, Long id);
    User findByName(String name);
}
