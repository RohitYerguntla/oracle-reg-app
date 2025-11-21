package com.example.registrationapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "enquiry")
public class EnquiryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fname;
    private String lname;
    private String email;
    private String contact;
    private String gender;

    @Column(name = "message")
    private String msg;

    // getters & setters
    
    
}
