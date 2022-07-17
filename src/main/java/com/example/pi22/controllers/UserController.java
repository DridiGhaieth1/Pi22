package com.example.pi22.controllers;

import com.example.pi22.entities.Role;
import com.example.pi22.entities.User;
import com.example.pi22.requests.PasswordRequest;
import com.example.pi22.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


@PreAuthorize("hasRole('admin')")
    @PostMapping("/register")
    public User register(@RequestBody User user) throws Exception {
        return  userService.save(user);
    }
    @PreAuthorize("hasRole('admin')")
    @PutMapping("/update")
    public User update(@RequestBody User user) throws Exception {
        return  userService.update(user);
    }
    @PreAuthorize("hasRole('admin')")
    @GetMapping
    public List<User> findAll() {
        return  userService.findAll();
    }
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) throws Exception {
        return  userService.findById(id);
    }

    @PatchMapping("/changePassword")
    public User changePassword(@RequestBody PasswordRequest passwordRequest) throws Exception {
        return  userService.changePassword(passwordRequest);
    }
    @PreAuthorize("hasRole('admin')")
    @PostMapping("/register/{user}/{role}")
    public String register(@PathVariable Long user ,  @PathVariable Long role) throws Exception {

        return  userService.addRoleToUser( user , role);

    }
    @PreAuthorize("hasRole('admin')")
    @PostMapping("/addRole")
    public Role register(@RequestBody Role role) throws Exception{
        return userService.addNewRole(role);
    }



}
