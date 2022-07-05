package com.example.pi22.services.impl;

import com.example.pi22.entities.User;
import com.example.pi22.repositories.UserRepository;
import com.example.pi22.requests.PasswordRequest;
import com.example.pi22.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User save(User user) throws Exception {

        boolean exist = userRepository.existsByEmail(user.getEmail());
        if(exist){
            throw  new Exception("Email existe déjà");
        }

        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
       user = userRepository.save(user);
        return user;
    }

    @Override
    public User update(User user) throws Exception {
        boolean exist = userRepository.existsByEmailAndId(user.getEmail(), user.getId());
        if(!exist){
            exist = userRepository.existsByEmail(user.getEmail());
            if(exist){
                throw  new Exception("Email existe déjà");
            }
        }
        userRepository.save(user);
        return user;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) throws Exception {
        return userRepository.findById(id).orElseThrow(() -> new Exception("Utilisateur n'existe pas"));
    }

    @Override
    public User changePassword(PasswordRequest passwordRequest) throws Exception {

        User user = findById(passwordRequest.getId());

        boolean matched = passwordEncoder.matches(passwordRequest.getOldPassword(), user.getPassword());

        if(!matched) {
            throw new Exception("Ancien mot de passe incorrect");
        }


        String encodedPassword = passwordEncoder.encode(passwordRequest.getNewPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);

        return user;
    }
}
