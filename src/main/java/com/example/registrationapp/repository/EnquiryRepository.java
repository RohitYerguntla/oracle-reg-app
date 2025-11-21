package com.example.registrationapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.registrationapp.entity.EnquiryEntity;

public interface EnquiryRepository extends JpaRepository<EnquiryEntity, Long> {}
