package com.example.pi22.services;
import com.example.pi22.entities.Role;
import com.example.pi22.requests.PasswordRequest;
import com.example.pi22.user.User;


import java.util.List;
import java.util.Optional;

public interface UserService {

     User save(User user) throws Exception;
     User update(User user) throws Exception;
     List<User> findAll();
     User findById(Long id) throws Exception;
     User changePassword(PasswordRequest passwordRequest) throws Exception;
     Role addNewRole (Role role) throws Exception;
     String addRoleToUser(Long idUser, Long idRole) throws Exception;

     User loadUserByName (String userName);



    User findByEmail(String email);

    Optional<User> findUserById(Long id);
}
