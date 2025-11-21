package com.example.registrationapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.registrationapp.entity.RegistrationEntity;
import com.example.registrationapp.repository.RegistrationRepository;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationRepository repo;
    
    
    @GetMapping("/registrationform")
    public String showRegisterForm() {
        return "registrationform";   // must match file name EXACTLY
    }

    @PostMapping("/registration")
    public String registerUser(RegistrationEntity user) {
        repo.save(user);
        return "registrationform"; // return success.html page
    }
}
