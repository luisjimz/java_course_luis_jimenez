package com.springhibernate.demo.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginControllerService {
    public boolean validateUser(String email, String password) {
        return email.contains("valid") && password.length()>3;
    }
}
