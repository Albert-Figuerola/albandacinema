package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("user")
    public ResponseEntity  createUser(
            @RequestBody User user
    ) {
        userService.addUser(user);
        return new ResponseEntity<>("User created.", HttpStatus.CREATED);
    }

    @GetMapping("user")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
