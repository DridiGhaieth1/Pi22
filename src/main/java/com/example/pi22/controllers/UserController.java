package com.example.pi22.controllers;

import com.example.pi22.entities.User;
import com.example.pi22.requests.PasswordRequest;
import com.example.pi22.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user) throws Exception {
        return  userService.save(user);
    }
    @PutMapping("/update")
    public User update(@RequestBody User user) throws Exception {
        return  userService.update(user);
    }
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
}
