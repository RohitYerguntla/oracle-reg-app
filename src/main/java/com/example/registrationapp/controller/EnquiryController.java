package com.example.registrationapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.registrationapp.entity.EnquiryEntity;
import com.example.registrationapp.repository.EnquiryRepository;

@Controller
public class EnquiryController {

    @Autowired
    private EnquiryRepository repo;

    @GetMapping("/enquiryform")
    public String showEnquiryForm() {
        return "enquiryform";   // must match file name EXACTLY
    }
    
    @PostMapping("/enquiryform")
    public String saveEnquiry(EnquiryEntity e) {
        repo.save(e);
        return "success"; // return success.html page
    }
}
