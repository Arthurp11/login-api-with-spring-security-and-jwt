package com.example.login_api_with_spring_security_and_jwt.repository;

import com.example.login_api_with_spring_security_and_jwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}