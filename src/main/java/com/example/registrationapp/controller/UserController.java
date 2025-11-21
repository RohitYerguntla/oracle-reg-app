/*
 * package com.example.registrationapp.controller;
 * 
 * 
 * import com.example.registrationapp.entity.User; import
 * com.example.registrationapp.repository.UserRepository; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.*;
 * 
 * @Controller public class UserController { private final UserRepository
 * userRepository;
 * 
 * public UserController(UserRepository userRepository) { this.userRepository =
 * userRepository; }
 * 
 * @GetMapping("/") public String showForm(Model model) {
 * model.addAttribute("user", new User()); return "register"; }
 * 
 * @PostMapping("/register") public String register(@ModelAttribute User user,
 * Model model) { if (userRepository.findByEmail(user.getEmail()).isPresent()) {
 * model.addAttribute("error", "Email already registered"); return "register"; }
 * userRepository.save(user); model.addAttribute("message",
 * "Registration successful!"); model.addAttribute("user", new User()); // clear
 * form return "register"; } }
 */