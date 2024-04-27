package com.example.freelancer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.freelancer.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
