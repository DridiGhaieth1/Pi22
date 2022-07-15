package com.example.pi22.services;

import com.example.pi22.entities.Role;
import com.example.pi22.entities.User;
import com.example.pi22.requests.PasswordRequest;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {

    public User save(User user) throws Exception;
    public User update(User user) throws Exception;
    public List<User> findAll();
    public User findById(Long id) throws Exception;
    public User changePassword(PasswordRequest passwordRequest) throws Exception;
    public Role addNewRole (Role role) throws Exception;
    public String addRoleToUser(String username, String roleName);

    public User loadUserByName (String userName);




}
