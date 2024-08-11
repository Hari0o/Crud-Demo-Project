package com.example.crudDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudDemo.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}