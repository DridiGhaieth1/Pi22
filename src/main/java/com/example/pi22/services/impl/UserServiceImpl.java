package com.example.pi22.services.impl;

import com.example.pi22.entities.Role;

import com.example.pi22.repositories.RoleRepository;

import com.example.pi22.requests.PasswordRequest;
import com.example.pi22.services.UserService;
import com.example.pi22.user.User;
import com.example.pi22.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User save(User user) throws Exception {

        boolean exist = userRepository.existsByEmail(user.getEmail());
        if (exist) {
            throw new Exception("Email existe déjà");
        }
        user.setEnabled(true);
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        user = userRepository.save(user);
        return user;
    }

    @Override
    public User update(User user) throws Exception {
        boolean exist = userRepository.existsByEmailAndId(user.getEmail(), user.getId());
        if (!exist) {
            exist = userRepository.existsByEmail(user.getEmail());
            if (exist) {
                throw new Exception("Email existe déjà");
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

        if (!matched) {
            throw new Exception("Ancien mot de passe incorrect");
        }


        String encodedPassword = passwordEncoder.encode(passwordRequest.getNewPassword());
        user.setPassword(encodedPassword);


        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) throws Exception {
        return roleRepository.save(role);
    }

    @Override
    public String addRoleToUser(Long idUser, Long idRole) throws Exception {

        User user = userRepository.findById(idUser).orElseThrow(() -> new Exception("Utilisateur n'existe pas"));
        Role role = roleRepository.findById(idRole).orElseThrow(() -> new Exception("Role  n'existe pas"));


        user.getRoles().add(role);
        userRepository.save(user);
        return "Affectation effectuée";
    }


    @Override
    public User loadUserByName(String userName) {
        return userRepository.findByEmail(userName);
    }


    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }


}