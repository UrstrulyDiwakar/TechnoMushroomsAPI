package com.technomushrooms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.technomushrooms.model.User;
import com.technomushrooms.service.UserDetailsServiceImpl;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @PostMapping("/users")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        try {
            User savedUser = userDetailsService.saveUser(user);
            return ResponseEntity.ok(savedUser);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error saving user: " + e.getMessage());
        }
    }
}
