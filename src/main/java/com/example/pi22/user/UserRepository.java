package com.example.pi22.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    boolean existsByEmailAndId(String email, Long idUser);
    User findByName(String name);

   User findByEmail(String userName);
}
