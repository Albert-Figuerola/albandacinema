package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getAllUsers();

    void deleteById(Long id);
}
