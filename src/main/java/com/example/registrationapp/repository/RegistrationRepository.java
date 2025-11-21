package com.example.registrationapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.registrationapp.entity.RegistrationEntity;

public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Long> {}

