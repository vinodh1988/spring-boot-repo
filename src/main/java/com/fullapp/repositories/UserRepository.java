package com.fullapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullapp.entities.User;



public interface UserRepository extends JpaRepository<User, String> {
  public User findUserByUsername(String username);
}