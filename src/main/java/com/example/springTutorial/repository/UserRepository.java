package com.example.springTutorial.repository;

import com.example.springTutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
