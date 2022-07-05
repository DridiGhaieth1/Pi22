package com.example.pi22.services;

import com.example.pi22.entities.User;
import com.example.pi22.requests.PasswordRequest;

import java.util.List;

public interface UserService {

    public User save(User user) throws Exception;
    public User update(User user) throws Exception;
    public List<User> findAll();
    public User findById(Long id) throws Exception;
    public User changePassword(PasswordRequest passwordRequest) throws Exception;


}
