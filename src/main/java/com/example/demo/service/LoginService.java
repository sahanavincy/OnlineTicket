package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String username, String password) {
        // Dummy validation (replace with DB later)
        return "admin".equals(username) && "password".equals(password);
    }
}