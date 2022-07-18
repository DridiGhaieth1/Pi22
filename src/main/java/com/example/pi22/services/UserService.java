package com.example.pi22.services;
import com.example.pi22.entities.Role;
import com.example.pi22.requests.PasswordRequest;
import com.example.pi22.user.User;


import java.util.List;
import java.util.Optional;

public interface UserService {

    public User save(User user) throws Exception;
    public User update(User user) throws Exception;
    public List<User> findAll();
    public User findById(Long id) throws Exception;
    public User changePassword(PasswordRequest passwordRequest) throws Exception;
    public Role addNewRole (Role role) throws Exception;
    public String addRoleToUser(Long idUser, Long idRole) throws Exception;

    public User loadUserByName (String userName);



    User findByEmail(String email);

    Optional<User> findUserById(Long id);
}
